package p243q1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.b;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f41420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f41422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f41423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f41424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f41425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f41426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f41427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f41428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f41429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f41431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f41432m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f41433n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f41434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f41435p;

    public a(k kVar, Object obj, Object obj2, Interpolator interpolator, float f10, Float f11) {
        this.f41428i = -3987645.8f;
        this.f41429j = -3987645.8f;
        this.f41430k = 784923401;
        this.f41431l = 784923401;
        this.f41432m = Float.MIN_VALUE;
        this.f41433n = Float.MIN_VALUE;
        this.f41434o = null;
        this.f41435p = null;
        this.f41420a = kVar;
        this.f41421b = obj;
        this.f41422c = obj2;
        this.f41423d = interpolator;
        this.f41424e = null;
        this.f41425f = null;
        this.f41426g = f10;
        this.f41427h = f11;
    }

    public final float a() {
        k kVar = this.f41420a;
        if (kVar == null) {
            return 1.0f;
        }
        if (this.f41433n == Float.MIN_VALUE) {
            if (this.f41427h == null) {
                this.f41433n = 1.0f;
            } else {
                this.f41433n = (float) (((double) b()) + (((double) (this.f41427h.floatValue() - this.f41426g)) / ((double) (kVar.f19886m - kVar.f19885l))));
            }
        }
        return this.f41433n;
    }

    public final float b() {
        k kVar = this.f41420a;
        if (kVar == null) {
            return 0.0f;
        }
        if (this.f41432m == Float.MIN_VALUE) {
            float f10 = kVar.f19885l;
            this.f41432m = (this.f41426g - f10) / (kVar.f19886m - f10);
        }
        return this.f41432m;
    }

    public final boolean c() {
        return this.f41423d == null && this.f41424e == null && this.f41425f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f41421b + ", endValue=" + this.f41422c + ", startFrame=" + this.f41426g + ", endFrame=" + this.f41427h + ", interpolator=" + this.f41423d + '}';
    }

    public a(k kVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10) {
        this.f41428i = -3987645.8f;
        this.f41429j = -3987645.8f;
        this.f41430k = 784923401;
        this.f41431l = 784923401;
        this.f41432m = Float.MIN_VALUE;
        this.f41433n = Float.MIN_VALUE;
        this.f41434o = null;
        this.f41435p = null;
        this.f41420a = kVar;
        this.f41421b = obj;
        this.f41422c = obj2;
        this.f41423d = null;
        this.f41424e = interpolator;
        this.f41425f = interpolator2;
        this.f41426g = f10;
        this.f41427h = null;
    }

    public a(k kVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f41428i = -3987645.8f;
        this.f41429j = -3987645.8f;
        this.f41430k = 784923401;
        this.f41431l = 784923401;
        this.f41432m = Float.MIN_VALUE;
        this.f41433n = Float.MIN_VALUE;
        this.f41434o = null;
        this.f41435p = null;
        this.f41420a = kVar;
        this.f41421b = obj;
        this.f41422c = obj2;
        this.f41423d = interpolator;
        this.f41424e = interpolator2;
        this.f41425f = interpolator3;
        this.f41426g = f10;
        this.f41427h = f11;
    }

    public a(Object obj) {
        this.f41428i = -3987645.8f;
        this.f41429j = -3987645.8f;
        this.f41430k = 784923401;
        this.f41431l = 784923401;
        this.f41432m = Float.MIN_VALUE;
        this.f41433n = Float.MIN_VALUE;
        this.f41434o = null;
        this.f41435p = null;
        this.f41420a = null;
        this.f41421b = obj;
        this.f41422c = obj;
        this.f41423d = null;
        this.f41424e = null;
        this.f41425f = null;
        this.f41426g = Float.MIN_VALUE;
        this.f41427h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(b bVar, b bVar2) {
        this.f41428i = -3987645.8f;
        this.f41429j = -3987645.8f;
        this.f41430k = 784923401;
        this.f41431l = 784923401;
        this.f41432m = Float.MIN_VALUE;
        this.f41433n = Float.MIN_VALUE;
        this.f41434o = null;
        this.f41435p = null;
        this.f41420a = null;
        this.f41421b = bVar;
        this.f41422c = bVar2;
        this.f41423d = null;
        this.f41424e = null;
        this.f41425f = null;
        this.f41426g = Float.MIN_VALUE;
        this.f41427h = Float.valueOf(Float.MAX_VALUE);
    }
}
