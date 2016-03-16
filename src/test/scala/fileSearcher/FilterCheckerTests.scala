package fileSearcher

import org.scalatest.FlatSpec

/**
 * Test class for System File Searcher implementation
 */
class FilterCheckerTests extends FlatSpec{

  "FilterCheckerTests passed a list where one file matches the filter" should
  "return a list with that file" in {
    val matchingFile = new FileObject("match")
    val listOfFiles = List(new FileObject("random"), matchingFile)
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles
    assert(matchedFiles == List(matchingFile))
  }

  "FilterCheckerTests passed a list with a directory that matches the filter" should
    "should not return the directory" in {
    val listOfIOObjects = List(new FileObject("random"),new DirectoryObject("match"))
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfIOObjects
    assert(matchedFiles.length == 0)
  }

}
