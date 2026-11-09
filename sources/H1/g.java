package H1;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends m implements Transition.ViewAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Animatable f3590e;

    public abstract void a(Object obj);

    @Override // com.bumptech.glide.request.transition.Transition.ViewAdapter
    public final Drawable getCurrentDrawable() {
        return this.f3604b.getDrawable();
    }

    @Override // H1.m, H1.a, com.bumptech.glide.request.target.Target
    public final void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f3590e;
        if (animatable != null) {
            animatable.stop();
        }
        a(null);
        this.f3590e = null;
        setDrawable(drawable);
    }

    @Override // H1.a, com.bumptech.glide.request.target.Target
    public final void onLoadFailed(Drawable drawable) {
        a(null);
        this.f3590e = null;
        setDrawable(drawable);
    }

    @Override // H1.a, com.bumptech.glide.request.target.Target
    public final void onLoadStarted(Drawable drawable) {
        a(null);
        this.f3590e = null;
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object obj, Transition transition) {
        if (transition != null && transition.transition(obj, this)) {
            if (!(obj instanceof Animatable)) {
                this.f3590e = null;
                return;
            }
            Animatable animatable = (Animatable) obj;
            this.f3590e = animatable;
            animatable.start();
            return;
        }
        a(obj);
        if (!(obj instanceof Animatable)) {
            this.f3590e = null;
            return;
        }
        Animatable animatable2 = (Animatable) obj;
        this.f3590e = animatable2;
        animatable2.start();
    }

    @Override // H1.a, com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
        Animatable animatable = this.f3590e;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // H1.a, com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
        Animatable animatable = this.f3590e;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.request.transition.Transition.ViewAdapter
    public final void setDrawable(Drawable drawable) {
        this.f3604b.setImageDrawable(drawable);
    }
}
