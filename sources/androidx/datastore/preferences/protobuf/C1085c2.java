package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1085c2 implements MessageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f16592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f16594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16595d;

    public C1085c2(MessageLite messageLite, String str, Object[] objArr) {
        this.f16592a = messageLite;
        this.f16593b = str;
        this.f16594c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f16595d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f16595d = i7 | (cCharAt2 << i11);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final MessageLite getDefaultInstance() {
        return this.f16592a;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final Z1 getSyntax() {
        int i7 = this.f16595d;
        if ((i7 & 1) != 0) {
            return Z1.f16570a;
        }
        return (i7 & 4) == 4 ? Z1.f16572c : Z1.f16571b;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final boolean isMessageSetWireFormat() {
        return (this.f16595d & 2) == 2;
    }
}
