public class Overload {

    /*  Ketiga method dibawah berada dalam kelas Overload, 
        memiliki nama method yang sama (perkalianPangkatDua) 
        namun memiliki tipe data dan parameter berbeda.
    */
    
    public float perkalianPangkatDua(float angka){
        angka *= angka;
        return angka;
    }
    /*  ^
        Deklarasi method dengan tipe data float
    */

    public double perkalianPangkatDua(double angka){
        angka *= angka;
        return angka;
    }
    /*  ^
        Deklarasi method dengan tipe data double
    */

    public int perkalianPangkatDua(int angka){
        angka *= angka;
        return angka;
    }
    /*  ^
        Deklarasi method dengan tipe data integer
    */
}
