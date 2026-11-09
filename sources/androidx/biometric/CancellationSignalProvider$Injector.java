package androidx.biometric;

import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
interface CancellationSignalProvider$Injector {
    @NonNull
    @RequiresApi(16)
    CancellationSignal getBiometricCancellationSignal();

    @NonNull
    androidx.core.os.d getFingerprintCancellationSignal();
}
