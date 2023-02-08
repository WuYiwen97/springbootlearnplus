package v;

import java.io.*;

public class SerializableTest {

    private static void serialize(People user) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\111.txt"));
        oos.writeObject(user);
        oos.close();
    }

    private static People deserialize() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\111.txt"));
        return (People) ois.readObject();
    }


    public static void main(String[] args) throws Exception {
        People user = new People();
        user.setName("tyshawn");
        user.setAge(18);
        System.out.println("序列化前的结果: " + user);

        serialize(user);

//        People dUser = deserialize();
//        System.out.println("反序列化后的结果: "+ dUser);
    }
}