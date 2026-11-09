package com.google.android.play.core.integrity;

import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class ao extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Long f22641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Object f22642c = null;

    public /* synthetic */ ao(String str, Long l5, Object obj, an anVar) {
        this.f22640a = str;
        this.f22641b = l5;
    }

    @ChecksSdkIntAtLeast(api = 23)
    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    @Nullable
    public final Long cloudProjectNumber() {
        return this.f22641b;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final boolean equals(Object obj) {
        boolean z3;
        Long l5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (!this.f22640a.equals(integrityTokenRequest.nonce()) || ((l5 = this.f22641b) != null ? !l5.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() != null)) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (!(obj instanceof ao) || !a()) {
            return z3;
        }
        ao aoVar = (ao) obj;
        if (!z3) {
            return false;
        }
        Object obj2 = aoVar.f22642c;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f22640a.hashCode() ^ 1000003;
        Long l5 = this.f22641b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l5 == null ? 0 : l5.hashCode());
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f22640a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f22640a + ", cloudProjectNumber=" + this.f22641b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
