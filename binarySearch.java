class binarySearch{

    public static void main(String[] args) {

        int[] inputArray ={2,4,6,12,13,16,19,21};
        int target =16;
        System.out.println(binarySearchRecursion(inputArray,target,0,inputArray.length));
    }

    public static int binarySearchRecursion(int[] inputArray, int target,int start, int end){
        
        if(start > end)
            return -1;

        int mid = (end + start)/2;

        if(inputArray[mid] == target)
            return mid;

        if(target < inputArray[mid])
            return binarySearchRecursion(inputArray, target, start, mid-1);

       
        return binarySearchRecursion(inputArray, target, mid+1, end);
    }
}