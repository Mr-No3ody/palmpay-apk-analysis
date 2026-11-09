package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    @NonNull
    public static BiometricPrompt.CryptoObject a(@NonNull Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }

    @NonNull
    public static BiometricPrompt.CryptoObject b(@NonNull Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    @NonNull
    public static BiometricPrompt.CryptoObject c(@NonNull Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }

    @Nullable
    public static Cipher d(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getCipher();
    }

    @Nullable
    public static Mac e(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getMac();
    }

    @Nullable
    public static Signature f(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getSignature();
    }
}
