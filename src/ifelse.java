public class ifelse {

    public static void main(String[] args) {

//        boolean gameOver = true;
//        int score = 5000;
//        int bonus = 100;
//        int levelCompleted = 5;
//
//        int highscore = calculateHighScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("your final score was " + highscore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        highscore = calculateHighScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("your final score was " + highscore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim ", highScorePosition);

         highScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("Matthew ", highScorePosition);

         highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Marissa ", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Mark ", highScorePosition);

    }


    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }

    }
        public static void displayHighScorePosition(String playerName, int displayHighScorePosition) {
        System.out.println(playerName +"managed to get into position " + displayHighScorePosition + " on the high score table");

    }
    public static int calculateHighScore(boolean gameOver, int score, int bonus, int levelCompleted) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;


    }

}
