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

Method count: <br>
Roboguice -> 33,190 <br>
Dagger1 -> 23,999 <br>
Dagger2 -> 23,932 <br> <br>

Apps:  <br>
Roboguice: https://www.nimbledroid.com/my_apps/com.demo.roboguice?p=2wJ4kscBlC7tqJ#Summary  <br>
Dagger1:   https://www.nimbledroid.com/my_apps/com.demo.dagger1?p=2wJWWGUMF3h2Tw#Summary <br>
Dagger2:   https://www.nimbledroid.com/my_apps/com.demo.dagger2?p=2wLjnntP4GXyZU#Summary <br>

##### Details

Roboguice: <br>
![Roboguice](https://www.dropbox.com/s/1r6v19mtdrw527o/Screenshot%202016-01-27%2022.03.48.png?dl=1)

<br><br>
Dagger1: <br>
![Dagger1](https://www.dropbox.com/s/1dlg0ggy7xumlmi/Screenshot%202016-01-27%2022.09.27.png?dl=1)

<br><br>
Dagger2: <br>
![Dagger2](https://www.dropbox.com/s/zp9rik6zsc5nx6o/Screenshot%202016-01-27%2022.08.54.png?dl=1)
