package exercise;

import kotlin.text.StringBuilder

fun reverseUsingSB(srt: String): String {
    val sb: StringBuilder = StringBuilder(srt)

    return sb.reverse().toString()
}

fun reverseUsingLoop(srt: String): String {
    val sb = StringBuilder()
    var i = srt.length - 1

    while (i >= 0) {
        sb.append(srt[i])
        i--
    }

    return sb.toString()
}