package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f22709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f22710b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i7) {
        this.f22710b = (byte) (this.f22710b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f22710b == 3) {
            return new e(this.f22709a, 0, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f22710b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.f22710b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j6) {
        this.f22709a = j6;
        this.f22710b = (byte) (this.f22710b | 1);
        return this;
    }
}
