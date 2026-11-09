package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import p355xf.C;
import p355xf.D;
import p355xf.E;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f38847c;

    static {
        Intrinsics.checkNotNullParameter(D.f43948b, "<this>");
        f38847c = new h0(i0.f38850a);
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        long[] collectionSize = ((E) obj).f43950a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p162kg.AbstractC1821m, p162kg.AbstractC1809a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        g0 builder = (g0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long jDecodeLong = decoder.decodeInlineElement(this.f38812b, i7).decodeLong();
        C c6 = D.f43948b;
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f38844a;
        int i10 = builder.f38845b;
        builder.f38845b = i10 + 1;
        jArr[i10] = jDecodeLong;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        long[] bufferWithData = ((E) obj).f43950a;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        g0 g0Var = new g0();
        g0Var.f38844a = bufferWithData;
        g0Var.f38845b = bufferWithData.length;
        g0Var.b(10);
        return g0Var;
    }

    @Override // p162kg.Q
    public final Object l() {
        long[] storage = new long[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new E(storage);
    }

    @Override // p162kg.Q
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        long[] content = ((E) obj).f43950a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            Encoder encoderEncodeInlineElement = encoder.encodeInlineElement(this.f38812b, i10);
            long j6 = content[i10];
            C c6 = D.f43948b;
            encoderEncodeInlineElement.encodeLong(j6);
        }
    }
}
