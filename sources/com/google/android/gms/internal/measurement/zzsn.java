package com.google.android.gms.internal.measurement;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class zzsn extends FilterInputStream {
    public zzsn(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return ((FilterInputStream) this).in.read(bArr);
    }
}
