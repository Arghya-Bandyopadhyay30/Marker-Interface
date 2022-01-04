import java.io.*;
class Test{
	public static void main(String args[])throws Exception{
		Car bmw =new Car("HF167X");

		File f = new File("abc.txt");
		FileOutputStream fout=new FileOutputStream(f);
		ObjectOutputStream out=new ObjectOutputStream(fout);

		out.writeObject(bmw);
		out.flush();

		System.out.println("Success");
		
		
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream in = new ObjectInputStream(fin);
		Car ans = (Car) in.readObject();
		
		System.out.println("Car Number:" + ans.carPlate);
	}
}
