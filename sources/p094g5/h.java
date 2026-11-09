package p094g5;

import org.json.JSONException;
import org.json.JSONObject;
import p111h5.b;
import p111h5.d;

/* JADX INFO: loaded from: classes3.dex */
public class h extends b {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f36856q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f36857r0;

    public h(g gVar) {
        super(gVar);
        this.f36856q0 = gVar.f36854A;
        this.f36857r0 = gVar.f36855B;
    }

    @Override // p111h5.b, p111h5.d
    public JSONObject c() {
        JSONObject jSONObjectC = super.c();
        try {
            jSONObjectC.put("path", d.b(this.f36856q0));
            jSONObjectC.put("pageShowTimestamp", this.f36857r0);
        } catch (JSONException unused) {
        }
        return jSONObjectC;
    }
}
