package design;


public class Test {

	public static void main(String[] args) {
		
		Light light=new Light();
		Command lightOn=new LightOnCommand(light);
		Remote onButton=new Remote(lightOn);
		onButton.buttonPress();
		
		System.out.println("-----------------------");
		
		Light light1=new Light();
		Command lightOff=new LightOffCommand(light1);
		Remote offButton=new Remote(lightOff);
		offButton.buttonPress();


	}

}