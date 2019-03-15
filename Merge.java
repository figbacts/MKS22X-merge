import java.util.*;
public class Merge{
  public static void mergesort(int[]data){
    mergesort(data,0,data.length-1);
  }
  public static void mergesort(int[]data, int lo, int hi){

  }
  public static void merge(int[] FinalDestination, int dataOne, int dataTwo){
    int index1 = 0;
    int index2 = 0;
    while (index1 != data1.length && index2 != data2.length){
      if(data1[index1] > data2[index2]){
        FinalDestination[index1 + index2] = data2[index2];
        index1 ++;
      }
      else{
        FinalDestination[index1 + index2] = data2[index2];
        index2 ++;
      }
    }
    int leftover = index1;
    if(index2 == data2.length){
      leftover = index2;

    }
    for(int i = leftover; i < data1.length; i ++){
      FinalDestination[i + index2] = data1[i];
    }
  }
  public static void main(String[] args) {
    int[] orginal = new int [10];
    int[] data1 = {0,2,4,6,8,9};
    int[] data2 = {1,3,5,7};
    merge(orginal, data1,data2);
    System.out.println(Arrays.toString(orginal));
  }
}
