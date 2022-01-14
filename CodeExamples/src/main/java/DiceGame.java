import java.util.Random;

public class DiceGame {

    // 1+1=2
    // 3+4=7
    // 5+6=11
    // 3. denemenizde buldunuz

    public int getDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public String playGame() {
        int sum = 0;
        int counter = 0;

        while (sum != 11) {
            int dice1 = getDice();
            int dice2 = getDice();
            sum = dice1 + dice2;

            String result = dice1 + "+" + dice2 + "=" + sum;
            System.out.println(result);

            counter++;
        }
       return (counter + ". denemenizde buldunuz");
    }
}
