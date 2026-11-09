package p311uc;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import com.horcrux.svg.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressBar f42958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f42959b;

    public a(ProgressBar progressBar, float f10) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f42958a = progressBar;
        this.f42959b = f10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation t) {
        Intrinsics.checkNotNullParameter(t, "t");
        super.applyTransformation(f10, t);
        this.f42958a.setProgress((int) d0.e(this.f42959b, 0.0f, f10, 0.0f));
    }
}
