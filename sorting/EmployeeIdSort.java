
public class EmployeeIdSort {
    public static void main(String[] args) {
        int[] arr = {105, 101, 109, 102, 104};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int m = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[m]){
                    m=j;
                }
            }
            int temp = arr[m];
            arr[m]=arr[i];
            arr[i]=temp;
        }

        for (int id : arr) {
            System.out.print(id + " ");
        }
    }    
}
