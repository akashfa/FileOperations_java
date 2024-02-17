import java.io.File;
import java.io.IOException;

class FileCreate{
    public static void main(String[] args) throws IOException {
        File f=new File("akas.txt");
        f.createNewFile();
        System.out.println(f.exists());//true

    }
}