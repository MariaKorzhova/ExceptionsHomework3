public class Main {
    public static void main(String[] args) {
        System.out.println("Введите данные, разделённые пробелом: Фамилия Имя Отчество датарождения номертелефона пол");
        while (true) {
            try {
                Human human = new Human();
                Input.getHuman(human);
                Save.saveInfo(human);
                System.out.println("Информация сохранена");
                break;
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                System.out.println("Введите данные, разделённые пробелом: Фамилия Имя Отчество датарождения номертелефона пол");
            }
        }
    }
}
