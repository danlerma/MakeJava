public class TIC extends Thread{

	Turno	t;

	public TIC(Turno t) {
		this.t  = t;
		this.setName("TIC");
	}

	public void run()
	{
		for(int i = 0; i < 25; i++)
		{
			try {
				t.coger();
				System.out.println("TIC");
				Thread.sleep(1000);
				t.dejar();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}