package state;

public class RetourAuDebut implements EtatVideo {

	@Override
	public void action(Video context) {
		System.out.println("Retour au début de la vidéo");
		
	}

}