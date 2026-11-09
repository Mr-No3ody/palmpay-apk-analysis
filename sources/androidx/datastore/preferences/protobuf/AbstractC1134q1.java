package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1134q1 extends AbstractC1074a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1145u1 f16749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1145u1 f16750b;

    public AbstractC1134q1(AbstractC1145u1 abstractC1145u1) {
        this.f16749a = abstractC1145u1;
        if (abstractC1145u1.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f16750b = abstractC1145u1.j();
    }

    public static void h(Object obj, Object obj2) {
        C1077a2 c1077a2 = C1077a2.f16579c;
        c1077a2.getClass();
        c1077a2.a(obj.getClass()).mergeFrom(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1145u1 build() {
        AbstractC1145u1 abstractC1145u1BuildPartial = buildPartial();
        abstractC1145u1BuildPartial.getClass();
        if (AbstractC1145u1.g(abstractC1145u1BuildPartial, true)) {
            return abstractC1145u1BuildPartial;
        }
        throw new p2();
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC1145u1 buildPartial() {
        if (!this.f16750b.h()) {
            return this.f16750b;
        }
        AbstractC1145u1 abstractC1145u1 = this.f16750b;
        abstractC1145u1.getClass();
        C1077a2 c1077a2 = C1077a2.f16579c;
        c1077a2.getClass();
        c1077a2.a(abstractC1145u1.getClass()).makeImmutable(abstractC1145u1);
        abstractC1145u1.i();
        return this.f16750b;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final MessageLite.Builder clear() {
        AbstractC1145u1 abstractC1145u1 = this.f16749a;
        if (abstractC1145u1.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f16750b = abstractC1145u1.j();
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final MessageLite.Builder clone() {
        AbstractC1134q1 abstractC1134q1 = (AbstractC1134q1) this.f16749a.d(5, null);
        abstractC1134q1.f16750b = buildPartial();
        return abstractC1134q1;
    }

    public final void d() {
        if (this.f16750b.h()) {
            return;
        }
        e();
    }

    public void e() {
        AbstractC1145u1 abstractC1145u1J = this.f16749a.j();
        h(abstractC1145u1J, this.f16750b);
        this.f16750b = abstractC1145u1J;
    }

    public final void f(r rVar, C1092e1 c1092e1) throws IOException {
        d();
        try {
            C1077a2 c1077a2 = C1077a2.f16579c;
            AbstractC1145u1 abstractC1145u1 = this.f16750b;
            c1077a2.getClass();
            Schema schemaA = c1077a2.a(abstractC1145u1.getClass());
            AbstractC1145u1 abstractC1145u2 = this.f16750b;
            C1137s c1137s = rVar.f16758b;
            if (c1137s == null) {
                c1137s = new C1137s(rVar);
            }
            schemaA.mergeFrom(abstractC1145u2, c1137s, c1092e1);
        } catch (RuntimeException e10) {
            if (!(e10.getCause() instanceof IOException)) {
                throw e10;
            }
            throw ((IOException) e10.getCause());
        }
    }

    public final void g(byte[] bArr, int i7, int i10, C1092e1 c1092e1) throws C1160z1 {
        d();
        try {
            C1077a2 c1077a2 = C1077a2.f16579c;
            AbstractC1145u1 abstractC1145u1 = this.f16750b;
            c1077a2.getClass();
            c1077a2.a(abstractC1145u1.getClass()).mergeFrom(this.f16750b, bArr, i7, i7 + i10, new C1098g(c1092e1));
        } catch (C1160z1 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw C1160z1.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return this.f16749a;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return AbstractC1145u1.g(this.f16750b, false);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(r rVar, C1092e1 c1092e1) throws IOException {
        f(rVar, c1092e1);
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(byte[] bArr, int i7, int i10, C1092e1 c1092e1) throws C1160z1 {
        g(bArr, i7, i10, c1092e1);
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
    public final MessageLite.Builder mergeFrom(byte[] bArr, int i7, int i10) throws C1160z1 {
        g(bArr, i7, i10, C1092e1.b());
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m71clone() {
        AbstractC1134q1 abstractC1134q1 = (AbstractC1134q1) this.f16749a.d(5, null);
        abstractC1134q1.f16750b = buildPartial();
        return abstractC1134q1;
    }
}
