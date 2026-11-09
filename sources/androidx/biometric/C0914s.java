package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;

/* JADX INFO: renamed from: androidx.biometric.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0914s implements BiometricManager$Injector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13089a;

    public C0914s(Context context) {
        this.f13089a = context.getApplicationContext();
    }

    @Override // androidx.biometric.BiometricManager$Injector
    public final BiometricManager getBiometricManager() {
        return AbstractC0913q.b(this.f13089a);
    }

    @Override // androidx.biometric.BiometricManager$Injector
    public final p003a0.b getFingerprintManager() {
        return new p003a0.b(this.f13089a);
    }

    @Override // androidx.biometric.BiometricManager$Injector
    public final Resources getResources() {
        return this.f13089a.getResources();
    }

    @Override // androidx.biometric.BiometricManager$Injector
    public final boolean isDeviceSecurable() {
        return K.a(this.f13089a) != null;
    }

    @Override // androidx.biometric.BiometricManager$Injector
    public final boolean isDeviceSecuredWithCredential() {
        KeyguardManager keyguardManagerA = K.a(this.f13089a);
        if (keyguardManagerA == null) {
            return false;
        }
        return K.b(keyguardManagerA);
    }

    @Override // androidx.biometric.BiometricManager$Injector
    public final boolean isFaceHardwarePresent() {
        Context context;
        return Build.VERSION.SDK_INT >= 29 && (context = this.f13089a) != null && context.getPackageManager() != null && M.a(context.getPackageManager());
    }

    @Override // androidx.biometric.BiometricManager$Injector
    public final boolean isFingerprintHardwarePresent() {
        Context context = this.f13089a;
        return (context == null || context.getPackageManager() == null || !L.a(context.getPackageManager())) ? false : true;
    }

    @Override // androidx.biometric.BiometricManager$Injector
    public final boolean isIrisHardwarePresent() {
        Context context;
        return Build.VERSION.SDK_INT >= 29 && (context = this.f13089a) != null && context.getPackageManager() != null && M.b(context.getPackageManager());
    }

    @Override // androidx.biometric.BiometricManager$Injector
    public final boolean isStrongBiometricGuaranteed() {
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        int i7 = N.assume_strong_biometrics_models;
        if (str != null) {
            for (String str2 : this.f13089a.getResources().getStringArray(i7)) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
