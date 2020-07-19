package speakingclock;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class SpeakingClockTest {

  @Rule
  public ExpectedException exceptionRule = ExpectedException.none();

  @Test
  public void it_should_return_hour_to_string(){

    SpeakingClock speakingClock = new SpeakingClock();

    String hourInText = speakingClock.transformToString("08:34");
    assertEquals("It's eight thirty four", hourInText);

    assertEquals("It's nine thirty four", speakingClock.transformToString("09:34"));
    assertEquals("It's fourteen five", speakingClock.transformToString("14:05"));
    assertEquals("It's fourteen fifty nine", speakingClock.transformToString("14:59"));
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

  @Test
  public void it_should_throw_exception_if_input_hour_is_invalid_range(){
    SpeakingClock speakingClock = new SpeakingClock();

    exceptionRule.expect(IllegalArgumentException.class);
    exceptionRule.expectMessage("The input number is invalid, enter a valid 24 hour clock number");

    speakingClock.transformToString("25:00");
  }

  @Test
  public void it_should_throw_exception_if_input_hour_is_invalid(){
    SpeakingClock speakingClock = new SpeakingClock();

    exceptionRule.expect(NumberFormatException.class);
    exceptionRule.expectMessage("The input number is invalid, enter a valid 24 hour clock number");

    speakingClock.transformToString("2O:00");
  }
}