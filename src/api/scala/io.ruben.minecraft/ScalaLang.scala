package io.ruben.minecraft

import slick.driver.JdbcDriver
import slick.jdbc.JdbcBackend.Database

/**
 * Created by istar on 19/09/15.
 */
trait ScalaLang {
  def getDb: Database
  def getDriver: JdbcDriver
}
