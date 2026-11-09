package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f16938d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O2.a f16940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f16941c = 0;

    public w(O2.a aVar, int i7) {
        this.f16940b = aVar;
        this.f16939a = i7;
    }

    public final int a(int i7) {
        androidx.emoji2.text.flatbuffer.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f348d;
        int i10 = iA + aVarB.f345a;
        return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final androidx.emoji2.text.flatbuffer.a b() {
        ThreadLocal threadLocal = f16938d;
        androidx.emoji2.text.flatbuffer.a aVar = (androidx.emoji2.text.flatbuffer.a) threadLocal.get();
        if (aVar == null) {
            aVar = new androidx.emoji2.text.flatbuffer.a();
            threadLocal.set(aVar);
        }
        androidx.emoji2.text.flatbuffer.b bVar = (androidx.emoji2.text.flatbuffer.b) this.f16940b.f6553a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i7 = iA + bVar.f345a;
            int i10 = (this.f16939a * 4) + ((ByteBuffer) bVar.f348d).getInt(i7) + i7 + 4;
            int i11 = ((ByteBuffer) bVar.f348d).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f348d;
            aVar.f348d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f345a = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar.f346b = i12;
                aVar.f347c = ((ByteBuffer) aVar.f348d).getShort(i12);
                return aVar;
            }
            aVar.f345a = 0;
            aVar.f346b = 0;
            aVar.f347c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i7;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        androidx.emoji2.text.flatbuffer.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f348d).getInt(iA + aVarB.f345a) : 0));
        sb2.append(", codepoints:");
        androidx.emoji2.text.flatbuffer.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i10 = iA2 + aVarB2.f345a;
            i7 = ((ByteBuffer) aVarB2.f348d).getInt(((ByteBuffer) aVarB2.f348d).getInt(i10) + i10);
        } else {
            i7 = 0;
        }
        for (int i11 = 0; i11 < i7; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
