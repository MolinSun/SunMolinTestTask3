package cm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SunMolinTestTask2 {

    @org.junit.Test
    public void RateTest1() throws IllegalArgumentException {
        // partition tested: normalRate >= 0
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest2() throws IllegalArgumentException {
        // partition tested: normalRate >= reducedRate
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(3);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest3() throws IllegalArgumentException {
        // partition tested: normalRate < 0
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(-2);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest4() throws IllegalArgumentException {
        // partition tested: normalRate < reducedRate
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(1);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest5() throws IllegalArgumentException {
        // partition tested: reducedRate >= 0
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(3);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest6() throws IllegalArgumentException {
        // partition tested: reducedRate < 0
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(-2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest7() throws IllegalArgumentException {
        // partition tested: valid normalPeriods
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest8() throws IllegalArgumentException {
        // partition tested: invalid normalPeriods that normal period overlap normal periods
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(10, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest9() throws IllegalArgumentException {
        // partition tested: valid reducedPeriods
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(13, 14);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest10() throws IllegalArgumentException {
        // partition tested: invalid reducedPeriods that reduced period overlap reduced periods
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(19, 21);
        Period period2 = new Period(20, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest11() throws IllegalArgumentException {
        // partition tested: invalid periods that normalPeriods overlap reducedPeriods
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(8, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest12() throws IllegalArgumentException {
        // partition tested: kind == STUDENT
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest13() throws IllegalArgumentException {
        // partition tested: kind == STAFF
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest14() throws IllegalArgumentException {
        // partition tested: kind == MANAGEMENT
        CarParkKind kind = CarParkKind.MANAGEMENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest15() throws IllegalArgumentException {
        // partition tested: kind == VISITOR
        CarParkKind kind = CarParkKind.VISITOR;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest16() throws IllegalArgumentException {
        // Boundary tested(normalRate): 0
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(-1);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(0);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest17() throws IllegalArgumentException {
        // Boundary tested(normalRate): 0
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(0);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(0);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest18() throws IllegalArgumentException {
        // Boundary tested(normalRate): 0
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(1);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(0);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest19() throws IllegalArgumentException {
        // Boundary tested(reducedRate): 0
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(-1);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest20() throws IllegalArgumentException {
        // Boundary tested(reducedRate): 0
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(0);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest21() throws IllegalArgumentException {
        // Boundary tested(reducedRate): 0
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(1);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest22() throws IllegalArgumentException {
        // Partition tested: normalRate == null
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = null;
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest23() throws IllegalArgumentException {
        // Partition tested: reducedRate == null
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = null;

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest24() throws IllegalArgumentException {
        // Partition tested: normalPeriods == null
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(1);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 23);


        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList());
        normalPeriods = null;

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    @org.junit.Test
    public void RateTest25() throws IllegalArgumentException {
        // Partition tested: reducedPeriods == null
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(1);

        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList());
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));
        reducedPeriods = null;

        Rate rate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
    }

    CarParkKind kind = CarParkKind.STUDENT;
    BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
    BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

    Period period1 = new Period(0, 7);
    Period period2 = new Period(19, 24);
    Period period3 = new Period(8, 12);
    Period period4 = new Period(15, 18);

    ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
    ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

    Rate assumeRate = new Rate(kind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);


    @org.junit.Test
    public void calculateTest1() throws IllegalArgumentException {
        // Partition tested: 0 <= startHour <= 24
        assertEquals(new BigDecimal(20), assumeRate.calculate(new Period(8, 12)));
    }

    @org.junit.Test
    public void calculateTest2() throws IllegalArgumentException {
        // Partition tested: startHour < 0
        assumeRate.calculate(new Period(-1, 12));
    }

    @org.junit.Test
    public void calculateTest3() throws IllegalArgumentException {
        // Partition tested: startHour > 24
        assumeRate.calculate(new Period(25, 12));
    }

    @org.junit.Test
    public void calculateTest4() throws IllegalArgumentException {
        // Partition tested: 0 <= startHour <= 24
        assertEquals(new BigDecimal(10), assumeRate.calculate(new Period(10, 12)));
    }

    @org.junit.Test
    public void calculateTest5() throws IllegalArgumentException {
        // Partition tested: startHour > endHour
        assumeRate.calculate(new Period(13, 12));
    }

    @org.junit.Test
    public void calculateTest6() throws IllegalArgumentException {
        // Partition tested: 0 <= endHour <= 24
        assertEquals(new BigDecimal(15), assumeRate.calculate(new Period(9, 12)));
    }

    @org.junit.Test
    public void calculateTest7() throws IllegalArgumentException {
        // Partition tested: endHour < 0
        assumeRate.calculate(new Period(9, -1));
    }

    @org.junit.Test
    public void calculateTest8() throws IllegalArgumentException {
        // Partition tested: endHour >24
        assumeRate.calculate(new Period(9, 25));
    }

    @org.junit.Test
    public void calculateTest9() throws IllegalArgumentException {
        // Boundary tested(startHour): 0
        assumeRate.calculate(new Period(-1, 9));
    }

    @org.junit.Test
    public void calculateTest10() throws IllegalArgumentException {
        // Boundary tested(startHour): 0
        assertEquals(new BigDecimal(19), assumeRate.calculate(new Period(0, 9)));
    }

    @org.junit.Test
    public void calculateTest11() throws IllegalArgumentException {
        // Boundary tested(startHour): 0
        assertEquals(new BigDecimal(17), assumeRate.calculate(new Period(1, 9)));
    }

    @org.junit.Test
    public void calculateTest12() throws IllegalArgumentException {
        // Boundary tested(startHour): 24
        assertEquals(new BigDecimal(2), assumeRate.calculate(new Period(23, 24)));
    }

    @org.junit.Test
    public void calculateTest13() throws IllegalArgumentException {
        // Boundary tested(startHour): 24
        assumeRate.calculate(new Period(24, 24));
    }

    @org.junit.Test
    public void calculateTest14() throws IllegalArgumentException {
        // Boundary tested(startHour): 24
        assumeRate.calculate(new Period(25, 24));
    }

    @org.junit.Test
    public void calculateTest15() throws IllegalArgumentException {
        // Boundary tested(endHour): 0
        assumeRate.calculate(new Period(0, -1));
    }

    @org.junit.Test
    public void calculateTest16() throws IllegalArgumentException {
        // Boundary tested(endHour): 0
        assumeRate.calculate(new Period(0, 0));
    }

    @org.junit.Test
    public void calculateTest17() throws IllegalArgumentException {
        // Boundary tested(endHour): 0
        assertEquals(new BigDecimal(2), assumeRate.calculate(new Period(0, 1)));
    }

    @org.junit.Test
    public void calculateTest18() throws IllegalArgumentException {
        // Boundary tested(endHour): 24
        assumeRate.calculate(new Period(23, 23));
    }

    @org.junit.Test
    public void calculateTest19() throws IllegalArgumentException {
        // Boundary tested(endHour): 24
        assertEquals(new BigDecimal(2), assumeRate.calculate(new Period(23, 24)));
    }

    @org.junit.Test
    public void calculateTest20() throws IllegalArgumentException {
        // Boundary tested(endHour): 24
        assumeRate.calculate(new Period(23, 25));
    }
}


