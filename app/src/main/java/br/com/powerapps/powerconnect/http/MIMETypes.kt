package br.com.powerapps.powerconnect.http

class MIMETypes {
    enum class IMAGES(val valor: String) {
        GIF("image/gif"),
        JPEG("image/jpeg"),
        SVG("image/svg+xml"),
        TIF("image/tiff"),
        WEBP("image/webp"),
        ICO("image/x-icon")
    }

    enum class VIDEOS(val valor: String) {
        _3GP("video/3gpp"),
        _3G2("video/3gpp2"),
        MPEG("video/mpeg"),
        OGV("video/ogg"),
        WEBM("video/webm"),
        AVI("video/x-msvideo")
    }

    enum class AUDIO(val valor: String) {
        AAC("audio/aac"),
        _3GPP("audio/3gpp"),
        _3G2("audio/3gpp2"),
        MID("audio/midi"),
        OGA("audio/ogg"),
        WEBA("audio/webm"),
        WAV("audio/x-wav")
    }

    enum class TEXTS(val valor: String) {
        ICS("text/calendar"),
        CSS("text/css"),
        CSV("text/csv"),
        HTM("text/html"),
        PLAIN("text/plain")
    }

    enum class APPLICATIONS(val valor: String) {
        EPUB("application/epub+zip"),
        JAR("application/java-archive"),
        JS("application/javascript"),
        JSON("application/json"),
        DOC("application/msword"),
        ARC("application/octet-stream"),
        BIN("application/octet-stream"),
        OGX("application/ogg"),
        PDF("application/pdf"),
        RTF("application/rtf"),
        AZW("application/vnd.amazon.ebook"),
        MPKG("application/vnd.apple.installer+xml"),
        XUL("application/vnd.mozilla.xul+xml"),
        XLS("application/vnd.ms-excel"),
        PPT("application/vnd.ms-powerpoint"),
        ODP("application/vnd.oasis.opendocument.presentation"),
        ODS("application/vnd.oasis.opendocument.spreadsheet"),
        ODT("application/vnd.oasis.opendocument.text"),
        VSD("application/vnd.visio"),
        _7Z("application/x-7z-compressed"),
        ABW("application/x-abiword"),
        BZ("application/x-bzip"),
        BZ2("application/x-bzip2"),
        CSH("application/x-csh"),
        XHTML("application/xhtml+xml"),
        XML("application/xml"),
        RAR("application/x-rar-compressed"),
        SH("application/x-sh"),
        SWF("application/x-shockwave-flash"),
        TAR("application/x-tar"),
        ZIP("application/zip")
    }
}