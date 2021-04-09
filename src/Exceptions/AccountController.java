package Exceptions;

public class AccountController {
    private static final double MAX_MONEY = 110;

    public AccountController() {
    }

    public void withdraw(double amount)  {
        if(amount > MAX_MONEY){
            throw new muchMoneyException();
        }
    }

    public static void main(String[] args)throws muchMoneyException{
        AccountController acc = new AccountController();
        acc.withdraw(211);
    }
}
