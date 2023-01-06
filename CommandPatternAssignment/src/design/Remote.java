package design;
public class Remote {
	
	private Command command;
	
	public Remote(Command command) {
		this.command=command;
	}
	
	public void buttonPress() {
		this.command.execute();
	}
	
};
