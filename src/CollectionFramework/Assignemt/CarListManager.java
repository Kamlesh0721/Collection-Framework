package CollectionFramework.Assignemt;

import java.util.Arrays;
import java.util.List;

public class CarListManager {
    public static void main(String[] args) {
        // Create a list of cars
        List<Car> cars = Arrays.asList(
                new Car("Tata", 2020, 9.5, "Petrol", "Nexon"),
                new Car("Maruti", 2019, 7.5, "Diesel", "Swift"),
                new Car("Hyundai", 2022, 11.0, "Petrol", "Creta"),
                new Car("Tata", 2021, 12.5, "Electric", "Tiago"),
                new Car("Maruti", 2022, 14.5, "Petrol", "Baleno"),
                new Car("Tata", 2020, 8.0, "Petrol", "Altroz")
        );

//         List of all cars
        System.out.println("All Cars:");
        System.out.println(getAllCars(cars));
//
//        // List of all cars of Tata
//        System.out.println("\nCars of Tata:");
//        getCarsByBrand(cars, "Tata").forEach(System.out::println);
//
//        // List of cars manufactured in 2020
//        System.out.println("\nCars manufactured in 2020:");
//        getCarsByYear(cars, 2020).forEach(System.out::println);
//
//        // List of cars in price range 8 Lacs to 12 Lacs
//        System.out.println("\nCars in price range 8-12 Lacs:");
//        getCarsByPriceRange(cars, 8, 12).forEach(System.out::println);
//
//        // List of all Petrol Cars
//        System.out.println("\nPetrol Cars:");
//        getCarsByType(cars, "Petrol").forEach(System.out::println);
//
//        // List of Maruti Cars with price <= 15 Lacs
//        System.out.println("\nMaruti Cars with price <= 15 Lacs:");
//        getCarsByBrandAndPrice(cars, "Maruti", 15).forEach(System.out::println);
//
//        // List of Petrol Cars with 2022 build
//        System.out.println("\nPetrol Cars with 2022 build:");
//        getCarsByTypeAndYear(cars, "Petrol", 2022).forEach(System.out::println);
//    }
//
    }

    private static List<Car> getAllCars(List<Car> cars) {
        return cars;
    }
}
