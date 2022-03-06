import java.util.Scanner;

class Calculator {

    public static void main(String args[]){
        System.out.println("Hello!"+"\n"+"What do you want to do?");

        System.out.println("Press 1 for sum");
        System.out.println("Press 2 for diff");
        System.out.println("Press 3 for multi");
        System.out.println("Press 4 for divid");

        System.out.print("Enter your option - ");
        Scanner ans=new Scanner(System.in);
        int input=ans.nextInt();

        System.out.print("Enter Number 1 -");
        double num1=ans.nextDouble();
        System.out.print("Enter Number 2 - ");
        double num2=ans.nextDouble();
        double answer=0.0;
        if(input==1){
            answer=num1+num2;
        }
        if(input==2){
            answer=num1-num2;
        }
        if(input==3){
            answer=num1*num2;
        }
        if(input==4){
            answer=num1/num2;
        }

        System.out.println("Answer is "+ answer);
    }
    
}
