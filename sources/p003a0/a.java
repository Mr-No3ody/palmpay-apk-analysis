package p003a0;

import Ab.r;
import android.hardware.fingerprint.FingerprintManager;

/* JADX INFO: loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J3.a f11815a;

    public a(J3.a aVar) {
        this.f11815a = aVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        this.f11815a.F(i7, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        this.f11815a.G();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i7, CharSequence charSequence) {
        this.f11815a.H(charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        top.zibin.luban.io.a aVar;
        FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        if (cryptoObject == null) {
            aVar = null;
        } else if (cryptoObject.getCipher() != null) {
            aVar = new top.zibin.luban.io.a(cryptoObject.getCipher());
        } else if (cryptoObject.getSignature() != null) {
            aVar = new top.zibin.luban.io.a(cryptoObject.getSignature());
        } else if (cryptoObject.getMac() != null) {
            aVar = new top.zibin.luban.io.a(cryptoObject.getMac());
        } else {
            aVar = null;
        }
        this.f11815a.I(new r(aVar, 9));
    }
}
