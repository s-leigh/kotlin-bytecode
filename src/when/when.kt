fun informalGreetingIf(greeting: String): String {
    return if (greeting == "hello") "hi"
    else if (greeting == "hey bro" || greeting == "what's up")
        throw Error("Greeting already too casual")
    else "yo"
}

fun informalGreetingWhen(greeting: String): String = when(greeting) {
    "hello" -> "hi"
    "hey bro", "what's up" -> throw Error("Greeting already too casual")
    else -> "yo"
}
