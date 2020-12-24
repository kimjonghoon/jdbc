package net.java_school.bank;

public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private double amount;
	private double balance;

	public Transaction() {}

	public Transaction(String transactionDate,
			String transactionTime,
			String kind,
			double amount,
			double balance) {
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;        
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}

	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.transactionDate);
		sb.append("|");
		sb.append(this.transactionTime);
		sb.append("|");
		sb.append(this.kind);
		sb.append("|");
		sb.append(this.amount);
		sb.append("|");
		sb.append(this.balance);

		return sb.toString();
	}

}
