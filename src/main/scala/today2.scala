object today2 extends App {
  def getCityYear(p0:Float, perc:Float, delta:Int, p1:Int):Unit = {
    println("start")
    val years=p0*(perc/100)+delta.toFloat
    if (delta>0 & p0<p1) {
      var i = p0
      do {
        i += years
      } while (i < p1)
      val xvalue = (i - p0) / years
      println(s"Population  reaches $p1 after $xvalue years")}
    else {
      println(s" population decreasing : -1")
    }
  }

  getCityYear(1000,2,50,1200)
  getCityYear(1000,2,-50,1200)
  // this dont work getCityYear(1500000,2.5,10000,2000000)
}
