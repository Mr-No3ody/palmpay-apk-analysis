package G7;

import C0.G;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.skydoves.balloon.Balloon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f3062A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f3063B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f3064C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f3065D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final float f3066E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f3067F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View f3068G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public u f3069H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f3070I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f3071J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f3072K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f3073L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f3074M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final long f3075N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public LifecycleOwner f3076O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f3077P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f3078Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public q f3079R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final long f3080S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final int f3081T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final boolean f3082U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int f3083V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f3084W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final boolean f3085X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f3086Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final int f3087Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3088a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f3089a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3090b;
    public final int b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f3102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f3103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f3104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f3105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f3107s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f3108u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f3109v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3110w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f3111x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3112y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y f3113z;

    public g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3088a = context;
        this.f3090b = Integer.MIN_VALUE;
        this.f3091c = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        this.f3093e = Integer.MIN_VALUE;
        this.f3099k = true;
        this.f3100l = Integer.MIN_VALUE;
        this.f3101m = G.b(1, 12);
        this.f3102n = 0.5f;
        this.f3103o = c.f3054a;
        this.f3087Z = 1;
        this.f3104p = b.f3049b;
        this.f3107s = 2.5f;
        this.t = -16777216;
        this.f3108u = TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
        this.f3109v = "";
        this.f3110w = -1;
        this.f3111x = 12.0f;
        this.f3112y = 17;
        this.f3113z = y.f3153a;
        float f10 = 28;
        this.f3062A = G.b(1, f10);
        this.f3063B = G.b(1, f10);
        this.f3064C = G.b(1, 8);
        this.f3065D = Integer.MIN_VALUE;
        this.f3066E = 1.0f;
        this.f3067F = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
        this.f3070I = true;
        this.f3073L = true;
        this.f3075N = -1L;
        this.f3077P = Integer.MIN_VALUE;
        this.f3078Q = Integer.MIN_VALUE;
        this.f3079R = q.f3135a;
        this.f3089a0 = 2;
        this.f3080S = 500L;
        this.b0 = 1;
        this.f3081T = Integer.MIN_VALUE;
        boolean z3 = context.getResources().getConfiguration().getLayoutDirection() == 1;
        this.f3082U = z3;
        this.f3083V = z3 ? -1 : 1;
        this.f3084W = true;
        this.f3085X = true;
        this.f3086Y = true;
    }

    public final Balloon a() {
        return new Balloon(this.f3088a, this);
    }

    public final void b(b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        this.f3104p = value;
    }

    public final void c(c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        this.f3103o = value;
    }

    public final void d(int i7) {
        this.f3101m = i7 != Integer.MIN_VALUE ? G.b(1, i7) : Integer.MIN_VALUE;
    }

    public final void e(int i7) {
        this.f3106r = G.b(1, i7);
    }

    public final void f(q value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        this.f3079R = value;
        if (value == q.f3136b) {
            this.f3084W = false;
        }
    }

    public final void g(float f10) {
        this.f3108u = TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics());
    }

    public final void h() {
        this.f3067F = G.b(1, 2);
    }

    public final void i(int i7) {
        this.f3098j = G.b(1, i7);
    }
}
