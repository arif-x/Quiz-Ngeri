/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author Lenovo
 */
public class Method {

    private static int sks, kodeMatkul, kodeJurusan;
    private String mataKuliah;    

    protected Method() {
        mataKuliah = null;
    }

    protected Method(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    protected void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
        mataKuliah = null;
    }

    protected String getMataKuliah() {
        return mataKuliah;
    }

    protected static void setKodeMatkul(int kodeMatkul) {
        Method.kodeMatkul = kodeMatkul;
    }

    protected static int getKodeMatkul() {
        return Method.kodeMatkul;
    }
    
    protected static void setSks(int sks) {
        Method.sks = sks;
    }

    protected static int getSks() {
        return Method.sks;
    }
    
    protected static void setKodeJurusan(int kodeJurusan) {
        Method.kodeJurusan = kodeJurusan;
    }

    protected static int getKodeJurusan() {
        return Method.kodeJurusan;
    }

    protected void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    protected void tampil(int a) {
        System.out.println(a);
    }

    protected void hapus() {
        sks = 0;
        mataKuliah = null;
    }

}
