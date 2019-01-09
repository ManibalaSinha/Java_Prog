public class FindNoArray {
    public static void main(String[] args){
        int[] numbers = {23, 67, 45, 27};
        int key =56;
        int i=0;
        boolean found = false;
        for(i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Found"+key + "at index" +i+"");
        }
        else
        {
            System.out.println("Not Found"+key );
        }
    }
}
