package state;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Video video=new Video();
		video.setState(new VideoEnLecture());
		video.action();
		video.setState(new VideoEnPause());
		video.action();
		video.setState(new RetourAuDebut());
		video.action();

	}

}
