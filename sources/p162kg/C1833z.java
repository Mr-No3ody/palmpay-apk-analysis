package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: renamed from: kg.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1833z extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1833z f38888c;

    static {
        Intrinsics.checkNotNullParameter(n.f38971a, "<this>");
        f38888c = new C1833z(A.f38776a);
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // p162kg.AbstractC1821m, p162kg.AbstractC1809a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        C1832y builder = (C1832y) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int iDecodeIntElement = decoder.decodeIntElement(this.f38812b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f38886a;
        int i10 = builder.f38887b;
        builder.f38887b = i10 + 1;
        iArr[i10] = iDecodeIntElement;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        int[] bufferWithData = (int[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1832y c1832y = new C1832y();
        c1832y.f38886a = bufferWithData;
        c1832y.f38887b = bufferWithData.length;
        c1832y.b(10);
        return c1832y;
    }

    @Override // p162kg.Q
    public final Object l() {
        return new int[0];
    }

    @Override // p162kg.Q
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        int[] content = (int[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.encodeIntElement(this.f38812b, i10, content[i10]);
        }
    }
}
