package melon2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void translateEng1での値を取得できる() {
		IntToEng ite=new IntToEng();
		String expected="three";
		String actual=ite.translateEng1(3);
		assertThat(actual,is(expected));
	}

	public void translateEng2での値を取得できる() {
		IntToEng ite=new IntToEng();
		String expected="fourteen";
		String actual=ite.translateEng2(14);
		assertThat(actual,is(expected));
	}

	public void translateEng3での値を取得できる() {
		IntToEng ite=new IntToEng();
		String expected="twenty";
		String actual=ite.translateEng3(20);
		assertThat(actual,is(expected));
	}

	public void translateEng4での値を取得できる() {
		IntToEng ite=new IntToEng();
		String expected="one-hundred-fourteen";
		String actual=ite.translateEng4(114);
		assertThat(actual,is(expected));
	}

}
