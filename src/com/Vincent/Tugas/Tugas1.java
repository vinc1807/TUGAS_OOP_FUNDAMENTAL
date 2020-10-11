package com.Vincent.Tugas;

import java.util.Scanner;

public class Tugas1 {
    private double celcius;
    private double fahrenheit;
    private double kelvin;
    private double reamur;
    private int pilihan;
    private double suhu;
    private boolean valid = false;

    public Tugas1() {
    }

    public void main() {
        System.out.println("~Konversi Suhu~");
        System.out.println("Pilih Suhu Dari : ");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Reamur");
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Pilihan : ");
        this.pilihan = scanner.nextInt();
        System.out.print("Masukan Suhu : ");
        this.suhu = scanner.nextDouble();
    }

    public void konversi() {
        switch(this.pilihan) {
            case 1:
                System.out.println("Konversi : ");
                this.celcius = this.suhu;
                System.out.println("Celcius : " + this.celcius);
                this.fahrenheit = this.suhu * 9.0D / 5.0D + 32.0D;
                System.out.println("Fahrenheit :" + this.fahrenheit);
                this.kelvin = this.suhu + 273.0D;
                System.out.println("Kelvin : " + this.kelvin);
                this.reamur = this.suhu * 4.0D / 5.0D;
                System.out.println("Reamur : " + this.reamur);
                break;
            case 2:
                System.out.println("Konversi : ");
                this.celcius = (this.suhu - 32.0D) * 5.0D / 9.0D;
                System.out.println("Celcius : " + this.celcius);
                this.fahrenheit = this.suhu;
                System.out.println("Fahrenheit :" + this.fahrenheit);
                this.kelvin = (this.suhu - 32.0D) * 5.0D / 9.0D + 273.0D;
                System.out.println("Kelvin : " + this.kelvin);
                this.reamur = (this.suhu - 32.0D) * 4.0D / 9.0D;
                System.out.println("Reamur : " + this.reamur);
                break;
            case 3:
                System.out.println("Konversi : ");
                this.celcius = this.suhu - 273.0D;
                System.out.println("Celcius : " + this.celcius);
                this.fahrenheit = (this.suhu - 273.0D) * 9.0D / 5.0D + 32.0D;
                System.out.println("Fahrenheit :" + this.fahrenheit);
                this.kelvin = this.suhu;
                System.out.println("Kelvin : " + this.kelvin);
                this.reamur = (this.suhu - 273.0D) * 4.0D / 5.0D;
                System.out.println("Reamur : " + this.reamur);
                break;
            case 4:
                System.out.println("Konversi : ");
                this.celcius = this.suhu * 5.0D / 4.0D;
                System.out.println("Celcius : " + this.celcius);
                this.fahrenheit = this.suhu * 9.0D / 4.0D + 32.0D;
                System.out.println("Fahrenheit :" + this.fahrenheit);
                this.kelvin = this.suhu * 5.0D / 4.0D + 273.0D;
                System.out.println("Kelvin : " + this.kelvin);
                this.reamur = this.suhu;
                System.out.println("Reamur : " + this.reamur);
                break;
            default:
                System.out.println("Maaf anda salah ");
        }

    }
}

