public class BMICalculator {

    public static void main(String[] args) {
        // Tetapkan berat badan dalam kilogram
        double beratBadan = 55.0;

        // Tetapkan tinggi badan dalam cm dan konversi ke meter
        double tinggiBadanCm = 172.0;
        double tinggiBadanM = tinggiBadanCm / 100; // Mengubah cm ke m

        // Menghitung BMI
        double bmi = beratBadan / (tinggiBadanM * tinggiBadanM);

        // Menampilkan hasil BMI
        System.out.printf("BMI Anda: %.2f\n", bmi);
        System.out.println("Kategori: " + kategoriBMI(bmi));
    }

    // Fungsi untuk menentukan kategori BMI
    public static String kategoriBMI(double bmi) {
        if (bmi < 18.5) {
            return "Kekurangan berat badan";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 29.9) {
            return "Kelebihan berat badan";
        } else {
            return "Obesitas";
        }
    }
}
