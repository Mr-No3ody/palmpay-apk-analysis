package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zaj implements DialogInterface.OnClickListener {
    public static zaj zab(Activity activity, @Nullable Intent intent, int i7) {
        return new zag(intent, activity, i7);
    }

    public static zaj zac(@NonNull Fragment fragment, @Nullable Intent intent, int i7) {
        return new zah(intent, fragment, i7);
    }

    public static zaj zad(@NonNull LifecycleFragment lifecycleFragment, @Nullable Intent intent, int i7) {
        return new zai(intent, lifecycleFragment, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            try {
                zaa();
            } catch (ActivityNotFoundException e10) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    public abstract void zaa();
}
