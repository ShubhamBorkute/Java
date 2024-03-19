public class Student{



public float per;


public void Calculate(int total)
{
per=total/6;
System.out.println("the total mark "+total);
}

public  float Getpercentage()
{
return per;
}


public static void main(String[] args)
{

int m1=68;
int m2=58;
int m3=77;
int m4=98;
int m5=48;
int m6=68;


int total=m1+m2+m3+m4+m5+m6;

Student ob= new Student();

ob.Calculate(total);

float per=ob.Getpercentage();

System.out.println("the percentage "+per);
}

}
