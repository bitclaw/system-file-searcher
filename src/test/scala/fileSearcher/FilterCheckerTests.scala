package fileSearcher

import org.scalatest.FlatSpec
import java.io.File

/**
 * Test class for System File Searcher implementation
 */
class FilterCheckerTests extends FlatSpec{

  "FilterCheckerTests passed a list where one file matches the filter" should
    "return a list with that file" in {
    val matchingFile = FileObject(new File("match"))
    val listOfFiles = List(FileObject(new File("random")), matchingFile)
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles
    assert(matchedFiles == List(matchingFile))
  }

  "FilterCheckerTests passed a list with a directory that matches the filter" should
    "should not return the directory" in {
    val listOfIOObjects = List(FileObject(new File("random")),new DirectoryObject(new File("match")))
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfIOObjects
    assert(matchedFiles.length == 0)
  }

}
