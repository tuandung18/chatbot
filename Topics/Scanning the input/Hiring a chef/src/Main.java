import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String[] info = new String[3];
        for (int i = 0; i < 3; i++) {
            info[i] = scanner.nextLine();
        }
        System.out.println("The form for "+info[0]+" is completed. We will contact you if we need a chef who cooks "+ info[2]+" dishes and has "+ info[1] +" years of experience.");
    }
}