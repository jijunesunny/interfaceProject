package interfaceProject;

public class CPhone implements IFunction.Call, IFunction.Internet {
    public void call() {
        System.out.println("��ȭ �����մϴ�.");
	}
    public void connect() {
        System.out.println("�����մϴ�. 4G�Դϴ�.");
    }
 
}
