package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1131p1 implements MessageInfoFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1131p1 f16734b = new C1131p1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16735a;

    public /* synthetic */ C1131p1(int i7) {
        this.f16735a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final boolean isSupported(Class cls) {
        switch (this.f16735a) {
            case 0:
                return AbstractC1145u1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final MessageInfo messageInfoFor(Class cls) {
        switch (this.f16735a) {
            case 0:
                if (!AbstractC1145u1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (MessageInfo) AbstractC1145u1.e(cls.asSubclass(AbstractC1145u1.class)).d(3, null);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
