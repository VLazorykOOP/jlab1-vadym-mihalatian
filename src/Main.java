import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch = 0;
        while (ch != 5) {
            System.out.println(
                    "Please select which task you wish to do:\n1. Task 1\n2. Task 2\n3. Task 3\n4. Task 4\n5. Exit");
            ch = in.nextInt();
            switch (ch) {
                case 1: {
                    System.out.print(
                            "Please select the type of values.\n1. Input data - float type, result - float type;\n" +
                                    "2. Input data - integer type, result - float type;\n3. Input data - float type, result - integer.\n");
                    int t = in.nextInt();
                    switch (t) {
                        case 1: {
                            float x, y, sum;
                            System.out.print("Please enter the values!\nx=");
                            x = in.nextFloat();
                            System.out.print("y=");
                            y = in.nextFloat();
                            System.out.println("x=" + x);
                            System.out.println("y=" + y);
                            sum = (2 * x * x + x * y) / ((x * y) * (x * y))
                                    + (3 * x * y - y * y * y) / (x * x + x * x + 2 * y * y);
                            System.out.println("The result is " + sum);
                            break;
                        }
                        case 2: {
                            int x;
                            int y;
                            int sum;
                            System.out.print("Please enter the values!\nx=");
                            x = in.nextInt();
                            System.out.print("y=");
                            y = in.nextInt();
                            System.out.println("x=" + x);
                            System.out.println("y=" + y);
                            sum = (2 * x * x + x * y) / ((x * y) * (x * y))
                                    + (3 * x * y - y * y * y) / (x * x + x * x + 2 * y * y);
                            System.out.println("The result is " + sum);
                            break;
                        }
                        case 3: {
                            float x;
                            float y;
                            int sum;
                            System.out.print("Please enter the values!\nx=");
                            x = in.nextInt();
                            System.out.print("y=");
                            y = in.nextInt();
                            System.out.println("x=" + x);
                            System.out.println("y=" + y);
                            sum = (int) ((2 * x * x + x * y) / ((x * y) * (x * y))
                                    + (3 * x * y - y * y * y) / (x * x + x * x + 2 * y * y));
                            System.out.println("The result is " + sum);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Please enter k: ");
                    int k = in.nextInt();
                    System.out.println("Plaese enter the size of array: ");
                    int s = in.nextInt();
                    int arr[] = new int[s];
                    System.out.println("Please fll in numbers of array");
                    for (int i = 0; i < s; i++) {
                        System.out.print("a[" + (i + 1) + "] = ");
                        arr[i] = in.nextInt();
                    }
                    System.out.println("Array A:");
                    for (int i = 0; i < s; i++) {
                        System.out.println("a[" + (i + 1) + "] = " + arr[i]);
                    }
                    // System.out.println("Array after shift by " + k + " elements");
                    int n = arr.length;
                    int[] B = new int[n]; // створюємо додатковий масив
                    for (int i = 0; i < n; i++) {
                        B[(i + k) % n] = arr[i]; // копіюємо елементи з A в B з відповідним зсувом
                    }
                    for (int i = 0; i < n; i++) {
                        arr[i] = B[i]; // копіюємо елементи з B в A
                    }
                    System.out.println("Array after shift by " + k + " elements");
                    for (int i = 0; i < s; i++) {
                        System.out.println("a[" + (i + 1) + "] = " + arr[i]);
                    }
                    break;
                }
                case 3: {
                    System.out.print("Please enter the size of Matrix: ");
                    int n = in.nextInt(); // зчитуємо розмір матриці
                    int[][] A = new int[n][n];
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print("a[" + (i + 1) + "]" + "[" + (j + 1) + "] = ");
                            A[i][j] = in.nextInt(); // зчитуємо елементи матриці
                        }
                    }
                    System.out.println("Your Matrix: ");
                    for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < A[i].length; j++) {
                            System.out.print(A[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    int max = A[0][0]; // початкове значення найбільшого елемента
                    boolean found = false; // прапорець, що вказує, чи знайдено елемент, що задовольняє умову
                    double sum = 0; // сума елементів, що задовольняють умову
                    for (int i = 0; i < n; i++) {
                        for (int j = i; j < n; j++) {
                            if (A[i][j] > max) {
                                max = A[i][j]; // оновлюємо значення найбільшого елемента
                            }
                            if (i > j && A[i][j] > max) {
                                found = true;
                                sum += A[i][j]; // додаємо елемент до суми
                            }
                        }
                    }
                    if (!found) {
                        System.out.println(
                                "There are no elements below the main diagonal that exceed the maximum element above the diagonal.");
                    } else {
                        System.out.println(
                                "Sum of elements below the main diagonal that exceed the maximum element above the diagonal: "
                                        + sum);
                    }
                    break;
                }
                case 4: {
                    in.nextLine();
                    System.out.print("Please enter your string: ");
                    String inputText = in.nextLine();

                    String[] words = inputText.split("[\\s.,!?-]+"); // розділяємо текст на слова

                    StringBuilder outputText = new StringBuilder(); // будуємо рядок для вихідного тексту

                    for (String word : words) {
                        if (word.length() % 2 == 0) { // перевіряємо, чи є довжина слова парною
                            outputText.append(word).append(" "); // додаємо слово до вихідного тексту
                        }
                    }

                    System.out.println("Output text: " + outputText.toString().trim()); // виводимо вихідний текст
                    break;
                }
            }

        }
        in.close();
    }
}
