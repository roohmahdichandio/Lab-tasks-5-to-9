/* print fabancci series*/

import java.util.*;
class fibancci{
public static void main(String[]arg){
int term, x=0,y=1, z;
System.out.println("Enter any term:");
Scanner obj=new Scanner(System.in);
term=obj.nextInt();
for(int i=1;i<=term;i++)
{
System.out.print(x+" ");
z=x+y;
x=y;
y=z;
}}}