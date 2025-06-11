package com.choperzil.util;

import com.choperzil.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        verifyFactorialGivenRightArg0RunsWell();
        verifyFactorialGivenRightArg1RunsWell();
        verifyFactorialGivenRightArg2RunsWell();
        verifyFactorialGivenRightArg3RunsWell();
        verifyFactorialGivenRightArg4RunsWell();
        verifyFactorialGivenRightArg5RunsWell();
        verifyFactorialGivenRightArg6RunsWell();
    }

    //TEST CASE #6: VERIFY THE GETFACTORIAL() WITH N = 6;
    public static void verifyFactorialGivenRightArg6RunsWell() {
        int n = 6;
        long expected = 720; //hy vọng 2 trả về nếu tính 2!
        long actual = MathUtility.getFactorial(n);
        //test là so sánh
        System.out.println("6! = expected: " + expected + ", actual: " + actual);
    }

    //TEST CASE #5: VERIFY THE GETFACTORIAL() WITH N = 5;
    public static void verifyFactorialGivenRightArg5RunsWell() {
        int n = 5;
        long expected = 120; //hy vọng 2 trả về nếu tính 2!
        long actual = MathUtility.getFactorial(n);
        //test là so sánh
        System.out.println("5! = expected: " + expected + ", actual: " + actual);
    }

    //TEST CASE #4: VERIFY THE GETFACTORIAL() WITH N = 4;
    public static void verifyFactorialGivenRightArg4RunsWell() {
        int n = 4;
        long expected = 24; //hy vọng 2 trả về nếu tính 2!
        long actual = MathUtility.getFactorial(n);
        //test là so sánh
        System.out.println("4! = expected: " + expected + ", actual: " + actual);
    }

    //TEST CASE #3: VERIFY THE GETFACTORIAL() WITH N = 3;
    public static void verifyFactorialGivenRightArg3RunsWell() {
        int n = 3;
        long expected = 6; //hy vọng 2 trả về nếu tính 2!
        long actual = MathUtility.getFactorial(n);
        //test là so sánh
        System.out.println("3! = expected: " + expected + ", actual: " + actual);
    }

    //TEST CASE #2: VERIFY THE GETFACTORIAL() WITH N = 2;
    public static void verifyFactorialGivenRightArg2RunsWell() {
        int n = 2;
        long expected = 2; //hy vọng 2 trả về nếu tính 2!
        long actual = MathUtility.getFactorial(n);
        //test là so sánh
        System.out.println("2! = expected: " + expected + ", actual: " + actual);
    }

    //TEST CASE #1: VERIFY THE GETFACTORIAL() WITH N = 1;
    public static void verifyFactorialGivenRightArg1RunsWell() {
        int n = 1;
        long expected = 1; //hy vọng 1 trả về nếu tính 1!
        long actual = MathUtility.getFactorial(n);
        //test là so sánh
        System.out.println("1! = expected: " + expected + ", actual: " + actual);
    }
    //TEST THỬ HÀM TÍNH GIAI THỪA, GỌI TRONG MAIN()
    //MUỐN TEST GÌ ĐÓ THÌ PHẢI CÓ TEST CASE!!!
    //TEST CASE #0: VERIFY THE GETFACTORIAL() WITH N = 0;
    //STEPS:
    //         GIVEN N = 0
    //         CALL getFactorial(n = 0)
    //EXPECTED RESULT:
    //         the method must return 1 as the result of 0! = 1
    //STATUS: PASSED | FAILED PHẢI CHỜ
    public static void verifyFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expected = 1; //hy vọng 1 trả về nếu 0!
        long actual = MathUtility.getFactorial(n);
        //test là so sánh
        System.out.println("0! = expected: " + expected + ", actual: " + actual);
    }
}
//KĨ THUẬT VỪA GÕ CODE, VỪA GÕ TEST CASE, VỪA GÕ TEST RUN, ĐC GỌI LÀ
//TDD (ĐƯA VÀO CV) TEST DRIVEN DEVELOPMENT