import java.io.*;
class Test{
	public static void main(String args[])throws Exception{
		Car bmw =new Car("HF167X");

		File f = new File("abc.txt");
		FileOutputStream fout=new FileOutputStream("abc.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);

		out.writeObject(bmw);
		out.flush();

		System.out.println("Success");
	}
}
