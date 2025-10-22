import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2020, "White", 15000, "A123BC77"),
            new Car(2, "Toyota", "Madina", 2020, "Black", 45000, "B456DE77"),
            new Car(3, "Toyota", "Corolla", 2019, "Red", 12000, "C789FG77"),
            new Car(4, "Mercedes", "C-Class", 2021, "Silver", 38000, "D012HI77"),
            new Car(5, "Honda", "Civic", 2020, "Blue", 14000, "E345JK77")
        };
        System.out.println(Arrays.toString(getCarByBrend(cars, "Toyota")));
        System.out.println(Arrays.toString(getCarByBrend(cars, "123")));
    }
    public static Car[] getCarByBrend(Car[] cars, String brend){
        int count=0;
        for(Car car:cars){
            if (car.getBrend().equals(brend)){
                count++;
            }
        }
        Car[] ret_cars = new Car[count];
        int index=0;
        for(Car car:cars){
            if (car.getBrend().equals(brend)){
                ret_cars[index++]=car;
            }
        }
        return ret_cars;
    }
}