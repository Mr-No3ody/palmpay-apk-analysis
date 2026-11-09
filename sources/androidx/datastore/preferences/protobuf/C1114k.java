package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1114k implements ByteString$ByteArrayCopier, Internal$IntListAdapter$IntConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16665a;

    @Override // androidx.datastore.preferences.protobuf.Internal$IntListAdapter$IntConverter
    public Object convert(int i7) {
        EnumC1135r0 enumC1135r0A = EnumC1135r0.a(i7);
        return enumC1135r0A == null ? EnumC1135r0.TARGET_TYPE_UNKNOWN : enumC1135r0A;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString$ByteArrayCopier
    public byte[] copyFrom(byte[] bArr, int i7, int i10) {
        switch (this.f16665a) {
            case 0:
                return Arrays.copyOfRange(bArr, i7, i10 + i7);
            default:
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, i7, bArr2, 0, i10);
                return bArr2;
        }
    }
}
