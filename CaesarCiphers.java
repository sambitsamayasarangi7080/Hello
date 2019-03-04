//MAJOR ASSIGNMENT
//NAME-SAMBIT SAMAYA SARANGI
//REGD. NO.-1841012224
//BRANCH-CSE SEC-H
import java.util.Scanner;
public class CaesarCiphers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s=new Scanner(System.in);
String c1="";
String c2="";
System.out.println("Enter encryption key:");
int key=s.nextInt();
System.out.println("Enter the Plaintext(UPPERCASE LETTERS ONLY)");
String c3=s.next();
for(int m=0;m<c3.length();m++){
	char ch=(char)(((int)c3.charAt(m)+key-65)%26+65);
	c1=c1+ch;
	}
System.out.println("Cipher text is "+c1);
System.out.println();
System.out.println("Enter cipher text(UPPERCASE LETTERS ONLY)");
String c4=s.next();
for(int n=0;n<c1.length();n++){
	char ch1=(char)(((int)c1.charAt(n)-key-90)%26+90);
	c2=c2+ch1;
}
System.out.println("Plain text is "+c2);
	}

}
