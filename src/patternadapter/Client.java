package patternadapter;

import standard.patternadapter.Standard;

public class Client {
	Standard standard;

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

	public void traitement(double nb1, double nb2) {
		standard.calculer(nb1, nb2);
	}

}
