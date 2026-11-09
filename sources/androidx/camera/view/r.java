package androidx.camera.view;

import E.m0;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f15005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f15006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f15007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15008d = false;

    public r(FrameLayout frameLayout, j jVar) {
        this.f15006b = frameLayout;
        this.f15007c = jVar;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(m0 m0Var, l lVar);

    public final void f() {
        View viewA = a();
        if (viewA == null || !this.f15008d) {
            return;
        }
        FrameLayout frameLayout = this.f15006b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        j jVar = this.f15007c;
        jVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            p140j8.f.G("PreviewTransform");
            return;
        }
        if (jVar.f()) {
            if (viewA instanceof TextureView) {
                ((TextureView) viewA).setTransform(jVar.d());
            } else {
                Display display = viewA.getDisplay();
                boolean z3 = false;
                boolean z8 = (!jVar.f14985g || display == null || display.getRotation() == jVar.f14983e) ? false : true;
                boolean z10 = jVar.f14985g;
                if (!z10) {
                    if ((!z10 ? jVar.f14981c : -com.facebook.imagepipeline.nativecode.b.V(jVar.f14983e)) != 0) {
                        z3 = true;
                    }
                }
                if (z8 || z3) {
                    p140j8.f.g("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFE = jVar.e(size, layoutDirection);
            viewA.setPivotX(0.0f);
            viewA.setPivotY(0.0f);
            viewA.setScaleX(rectFE.width() / jVar.f14979a.getWidth());
            viewA.setScaleY(rectFE.height() / jVar.f14979a.getHeight());
            viewA.setTranslationX(rectFE.left - viewA.getLeft());
            viewA.setTranslationY(rectFE.top - viewA.getTop());
        }
    }

    public abstract ListenableFuture g();
}
