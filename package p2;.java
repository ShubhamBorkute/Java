package p2;

public class WithdrowOperation
 {
public void withdrow(int amt1)
{
	int bal=2000;
	if(amt1<=bal)
	{
		    if(amt1%200==0||amt1%500==0||amt1%2000==0) 
		    {
		   int totalbal=bal-amt1;
		System.out.println("====Transaction successful====");
		    }
		if(amt1==2000)
		{
			int note2000=amt1/2000;
			amt1=note2000*2000;
		}//end 2000
		if(amt1>=500 && amt1<2000)
		{
		int note500=(amt1/500);
		amt1=note500*500;
		
		}//end 500
		if(amt1<500)
		{
		int note200=(amt1/200);
		amt1-=note200*200;
		
		}//end 500
		if(amt1==200)
		{
		
		}//end 200
		System.out.println("You get RS 2000 notes "+note2000);
		System.out.println("You get RS 500 notes "+note500);
		System.out.println("You get Rs  200 notes "+note200);
		System.out.println("You get Rs"+amt1);
		System.out.println("The balence in your account is "+totalbal)
		else
		{
		System.out.println("Amount Must be 200 500 2000");
		}
	//end of i
	else
		{
		System.out.println("====Insufficient Balence====");
        }
}//end else
}
}//end fun
