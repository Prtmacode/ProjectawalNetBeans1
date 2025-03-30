package AplikasiGajiKaryawanPTSintory;

import view.FormUtama;

/**
 *
 * @author ASUS
 */
public class AplikasiGajiKaryawanPTSintory {
    private final static FormUtama formUtama = new FormUtama(); // Perbaikan deklarasi variabel
    
    public static void main(String[] args) { // Perbaikan String[] args
        formUtama.setVisible(true); // Perbaikan pemanggilan method
    }
}
