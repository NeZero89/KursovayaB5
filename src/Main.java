import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]houses=new int[20];
        for (int i = 0; i < houses.length; i++) {
            houses[i]=i+1;
        }
        for (int i = 0; i < houses.length; i++) {
            if(houses[i]%2 !=0);{
                houses[i]+=1;

            }

        }
        for (int i=2 ;i<7; i++)
            System.out.println(houses[i]);
    }
}