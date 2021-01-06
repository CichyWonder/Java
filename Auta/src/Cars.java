public class Cars {
    protected String color;
    protected String brand;

    public Cars(String color, String brand) {
        this.color = color; this.brand = brand;
    }
    public String getInfo(){
        return "Brand: "+ brand+ " Color: "+ color;
    }
}
    class Mercedes extends Cars {
    private int maxSpeed;
    public Mercedes(String color, String brand,int maxSpeed) {
        super(color, brand);
        this.maxSpeed = maxSpeed;
    }
    private String makeSound(){
        return " Ziuum";
    }
    @Override public String getInfo() {
        return super.getInfo();
    }
}
    class Porshe extends Cars {
    private int maxLoad;
    public Porshe(String color, String brand,int maxLoad) {
        super(color, brand);
        this.maxLoad = maxLoad;
    }
    private String makeSound(){
        return " Wrrrum";
    }
    @Override public String getInfo() {
        return super.getInfo();
    }
}
    class Mazda extends Cars {
    private int maxLoad;
    public Mazda(String color, String brand,int maxLoad) {
        super(color, brand);
        this.maxLoad = maxLoad;
    }
    private String makeSound(){
        return " Brap Brap";
    }
    @Override public String getInfo() {
        return super.getInfo();
    }
}

