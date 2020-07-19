import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SpeakingClockTest {

  @Test
  public void it_should_return_hour_to_string(){

    SpeakingClock speakingClock = new SpeakingClock();

    String hourInText = speakingClock.transformToString("08:34");
    assertEquals("It's eight thirty four", hourInText);

    assertEquals("It's nine thirty four", speakingClock.transformToString("09:34"));
    assertEquals("It's fourteen five", speakingClock.transformToString("14:05"));
    assertEquals("It's twenty three twenty four", speakingClock.transformToString("23:24"));
  }
}