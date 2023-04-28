public class binarytodecimal {
    public static void bintodec(int binaryno){
        int myno = binaryno;
        int pow=0;
        int dec=0;
        while(binaryno>0){
            int last_digit= binaryno % 10;
            dec= dec + (last_digit * (int) Math.pow(2,pow));
            pow++;
            binaryno=binaryno/10;
        }
        System.out.println("decimal of"+ myno +" ="+dec);
    }


    public static void main(String[] args) {
        bintodec(100);
    }
}
