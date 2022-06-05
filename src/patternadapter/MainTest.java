package patternadapter;
import standard.patternadapter.AdaptatorByCompositionImpl;
import standard.patternadapter.AdaptatorByHeritageImpl;
import standard.patternadapter.StandardImpl;

public class MainTest {

	public static void main(String[] args) {
		Client client =new Client();
		client.setStandard(new StandardImpl());
		client.traitement(10,5);
		client.setStandard(new AdaptatorByHeritageImpl());
		client.traitement(10,5);
		client.setStandard(new AdaptatorByCompositionImpl());
		client.traitement(10,5);
		

	}

}
