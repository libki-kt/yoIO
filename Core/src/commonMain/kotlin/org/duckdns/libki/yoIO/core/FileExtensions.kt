package org.duckdns.libki.yoIO.core

import org.duckdns.libki.yoIO.annotations.StableFeature

typealias FileExtension = String

@StableFeature
object FileExtensions {
    object Image {
        val png = "png"
        val jpg = "jpg"
        val jpeg = "jpeg"
    }

    object Text {
        val txt = "txt"
        val html = "html"
        val kt = "kt"
    }

    object Video {
        val mp4 = "mp4"
        val avi = "avi"
        val mkv = "mkv"
    }
}