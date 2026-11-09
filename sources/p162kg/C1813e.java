package p162kg;

import kotlin.jvm.internal.C1852b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: renamed from: kg.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1813e extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1813e f38836c;

    static {
        Intrinsics.checkNotNullParameter(C1852b.f38959a, "<this>");
        f38836c = new C1813e(C1814f.f38838a);
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // p162kg.AbstractC1821m, p162kg.AbstractC1809a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        C1812d builder = (C1812d) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean zDecodeBooleanElement = decoder.decodeBooleanElement(this.f38812b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f38832a;
        int i10 = builder.f38833b;
        builder.f38833b = i10 + 1;
        zArr[i10] = zDecodeBooleanElement;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        boolean[] bufferWithData = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1812d c1812d = new C1812d();
        c1812d.f38832a = bufferWithData;
        c1812d.f38833b = bufferWithData.length;
        c1812d.b(10);
        return c1812d;
    }

    @Override // p162kg.Q
    public final Object l() {
        return new boolean[0];
    }

    @Override // p162kg.Q
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        boolean[] content = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.encodeBooleanElement(this.f38812b, i10, content[i10]);
        }
    }
}
