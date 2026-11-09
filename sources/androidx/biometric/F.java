package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    @NonNull
    public static BiometricPrompt.CryptoObject a(@NonNull IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    @Nullable
    public static IdentityCredential b(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }
}
