package interfaceProject;

public class BPhone implements IFunction.Call, IFunction.Internet, IFunction.TVRemote {
    public void call() {
        System.out.println("전화 가능합니다.");
	}
    public void connect() {
        System.out.println("가능합니다. 5G입니다.");
    }

    public void remote() {
        System.out.println("탑재 되어 있습니다.");
    }
}
