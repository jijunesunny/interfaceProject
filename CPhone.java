package interfaceProject;

public class CPhone implements IFunction.Call, IFunction.Internet {
    public void call() {
        System.out.println("전화 가능합니다.");
	}
    public void connect() {
        System.out.println("가능합니다. 4G입니다.");
    }
 
}
