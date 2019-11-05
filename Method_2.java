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
public class Method_2 extends Method {

    private static int tahunAjaran, kodeMatkulLama, kodeMatkulPengganti, semester;

    protected Method_2(String mataKuliah, int tahunAjaran) {
        super(mataKuliah);
        this.tahunAjaran = tahunAjaran;
        mataKuliah = null;
    }

    protected int getTahunAjaran() {
        return tahunAjaran;
    }
    
    protected static void setKodeMatkulLama(int kodeMatkulLama) {
        Method_2.kodeMatkulLama = kodeMatkulLama;
    }

    protected static int getKodeMatkulLama() {
        return kodeMatkulLama;
    }
    
    protected static void setKodeMatkulPengganti(int kodeMatkulPengganti) {
        Method_2.kodeMatkulPengganti = kodeMatkulPengganti;
    }

    protected static int getKodeMatkulPengganti() {
        return kodeMatkulPengganti;
    }
    
    protected static void setSemester(int semester) {
        Method_2.semester = semester;
    }

    protected static int getSemester() {
        return semester;
    }
    
    protected void hapus() {
        super.hapus();
    }
}
