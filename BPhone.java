package interfaceProject;

public class BPhone implements IFunction.Call, IFunction.Internet, IFunction.TVRemote {
    public void call() {
        System.out.println("��ȭ �����մϴ�.");
	}
    public void connect() {
        System.out.println("�����մϴ�. 5G�Դϴ�.");
    }

    public void remote() {
        System.out.println("ž�� �Ǿ� �ֽ��ϴ�.");
    }
}
