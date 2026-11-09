package androidx.transition;

import android.view.ViewGroup;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    @DoNotInline
    public static int a(ViewGroup viewGroup, int i7) {
        return viewGroup.getChildDrawingOrder(i7);
    }

    @DoNotInline
    public static void b(ViewGroup viewGroup, boolean z3) {
        viewGroup.suppressLayout(z3);
    }
}
