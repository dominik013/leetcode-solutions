import java.io.File
import java.lang.StringBuilder

fun main() {
    val directoryPath = "C:\\Users\\DominikReichinger\\Downloads\\Photos (1)"
    val resultJson = "C:\\Users\\DominikReichinger\\Downloads\\img_paths.json"
    val directory = File(directoryPath)
    val result = File(resultJson)
    val files = directory.listFiles()
    val json = StringBuilder("{\n" + "\t\"img_paths\": [\n")

    if (files != null) {
        for (i in files.indices) {
            json.append("\t\t\"img/${files[i].name}\"")

            if (i != files.size - 1) {
                json.append(",\n")
            }
        }
    }
    json.append("\n\t]\n}")
    result.writeText(json.toString())
}