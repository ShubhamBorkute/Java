class EmployeeSalary
{
public static void main(String[] args)
{
double bsal=12000,HRA,DA,Totalsal;
//HRA =93% of bsal
//DA=63% of bsal
HRA=bsal*0.93;
DA=bsal*0.63;
System.out.println("HRA is ="+HRA);
System.out.println("DA is ="+DA);
Totalsal=bsal+HRA+DA;
System.out.println("Total salary is ="+Totalsal);
}
}