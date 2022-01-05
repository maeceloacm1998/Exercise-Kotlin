package exercise

import org.junit.Assert
import org.junit.Test

class VowelConsoantTest {
    @Test fun countVowel(){
        Assert.assertEquals(11, countVowel("Quantas vogais tem essa frase?"))
    }

    @Test fun countConsonants(){
        Assert.assertEquals(21, countConsonants("Geralmente em uma frase tem mais consoantes!"))
    }

    @Test fun countVowelAndConsonants(){
        val phrase = "Estou gostando muito de aprender kotlin"

        Assert.assertEquals(15, countVowel(phrase))
        Assert.assertEquals(19, countConsonants(phrase))
    }
}