package standard.patternadapter;

import ancien.patternadapter.AncienImpl;

public class AdaptatorByHeritageImpl extends AncienImpl implements Standard {
	@Override
	public void calculer(double nb1, double nb2) {
		afficher(produit(nb1, nb2));
	}

}
