public class ifelse {

    public static void main(String[] args){

        boolean gameOver  = true;
        int score = 5000;
        int bonus =100;
        int levelCompleted = 5;

        int highscore = calculateScore(gameOver, score,levelCompleted,bonus);
        System.out.println("your final score was " + highscore);
        int displayHighScorePosition=highscore;
        System.out.println("managed to get into "+displayHighScorePosition+ "on the high score table");

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highscore = calculateScore(gameOver, score,levelCompleted,bonus);
        System.out.println("your final score was " + highscore);

        displayHighScorePosition=highscore;
        System.out.println("managed to get into "+displayHighScorePosition+ "on the high score table");
    }

        public static int calculateScore(boolean gameOver, int score, int bonus, int levelCompleted){

            if(gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore+=2000;
                return finalScore;
            }
            return -1;



        }

        public static void displayHighScorePosition(int highscore){


        if(highscore >= 1000) {
            System.out.println("you've received first place");


        }else if(highscore >500 && highscore < 1000 ){

            System.out.println("you've received Second place");
        }else if(highscore >100 && highscore <500){

            System.out.println("you've received Third place");

        }else{
            System.out.println("Boy you better do better");

        }
    }

        public  static void calculateHighScorePoistion(){
            //int firstPlace = 1000;
            //int secondPlace = 1000;
            //int thirdPlace = 1000;
            //int fourthPlace = 1000;




        }


}
