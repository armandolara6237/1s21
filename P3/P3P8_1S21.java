public class P3P8_1S21 {
public static void f(int a, int b){
    int c=a+b;
    if (c<200){

        System.out.println(c);
        f(b,c);
    }
}
public static void main(String[] args) {
    System.out.println("0\n1");
    f(0,1);
}
}