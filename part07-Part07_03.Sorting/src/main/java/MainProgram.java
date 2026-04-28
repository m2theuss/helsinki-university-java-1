
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, -5, -12, 1, 7, 1, 3, 7, 5};
        
    }
    public static int smallest(int[] array){
        if(array.length > 0){
            int tmp = array[0]; 
            for(int i = 0; i < array.length; i++){
                if(tmp > array[i]){
                    tmp = array[i];
                }
            }
            return tmp;
        }
        return 0;
    }
    public static int indexOfSmallest(int[] array){
        if(array.length > 0){
            int tmp = array[0];
            int position = 0;
            for(int i = 0; i < array.length; i++){
                if(tmp > array[i]){
                    tmp = array[i];
                    position = i;
                }
            }
            return position;
        }
        return 0;
    }  

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        if(table.length > 0){
            int tmp = table[startIndex]; 
            int position = startIndex;
            for(int i = startIndex; i < table.length; i++){
                if(tmp > table[i]){
                    tmp = table[i];
                    position = i;
                }
            }
            return position;
        }
        return 0;
    }
    public static void swap(int[] array, int index1, int index2) {
        int valueIndex1 = array[index1];
        int valueIndex2 = array[index2];

        for(int i = 0; i < array.length; i++){
            if(i == index1){
                array[i] = valueIndex2;
            }else if(i == index2){
                array[i] = valueIndex1;
            }
        }
    }
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++){
            int tmpSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, tmpSmallest);
            System.out.println(array);
        }
    }
}
