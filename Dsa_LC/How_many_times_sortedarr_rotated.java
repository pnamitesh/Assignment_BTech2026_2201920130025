

public class How_many_times_sortedarr_rotated {
    public static int count(int a[]){
        int start=0,end=a.length-1;
        int n=a.length;
        

        while(start<=end){
            if (a[start] <= a[end]) {
                return start; 
            }
            int mid=start+((end-start)/2);
            int next=(mid+1)%n;int prev=(mid+n-1)%n;

            if (a[mid]<=a[prev]&&a[mid]<=a[next]) {return mid;}

            if (a[start]<=a[mid]) {start=mid+1;}
            else { end=mid-1;}
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={11,12,15,18,2,5,6,8};
        int res=count(num);
        System.out.println(res);
    }
}
