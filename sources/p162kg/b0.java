package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import p355xf.w;
import p355xf.x;
import p355xf.y;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f38828c;

    static {
        Intrinsics.checkNotNullParameter(x.f43988b, "<this>");
        f38828c = new b0(c0.f38830a);
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        byte[] collectionSize = ((y) obj).f43990a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p162kg.AbstractC1821m, p162kg.AbstractC1809a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        a0 builder = (a0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte bDecodeByte = decoder.decodeInlineElement(this.f38812b, i7).decodeByte();
        w wVar = x.f43988b;
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f38826a;
        int i10 = builder.f38827b;
        builder.f38827b = i10 + 1;
        bArr[i10] = bDecodeByte;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        byte[] bufferWithData = ((y) obj).f43990a;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        a0 a0Var = new a0();
        a0Var.f38826a = bufferWithData;
        a0Var.f38827b = bufferWithData.length;
        a0Var.b(10);
        return a0Var;
    }

    @Override // p162kg.Q
    public final Object l() {
        byte[] storage = new byte[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new y(storage);
    }

    @Override // p162kg.Q
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        byte[] content = ((y) obj).f43990a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            Encoder encoderEncodeInlineElement = encoder.encodeInlineElement(this.f38812b, i10);
            byte b7 = content[i10];
            w wVar = x.f43988b;
            encoderEncodeInlineElement.encodeByte(b7);
        }
    }
}
