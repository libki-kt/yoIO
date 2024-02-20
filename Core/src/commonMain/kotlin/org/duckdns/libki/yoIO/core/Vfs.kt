package org.duckdns.libki.yoIO.core

import org.duckdns.libki.yoIO.annotations.ExperimentalYoIOApi
import org.duckdns.libki.yoIO.annotations.NotCompleteFeature

@NotCompleteFeature
@ExperimentalYoIOApi
abstract class Vfs {
    abstract val name: String
    open val extension: FileExtension? = null

    open val path: String
        get() = throw Exception("This Vfs doesn't support paths")

    abstract val size: Int
    abstract val byteReader: ByteReader

    suspend fun readBytes(): ByteArray = byteReader.read(
        fromByte = 0,
        toByte = size - 1
    )
}