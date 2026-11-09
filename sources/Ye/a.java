package Ye;

import Xe.d;
import android.text.TextUtils;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements p105h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f11375c = new d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f11376d = new byte[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11377e;

    public final String a() {
        d dVar = this.f11375c;
        dVar.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((AbstractMap) dVar.f1592b).entrySet()) {
            String str = (String) entry.getKey();
            JSONArray jSONArray = new JSONArray((Collection) entry.getValue());
            try {
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                jSONObject.put(str, jSONArray);
            } catch (JSONException e10) {
                G8.a.e("w", "", e10);
            }
        }
        return jSONObject.toString();
    }

    public final void b(String str) {
        try {
            d dVar = this.f11375c;
            ((AbstractMap) dVar.f1592b).clear();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONArray jSONArray = new JSONArray(jSONObject.optString(next));
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    dVar.e(jSONArray.optString(i7), next);
                }
            }
        } catch (JSONException e10) {
            G8.a.c(e10);
        }
    }

    @Override // p105h.b
    public final long getId() {
        return this.f11373a;
    }
}
