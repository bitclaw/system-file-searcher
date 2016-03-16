package fileSearcher

/**
 *
 * Without the val keyword , filter is a private constructor parameter
 *
 * @param filter
 */
class FilterChecker(filter : String) {

  def matches(content : String) = content.contains(filter)

  def findMatchedFiles(IOObjects : List[IOObject]) =
    for(iOObject <- IOObjects
        if(iOObject.isInstanceOf[FileObject])
        if(matches(iOObject.name)))
      yield iOObject


  /**
   * This is a companion object since it has the same name as an existing class
   */
  object FilterChecker {
    def apply(filter : String) = new FilterChecker(filter)
  }
}
