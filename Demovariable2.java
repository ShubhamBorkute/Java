class Demovariable2
{
static int a=12,b=13,c=a+b;   // static variables/class variables
int x=10,y=20,z=x*y;         //  instance variables/object variables        
public static void main(String[] args)
{
int sum=c;                     // local variable/method variable
System.out.println("The value of a="+Demovariable2.a);
System.out.println("The value of b="+Demovariable2.b);
System.out.println("The Sum is ="+sum);
Demovariable2 ob1= new Demovariable2();
Demovariable2 ob2= new Demovariable2();
Demovariable2 ob3= new Demovariable2();
int mul=ob3.z;                 // local variable/method variable
System.out.println("The value of x="+ob1.x);
System.out.println("The value of y="+ob2.y);
System.out.println("The mul is ="+mul);

}
}
