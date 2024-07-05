import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalcTest {
    GradeCalc GradeCalc3;
    GradeCalc GradeCalc4;


    @BeforeEach
    public void setUp(){
        GradeCalc3 = new GradeCalc(3);
        GradeCalc4 = new GradeCalc(4);
        GradeCalc4.setCred(4);
    }

    //3Credit

    @Test
    void TestCred3_NonNumberInput(){
        assertEquals("Invalid Input: Non_number Input", GradeCalc3.Calculate("asdfg") );
    }


    @Test
    void TestCred3_NegativeInput(){
        assertEquals("Invalid Input: Negative mark", GradeCalc3.Calculate(-0.0001) );
        assertEquals("Invalid Input: Negative mark", GradeCalc3.Calculate(-30) );
    }



    @Test
    void TestCred3_GradeF_Lo(){
        assertEquals("F", GradeCalc3.Calculate(0) );
        assertEquals("F", GradeCalc3.Calculate(0.1) );
    }
    @Test
    void TestCred3_GradeF_Mid(){
        assertEquals("F", GradeCalc3.Calculate(90) );
        assertEquals("F", GradeCalc3.Calculate(178) );
    }
    @Test
    void TestCred3_GradeF_Hi(){
        assertEquals("F", GradeCalc3.Calculate(178.999) );
        assertEquals("F", GradeCalc3.Calculate(179.000) );
    }
    
    @Test
    void TestCred3_GradeC_Lo(){
        assertEquals("C", GradeCalc3.Calculate(179.001) );
        assertEquals("C", GradeCalc3.Calculate(180) );
    }
    @Test
    void TestCred3_GradeC_Mid(){
        assertEquals("C", GradeCalc3.Calculate(200) );
        assertEquals("C", GradeCalc3.Calculate(208) );
    }
    @Test
    void TestCred3_GradeC_Hi(){
        assertEquals("C", GradeCalc3.Calculate(208.999) );
        assertEquals("C", GradeCalc3.Calculate(209.000) );
    }

    @Test
    void TestCred3_GradeB_Lo(){
        assertEquals("B", GradeCalc3.Calculate(209.001) );
        assertEquals("B", GradeCalc3.Calculate(210) );
    }
    @Test
    void TestCred3_GradeB_Mid(){
        assertEquals("B", GradeCalc3.Calculate(220) );
        assertEquals("B", GradeCalc3.Calculate(238) );
    }
    @Test
    void TestCred3_GradeB_Hi(){
        assertEquals("B", GradeCalc3.Calculate(238.999) );
        assertEquals("B", GradeCalc3.Calculate(239.000) );
    }

    @Test
    void TestCred3_GradeA_Lo() {
        assertEquals("A", GradeCalc3.Calculate(239.001) );
        assertEquals("A", GradeCalc3.Calculate(240) );
    }
    @Test
    void TestCred3_GradeA_Mid() {
        assertEquals("A", GradeCalc3.Calculate(250) );
        assertEquals("A", GradeCalc3.Calculate(299) );
    }
    @Test
    void TestCred3_GradeA_Hi() {
        assertEquals("A", GradeCalc3.Calculate(299.999) );
        assertEquals("A", GradeCalc3.Calculate(300.000) );
    }
    @Test
    void TestCred3_UpperBound() {
        assertEquals("Invalid Input: Exceeds Upper Bound", GradeCalc3.Calculate(300.001) );
        assertEquals("Invalid Input: Exceeds Upper Bound", GradeCalc3.Calculate(305) );
    }

    //4Credit


    @Test
    void TestCred4_NonNumberInput(){
        assertEquals("Invalid Input: Non_number Input", GradeCalc4.Calculate("asdfg") );
    }
    @Test
    void TestCred4_NegativeInput(){
        assertEquals("Invalid Input: Negative mark", GradeCalc4.Calculate(-0.0001) );
        assertEquals("Invalid Input: Negative mark", GradeCalc4.Calculate(-30) );
    }
    
    @Test
    void TestCred4_GradeF_Lo() {
        assertEquals("F", GradeCalc4.Calculate(0) );
        assertEquals("F", GradeCalc4.Calculate(0.1) );
    }
    @Test
    void TestCred4_GradeF_Mid() {
        assertEquals("F", GradeCalc4.Calculate(120) );
        assertEquals("F", GradeCalc4.Calculate(238) );
    }
    @Test
    void TestCred4_GradeF_Hi() {
        assertEquals("F", GradeCalc4.Calculate(238.999) );
        assertEquals("F", GradeCalc4.Calculate(239.000) );
    }
    @Test
    void TestCred4_GradeC_Lo(){
        assertEquals("C", GradeCalc4.Calculate(239.001) );
        assertEquals("C", GradeCalc4.Calculate(240) );
    }
    @Test
    void TestCred4_GradeC_Mid(){
        assertEquals("C", GradeCalc4.Calculate(250) );
        assertEquals("C", GradeCalc4.Calculate(278) );
    }
    @Test
    void TestCred4_GradeC_Hi(){
        assertEquals("C", GradeCalc4.Calculate(278.999) );
        assertEquals("C", GradeCalc4.Calculate(279.000) );
    }

    @Test
    void TestCred4_GradeB_Lo(){
        assertEquals("B", GradeCalc4.Calculate(279.001) );
        assertEquals("B", GradeCalc4.Calculate(280) );
    }
    @Test
    void TestCred4_GradeB_Mid(){
        assertEquals("B", GradeCalc4.Calculate(300) );
        assertEquals("B", GradeCalc4.Calculate(318) );
    }
    @Test
    void TestCred4_GradeB_Hi(){
        assertEquals("B", GradeCalc4.Calculate(318.999) );
        assertEquals("B", GradeCalc4.Calculate(319.000) );
    }


    @Test
    void TestCred4_GradeA_Lo() {
        assertEquals("A", GradeCalc4.Calculate(319.001) );
        assertEquals("A", GradeCalc4.Calculate(320) );
    }
    @Test
    void TestCred4_GradeA_Mid() {
        assertEquals("A", GradeCalc4.Calculate(350) );
        assertEquals("A", GradeCalc4.Calculate(399) );
    }
    @Test
    void TestCred4_GradeA_Hi() {
        assertEquals("A", GradeCalc4.Calculate(399.999) );
        assertEquals("A", GradeCalc4.Calculate(400.000) );
    }
    @Test
    void TestCred4_UpperBound() {
        assertEquals("Invalid Input: Exceeds Upper Bound", GradeCalc4.Calculate(400.001) );
        assertEquals("Invalid Input: Exceeds Upper Bound", GradeCalc4.Calculate(405));
    }

    @AfterEach
    void teardown(){
        GradeCalc3 = null;
        GradeCalc4 = null;
    }

}