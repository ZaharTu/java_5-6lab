public class Car{
    private int id;
    private String brend;
    private String model;
    private int year;
    private String color;
    private int price;
    private String gos_number;
    public Car(int id,String brend,String model,int year,String color,int price,String gos_number){
        this.id=id;
        this.brend=brend;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.gos_number=gos_number;
    }

    @Override
    public String toString(){
        return "Car{" +
                "id=" + id +
                ", brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", gos_number='" + gos_number + '\'' +
                '}';
    }

    public int getId(){
        return id;
    }
    public int getYear(){
        return year;
    }
    public int getPrice(){
        return price;
    }
    public String getBrend(){
        return brend;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public String gos_number(){
        return color;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setBrend(String brend){
        this.brend=brend;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setGos_Number(String gos_number){
        this.gos_number=gos_number;
    }
}