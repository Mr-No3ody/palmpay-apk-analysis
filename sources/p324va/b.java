package p324va;

import F6.d;
import okhttp3.L;
import okhttp3.c0;
import org.json.JSONObject;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Converter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L f43139b = L.f40589e.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43140a;

    @Override // retrofit2.Converter
    public final Object convert(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(this.f43140a, obj);
            return c0.create(f43139b, jSONObject.toString());
        } catch (Exception e10) {
            d.c("JsonRequestBodyConverter", "convert: ", e10);
            return null;
        }
    }
}
