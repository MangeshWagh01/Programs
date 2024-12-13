


public class removeDuplicate
{

    public int removeDup(int arr[])
    {

        if(arr.length==0)
        {
            return -1;
        }

        int i=0;

        for(int j=0;j<arr.length;j++)
        {

            if(arr[j] != arr[i])
            {
                i++;
                arr[i]=arr[j];
            }

        }

        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        return i+1;
    }
    



    public static void main(String[] args) {
        
        removeDuplicate rm = new removeDuplicate();

        int arr[]= new int[]{2,2,3,4,5,5,5,8,8,8,8,8,9};
       // System.out.println(removeDuplicate(arr));
       rm.removeDup(arr);
        

    }
}
