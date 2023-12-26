package day9;

public class MusicSystem {
	private String make;
	private String SoundEffect;
	public MusicSystem() {
		
		// TODO Auto-generated constructor stub
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getSoundEffect() {
		return SoundEffect;
	}
	public void setSoundEffect(String soundEffect) {
		SoundEffect = soundEffect;
	}
	public MusicSystem(String make, String soundEffect) {
		super();
		this.make = make;
		SoundEffect = soundEffect;
	}
	@Override
	public String toString() {
		return "MusicSystem [make=" + make + ", SoundEffect=" + SoundEffect + "]";
	}

}
