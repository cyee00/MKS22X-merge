public class Merge{
  public static void mergesort(int[]data){
    sort(data);
  }

  private static void sort(int[]data){
  /*if (a.length==1&&b.length==0){
    return a;
  }
  if (b.length==1&&a.length==0){
    return b;
  }
  if (a.length==1&&b.length==1){
    if (a[0]<b[0]){
      ans[0]=a[0];
      ans[1]=b[0];
      return ans;
    } else {
      ans[0]=b[0];
      ans[1]=a[0];
      return ans;
    }
  }*/
    if (data.length<=1){
      data=data;
      return;
    } else{
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
    merge(a,b);
    }
  }


  private static void merge(int[]a,int[]b){
    int[] ans = new int[a.length+b.length];
    int counterA = 0;
    int counterB = 0;
    int counterAns = 0;
    while (counterA<a.length&&counterB<b.length){
      if (b[counterB]<a[counterA]){
        ans[counterAns]=b[counterB];
        counterB++;
      } else {
        ans[counterAns]=a[counterA];
        counterA++;
      }
      counterAns++;
    }
    return;
  }

}
