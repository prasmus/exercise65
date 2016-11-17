/**
 * Created by opilane on 17.11.2016.
 */
public class exercise65 {
    public static void main(String[] args) {
        boolean flag1 = isHoopy(202);
        boolean flag2 = isFrabjuous(202);
        System.out.println(flag1); //print true
        System.out.println(flag2); // print true
        if (flag1 && flag2) { // flag1 true and flag2 true
            System.out.println("ping!"); //print ping!
        }
        if (flag1 || flag2) { // vähemalt üks flag true
            System.out.println("pong!"); // print pong!
        }
    }
    public static boolean isHoopy(int x) {
        boolean hoopyFlag;
        if (x % 2 == 0) {
            hoopyFlag = true; //returns to main as flag1 true
        } else {
            hoopyFlag = false;
        }
        return hoopyFlag;
    }
    public static boolean isFrabjuous(int x) {
        boolean frabjuousFlag;
        if (x > 0) {
            frabjuousFlag = true; //returns to main as flag2 true
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }
}
