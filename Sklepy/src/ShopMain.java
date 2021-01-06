public class ShopMain {
    public static void main(String[] args){
        Bookshop bookshop = new Bookshop("Polska 3",5, new String[]{"Zeszyt","Słownik","Książka"});
        Bakery bakery = new Bakery ("Żeromskiego 23",2, new String[]{"Chleb","Bułka","Drożdżówka"});
        System.out.println(bookshop.getInformation());
        System.out.println(bakery.getInformation());
    }
}

