package interfaceProject;

public class MainClass {
	public static void main(String[] args) {
		 System.out.println("A Phone");
	        APhone a = new APhone();
	        a.call();
	        a.connect();
	        System.out.println("��ž�� �Ǿ� �ֽ��ϴ�.");
	        System.out.println("--------------------");

	        System.out.println("B Phone");
	        BPhone b = new BPhone();
	        b.call();
	        b.connect();
	        b.remote();
	        System.out.println("--------------------");

	        System.out.println("C Phone");
	        CPhone c = new CPhone();
	        c.call();
	        c.connect();
	        System.out.println("��ž�� �Ǿ� �ֽ��ϴ�.");
	        System.out.println("--------------------");
	    }

	}

