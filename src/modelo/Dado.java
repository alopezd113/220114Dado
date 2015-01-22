package modelo;

import java.util.Random;

public class Dado {

	private int cara;
	private int testAleatorio[] = { 0, 0, 0, 0, 0, 0, 0 };

	public Dado() {

	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public int lanzarDado() {
		Random random = new Random();
		cara = random.nextInt(6) + 1;
		return cara;
	}
	
	public void realizarTest(int numeroTiradas) {
		  
		//poner a cero los contadores
		for (int i=0; i<7; i++) {
			testAleatorio[i] = 0;
		}
		
		
		
		for (int i=0; i<numeroTiradas; i++ ) {
		int tirada = lanzarDado();
		

		
		if (tirada == 1) testAleatorio[1]++;
		if (tirada == 2) testAleatorio[2]++;
		if (tirada == 3) testAleatorio[3]++;
		if (tirada == 4) testAleatorio[4]++;
		if (tirada == 5) testAleatorio[5]++;
		if (tirada == 6) testAleatorio[6]++;
		
		//testAleatorio[tirada]++;
		
		}
		
		for (int i=1; i<7; i++) {
			System.out.println(i + ": ha salido " + testAleatorio[i] + "veces");
		}
	}

}
