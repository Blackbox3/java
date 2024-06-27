package StudentDetails;

public class Main {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            Student s= new Student("6446d646" + i,
                    switch (i){
                case 1-> "Marry";
                case 2-> "Daria";
                case 3-> "fsdfs";
                default-> "anynomous";}
                ,"05/5/2002","JAva class");
            System.out.println(s);
        }

    }
}
