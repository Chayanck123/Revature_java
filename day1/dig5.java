import java.util.*;
public class dig5{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int a = n/10000;

int b = (n/10)%10;

System.out.println(a+b);
}}