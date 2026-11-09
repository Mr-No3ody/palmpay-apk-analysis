package p094g5;

import org.json.JSONException;
import org.json.JSONObject;
import p111h5.d;

/* JADX INFO: loaded from: classes3.dex */
public class j extends d {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f36862p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f36863q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f36864r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f36865s0;

    public j(i iVar) {
        super(iVar);
        this.f36862p0 = iVar.f36861z;
        this.f36863q0 = iVar.f36858A;
        this.f36864r0 = iVar.f36859B;
        this.f36865s0 = iVar.f36860C;
    }

    @Override // p111h5.d
    public JSONObject c() {
        JSONObject jSONObjectC = super.c();
        try {
            jSONObjectC.put("path", d.b(this.f36862p0));
            jSONObjectC.put("orientation", d.b(this.f36863q0));
            jSONObjectC.put("title", d.b(this.f36864r0));
            jSONObjectC.put("referralPage", d.b(this.f36865s0));
        } catch (JSONException unused) {
        }
        return jSONObjectC;
    }
}
