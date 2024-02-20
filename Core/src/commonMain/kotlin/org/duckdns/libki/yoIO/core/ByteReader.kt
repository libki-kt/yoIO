package org.duckdns.libki.yoIO.core

import org.duckdns.libki.yoIO.annotations.NotCompleteFeature

@NotCompleteFeature
abstract class ByteReader {
    abstract suspend fun read(
        fromByte: Int,
        toByte: Int
    ): ByteArray
}