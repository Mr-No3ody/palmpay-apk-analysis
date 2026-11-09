package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import p355xf.A;
import p355xf.B;
import p355xf.z;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f38837c;

    static {
        Intrinsics.checkNotNullParameter(A.f43945b, "<this>");
        f38837c = new e0(f0.f38840a);
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        int[] collectionSize = ((B) obj).f43947a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p162kg.AbstractC1821m, p162kg.AbstractC1809a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        d0 builder = (d0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int iDecodeInt = decoder.decodeInlineElement(this.f38812b, i7).decodeInt();
        z zVar = A.f43945b;
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f38834a;
        int i10 = builder.f38835b;
        builder.f38835b = i10 + 1;
        iArr[i10] = iDecodeInt;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        int[] bufferWithData = ((B) obj).f43947a;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        d0 d0Var = new d0();
        d0Var.f38834a = bufferWithData;
        d0Var.f38835b = bufferWithData.length;
        d0Var.b(10);
        return d0Var;
    }

    @Override // p162kg.Q
    public final Object l() {
        int[] storage = new int[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new B(storage);
    }

    @Override // p162kg.Q
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        int[] content = ((B) obj).f43947a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            Encoder encoderEncodeInlineElement = encoder.encodeInlineElement(this.f38812b, i10);
            int i11 = content[i10];
            z zVar = A.f43945b;
            encoderEncodeInlineElement.encodeInt(i11);
        }
    }
}
