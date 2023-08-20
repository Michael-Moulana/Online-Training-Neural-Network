
public class Program {
	public static void main(String[] args) {
		double[] y1 = { 0,0,1,1,0,1,0,1 };
		double[] y2 = { 0,1,0,1,0,0,1,1 };
		
		System.out.println("----- START ------");
		
		OnlineTraining OT1 = new OnlineTraining(y1);
		OT1.train();
		
//		OnlineTraining OT2 = new OnlineTraining(y2);
//		OT2.train();

		System.out.println("----- EXITED -----");
	}
	
}
