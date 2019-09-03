


public class HeyJude {

    public static void main(String[] args) {

	String HEY = "Hey Jude ";
	String DONT = "don't ";

	String BAD = "make it bad";
	String AFRAID = "be afraid";
	String DOWN = "let me down";

	String SAD_SONG = "Take a sad song and make it better";
	String WERE_MADE = "You were made to go out and get her";
	String GET_HER = "You have found her, now go and get her";

	String REMEMBER = "Remember to ";

	String HEART = "let her into your heart";
	String SKIN = "let her under your skin";

	String THEN = "Then you ";

	String START = "can start ";
	String BEGIN = "begin ";

	String MAKE_BETTER = "to make it better";

	String BETTER = "better ";
	String OH = "oh";
	String NA = "na ";

	int contador = 0;
	int contadorAuxiliar = 0;

	while (contador < 7) {

	    if (contador == 0 || (contador % 2) == 1) {

		System.out.print( HEY + DONT );

		if (contador == 0 || contador == 5) {

		    System.out.println( BAD );
		    System.out.println( SAD_SONG );
		}
		if (contador == 1) {

		    System.out.println( AFRAID );
		    System.out.println( WERE_MADE );
		}
		if (contador == 3) {

		    System.out.println( DOWN );
		    System.out.println( GET_HER );
		}

		System.out.print( REMEMBER );

		if (contador == 0 || contador == 3) {

		    System.out.println( HEART );
		}
		if (contador == 1 || contador == 5) {

		    System.out.println( SKIN );
		}

		System.out.print( THEN );

		if (contador == 0 || contador == 3) {

		    System.out.print( START );
		}
		if (contador == 1 || contador == 5) {

		    System.out.print( BEGIN );
		}

		System.out.println( MAKE_BETTER );

		if (contador == 5) {

		    while (contadorAuxiliar < 5) {

			System.out.print( BETTER );
			contadorAuxiliar++;
		    }

		    System.out.println( OH );
		    contadorAuxiliar = 0;
		}
	    }
	    else {
		
		while (contadorAuxiliar < 10) {

		    System.out.print( NA );
		    contadorAuxiliar++;
		}

		if (contador == 6) {

		    System.out.print( HEY );
		}

		System.out.println();
		contadorAuxiliar = 0;
	    }


	    System.out.println();
	    contador++;
	}
    }
}
