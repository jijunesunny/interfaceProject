package interfaceProject;

public class APhone implements IFunction.Call,IFunction.Internet {
	public void call() {
        System.out.println("��ȭ �����մϴ�.");
    }

    public void connect() {
        System.out.println("�����մϴ�. 3G�Դϴ�.");
    }
}
	

