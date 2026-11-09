package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1142t1 extends AbstractC1145u1 implements GeneratedMessageLite$ExtendableMessageOrBuilder {
    protected C1122m1 extensions = C1122m1.f16695c;

    @Override // androidx.datastore.preferences.protobuf.AbstractC1145u1, androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return (AbstractC1145u1) d(6, null);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
    public final Object getExtension(AbstractC1080b1 abstractC1080b1) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
    public final int getExtensionCount(AbstractC1080b1 abstractC1080b1) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
    public final boolean hasExtension(AbstractC1080b1 abstractC1080b1) {
        throw null;
    }

    public final C1122m1 n() {
        C1122m1 c1122m1 = this.extensions;
        if (c1122m1.f16697b) {
            this.extensions = c1122m1.clone();
        }
        return this.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1145u1, androidx.datastore.preferences.protobuf.MessageLite
    public final MessageLite.Builder newBuilderForType() {
        return (AbstractC1134q1) d(5, null);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1145u1, androidx.datastore.preferences.protobuf.MessageLite
    public final MessageLite.Builder toBuilder() {
        AbstractC1134q1 abstractC1134q1 = (AbstractC1134q1) d(5, null);
        if (abstractC1134q1.f16749a.equals(this)) {
            return abstractC1134q1;
        }
        abstractC1134q1.d();
        AbstractC1134q1.h(abstractC1134q1.f16750b, this);
        return abstractC1134q1;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
    public final Object getExtension(AbstractC1080b1 abstractC1080b1, int i7) {
        throw null;
    }
}
