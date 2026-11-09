package androidx.vectordrawable.graphics.drawable;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f18169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f18178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18179k;

    public k() {
        this.f18169a = new Matrix();
        this.f18170b = new ArrayList();
        this.f18171c = 0.0f;
        this.f18172d = 0.0f;
        this.f18173e = 0.0f;
        this.f18174f = 1.0f;
        this.f18175g = 1.0f;
        this.f18176h = 0.0f;
        this.f18177i = 0.0f;
        this.f18178j = new Matrix();
        this.f18179k = null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.l
    public final boolean a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f18170b;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i7)).a()) {
                return true;
            }
            i7++;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.l
    public final boolean b(int[] iArr) {
        int i7 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f18170b;
            if (i7 >= arrayList.size()) {
                return zB;
            }
            zB |= ((l) arrayList.get(i7)).b(iArr);
            i7++;
        }
    }

    public final void c() {
        Matrix matrix = this.f18178j;
        matrix.reset();
        matrix.postTranslate(-this.f18172d, -this.f18173e);
        matrix.postScale(this.f18174f, this.f18175g);
        matrix.postRotate(this.f18171c, 0.0f, 0.0f);
        matrix.postTranslate(this.f18176h + this.f18172d, this.f18177i + this.f18173e);
    }

    public String getGroupName() {
        return this.f18179k;
    }

    public Matrix getLocalMatrix() {
        return this.f18178j;
    }

    public float getPivotX() {
        return this.f18172d;
    }

    public float getPivotY() {
        return this.f18173e;
    }

    public float getRotation() {
        return this.f18171c;
    }

    public float getScaleX() {
        return this.f18174f;
    }

    public float getScaleY() {
        return this.f18175g;
    }

    public float getTranslateX() {
        return this.f18176h;
    }

    public float getTranslateY() {
        return this.f18177i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f18172d) {
            this.f18172d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f18173e) {
            this.f18173e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f18171c) {
            this.f18171c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f18174f) {
            this.f18174f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f18175g) {
            this.f18175g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f18176h) {
            this.f18176h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f18177i) {
            this.f18177i = f10;
            c();
        }
    }

    public k(k kVar, M.f fVar) {
        m iVar;
        this.f18169a = new Matrix();
        this.f18170b = new ArrayList();
        this.f18171c = 0.0f;
        this.f18172d = 0.0f;
        this.f18173e = 0.0f;
        this.f18174f = 1.0f;
        this.f18175g = 1.0f;
        this.f18176h = 0.0f;
        this.f18177i = 0.0f;
        Matrix matrix = new Matrix();
        this.f18178j = matrix;
        this.f18179k = null;
        this.f18171c = kVar.f18171c;
        this.f18172d = kVar.f18172d;
        this.f18173e = kVar.f18173e;
        this.f18174f = kVar.f18174f;
        this.f18175g = kVar.f18175g;
        this.f18176h = kVar.f18176h;
        this.f18177i = kVar.f18177i;
        String str = kVar.f18179k;
        this.f18179k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(kVar.f18178j);
        ArrayList arrayList = kVar.f18170b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Object obj = arrayList.get(i7);
            if (obj instanceof k) {
                this.f18170b.add(new k((k) obj, fVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    j jVar2 = new j(jVar);
                    jVar2.f18159e = 0.0f;
                    jVar2.f18161g = 1.0f;
                    jVar2.f18162h = 1.0f;
                    jVar2.f18163i = 0.0f;
                    jVar2.f18164j = 1.0f;
                    jVar2.f18165k = 0.0f;
                    jVar2.f18166l = Paint.Cap.BUTT;
                    jVar2.f18167m = Paint.Join.MITER;
                    jVar2.f18168n = 4.0f;
                    jVar2.f18158d = jVar.f18158d;
                    jVar2.f18159e = jVar.f18159e;
                    jVar2.f18161g = jVar.f18161g;
                    jVar2.f18160f = jVar.f18160f;
                    jVar2.f18182c = jVar.f18182c;
                    jVar2.f18162h = jVar.f18162h;
                    jVar2.f18163i = jVar.f18163i;
                    jVar2.f18164j = jVar.f18164j;
                    jVar2.f18165k = jVar.f18165k;
                    jVar2.f18166l = jVar.f18166l;
                    jVar2.f18167m = jVar.f18167m;
                    jVar2.f18168n = jVar.f18168n;
                    iVar = jVar2;
                } else if (obj instanceof i) {
                    iVar = new i((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f18170b.add(iVar);
                Object obj2 = iVar.f18181b;
                if (obj2 != null) {
                    fVar.put(obj2, iVar);
                }
            }
        }
    }
}
