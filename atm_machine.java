import java.util.Scanner;
public class atm_machine {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int fixed_pin=2580;
        int bal=100000;
        System.out.println("enter the balance: ");
        int balance=sc.nextInt();
        System.out.println("enter ATM pin: ");
        int pin=sc.nextInt();
        boolean has_pin=true;
        if(balance<=20000){
            if(has_pin){
                System.out.println("withdraw");
            }
        }
        else {
            System.out.println("not withdraw");
        }
        }
    


