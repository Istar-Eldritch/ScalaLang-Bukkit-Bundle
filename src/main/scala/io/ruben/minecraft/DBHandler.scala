package io.ruben.minecraft

import java.util.logging.Level

import com.typesafe.config.ConfigFactory
import org.bukkit.Bukkit
import slick.driver._

import slick.jdbc.JdbcBackend._

/**
 * Created by istar on 20/09/15.
 */
object DBHandler {
  private[this] val plugin = Bukkit.getPluginManager.getPlugin("ScalaLang")

  val db = Database.forConfig("storage")
  val driver = {
    val conf = ConfigFactory.load()
    val proposedDriver = conf.getString("storage.driver")
    proposedDriver match {
      case "org.h2.Driver" => H2Driver
      case "org.sqlite.JDBC" => SQLiteDriver
      case "com.mysql.jdbc.Driver" => MySQLDriver
      case "org.postgresql.ds.PGSimpleDataSource" => PostgresDriver
    }
  }
}
