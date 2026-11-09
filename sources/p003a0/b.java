package p003a0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import androidx.core.os.d;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import top.zibin.luban.io.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11816a;

    public b(Context context) {
        this.f11816a = context;
    }

    public static FingerprintManager b(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public final void a(a aVar, d dVar, J3.a aVar2) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (dVar != null) {
            synchronized (dVar) {
                try {
                    if (dVar.f16092c == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        dVar.f16092c = cancellationSignal3;
                        if (dVar.f16090a) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = dVar.f16092c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager fingerprintManagerB = b(this.f11816a);
        if (fingerprintManagerB != null) {
            if (aVar != null) {
                Cipher cipher = (Cipher) aVar.f42646c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else {
                    Signature signature = (Signature) aVar.f42645b;
                    if (signature != null) {
                        cryptoObject = new FingerprintManager.CryptoObject(signature);
                    } else {
                        Mac mac = (Mac) aVar.f42647d;
                        if (mac != null) {
                            cryptoObject = new FingerprintManager.CryptoObject(mac);
                        }
                    }
                }
            }
            fingerprintManagerB.authenticate(cryptoObject, cancellationSignal, 0, new a(aVar2), null);
        }
    }

    public final boolean c() {
        FingerprintManager fingerprintManagerB = b(this.f11816a);
        return fingerprintManagerB != null && fingerprintManagerB.isHardwareDetected();
    }
}
