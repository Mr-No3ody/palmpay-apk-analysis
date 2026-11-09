package p009a8;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.swmansion.rnscreens.ScreenFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenFragment f11829a;

    public a(ScreenFragment mFragment) {
        Intrinsics.checkNotNullParameter(mFragment, "mFragment");
        this.f11829a = mFragment;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation t) {
        Intrinsics.checkNotNullParameter(t, "t");
        super.applyTransformation(f10, t);
        ScreenFragment screenFragment = this.f11829a;
        screenFragment.dispatchTransitionProgressEvent(f10, !screenFragment.isResumed());
    }
}
