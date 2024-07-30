public class swap2{
public static void main(String[]args){
int b = 6;
int c = 8;

b = b + c;
c = b - c;
b = b - c;

System.out.println(b + " " + c);
}
}