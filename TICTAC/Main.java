public class Main
{
	public static void main(String[] args) throws InterruptedException
	{
		Turno	turno = new Turno();
		TIC		tic = new TIC(turno);
		TAC		tac = new TAC(turno);
		//ponemos tac primero, porque este le tocara esperar
		//todo el proceso de tic
		tac.start();	
		tic.start();
		//Hasta que no terminen los hilos, no imprimo por pantalla
		tic.join();
		tac.join();
		System.out.println("FIN DEL PROGRAMA");
	}
}
