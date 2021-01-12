public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 

        int[] alternated = new int[arr.length];
        int[] start = new int[arr.length/2];
        int[] end = new int[arr.length/2];

        for (int i = 0; i < arr.length/2; i++){
            start[i] = arr[i];
        }

        for (int i = arr.length/2; i < arr.length; i++){
            end[i - arr.length/2] = arr[i];
        }


        for (int i = 0; i < arr.length; i++){
            if(i%2 == 0){
                alternated[i] = start[i];
            }
            if(i%2 == 1){
                alternated[i] = end[i];
            }
        }
        return alternated;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int placeholder = 0;
        int random = 0;

        for(int i = 0; i < arr.length; i++){
            random = (int)(Math.random() * (arr.length));
            placeholder = arr[i];
            arr[i] = arr[random];
            arr[random] = placeholder;
        }
        return arr;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
