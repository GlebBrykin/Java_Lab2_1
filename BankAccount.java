import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankAccount
{
    public class Transaction
    {
        private static long id;
        public long transactionId;
        public BigDecimal amount;
        public String description;

        public Transaction(BigDecimal amount, String description)
        {
            this.transactionId = ++id;
            this.amount = amount;
            this.description = description;
        }
    }

    public long accountNumber;
    public BigDecimal balance;
    public ArrayList<Transaction> transactions;

    public BankAccount(long number, BigDecimal balance)
    {
        this.accountNumber = number;
        this.balance = balance;
        this.transactions = new ArrayList<Transaction>();
    }

    public boolean addTransaction(Transaction transaction)
    {
        if(balance.compareTo(transaction.amount) < 0)
        {
            this.transactions.add(transaction);
            return false;
        }
        this.transactions.add(transaction);
        this.balance = this.balance.add(transaction.amount);
        return true;
    }
    public void printStatement()
    {
        System.out.println("История транзакций для счёта " + this.accountNumber + ":");
        for(Transaction transaction : this.transactions)
        {
            System.out.println("ID транзакции: " + transaction.transactionId);
            System.out.println("Сумма: " + transaction.amount);
            System.out.println("Описание: " + transaction.description);
            System.out.println("-------------------------------------");
        }
    }
}
