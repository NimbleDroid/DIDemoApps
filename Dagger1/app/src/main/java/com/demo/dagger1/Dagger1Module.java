package com.demo.dagger1;

import com.demo.dagger1.manager.TestManager;
import com.demo.dagger1.manager.TestManager10;
import com.demo.dagger1.manager.TestManager11;
import com.demo.dagger1.manager.TestManager12;
import com.demo.dagger1.manager.TestManager13;
import com.demo.dagger1.manager.TestManager14;
import com.demo.dagger1.manager.TestManager15;
import com.demo.dagger1.manager.TestManager2;
import com.demo.dagger1.manager.TestManager3;
import com.demo.dagger1.manager.TestManager4;
import com.demo.dagger1.manager.TestManager5;
import com.demo.dagger1.manager.TestManager6;
import com.demo.dagger1.manager.TestManager7;
import com.demo.dagger1.manager.TestManager8;
import com.demo.dagger1.manager.TestManager9;
import com.demo.dagger1.test.Test1;
import com.demo.dagger1.test.Test10;
import com.demo.dagger1.test.Test11;
import com.demo.dagger1.test.Test12;
import com.demo.dagger1.test.Test13;
import com.demo.dagger1.test.Test14;
import com.demo.dagger1.test.Test15;
import com.demo.dagger1.test.Test16;
import com.demo.dagger1.test.Test17;
import com.demo.dagger1.test.Test18;
import com.demo.dagger1.test.Test19;
import com.demo.dagger1.test.Test2;
import com.demo.dagger1.test.Test20;
import com.demo.dagger1.test.Test21;
import com.demo.dagger1.test.Test22;
import com.demo.dagger1.test.Test23;
import com.demo.dagger1.test.Test24;
import com.demo.dagger1.test.Test25;
import com.demo.dagger1.test.Test26;
import com.demo.dagger1.test.Test27;
import com.demo.dagger1.test.Test28;
import com.demo.dagger1.test.Test29;
import com.demo.dagger1.test.Test3;
import com.demo.dagger1.test.Test30;
import com.demo.dagger1.test.Test31;
import com.demo.dagger1.test.Test32;
import com.demo.dagger1.test.Test33;
import com.demo.dagger1.test.Test34;
import com.demo.dagger1.test.Test35;
import com.demo.dagger1.test.Test36;
import com.demo.dagger1.test.Test37;
import com.demo.dagger1.test.Test38;
import com.demo.dagger1.test.Test39;
import com.demo.dagger1.test.Test4;
import com.demo.dagger1.test.Test40;
import com.demo.dagger1.test.Test5;
import com.demo.dagger1.test.Test6;
import com.demo.dagger1.test.Test7;
import com.demo.dagger1.test.Test8;
import com.demo.dagger1.test.Test9;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = MainActivity.class
)
public class Dagger1Module {

    @Provides
    public Test1 provideTest1() {
        return new Test1();
    }

    @Provides
    public Test2 provideTest2() {
        return new Test2();
    }

    @Provides
    public Test3 provideTest3() {
        return new Test3();
    }

    @Provides
    public Test4 provideTest4() {
        return new Test4();
    }

    @Provides
    public Test5 provideTest5() {
        return new Test5();
    }

    @Provides
    public Test6 provideTest6() {
        return new Test6();
    }

    @Provides
    public Test7 provideTest7() {
        return new Test7();
    }

    @Provides
    public Test8 provideTest8() {
        return new Test8();
    }

    @Provides
    public Test9 provideTest9() {
        return new Test9();
    }

    @Provides
    public Test10 provideTest10() {
        return new Test10();
    }

    @Provides
    public Test11 provideTest11() {
        return new Test11();
    }

    @Provides
    public Test12 provideTest12() {
        return new Test12();
    }

    @Provides
    public Test13 provideTest13() {
        return new Test13();
    }

    @Provides
    public Test14 provideTest14() {
        return new Test14();
    }

    @Provides
    public Test15 provideTest15() {
        return new Test15();
    }

    @Provides
    public Test16 provideTest16() {
        return new Test16();
    }

    @Provides
    public Test17 provideTest17() {
        return new Test17();
    }

    @Provides
    public Test18 provideTest18() {
        return new Test18();
    }

    @Provides
    public Test19 provideTest19() {
        return new Test19();
    }

    @Provides
    public Test20 provideTest20() {
        return new Test20();
    }

    @Provides
    public Test21 provideTest21() {
        return new Test21();
    }

    @Provides
    public Test22 provideTest22() {
        return new Test22();
    }

    @Provides
    public Test23 provideTest23() {
        return new Test23();
    }

    @Provides
    public Test24 provideTest24() {
        return new Test24();
    }

    @Provides
    public Test25 provideTest25() {
        return new Test25();
    }

    @Provides
    public Test26 provideTest26() {
        return new Test26();
    }

    @Provides
    public Test27 provideTest27() {
        return new Test27();
    }

    @Provides
    public Test28 provideTest28() {
        return new Test28();
    }

    @Provides
    public Test29 provideTest29() {
        return new Test29();
    }

    @Provides
    public Test30 provideTest30() {
        return new Test30();
    }

    @Provides
    public Test31 provideTest31() {
        return new Test31();
    }

    @Provides
    public Test32 provideTest32() {
        return new Test32();
    }

    @Provides
    public Test33 provideTest33() {
        return new Test33();
    }

    @Provides
    public Test34 provideTest34() {
        return new Test34();
    }

    @Provides
    public Test35 provideTest35() {
        return new Test35();
    }

    @Provides
    public Test36 provideTest36() {
        return new Test36();
    }

    @Provides
    public Test37 provideTest37() {
        return new Test37();
    }

    @Provides
    public Test38 provideTest38() {
        return new Test38();
    }

    @Provides
    public Test39 provideTest39() {
        return new Test39();
    }

    @Provides
    public Test40 provideTest40() {
        return new Test40();
    }

    @Provides
    @Singleton
    TestManager provideTestManager(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager2 provideTestManager2(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager2(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager3 provideTestManager3(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager3(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager4 provideTestManager4(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager4(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager5 provideTestManager5(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager5(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager6 provideTestManager6(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager6(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager7 provideTestManager7(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager7(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager8 provideTestManager8(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager8(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager9 provideTestManager9(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager9(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager10 provideTestManager10(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager10(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager11 provideTestManager11(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager11(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager12 provideTestManager12(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager12(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager13 provideTestManager13(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager13(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager14 provideTestManager14(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager14(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

    @Provides
    @Singleton
    TestManager15 provideTestManager15(Test1 test1, Test2 test2, Test3 test3, Test4 test4, Test5 test5, Test6 test6, Test7 test7, Test8 test8, Test9 test9, Test10 test10, Test11 test11, Test12 test12, Test13 test13, Test14 test14, Test15 test15, Test16 test16, Test17 test17, Test18 test18, Test19 test19, Test20 test20, Test21 test21, Test22 test22, Test23 test23, Test24 test24, Test25 test25, Test26 test26, Test27 test27, Test28 test28, Test29 test29, Test30 test30, Test31 test31, Test32 test32, Test33 test33, Test34 test34, Test35 test35, Test36 test36, Test37 test37, Test38 test38, Test39 test39, Test40 test40) {
        return new TestManager15(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40);
    }

}
