// Find Sum and Average of Array Elements
public class sum_of_array {
    public static void main(String[] args){
        int [] array={10,15,16,8};
        int length =array.length;
        int sum=0;
        for(int i=0;i<length;i++){
            sum=sum+array[i];
    
        }

    System.out.println("sum of elements of array: "+sum);
    // sum of Average number
    float average=sum/length;
    System.out.println("Average of elements of array: "+average); 


}
}
