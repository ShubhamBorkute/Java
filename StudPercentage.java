class StudPercentage
{
float per;
void calculate(int total)     // get parameter
{
per=(float)total/6;          // typecasting
}
float getPer()
{
return per;                  // return value
}
public static void main(String[] args)
{
int s1=77,s2=76,s3=85,s4=59,s5=69,s6=60;
int total=s1+s2+s3+s4+s5+s6;
StudPercentage pr = new StudPercentage();
pr.calculate(total);
float P = pr.getPer();
System.out.println("The Percentage of student ="+P);
}
}