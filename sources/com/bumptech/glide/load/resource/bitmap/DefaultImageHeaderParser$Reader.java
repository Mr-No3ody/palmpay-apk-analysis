package com.bumptech.glide.load.resource.bitmap;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
interface DefaultImageHeaderParser$Reader {
    int getUInt16() throws IOException;

    short getUInt8() throws IOException;

    int read(byte[] bArr, int i7) throws IOException;

    long skip(long j6) throws IOException;
}
