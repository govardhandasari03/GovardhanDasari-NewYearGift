package dasari_govardhan.maven_project;
import java.util.*;
class Sweets
{
	static int no_of_chocos;
	static int no_of_candies;
	public Sweets() {}
	public Sweets(int chacos,int candies )
	{
		no_of_chocos=chacos;
		no_of_candies=candies;		
	}
}
class Chocalates extends Sweets
{
	String temp;
	Scanner sc=new Scanner(System.in);
	String name[]=new String[no_of_chocos];
	public void user()
	{
	 for (int i=0;i<no_of_chocos;i++)
	 {
		 System.out.println("enter names of chocos");
		 name[i]=sc.nextLine();
	 }
	 for (int i=0;i<no_of_chocos;i++)
	 {
		 System.out.println(name[i]);
	 } 
	}
	public void sort(String ch)
	{
		for(int i=0; i<no_of_chocos; i++)
        {
            for(int j=1; j<no_of_chocos; j++)
            {
                if(name[j-1].compareTo(name[j])>0)
                {
                    temp=name[j-1];
                    name[j-1]=name[j];
                    name[j]=temp;
                }
            }
       }
		if(ch.compareTo("a")<0)
			   for(int i=0;i<no_of_chocos;i++)
			    System.out.println(name[i]);
			  else
			   for(int i=(no_of_chocos-1);i>=0;i--)
			    System.out.println(name[i]);
     }
}
class Candies extends Sweets
{
 public void count()
 {
  if(no_of_candies<=10 && no_of_candies>0)
   System.out.println("no. of candies lies in between 1 and 10 "+no_of_candies);
  else if(no_of_candies<=50 && no_of_candies>10)
   System.out.println("no. of candies lies in between 50 and 10 "+no_of_candies);
  else
   System.out.println("no. of candies"+no_of_candies);
   
 }
}
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	  int nofchoc,nofcand,ch;
    	  System.out.println("enter no. of gifts");
    	  int n=sc.nextInt();
    	  System.out.println(n);
    	  for(int i=0;i<n;i++)
    	  {
    	   System.out.println("Keep choclates and candies into gift box");
    	   System.out.println("enter no. of choclates");
    	   nofchoc=sc.nextInt();
    	   System.out.println("enter no. of candies");
    	   nofcand=sc.nextInt();
    	   Sweets s1=new Sweets(nofchoc,nofcand);
    	   while(i<=3)
    	   {
    	   System.out.println("1.Total weight\n2.sorting the choclates\n3.no. of candies\n4.exit");
    	   ch=sc.nextInt();
    	   if(ch==1)
    	    System.out.println(nofchoc+nofcand);
    	   else if(ch==2)
    	   {
    		Chocalates c1=new Chocalates ();
    	    c1.user();
    	    System.out.println("enter 'a' for ascending order\n enter 'd' for descending order");
    	    String a=sc.next();
    	    c1.sort(a); 
    	   }
    	   else if(ch==3)
    	   {
    	    if(nofcand==0)
    	     System.out.println("zero candies");
    	    else
    	    {
    	     Candies c2=new Candies();
    	     c2.count();
    	    }
    	   }
    	   else if(ch==4){
    		   break;
    	   }
    	   }
    	   System.out.println((i+1)+"gift completed");
    	  }
    	 
    	 }
 }
