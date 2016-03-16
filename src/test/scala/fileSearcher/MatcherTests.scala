package fileSearcher

import org.scalatest.FlatSpec

/**
 * Test class for System File Searcher implementation
 */
class MatcherTests extends FlatSpec {

  "Matcher that is passed a file matching the filter" should
  "return a list with that file name" in {
    val matcher = new Matcher("fake","fake path")

    val results = matcher.execute()

    assert(results == List("fake path"))
  }

}
