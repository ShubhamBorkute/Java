class Demovariable2
{
static int a=12,b=13,c=a+b;
int x=10,y=20,z=x*y;
public static void main(String[] args)
{
int sum=c;
int mul=z;
System.out.println("The value of a="+Demovariable2.a);
System.out.println("The value of b="+Demovariable2.b);
System.out.println("The Sum is ="+sum);
Demovariable2 ob1= new Demovariable2();
Demovariable2 ob2= new Demovariable2();
System.out.println("The value of x="+ob1.x);
System.out.println("The value of y="+ob2.y);
System.out.println("The mul is ="+mul);

}
}
