package Revision;

public class Fruit {
    static String brand="Green";
    String name;
    int price;

    public void initFruit(){
        brand="EatGreen";
        name="apple";
        price=23;
    }

    public String toString(){

        return "Brand : "+brand+" name : "+name+" price : "+price;
    }

}
class FruitDriver{
    public static void main(String[] args) {
        Fruit f1=new Fruit();
        f1.initFruit();
        System.out.println(f1);
    }
}
