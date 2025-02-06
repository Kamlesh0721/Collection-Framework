package Advance.lambdaExpression;

public class Main {
    public static void main(String[] args) {

//        // way 1
//        Greet o1=new GreetImpl();
//        o1.greet();
//
//        //way 2 : anonymous class
//        Greet o2=new Greet(){
//            @Override
//            public void greet(){
//                System.out.println("Hi how are you ...");
//            }
//        };
//        o2.greet();
//
//        // way 3 : using lambda expression
//        Greet o3=()->{
//            System.out.println("hello hi ");
//        };
//        o3.greet();
//
//        Greet o4=()-> System.out.println("hello hi ");
//        o4.greet();

        Calci c1=(n1,n2)->n1+n2;
        System.out.println(c1.sum(3,2));

    }
}
