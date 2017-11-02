package lv.javaguru.junit.workshop.mock_test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class GreetingTest {
    @Mock
    private Contract contract;
    @InjectMocks
    private Greeting greeting = new Greeting(contract);




@Test
    public void check_Concatination() {
    Mockito.doReturn(" Kim").when(contract).addWord();
    String result = greeting.sayHello();
    assertEquals(result, "hello Kim");
}

}