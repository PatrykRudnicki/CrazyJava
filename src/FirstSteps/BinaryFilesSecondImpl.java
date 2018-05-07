package FirstSteps;

import java.io.*;

/**
 * This class has similar implementation as BinaryFiles.java but here I use only methods write and read.
 * You don't need to know an order of values.
 */
public class BinaryFilesSecondImpl {
    public static void main(String[] args) {
        String name = "Patryk";
        int year = 2018;
        double result = 50.0/4;

        String file = "materials/binaryData.txt";

        try{
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));

            //TODO Add some character to separate values
            for(char x : name.toCharArray()){
                dataOutputStream.write(x);
            }
            for(char x : Integer.valueOf(year).toString().toCharArray()){
                dataOutputStream.write(x);
            }
            for(char x : Double.valueOf(result).toString().toCharArray()){
                dataOutputStream.write(x);
            }

            dataOutputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found. Error: " + e);
        } catch(IOException e){
            System.out.println("IO error. Error: " + e);
        }

        try{
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));

            int length = dataInputStream.available();

            byte[] buf = new byte[length];

            dataInputStream.readFully(buf);

            for(byte b : buf)
                System.out.println((char) b);

        } catch(FileNotFoundException e){
            System.out.println("a");
        } catch(IOException e){
            System.out.println("b");
        }
    }
}
