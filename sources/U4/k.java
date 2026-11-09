package U4;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f9271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f9272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final JSONObject f9276l;

    public k(j jVar) {
        this.f9265a = jVar.f9253a;
        this.f9266b = jVar.f9254b;
        this.f9267c = jVar.f9255c;
        this.f9268d = jVar.f9256d;
        this.f9269e = jVar.f9257e;
        this.f9270f = jVar.f9258f;
        this.f9271g = jVar.f9259g;
        this.f9272h = jVar.f9260h;
        this.f9273i = jVar.f9261i;
        this.f9274j = jVar.f9262j;
        this.f9275k = jVar.f9263k;
        this.f9276l = jVar.f9264l;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("xpath", this.f9265a);
            jSONObject.put("parentXPath", this.f9266b);
            jSONObject.put(ViewProps.LEFT, this.f9267c);
            jSONObject.put(ViewProps.TOP, this.f9268d);
            jSONObject.put("width", this.f9269e);
            jSONObject.put("height", this.f9270f);
            jSONObject.put("nodeType", this.f9271g);
            jSONObject.put(FirebaseAnalytics.Param.CONTENT, this.f9272h);
            jSONObject.put("page", this.f9273i);
            jSONObject.put("zLevel", this.f9274j);
            int i7 = this.f9275k;
            if (i7 > -1) {
                jSONObject.put(FirebaseAnalytics.Param.INDEX, i7);
            }
            jSONObject.put("webView", this.f9276l);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
