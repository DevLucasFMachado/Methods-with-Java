public class Methods {
    public static void main(String[] args) {
       /* boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("The highScore is " + highScore);



        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highScore is" +
        calculateScore(gameOver, score, levelCompleted, bonus));
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){


        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;


        }

        return finalScore; */


    displayHighScorePosition(1, "Lucas");
    displayPlayerPosition(500);



    }
    public static void displayHighScorePosition(int playerPosition, String playerName) {
        System.out.println("Players name " + playerName+ " Players position " + playerPosition);


    }
    public static int displayPlayerPosition(int score){
        int returnValue = 0;
        if(score >= 1000){
            System.out.println("The player got 1º place");
            returnValue = 1;
        } else if (score < 1000 && score >= 500) {
            System.out.println("The player got 2º place");
            returnValue = 2;
        } else if (score < 500 && score >= 100) {
            System.out.println("The player got 3º place");
            returnValue =3;
        }else{
            System.out.println("The player got 4º place");
            returnValue = 4;

        }
        return returnValue;

    }

}
