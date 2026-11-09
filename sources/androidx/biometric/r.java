package androidx.biometric;

import android.hardware.biometrics.BiometricManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static int a(@NonNull BiometricManager biometricManager, int i7) {
        return biometricManager.canAuthenticate(i7);
    }
}
