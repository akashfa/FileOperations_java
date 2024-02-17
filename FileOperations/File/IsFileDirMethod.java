import java.io.File;
public class IsFileDirMethod {
    public static void main(String[] args) {
       //Crete file object
        File f=new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\CoreJava\\Collection");
        //Get the list of file
        String[] list=f.list();
        int countFile=0;
        int countDir=0;
        for(String data:list){
            //Creating file object "C:\\.......\\Collection"
            File f1=new File(f,data);
            //Checking whether File Object is "FileType"
            if(f1.isFile()){
                countFile++;
                System.out.println(data);
            }
            //Checking whether File Object is "DirectoryType"
            if(f1.isDirectory()){
                countDir++;
                System.out.println(data);
            }
        }
        System.out.println("Total no of files::"+countFile);
        System.out.println("Total no of directory::"+countDir);
    }
}
