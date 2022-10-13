import java.util.*;
class Swap_two_number{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the two number");
        int num=sc.nextInt();
        int num1=sc.nextInt();
        ans(num, num1);
       
    }
    public  static void ans(int num, int num1){
            int temp=num;
            num=num1;
            num1=temp;
             System.out.println("the swaped number is " + num+ " " +num1);
        }

}