package p094g5;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;
import p111h5.d;

/* JADX INFO: loaded from: classes3.dex */
public class l extends d {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f36871p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f36872q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f36873r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f36874s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f36875t0;

    public l(k kVar) {
        super(kVar);
        this.f36871p0 = kVar.f36870z;
        this.f36872q0 = kVar.f36866A;
        this.f36873r0 = kVar.f36867B;
        this.f36874s0 = kVar.f36868C;
        this.f36875t0 = kVar.f36869D;
    }

    @Override // p111h5.d
    public JSONObject c() {
        String str = this.f36873r0;
        JSONObject jSONObjectC = super.c();
        try {
            jSONObjectC.put("path", d.b(this.f36871p0));
            jSONObjectC.put("pageShowTimestamp", this.f36872q0);
            if (!TextUtils.isEmpty(d.b(str))) {
                jSONObjectC.put("textValue", d.b(str));
            }
            jSONObjectC.put("xpath", d.b(this.f36874s0));
            jSONObjectC.put(FirebaseAnalytics.Param.INDEX, this.f36875t0);
        } catch (JSONException unused) {
        }
        return jSONObjectC;
    }
}
