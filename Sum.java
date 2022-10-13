import java.util.*;
class Sum{
    public static void main(String args[]){
        System.out.print("Enter the number to which you want the sum");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(sum(num));
    }
    public static  int sum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
}