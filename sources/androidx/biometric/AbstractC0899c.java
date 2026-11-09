package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: androidx.biometric.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0899c {
    @NonNull
    public static BiometricPrompt$AuthenticationCallback a(@NonNull AbstractC0901e abstractC0901e) {
        return new C0898b(abstractC0901e);
    }

    @Nullable
    public static BiometricPrompt.CryptoObject b(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getCryptoObject();
    }
}
