import java.util.*;

class restaurant{
public static void main(String[]arg){
int choice;
String order;
System.out.println("1. Chicken Biryani ");
System.out.println("2. Mutton Biryani ");
System.out.println("3. Chicken Family Pack ");
System.out.println("4. Special Chicken Biryani ");
System.out.println("5. Supreme Chicken Biryani ");
System.out.println("6. Egg Biryani ");
System.out.println("7. Veg. Biryani");
System.out.println("8. Veg Biryani Family pack");
Scanner obj=new Scanner(System.in);
System.out.println("\n\tPlease Enter Dish Number for price 1 to 8:");
choice=obj.nextInt();
switch(choice)
{case 1:
	System.out.print("price of Chicken Biryani 150");
	break;case 2:
	System.out.println("price of Mutton Biryani: 100");
	break;case 3:
	System.out.println("price of Chicken family pack is: 400");
	break;case 4:
        System.out.println("price of Special Chicken Biryani 300");
        break;case 5:
	System.out.println("Price of Supreme Chicken Biryani: 250");
	break;case 6:
	System.out.println("Price of Egg Biryani: 300");
	break;case 7:
	System.out.println("Veg. Biryani: 500");
	break;case 8:
	System.out.println("Price of Veg Biryani Family pack 1000");
	break;
default:

	System.out.println("Invalid choice try again");
}}}
