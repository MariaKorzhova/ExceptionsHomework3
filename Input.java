import java.util.Scanner;

public class Input {
    public static void getHuman(Human human) throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] data = input.split(" ");

        if (data.length != 6) {
            throw new RuntimeException("Введите шесть данных, разделённых пробелом");
        }
        else {
            String lastName = data[0].trim();
            if (lastName.isEmpty())
                throw new RuntimeException("Введите фамилию");
            String firstName = data[1].trim();
            if (firstName.isEmpty())
                throw new RuntimeException("Введите имя");
            String middleName = data[2].trim();
            if (middleName.isEmpty())
                throw new RuntimeException("Введите отчество");
            String birthDate= data[3].trim();
            if (!birthDate.matches("\\d{2}.\\d{2}.\\d{4}")) {
                throw new RuntimeException("Введите дату рождения в формате дд.мм.гггг");
            }
            String phoneNumber = data[4].trim();
            if (!phoneNumber.matches("\\d+")) {
                throw new RuntimeException("Неверный формат номера телефона");
            }
            String gender = data[5].trim();
            if (!gender.equals("m") && !gender.equals("f")) {
                throw new RuntimeException("Неверный формат пола, введите m или f.");
            }
            human.createHuman(lastName, firstName, middleName, birthDate, phoneNumber, gender);
        }
    }
    }
