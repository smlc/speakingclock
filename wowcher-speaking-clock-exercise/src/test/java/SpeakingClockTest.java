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

  @Test
  public void it_should_return_midnight_for_00(){

    SpeakingClock speakingClock = new SpeakingClock();

    String hourInText = speakingClock.transformToString("00:35");
    assertEquals("It's Midnight", hourInText);

  }

  @Test
  public void it_should_return_midday_for_12(){

    SpeakingClock speakingClock = new SpeakingClock();

    String hourInText = speakingClock.transformToString("12:00");
    assertEquals("It's Midday", hourInText);

  }
}