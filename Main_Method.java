/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Main_Method {

    public static void main(String[] args) {
        String inputSKS = JOptionPane.showInputDialog("SKS");
        int sks = Integer.parseInt(inputSKS);
        String inputKodeMatkul = JOptionPane.showInputDialog("Kode Mata Kuliah");
        int kodeMatkul = Integer.parseInt(inputKodeMatkul);
        String mataKuliah = JOptionPane.showInputDialog("Mata Kuliah");
        String inputKode = JOptionPane.showInputDialog("Kode Jurusan");
        int kodeJurusan = Integer.parseInt(inputKode);
        String inputTahun = JOptionPane.showInputDialog("Tahun Ajaran");
        int tahunAjaran = Integer.parseInt(inputTahun);
        String inputSemester = JOptionPane.showInputDialog("Semester");
        int semester = Integer.parseInt(inputSemester);
        String inputKodeLama = JOptionPane.showInputDialog("Kode Lama");
        int kodeMatkulLama = Integer.parseInt(inputKodeLama);
        String inputKodePengganti = JOptionPane.showInputDialog("Kode Pengganti");
        int kodeMatkulPengganti = Integer.parseInt(inputKodePengganti);
        String isiLagi = JOptionPane.showInputDialog("Apakah Anda ingin "
                + "memasukkan data lagi?(Y)Ya;(T)Tidak");

        Method.setSks(sks);
        Method.setKodeMatkul(kodeMatkul);
        System.out.println("SKS \t\t\t : " + Method.getSks());
        System.out.println("Kode Mata Kuliah \t : " + Method.getKodeMatkul());

        Method ob = new Method(mataKuliah);
        ob.tampil("Mata Kuliah \t\t : " + ob.getMataKuliah());
        Method.setKodeJurusan(kodeJurusan);
        System.out.println("Kode Jurusan \t\t : " + Method.getKodeJurusan());

        Method_2 obbb = new Method_2(mataKuliah, tahunAjaran);
        obbb.tampil("Tahun Ajaran \t\t : " + obbb.getTahunAjaran());

        Method_2.setSemester(semester);
        Method_2.setKodeMatkulLama(kodeMatkulLama);
        Method_2.setKodeMatkulPengganti(kodeMatkulPengganti);
        System.out.println("Semester \t\t : " + Method_2.getSemester());
        System.out.println("Kode Matkul Lama \t : " + Method_2.getKodeMatkulLama());
        System.out.println("Kode Matkul Pengganti \t : " + Method_2.getKodeMatkulPengganti());

//        while (true) {
//            if ("Y".equals(isiLagi)) {
//                String inputSKSUlang = JOptionPane.showInputDialog("SKS");
//                int sksUlang = Integer.parseInt(inputSKSUlang);
//                String inputKodeMatkulUlang = JOptionPane.showInputDialog("Kode Mata Kuliah");
//                int kodeMatkulUlang = Integer.parseInt(inputKodeMatkulUlang);
//                String mataKuliahUlang = JOptionPane.showInputDialog("Mata Kuliah");
//                String inputKodeUlang = JOptionPane.showInputDialog("Kode Jurusan");
//                int kodeJurusanUlang = Integer.parseInt(inputKodeUlang);
//                isiLagi = JOptionPane.showInputDialog("Apakah Anda ingin "
//                        + "memasukkan data lagi?(Y)Ya;(T)Tidak");
//                Method.setSks(sksUlang);
//                Method.setKodeMatkul(kodeMatkulUlang);
//                System.out.println("SKS \t\t\t: " + Method.getSks());
//                System.out.println("Kode Mata Kuliah \t: " + Method.getKodeMatkul());
//
//                Method obb = new Method(mataKuliahUlang);
//                obb.tampil("Mata Kuliah \t\t: " + obb.getMataKuliah());
//
//                Method.setKodeJurusan(kodeJurusanUlang);
//                System.out.println("Kode Jurusan \t\t: " + Method.getKodeJurusan());
//            } else if ("T".equals(isiLagi)) {
//                System.exit(0);
//            }
//        }
    }
}
