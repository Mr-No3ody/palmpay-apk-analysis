package androidx.biometric;

import android.content.pm.PackageManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    public static boolean a(@NonNull PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
