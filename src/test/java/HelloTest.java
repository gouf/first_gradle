import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import sample.Hello;

public class HelloTest {
  @Test
  public void getMessageTest() {
    Hello hello = new Hello();
    assertThat(hello.getMessage(), is("Hello"));
  }

  @Test
  public void createInstanceTest() {
    Hello hello = new Hello();
    String className = hello.getClass().getName();
    assertThat(className, is("sample.Hello"));
  }
}
