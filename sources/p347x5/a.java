package p347x5;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.growingio.android.sdk.d;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import org.json.JSONException;
import org.json.JSONObject;
import p198n5.h;
import p279s5.c;
import p291t5.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43631a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43633c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f43637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f43638h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43632b = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43634d = "3.3.6";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43635e = 30306;

    public a(int i7, String str, int i10, String str2, String str3) {
        this.f43631a = str;
        this.f43633c = str2;
        this.f43636f = i7;
        this.f43637g = i10;
        this.f43638h = str3;
    }

    public static a a() {
        Context applicationContext = d.a().getApplicationContext();
        String str = ((com.growingio.android.sdk.a) p279s5.d.b().f42025b).f23183a;
        String strD = c.f42022a.d();
        DisplayMetrics displayMetricsB = b.b(applicationContext);
        return new a(displayMetricsB.widthPixels, str, displayMetricsB.heightPixels, strD, ((com.growingio.android.sdk.a) p279s5.d.b().f42025b).f23184b);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("projectId", this.f43631a);
            jSONObject.put("msgType", "ready");
            jSONObject.put("timestamp", this.f43632b);
            jSONObject.put("domain", this.f43633c);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.f43634d);
            jSONObject.put("sdkVersionCode", this.f43635e);
            jSONObject.put(OfflineConstant.PARAM_OS, "Android");
            jSONObject.put("screenWidth", this.f43636f);
            jSONObject.put("screenHeight", this.f43637g);
            jSONObject.put("urlScheme", this.f43638h);
            h.a("READY MESSAGE", jSONObject.toString(), new Object[0]);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
