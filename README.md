This is first iteration with very simple graph. 
We have 40 Test classes, like Test1, Test2 ... Test40, and we have 15 TestManagers, 
like TestManager, TestManager2 ... TestManager15.

So we inject: <br>
40 Test classes -> MainActivity <br>
40 Test classes -> TestManager* (in every TestManager) <br>
15 TestManagers -> MainActivity <br> <br>

Even with so simple graph we can see huge difference.

So, time to inject:  <br>
Roboguice -> ~347ms <br>
Dagger1 -> ~71ms <br>
Dagger2 -> ~62ms <br>  <br>

Apps:  <br>
Roboguice: https://www.nimbledroid.com/my_apps/com.demo.roboguice?p=2wJ4kscBlC7tqJ#Summary  <br>
Dagger1:   https://www.nimbledroid.com/my_apps/com.demo.dagger1?p=2wJWWGUMF3h2Tw#Summary <br>
Dagger2:   https://www.nimbledroid.com/my_apps/com.demo.dagger2?p=2wLjnntP4GXyZU#Summary <br>
