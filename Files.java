import java.io.*;

class Files {
    public static void main(String[] args) throws IOException{
        try {
            BufferedReader BR = new BufferedReader(new FileReader("C:\\Users\\CSE-Lab1\\Desktop\\JAVA-CSE24138\\Bhai.txt"));
            String line;  
            while((line = BR.readLine())!= null){
                System.out.println(line);
            }
            BR.close();
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Error ");
        }
    }
}