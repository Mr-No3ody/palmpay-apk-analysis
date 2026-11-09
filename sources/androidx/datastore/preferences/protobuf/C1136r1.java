package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1136r1 implements Parser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1092e1 f16770b = C1092e1.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1145u1 f16771a;

    public C1136r1(AbstractC1145u1 abstractC1145u1) {
        this.f16771a = abstractC1145u1;
    }

    public static void a(AbstractC1145u1 abstractC1145u1) throws C1160z1 {
        if (abstractC1145u1 != null && !AbstractC1145u1.g(abstractC1145u1, true)) {
            throw new C1160z1(new p2().getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1145u1 parsePartialDelimitedFrom(InputStream inputStream, C1092e1 c1092e1) throws C1160z1 {
        try {
            int i7 = inputStream.read();
            if (i7 == -1) {
                return null;
            }
            return parsePartialFrom(new J1.l(inputStream, r.t(i7, inputStream)), c1092e1);
        } catch (IOException e10) {
            throw new C1160z1(e10.getMessage(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC1145u1 parsePartialFrom(AbstractC1123n abstractC1123n, C1092e1 c1092e1) throws C1160z1 {
        r rVarG = abstractC1123n.g();
        AbstractC1145u1 abstractC1145u1K = AbstractC1145u1.k(this.f16771a, rVarG, c1092e1);
        try {
            rVarG.a(0);
            return abstractC1145u1K;
        } catch (C1160z1 e10) {
            throw e10;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final AbstractC1145u1 parsePartialFrom(InputStream inputStream, C1092e1 c1092e1) throws C1160z1 {
        r rVarG = r.g(inputStream);
        AbstractC1145u1 abstractC1145u1K = AbstractC1145u1.k(this.f16771a, rVarG, c1092e1);
        try {
            rVarG.a(0);
            return abstractC1145u1K;
        } catch (C1160z1 e10) {
            throw e10;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC1145u1 parsePartialFrom(byte[] bArr, int i7, int i10, C1092e1 c1092e1) throws C1160z1 {
        AbstractC1145u1 abstractC1145u1 = this.f16771a;
        if (i10 == 0) {
            return abstractC1145u1;
        }
        AbstractC1145u1 abstractC1145u1J = abstractC1145u1.j();
        try {
            C1077a2 c1077a2 = C1077a2.f16579c;
            c1077a2.getClass();
            Schema schemaA = c1077a2.a(abstractC1145u1J.getClass());
            schemaA.mergeFrom(abstractC1145u1J, bArr, i7, i7 + i10, new C1098g(c1092e1));
            schemaA.makeImmutable(abstractC1145u1J);
            return abstractC1145u1J;
        } catch (p2 e10) {
            throw new C1160z1(e10.getMessage());
        } catch (C1160z1 e11) {
            if (e11.f16816a) {
                throw new C1160z1(e11.getMessage(), e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof C1160z1) {
                throw ((C1160z1) e12.getCause());
            }
            throw new C1160z1(e12.getMessage(), e12);
        } catch (IndexOutOfBoundsException unused) {
            throw C1160z1.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseDelimitedFrom(InputStream inputStream) throws C1160z1 {
        AbstractC1145u1 partialDelimitedFrom = parsePartialDelimitedFrom(inputStream, f16770b);
        a(partialDelimitedFrom);
        return partialDelimitedFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseFrom(AbstractC1123n abstractC1123n) throws C1160z1 {
        AbstractC1145u1 partialFrom = parsePartialFrom(abstractC1123n, f16770b);
        a(partialFrom);
        return partialFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseDelimitedFrom(InputStream inputStream, C1092e1 c1092e1) throws C1160z1 {
        AbstractC1145u1 partialDelimitedFrom = parsePartialDelimitedFrom(inputStream, c1092e1);
        a(partialDelimitedFrom);
        return partialDelimitedFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseFrom(AbstractC1123n abstractC1123n, C1092e1 c1092e1) throws C1160z1 {
        AbstractC1145u1 partialFrom = parsePartialFrom(abstractC1123n, c1092e1);
        a(partialFrom);
        return partialFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parsePartialDelimitedFrom(InputStream inputStream) {
        return parsePartialDelimitedFrom(inputStream, f16770b);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseFrom(ByteBuffer byteBuffer) throws C1160z1 {
        r rVarH = r.h(byteBuffer, false);
        AbstractC1145u1 abstractC1145u1K = AbstractC1145u1.k(this.f16771a, rVarH, f16770b);
        try {
            rVarH.a(0);
            a(abstractC1145u1K);
            return abstractC1145u1K;
        } catch (C1160z1 e10) {
            throw e10;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parsePartialFrom(AbstractC1123n abstractC1123n) {
        return parsePartialFrom(abstractC1123n, f16770b);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parsePartialFrom(byte[] bArr, C1092e1 c1092e1) {
        return parsePartialFrom(bArr, 0, bArr.length, c1092e1);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parsePartialFrom(byte[] bArr) {
        return parsePartialFrom(bArr, 0, bArr.length, f16770b);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseFrom(ByteBuffer byteBuffer, C1092e1 c1092e1) throws C1160z1 {
        r rVarH = r.h(byteBuffer, false);
        AbstractC1145u1 abstractC1145u1K = AbstractC1145u1.k(this.f16771a, rVarH, c1092e1);
        try {
            rVarH.a(0);
            a(abstractC1145u1K);
            return abstractC1145u1K;
        } catch (C1160z1 e10) {
            throw e10;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parsePartialFrom(InputStream inputStream) {
        return parsePartialFrom(inputStream, f16770b);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parsePartialFrom(byte[] bArr, int i7, int i10) {
        return parsePartialFrom(bArr, i7, i10, f16770b);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parsePartialFrom(r rVar) {
        return AbstractC1145u1.k(this.f16771a, rVar, f16770b);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parsePartialFrom(r rVar, C1092e1 c1092e1) {
        return AbstractC1145u1.k(this.f16771a, rVar, c1092e1);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseFrom(byte[] bArr) throws C1160z1 {
        AbstractC1145u1 partialFrom = parsePartialFrom(bArr, 0, bArr.length, f16770b);
        a(partialFrom);
        return partialFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseFrom(byte[] bArr, C1092e1 c1092e1) throws C1160z1 {
        AbstractC1145u1 partialFrom = parsePartialFrom(bArr, 0, bArr.length, c1092e1);
        a(partialFrom);
        return partialFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseFrom(InputStream inputStream) throws C1160z1 {
        AbstractC1145u1 partialFrom = parsePartialFrom(inputStream, f16770b);
        a(partialFrom);
        return partialFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseFrom(InputStream inputStream, C1092e1 c1092e1) throws C1160z1 {
        AbstractC1145u1 partialFrom = parsePartialFrom(inputStream, c1092e1);
        a(partialFrom);
        return partialFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseFrom(byte[] bArr, int i7, int i10) throws C1160z1 {
        AbstractC1145u1 partialFrom = parsePartialFrom(bArr, i7, i10, f16770b);
        a(partialFrom);
        return partialFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseFrom(byte[] bArr, int i7, int i10, C1092e1 c1092e1) throws C1160z1 {
        AbstractC1145u1 partialFrom = parsePartialFrom(bArr, i7, i10, c1092e1);
        a(partialFrom);
        return partialFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseFrom(r rVar) throws C1160z1 {
        AbstractC1145u1 abstractC1145u1K = AbstractC1145u1.k(this.f16771a, rVar, f16770b);
        a(abstractC1145u1K);
        return abstractC1145u1K;
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public final Object parseFrom(r rVar, C1092e1 c1092e1) throws C1160z1 {
        AbstractC1145u1 abstractC1145u1K = AbstractC1145u1.k(this.f16771a, rVar, c1092e1);
        a(abstractC1145u1K);
        return abstractC1145u1K;
    }
}
