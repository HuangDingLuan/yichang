package �쳣;
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
class MyTool{
	public static int ParseInt(String str) throws MyException{
		int result=0;
		int i;
		for(i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			result=result*10+ch-'0';
			if(ch>='0'&&ch<='9')result=result*10+ch-'0';
			else throw new MyException(str);
		}
		return result;
	}
}
public class yichang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(MyTool.ParseInt("\"345a\""));
		}catch(MyException e) {
			e.printStackTrace();
		}

	}

}
