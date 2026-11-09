package p094g5;

import org.json.JSONException;
import org.json.JSONObject;
import p111h5.b;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f36853q0;

    public d(c cVar) {
        super(cVar);
        this.f36853q0 = cVar.f36852A;
    }

    @Override // p111h5.b, p111h5.d
    public JSONObject c() {
        JSONObject jSONObjectC = super.c();
        try {
            jSONObjectC.put("eventName", p111h5.d.b(this.f36853q0));
        } catch (JSONException unused) {
        }
        return jSONObjectC;
    }
}
