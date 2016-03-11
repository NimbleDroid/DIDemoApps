Every app has large dependency graph. We have `model` package with dummy classes, `test` and `manager` packages with more injections. MainActivity and entry point: `com/nimbledroid/demo/<APP_NAME>/MainActivity.java`

In total we do 5455 injections:

- 4800 model classes (A* .. F*) into Test*
- 600 Test* classes into TestManager*
- 40 Test* classes into MainActivity
- 15 TestManager clases into MainActivity

Demo repository for this post: [http://blog.nimbledroid.com/2016/03/07/performance-of-dependency-injection-libraries.html](http://blog.nimbledroid.com/2016/03/07/performance-of-dependency-injection-libraries.html)
