class TypeCasting{
    public static void main(String[] args){

        // Implicit conversions (smaller to larger)
        int a= 10;
        double b = a;
        System.out.println("Int to Double: "+ b);

        // Explicit conversions (larger to smaller)
        double c = 10.0;
        int d = (int) c;
        System.out.println("Double to Int: " + d);

        int e = 10;
        double f = e + 0.5;
        System.out.println("Int to Double + 0.5: "+ f);

        // Data loss example
        int largeNum = 130;
        byte byteNum = (byte) largeNum; // Truncation occurs
        System.out.println("Data Loss (int to byte): " + byteNum);

    }
}