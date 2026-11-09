package com.palmpay.lib.webview.container.fast.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class StreamUtils {
    public static byte[] streamToBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 <= -1) {
                byteArrayOutputStream.flush();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i7);
        }
    }
}
