
class Account {
    private int balance;

    public Account(int initialBalance) 
    {
        if (initialBalance < 1000) {
            System.out.println("Initial balance must be at least 1000");
        }
        this.balance = initialBalance;
        System.out.println("Current balance in your Account :- "+balance);
    }

    public int getBalance() 
    {
        return balance;
    }

    public void withdraw(int amount)
    {
        if (balance - amount < 1000) {
            System.out.println("Insufficient funds. Minimum balance of 1000 required.");
        }
        balance =balance- amount;
        System.out.println(amount+" Rs. debit in your Account");
        System.out.println("balance in your Account is "+balance);
    }
    public void deposite(int amount)
    {
      
        balance =balance + amount;
        System.out.println(amount+" Rs. Credit in your Account");
        System.out.println("balance in your Account is "+balance);
    }
    public void display(int amount)
    {
    	System.out.println(amount);
    }
}

