package “Ï≥£;
class MyException extends Throwable{
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}
	public String getMessage() {
		return String.format("\"%s\"", Thread.currentThread().getName())+"For input string:"+super.getMessage();
	}
}
public class yichang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
