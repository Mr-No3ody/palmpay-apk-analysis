package com.google.firebase.analytics;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzez;

/* JADX INFO: loaded from: classes.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        zzez.zza(this, null).zze(getIntent());
        finish();
    }
}
