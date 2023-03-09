package oop;

public class lampu {
	
	private String merek;
	private String tipe;
	

	public lampu(String merek, String tipe) {
		this.merek = merek;
		this.tipe = tipe;
	}

	public void nyalakan() {
		System.out.println("menyalakan lampu " + merek  + " " +  tipe + " tekan on.");
	}

	public void matikan() {
		System.out.println("mematikan lampu " + merek + " " +  tipe + " tekan off.");
	}

	public static void main(String[] args) {
		lampu lampukamar = new lampu("philips", "neon" );
		lampukamar.nyalakan();
		lampukamar.matikan();
	}
	
}
			





