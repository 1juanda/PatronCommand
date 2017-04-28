
public class Conectar implements Command{
	
	private IServer servidor;
	public Conectar(IServer servidor){
		this.servidor=servidor;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		servidor.prender();
		servidor.conectar();
		servidor.apagar();
	}
}
