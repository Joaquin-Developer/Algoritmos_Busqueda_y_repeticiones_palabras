
class Main {

    public static void main(String[] args) {
        
        int array[] = {1, 5, 10, 43, 101, 202};
        int objective = 101;
        final int SIZE_ARRAY = 6;
        System.out.println("Búsqueda binaria por algoritmo recursivo: ");
        printResult(binarySearchRecursive(array, 0, SIZE_ARRAY - 1, objective));
        System.out.println("\n Búsqueda binaria por algoritmo iterativo: ");
        printResult(binarySearchIterative(array, 0, SIZE_ARRAY - 1, objective));
    }

    static void printResult(int result) {
        if (result == -1) 
            System.out.println("El elemento no se ha encontrado");
        else 
            System.out.println("Resultado encontrado en el indice " + result);
    }

    static int binarySearchRecursive(int[] array, int left, int right, int objective ) {
        
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == objective) {
                return mid;
            }
            if (array[mid] > objective) {
                return binarySearchRecursive(array, left, mid - 1, objective);
            } 
            return binarySearchRecursive(array, mid + 1, right, objective);
        }
        return -1;
    }

    static int binarySearchIterative(int[] array, int left, int right, int objective ) {

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == objective) return mid;
            if (array[mid] < objective) 
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

}
