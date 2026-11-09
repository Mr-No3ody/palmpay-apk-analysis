package G1;

import J1.o;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.g;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.resource.bitmap.AbstractC1332d;
import com.bumptech.glide.load.resource.bitmap.C1335g;
import com.bumptech.glide.load.resource.bitmap.i;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.load.resource.bitmap.t;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mikepenz.iconics.IconicsDrawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f2897H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Resources.Theme f2898L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f2899M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f2900Q;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f2902Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2903a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconicsDrawable f2907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f2909g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2910i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2914v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f2915w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2904b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f2905c = k.f20706e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f2906d = g.f20471c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2911j = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2912o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2913p = -1;
    public Key t = I1.c.f3963b;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public h f2894A = new h();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public J1.d f2895B = new J1.d(0);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Class f2896C = Object.class;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f2901X = true;

    public static boolean o(int i7, int i10) {
        return (i7 & i10) != 0;
    }

    public final a A(com.bumptech.glide.load.g gVar) {
        if (this.f2899M) {
            return clone().A(gVar);
        }
        this.f2894A.f20807b.remove(gVar);
        B();
        return this;
    }

    public final void B() {
        if (this.f2897H) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public a C(com.bumptech.glide.load.g gVar, Object obj) {
        if (this.f2899M) {
            return clone().C(gVar, obj);
        }
        J1.g.b(gVar);
        J1.g.b(obj);
        this.f2894A.f20807b.put(gVar, obj);
        B();
        return this;
    }

    public a D(Key key) {
        if (this.f2899M) {
            return clone().D(key);
        }
        this.t = key;
        this.f2903a |= 1024;
        B();
        return this;
    }

    public a E() {
        if (this.f2899M) {
            return clone().E();
        }
        this.f2904b = 0.5f;
        this.f2903a |= 2;
        B();
        return this;
    }

    public a F(boolean z3) {
        if (this.f2899M) {
            return clone().F(true);
        }
        this.f2911j = !z3;
        this.f2903a |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        B();
        return this;
    }

    public a G(Resources.Theme theme) {
        if (this.f2899M) {
            return clone().G(theme);
        }
        this.f2898L = theme;
        if (theme != null) {
            this.f2903a |= 32768;
            return C(C1.e.f1138b, theme);
        }
        this.f2903a &= -32769;
        return A(C1.e.f1138b);
    }

    public a H(Transformation transformation) {
        return I(transformation, true);
    }

    public final a I(Transformation transformation, boolean z3) {
        if (this.f2899M) {
            return clone().I(transformation, z3);
        }
        r rVar = new r(transformation, z3);
        K(Bitmap.class, transformation, z3);
        K(Drawable.class, rVar, z3);
        K(BitmapDrawable.class, rVar, z3);
        K(com.bumptech.glide.load.resource.gif.d.class, new com.bumptech.glide.load.resource.gif.e(transformation), z3);
        B();
        return this;
    }

    public final a J(m mVar, AbstractC1332d abstractC1332d) {
        if (this.f2899M) {
            return clone().J(mVar, abstractC1332d);
        }
        i(mVar);
        return H(abstractC1332d);
    }

    public final a K(Class cls, Transformation transformation, boolean z3) {
        if (this.f2899M) {
            return clone().K(cls, transformation, z3);
        }
        J1.g.b(transformation);
        this.f2895B.put(cls, transformation);
        int i7 = this.f2903a;
        this.f2903a = 67584 | i7;
        this.f2901X = false;
        if (z3) {
            this.f2903a = i7 | 198656;
            this.f2914v = true;
        }
        B();
        return this;
    }

    public a L(Transformation... transformationArr) {
        if (transformationArr.length > 1) {
            return I(new com.bumptech.glide.load.f(transformationArr), true);
        }
        if (transformationArr.length == 1) {
            return H(transformationArr[0]);
        }
        B();
        return this;
    }

    public a M() {
        if (this.f2899M) {
            return clone().M();
        }
        this.f2902Y = true;
        this.f2903a |= 1048576;
        B();
        return this;
    }

    public a a(a aVar) {
        if (this.f2899M) {
            return clone().a(aVar);
        }
        if (o(aVar.f2903a, 2)) {
            this.f2904b = aVar.f2904b;
        }
        if (o(aVar.f2903a, 1048576)) {
            this.f2902Y = aVar.f2902Y;
        }
        if (o(aVar.f2903a, 4)) {
            this.f2905c = aVar.f2905c;
        }
        if (o(aVar.f2903a, 8)) {
            this.f2906d = aVar.f2906d;
        }
        if (o(aVar.f2903a, 16)) {
            this.f2907e = aVar.f2907e;
            this.f2908f = 0;
            this.f2903a &= -33;
        }
        if (o(aVar.f2903a, 32)) {
            this.f2908f = aVar.f2908f;
            this.f2907e = null;
            this.f2903a &= -17;
        }
        if (o(aVar.f2903a, 64)) {
            this.f2909g = aVar.f2909g;
            this.f2910i = 0;
            this.f2903a &= -129;
        }
        if (o(aVar.f2903a, 128)) {
            this.f2910i = aVar.f2910i;
            this.f2909g = null;
            this.f2903a &= -65;
        }
        if (o(aVar.f2903a, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER)) {
            this.f2911j = aVar.f2911j;
        }
        if (o(aVar.f2903a, 512)) {
            this.f2913p = aVar.f2913p;
            this.f2912o = aVar.f2912o;
        }
        if (o(aVar.f2903a, 1024)) {
            this.t = aVar.t;
        }
        if (o(aVar.f2903a, 4096)) {
            this.f2896C = aVar.f2896C;
        }
        if (o(aVar.f2903a, UserMetadata.MAX_INTERNAL_KEY_SIZE)) {
            this.f2915w = aVar.f2915w;
            this.f2903a &= -16385;
        }
        if (o(aVar.f2903a, 16384)) {
            this.f2915w = null;
            this.f2903a &= -8193;
        }
        if (o(aVar.f2903a, 32768)) {
            this.f2898L = aVar.f2898L;
        }
        if (o(aVar.f2903a, 131072)) {
            this.f2914v = aVar.f2914v;
        }
        if (o(aVar.f2903a, 2048)) {
            this.f2895B.putAll(aVar.f2895B);
            this.f2901X = aVar.f2901X;
        }
        if (o(aVar.f2903a, 524288)) {
            this.f2900Q = aVar.f2900Q;
        }
        this.f2903a |= aVar.f2903a;
        this.f2894A.f20807b.g(aVar.f2894A.f20807b);
        B();
        return this;
    }

    public a b() {
        if (this.f2897H && !this.f2899M) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f2899M = true;
        return p();
    }

    public a c() {
        return J(m.f20927d, new C1335g());
    }

    public a d() {
        return J(m.f20926c, new i());
    }

    @Override // 
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            h hVar = new h();
            aVar.f2894A = hVar;
            hVar.f20807b.g(this.f2894A.f20807b);
            J1.d dVar = new J1.d(0);
            aVar.f2895B = dVar;
            dVar.putAll(this.f2895B);
            aVar.f2897H = false;
            aVar.f2899M = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return n((a) obj);
        }
        return false;
    }

    public a f(Class cls) {
        if (this.f2899M) {
            return clone().f(cls);
        }
        this.f2896C = cls;
        this.f2903a |= 4096;
        B();
        return this;
    }

    public a g(k kVar) {
        if (this.f2899M) {
            return clone().g(kVar);
        }
        this.f2905c = kVar;
        this.f2903a |= 4;
        B();
        return this;
    }

    public a h() {
        return C(com.bumptech.glide.load.resource.gif.i.f21017b, Boolean.TRUE);
    }

    public int hashCode() {
        float f10 = this.f2904b;
        char[] cArr = o.f4478a;
        return o.h(o.h(o.h(o.h(o.h(o.h(o.h(o.g(this.f2900Q ? 1 : 0, o.g(0, o.g(1, o.g(this.f2914v ? 1 : 0, o.g(this.f2913p, o.g(this.f2912o, o.g(this.f2911j ? 1 : 0, o.h(o.g(0, o.h(o.g(this.f2910i, o.h(o.g(this.f2908f, o.g(Float.floatToIntBits(f10), 17)), this.f2907e)), this.f2909g)), this.f2915w)))))))), this.f2905c), this.f2906d), this.f2894A), this.f2895B), this.f2896C), this.t), this.f2898L);
    }

    public a i(m mVar) {
        return C(m.f20930g, mVar);
    }

    public a j(int i7) {
        if (this.f2899M) {
            return clone().j(i7);
        }
        this.f2908f = i7;
        int i10 = this.f2903a | 32;
        this.f2907e = null;
        this.f2903a = i10 & (-17);
        B();
        return this;
    }

    public a k(IconicsDrawable iconicsDrawable) {
        if (this.f2899M) {
            return clone().k(iconicsDrawable);
        }
        this.f2907e = iconicsDrawable;
        int i7 = this.f2903a | 16;
        this.f2908f = 0;
        this.f2903a = i7 & (-33);
        B();
        return this;
    }

    public a l(Drawable drawable) {
        if (this.f2899M) {
            return clone().l(drawable);
        }
        this.f2915w = drawable;
        this.f2903a = (this.f2903a | UserMetadata.MAX_INTERNAL_KEY_SIZE) & (-16385);
        B();
        return this;
    }

    public a m(com.bumptech.glide.load.b bVar) {
        return C(com.bumptech.glide.load.resource.bitmap.o.f20933f, bVar).C(com.bumptech.glide.load.resource.gif.i.f21016a, bVar);
    }

    public final boolean n(a aVar) {
        return Float.compare(aVar.f2904b, this.f2904b) == 0 && this.f2908f == aVar.f2908f && o.b(this.f2907e, aVar.f2907e) && this.f2910i == aVar.f2910i && o.b(this.f2909g, aVar.f2909g) && o.b(this.f2915w, aVar.f2915w) && this.f2911j == aVar.f2911j && this.f2912o == aVar.f2912o && this.f2913p == aVar.f2913p && this.f2914v == aVar.f2914v && this.f2900Q == aVar.f2900Q && this.f2905c.equals(aVar.f2905c) && this.f2906d == aVar.f2906d && this.f2894A.equals(aVar.f2894A) && this.f2895B.equals(aVar.f2895B) && this.f2896C.equals(aVar.f2896C) && this.t.equals(aVar.t) && o.b(this.f2898L, aVar.f2898L);
    }

    public a p() {
        this.f2897H = true;
        return this;
    }

    public a q(boolean z3) {
        if (this.f2899M) {
            return clone().q(z3);
        }
        this.f2900Q = z3;
        this.f2903a |= 524288;
        B();
        return this;
    }

    public a r() {
        return u(m.f20927d, new C1335g());
    }

    public a s() {
        a aVarU = u(m.f20926c, new com.bumptech.glide.load.resource.bitmap.h());
        aVarU.f2901X = true;
        return aVarU;
    }

    public a t() {
        a aVarU = u(m.f20925b, new t());
        aVarU.f2901X = true;
        return aVarU;
    }

    public final a u(m mVar, AbstractC1332d abstractC1332d) {
        if (this.f2899M) {
            return clone().u(mVar, abstractC1332d);
        }
        i(mVar);
        return I(abstractC1332d, false);
    }

    public a v(int i7) {
        return w(i7, i7);
    }

    public a w(int i7, int i10) {
        if (this.f2899M) {
            return clone().w(i7, i10);
        }
        this.f2913p = i7;
        this.f2912o = i10;
        this.f2903a |= 512;
        B();
        return this;
    }

    public a x(int i7) {
        if (this.f2899M) {
            return clone().x(i7);
        }
        this.f2910i = i7;
        int i10 = this.f2903a | 128;
        this.f2909g = null;
        this.f2903a = i10 & (-65);
        B();
        return this;
    }

    public a y(Drawable drawable) {
        if (this.f2899M) {
            return clone().y(drawable);
        }
        this.f2909g = drawable;
        int i7 = this.f2903a | 64;
        this.f2910i = 0;
        this.f2903a = i7 & (-129);
        B();
        return this;
    }

    public a z(g gVar) {
        if (this.f2899M) {
            return clone().z(gVar);
        }
        this.f2906d = gVar;
        this.f2903a |= 8;
        B();
        return this;
    }
}
