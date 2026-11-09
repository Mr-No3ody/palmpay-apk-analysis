package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.PresentationSession;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    @NonNull
    public static BiometricPrompt.CryptoObject a(@NonNull PresentationSession presentationSession) {
        return new BiometricPrompt.CryptoObject(presentationSession);
    }

    @Nullable
    public static PresentationSession b(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getPresentationSession();
    }
}
