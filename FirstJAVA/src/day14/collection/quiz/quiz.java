//import java.io.*;
//import java.util.*;
//
//public class CustomerManager {
//    static List<Customer> cusList = new ArrayList<Customer>();
//    static Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        loadMember();
//
//        while (true) {
//            // ... Rest of your code
//        }
//    }
//
//    public static void loadMember() {
//        File f = new File("E:\\develop\\Java\\FirstJAVA\\file\\customerManager.dat"); // Use a different file extension for binary data
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//
//        try {
//            fis = new FileInputStream(f);
//            ois = new ObjectInputStream(fis);
//
//            cusList = (List<Customer>) ois.readObject(); // Deserialize the list
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (ois != null)
//                try {
//                    ois.close();
//                } catch (Exception e2) {
//                }
//        }
//    }
//
//    public static void saveMember() {
//        File f = new File("E:\\develop\\Java\\FirstJAVA\\file\\customerManager.dat"); // Use a different file extension for binary data
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//
//        try {
//            fos = new FileOutputStream(f);
//            oos = new ObjectOutputStream(fos);
//
//            oos.writeObject(cusList); // Serialize the list
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (oos != null)
//                try {
//                    oos.close();
//                } catch (Exception e2) {
//                }
//        }
//    }
//
//    // Rest of your code...
//}
