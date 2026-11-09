package androidx.core.graphics.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39802c})
public interface WrappedDrawable {
    Drawable getWrappedDrawable();

    void setWrappedDrawable(Drawable drawable);
}
