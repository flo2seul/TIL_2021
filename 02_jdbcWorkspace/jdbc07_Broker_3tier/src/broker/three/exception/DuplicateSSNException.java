package broker.three.exception;

public class DuplicateSSNException extends Exception {
	public DuplicateSSNException() {
		this("이미 가입된 회원의 ssn입니다.");
	}
	public DuplicateSSNException(String message) {
		super(message);
	}

	
}
