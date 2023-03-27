package com.rplbo.guided;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.lineSeparator;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    /**
     * Rigorous Test :-)
     */
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void testRupiah(){
        Wallet dw = new DollarWallet();
        dw.insertMoney(new Rupiah(100000)); //6.6
        dw.expenseMoney(new Rupiah(20000)); //1.32
        assertEquals(5.28, dw.getTotalUang());
    }

    @Test
    public void testWon(){
        Wallet dw = new DollarWallet();
        dw.insertMoney(new Won(100000)); //76.95
        dw.expenseMoney(new Won(20000)); //15.39
        assertEquals((61.6), dw.getTotalUang());
    }

    @Test
    public void testDollarWallet(){
        Wallet dw = new DollarWallet();
        dw.insertMoney(new Rupiah(100000)); //6.6
        dw.expenseMoney(new Rupiah(20000)); //1.32
        assertEquals(5.28, dw.getTotalUang());
    }

    @Test
    public void testYen(){
        Wallet dw = new DollarWallet();
        dw.insertMoney(new Yen(100000)); //760.69
        dw.expenseMoney(new Yen(20000)); //152.14
        assertEquals(608.0, dw.getTotalUang());
    }
}
