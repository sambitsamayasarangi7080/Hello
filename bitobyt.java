import java.util.Scanner;
public class bitobyt{

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number the of test cases and  ms you want");
int T=sc.nextInt();

for(int i=0;i<T;i++){
	int N=sc.nextInt();
	int n,d;
	
	n=N/7;
	d=(N%7);

int m=(int)Math.pow(2,n);
        if(d<=2)
          System.out.println(m + " 0 0\n");  
        else if((d>2) && (d<=10))
        	System.out.println("0 " + m + " 0\n");  
        else if(d>10)
        	System.out.println("0 0 " + m +"\n" );          
}

}
}