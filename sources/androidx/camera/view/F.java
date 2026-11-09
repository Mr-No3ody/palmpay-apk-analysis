package androidx.camera.view;

import E.m0;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class F extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SurfaceView f14887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E f14888f;

    public F(FrameLayout frameLayout, j jVar) {
        super(frameLayout, jVar);
        this.f14888f = new E(this);
    }

    @Override // androidx.camera.view.r
    public final View a() {
        return this.f14887e;
    }

    @Override // androidx.camera.view.r
    public final Bitmap b() {
        SurfaceView surfaceView = this.f14887e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f14887e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f14887e.getWidth(), this.f14887e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.f14887e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.C
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i7) {
                if (i7 == 0) {
                    p140j8.f.G("SurfaceViewImpl");
                } else {
                    p140j8.f.g("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i7);
                }
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                p140j8.f.g("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e10) {
            p140j8.f.h("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e10);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.r
    public final void c() {
    }

    @Override // androidx.camera.view.r
    public final void d() {
    }

    @Override // androidx.camera.view.r
    public final void e(final m0 m0Var, final l lVar) {
        SurfaceView surfaceView = this.f14887e;
        Size size = this.f15005a;
        Size size2 = m0Var.f2056b;
        boolean zEquals = Objects.equals(size, size2);
        if (surfaceView == null || !zEquals) {
            this.f15005a = size2;
            FrameLayout frameLayout = this.f15006b;
            size2.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.f14887e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.f15005a.getWidth(), this.f15005a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.f14887e);
            this.f14887e.getHolder().addCallback(this.f14888f);
        }
        Executor executorD = androidx.core.content.d.d(this.f14887e.getContext());
        m0Var.f2065k.a(new y(lVar, 1), executorD);
        this.f14887e.post(new Runnable() { // from class: androidx.camera.view.B
            @Override // java.lang.Runnable
            public final void run() {
                E e10 = this.f14873a.f14888f;
                m0 m0Var2 = e10.f14880b;
                if (m0Var2 != null) {
                    Objects.toString(m0Var2);
                    p140j8.f.G("SurfaceViewImpl");
                    e10.f14880b.d();
                }
                boolean z3 = e10.f14885g;
                m0 m0Var3 = m0Var;
                if (z3) {
                    e10.f14885g = false;
                    m0Var3.d();
                    m0Var3.f2064j.b(null);
                    return;
                }
                e10.f14880b = m0Var3;
                e10.f14882d = lVar;
                Size size3 = m0Var3.f2056b;
                e10.f14879a = size3;
                e10.f14884f = false;
                if (e10.a()) {
                    return;
                }
                p140j8.f.G("SurfaceViewImpl");
                e10.f14886i.f14887e.getHolder().setFixedSize(size3.getWidth(), size3.getHeight());
            }
        });
    }

    @Override // androidx.camera.view.r
    public final ListenableFuture g() {
        return androidx.camera.core.impl.utils.futures.l.f14212c;
    }
}
