package parshaTagger

import org.jaudiotagger.audio.AudioFileIO
import org.jaudiotagger.audio.mp3.MP3File
import org.jaudiotagger.tag.FieldKey
import java.io.File

fun main() {
    val file = File("C:\\Users\\Shmuel\\Downloads\\good version of JAudioTagger\\JAudioTagger - Copy\\RAL Acharei Mos 5780 The First Rashi; The Nature of Being M'Zarez (From a Q & A on Corona for YGW Girls Division).mp3")
    val f = AudioFileIO.read(file) as MP3File
    val tag = f.tag
    tag.setField(FieldKey.TITLE,"My name is")
    f.commit()
}