import java.lang.reflect.Array;
import java.util.Arrays;

public class Shops {
    protected String address;
    protected int size;

    public Shops(String address, int size) {
        this.address = address;
        this.size = size;
    }
    public String getInformation() {
        return "Address: " + address + " size: " + size;
    }
}
    class Bookshop extends Shops {
    private String products[];
    public Bookshop(String address, int size, String products[]) {
        super(address, size); this.products=products;
    }
    @Override public String getInformation() {
        return super.getInformation() + " Products: "+ Arrays.toString(products);
    }
}
    class Bakery extends Shops {
    private String products[];
    public Bakery(String address, int size, String products[]) {
        super(address, size);
        this.products= products;
    }
    @Override public String getInformation() {
        return super.getInformation() + " Products: "+ Arrays.toString(products);
    }
}

