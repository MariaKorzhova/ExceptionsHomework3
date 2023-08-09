import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Save {
    public static void saveInfo(Human human) {

        String fileName = human.getLastName();
        String fileContents = human.toString();
        File file = new File(fileName +".txt");
        try (FileWriter fw = new FileWriter(new File (fileName +".txt"), file.exists())) {
            fw.write(fileContents +"\n");
            fw.flush();
        }
        catch(IOException e) {
            System.out.println(String.format("Ошибка сохранения, невозможно сохранить файл <%s> с данными <%s>", fileName, fileContents));
        }
    }
}

