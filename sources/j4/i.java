package j4;

import android.text.TextUtils;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final j get() {
        if (j.f38296d == null) {
            synchronized (j.class) {
                try {
                    if (j.f38296d == null) {
                        j.f38296d = new j();
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        j jVar = j.f38296d;
        Intrinsics.e(jVar);
        return jVar;
    }

    public final boolean getJsonBoolean(@Nullable String str, @Nullable String str2, boolean z3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new JSONObject(str).optBoolean(str2, z3);
            } catch (JSONException e10) {
                Log.e(j.f38295c, "getJsonBoolean: ", e10);
            }
        }
        return z3;
    }

    @NotNull
    public final String getJsonString(@Nullable String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String string = new JSONObject(str).getString(str2);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private i() {
    }
}
