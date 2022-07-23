public class Main {

    public static void main(String[] args) {
        String playerName = "Bob";
        boolean gameOver = true;

        if (gameOver){
            int endScore = calculateScore( 1000, 8, 100, 555);
            handleEndGame(endScore,playerName);
        } else {
            cheerPlayerOn();
        }
    }

    public static void handleEndGame(int endScore, String playerName) {
        int position = calculateHighScorePosition(endScore);
        String message = displayHighScorePosition(playerName, position);
        System.out.println("Final score: " + endScore);
        System.out.println(message);
    }

        public static int calculateScore( int score, int levelCompleted, Integer ... bonus) {
            int levelBonus = bonus.length >= 1 ? bonus[0] : 0;
            int optionalBonus = bonus.length >= 2 ? bonus[1]  : 0;
            int finalScore = score + (levelCompleted * levelBonus) + optionalBonus;
            return finalScore;
        }

        public static String displayHighScorePosition(String name, int position) {
            return "Player name: " + name + " managed to get into position " + position + "!";
        }

        public static int calculateHighScorePosition(int playerScore) {
            if (playerScore >= 1000){
                return 1;
            } else if (playerScore >= 500){
                return 2;
            } else if (playerScore >= 100) {
                return 3;
            }
                else {
                return 4;
            }
        }


        public static void cheerPlayerOn (){
                System.out.println("Still alive! Keep up the good work!");
        }
    }



