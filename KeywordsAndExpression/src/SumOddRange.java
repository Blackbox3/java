public class SumOddRange {

    public static void main(String[] args) {
        isOdd(10);
        sumOdd(1,20);
    }
    public static boolean isOdd(int number)
    {
        if(!(number > 0) || number %2==0)
        {
            return false;
        }
        else{
            return true;
        }

    }

    public static void sumOdd (int start, int end)
    {
        int sum=0;
        for (int i= start; i<=end; i++)
        {
            if(!((i%2) ==0))
            {
                sum=sum+i;
                System.out.println(sum);
            }

        }
    }
}
