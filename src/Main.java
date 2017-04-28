
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command command= new Prender(new ColombiaServer());
		Invoker serverAdmin=new Invoker(command);
		serverAdmin.run();
		System.out.println("");
		Command command2= new Prender(new EspañaServer());
		Invoker serverAdmin2=new Invoker(command2);
		serverAdmin2.run();
	}
}
