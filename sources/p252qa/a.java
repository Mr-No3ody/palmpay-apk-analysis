package p252qa;

import Da.f;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.Set;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f41468a;

    static {
        String[] elements = {CommonResult.CODE_TOKEN_EXPIRED, "VL000301", "VL000302", "VL000304"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f41468a = C1847n.A(elements);
    }

    public static final void a(Activity activity) {
        f fVar = new f(activity, 5);
        if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            fVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(fVar);
        }
    }

    public static final String b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsonObject) {
            JsonElement jsonElement = ((JsonObject) obj).get("respCode");
            if (jsonElement == null || jsonElement.isJsonNull()) {
                return null;
            }
            return jsonElement.getAsString();
        }
        if (!(obj instanceof JsonElement)) {
            return null;
        }
        JsonElement jsonElement2 = (JsonElement) obj;
        if (jsonElement2.isJsonObject()) {
            return b(jsonElement2.getAsJsonObject());
        }
        return null;
    }
}
