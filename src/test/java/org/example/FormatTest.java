package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FormatTest {

    @Test
    public void CreateFormatTest() {
        Integer id = 1;
        String label = "Poche";

        Format aFormat = new Book(id, label);
        assertEquals(aFormat.getId(), id);
        assertEquals(aFormat.getLabel(), label);
    }

}
