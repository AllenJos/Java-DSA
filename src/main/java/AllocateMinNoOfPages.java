/**
 * Minimize the max no. of pages allocated to each student.
 * Array 'pages' is given with no. of pages and also variable 'students' indicating no. of students.
 * Only contiguous pages can be allocated.
 * A student can be allocated with 0 pages also.
 * This code uses the concept of Binary Search
 */
public class AllocateMinNoOfPages {
    public static void main(String[] args) {
//        int[] pages = {10, 20, 10, 30};    /**
                                             //  expected outcome: 40
//        int students = 2;                  **/
        int[] pages = {10, 5, 30, 1, 2, 5, 10, 10};   //
                                                      // expected outcome: 30
        int students = 3;                             //
        System.out.println(allocatePages(pages, students));
    }

    //method to find the required result.
    private static int allocatePages(int[] pages, int students) {
       int totalSum=0, maxVal=pages[0];
       for(int i=0; i<pages.length; i++){
           totalSum+=pages[i];
           maxVal = (pages[i]>maxVal)? pages[i]: maxVal;
       }
       int low=maxVal, high=totalSum, result=Integer.MAX_VALUE;

       //using Binary Search to find the minimized max no. of pages.
       while(low<=high){
           int mid=(high+low)/2;
           if(isFeasible(pages, mid, students)){
               result = Math.min(result, mid);
               high = mid-1;
           }else{
               low=mid+1;
           }
       }
       return result;
    }

    //this method checks whether the pages currently selected can be distributed with the given no. of students.
    private static boolean isFeasible(int[] pages, int maxPages, int students) {
        int currentMaxPages=0, requiredSudent=1;
        for(int i=0; i<pages.length; i++){
            if(currentMaxPages+pages[i]<=maxPages){
                currentMaxPages+=pages[i];
            }else{
                requiredSudent+=1;
                currentMaxPages=pages[i];
            }
        }
//        System.out.println("Required Students: "+requiredSudent+" MaxPages: "+maxPages+ " Feasible?" +(requiredSudent<=students));
        return (requiredSudent<=students);
    }
}
