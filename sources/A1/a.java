package A1;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ AnimatedImageDrawable d(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* synthetic */ PrecomputedText.Params.Builder h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean v(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }
}
