package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f18145a;

    public d(g gVar) {
        this.f18145a = gVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f18145a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        this.f18145a.scheduleSelf(runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f18145a.unscheduleSelf(runnable);
    }
}
