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
        assertTrue(urinals.goodString("10010"), "String length is not right");
    }


}