package p111h5;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends d {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Map f37298p0;

    public b(a aVar) {
        super(aVar);
        this.f37298p0 = aVar.f37297z;
    }

    @Override // p111h5.d
    public JSONObject c() {
        JSONObject jSONObjectC = super.c();
        Map map = this.f37298p0;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    jSONObjectC.put("attributes", new JSONObject(map));
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObjectC;
    }
}
