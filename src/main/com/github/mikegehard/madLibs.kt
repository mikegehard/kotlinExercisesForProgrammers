package com.github.mikegehard

import java.util.*

fun main(args: Array<String>) {
    val wordTypes = listOf(
            "noun", "verb", "adjective", "adverb"
    )

    val receivedWords = getWordsFor(wordTypes)

    println("Do you ${receivedWords["verb"]} your ${receivedWords["adjective"]} ${receivedWords["noun"]} ${receivedWords["adverb"]}? That's hilarious!")
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

