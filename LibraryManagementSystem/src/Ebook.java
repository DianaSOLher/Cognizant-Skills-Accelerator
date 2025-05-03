import java.util.ArrayList;

public class Ebook extends Book{
    private String fileFormat;
    private double fileSize;

    //Default Constructor
    public Ebook(){
        fileFormat = "";
        fileSize = 0.0;
    }
    //Constructor Parameterized
    public Ebook(String fileFormat, double fileSize){
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    //GETTER & SETTER
    public String getFileFormat(){
        return fileFormat;
    }

    public void setFileFormat(String fileFormat){
        this.fileFormat = fileFormat;
    }

    public double getFileSize(){
        return fileSize;
    }

    public void setFileSize(double fileSize){
        this.fileSize = fileSize;
    }
}
