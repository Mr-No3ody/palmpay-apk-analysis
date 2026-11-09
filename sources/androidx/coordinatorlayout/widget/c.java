package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CoordinatorLayout.Behavior f15872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f15882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f15883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f15888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f15889r;

    public c(int i7, int i10) {
        super(i7, i10);
        this.f15873b = false;
        this.f15874c = 0;
        this.f15875d = 0;
        this.f15876e = -1;
        this.f15877f = -1;
        this.f15878g = 0;
        this.f15879h = 0;
        this.f15888q = new Rect();
    }

    public final boolean a(int i7) {
        if (i7 == 0) {
            return this.f15885n;
        }
        if (i7 != 1) {
            return false;
        }
        return this.f15886o;
    }

    public final void b(CoordinatorLayout.Behavior behavior) {
        CoordinatorLayout.Behavior behavior2 = this.f15872a;
        if (behavior2 != behavior) {
            if (behavior2 != null) {
                behavior2.onDetachedFromLayoutParams();
            }
            this.f15872a = behavior;
            this.f15889r = null;
            this.f15873b = true;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15873b = false;
        this.f15874c = 0;
        this.f15875d = 0;
        this.f15876e = -1;
        this.f15877f = -1;
        this.f15878g = 0;
        this.f15879h = 0;
        this.f15888q = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V.c.CoordinatorLayout_Layout);
        this.f15874c = typedArrayObtainStyledAttributes.getInteger(V.c.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.f15877f = typedArrayObtainStyledAttributes.getResourceId(V.c.CoordinatorLayout_Layout_layout_anchor, -1);
        this.f15875d = typedArrayObtainStyledAttributes.getInteger(V.c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.f15876e = typedArrayObtainStyledAttributes.getInteger(V.c.CoordinatorLayout_Layout_layout_keyline, -1);
        this.f15878g = typedArrayObtainStyledAttributes.getInt(V.c.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.f15879h = typedArrayObtainStyledAttributes.getInt(V.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(V.c.CoordinatorLayout_Layout_layout_behavior);
        this.f15873b = zHasValue;
        if (zHasValue) {
            this.f15872a = CoordinatorLayout.parseBehavior(context, attributeSet, typedArrayObtainStyledAttributes.getString(V.c.CoordinatorLayout_Layout_layout_behavior));
        }
        typedArrayObtainStyledAttributes.recycle();
        CoordinatorLayout.Behavior behavior = this.f15872a;
        if (behavior != null) {
            behavior.onAttachedToLayoutParams(this);
        }
    }

    public c(c cVar) {
        super((ViewGroup.MarginLayoutParams) cVar);
        this.f15873b = false;
        this.f15874c = 0;
        this.f15875d = 0;
        this.f15876e = -1;
        this.f15877f = -1;
        this.f15878g = 0;
        this.f15879h = 0;
        this.f15888q = new Rect();
    }

    public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f15873b = false;
        this.f15874c = 0;
        this.f15875d = 0;
        this.f15876e = -1;
        this.f15877f = -1;
        this.f15878g = 0;
        this.f15879h = 0;
        this.f15888q = new Rect();
    }

    public c(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f15873b = false;
        this.f15874c = 0;
        this.f15875d = 0;
        this.f15876e = -1;
        this.f15877f = -1;
        this.f15878g = 0;
        this.f15879h = 0;
        this.f15888q = new Rect();
    }
}
