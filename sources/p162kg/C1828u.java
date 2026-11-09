package p162kg;

import kotlin.jvm.internal.C1861k;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: renamed from: kg.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1828u extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1828u f38881c;

    static {
        Intrinsics.checkNotNullParameter(C1861k.f38970a, "<this>");
        f38881c = new C1828u(C1829v.f38882a);
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        float[] fArr = (float[]) obj;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // p162kg.AbstractC1821m, p162kg.AbstractC1809a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        C1827t builder = (C1827t) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        float fDecodeFloatElement = decoder.decodeFloatElement(this.f38812b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        float[] fArr = builder.f38879a;
        int i10 = builder.f38880b;
        builder.f38880b = i10 + 1;
        fArr[i10] = fDecodeFloatElement;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        float[] bufferWithData = (float[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1827t c1827t = new C1827t();
        c1827t.f38879a = bufferWithData;
        c1827t.f38880b = bufferWithData.length;
        c1827t.b(10);
        return c1827t;
    }

    @Override // p162kg.Q
    public final Object l() {
        return new float[0];
    }

    @Override // p162kg.Q
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        float[] content = (float[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.encodeFloatElement(this.f38812b, i10, content[i10]);
        }
    }
}
