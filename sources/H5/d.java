package H5;

import android.content.res.ColorStateList;
import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final e colorInt(@ColorInt int i7) {
        return new f(i7, 0);
    }

    @JvmStatic
    @NotNull
    public final e colorList(@NotNull ColorStateList colorList) {
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        return new g(colorList);
    }

    @JvmStatic
    @NotNull
    public final e colorRes(@ColorRes int i7) {
        return new f(i7, 1);
    }

    @JvmStatic
    @NotNull
    public final e parse(@NotNull String colorString) {
        Intrinsics.checkNotNullParameter(colorString, "colorString");
        return colorInt(Color.parseColor(colorString));
    }

    private d() {
    }
}
