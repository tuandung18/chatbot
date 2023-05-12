import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        for (int i = 0; i < 4; i++) {
            String name;
            if(i<2) {
                name = scanner.nextLine();
                System.out.println(name);
            }
            else {
                name = scanner.next();
                System.out.println(name);
            }
        }
    }
}