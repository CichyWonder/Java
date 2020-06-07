package App;

public class Control {

   private static String up= "W";

   private  static String down="S";

   private static String left="A";

   private  static String right="D";

    public void setUp(String up, String down, String left, String right){
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }
    public String getUp(){
        return up;
    }
    public String getDown(){
        return down;
    }
    public String getLeft(){
        return left;
    }
    public String getRight(){
        return right;
    }
}
