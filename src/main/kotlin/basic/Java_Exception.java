package basic;

public class Java_Exception {

	public static void main(String[] args) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// 예외 처리
			throw new RuntimeException(e);
		}
	}
}
