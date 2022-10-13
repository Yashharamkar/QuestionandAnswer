import java.util.*;
class Print{
    public static void main(String args[]){
      System.out.println("Enter the number to which you have to print the number");
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      print(num);  
    }
    public static void print(int num){
        for(int i=1;i<num;i++){
            System.out.println(i);
        }
    }
}