package io.ruben.minecraft

import slick.jdbc.JdbcBackend._

/**
 * Created by istar on 20/09/15.
 */
object DBHandler {
  val db = Database.forConfig("storage")
}
