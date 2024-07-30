import java.util.*;
public class rev{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int rev = 0;
while(n!=0){
int d = n%10;
rev *= 10;
rev += d;

n /= 10;
}

System.out.println(rev);

}}
