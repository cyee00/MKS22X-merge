public class Merge{
  public static void mergesort(int[]data){
    sort(data);
  }

  private static void sort(int[]data){
    if (data.length<=1){
      data=data;
      return;
    } else if (data.length==2){
      if (data[1]<data[0]){
        int temp = data[0];
        data[0]=data[1];
        data[1]=temp;
        return;
      }
    } else {
      int half;
      if (data.length%2==0){
        half=data.length/2;
      } else {
        half = data.length/2+1;
      }
      int[] a = new int[half];
      int[] b = new int[data.length-half];
      for (int i=0;i<half;i++){
        a[i]=data[i];
      }
      for (int i=half;i<data.length;i++){
        b[i-half]=data[i];
      }
      /*if (!(a.length<=1&&b.length<=1)){
        mergesort(a);
        mergesort(b);
      } else {
        data = merge(a,b);
      }*/
      data = merge(a,b);
    }
  }


  private static int[] merge(int[]a,int[]b){
    int[] ans = new int[a.length+b.length];
    System.out.println(toString(a));
    System.out.println(toString(b));
    int counterA = 0;
    int counterB = 0;
    int counterAns = 0;
    for (int i=0;i<ans.length;i++){
      if (b[counterB]<a[counterA]){
        ans[counterAns]=b[counterB];
        if (counterB<b.length-1){
          counterB++;
        }
      } else {
        ans[counterAns]=a[counterA];
        if (counterA<a.length-1){
          counterA++;
        }
      }
      System.out.println("After "+counterAns+"passes: ans: "+toString(ans)+"a: "+toString(a)+"b: "+toString(b));
      counterAns++;
    }
    return ans;
  }

  public static String toString(int[]data){
    String ans="";
    for (int i=0;i<data.length;i++){
      ans+=data[i];
    }
    return ans;
  }

  public static void main(String[]args){
    int[] test = {1,1,2,1,5};
    mergesort(test);
    System.out.println("Test: " + toString(test));
  }
}
