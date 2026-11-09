package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1117l extends C1120m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16693f;

    public C1117l(byte[] bArr, int i7, int i10) {
        super(bArr);
        AbstractC1123n.b(i7, i7 + i10, bArr.length);
        this.f16692e = i7;
        this.f16693f = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.C1120m, androidx.datastore.preferences.protobuf.AbstractC1123n
    public final byte a(int i7) {
        int i10 = this.f16693f;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return this.f16694d[this.f16692e + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(C0.G.m(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(androidx.camera.video.u.h(i7, "Index > length: ", i10, ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C1120m, androidx.datastore.preferences.protobuf.AbstractC1123n
    public final void e(int i7, byte[] bArr) {
        System.arraycopy(this.f16694d, this.f16692e, bArr, 0, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.C1120m, androidx.datastore.preferences.protobuf.AbstractC1123n
    public final byte f(int i7) {
        return this.f16694d[this.f16692e + i7];
    }

    @Override // androidx.datastore.preferences.protobuf.C1120m
    public final int k() {
        return this.f16692e;
    }

    @Override // androidx.datastore.preferences.protobuf.C1120m, androidx.datastore.preferences.protobuf.AbstractC1123n
    public final int size() {
        return this.f16693f;
    }
}
