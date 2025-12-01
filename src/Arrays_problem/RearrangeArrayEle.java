package Arrays_problem;

public class RearrangeArrayEle {

    public static int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int []pos=new int[n];
        int []neg=new int[n];
        int p=0;
        int q=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[p]=nums[i];
                p++;
            }else{
                neg[q]=nums[i];
                q++;
            }
        }
        int []result=new int[n];
        int k=0;
        int i=0;
        int j=0;
        while (i < p && j < q) {     // use p and q, not full length
            result[k] = pos[i];
            i++;
            k++;

            result[k] = neg[j];
            j++;
            k++;
        }

        // If extra positives remain
        while (i < p) {
            result[k] = pos[i];
            i++;
            k++;
        }

        // If extra negatives remain
        while (j < q) {
            result[k] = neg[j];
            j++;
            k++;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};

        int []result=rearrangeArray(arr);
        for(int i: result){
            System.out.print(i+",");
        }
    }
}

