package Atividade3;

public class PrincipalFunc {

	public static void main(String[] args) {
		
		Administrador administrador = new Administrador(
				"Beatriz Vieira",
				"B491",
				10000.00,
				"(15) 988130223",
				"Rua Sunanda Aguiar Lisboa- Itapetininga",
				"20/10/2008",
				8990
				);
		Engenheiro engenheiro = new Engenheiro(
				"Julia Maria",
				"J255",
				466084,
				"(15) 998382203",
				"Rua Lazaro- Itapetininga",
				"25/5/2008",
				4266
				);
		
		Medico medico = new Medico(
				"Lucas",
				"L578",
				80000.00,
				"(15) 991820866",
				"Rua - Itapetininga",
				"07/07/2006",
				1234
				);

		System.out.println("ADMINISTRADOR (A)");
		System.out.println(administrador);
		System.out.println("ENGENHEIRO (A)");
		System.out.println(engenheiro);
		System.out.println("MEDICO (A)");
		System.out.println(medico);
	}

}
