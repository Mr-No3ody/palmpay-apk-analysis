package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final float[][] f15186E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final float[][] f15187F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float f15188A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float f15189B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f15190C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f15191D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f15201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15203l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15204m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float[] f15205n = new float[2];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f15206o = new int[2];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f15207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f15208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MotionLayout f15209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f15210s;
    public final float t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f15211u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f15212v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f15213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f15214x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f15215y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f15216z;

    public A(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f15192a = 0;
        this.f15193b = 0;
        this.f15194c = 0;
        this.f15195d = -1;
        this.f15196e = -1;
        this.f15197f = -1;
        this.f15198g = 0.5f;
        this.f15199h = 0.5f;
        this.f15200i = -1;
        this.f15201j = false;
        this.f15202k = 0.0f;
        this.f15203l = 1.0f;
        this.f15210s = 4.0f;
        this.t = 1.2f;
        this.f15211u = true;
        this.f15212v = 1.0f;
        this.f15213w = 0;
        this.f15214x = 10.0f;
        this.f15215y = 10.0f;
        this.f15216z = 1.0f;
        this.f15188A = Float.NaN;
        this.f15189B = Float.NaN;
        this.f15190C = 0;
        this.f15191D = 0;
        this.f15209r = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.p.OnSwipe);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == androidx.constraintlayout.widget.p.OnSwipe_touchAnchorId) {
                this.f15195d = typedArrayObtainStyledAttributes.getResourceId(index, this.f15195d);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_touchAnchorSide) {
                int i10 = typedArrayObtainStyledAttributes.getInt(index, this.f15192a);
                this.f15192a = i10;
                float[] fArr = f15186E[i10];
                this.f15199h = fArr[0];
                this.f15198g = fArr[1];
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_dragDirection) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f15193b);
                this.f15193b = i11;
                if (i11 < 6) {
                    float[] fArr2 = f15187F[i11];
                    this.f15202k = fArr2[0];
                    this.f15203l = fArr2[1];
                } else {
                    this.f15203l = Float.NaN;
                    this.f15202k = Float.NaN;
                    this.f15201j = true;
                }
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_maxVelocity) {
                this.f15210s = typedArrayObtainStyledAttributes.getFloat(index, this.f15210s);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_maxAcceleration) {
                this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_moveWhenScrollAtTop) {
                this.f15211u = typedArrayObtainStyledAttributes.getBoolean(index, this.f15211u);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_dragScale) {
                this.f15212v = typedArrayObtainStyledAttributes.getFloat(index, this.f15212v);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_dragThreshold) {
                this.f15214x = typedArrayObtainStyledAttributes.getFloat(index, this.f15214x);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_touchRegionId) {
                this.f15196e = typedArrayObtainStyledAttributes.getResourceId(index, this.f15196e);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_onTouchUp) {
                this.f15194c = typedArrayObtainStyledAttributes.getInt(index, this.f15194c);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_nestedScrollFlags) {
                this.f15213w = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_limitBoundsTo) {
                this.f15197f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_rotationCenterId) {
                this.f15200i = typedArrayObtainStyledAttributes.getResourceId(index, this.f15200i);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_springDamping) {
                this.f15215y = typedArrayObtainStyledAttributes.getFloat(index, this.f15215y);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_springMass) {
                this.f15216z = typedArrayObtainStyledAttributes.getFloat(index, this.f15216z);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_springStiffness) {
                this.f15188A = typedArrayObtainStyledAttributes.getFloat(index, this.f15188A);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_springStopThreshold) {
                this.f15189B = typedArrayObtainStyledAttributes.getFloat(index, this.f15189B);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_springBoundary) {
                this.f15190C = typedArrayObtainStyledAttributes.getInt(index, this.f15190C);
            } else if (index == androidx.constraintlayout.widget.p.OnSwipe_autoCompleteMode) {
                this.f15191D = typedArrayObtainStyledAttributes.getInt(index, this.f15191D);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i7 = this.f15197f;
        if (i7 == -1 || (viewFindViewById = viewGroup.findViewById(i7)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i7 = this.f15196e;
        if (i7 == -1 || (viewFindViewById = viewGroup.findViewById(i7)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z3) {
        float[][] fArr = f15186E;
        float[][] fArr2 = f15187F;
        if (z3) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f15192a];
        this.f15199h = fArr3[0];
        this.f15198g = fArr3[1];
        int i7 = this.f15193b;
        if (i7 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i7];
        this.f15202k = fArr4[0];
        this.f15203l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f15202k)) {
            return ViewProps.ROTATION;
        }
        return this.f15202k + " , " + this.f15203l;
    }
}
