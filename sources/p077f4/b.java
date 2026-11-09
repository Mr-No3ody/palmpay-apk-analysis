package p077f4;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.L;
import okhttp3.b0;
import okhttp3.c0;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Converter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L f36381b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f36382a;

    static {
        new a(null);
        f36381b = L.f40589e.parse("application/json; charset=UTF-8");
    }

    public b(Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f36382a = gson;
    }

    @Override // retrofit2.Converter
    public final Object convert(Object obj) {
        String json = this.f36382a.toJson(obj);
        b0 b0Var = c0.Companion;
        Intrinsics.e(json);
        byte[] bytes = json.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return b0.create$default(b0Var, f36381b, bytes, 0, 0, 12, (Object) null);
    }
}
