package U4;

import com.facebook.react.uimanager.ViewProps;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9240g;

    public e(d dVar) {
        this.f9234a = dVar.f9227a;
        this.f9235b = dVar.f9228b;
        this.f9236c = dVar.f9229c;
        this.f9237d = dVar.f9230d;
        this.f9238e = dVar.f9231e;
        this.f9239f = dVar.f9232f;
        this.f9240g = dVar.f9233g;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("path", this.f9234a);
            jSONObject.put("title", this.f9235b);
            jSONObject.put(ViewProps.LEFT, this.f9236c);
            jSONObject.put(ViewProps.TOP, this.f9237d);
            jSONObject.put("width", this.f9238e);
            jSONObject.put("height", this.f9239f);
            jSONObject.put("isIgnored", this.f9240g);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
