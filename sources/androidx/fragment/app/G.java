package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC1067t;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f17018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f17019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17022e;

    public G(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f17022e = true;
        this.f17018a = viewGroup;
        this.f17019b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation) {
        this.f17022e = true;
        if (this.f17020c) {
            return !this.f17021d;
        }
        if (!super.getTransformation(j6, transformation)) {
            this.f17020c = true;
            ViewTreeObserverOnPreDrawListenerC1067t.a(this.f17018a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = this.f17020c;
        ViewGroup viewGroup = this.f17018a;
        if (z3 || !this.f17022e) {
            viewGroup.endViewTransition(this.f17019b);
            this.f17021d = true;
        } else {
            this.f17022e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation, float f10) {
        this.f17022e = true;
        if (this.f17020c) {
            return !this.f17021d;
        }
        if (!super.getTransformation(j6, transformation, f10)) {
            this.f17020c = true;
            ViewTreeObserverOnPreDrawListenerC1067t.a(this.f17018a, this);
        }
        return true;
    }
}
