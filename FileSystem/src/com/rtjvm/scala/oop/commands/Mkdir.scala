package com.rtjvm.scala.oop.commands

import com.rtjvm.scala.oop.files.DirEntry
import com.rtjvm.scala.oop.filesystem.State
import com.rtjvm.scala.oop.files.Directory

class Mkdir(name: String) extends CreateEntry(name) {
  override   def createSpecificEntry(state: State): DirEntry = {
    Directory.empty(state.wd.path, name)
  }

}
