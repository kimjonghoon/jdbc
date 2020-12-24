package net.java_school.bank;

import javax.sql.DataSource;

import net.java_school.commons.TestLogger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@EnableAspectJAutoProxy
public class BankConfig {

	@Bean
	public TestLogger testLogger() {
		return new TestLogger();
	}

	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:XE");
        dataSource.setUsername("scott");
        dataSource.setPassword("tiger");
        return dataSource;
    }
	
    @Bean
    public BankDao myBankDao() {
        MyBankDao bankDao = new MyBankDao();
        bankDao.setDataSource(dataSource());
        return bankDao;
    }

	@Bean
	public Bank myBank() {
		Bank bank = new MyBank();
		bank.setDao(myBankDao());
		return bank;
	}

	@Bean
	public BankUi bankUi() {
		BankUi ui = new BankUi();
		ui.setBank(myBank());
		ui.setStream(System.out);
		return ui;
	}
	
}
