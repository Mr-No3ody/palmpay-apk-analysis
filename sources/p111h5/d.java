package p111h5;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends p216o5.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f37323A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f37324B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f37325C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f37326H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final String f37327L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final String f37328M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final String f37329Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final String f37330X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f37331Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final String f37332Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f37337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f37338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f37339g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f37340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f37341j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final String f37342k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f37343o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f37344p;
    public final long t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f37345v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashMap f37346w;

    public d(c cVar) {
        this.f37333a = cVar.f37299a;
        this.f37334b = cVar.f37300b;
        this.f37335c = cVar.f37301c;
        this.f37336d = cVar.f37302d;
        this.f37337e = cVar.f37303e;
        this.f37338f = cVar.f37304f;
        this.f37339g = cVar.f37305g;
        this.f37340i = cVar.f37306h;
        this.f37341j = cVar.f37307i;
        this.f37343o = cVar.f37308j;
        this.f37344p = cVar.f37309k;
        this.t = cVar.f37310l;
        this.f37345v = cVar.f37311m;
        this.f37346w = cVar.f37312n;
        this.f37323A = cVar.f37313o;
        this.f37324B = cVar.f37314p;
        this.f37325C = cVar.f37315q;
        this.f37326H = cVar.f37316r;
        this.f37327L = cVar.f37317s;
        this.f37328M = cVar.t;
        this.f37329Q = cVar.f37318u;
        this.f37330X = cVar.f37319v;
        this.f37331Y = cVar.f37320w;
        this.f37332Z = cVar.f37321x;
        this.f37342k0 = cVar.f37322y;
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public JSONObject c() {
        String str = this.f37329Q;
        String str2 = this.f37328M;
        String str3 = this.f37327L;
        String str4 = this.f37324B;
        String str5 = this.f37323A;
        String str6 = this.f37337e;
        String str7 = this.f37336d;
        HashMap map = this.f37346w;
        JSONObject jSONObject = !map.isEmpty() ? new JSONObject(map) : new JSONObject();
        try {
            jSONObject.put("platform", this.f37333a);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION, this.f37334b);
            jSONObject.put("deviceId", b(this.f37335c));
            if (!TextUtils.isEmpty(b(str7))) {
                jSONObject.put("userKey", b(str7));
            }
            if (!TextUtils.isEmpty(b(str6))) {
                jSONObject.put("userId", b(str6));
            }
            jSONObject.put("sessionId", b(this.f37338f));
            jSONObject.put("eventType", b(this.f37339g));
            jSONObject.put("timestamp", this.f37340i);
            jSONObject.put("domain", b(this.f37341j));
            jSONObject.put("urlScheme", b(this.f37343o));
            jSONObject.put("appState", b(this.f37344p));
            jSONObject.put("globalSequenceId", this.t);
            jSONObject.put("eventSequenceId", this.f37345v);
            if (!TextUtils.isEmpty(b(str5))) {
                jSONObject.put("networkState", b(str5));
            }
            if (!TextUtils.isEmpty(b(str4))) {
                jSONObject.put("appChannel", b(str4));
            }
            int i7 = this.f37325C;
            if (i7 > 0) {
                jSONObject.put("screenHeight", i7);
            }
            int i10 = this.f37326H;
            if (i10 > 0) {
                jSONObject.put("screenWidth", i10);
            }
            if (!TextUtils.isEmpty(b(str3))) {
                jSONObject.put("deviceBrand", b(str3));
            }
            if (!TextUtils.isEmpty(b(str2))) {
                jSONObject.put("deviceModel", b(str2));
            }
            if (!TextUtils.isEmpty(b(str))) {
                jSONObject.put("deviceType", b(str));
            }
            jSONObject.put("appName", b(this.f37330X));
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, b(this.f37331Y));
            jSONObject.put("language", b(this.f37332Z));
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, b(this.f37342k0));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
