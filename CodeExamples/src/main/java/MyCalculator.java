import java.util.Scanner;

public class MyCalculator {

    public void calculate(){
        Scanner keyboard = new Scanner(System.in);
       int choice = 0 ;
       while (choice!=7){
           displayMenu();
           choice = keyboard.nextInt();
           if (choice==1){
               System.out.print("a: ");
               int a = keyboard.nextInt();

               System.out.print("b: ");
               int b = keyboard.nextInt();
               int result = add(a,b);
               System.out.println(a + "+" + b + "= " + result);

           }else if(choice==2){
               System.out.println("a: ");
               int a = keyboard.nextInt();

               System.out.println("b: ");
               int b = keyboard.nextInt();

           }else if (choice==3){

           }
           else if(choice==4){
               System.out.print("a: ");
               int a = keyboard.nextInt();

               System.out.print("b: ");
               int b = keyboard.nextInt();
               if (b==0){
                   System.out.println("b can not be 0!");
               }else {
                   int result = divide(a,b);
                   System.out.println(a + "/" + b + "= " + result);
               }
           }else if(choice==5){
               System.out.print("a: ");
               int a = keyboard.nextInt();

               System.out.print("b: ");
               int b = keyboard.nextInt();

               try{
                   int result = mode(a,b);
                   System.out.println(a + "%" + b + "= " + result);
               }catch (Exception e){
                   System.out.println("b can not be 0!");
               }


           }else if(choice==6){
               System.out.print("a: ");
               int a = keyboard.nextInt();

               System.out.print("b: ");
               int b = keyboard.nextInt();
               int result = power(a,b);
               System.out.println(a + "^" + b + "= " + result);

           }
           else if (choice==7){
               System.out.println("calculator is done by by");
           }else {
               System.out.println("invalid input! choice should be between 1-7!");
           }

       }
    }
    public void displayMenu(){
        System.out.println("menu");
        System.out.println("1-add");
        System.out.println("2-subtract");
        System.out.println("3-multiple");
        System.out.println("4-divide");
        System.out.println("5-mod");
        System.out.println("6-power");
        System.out.println("7-exit");

        System.out.print("choice : ");

    }
    public int add(int a, int b){
       return a+b ;
    }
    public int mode(int a, int b){
        return a%b;
    }
    public int power(int a, int b){
        return (int)Math.pow(a,b);
    }
    public int divide(int a ,int b){
        return a/b ;

    }


}

