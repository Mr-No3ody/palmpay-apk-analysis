package com.palmpay.lib.scanplus.code;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class YuvUtils {
    static {
        System.loadLibrary("scancode");
    }

    public native void Android420ToI420(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7, int i10, int i11, int i12, byte[] bArr, int i13, int i14);

    public native void rotation(byte[] bArr, byte[] bArr2, int i7, int i10, int i11);

    public native void scale(byte[] bArr, byte[] bArr2, int i7, int i10, int i11, int i12);

    public native void scaleAndclipping(byte[] bArr, byte[] bArr2, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16);
}
