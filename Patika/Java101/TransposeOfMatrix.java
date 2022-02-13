package Java101;

//hw for https://app.patika.dev/moduller/java101/odev-array-transpose

public class TransposeOfMatrix {

    public static void main(String[] args) {
        int i, j;
        int arr1[][] = { { 2, 3, 4 }, { 5, 6, 4 } };
        int arr2[][] = new int[arr1[0].length][arr1.length];

        System.out.println("Original Matrix\n");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("\n");
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                arr2[j][i] = arr1[i][j];
            }
        }
        System.out.println("Transpose of that Matrix\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println("\n");
        }
    }
}