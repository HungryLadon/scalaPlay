
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Administrator/Desktop/Playtwo/conf/routes
// @DATE:Wed Jul 26 08:45:13 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
