package com.github.mikegehard

import java.util.*

fun main(args: Array<String>) {
    val wordTypes = listOf("noun", "verb", "adjective", "adverb")

    writeSentence(getWordsFor(wordTypes))
}

fun getWordsFor(wordTypes: List<String>): Map<String, String?> {
    fun getWord(type: String): String? {
        print("Enter a $type: ")
        return readLine()
    }

    fun addWord(words: HashMap<String, String?>, wordType: String): HashMap<String, String?> {
        words.put(wordType, getWord(wordType))
        return words
    }

    return wordTypes.fold(hashMapOf<String, String?>(), ::addWord)
}

fun writeSentence(words: Map<String, String?>) {
    println("Do you ${words["verb"]} your ${words["adjective"]} ${words["noun"]} ${words["adverb"]}? That's hilarious!")
}
