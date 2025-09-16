package java_HW_0916_2;
import java.util.*;
public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> words = new TreeSet<>();

        while (true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            words.add(input);
        }

        System.out.println("정렬 된 단어 : " + words);
        sc.close();
    }
}
