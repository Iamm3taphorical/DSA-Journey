public class arrays{
    public static void main (String [] args){
        int arr[] = {1,2,3,4,5};
        int arr2[] = new int [5];

        for (int i =0; i<arr.length; i++){
            if (i%2 == 0)
            {
                arr2[i] = arr[i];
            }
        }
        int count = 0;
        while (count< arr2.length)
        {
        System.out.println(arr2[count]);

        count = count + 1;
        }
    }
}