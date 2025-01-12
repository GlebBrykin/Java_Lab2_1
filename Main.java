import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        Student stud = new Student("Иван", 20, 4.6f);
        System.out.println(stud);

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        BankAccount acc = new BankAccount(123456, new BigDecimal(0));
        acc.addTransaction(acc.new Transaction(new BigDecimal(1000), "Депозит"));
        acc.addTransaction(acc.new Transaction(new BigDecimal(-500), "Снятие"));
        acc.addTransaction(acc.new Transaction(new BigDecimal(200), "Депозит"));
        acc.printStatement();
    }
}