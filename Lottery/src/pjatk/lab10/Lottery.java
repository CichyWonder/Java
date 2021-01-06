package pjatk.lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Lottery {
    public Lottery() {
    }
    private List<Integer> user = new ArrayList<Integer>(6);
    private List<Integer> random = new ArrayList<Integer>(6);
    public void inputNumbers() {
        Scanner scan = new Scanner(System.in);
        while (user.size() < 6) {
            System.out.println("Enter number: ");
            int pick = scan.nextInt();
            if (pick > 0 && pick < 50) {
                user.add(pick);
            } else {
                System.out.println("Number must in range 1-49");
            }
        }
    }
    public void randomNumbers() {
        Random rand = new Random();
        while (random.size() < 6) {
            int pick = rand.nextInt(50) + 1;
            random.add(pick);
        }
    }
    public void display(){
        System.out.println(user);
        System.out.println(random);
        System.out.println("Trafienia: "+getHits());
    }
    public List<Integer> getHits(){
        List<Integer> result = new ArrayList<>();
        for(int pick : user){
            if(random.contains(pick))
                result.add(pick);
        }
        return result;
    }
}
