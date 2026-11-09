package androidx.transition;

import android.view.View;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    @DoNotInline
    public static float a(View view) {
        return view.getTransitionAlpha();
    }

    @DoNotInline
    public static void b(View view, float f10) {
        view.setTransitionAlpha(f10);
    }
}
