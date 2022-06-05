package standard.patternadapter;

import ancien.patternadapter.AncienImpl;

public class AdaptatorByCompositionImpl implements Standard {
AncienImpl ancienKit =new AncienImpl();
	@Override
	public void calculer(double nb1, double nb2) {
		

		ancienKit.afficher(ancienKit.produit(nb1, nb2));
	}

}
