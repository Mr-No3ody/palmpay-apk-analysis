package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F f38785c;

    static {
        Intrinsics.checkNotNullParameter(p.f38972a, "<this>");
        f38785c = new F(G.f38786a);
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @Override // p162kg.AbstractC1821m, p162kg.AbstractC1809a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        E builder = (E) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long jDecodeLongElement = decoder.decodeLongElement(this.f38812b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f38783a;
        int i10 = builder.f38784b;
        builder.f38784b = i10 + 1;
        jArr[i10] = jDecodeLongElement;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        long[] bufferWithData = (long[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        E e10 = new E();
        e10.f38783a = bufferWithData;
        e10.f38784b = bufferWithData.length;
        e10.b(10);
        return e10;
    }

    @Override // p162kg.Q
    public final Object l() {
        return new long[0];
    }

    @Override // p162kg.Q
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        long[] content = (long[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.encodeLongElement(this.f38812b, i10, content[i10]);
        }
    }
}
