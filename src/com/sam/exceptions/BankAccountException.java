package com.sam.exceptions;

import javax.security.auth.login.AccountException;

class NullNameException extends Exception {

    NullNameException()
    {
        super("The name can not be null");
    }

}
class InvalidAccountNumberException extends Exception {

    InvalidAccountNumberException()
    {
        super("The account number must have 7 digits");
    }

}
class InvalidBalanceException extends Exception {

    InvalidBalanceException()
    {
        super("The Balance must be positive");
    }

}

class NegativeDepositException extends Exception {

    NegativeDepositException()
    {
        super("The Account user can not deposit negative value");
    }
}

class CanNotWithdrawException extends Exception {

    CanNotWithdrawException()
    {
        super("One can not withdraw 0 taka or money more than balance");
    }

}

class CanNotLoanException extends Exception {

    CanNotLoanException()
    {
        super("The User is not eligible for loan");
    }

}





public class BankAccountException {
    String name;
    long account_number;
    double balance;
    BankAccountException(String name, long account_number, double balance)
    {
      this.name= name;
      this.account_number=account_number;
      this.balance = balance;
    }
    public void checkName() throws NullNameException
    {
        if(name=="null")
        {
            throw new NullNameException();
        }
        else
        {
            System.out.println("The Name is Valid");
        }
    }
    public void checkAccountNumber() throws InvalidAccountNumberException
    {
        //Account Number should have 7 digits
        if( account_number<1000000 || account_number>=10000000 )
        {
            throw new InvalidAccountNumberException();
        }
        else
        {
            System.out.println("The Account Number is Valid");
        }
    }
    public void checkBalance() throws InvalidBalanceException
    {
        if(balance<0.0)
        {
            throw new InvalidBalanceException();
        }
        else
        {
            System.out.println("The Account Balance is Positive");
        }
    }
    public void deposit(double d) throws NegativeDepositException
    {
        if(d<0)
        {
            throw new NegativeDepositException();
        }
        else
        {
            balance=balance+d;
            System.out.println("The Bank deposit is completed");
        }
    }
    public void withDraw(double w) throws CanNotWithdrawException
    {
        if(w<=0 || w>balance )
        {
            throw new CanNotWithdrawException();
        }
        else
        {
            balance = balance-w;
            System.out.println("Withdraw is completed");
        }
    }
    public void checkLoan() throws CanNotLoanException
    {
        //Can not take loan if the balance is less than 10000.0
        if(balance<10000)
        {
            throw new CanNotLoanException();
        }
        else
        {
            System.out.println("The Bank Customer can take loans ");
        }
    }

    public static void main(String[] args) {
        BankAccountException account = new BankAccountException("null",123456,8000.0);
        try{
            account.checkName();
        } catch(NullNameException e)
        {
            System.out.println("Exception Occured :-"+e.getMessage());
        }
        try{
            account.checkAccountNumber();
        } catch(InvalidAccountNumberException e)
        {
            System.out.println("Exception Occured :-"+e.getMessage());
        }
        try{
            account.checkBalance();
        } catch(InvalidBalanceException e)
        {
            System.out.println("Exception Occured :-"+e.getMessage());
        }
        try{
            account.deposit(-10.9);
        } catch(NegativeDepositException e)
        {
            System.out.println("Exception Occured :-"+e.getMessage());
        }
        try{
            account.withDraw(12000);
        } catch(CanNotWithdrawException e)
        {
            System.out.println("Exception Occured :-"+e.getMessage());
        }
        try{
            account.checkLoan();
        } catch(CanNotLoanException e)
        {
            System.out.println("Exception Occured :-"+e.getMessage());
        }
        finally{
            System.out.println("Sesh!!!!");
        }
    }
}
