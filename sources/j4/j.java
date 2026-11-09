package j4;

import android.text.TextUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f38294b = new i(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f38295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile j f38296d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f38297a = new Gson();

    static {
        String simpleName = j.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f38295c = simpleName;
    }

    public final Object a(String str, Class classOfT) {
        Intrinsics.checkNotNullParameter(classOfT, "classOfT");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return this.f38297a.fromJson(str, classOfT);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
