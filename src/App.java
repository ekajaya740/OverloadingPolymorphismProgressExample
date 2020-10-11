public class App {
    public static void main(String[] args) {
        Overload overload = new Overload();
        float angkaFloat = 69.69f;
        double angkaDouble = 69.69d;
        int angkaInteger = 6969;

        System.out.println(overload.perkalianPangkatDua(angkaFloat)); //Mengeluarkan output bertipe data float
        System.out.println(overload.perkalianPangkatDua(angkaDouble)); //Mengeluarkan output bertipe data double
        System.out.println(overload.perkalianPangkatDua(angkaInteger)); //Mengeluarkan output bertipe data integer
    }
}
