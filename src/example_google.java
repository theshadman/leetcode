public class example_google {

    public static void main(String [] alph){
        int g [] = {1,2,3,4};
        System.out.println(new example_google().hasSumPair(g,88));
    }

    public boolean hasSumPair(int [] arr, int sum){
        int i = 0;
        int j = arr.length-1;
        while(true){
            if(arr[i]+arr[j] > sum){
                j--;
            }else if(arr[i]+arr[j] < sum){
                i++;
            }else{
                return true;
            }

            if(i==j){
                return false;
            }
        }
    }

}
