package CollectionFramework.Assignemt;

public class Car {
    String name;
    int year;
    double price; // Assuming price is in Lacs
    String type; // Petrol/Diesel/Electric
    String modelName;

    public Car(String name, int year, double price, String type, String modelName) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.type = type;
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}