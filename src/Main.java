import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> jup = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            list.add(random.nextInt(1, 100));
            System.out.print(" " + list.get(i));

        }

        ArrayList<Integer> tak = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                jup.add(i);
            } else if (i % 2 == 1) {
                tak.add(i);
            }
        }


        System.out.println("\n Jup " + jup);
        System.out.println(" Tak " + tak);

    }

    }
