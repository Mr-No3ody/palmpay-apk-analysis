package Va;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ WindowInsetsAnimation.Bounds h(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation i(int i7, Interpolator interpolator, long j6) {
        return new WindowInsetsAnimation(i7, interpolator, j6);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation j(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void l() {
    }
}
