package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.biometric.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0910n {
    public static void a(@NonNull BiometricPrompt.Builder builder, int i7) {
        builder.setAllowedAuthenticators(i7);
    }
}
