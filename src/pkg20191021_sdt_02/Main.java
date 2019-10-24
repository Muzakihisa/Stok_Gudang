package pkg20191021_sdt_02;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Stack s = new Stack (100);

	public static void process(String argA)
	{
		if (argA.equals("1"))
		{
			System.out.print("Nama: ");
			s.push(sc.nextLine());
			System.out.println("Berhasil!\n");
		}
		
		else if (argA.equals("2"))
		{
			System.out.println(s.pop() + " telah diangkut"+ "\n");
		}
		
		else System.err.println("Input tidak valid!\n");
		
	}
	
	public static void main(String[] args) {		
		System.out.println("Stok Gudang\n[1] Tambah Stok\n[2] Stok Berikutnya\n");

		while (true)
		{
			System.out.print("> ");
			String userInput = sc.nextLine();
			
			process(userInput);
		}
		
	}

}
