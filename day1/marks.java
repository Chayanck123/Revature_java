import java.util.*;

public class marks{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int m1,m2,m3;

m1 = sc.nextInt();
m2 = sc.nextInt();
m3 = sc.nextInt();

System.out.println(m1+m2+m3);

double pr = ((m1+m2+m3)/300.0)*100;

System.out.println(pr);
}


}
