package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable implements GifFrameLoader$FrameCallback, Animatable, Animatable2Compat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.vectordrawable.graphics.drawable.f f20982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20985d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20987f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f20990j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Rect f20991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f20992p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20986e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20988g = -1;

    public d(androidx.vectordrawable.graphics.drawable.f fVar) {
        this.f20982a = fVar;
    }

    public final void a() {
        J1.g.a(!this.f20985d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        h hVar = (h) this.f20982a.f18151b;
        if (hVar.f20999a.f20486m.f43240c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f20983b) {
            return;
        }
        this.f20983b = true;
        if (hVar.f21008j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = hVar.f21001c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !hVar.f21004f) {
            hVar.f21004f = true;
            hVar.f21008j = false;
            hVar.a();
        }
        invalidateSelf();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void clearAnimationCallbacks() {
        ArrayList arrayList = this.f20992p;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f20985d) {
            return;
        }
        if (this.f20989i) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f20991o == null) {
                this.f20991o = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f20991o);
            this.f20989i = false;
        }
        h hVar = (h) this.f20982a.f18151b;
        f fVar = hVar.f21007i;
        Bitmap bitmap = fVar != null ? fVar.f20997d : hVar.f21010l;
        if (this.f20991o == null) {
            this.f20991o = new Rect();
        }
        Rect rect = this.f20991o;
        if (this.f20990j == null) {
            this.f20990j = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f20990j);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f20982a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((h) this.f20982a.f18151b).f21015q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((h) this.f20982a.f18151b).f21014p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f20983b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f20989i = true;
    }

    @Override // com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameCallback
    public final void onFrameReady() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        h hVar = (h) this.f20982a.f18151b;
        f fVar = hVar.f21007i;
        if ((fVar != null ? fVar.f20995b : -1) == hVar.f20999a.f20486m.f43240c - 1) {
            this.f20987f++;
        }
        int i7 = this.f20988g;
        if (i7 == -1 || this.f20987f < i7) {
            return;
        }
        ArrayList arrayList = this.f20992p;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.c) this.f20992p.get(i10)).onAnimationEnd(this);
            }
        }
        stop();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.c cVar) {
        if (cVar == null) {
            return;
        }
        if (this.f20992p == null) {
            this.f20992p = new ArrayList();
        }
        this.f20992p.add(cVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f20990j == null) {
            this.f20990j = new Paint(2);
        }
        this.f20990j.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f20990j == null) {
            this.f20990j = new Paint(2);
        }
        this.f20990j.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z8) {
        J1.g.a(!this.f20985d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f20986e = z3;
        if (!z3) {
            this.f20983b = false;
            h hVar = (h) this.f20982a.f18151b;
            ArrayList arrayList = hVar.f21001c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                hVar.f21004f = false;
            }
        } else if (this.f20984c) {
            a();
        }
        return super.setVisible(z3, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f20984c = true;
        this.f20987f = 0;
        if (this.f20986e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f20984c = false;
        this.f20983b = false;
        h hVar = (h) this.f20982a.f18151b;
        ArrayList arrayList = hVar.f21001c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            hVar.f21004f = false;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.c cVar) {
        ArrayList arrayList = this.f20992p;
        if (arrayList == null || cVar == null) {
            return false;
        }
        return arrayList.remove(cVar);
    }
}
