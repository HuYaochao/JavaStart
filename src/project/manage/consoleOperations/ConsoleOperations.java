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
                System.out.println("��Ч���룬������������");
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
                System.out.println("�����ֵ������ " + min + " �� " + max + " ֮�䡣");
            }
        }
        return input;
    }

    public String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public int getAgeInput() {
        return getValidatedIntInput("����������: ", 0, 150);
    }

    public int getScoreInput() {
        return getValidatedIntInput("������ɼ�: ", 0, 100);
    }

    public String getGenderInput() {
        String input;
        while (true) {
            input = getStringInput("�������Ա� (��/Ů): ");
            if ("��".equals(input) || "Ů".equals(input)) {
                break;
            } else {
                System.out.println("��Ч���룬������ '��' �� 'Ů'��");
            }
        }
        return input;
    }
}

