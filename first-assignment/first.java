import java.util.Scanner;
/**
 * prog
 */
public class first {
    public static void main(String[] args) {     
    }
    /*
     * 1-Write a program that read 10 numbers form the user and get 
        the maximum and the minimum numbers between them and their 
        position
     */
    public static void firs_task(){
        Scanner in=new Scanner(System.in);
        int Min=2147483647,Max=-2147483648;
        int min_indx=0,max_indx=0;
        int arr[] =new int [10];
            for(int i=0;i<10;i++){
                System.out.print("Enter Number["+i+1+"]:");
                arr[i]=in.nextInt();
                Min=Math.min(Min,arr[i]);
                Max=Math.max(Max,arr[i]);
                if(Min==arr[i]) 
                    min_indx=i;
                if(Max==arr[i])
                    max_indx=i;
            }
            System.out.print("The max number is : "+Max+" at index ["+max_indx+"]\n");
            System.out.print("The min number is : "+Min+" at index ["+min_indx+"]\n");
        in.close();
    }
    /*
     * 2-Write a Program to reverse the number entered by the user 
            Ex. Reverse of number 1234 is 4321
     */
    public static void second_task(){
        String s;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        s=in.nextLine();
        StringBuffer str=new StringBuffer(s);
        str.reverse();
        in.close();
        System.out.println("The number after revereing : "+str);
    }
    /*
     * 3-Write a program to get the prime numbers between range of 
        two number

     */
    public static void third_task() {
      int n1,n2;
      Scanner in=new Scanner(System.in);
      System.out.print("Enter the range[x-y] to print the prime numbers : ");
        n1=in.nextInt();
        n2=in.nextInt();
        for(int i=n1;i<=n2;i++){
            if(is_prime(i))
                System.out.print(i+" ");
        }
        System.out.println();
        in.close();
    }
    
    public static boolean is_prime(int n){
        if (n == 2)
            return true;
        if (n % 2 == 0 || n < 2)
            return false;
        for (int i = 3; i * i <= n; i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /*
     * 4-Write a program that prints the following pattern
     *          *******
     *           *****
     *            ***
     *             *
     */
    public static void fourth_task(){
        for(int i = 5; i >= 1; i--)
        {
            for(int j = i; j < 5; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    }