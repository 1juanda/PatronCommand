
public class Prender implements Command {
	
	private IServer servidor;
	public Prender(IServer servidor){
		this.servidor=servidor;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		servidor.prender();
		servidor.conectar();
		servidor.ComprobarConexion();
		servidor.apagar();
	}
	
}
