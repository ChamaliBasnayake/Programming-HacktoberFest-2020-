public class QuickSort {  
public static void main(String[] args) {  
        int i;  
        int[] arr={98,83,201,48,95,33,77,88,32,22};  
        quickSort(arr, 0, 9); 
        for(i=0;i<10;i++)  
        System.out.println(arr[i]);  
    }  
    public static int partition(int a[], int beg, int end)  
    {  
          
        int left, right, temp, loc, flag;     
        loc = left = beg;  
        right = end;  
        flag = 0;  
        while(flag != 1)  
        {  
            while((a[loc] <= a[right]) && (loc!=right))  
            right--;  
            if(loc==right)  
            flag =1;  
            elseif(a[loc]>a[right])  
            {  
                temp = a[loc];  
                a[loc] = a[right];  
                a[right] = temp;  
                loc = right;  
            }  
            if(flag!=1)  
            {  
                while((a[loc] >= a[left]) && (loc!=left))  
                left++;  
                if(loc==left)  
                flag =1;  
                elseif(a[loc] <a[left])  
                {  
                    temp = a[loc];  
                    a[loc] = a[left];  
                    a[left] = temp;  
                    loc = left;  
                }  
            }  
        }  
        returnloc;  
    }  
    static void quickSort(int a[], int beg, int end)  
    {  
          
        int loc;  
        if(beg<end)  
        {  
            loc = partition(a, beg, end);  
            quickSort(a, beg, loc-1);  
            quickSort(a, loc+1, end);  
        }  
    }  
}  
