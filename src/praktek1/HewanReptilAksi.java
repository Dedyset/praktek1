/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek1;

/**
 *
 * @author USER
 */
public class HewanReptilAksi {
    public static void main(String[] args) {
        HewanReptil Cobra = new HewanReptil();
         Cobra.Habitat="Lingkungan hutan tropika";
        Cobra.Warna="Dari hitam atau coklat tua sampai putih-kuning";
        Cobra.Jenis_makanan="Karnivora";
        Cobra.Berbisa="Ya";
        Cobra.Bersisik="Ya";
        
        HewanReptil Buaya = new HewanReptil();
        
        Buaya.Habitat="Perairan tawar seperti sungai, danau, rawa";
        Buaya.Warna="Cokelat, putih, hitam";
        Buaya.Jenis_makanan="Karnivora";
        Buaya.Berbisa="Tidak";
        Buaya.Bersisik="Tidak";
        
        HewanReptil Kadal = new HewanReptil();
        
        Kadal.Habitat="Hidup dipohon dan rerumputan";
        Kadal.Warna="Cokelat, hijau";
        Kadal.Jenis_makanan="Karnivora";
        Kadal.Berbisa="Ya";
        Kadal.Bersisik="Tidak";
        
    }
}
