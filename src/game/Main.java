package game;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner user_input = new Scanner(System.in);
        System.out.printf("Welcome to the game!%nIf you are a returning user, type yes, if you are a new user press no");
        int func_input = welcome(user_input);
        loginpage(func_input, user_input);

    }
    public static void loginpage(int input, Scanner scan){
        if(input == 1){
            return_login(scan);
        }else if(input == 0){
            System.out.printf("A new user! Great!%nLet's get you started!");
        }else{
            System.out.println("You did not input an applicable answer. Try again");
            input = welcome(scan);
            loginpage(input, scan);
        }
    }
    public static int welcome(Scanner scan){
        String u_input;
        int func_input = -1;
        u_input = scan.next();
        System.out.println(u_input);
        if(u_input.equals("yes")){
            func_input = 1;
        }else if(u_input.equals("no")){
            func_input = 0;
        }
        return func_input;
    }
    public static void return_login(Scanner scan){
        System.out.printf("Welcome back!%nPlease enter your username:");
        String u_input = scan.next();
        String username = u_input;
        System.out.printf("Please enter your password:");
        u_input = scan.next();
        String password = u_input;
    }
}
