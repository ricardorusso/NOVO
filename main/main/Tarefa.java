package main;

import java.util.TimerTask;

public class Tarefa extends TimerTask {
	private boolean bol ;
	private String imput;


	public boolean isBol() {
		return bol;
	}

	public void setBol(boolean bol) {
		this.bol = bol;
	}

	public String getImput() {
		return imput;
	}

	public void setImput(String imput) {
		this.imput = imput;
	}
	@Override
	public void run() {
		if(getImput() ==null ||getImput().equals("")) {
			System.out.println("sem nada");
			setBol(true);
		}else {
			setBol(false);
			System.out.println(imput);
		}
		
		
	}
}
