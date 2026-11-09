package com.google.android.play.core.integrity;

import N8.q0;

/* JADX INFO: loaded from: classes2.dex */
final class e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22711a;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final int a() {
        return 0;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final long b() {
        return this.f22711a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) {
            StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
            if (this.f22711a == prepareIntegrityTokenRequest.b()) {
                prepareIntegrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f22711a;
        return (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return q0.n(new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="), ", webViewRequestMode=0}", this.f22711a);
    }
}
