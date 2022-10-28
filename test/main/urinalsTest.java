package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class urinalsTest {

    @Test
    void testOneDummy(){
        System.out.println("====== Arshak Shan == TEST ONE EXECUTED ======");
        assertEquals(1,1);
    }

    @Test
    void testGetStringLength() {
        System.out.println("====== Arshak Shan == TEST TWO EXECUTED ======");
//        assertTrue(urinals.goodStringLength("100100000000000000000000000000"), "String length is not right");
        assertTrue(urinals.goodStringLength("1001000"), "String length is not right");
    }

    @Test
    void testGoodString(){
        System.out.println("====== Arshak Shan == TEST THREE EXECUTED ======");
        assertTrue(urinals.goodString("100001"), "Invalid String");
    }

    @Test
    void testSingleCharString(){
        System.out.println("====== Arshak Shan == TEST FOUR EXECUTED ======");
        assertTrue(urinals.goodString("1"), "Invalid String");
        assertTrue(urinals.goodString("0"), "Invalid String");
    }



}