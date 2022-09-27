
public class RemoteControl {
	
	private int channel;
	private int volume;
	
	public RemoteControl() {
		channel=1;
		volume=10;
	}
	
	public void increaseVolume() {
		volume+=1;
	}
	
	public void decreaseVolume() {
		volume-=1;
	}
	public void toChannel(int channel) {
		this.channel=channel;
	}
	public void upChannel() {
		channel+=1;
	}
	public void downChannel() {
		channel-=1;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public int getChannel() {
		return channel;
	}
	public String toString() {
		return "Canal: "+ getChannel()+" Volume: "+getVolume();
	}
}
