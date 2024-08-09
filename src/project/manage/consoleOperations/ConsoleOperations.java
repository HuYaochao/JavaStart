package project.manage.consoleOperations;

import java.util.Scanner;

public class ConsoleOperations {
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public int getIntInput(String prompt) {
        int input;
        while (true) {
            try {
                System.out.print(prompt);
                input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("无效输入，请输入整数。");
            }
        }
        return input;
    }

    public int getValidatedIntInput(String prompt, int min, int max) {
        int input;
        while (true) {
            input = getIntInput(prompt);
            if (input >= min && input <= max) {
                break;
            } else {
                System.out.println("输入的值必须在 " + min + " 到 " + max + " 之间。");
            }
        }
        return input;
    }

    public String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public int getAgeInput() {
        return getValidatedIntInput("请输入年龄: ", 0, 150);
    }

    public int getScoreInput() {
        return getValidatedIntInput("请输入成绩: ", 0, 100);
    }

    public String getGenderInput() {
        String input;
        while (true) {
            input = getStringInput("请输入性别 (男/女): ");
            if ("男".equals(input) || "女".equals(input)) {
                break;
            } else {
                System.out.println("无效输入，请输入 '男' 或 '女'。");
            }
        }
        return input;
    }
}

