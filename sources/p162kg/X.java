package p162kg;

import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X f38821c;

    static {
        Intrinsics.checkNotNullParameter(I.f38954a, "<this>");
        f38821c = new X(Y.f38822a);
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @Override // p162kg.AbstractC1821m, p162kg.AbstractC1809a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        W builder = (W) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short sDecodeShortElement = decoder.decodeShortElement(this.f38812b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f38819a;
        int i10 = builder.f38820b;
        builder.f38820b = i10 + 1;
        sArr[i10] = sDecodeShortElement;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        short[] bufferWithData = (short[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        W w3 = new W();
        w3.f38819a = bufferWithData;
        w3.f38820b = bufferWithData.length;
        w3.b(10);
        return w3;
    }

    @Override // p162kg.Q
    public final Object l() {
        return new short[0];
    }

    @Override // p162kg.Q
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        short[] content = (short[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.encodeShortElement(this.f38812b, i10, content[i10]);
        }
    }
}
