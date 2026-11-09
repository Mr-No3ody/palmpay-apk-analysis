package p279s5;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.growingio.android.sdk.d;
import com.growingio.android.sdk.track.log.ILogger;
import java.util.Iterator;
import java.util.Map;
import p198n5.h;
import p291t5.b;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42029a = d.a().getApplicationContext();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f42037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f42038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f42039k;

    public final String a() {
        if (TextUtils.isEmpty(this.f42033e)) {
            this.f42033e = ((TelephonyManager) this.f42029a.getSystemService("phone")).getPhoneType() != 0 ? "PHONE" : "PAD";
        }
        return this.f42033e;
    }

    public final void b() {
        if (TextUtils.isEmpty(this.f42037i)) {
            if (b.f42342c == null) {
                Context applicationContext = d.a().getApplicationContext();
                b.f42342c = applicationContext.getPackageManager();
                b.f42343d = applicationContext.getPackageName();
            }
            if ((b.f42344e & 8) == 0) {
                try {
                    if (b.f42342c.checkPermission("android.permission.READ_PHONE_STATE", b.f42343d) != 0) {
                        return;
                    } else {
                        b.f42344e |= 8;
                    }
                } catch (Throwable th) {
                    Object[] objArr = new Object[0];
                    Iterator it = h.f39849b.entrySet().iterator();
                    while (it.hasNext()) {
                        ((ILogger) ((Map.Entry) it.next()).getValue()).d("permission", th, "checkPermission failed", objArr);
                    }
                    return;
                }
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) this.f42029a.getSystemService("phone");
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f42037i = telephonyManager.getImei();
                } else {
                    this.f42037i = telephonyManager.getDeviceId();
                }
            } catch (Throwable unused) {
                h.a("DeviceInfoProvider", "don't have permission android.permission.READ_PHONE_STATE,initIMEI failed ", new Object[0]);
            }
        }
    }
}
