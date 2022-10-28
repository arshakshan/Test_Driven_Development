package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class urinalsTest {

    urinals ut = new urinals();

    @Test
    void testOneDummy(){
        System.out.println("====== Arshak Shan == TEST ONE EXECUTED ======");
        assertEquals(1,1);
    }

    @Test
    void testGetStringLength() {
        System.out.println("====== Arshak Shan == TEST TWO EXECUTED ======");
//        assertTrue(urinals.goodStringLength("100100000000000000000000000000"), "String length is not right");
        assertTrue(ut.goodStringLength("1001000"), "String length is not right");
    }

    @Test
    void testGoodString(){
        System.out.println("====== Arshak Shan == TEST THREE EXECUTED ======");
        assertTrue(ut.goodString("100001"), "Invalid String");
    }

    @Test
    void testSingleCharString(){
        System.out.println("====== Arshak Shan == TEST FOUR EXECUTED ======");
        assertTrue(ut.goodString("1"), "Invalid String");
        assertTrue(ut.goodString("0"), "Invalid String");
    }

    @Test
    void testFreeUrinals(){
        System.out.println("====== Arshak Shan == TEST FIVE EXECUTED ======");
        assertEquals(1,ut.freeUrinals("10001"));
        assertEquals(0,ut.freeUrinals("1001"));
        assertEquals(3,ut.freeUrinals("00000"));
        assertEquals(2,ut.freeUrinals("0000"));
        assertEquals(1,ut.freeUrinals("01000"));
    }

}