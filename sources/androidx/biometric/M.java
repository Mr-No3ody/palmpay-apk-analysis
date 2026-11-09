package androidx.biometric;

import android.content.pm.PackageManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    public static boolean a(@NonNull PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.face");
    }

    public static boolean b(@NonNull PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
    }
}
