package state;

public class VideoEnPause implements EtatVideo{

	@Override
	public void action(Video context) {
		System.out.println("La vidéo est en pause");	
		
	}
		
}
