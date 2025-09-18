package day8;

public class Account {
    String accountNumber;
    Customer customer;
    long balance;

    Account() {
    }

    Account(String accountNumber, Customer customer, long balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;

        System.out.println("Account is generated \nOwner : " + customer.name + "\nAccount Number : " + accountNumber + "\nBalance : " + balance + "\n");
    }

    public void printAccountInfo() {
        System.out.println();
        System.out.printf("==== Account : %s ==== \n", this.accountNumber);
        System.out.printf("Owner : %s\n", this.customer.name);
        System.out.printf("balance : %s \n", this.balance);
        System.out.println("=".repeat(50));
        System.out.println();
    }

    public static void printAccountInfo(Account account) {
        System.out.println();
        System.out.printf("==== Account : %s ==== \n", account.accountNumber);
        System.out.printf("Owner : %s\n", account.customer.name);
        System.out.printf("balance : %s \n", account.balance);
        System.out.println("=".repeat(50));
        System.out.println();
    }

    public void deposit(long depositAmount) {
        this.balance += depositAmount;
        System.out.println(depositAmount + "를 입금 하셨습니다.");
        System.out.println("Total Balance : " + balance);
    }

    public void withdraw(long amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println(amount + "를 출금 하셨습니다.");
            System.out.println("Total Balance : " + balance);
        } else {
            System.out.println(amount+"원을 출금할 수 없어요. 전체 밸런스가 "+balance+"원 입니다. 돈이 부족해요.");
        }
    }

    public void transfer(Account from, Account to, long transferAmount) {
        if (transferAmount < from.balance) {
            from.balance -= transferAmount;
            to.balance += transferAmount;
            System.out.println("송금 성공!");
        } else {
            System.out.println("잔액이 부족하여 송금 실패");
        }
    }
}
