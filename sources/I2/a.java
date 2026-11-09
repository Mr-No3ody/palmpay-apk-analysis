package I2;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.drawable.DrawableParent;
import com.facebook.drawee.drawable.f;
import com.facebook.drawee.drawable.m;
import com.facebook.drawee.drawable.n;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.interfaces.SettableDraweeHierarchy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements SettableDraweeHierarchy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorDrawable f3965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f3966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f3967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f3968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.facebook.drawee.drawable.e f3969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f3970f;

    public a(b bVar) {
        int i7;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f3965a = colorDrawable;
        p181m3.a.a();
        this.f3966b = bVar.f3973a;
        this.f3967c = bVar.f3988p;
        f fVar = new f(colorDrawable);
        this.f3970f = fVar;
        List list = bVar.f3986n;
        int size = list != null ? list.size() : 1;
        int i10 = (size == 0 ? 1 : size) + (bVar.f3987o != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i10 + 6];
        drawableArr[0] = a(bVar.f3985m, null);
        drawableArr[1] = a(bVar.f3976d, bVar.f3977e);
        n nVar = bVar.f3984l;
        fVar.setColorFilter(null);
        drawableArr[2] = e.e(fVar, nVar);
        drawableArr[3] = a(bVar.f3982j, bVar.f3983k);
        drawableArr[4] = a(bVar.f3978f, bVar.f3979g);
        drawableArr[5] = a(bVar.f3980h, bVar.f3981i);
        if (i10 > 0) {
            List list2 = bVar.f3986n;
            if (list2 != null) {
                Iterator it = list2.iterator();
                i7 = 0;
                while (it.hasNext()) {
                    drawableArr[i7 + 6] = a((Drawable) it.next(), null);
                    i7++;
                }
            } else {
                i7 = 1;
            }
            StateListDrawable stateListDrawable = bVar.f3987o;
            if (stateListDrawable != null) {
                drawableArr[i7 + 6] = a(stateListDrawable, null);
            }
        }
        com.facebook.drawee.drawable.e eVar = new com.facebook.drawee.drawable.e(drawableArr);
        this.f3969e = eVar;
        eVar.t = bVar.f3974b;
        if (eVar.f21250p == 1) {
            eVar.f21250p = 0;
        }
        c cVar = new c(e.d(eVar, this.f3967c));
        cVar.f3989a = null;
        this.f3968d = cVar;
        cVar.mutate();
        g();
        p181m3.a.a();
    }

    public final Drawable a(Drawable drawable, n nVar) {
        return e.e(e.c(drawable, this.f3967c, this.f3966b), nVar);
    }

    public final void b(int i7) {
        if (i7 >= 0) {
            com.facebook.drawee.drawable.e eVar = this.f3969e;
            eVar.f21250p = 0;
            eVar.f21236C[i7] = true;
            eVar.invalidateSelf();
        }
    }

    public final void c() {
        d(1);
        d(2);
        d(3);
        d(4);
        d(5);
    }

    public final void d(int i7) {
        if (i7 >= 0) {
            com.facebook.drawee.drawable.e eVar = this.f3969e;
            eVar.f21250p = 0;
            eVar.f21236C[i7] = false;
            eVar.invalidateSelf();
        }
    }

    public final DrawableParent e(int i7) {
        com.facebook.drawee.drawable.e eVar = this.f3969e;
        eVar.getClass();
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException();
        }
        DrawableParent[] drawableParentArr = eVar.f21243d;
        if (!(i7 < drawableParentArr.length)) {
            throw new IllegalArgumentException();
        }
        if (drawableParentArr[i7] == null) {
            drawableParentArr[i7] = new com.facebook.drawee.drawable.a(eVar, i7);
        }
        DrawableParent drawableParent = drawableParentArr[i7];
        drawableParent.getDrawable();
        return drawableParent.getDrawable() instanceof m ? (m) drawableParent.getDrawable() : drawableParent;
    }

    public final m f(int i7) {
        DrawableParent drawableParentE = e(i7);
        if (drawableParentE instanceof m) {
            return (m) drawableParentE;
        }
        Drawable drawableE = e.e(drawableParentE.setDrawable(e.f3999a), o.f21336i);
        drawableParentE.setDrawable(drawableE);
        p213o2.e.e(drawableE, "Parent has no child drawable!");
        return (m) drawableE;
    }

    public final void g() {
        com.facebook.drawee.drawable.e eVar = this.f3969e;
        if (eVar != null) {
            eVar.f21237H++;
            eVar.f21250p = 0;
            Arrays.fill(eVar.f21236C, true);
            eVar.invalidateSelf();
            c();
            b(1);
            eVar.b();
            eVar.a();
        }
    }

    @Override // com.facebook.drawee.interfaces.DraweeHierarchy
    public final Rect getBounds() {
        return this.f3968d.getBounds();
    }

    @Override // com.facebook.drawee.interfaces.DraweeHierarchy
    public final Drawable getTopLevelDrawable() {
        return this.f3968d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(float f10) {
        Drawable drawableC = this.f3969e.c(3);
        if (drawableC == 0) {
            return;
        }
        if (f10 >= 0.999f) {
            if (drawableC instanceof Animatable) {
                ((Animatable) drawableC).stop();
            }
            d(3);
        } else {
            if (drawableC instanceof Animatable) {
                ((Animatable) drawableC).start();
            }
            b(3);
        }
        drawableC.setLevel(Math.round(f10 * 10000.0f));
    }

    @Override // com.facebook.drawee.interfaces.SettableDraweeHierarchy
    public final void reset() {
        this.f3970f.setDrawable(this.f3965a);
        g();
    }

    @Override // com.facebook.drawee.interfaces.SettableDraweeHierarchy
    public final void setControllerOverlay(Drawable drawable) {
        c cVar = this.f3968d;
        cVar.f3989a = drawable;
        cVar.invalidateSelf();
    }

    @Override // com.facebook.drawee.interfaces.SettableDraweeHierarchy
    public final void setFailure(Throwable th) {
        com.facebook.drawee.drawable.e eVar = this.f3969e;
        eVar.f21237H++;
        c();
        if (eVar.c(5) != null) {
            b(5);
        } else {
            b(1);
        }
        eVar.a();
    }

    @Override // com.facebook.drawee.interfaces.SettableDraweeHierarchy
    public final void setImage(Drawable drawable, float f10, boolean z3) {
        Drawable drawableC = e.c(drawable, this.f3967c, this.f3966b);
        drawableC.mutate();
        this.f3970f.setDrawable(drawableC);
        com.facebook.drawee.drawable.e eVar = this.f3969e;
        eVar.f21237H++;
        c();
        b(2);
        h(f10);
        if (z3) {
            eVar.b();
        }
        eVar.a();
    }

    @Override // com.facebook.drawee.interfaces.SettableDraweeHierarchy
    public final void setProgress(float f10, boolean z3) {
        com.facebook.drawee.drawable.e eVar = this.f3969e;
        if (eVar.c(3) == null) {
            return;
        }
        eVar.f21237H++;
        h(f10);
        if (z3) {
            eVar.b();
        }
        eVar.a();
    }

    @Override // com.facebook.drawee.interfaces.SettableDraweeHierarchy
    public final void setRetry(Throwable th) {
        com.facebook.drawee.drawable.e eVar = this.f3969e;
        eVar.f21237H++;
        c();
        if (eVar.c(4) != null) {
            b(4);
        } else {
            b(1);
        }
        eVar.a();
    }
}
