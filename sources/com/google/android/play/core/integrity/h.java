package com.google.android.play.core.integrity;

import C0.G;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f22713a;

    public /* synthetic */ h(String str, g gVar) {
        this.f22713a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    @Nullable
    public final String a() {
        return this.f22713a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.f22713a;
        if (str == null) {
            return standardIntegrityTokenRequest.a() == null;
        }
        return str.equals(standardIntegrityTokenRequest.a());
    }

    public final int hashCode() {
        String str = this.f22713a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return G.r(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.f22713a, "}");
    }
}
