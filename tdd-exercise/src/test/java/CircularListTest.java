import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import tdd.CircularList;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {
    private CircularList list;

    @BeforeEach
    public void initializeEmptyList(){
        this.list = new SimpleCircularList();
    }


    @Test
    public void emptyListIsEmpyty() {
        
        assertTrue(list.isEmpty());
    }
    @Test 
    public void AddinList(){
        int i = 1;
        
        list.add(i);
        assertFalse(list.isEmpty());
    }
    @Test 
    public void SizeOfList(){
        this.list.add(1);
        this.list.add(1);

        assertEquals(2, list.size());
    }

}
