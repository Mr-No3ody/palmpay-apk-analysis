package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: androidx.biometric.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0913q {
    public static int a(@NonNull BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    @Nullable
    public static BiometricManager b(@NonNull Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }
}
