package p094g5;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p111h5.d;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends d {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f36879p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f36880q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f36881r0;

    public n(m mVar) {
        super(mVar);
        this.f36879p0 = mVar.f36878z;
        this.f36880q0 = mVar.f36876A;
        this.f36881r0 = mVar.f36877B;
    }

    @Override // p216o5.d
    public final int a() {
        return 1;
    }

    @Override // p111h5.d
    public final JSONObject c() {
        String str = this.f36881r0;
        String str2 = this.f36880q0;
        String str3 = this.f36879p0;
        JSONObject jSONObjectC = super.c();
        try {
            if (!TextUtils.isEmpty(d.b(null))) {
                jSONObjectC.put("imei", d.b(null));
            }
            if (!TextUtils.isEmpty(d.b(str3))) {
                jSONObjectC.put("androidId", d.b(str3));
            }
            if (!TextUtils.isEmpty(d.b(str2))) {
                jSONObjectC.put("oaid", d.b(str2));
            }
            if (!TextUtils.isEmpty(d.b(str))) {
                jSONObjectC.put("googleAdvertisingId", d.b(str));
            }
        } catch (JSONException unused) {
        }
        return jSONObjectC;
    }
}
