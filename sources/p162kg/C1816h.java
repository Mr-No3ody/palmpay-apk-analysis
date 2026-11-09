package p162kg;

import kotlin.jvm.internal.C1853c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: renamed from: kg.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1816h extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1816h f38846c;

    static {
        Intrinsics.checkNotNullParameter(C1853c.f38960a, "<this>");
        f38846c = new C1816h(C1817i.f38848a);
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // p162kg.AbstractC1821m, p162kg.AbstractC1809a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        C1815g builder = (C1815g) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte bDecodeByteElement = decoder.decodeByteElement(this.f38812b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f38842a;
        int i10 = builder.f38843b;
        builder.f38843b = i10 + 1;
        bArr[i10] = bDecodeByteElement;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        byte[] bufferWithData = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1815g c1815g = new C1815g();
        c1815g.f38842a = bufferWithData;
        c1815g.f38843b = bufferWithData.length;
        c1815g.b(10);
        return c1815g;
    }

    @Override // p162kg.Q
    public final Object l() {
        return new byte[0];
    }

    @Override // p162kg.Q
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        byte[] content = (byte[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.encodeByteElement(this.f38812b, i10, content[i10]);
        }
    }
}
