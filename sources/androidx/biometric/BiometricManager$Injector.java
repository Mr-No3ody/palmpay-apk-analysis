package androidx.biometric;

import android.content.res.Resources;
import android.hardware.biometrics.BiometricManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
interface BiometricManager$Injector {
    @Nullable
    @RequiresApi(29)
    BiometricManager getBiometricManager();

    @Nullable
    p003a0.b getFingerprintManager();

    @NonNull
    Resources getResources();

    boolean isDeviceSecurable();

    boolean isDeviceSecuredWithCredential();

    boolean isFaceHardwarePresent();

    boolean isFingerprintHardwarePresent();

    boolean isIrisHardwarePresent();

    boolean isStrongBiometricGuaranteed();
}
