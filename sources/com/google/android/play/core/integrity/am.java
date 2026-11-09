package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class am extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f22639b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f22638a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        an anVar = null;
        return new ao(str, this.f22639b, anVar, anVar);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j6) {
        this.f22639b = Long.valueOf(j6);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f22638a = str;
        return this;
    }
}
