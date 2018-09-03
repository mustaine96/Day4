package com.capgemini.Day4;

public class WorkingTV {
	private static boolean state;
	private static int volume;
	private static int channel;
	public WorkingTV() {
		this.state=false;
		this.volume=0;
		this.channel=0;
	}
	public WorkingTV(boolean state, int volume, int channel) {
		this.state=state;
		this.volume=volume;
		this.channel=channel;
	}
	
	public boolean PowerChange(boolean i) {
		state=i;
		return state;
				
		}
			
		
	
	public static int ChangeVolume(int i) {
		volume+=i;
		return volume;
	}
	public int ChangeChannel(int i) {
		if(i<=999 && i>0)
		channel=i;
		else
			channel=0;
		return channel;
	}
	

}

