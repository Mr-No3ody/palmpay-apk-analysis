package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class H1 implements MessageInfoFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageInfoFactory[] f16488a;

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final boolean isSupported(Class cls) {
        for (MessageInfoFactory messageInfoFactory : this.f16488a) {
            if (messageInfoFactory.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final MessageInfo messageInfoFor(Class cls) {
        for (MessageInfoFactory messageInfoFactory : this.f16488a) {
            if (messageInfoFactory.isSupported(cls)) {
                return messageInfoFactory.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
