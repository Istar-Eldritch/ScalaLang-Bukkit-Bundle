package io.ruben.minecraft

import org.bukkit.plugin.java.JavaPlugin
import slick.driver.JdbcProfile

/**
 * Created by istar on 13/09/15.
 */
class Main extends JavaPlugin with ScalaLang {

  override def onEnable(): Unit = {
    System.setProperty("config.file", s"${getDataFolder.getAbsolutePath}/application.conf")
    saveResource("application.conf", false)
  }

  override def onDisable(): Unit = {
    getDb.close()
  }

  override def getDb = DBHandler.db

  override def getDriver = DBHandler.driver
}
