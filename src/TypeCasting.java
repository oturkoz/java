public class TypeCasting {
    public static void main(String[] args) {
        //double doubleNumber = 3.14;
        //int intNumber = (int)doubleNumber;
        //System.out.println(intNumber);

        //int intNumber = 3;
        //double doubleNumber = (double)intNumber;
                                // intNumber double a cevrilecek
        //System.out.println(doubleNumber);

        //char aLetter = 'A';
        //short shortNumber = (short)aLetter;
        //System.out.println(shortNumber);
        //sonuc 65 cunku A nin ASCII degeri 65 (hex degeri 00.41
        //decimal a cevirince 65 oluyor

        //char aLetter = 'A';
        //byte byteNumber = (byte)aLetter;
        //System.out.println(byteNumber);
        //sonuc 65

        //char aLetter = 'Ü';
        //short shortLetter = (short) aLetter;
        //System.out.println(shortLetter);

        //implicit (kucukten buyuge - widening)
        // short aShortNumber = 3333;
        //int anIntNumber = aShortNumber;
        //System.out.println(anIntNumber);

        //explicit (buyukten kucuge - narrowing)
        double aDoubleNumber = 3333.88;
        int anIntNumber = (int) aDoubleNumber;
        System.out.println(anIntNumber);


    }
}
