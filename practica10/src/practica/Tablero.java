package practica;

import processing.core.PApplet;

public class Tablero extends PApplet {

	private static int ancho;

	public static void main(String[] args) {

		PApplet.main(Tablero.class.getName());
	}

	@Override
	public void settings() {
		
		if (displayWidth > displayHeight) {
			ancho = displayWidth / 2;
		} else {
			ancho = displayHeight / 2;
		}
		
		size(ancho, ancho);
	}

	@Override
	public void setup() {

	}

	@Override
	public void draw() {

		int color = 0;
		for (int l = 0; l < ancho; l += ancho / 8) {

			for (int a = 0; a < ancho; a += ancho / 8) {

				if (color % 2 == 0) {

					fill(0xFFFFFFFF);
				} else {
					fill(0xFF000000);
				}

				rect(a, l, ancho / 8, ancho / 8);
				color++;
			}

			color++;
		}
	}
}