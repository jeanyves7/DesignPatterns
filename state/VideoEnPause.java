package state;

public class VideoEnPause implements EtatVideo{

	@Override
	public void action(Video context) {
		System.out.println("La vid�o est en pause");	
		
	}
		
}
