import java.util.Scanner;
public class demoArmstrongMRange{
void armstrong_no_finder(int minimum,int maximum)
{
for(int k=minimum;k<=maximum;k++)
{
int sum=0;
int temp=k;

while(temp>0)
{
int rem=temp%10;
sum=sum+(rem*rem*rem);
temp=temp/10;
}
if(sum==k)
{
System.out.println(k+" ");
}
}
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("minimum");
int min=sc.nextInt();
System.out.println("maximum");
int max=sc.nextInt();

demoArmstrongMRange ob = new demoArmstrongMRange();
ob.armstrong_no_finder(min,max);
}
}