package main;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


class UrinalsTest {

    @Test
    void testOneDummy(){
        System.out.println("====== Arshak Shan == TEST ONE EXECUTED ======");
        assertEquals(1,1);
    }

    @Test
    void testGetStringLength() {
        System.out.println("====== Arshak Shan == TEST TWO EXECUTED ======");
        assertTrue(urinals.goodStringLength("1001000"), "String length is right");
        assertFalse(urinals.goodStringLength("100100000000000000000"), "String length is not right");
        assertFalse(urinals.goodStringLength(""), "String length is not right");
    }

    @Test
    void testGoodString(){
        System.out.println("====== Arshak Shan == TEST THREE EXECUTED ======");
        assertTrue(urinals.goodString("100001"), "valid String");
        assertFalse(urinals.goodString("100011"), "Invalid String");
    }

    @Test
    void testSingleCharString(){
        System.out.println("====== Arshak Shan == TEST FOUR EXECUTED (Single String) ======");
        assertTrue(urinals.goodString("1"), "Valid String");
        assertTrue(urinals.goodString("0"), "Valid String");
    }


    @Test
    void testEmptyInput(){
        System.out.println("====== Arshak Shan == TEST FIVE EXECUTED (Empty String) ======");
        assertTrue(urinals.goodString(""), "Invalid String");
    }

    @Test
    void testFreeUrinals(){
        System.out.println("====== Arshak Shan == TEST SIX EXECUTED (Free urinals output) ======");
        assertEquals(1, urinals.freeUrinals("10001"));
        assertEquals(0, urinals.freeUrinals("1001"));
        assertEquals(3, urinals.freeUrinals("00000"));
        assertEquals(2, urinals.freeUrinals("0000"));
        assertEquals(1, urinals.freeUrinals("01000"));
    }

    @Test
    void testFileExists(){
        System.out.println("====== Arshak Shan == TEST SEVEN EXECUTED (FILE) ======");
        assertEquals(1,urinals.openFile(),"File Found");
    }

    @Test
    void testEmptyFile() throws IOException {
        System.out.println("====== Arshak Shan == TEST EIGHT EXECUTED (Empty FILE) ======");
        urinals.openFile();
        assertEquals(0,urinals.readFile());
    }

    @Test
    void testSuccessful() throws IOException {
        System.out.println("====== Arshak Shan == TEST NINE EXECUTED (FILE not written) ======");
        urinals.openFile();
        urinals.readFile();
        assertEquals(1,urinals.writeFile());
    }


}