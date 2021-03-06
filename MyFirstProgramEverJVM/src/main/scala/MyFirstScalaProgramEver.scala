object MyFirstScalaProgramEver {
  def asleep(hour: Int): String =
    message(hour, "asleep")

  def awake(hour: Int): String =
    message(hour, "awake")

  def message(hour: Int, state: String): String =
    s"It's $hour o'clock, so I'm $state"

  def main(args: Array[String]): Unit = {
    val isWorkday = true

    var currentHour = 0 // 12am

    while(currentHour <= 23) {
      if(isWorkday) {
        if(currentHour < 7)
          println(asleep(currentHour))
        else if (currentHour < 23)
          println(awake(currentHour))
        else
          println(asleep(currentHour))
      }
      else {
        if(currentHour < 9)
          println(asleep(currentHour))
        else
          println(awake(currentHour))
      }

      currentHour = currentHour + 1
    }
  }
}
