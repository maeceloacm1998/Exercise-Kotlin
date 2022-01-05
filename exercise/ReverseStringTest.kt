package exercise

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {
    @Test
    fun reverseUsingSB(){
        Assert.assertEquals("olecraM", reverseUsingSB("Marcelo"))
    }

    @Test fun reverseUsingLoop(){
        Assert.assertEquals("oinotnA", reverseUsingLoop("Antonio"))
    }
}