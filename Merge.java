import java.util.*;
public class Merge{
  public static void mergesort(int[]data){

    mergesortH(data,0,data.length-1);
  }
  public static void mergesortH(int[]data, int lo, int hi){
    if(lo >= hi){
      return;
    }
    int middle = (lo + hi /2);
    System.out.println(middle);

    int [] left = new int[middle+1];
    for(int i = 0; i < middle +1; i ++){
      left[i] = data[i];
    }
    int [] right = new int[data.length - middle -1];
    for(int i = middle+1; i < data.length ; i ++){
      right[i-middle -1] = data[i];
    }
    System.out.println(Arrays.toString(left));
    System.out.println(Arrays.toString(right));
    //mergesort(data,lo,(lo + hi) /2);
    //mergesort(data,(lo + hi) /2 +1, hi);

  }
  public static void merge(int[] FinalDestination, int[] dataOne, int[] dataTwo){
    int indexOne = 0;
    int indexTwo = 0;
    while (indexOne < dataOne.length && indexTwo < dataTwo.length){
      if (dataOne[indexOne] < dataTwo[indexTwo]){
        FinalDestination[indexOne + indexTwo] = dataOne[indexOne];
        indexOne ++;
      }
      else{
        FinalDestination[indexOne + indexTwo] = dataTwo[indexTwo];
        indexTwo ++;
      }
    }
    int leftOver[] = dataOne;
    int leftover = indexOne;
    if(indexOne == dataOne.length){
      leftOver = dataTwo;
      leftover = indexTwo;
    }
    for(int i = indexOne + indexTwo; i < dataOne.length + dataTwo.length; i ++){
      FinalDestination[i] = leftOver[leftover];
      leftover ++;
    }

  }
  public static void main(String[] args) {
    //int[] orginal = new int [10];
    int[] data1 = {0,2,4,6,8,9,11,13,15};
    //int[] data2 = {1,3,5,7};
    //merge(orginal, data1,data2);
    mergesort(data1);
    //System.out.println(Arrays.toString(orginal));
  }
}
