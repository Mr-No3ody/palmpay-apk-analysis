package Pa;

import android.telephony.TelephonyManager;
import android.telephony.TelephonyManager$UssdResponseCallback;
import com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends TelephonyManager$UssdResponseCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f7160a;

    public s0(WeakReference weakReference) {
        this.f7160a = weakReference;
    }

    public final void onReceiveUssdResponse(TelephonyManager telephonyManager, String str, CharSequence charSequence) {
        super.onReceiveUssdResponse(telephonyManager, str, charSequence);
        UssdUtils$UssdResponseCallback ussdUtils$UssdResponseCallback = (UssdUtils$UssdResponseCallback) this.f7160a.get();
        if (ussdUtils$UssdResponseCallback != null) {
            ussdUtils$UssdResponseCallback.onReceiveUssdResponse(true, str, charSequence, 0);
        }
    }

    public final void onReceiveUssdResponseFailed(TelephonyManager telephonyManager, String str, int i7) {
        super.onReceiveUssdResponseFailed(telephonyManager, str, i7);
        UssdUtils$UssdResponseCallback ussdUtils$UssdResponseCallback = (UssdUtils$UssdResponseCallback) this.f7160a.get();
        if (ussdUtils$UssdResponseCallback != null) {
            ussdUtils$UssdResponseCallback.onReceiveUssdResponse(false, str, null, i7);
        }
    }
}
