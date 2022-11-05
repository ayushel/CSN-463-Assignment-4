import java.util.Scanner;
import java.util.Vector;

class first {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of vector.");

        int size = input.nextInt();

        Vector<Integer> vector = new Vector<Integer>(size);

        int counter = 0;

        while (counter < size) {
            System.out.println("If you want to insert value in vector, enter 1; else enter 0.");
            int check = input.nextInt();
            if (check == 0) {
                break;
            } else {
                System.out.println("Enter the element to insert in vector.");
                int element = input.nextInt();
                vector.add(element);
            }
            counter++;
        }
        System.out.println("Elements of vector: ");
        for (Integer element : vector) {
            System.out.print(element + " ");
        }

    }
}