package datareader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
    // Absolute path: Full path
    // Relative Path: partial path

    //String filePath="G:\\SOFTWARE ENGINEERING\\PROJECTS\\IdeaProjects\\PNT\\LearnJava_WeekendAfternoon_Selenium_NY_Summer2020\\src\\datareader\\Sample.txt";

    public static void main(String[] args) {
        // String filePath="src\\datareader\\Sample.txt";
        String filePath="../LearnJava_WeekendAfternoon_Selenium_NY_Summer2020/src/datareader/Sample.txt";
        readFile(filePath);

    }

    public static void readFile( String filePath){
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader=new FileReader(filePath);
            bufferedReader=new BufferedReader(fileReader);
            String data;
            while ((data=bufferedReader.readLine())!=null){
                System.out.println(data);
            }
        } catch (Exception e){
            //e.printStackTrace();
            System.out.println("File not found Exception");
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            }catch (Exception e){
                //e.printStackTrace();
                System.out.println("Null point Exception and File is Already close");
            }
        }
    }





}
