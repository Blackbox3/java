package MethodChallenge;

public class Class1 {

    public static void main(String[] args) {

      int p_position= calculateHighPostion(1500);
      displayHighScorePosition("Tim",p_position);
    }

    public static void displayHighScorePosition( String p_name, int p_position)
    {
        System.out.print(p_name+ " managed to get into position " + p_position + " on the high score list");
    }

     public static int calculateHighPostion(int score)
     {
      if(score>= 1000)
      {
          return 1;
      } else if ((score>=500)&&(score <1000)) {

          return 2;
      } else if ( (score>=100) && (score<500)) {
          return 3;
      }
      else {
          return 4;
      }
     }
}
