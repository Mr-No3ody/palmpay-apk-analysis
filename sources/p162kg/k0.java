package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import p355xf.G;
import p355xf.H;
import p355xf.I;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f38857c;

    static {
        Intrinsics.checkNotNullParameter(H.f43952b, "<this>");
        f38857c = new k0(l0.f38860a);
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        short[] collectionSize = ((I) obj).f43954a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p162kg.AbstractC1821m, p162kg.AbstractC1809a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        j0 builder = (j0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short sDecodeShort = decoder.decodeInlineElement(this.f38812b, i7).decodeShort();
        G g7 = H.f43952b;
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f38854a;
        int i10 = builder.f38855b;
        builder.f38855b = i10 + 1;
        sArr[i10] = sDecodeShort;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        short[] bufferWithData = ((I) obj).f43954a;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        j0 j0Var = new j0();
        j0Var.f38854a = bufferWithData;
        j0Var.f38855b = bufferWithData.length;
        j0Var.b(10);
        return j0Var;
    }

    @Override // p162kg.Q
    public final Object l() {
        short[] storage = new short[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new I(storage);
    }

    @Override // p162kg.Q
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        short[] content = ((I) obj).f43954a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            Encoder encoderEncodeInlineElement = encoder.encodeInlineElement(this.f38812b, i10);
            short s3 = content[i10];
            G g7 = H.f43952b;
            encoderEncodeInlineElement.encodeShort(s3);
        }
    }
}
