val regex = Regex("\\n\\n")
fun String.splitAnswers() = this.split(regex)