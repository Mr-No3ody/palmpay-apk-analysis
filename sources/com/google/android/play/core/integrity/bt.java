package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f22707a;

    public bt(bn bnVar) {
        this.f22707a = bnVar;
    }

    public final /* synthetic */ Task a(long j6, long j10, int i7, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f22707a.d(standardIntegrityTokenRequest.a(), j6, j10, 0);
    }
}
