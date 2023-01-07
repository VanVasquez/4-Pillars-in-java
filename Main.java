import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        /*
        * First Pillar: Encapsulation, class encapsulates data
        * */
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(12000.00);
        myAccount.withdraw(4999.99);
        System.out.println("Your current Balance is Php: " + myAccount.getBalance());

        /*
        * Second Pillar: Abstraction, keeping essential information of sub classes
        * */
        Player p1 = new Human("Alfred");
        p1.Info();
        p1.skills();

        Player p2 = new Elf("Floryn");
        p1.Info();
        p2.skills();

        /*
         * Third Pillar: Inheritance, inherits function from parent class
         */

        Pig pig= new Pig();
        pig.oink();
        pig.Sleep();
        Cow cow = new Cow();
        cow.moo();
        cow.Sleep();

        /*
         *Fourth Pillar: Polymorphism, overloaded functions 
         */
        Addition calc = new Addition();
        System.out.println(calc.add(6, 9));
        System.out.println(calc.add(6.7, 4.2));

    }
}