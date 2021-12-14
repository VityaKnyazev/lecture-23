package by.itacademy.javaenterprise.knyazev.components;

import org.springframework.stereotype.Component;

@Component
public class Transformer {
	private static final String START = "1HD";
	private static final String END = "HRU";
	
	private String password;
	
	public String transform() {
		return START + password + END;
	}
	
	public String transform(String start, String end, boolean invert) {
		if (start == null || end == null) return transform();
		
		String result = "";
		if (invert) {
			result = end + password + start;
		} else {
			result = start + password + end;
		}
		
		return result;
	}
	
	public void setPassword(String password) {
		if(password != null) {
			this.password = password;
		} else {
			this.password = "PASSWORD";
		}
	}
}
