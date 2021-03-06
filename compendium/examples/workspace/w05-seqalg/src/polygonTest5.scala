object polygonTest5 {
  def main(args: Array[String]): Unit = {
    val pw = new PolygonWindow(200,200)
    var poly = Polygon()

    poly = poly.append((50,50), (100,100), (50,100), (30,50))
    println(poly)
    pw.draw(poly.points)

    poly = poly.insert(2, (100,150))
    println(poly)
    pw.draw(poly.points)

    poly = poly.remove(0)
    println(poly)
    pw.draw(poly.points)
  }
}
