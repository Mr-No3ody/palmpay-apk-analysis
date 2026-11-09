package Kf;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends ByteArrayOutputStream {
    public byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }

    public void b(int i7, byte[] bArr) {
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i7, ((ByteArrayOutputStream) this).count);
    }
}
