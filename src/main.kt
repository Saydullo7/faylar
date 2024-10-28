import java.io.File

fun main() {
    val papka = File("Papka")
    papka.mkdir()

    for (i in 1..2){
        val papkalar = File("Papka/papka $i")
        papkalar.mkdirs()

        for (j  in 1..3){
            val papka3 = File("Papka/papka $i/papka$j")
            papka3.mkdirs()
            val file = File(papka3,"fayl.txt")
            file.createNewFile()
            file.writeText("Jorahonov Saydullo")

        }
    }

}