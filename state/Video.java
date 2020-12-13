package state;

public class Video {
		private EtatVideo etatVideo;
		
		public void setState(EtatVideo newEtat) {
			this.etatVideo=newEtat;
		}
		
		public void action() {
			this.etatVideo.action(this);
		}
}
