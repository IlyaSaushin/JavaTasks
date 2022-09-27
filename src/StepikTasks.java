import java.util.Scanner;

public class StepikTasks {

    public void TaskOne() {
        Scanner sc = new Scanner(System.in);
        int result = 1;
        boolean flag = true;

        while (flag) {
            String string = sc.next();
            if (string.equals("СТОП")) {
                flag = false;
            } else {
                int num = Integer.parseInt(string.trim());
                if (num != 0) {
                    result *= num;
                }
            }
        }
        if (result == 1) {
            System.out.println("Не найдено");
        } else {
            System.out.println(result);
        }
    }
}
