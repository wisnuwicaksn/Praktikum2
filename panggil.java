public class panggil {
    public static void main(String[] args) {
        Person Anton = new Person();

        Anton.setNama ("Anton");
        Anton.setJenisKelamin("Laki-Laki");
        Anton.setUmur (18);
        System.out.println("Nama : " + Anton.getNama());
        System.out.println("Gender : " + Anton.getJenisKelamin());
        System.out.println("Nama : " + Anton.getUmur());
    
        Person Riko = new Person();

        Riko.setNama ("Riko");
        Riko.setJenisKelamin ("Laki-Laki");
        Riko.setUmur (19);
        System.out.println("Nama : " + Riko.getNama());
        System.out.println("Gender : " + Riko.getJenisKelamin());
        System.out.println("Nama : " + Riko.getUmur());
    }
}