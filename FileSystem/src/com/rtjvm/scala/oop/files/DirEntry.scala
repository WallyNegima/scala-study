package com.rtjvm.scala.oop.files

abstract class DirEntry(val parentPath: String, val name: String) {

  def path: String = {
    val separatorIfNecesary =
      if (Directory.SEPARATOR.equals(parentPath)) ""
      else Directory.SEPARATOR
    parentPath + separatorIfNecesary + name
  }

  def asDirectory: Directory
  def asFile: File

  def isDirectory: Boolean
  def isFile: Boolean
  def getType: String

}
