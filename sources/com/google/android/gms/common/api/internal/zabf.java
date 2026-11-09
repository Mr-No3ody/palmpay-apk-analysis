package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zabf implements BackgroundDetector.BackgroundStateChangeListener {
    final /* synthetic */ GoogleApiManager zaa;

    public zabf(GoogleApiManager googleApiManager) {
        Objects.requireNonNull(googleApiManager);
        this.zaa = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z3) {
        Boolean boolValueOf = Boolean.valueOf(z3);
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zaF().sendMessage(googleApiManager.zaF().obtainMessage(1, boolValueOf));
    }
}
