package androidx.camera.view;

import E.m0;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class E implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f14879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f14880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f14881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f14882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Size f14883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14884f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14885g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F f14886i;

    public E(F f10) {
        this.f14886i = f10;
    }

    public final boolean a() {
        F f10 = this.f14886i;
        Surface surface = f10.f14887e.getHolder().getSurface();
        if (this.f14884f || this.f14880b == null || !Objects.equals(this.f14879a, this.f14883e)) {
            return false;
        }
        p140j8.f.G("SurfaceViewImpl");
        l lVar = this.f14882d;
        m0 m0Var = this.f14880b;
        Objects.requireNonNull(m0Var);
        m0Var.b(surface, androidx.core.content.d.d(f10.f14887e.getContext()), new D(lVar, 0));
        this.f14884f = true;
        f10.f15008d = true;
        f10.f();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
        p140j8.f.G("SurfaceViewImpl");
        this.f14883e = new Size(i10, i11);
        a();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        m0 m0Var;
        p140j8.f.G("SurfaceViewImpl");
        if (!this.f14885g || (m0Var = this.f14881c) == null) {
            return;
        }
        m0Var.d();
        m0Var.f2064j.b(null);
        this.f14881c = null;
        this.f14885g = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        p140j8.f.G("SurfaceViewImpl");
        if (this.f14884f) {
            m0 m0Var = this.f14880b;
            if (m0Var != null) {
                Objects.toString(m0Var);
                p140j8.f.G("SurfaceViewImpl");
                this.f14880b.f2066l.a();
            }
        } else {
            m0 m0Var2 = this.f14880b;
            if (m0Var2 != null) {
                Objects.toString(m0Var2);
                p140j8.f.G("SurfaceViewImpl");
                this.f14880b.d();
            }
        }
        this.f14885g = true;
        m0 m0Var3 = this.f14880b;
        if (m0Var3 != null) {
            this.f14881c = m0Var3;
        }
        this.f14884f = false;
        this.f14880b = null;
        this.f14882d = null;
        this.f14883e = null;
        this.f14879a = null;
    }
}
