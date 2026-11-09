package androidx.biometric;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    @NonNull
    public static KeyGenParameterSpec a(@NonNull KeyGenParameterSpec.Builder builder) {
        return builder.build();
    }

    @NonNull
    public static KeyGenParameterSpec.Builder b(@NonNull String str, int i7) {
        return new KeyGenParameterSpec.Builder(str, i7);
    }

    public static void c(@NonNull KeyGenerator keyGenerator, @NonNull KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
        keyGenerator.init(keyGenParameterSpec);
    }

    public static void d(@NonNull KeyGenParameterSpec.Builder builder) {
        builder.setBlockModes("CBC");
    }

    public static void e(@NonNull KeyGenParameterSpec.Builder builder) {
        builder.setEncryptionPaddings("PKCS7Padding");
    }
}
