1. Membuat class Person :

public class Person {
    private String Nama, JenisKelamin;
    private int Umur;

    public void setNama(String Nama){ 
        this.Nama = Nama;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }
    
    public String getNama() {
        return this.Nama;
    }

    public String getJenisKelamin() {
        return this.JenisKelamin;
    }

    public int getUmur() {
        return this.Umur;
    }
}

2. Membuat class panggil : 

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
}# Praktikum2
# Praktikum2
