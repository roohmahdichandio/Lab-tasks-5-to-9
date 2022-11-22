
//1 none@gmail.com  	password = 1234
//2 java@gmail.com	password = 1234
//3 chandio@gmail.com   password = 1234
//4 mehdi@gmail.com     pas =      1234
//5 hello@gmail.com     password = 1234

import java.util.*;
class id{
public static void main(String[]arg){
String email, pwd;
System.out.print("\nEnter your email:");
Scanner obj=new Scanner(System.in);
email=obj.nextLine();
System.out.print("Enter your password:");
pwd=obj.nextLine();
if (email.equals("none@gmail.com")&&(pwd.equals("1234")))
{
System.out.println("welcome");
System.out.println("Hellow world");
System.out.println("My email address is none@gmail.com");
}

else if (email.equals("java@gmail.com")&&(pwd.equals("1234"))){
System.out.println("welcome to desktop");
System.out.println("my name is Muhammad");
}
else if (email.equals("chandio@gmail.com")&&(pwd.equals("1234")))
{
System.out.println("My name is rooh e mehdi");
System.out.println("My e-mail address is farmanali@gmail.com");
}
else if (email.equals("mehdi@gmail.com")&&(pwd.equals("1234")))
{
System.out.println("Welcome to screen");
System.out.println("My name is Rameez");
}
else if (email.equals("hello@gmail.com")&&(pwd.equals("1234")))
{
System.out.println("Welcome to screen");
System.out.println("My name is mehdi");
}
else
{
System.out.print("wrong email or password");}
}}




