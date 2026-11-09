package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class aa implements IntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aj f22610a;

    public aa(aj ajVar) {
        this.f22610a = ajVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f22610a.c(integrityTokenRequest);
    }
}
