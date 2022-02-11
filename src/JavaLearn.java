import java.util.Scanner;
public class JavaLearn {
    public static void main(String[] args){
        System.out.println("Üçgenin kenar uzunluklarını girin?");
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c ");
        int c = sc.nextInt();
        float yCevre = (a + b + c)/2;
        float alan = yCevre*(yCevre-a)*(yCevre-b)*(yCevre-c);
        System.out.println("Sonuc: "+ alan);
    }
}
