# system-file-searcher
System File Searcher implemented in Scala

## How to create a scala project

```shell
touch build.sbt && start build.sbt
```

## SBT Intellij Plugin

https://github.com/mpeltonen/sbt-idea

Use the gen-idea sbt task to create Idea project files. When adding new dependencies ,
we should run this command each time.

```shell
sbt gen-idea
```

## SBT Eclipse Plugin

Add `addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.4.0")` to the *plugins.sbt* file

## ScalaTest

http://www.scalatest.org/user_guide/selecting_a_style

Although ScalaTest recommends FlatSpec (BDD Style)

## Scala equality

The `==` checks object equality and not reference equality. For reference the method is .eq .


