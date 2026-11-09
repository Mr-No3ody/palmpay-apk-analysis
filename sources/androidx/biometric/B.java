package androidx.biometric;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class B implements CancellationSignalProvider$Injector {
    @Override // androidx.biometric.CancellationSignalProvider$Injector
    public final CancellationSignal getBiometricCancellationSignal() {
        return C.b();
    }

    @Override // androidx.biometric.CancellationSignalProvider$Injector
    public final androidx.core.os.d getFingerprintCancellationSignal() {
        return new androidx.core.os.d();
    }
}
