package p162kg;

import kotlin.jvm.internal.C1860j;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: renamed from: kg.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1823o extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1823o f38869c;

    static {
        Intrinsics.checkNotNullParameter(C1860j.f38969a, "<this>");
        f38869c = new C1823o(C1824p.f38870a);
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @Override // p162kg.AbstractC1821m, p162kg.AbstractC1809a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        C1822n builder = (C1822n) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        double dDecodeDoubleElement = decoder.decodeDoubleElement(this.f38812b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        double[] dArr = builder.f38865a;
        int i10 = builder.f38866b;
        builder.f38866b = i10 + 1;
        dArr[i10] = dDecodeDoubleElement;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        double[] bufferWithData = (double[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1822n c1822n = new C1822n();
        c1822n.f38865a = bufferWithData;
        c1822n.f38866b = bufferWithData.length;
        c1822n.b(10);
        return c1822n;
    }

    @Override // p162kg.Q
    public final Object l() {
        return new double[0];
    }

    @Override // p162kg.Q
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        double[] content = (double[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.encodeDoubleElement(this.f38812b, i10, content[i10]);
        }
    }
}
