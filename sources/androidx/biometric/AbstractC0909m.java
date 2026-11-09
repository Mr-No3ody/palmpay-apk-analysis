package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.biometric.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0909m {
    public static void a(@NonNull BiometricPrompt.Builder builder, boolean z3) {
        builder.setConfirmationRequired(z3);
    }

    public static void b(@NonNull BiometricPrompt.Builder builder, boolean z3) {
        builder.setDeviceCredentialAllowed(z3);
    }
}
