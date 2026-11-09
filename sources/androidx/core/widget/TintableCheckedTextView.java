package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public interface TintableCheckedTextView {
    @Nullable
    ColorStateList getSupportCheckMarkTintList();

    @Nullable
    PorterDuff.Mode getSupportCheckMarkTintMode();

    void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList);

    void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode);
}
