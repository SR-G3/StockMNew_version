package hrd.sr.team3;
public class Run {
	public static void main(String[] args) throws InterruptedException{
		Stock wr = new Stock();
		Loading l=new Loading();
		l.load.start();
		l.load.join();
		wr.insertProductToDB((int) 1E6);
		wr.selectProductFromDB(1,5);
//		System.out.println(Runtime.getRuntime().freeMemory());

	}

}
