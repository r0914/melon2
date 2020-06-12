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
		String actual=ite.translateEng1(14);
		assertThat(actual,is(expected));
	}

	public void translateEng3での値を取得できる() {
		IntToEng ite=new IntToEng();
		String expected="twenty-five";
		String actual=ite.translateEng1(25);
		assertThat(actual,is(expected));
	}

	public void translateEng4での値を取得できる() {
		IntToEng ite=new IntToEng();
		String expected="sixty";
		String actual=ite.translateEng1(60);
		assertThat(actual,is(expected));
	}

}
