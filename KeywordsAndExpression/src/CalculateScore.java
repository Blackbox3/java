public class CalculateScore {
    public static void calculateScore(boolean gameOver, int score,int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver)
        {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.print("Your final score was "+ finalScore);
        }
    }
}
