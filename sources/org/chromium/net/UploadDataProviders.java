package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new org.chromium.net.apihelpers.c(new org.chromium.net.apihelpers.a(file, 0));
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new org.chromium.net.apihelpers.c(new org.chromium.net.apihelpers.a(parcelFileDescriptor, 1));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new org.chromium.net.apihelpers.b(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i7, int i10) {
        return new org.chromium.net.apihelpers.b(ByteBuffer.wrap(bArr, i7, i10).slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return new org.chromium.net.apihelpers.b(ByteBuffer.wrap(bArr, 0, bArr.length).slice());
    }
}
