package modul6;

public class pc extends komputer implements mouse, keyboard, printer{
    @Override
    void hidupkan_os(){
         System.out.println("Hidupkan PC");
    }
    @Override
    void matikan_os(){
         System.out.println("Matikan OS");
    }
    @Override
    public void klik_kanan(){
         System.out.println("Klik Kanan");
    }
    @Override
    public void klik_kiri(){
         System.out.println("Klik Kiri");
    }
    @Override
    public void tekan_enter(){
         System.out.println("Tekan Enter");
    }
    @Override
    public void cetak_data(){
         System.out.println("Cetak Data");
    }
}