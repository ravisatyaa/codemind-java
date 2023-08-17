import java.util.Scanner;
public class Ben{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int P1 = sc.nextInt();
        int P2 = sc.nextInt();
        int P3 = sc.nextInt();
        int P4 = sc.nextInt();
        if (P1>=10 && P2>=10 && P3>=10 && P4>=10){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
    
}