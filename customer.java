public class customer{

static int n = 0;
final int num;
String name;

public customer(int num,int n){
this.num = num;
this.n = n;
n++;
}

public customer(String name,int num,int n){
this.name= name;
this.num = num;
this.n=n;
n++;
}

public void display(int n){
System.out.println(num);
System.out.println(n);
}

public void display(){
System.out.println(name);
System.out.println(num);
System.out.println(n);
}


}