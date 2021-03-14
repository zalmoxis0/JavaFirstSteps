public class Methods {
    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);


        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("alex", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("romeo", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("toto", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("pufi", highScorePosition);


    }

    /*
    Shorter and more efficient way instead of if else.
    */

    /*
    Void means: Don't send any value back=> If you're crating a method and don't want to return any information,
    use -> void.
     */

    /*
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    */

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);

            return finalScore;
        }
        /*
        return -1=> Is conventionally used to indicate an error. In searching algorithms -1 indicates an invalid value
        or a value not found.
         */
        return -1;

    }

        /*
    ====================================================================================================================

        CHALLENGE   CHALLENGE   CHALLENGE   CHALLENGE   CHALLENGE   CHALLENGE   CHALLENGE   CHALLENGE   CHALLENGE

    ====================================================================================================================
  */

    /*
    Create a method called displayHighScorePosition. It should display a players name as a parameter, and a 2nd
    parameter as a position in the high score table. You should display the players name along with a message like
    "managed to get into position" and the position they got and a further message "on the high table".

    Create a 2nd method called caclulateHighScorePosition. It should be sent 1 argument only: the player score.
    It should return an int. The return data should be:
    1) if the score is >1000
    2) if the score is >500 and < 1000
    3) if the score is >100 and < 500
    4 in all other cases
    call both methods and display the results of the following
    a score of 1500, 900, 400, 50.

     */

    public static void displayHighScorePosition(String player, int highScorePosition) {
        System.out.println(player + " Managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
/*
        if (playerScore >= 1000) {
            return 1;
        }

        else if (playerScore >= 500) {
            return 2;
        }

        else if (playerScore >= 100) {
            return 3;
        }

        else{
            return 4;
        }

*/
        int position = 4; // assuming position 4 will be returned

        if (playerScore >=1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >=100) {
            position = 3;
        }

        return position;
    }


}




