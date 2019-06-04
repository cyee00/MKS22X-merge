public class Merge{
  public static void mergesort(int[]data){
    return sort(data);
  }
  private static int[] sort(int[]data){
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
    return merge(a,b);
  }
  private static int[] merge(int[]a,int[]b){
    if (a.length==1&&b.length==1){
      int[] ans = new int[2];
      if (a[0]<b[0]){
        ans[0]=a[0];
        ans[1]=b[0];
        return ans;
      } else {
        ans[0]=b[0];
        ans[1]=a[0];
        return ans;
      }
    }
  }
}
