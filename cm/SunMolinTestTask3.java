package cm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SunMolinTestTask3 {

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

        CarParkKind kind1 = CarParkKind.VISITOR;
        CarParkKind kind2 = CarParkKind.MANAGEMENT;
        CarParkKind kind3 = CarParkKind.STUDENT;
        CarParkKind kind4 = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = BigDecimal.valueOf(5);
        BigDecimal hourlyReducedRate = BigDecimal.valueOf(2);

        Period period1 = new Period(0, 7);
        Period period2 = new Period(19, 24);
        Period period3 = new Period(8, 12);
        Period period4 = new Period(15, 18);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList(period1, period2));
        ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList(period3, period4));

        Rate rate_visitor = new Rate(kind1, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Rate rate_management = new Rate(kind2, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Rate rate_student = new Rate(kind3, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Rate rate_staff = new Rate(kind4, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);

    @org.junit.Test
    public void VisitorCalculateTest1() throws IllegalArgumentException {
        // Partition tested: 0 <= startHour <= 24
        /**
         * Assume that the total payment is 20.00
         * First 8.00 is free. So 20.00 - 8.00 = 12.00
         * And 50% reduction above 8.00. So 12.00 * 50% = 6.00
         * Finally need to pay 6.00
        */

        //assertEquals(new BigDecimal(20), rate_visitor.calculate(new Period(8, 12)));
        assertEquals(new BigDecimal(6), rate_visitor.calculate(new Period(8, 12)));
    }

    @org.junit.Test
    public void VisitorCalculateTest2() throws IllegalArgumentException {
        // Partition tested: startHour < 0
        rate_visitor.calculate(new Period(-1, 12));
    }

    @org.junit.Test
    public void VisitorCalculateTest3() throws IllegalArgumentException {
        // Partition tested: startHour > 24
        rate_visitor.calculate(new Period(25, 12));
    }

    @org.junit.Test
    public void VisitorCalculateTest4() throws IllegalArgumentException {
        // Partition tested: 0 <= startHour <= 24
        /**
         *Assume that  the total payment is 10
         * First 8.00 is free. So 10.00 - 8.00 = 2.00
         * And 50% reduction above 8.00. So 2.00 * 50% = 1.00
         * Finally need to pay 1.00
        */
         assertEquals(new BigDecimal(1), rate_visitor.calculate(new Period(10, 12)));
    }

    @org.junit.Test
    public void VisitorCalculateTest5() throws IllegalArgumentException {
        // Partition tested: startHour > endHour
        rate_visitor.calculate(new Period(13, 12));
    }

    @org.junit.Test
    public void VisitorCalculateTest6() throws IllegalArgumentException {
        // Partition tested: 0 <= endHour <= 24
        /**
         *Assume that  the total payment is 15.00
         * First 8.00 is free. So 15.00 - 8.00 = 7.00
         * And 50% reduction above 8.00. So 7.00 * 50% = 3.50
         * Finally need to pay 3.50
         */
        assertEquals(new BigDecimal(3.5), rate_visitor.calculate(new Period(9, 12)));
    }

    @org.junit.Test
    public void VisitorCalculateTest7() throws IllegalArgumentException {
        // Partition tested: endHour < 0
        rate_visitor.calculate(new Period(9, -1));
    }

    @org.junit.Test
    public void VisitorCalculateTest8() throws IllegalArgumentException {
        // Partition tested: endHour >24
        rate_visitor.calculate(new Period(9, 25));
    }

    @org.junit.Test
    public void VisitorCalculateTest9() throws IllegalArgumentException {
        // Boundary tested(startHour): 0
        rate_visitor.calculate(new Period(-1, 9));
    }

    @org.junit.Test
    public void VisitorCalculateTest10() throws IllegalArgumentException {
        // Boundary tested(startHour): 0
        /**
         *Assume that  the total payment is 19
         * First 8.00 is free. So 19.00 - 8.00 = 11.00
         * And 50% reduction above 8.00. So 11.00 * 50% = 5.50
         * Finally need to pay 5.50
         */
        assertEquals(new BigDecimal(5.50), rate_visitor.calculate(new Period(0, 9)));
    }

    @org.junit.Test
    public void VisitorCalculateTest11() throws IllegalArgumentException {
        // Boundary tested(startHour): 0
        /**
         *Assume that  the total payment is 17
         * First 8.00 is free. So 17.00 - 8.00 = 9.00
         * And 50% reduction above 8.00. So 9.00 * 50% = 4.50
         * Finally need to pay 4.50
         */
        assertEquals(new BigDecimal(4.5), rate_visitor.calculate(new Period(1, 9)));
    }

    @org.junit.Test
    public void VisitorCalculateTest12() throws IllegalArgumentException {
        // Boundary tested(startHour): 24
        /**
         *Assume that  the total payment is 2
         * First 8.00 is free. So the driver don't need to pay
         */
        assertEquals(new BigDecimal(0), rate_visitor.calculate(new Period(23, 24)));
    }

    @org.junit.Test
    public void VisitorCalculateTest13() throws IllegalArgumentException {
        // Boundary tested(startHour): 24
        rate_visitor.calculate(new Period(24, 24));
    }

    @org.junit.Test
    public void VisitorCalculateTest14() throws IllegalArgumentException {
        // Boundary tested(startHour): 24
        rate_visitor.calculate(new Period(25, 24));
    }

    @org.junit.Test
    public void VisitorCalculateTest15() throws IllegalArgumentException {
        // Boundary tested(endHour): 0
        rate_visitor.calculate(new Period(0, -1));
    }

    @org.junit.Test
    public void VisitorCalculateTest16() throws IllegalArgumentException {
        // Boundary tested(endHour): 0
        rate_visitor.calculate(new Period(0, 0));
    }

    @org.junit.Test
    public void VisitorCalculateTest17() throws IllegalArgumentException {
        // Boundary tested(endHour): 0
        /**
         *Assume that  the total payment is 2
         * First 8.00 is free. So the driver don't need to pay
         */
        assertEquals(new BigDecimal(0), rate_visitor.calculate(new Period(0, 1)));
    }

    @org.junit.Test
    public void VisitorCalculateTest18() throws IllegalArgumentException {
        // Boundary tested(endHour): 24
        rate_visitor.calculate(new Period(23, 23));
    }

    @org.junit.Test
    public void VisitorCalculateTest19() throws IllegalArgumentException {
        // Boundary tested(endHour): 24
        /**
         *Assume that  the total payment is 2
         * First 8.00 is free. So the driver don't need to pay
         */
        assertEquals(new BigDecimal(0), rate_visitor.calculate(new Period(23, 24)));
    }

    @org.junit.Test
    public void VisitorCalculateTest20() throws IllegalArgumentException {
        // Boundary tested(endHour): 24
        rate_visitor.calculate(new Period(23, 25));
    }

    @org.junit.Test
    public void ManagementCalculateTest1() throws IllegalArgumentException {
        // Partition tested: 0 <= startHour <= 24

        assertEquals(new BigDecimal(20), rate_management.calculate(new Period(8, 12)));

    }

    @org.junit.Test
    public void ManagementCalculateTest2() throws IllegalArgumentException {
        // Partition tested: startHour < 0
        rate_management.calculate(new Period(-1, 12));
    }

    @org.junit.Test
    public void ManagementCalculateTest3() throws IllegalArgumentException {
        // Partition tested: startHour > 24
        rate_management.calculate(new Period(25, 12));
    }

    @org.junit.Test
    public void ManagementCalculateTest4() throws IllegalArgumentException {
        // Partition tested: 0 <= startHour <= 24

        assertEquals(new BigDecimal(10), rate_management.calculate(new Period(10, 12)));
    }

    @org.junit.Test
    public void ManagementCalculateTest5() throws IllegalArgumentException {
        // Partition tested: startHour > endHour
        rate_management.calculate(new Period(13, 12));
    }

    @org.junit.Test
    public void ManagementCalculateTest6() throws IllegalArgumentException {
        // Partition tested: 0 <= endHour <= 24

        assertEquals(new BigDecimal(15), rate_management.calculate(new Period(9, 12)));
    }

    @org.junit.Test
    public void ManagementCalculateTest7() throws IllegalArgumentException {
        // Partition tested: endHour < 0
        rate_management.calculate(new Period(9, -1));
    }

    @org.junit.Test
    public void ManagementCalculateTest8() throws IllegalArgumentException {
        // Partition tested: endHour >24
        rate_management.calculate(new Period(9, 25));
    }

    @org.junit.Test
    public void ManagementCalculateTest9() throws IllegalArgumentException {
        // Boundary tested(startHour): 0
        rate_management.calculate(new Period(-1, 9));
    }

    @org.junit.Test
    public void ManagementCalculateTest110() throws IllegalArgumentException {
        // Boundary tested(startHour): 0

        assertEquals(new BigDecimal(19), rate_management.calculate(new Period(0, 9)));
    }

    @org.junit.Test
    public void ManagementCalculateTest111() throws IllegalArgumentException {
        // Boundary tested(startHour): 0

        assertEquals(new BigDecimal(17), rate_management.calculate(new Period(1, 9)));
    }

    @org.junit.Test
    public void ManagementCalculateTest12() throws IllegalArgumentException {
        // Boundary tested(startHour): 24
        /**
         * For original specification, the driver need to pay 2.00
         * But For management, the minimum payable is 3.00
         * So the driver need to pay 3.00
         */
        assertEquals(new BigDecimal(3), rate_management.calculate(new Period(23, 24)));
    }

    @org.junit.Test
    public void ManagementCalculateTest13() throws IllegalArgumentException {
        // Boundary tested(startHour): 24
        rate_management.calculate(new Period(24, 24));
    }

    @org.junit.Test
    public void ManagementCalculateTest14() throws IllegalArgumentException {
        // Boundary tested(startHour): 24
        rate_management.calculate(new Period(25, 24));
    }

    @org.junit.Test
    public void ManagementCalculateTest15() throws IllegalArgumentException {
        // Boundary tested(endHour): 0
        rate_management.calculate(new Period(0, -1));
    }

    @org.junit.Test
    public void ManagementCalculateTest16() throws IllegalArgumentException {
        // Boundary tested(endHour): 0
        rate_management.calculate(new Period(0, 0));
    }

    @org.junit.Test
    public void ManagementCalculateTest17() throws IllegalArgumentException {
        // Boundary tested(endHour): 0
        /**
         * For original specification, the driver need to pay 2.00
         * But For management, the minimum payable is 3.00
         * So the driver need to pay 3.00
         */
        assertEquals(new BigDecimal(3), rate_management.calculate(new Period(0, 1)));
    }

    @org.junit.Test
    public void ManagementCalculateTest18() throws IllegalArgumentException {
        // Boundary tested(endHour): 24
        rate_management.calculate(new Period(23, 23));
    }

    @org.junit.Test
    public void ManagementCalculateTest19() throws IllegalArgumentException {
        // Boundary tested(endHour): 24
        /**
         * For original specification, the driver need to pay 2.00
         * But For management, the minimum payable is 3.00
         * So the driver need to pay 3.00
         */
        assertEquals(new BigDecimal(3), rate_management.calculate(new Period(23, 24)));
    }

    @org.junit.Test
    public void ManagementCalculateTest20() throws IllegalArgumentException {
        // Boundary tested(endHour): 24
        rate_management.calculate(new Period(23, 25));
    }
}


