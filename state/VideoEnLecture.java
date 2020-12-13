package state;


class VideoEnLecture implements EtatVideo {

	@Override
	public void action(Video context) {
		System.out.println("La vidéo est en lecture");
		
	}

}