package p077f4;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.L;
import okhttp3.b0;
import okhttp3.c0;
import org.json.JSONObject;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Converter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L f36384c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36385a;

    static {
        new c(null);
        String simpleName = d.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f36383b = simpleName;
        f36384c = L.f40589e.parse("application/json; charset=UTF-8");
    }

    public d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f36385a = name;
    }

    @Override // retrofit2.Converter
    public final Object convert(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(this.f36385a, obj);
            b0 b0Var = c0.Companion;
            L l5 = f36384c;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return b0Var.create(l5, string);
        } catch (Exception e10) {
            Log.e(f36383b, "convert: ", e10);
            return null;
        }
    }
}
