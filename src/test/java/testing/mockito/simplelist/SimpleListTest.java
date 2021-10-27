package testing.mockito.simplelist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SimpleListTest {
  @Mock
  List<String> mockedList;

  @Captor
  ArgumentCaptor argumentCaptor;

  @Test
  public void mockedList() {
    mockedList.add("one");
    verify(mockedList).add("one");
    assertEquals(0, mockedList.size());

    when(mockedList.size()).thenReturn(100);
    assertEquals(100, mockedList.size());
  }

  @Test
  public void captorTest() {
    mockedList.add("one");
    verify(mockedList).add("one");
    verify(mockedList).add((String) argumentCaptor.capture());

    assertEquals("one", argumentCaptor.getValue());
    System.out.println(argumentCaptor.getValue());
  }

  @Spy
  List<String> spiedList = new ArrayList<String>();

  @Test
  public void spiedList() {
    spiedList.add("one");
    spiedList.add("two");

    verify(spiedList).add("one");
    verify(spiedList).add("two");
    assertEquals(2, spiedList.size());

    doReturn(100).when(spiedList).size();
    assertEquals(100, spiedList.size());
  }

}
