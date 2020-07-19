import java.util.HashMap;
import java.util.Map;

public class SpeakingClock {

  private static final String[] num = {
      "",
      " one",
      " two",
      " three",
      " four",
      " five",
      " six",
      " seven",
      " eight",
      " nine",
      " ten",
      " eleven",
      " twelve",
      " thirteen",
      " fourteen",
      " fifteen",
      " sixteen",
      " seventeen",
      " eighteen",
      " nineteen"
  };

  private static final String[] tens = {
      "",
      " ten",
      " twenty",
      " thirty",
      " forty",
      " fifty",
      " sixty",
      " seventy",
      " eighty",
      " ninety"
  };


  public String transformToString(String hours) {

    String[] splitedString = hours.split(":");

    int hour = Integer.parseInt(splitedString[0]);
    int minute = Integer.parseInt(splitedString[1]);

    if(hour == 0){
      return "It's Midnight";
    } else if(hour == 12) {
      return "It's Midday";
    }

    String hourText = numberToString(hour);
    String minuteText = numberToString(minute);


    String result = "It's" + hourText + minuteText ;
    return result;
  }

  private String numberToString(int number) {
    String result;
    if(number <= 19){
      result = num[number];
    } else {
      result = num[number % 10];
      number /= 10;

      result = tens[number % 10] + result;
    }
    return result;
  }
}
