package standard.patternadapter;

public class StandardImpl implements Standard {

	@Override
	public void calculer(double nb1, double nb2) {
		double res=0;
		res= nb1*nb2;
		System.out.println("STANDARD KIT : le resultat de produit est "+res);
	}

}
