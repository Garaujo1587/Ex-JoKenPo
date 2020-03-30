package controller;

public class ThreadJoKenPo extends Thread {
	private String jogador1;
	private String jogador2;
	private static int time1 = 0;
	private static int time2 = 0;
	private static int jogo = 0;

	public ThreadJoKenPo(String jogador1, String jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;

	}

	private void Duelo() {
		int vitoria1 = 0;
		int vitoria2 = 0;
		int j1;
		int j2;
		// tesoura = 1;
		// papel = 2;
		// pedra = 3;

		while (vitoria1 < 3 && vitoria2 < 3) {

			try {
				sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			j1 = (int) ((Math.random() * 3) + 1);
			j2 = (int) ((Math.random() * 3) + 1);

			switch (j1) {
			case 1:
				if (j1 == j2) {
					System.out
							.println(jogador1 + " jogou tesoura. " + jogador2 + " jogou tesoura. Resultado = empate\n");
				} else {
					if (j2 == 2) {

						System.out.println(jogador1 + " jogou tesoura. " + jogador2
								+ " jogou papel. Resultado = Vit�ria de " + jogador1 + "\n");
						vitoria1++;
					}
					if (j2 == 3) {

						System.out.println(jogador1 + " jogou tesoura. " + jogador2
								+ " jogou pedra. Resultado = Vit�ria de " + jogador2 + "\n");
						vitoria2++;
					}
				}
				break;
			case 2:
				if (j1 == j2) {
					System.out.println(jogador1 + " jogou papel. " + jogador2 + " jogou papel. Resultado = Empate\n");
				} else {
					if (j2 == 1) {

						System.out.println(jogador1 + " jogou papel. " + jogador2
								+ " jogou tesoura. Resultado = Vit�ria de " + jogador2 + "\n");
						vitoria2++;
					}
					if (j2 == 3) {

						System.out.println(jogador1 + " jogou papel. " + jogador2
								+ " jogou pedra. Resultado = Vit�ria de " + jogador1 + "\n");
						vitoria1++;
					}
				}

				break;
			case 3:
				if (j1 == j2) {
					System.out.println(jogador1 + " jogou pedra. " + jogador2 + " jogou pedra. Resultado = empate\n");
				} else {
					if (j2 == 1) {

						System.out.println(jogador1 + " jogou pedra. " + jogador2
								+ " jogou tesoura. Resultado = Vit�ria de " + jogador1 + "\n");
						vitoria1++;
					}
					if (j2 == 2) {

						System.out.println(jogador1 + " jogou pedra. " + jogador2
								+ " jogou papel. Resultado = Vit�ria de " + jogador2 + "\n");
						vitoria2++;
					}

				}

				break;

			}
		}

		jogo++;
		if (vitoria1 == 3) {
			time1++;
			System.out.println(jogador1 + " ganhou,parab�ns voc� � incrivel \n");

		}
		if (vitoria2 == 3) {
			time2++;
			System.out.println(jogador2 + " ganhou,parab�ns voc� � incrivel \n");

		}

		if (jogo <= 5) {
			if (time1 > time2) {
				System.out.println("Time A est� ganhando, fez " + time1 + " pontos. Time B fez " + time2 + "\n");
			} else {
				System.out.println("Time B est� ganhando, fez " + time2 + " pontos. Time A fez " + time2 + "\n");
			}
		}
	}

	@Override
	public void run() {
		Duelo();
	}
}
