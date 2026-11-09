package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import face.security.device.api.FaceSecCode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.activity.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0819j implements ComponentActivity$ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12032a = SystemClock.uptimeMillis() + ((long) FaceSecCode.SC_SUCCESS);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f12033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.E f12035d;

    public ViewTreeObserverOnDrawListenerC0819j(androidx.fragment.app.E e10) {
        this.f12035d = e10;
    }

    @Override // androidx.activity.ComponentActivity$ReportFullyDrawnExecutor
    public final void activityDestroyed() {
        androidx.fragment.app.E e10 = this.f12035d;
        e10.getWindow().getDecorView().removeCallbacks(this);
        e10.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f12033b = runnable;
        View decorView = this.f12035d.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (!this.f12034c) {
            decorView.postOnAnimation(new W8.o(this, 9));
        } else if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f12033b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f12032a) {
                this.f12034c = false;
                this.f12035d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f12033b = null;
        v fullyDrawnReporter = this.f12035d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f12070b) {
            z3 = fullyDrawnReporter.f12071c;
        }
        if (z3) {
            this.f12034c = false;
            this.f12035d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12035d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // androidx.activity.ComponentActivity$ReportFullyDrawnExecutor
    public final void viewCreated(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f12034c) {
            return;
        }
        this.f12034c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }
}
