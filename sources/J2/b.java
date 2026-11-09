package J2;

import E2.c;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.VisibilityAwareDrawable;
import com.facebook.drawee.drawable.VisibilityCallback;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements VisibilityCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DraweeHierarchy f4486d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f4488f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4483a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4484b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4485c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DraweeController f4487e = null;

    public b(I2.a aVar) {
        this.f4488f = c.f2208c ? new c() : c.f2207b;
        if (aVar != null) {
            h(aVar);
        }
    }

    public final void a() {
        if (this.f4483a) {
            return;
        }
        this.f4488f.a(E2.b.f2200g);
        this.f4483a = true;
        DraweeController draweeController = this.f4487e;
        if (draweeController == null || draweeController.getHierarchy() == null) {
            return;
        }
        this.f4487e.onAttach();
    }

    public final void b() {
        if (this.f4484b && this.f4485c) {
            a();
            return;
        }
        if (this.f4483a) {
            this.f4488f.a(E2.b.f2201i);
            this.f4483a = false;
            if (d()) {
                this.f4487e.onDetach();
            }
        }
    }

    public final Drawable c() {
        DraweeHierarchy draweeHierarchy = this.f4486d;
        if (draweeHierarchy == null) {
            return null;
        }
        return draweeHierarchy.getTopLevelDrawable();
    }

    public final boolean d() {
        DraweeController draweeController = this.f4487e;
        return draweeController != null && draweeController.getHierarchy() == this.f4486d;
    }

    public final void e() {
        this.f4488f.a(E2.b.f2188A);
        this.f4484b = true;
        b();
    }

    public final void f() {
        this.f4488f.a(E2.b.f2189B);
        this.f4484b = false;
        b();
    }

    public final void g(DraweeController draweeController) {
        boolean z3 = this.f4483a;
        c cVar = this.f4488f;
        if (z3 && z3) {
            cVar.a(E2.b.f2201i);
            this.f4483a = false;
            if (d()) {
                this.f4487e.onDetach();
            }
        }
        if (d()) {
            cVar.a(E2.b.f2197d);
            this.f4487e.setHierarchy(null);
        }
        this.f4487e = draweeController;
        if (draweeController != null) {
            cVar.a(E2.b.f2196c);
            this.f4487e.setHierarchy(this.f4486d);
        } else {
            cVar.a(E2.b.f2198e);
        }
        if (z3) {
            a();
        }
    }

    public final void h(DraweeHierarchy draweeHierarchy) {
        this.f4488f.a(E2.b.f2194a);
        boolean zD = d();
        Object objC = c();
        if (objC instanceof VisibilityAwareDrawable) {
            ((VisibilityAwareDrawable) objC).setVisibilityCallback(null);
        }
        draweeHierarchy.getClass();
        this.f4486d = draweeHierarchy;
        Drawable topLevelDrawable = draweeHierarchy.getTopLevelDrawable();
        onVisibilityChange(topLevelDrawable == null || topLevelDrawable.isVisible());
        Object objC2 = c();
        if (objC2 instanceof VisibilityAwareDrawable) {
            ((VisibilityAwareDrawable) objC2).setVisibilityCallback(this);
        }
        if (zD) {
            this.f4487e.setHierarchy(draweeHierarchy);
        }
    }

    @Override // com.facebook.drawee.drawable.VisibilityCallback
    public final void onDraw() {
        if (this.f4483a) {
            return;
        }
        p229p2.a.u(c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f4487e)), toString());
        this.f4484b = true;
        this.f4485c = true;
        b();
    }

    @Override // com.facebook.drawee.drawable.VisibilityCallback
    public final void onVisibilityChange(boolean z3) {
        if (this.f4485c == z3) {
            return;
        }
        this.f4488f.a(z3 ? E2.b.f2190C : E2.b.f2191H);
        this.f4485c = z3;
        b();
    }

    public final String toString() {
        androidx.camera.video.internal.c cVarM = e.m(this);
        cVarM.b("controllerAttached", this.f4483a);
        cVarM.b("holderAttached", this.f4484b);
        cVarM.b("drawableVisible", this.f4485c);
        cVarM.c(this.f4488f.f2209a.toString(), "events");
        return cVarM.toString();
    }
}
