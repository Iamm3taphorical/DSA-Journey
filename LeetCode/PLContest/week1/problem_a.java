package PLContest.week1;

import java.util.*;

public class problem_a {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int K = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) 
        {
            A[i] = sc.nextInt();
        }

        int[] B = new int[N];

       for (int i = 0; i < K; i++)
       {
           B[i] = A[N - K + i];
       }



        for (int i = K; i < N; i++)
        {
            B[i] = A[i - K];
        }

        for (int i = 0; i < N; i++)
        {
            System.out.print(B[i] + " ");
        }
    }
}