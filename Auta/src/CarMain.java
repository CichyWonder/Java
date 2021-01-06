public class CarMain {
    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes("White"," Mercedes",220);
       Porshe porshe = new Porshe("Green","Porshe",310);
       Mazda mazda = new Mazda("Yellow","Mazda",30);

       Cars[] cars= {mercedes,porshe,mazda};

       for (Cars car:cars){

           System.out.println(car.getInfo());
       }
    }
}

