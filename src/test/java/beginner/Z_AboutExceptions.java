package beginner;

import org.junit.Test;

import java.io.IOException;

import static constant.Constants.__;
import static org.junit.Assert.assertEquals;

public class Z_AboutExceptions {
	
	private void doStuff() throws IOException {
		throw new IOException();
	}
	
	@Test
	public void catchCheckedExceptions() {
		String s;
		try {
			doStuff();
			s = "code ran normally";
		} catch(IOException e) { 
			s = "exception thrown";
		}
		assertEquals(s, "exception thrown");
	}
	
	@Test
	public void useFinally() {
		String s = "";
		try {
			doStuff();
			s += "code ran normally";
		} catch(IOException e) { 
			s += "exception thrown";
		} finally {
			s += " and finally ran as well";
		}
		assertEquals(s, "exception thrown and finally ran as well");
	}
	
}
