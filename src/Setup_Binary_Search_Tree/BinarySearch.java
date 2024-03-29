package Setup_Binary_Search_Tree;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] list, int key){
        int low = 0;
        int height = list.length -1;
        while (height>=low){
            int mid = (low+height)/2;
            if(key<list[mid]){
                height = mid-1;
            } else if(key == list[mid]){
                return mid;
            } else {
                low = mid+1;;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,70));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list,59));

    }
}
