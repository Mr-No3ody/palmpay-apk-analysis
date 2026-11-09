package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1074a implements MessageLite.Builder {
    public final String a() {
        return "Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).";
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final boolean mergeDelimitedFrom(InputStream inputStream, C1092e1 c1092e1) throws IOException {
        int i7 = inputStream.read();
        if (i7 == -1) {
            return false;
        }
        r rVarG = r.g(new J1.l(inputStream, r.t(i7, inputStream)));
        ((AbstractC1134q1) this).f(rVarG, c1092e1);
        rVarG.a(0);
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final MessageLite.Builder mergeFrom(r rVar) throws IOException {
        AbstractC1134q1 abstractC1134q1 = (AbstractC1134q1) this;
        abstractC1134q1.f(rVar, C1092e1.b());
        return abstractC1134q1;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final MessageLite.Builder mergeFrom(AbstractC1123n abstractC1123n) throws C1160z1 {
        try {
            r rVarG = abstractC1123n.g();
            ((AbstractC1134q1) this).f(rVarG, C1092e1.b());
            rVarG.a(0);
            return this;
        } catch (C1160z1 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(a(), e11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, C1092e1.b());
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final MessageLite.Builder mergeFrom(AbstractC1123n abstractC1123n, C1092e1 c1092e1) throws C1160z1 {
        try {
            r rVarG = abstractC1123n.g();
            ((AbstractC1134q1) this).f(rVarG, c1092e1);
            rVarG.a(0);
            return this;
        } catch (C1160z1 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(a(), e11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final MessageLite.Builder mergeFrom(byte[] bArr) throws C1160z1 {
        AbstractC1134q1 abstractC1134q1 = (AbstractC1134q1) this;
        abstractC1134q1.g(bArr, 0, bArr.length, C1092e1.b());
        return abstractC1134q1;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final MessageLite.Builder mergeFrom(byte[] bArr, C1092e1 c1092e1) throws C1160z1 {
        AbstractC1134q1 abstractC1134q1 = (AbstractC1134q1) this;
        abstractC1134q1.g(bArr, 0, bArr.length, c1092e1);
        return abstractC1134q1;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final MessageLite.Builder mergeFrom(InputStream inputStream) throws IOException {
        r rVarG = r.g(inputStream);
        ((AbstractC1134q1) this).f(rVarG, C1092e1.b());
        rVarG.a(0);
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final MessageLite.Builder mergeFrom(InputStream inputStream, C1092e1 c1092e1) throws IOException {
        r rVarG = r.g(inputStream);
        ((AbstractC1134q1) this).f(rVarG, c1092e1);
        rVarG.a(0);
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final MessageLite.Builder mergeFrom(MessageLite messageLite) {
        AbstractC1134q1 abstractC1134q1 = (AbstractC1134q1) this;
        AbstractC1145u1 abstractC1145u1 = abstractC1134q1.f16749a;
        if (abstractC1145u1.getClass().isInstance(messageLite)) {
            AbstractC1145u1 abstractC1145u2 = (AbstractC1145u1) ((AbstractC1078b) messageLite);
            if (abstractC1145u1.equals(abstractC1145u2)) {
                return abstractC1134q1;
            }
            abstractC1134q1.d();
            AbstractC1134q1.h(abstractC1134q1.f16750b, abstractC1145u2);
            return abstractC1134q1;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
