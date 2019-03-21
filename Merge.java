import java.util.*;
public class Merge{
  public static void mergesort(int[]data){
    mergesortH(data,0,data.length-1);
  }
  public static void mergesortH(int[]data, int lo, int hi){
    int middle = ((lo + hi) /2);
    if (hi - lo < 180){
      insertionsort(data,lo,hi);
      return;
    }
    //if(hi-lo < 50){
    //   insertionsort(data,lo,hi);
    //}
    //else{
    mergesortH(data,lo,middle);
    mergesortH(data,middle +1, hi);
  //}
    merge(data,lo,middle,hi);
  }
  public static void merge(int[] data, int lo, int middle, int hi){
    int LeftIndex = 0;
    int RightIndex = 0;
    int [] left = new int[middle - lo + 1];
    int [] right = new int[hi - middle];
    int [] temp = new int [hi - lo +1];
    for (int i = 0; i < left.length; i ++){
      left[i] = data[lo + i];
    }
    for (int j = 0; j < right.length; j ++){
      right[j] = data[middle + j +1];
    }
    //System.out.println(Arrays.toString(left));
    //System.out.println(Arrays.toString(right));

    while (RightIndex != right.length && LeftIndex != left.length){
      if (left[LeftIndex] <= right[RightIndex]){
        temp[RightIndex + LeftIndex] = left[LeftIndex];
        LeftIndex ++;
      }
      else{
        temp[RightIndex + LeftIndex] = right[RightIndex];
        RightIndex ++;
      }
    }

    int leftOver[] = left;
    int leftover = LeftIndex;
    if(LeftIndex == left.length){
      leftOver = right;
      leftover = RightIndex;
    }
    //System.out.println(Arrays.toString(leftOver));
    //System.out.println(leftover);
    for(int k = LeftIndex + RightIndex; k < left.length + right.length;k ++){
      temp[k] = leftOver[leftover];
      leftover ++;
    }
    for (int l = 0; l < temp.length; l ++){
      data[lo +l] = temp[l];
    }
    //System.out.println(Arrays.toString(data));
    /*
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
*/
  }
  public static void insertionsort(int[] data, int lo,int hi){
    int len = hi - lo + 1;
  for (int i = 1; i<len; i++){
    int hold = data[lo + i];
    int index = i;
  while (index > 0 &&  hold <data[lo + index -1]){
    data[lo + index] = data[lo + index -1];
    index --;
  }
  data[lo + index] = hold;
  }
}

  public static void main(String[] args) {
    //int[] orginal = new int [10];
    int[] data1 = {99,88,77,44,55,44,22,33,23123,4125347,65865345};
    //int[] data2 = {1,3,5,7};
    //merge(orginal, data1,data2);
    //mergesort(data1);
    //System.out.println(Arrays.toString(data1));
    insertionsort(data1,1,11);
    System.out.println(Arrays.toString(data1));
  }

}
