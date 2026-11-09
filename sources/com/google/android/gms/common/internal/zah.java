package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
final class zah extends zaj {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ Fragment zab;
    final /* synthetic */ int zac;

    public zah(Intent intent, Fragment fragment, int i7) {
        this.zaa = intent;
        this.zab = fragment;
        this.zac = i7;
    }

    @Override // com.google.android.gms.common.internal.zaj
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }
}
