package swapapp;

public class VariableSwapClass {
    int s1,s2;
     public void swapBirinciYol(int s1,int s2) {
        int s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println("Sayı 1: " + s1 + "\n" +
                "Sayı 2: " + s2 + "\n");

    }
    public void swapIkinciYol(int s1,int s2) {
        s1 = s1 + s2;
        s2 = s1 - s2;
        System.out.println("*******"  + s2);
        s1 = s1 - s2;
        System.out.println("Sayı 1: " + s1 + "\n" +
                "Sayı 2: " + s2 + "\n");
    }
}

