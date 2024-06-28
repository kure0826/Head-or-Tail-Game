import java.util.Random;
import java.util.Scanner;
class Game{

    public static void main(String[] args){
        Random rand = new Random();
        int num, headcounter = 0, tailcounter = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Who are you?");
        System.out.print("> ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");

        System.out.println("Tossing a coin...");
        for(int i = 1; i <= 3; i++) {
            num = rand.nextInt(2);
            if (num == 0) {
                System.out.println("Round " + i + ": Heads");
                headcounter++;
            }
            else {
                System.out.println("Round " + i + ": Tails");
                tailcounter++;
            }
        }
        System.out.println("Heads: " + headcounter + ", Tails: " + tailcounter);
    }
}
