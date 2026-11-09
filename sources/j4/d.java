package j4;

import C0.G;
import android.util.Log;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int getDrawableResourceId(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
        String lowerCase = locale.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strO = G.o("fb_country_", lowerCase);
        try {
            return com.flexibank.sdk.o.class.getField(strO).getInt(strO);
        } catch (IllegalAccessException e10) {
            Log.e(f.f38288c, "getDrawableResourceId 2: ", e10);
            return com.flexibank.sdk.o.fb_country_ng;
        } catch (NoSuchFieldException e11) {
            Log.e(f.f38288c, "getDrawableResourceId 1: ", e11);
            return com.flexibank.sdk.o.fb_country_ng;
        }
    }

    @NotNull
    public final f getInstance() {
        f fVar = e.f38286a;
        return e.f38286a;
    }

    private d() {
    }
}
