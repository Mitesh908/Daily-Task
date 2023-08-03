package jj;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
public class demo5{
    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\AbKumar\\Desktop\\assignment\\abc.txt");

        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        int i = dataInputStream.readInt();

        long l = dataInputStream.readLong();

        float f = dataInputStream.readFloat();

        double d = dataInputStream.readDouble();

        System.out.println(i+"  "+l);

        System.out.println(f+"  "+d);

        dataInputStream.close();

        fileInputStream.close();

    }

}
