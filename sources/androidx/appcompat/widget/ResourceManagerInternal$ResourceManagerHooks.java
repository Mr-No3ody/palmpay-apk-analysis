package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public interface ResourceManagerInternal$ResourceManagerHooks {
    @Nullable
    Drawable createDrawableFor(@NonNull B0 b0, @NonNull Context context, @DrawableRes int i7);

    @Nullable
    ColorStateList getTintListForDrawableRes(@NonNull Context context, @DrawableRes int i7);

    @Nullable
    PorterDuff.Mode getTintModeForDrawableRes(int i7);

    boolean tintDrawable(@NonNull Context context, @DrawableRes int i7, @NonNull Drawable drawable);

    boolean tintDrawableUsingColorFilter(@NonNull Context context, @DrawableRes int i7, @NonNull Drawable drawable);
}
