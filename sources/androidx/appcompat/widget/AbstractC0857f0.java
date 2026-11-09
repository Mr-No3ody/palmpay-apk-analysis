package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: androidx.appcompat.widget.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0857f0 {
    @DoNotInline
    public static Insets a(Drawable drawable) {
        return drawable.getOpticalInsets();
    }
}
