package oop.example;
import java.util.Scanner;

public class AccountTester{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();
        System.out.println("Enter name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.printf("Name in object myAccount: %s%n",myAccount.getName());
        int x = 4;
        System.out.println(x);
    }
}
