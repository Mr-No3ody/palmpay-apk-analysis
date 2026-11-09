package com.palmpay.lib.webview.container.fast.utils.lru;

import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
final class Util {
    static final Charset US_ASCII = Charset.forName("US-ASCII");
    static final Charset UTF_8 = Charset.forName(Constants.ENCODING);

    private Util() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void deleteContents(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(u.k(file, "not a readable directory: "));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                deleteContents(file2);
            }
            if (!file2.delete()) {
                throw new IOException(u.k(file2, "failed to delete file: "));
            }
        }
    }

    public static String readFully(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i7 = reader.read(cArr);
                if (i7 == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i7);
            }
        } finally {
            reader.close();
        }
    }
}
