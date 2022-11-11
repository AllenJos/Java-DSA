
//Code to find the Minimum Group Flips in a array of binary elements, to make
//the whole array of same binary element.
public class MinGroupFlips {
    public static void main(String[] args) {
//        int[] arr = {1, 0, 0, 0, 0, 1, 1 ,1, 0, 1}; //expected outcome: From 1 To 4
                                                    //                  From 8 To 8
//        int[] arr = {1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1}; //expected outcome: From 1 To 4
                                                       //                  From 8 To 8
//        int[] arr = {1, 1, 1}; //expected outcome: Nothing
//        int[] arr = {0, 1};      //expected outcome: From 1 To 1
        int[] arr = {0, 0, 0, 1, 0, 0, 1, 1, 1, 1}; //expected outcome: From 3 To 3
                                                    //                  From 6 To 9
        minGroupFlips(arr);
    }

    //idea: first iteration, count the number of groups and decide which one has lesser groups
    //second iteration, print the desired results
    private static void minGroupFlips(int[] arr) {
        int[] arrGroup=new int[2]; //array with indexes 0 and 1 only
        arrGroup[arr[0]]++;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                arrGroup[arr[i]]++;
            }
        }
//        System.out.println("Zeros "+arrGroup[0]+"ones "+arrGroup[1]);

        int winnerGroup = arrGroup[0]<arrGroup[1]? 0: 1;

        if(arr[0]==winnerGroup){
            System.out.println("From "+0);
        }
        for(int i=1; i<arr.length; i++){
           if(arr[i]!=arr[i-1]){
               if(arr[i]==winnerGroup)
                   System.out.print("From "+i);
               else
                   System.out.println(" To "+(i-1));
           }
        }
        //if the last element is the element to flip
        if(arr[arr.length-1]==winnerGroup){
            System.out.println(" To "+(arr.length-1));
        }
    }
}
