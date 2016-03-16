package fileSearcher

/**
 *
 * Without the val keyword , filter is a private constructor parameter
 *
 * @param filter
 */
class FilterChecker(filter : String) {

  def matches(content : String) = content.contains(filter)

  def findMatchedFiles(fileObjects : List[FileObject]) = {
    for(fileObject <- fileObjects
        if(matches(fileObject.name)))
      yield fileObject
  }
}
