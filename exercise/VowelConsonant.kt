package exercise

fun countVowel(phrase: String): Int {
    val vowel: String = "aeiou"
    var totalVowel:Int = 0;

    for(letter in phrase){
        if(letter.lowercaseChar() in vowel) totalVowel++
    }

    return totalVowel
}

fun countConsonants(phrase: String): Int {
    val consonants: String = "bcdfghjklmnpqrstvxwyz"
    var totalConsonants:Int = 0;

    for(letter in phrase){
        if(letter.lowercaseChar() in consonants) totalConsonants++
    }

    return totalConsonants
}
