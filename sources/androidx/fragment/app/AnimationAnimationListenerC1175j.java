package androidx.fragment.app;

import android.view.View;
import android.view.animation.Animation;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC1175j implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f17148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1176k f17149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f17150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1171f f17151d;

    public AnimationAnimationListenerC1175j(x0 x0Var, C1176k c1176k, View view, C1171f c1171f) {
        this.f17148a = x0Var;
        this.f17149b = c1176k;
        this.f17150c = view;
        this.f17151d = c1171f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        C1176k c1176k = this.f17149b;
        c1176k.f16974a.post(new RunnableC1165c(c1176k, this.f17150c, this.f17151d));
        if (Z.L(2)) {
            Objects.toString(this.f17148a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (Z.L(2)) {
            Objects.toString(this.f17148a);
        }
    }
}
