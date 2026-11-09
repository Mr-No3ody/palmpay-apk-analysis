package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.biometric.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0900d {
    public static int a(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }
}
