package Q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


	class LifecycleTest {
	    int a = 10;
	    int b = 20;
	    @BeforeAll
	    static void printd(){
	        System.out.println("testing started");
	    }
	    @AfterEach
	    void printc(){
	        System.out.println("test case completed");
	    }
	    @AfterAll
	    static void printall(){
	        System.out.println("Finished");
	    }
	    @BeforeEach
	    void setUp() {
	        System.out.println("Executing test class");
	    }
	    @Test
	    void add() {
	        assertEquals(30,Lifecycle.add(a,b));
	    }

	    @Test
	    void sub() {
	        assertEquals(-10,Lifecycle.sub(a,b));

	    }
	}
	