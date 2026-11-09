package androidx.biometric;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.biometric.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0908l {
    public static void a(@NonNull BiometricPrompt biometricPrompt, @NonNull BiometricPrompt.CryptoObject cryptoObject, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
    }

    public static void b(@NonNull BiometricPrompt biometricPrompt, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
        biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
    }

    @NonNull
    public static BiometricPrompt c(@NonNull BiometricPrompt.Builder builder) {
        return builder.build();
    }

    @NonNull
    public static BiometricPrompt.Builder d(@NonNull Context context) {
        return new BiometricPrompt.Builder(context);
    }

    public static void e(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence, @NonNull Executor executor, @NonNull DialogInterface.OnClickListener onClickListener) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    public static void f(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static void g(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
