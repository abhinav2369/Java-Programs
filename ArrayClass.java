public class ArrayClass {
    public static void main(String[] args) {
        
        // ---------- Integer Array ----------
        int[] arr1 = {1,2,3,4,5};
        for (int i=0 ; i<arr1.length ; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("---- Using For Each loop ------");
        for(int i:arr1){
            System.out.println(i);
        }



        // ---------- String Array -----------
        String[] arr2 = {"Abhilesh","Abhinav", "Abhishek"};
        for (int i=0 ; i<arr2.length ; i++){
            System.out.println(arr2[i]);
        }

        System.out.println("---- Using For Each loop ----");
        for(String i: arr2){
            System.out.println(i);
        }

        

        // ---------- Boolean Array -----------
        Boolean[] arr3 = {true, false, false};
        for (int i=0 ; i<arr3.length ; i++){
            System.out.println(arr3[i]);
        }

        System.out.println("---- Using For Each loop ----");
        for(Boolean i: arr3){
            System.out.println(i);
        }
    }
}

