package p162kg;

import kotlin.jvm.internal.C1856f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: renamed from: kg.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1819k extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1819k f38856c;

    static {
        Intrinsics.checkNotNullParameter(C1856f.f38962a, "<this>");
        f38856c = new C1819k(C1820l.f38858a);
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @Override // p162kg.AbstractC1821m, p162kg.AbstractC1809a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        C1818j builder = (C1818j) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        char cDecodeCharElement = decoder.decodeCharElement(this.f38812b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        char[] cArr = builder.f38852a;
        int i10 = builder.f38853b;
        builder.f38853b = i10 + 1;
        cArr[i10] = cDecodeCharElement;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        char[] bufferWithData = (char[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1818j c1818j = new C1818j();
        c1818j.f38852a = bufferWithData;
        c1818j.f38853b = bufferWithData.length;
        c1818j.b(10);
        return c1818j;
    }

    @Override // p162kg.Q
    public final Object l() {
        return new char[0];
    }

    @Override // p162kg.Q
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        char[] content = (char[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.encodeCharElement(this.f38812b, i10, content[i10]);
        }
    }
}
