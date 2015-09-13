package io.ruben.minecraft

import org.bukkit.plugin.java.JavaPlugin

/**
 * Created by istar on 13/09/15.
 */
class ScalaLang extends JavaPlugin {

  override def onEnable(): Unit = {
    saveResource("application.conf", false);
    System.setProperty("config.file", s"${getDataFolder.getAbsolutePath}/application.conf")
  }
}
