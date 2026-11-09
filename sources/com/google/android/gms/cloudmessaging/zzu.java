package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes2.dex */
final class zzu extends zzs {
    public zzu(int i7, int i10, Bundle bundle) {
        super(i7, i10, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        zzd(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final boolean zzb() {
        return false;
    }
}
