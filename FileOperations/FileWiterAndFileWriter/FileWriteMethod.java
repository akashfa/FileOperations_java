import java.io.FileWriter;
import java.io.IOException;
class FileWriteMethod{
  public static void main(String[]args) throws IOException{
    FileWriter fw=new FileWriter("abc.txt");
   
    fw.write(9);
    fw.write("\n");
    
    fw.write("nkash Sharma");
    fw.write("\n");

    char[]ch={'h','b','c','d','e'};

    fw.write(ch);
    fw.write("\n");

    fw.flush();
    fw.close();
  }
}