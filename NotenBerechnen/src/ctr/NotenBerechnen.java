package ctr;

import java.util.regex.Pattern;

public class NotenBerechnen {

	public static void main(String[] args) {

		
		
		String noten = "10 FH         27334	English 5 - Technology 2 (B1.1) 	\r\n" + "- \r\n" + "- \r\n"
				+ "3.0  \r\n" + "2.0  \r\n" + "WiSe 18/19 	\r\n" + "PL \r\n" + "1 \r\n" + " 2,0\r\n" + "BE \r\n"
				+ "-  \r\n" + "- \r\n" + "- \r\n" + "10 FH         27335	English 6 - Technology 3 (B1.2) 	\r\n"
				+ "- \r\n" + "- \r\n" + "3.0  \r\n" + "2.0  \r\n" + "SoSe 19 	\r\n" + "PL \r\n" + "1 \r\n"
				+ " 2,0\r\n" + "BE \r\n" + "-  \r\n" + "- \r\n" + "- \r\n"
				+ "10 AIN      10001	Einführung in die Informatik, Übung 	\r\n" + "- \r\n" + "- \r\n"
				+ "2.0  \r\n" + "2.0  \r\n" + "WiSe 18/19 	\r\n" + "SL \r\n" + "1 \r\n" + " \r\n" + "BE \r\n"
				+ "-  \r\n" + "- \r\n" + "- \r\n" + "10 AIN      10002	Programmierung, Praktikum 	\r\n" + "- \r\n"
				+ "- \r\n" + "4.0  \r\n" + "4.0  \r\n" + "WiSe 18/19 	\r\n" + "SL \r\n" + "1 \r\n" + " \r\n"
				+ "BE \r\n" + "-  \r\n" + "- \r\n" + "- \r\n"
				+ "10 AIN      10003	Mathematik für Informatiker 1, Übung 	\r\n" + "- \r\n" + "- \r\n"
				+ "2.0  \r\n" + "2.0  \r\n" + "WiSe 18/19 	\r\n" + "SL \r\n" + "1 \r\n" + " \r\n" + "BE \r\n"
				+ "-  \r\n" + "- \r\n" + "- \r\n" + "10 AIN      20001	Einführung in die Informatik 	\r\n" + "- \r\n"
				+ "- \r\n" + "4.0  \r\n" + "4.0  \r\n" + "WiSe 18/19 	\r\n" + "PL \r\n" + "1 \r\n" + " 2,7\r\n"
				+ "BE \r\n" + "-  \r\n" + "- \r\n" + "- \r\n" + "10 AIN      20002	Informatik-Workshop 	\r\n"
				+ "- \r\n" + "- \r\n" + "6.0  \r\n" + "6.0  \r\n" + "WiSe 18/19 	\r\n" + "PL \r\n" + "1 \r\n"
				+ " 2,0\r\n" + "BE \r\n" + "-  \r\n" + "- \r\n" + "- \r\n" + "10 AIN      20003	Programmierung 	\r\n"
				+ "- \r\n" + "- \r\n" + "2.0  \r\n" + "2.0  \r\n" + "WiSe 18/19 	\r\n" + "PL \r\n" + "1 \r\n"
				+ " 2,7\r\n" + "BE \r\n" + "-  \r\n" + "- \r\n" + "- \r\n"
				+ "10 AIN      20004	Mathematik für Informatiker 1 	\r\n" + "- \r\n" + "- \r\n" + "4.0  \r\n"
				+ "4.0  \r\n" + "WiSe 18/19 	\r\n" + "PL \r\n" + "1 \r\n" + " 1,3\r\n" + "BE \r\n" + "-  \r\n"
				+ "- \r\n" + "- \r\n" + "10 AIN      20005	Lern- und Präsentationstechnik 	\r\n" + "- \r\n" + "- \r\n"
				+ "3.0  \r\n" + "2.0  \r\n" + "WiSe 18/19 	\r\n" + "PL \r\n" + "1 \r\n" + " 1,3\r\n" + "BE \r\n"
				+ "-  \r\n" + "- \r\n" + "- \r\n" + "10 AIN      10004	Datenbanken, Praktikum 	\r\n" + "- \r\n"
				+ "- \r\n" + "4.0  \r\n" + "4.0  \r\n" + "SoSe 19 	\r\n" + "SL \r\n" + "1 \r\n" + " \r\n" + "BE \r\n"
				+ "-  \r\n" + "- \r\n" + "- \r\n" + "10 AIN      10005	Computer Networks, Praktikum 	\r\n" + "- \r\n"
				+ "- \r\n" + "2.0  \r\n" + "2.0  \r\n" + "SoSe 19 	\r\n" + "SL \r\n" + "1 \r\n" + " \r\n" + "BE \r\n"
				+ "-  \r\n" + "- \r\n" + "- \r\n"
				+ "10 AIN      10006	Algorithmen und Datenstrukturen, Praktikum 	\r\n" + "- \r\n" + "- \r\n"
				+ "2.0  \r\n" + "2.0  \r\n" + "SoSe 19 	\r\n" + "SL \r\n" + "1 \r\n" + " \r\n" + "BE \r\n" + "-  \r\n"
				+ "- \r\n" + "- \r\n" + "10 AIN      10007	Mathematik für Informatiker 2, Übung 	\r\n" + "- \r\n"
				+ "- \r\n" + "2.0  \r\n" + "2.0  \r\n" + "SoSe 19 	\r\n" + "SL \r\n" + "1 \r\n" + " \r\n" + "BE \r\n"
				+ "-  \r\n" + "- \r\n" + "- \r\n" + "10 AIN      20006	Datenbanken 	\r\n" + "- \r\n" + "- \r\n"
				+ "2.0  \r\n" + "2.0  \r\n" + "SoSe 19 	\r\n" + "PL \r\n" + "1 \r\n" + " 3,3\r\n" + "BE \r\n"
				+ "-  \r\n" + "- \r\n" + "- \r\n" + "10 AIN      20007	Computernetze 	\r\n" + "- \r\n" + "- \r\n"
				+ "4.0  \r\n" + "4.0  \r\n" + "SoSe 19 	\r\n" + "PL \r\n" + "1 \r\n" + " 2,7\r\n" + "BE \r\n"
				+ "-  \r\n" + "- \r\n" + "- \r\n" + "10 AIN      20008	Algorithmen und Datenstrukturen 	\r\n"
				+ "- \r\n" + "- \r\n" + "4.0  \r\n" + "4.0  \r\n" + "SoSe 19 	\r\n" + "PL \r\n" + "1 \r\n"
				+ " 1,7\r\n" + "BE \r\n" + "-  \r\n" + "- \r\n" + "- \r\n"
				+ "10 AIN      20009	Mathematik für Informatiker 2 	\r\n" + "- \r\n" + "- \r\n" + "4.0  \r\n"
				+ "4.0  \r\n" + "SoSe 19 	\r\n" + "PL \r\n" + "1 \r\n" + " 1,3\r\n" + "BE \r\n" + "-  \r\n" + "- \r\n"
				+ "- \r\n" + "10 AIN      20010	Wissenschaftliches Schreiben und Recherchieren, Seminar 	\r\n"
				+ "- \r\n" + "- \r\n" + "3.0  \r\n" + "2.0  \r\n" + "SoSe 19 	\r\n" + "PL \r\n" + "1 \r\n"
				+ " 1,3\r\n" + "BE \r\n" + "-  \r\n" + "- \r\n" + "- \r\n"
				+ "10 AIN      10008	Software Engineering, Praktikum 	\r\n" + "- \r\n" + "- \r\n" + "3.0  \r\n"
				+ "2.0  \r\n" + "WiSe 19/20 	\r\n" + "SL \r\n" + "1 \r\n" + " \r\n" + "BE \r\n" + "-  \r\n"
				+ "- \r\n" + "- \r\n" + "10 AIN      10009	Automaten und Formale Sprachen, Praktikum 	\r\n" + "- \r\n"
				+ "- \r\n" + "3.0  \r\n" + "2.0  \r\n" + "WiSe 19/20 	\r\n" + "SL \r\n" + "1 \r\n" + " \r\n"
				+ "BE \r\n" + "-  \r\n" + "- \r\n" + "- \r\n"
				+ "10 AIN      10010	Objektorientierte Programmierung, Praktikum 	\r\n" + "- \r\n" + "- \r\n"
				+ "3.0  \r\n" + "2.0  \r\n" + "WiSe 19/20 	\r\n" + "SL \r\n" + "1 \r\n" + " \r\n" + "BE \r\n"
				+ "-  \r\n" + "- \r\n" + "- \r\n" + "10 AIN SWE 10020	User Interfaces, Praktikum 	\r\n" + "- \r\n"
				+ "- \r\n" + "3.0  \r\n" + "2.0  \r\n" + "WiSe 19/20 	\r\n" + "SL \r\n" + "1 \r\n" + " \r\n"
				+ "BE \r\n" + "-  \r\n" + "- \r\n" + "- \r\n"
				+ "10 AIN SWE 10021	Open Source-basierte Softwareentwicklung, Praktikum 	\r\n" + "- \r\n" + "- \r\n"
				+ "3.0  \r\n" + "2.0  \r\n" + "WiSe 19/20 	\r\n" + "SL \r\n" + "1 \r\n" + " \r\n" + "BE \r\n"
				+ "-  \r\n" + "- \r\n" + "- \r\n" + "10 AIN      20011	Software Engineering 	\r\n" + "- \r\n"
				+ "- \r\n" + "3.0  \r\n" + "2.0  \r\n" + "WiSe 19/20 	\r\n" + "PL \r\n" + "1 \r\n" + " \r\n"
				+ "AN \r\n" + "-  \r\n" + "- \r\n" + "- \r\n"
				+ "10 AIN      20012	Automaten und Formale Sprachen 	\r\n" + "- \r\n" + "- \r\n" + "3.0  \r\n"
				+ "2.0  \r\n" + "WiSe 19/20 	\r\n" + "PL \r\n" + "1 \r\n" + " 3,7\r\n" + "BE \r\n" + "-  \r\n"
				+ "- \r\n" + "- \r\n" + "10 AIN      20013	Objektorientierte Programmierung 	\r\n" + "- \r\n"
				+ "- \r\n" + "3.0  \r\n" + "2.0  \r\n" + "WiSe 19/20 	\r\n" + "PL \r\n" + "1 \r\n" + " \r\n"
				+ "AN \r\n" + "-  \r\n" + "- \r\n" + "- \r\n" + "10 AIN SWE 20020	User Interfaces 	\r\n" + "- \r\n"
				+ "- \r\n" + "3.0  \r\n" + "2.0  \r\n" + "WiSe 19/20 	\r\n" + "PL \r\n" + "1 \r\n" + " \r\n"
				+ "AN \r\n" + "-  \r\n" + "- \r\n" + "- \r\n"
				+ "10 AIN SWE 20021	Open Source-basierte Softwareentwicklung 	\r\n" + "- \r\n" + "- \r\n"
				+ "3.0  \r\n" + "2.0  \r\n" + "WiSe 19/20 	\r\n" + "PL \r\n" + "1 \r\n" + " \r\n" + "AN \r\n"
				+ "-  \r\n" + "- \r\n" + "- ";
		
		
		
		int zähler = 0;
		double speicher1 = 0;
		double speicher2 = 0;
		double speicher3 = 0;

		String[] string = new String[noten.length()];

		for (int z = 0; z < noten.length(); z++) {

			String speicher = "" + noten.charAt(z);
			string[z] = speicher.toString();
			// System.out.println(noten.charAt(z));
		}

		String pattern = "^[A-Za-z]*$";

		String pattern1 = "[0-9]";
		String pattern2 = "[,]";

		for (int y = 0; y < string.length; y++) {

			if (!(Pattern.matches(pattern1, string[y])) && !(Pattern.matches(pattern2, string[y]))) {

			} else {
				if (!(string[y].equals(","))) {

					speicher1 = Double.parseDouble(string[y]);

				}

				if ((speicher1 >= 0 && speicher1 < 6)) {

					try {
						if (string[y + 1].equals(",")) {

							speicher2 = Double.parseDouble(string[y + 2]);
							if (speicher2 < 9 && speicher2 >= 0) {

								speicher3 = (speicher3 + (speicher1 + (speicher2 / 10)));
								zähler++;

							}

						}
					} catch (Exception e) {
						System.out.println("Fehler");
					}

				}

			}

		}

		System.out.println(zähler);
		System.out.println(speicher3);

		double ergebnisNote = speicher3 / zähler;
		System.out.println("Durchscnittsnote: " + ergebnisNote);
	}


}
