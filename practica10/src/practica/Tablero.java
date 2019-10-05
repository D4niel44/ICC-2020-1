package practica;

import processing.core.PApplet;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Tablero extends PApplet {

	private static int ancho, largo;

	public static void main(String[] args) {

		PApplet.main(Tablero.class.getName());
	}

	@Override
	public void settings() {
		ancho = Toolkit.getDefaultToolkit().getScreenSize().width / 2;
		largo = Toolkit.getDefaultToolkit().getScreenSize().width / 2;

		size(ancho, largo);
	}

	@Override
	public void setup() {

	}

	@Override
	public void draw() {

		int color = 0;
		for (int l = 0; l < largo; l += largo / 8) {

			for (int a = 0; a < ancho; a += ancho / 8) {

				if (color % 2 == 0) {

					fill(0xFFFFFFFF);
				} else {
					fill(0xFF000000);
				}

				rect(a, l, ancho / 8, largo / 8);
				color++;
			}

			color++;
		}
	}
}