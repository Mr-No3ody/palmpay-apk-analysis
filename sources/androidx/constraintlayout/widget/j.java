package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f15816n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f15825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15829m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15816n = sparseIntArray;
        sparseIntArray.append(p.Motion_motionPathRotate, 1);
        sparseIntArray.append(p.Motion_pathMotionArc, 2);
        sparseIntArray.append(p.Motion_transitionEasing, 3);
        sparseIntArray.append(p.Motion_drawPath, 4);
        sparseIntArray.append(p.Motion_animateRelativeTo, 5);
        sparseIntArray.append(p.Motion_animateCircleAngleTo, 6);
        sparseIntArray.append(p.Motion_motionStagger, 7);
        sparseIntArray.append(p.Motion_quantizeMotionSteps, 8);
        sparseIntArray.append(p.Motion_quantizeMotionPhase, 9);
        sparseIntArray.append(p.Motion_quantizeMotionInterpolator, 10);
    }

    public final void a(j jVar) {
        this.f15817a = jVar.f15817a;
        this.f15818b = jVar.f15818b;
        this.f15820d = jVar.f15820d;
        this.f15821e = jVar.f15821e;
        this.f15822f = jVar.f15822f;
        this.f15824h = jVar.f15824h;
        this.f15823g = jVar.f15823g;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.Motion);
        this.f15817a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            switch (f15816n.get(index)) {
                case 1:
                    this.f15824h = typedArrayObtainStyledAttributes.getFloat(index, this.f15824h);
                    break;
                case 2:
                    this.f15821e = typedArrayObtainStyledAttributes.getInt(index, this.f15821e);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f15820d = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f15820d = O.e.f6488d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f15822f = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f15818b = m.o(typedArrayObtainStyledAttributes, index, this.f15818b);
                    break;
                case 6:
                    this.f15819c = typedArrayObtainStyledAttributes.getInteger(index, this.f15819c);
                    break;
                case 7:
                    this.f15823g = typedArrayObtainStyledAttributes.getFloat(index, this.f15823g);
                    break;
                case 8:
                    this.f15826j = typedArrayObtainStyledAttributes.getInteger(index, this.f15826j);
                    break;
                case 9:
                    this.f15825i = typedArrayObtainStyledAttributes.getFloat(index, this.f15825i);
                    break;
                case 10:
                    int i10 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i10 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f15829m = resourceId;
                        if (resourceId != -1) {
                            this.f15828l = -2;
                        }
                    } else if (i10 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f15827k = string;
                        if (string.indexOf("/") > 0) {
                            this.f15829m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f15828l = -2;
                        } else {
                            this.f15828l = -1;
                        }
                    } else {
                        this.f15828l = typedArrayObtainStyledAttributes.getInteger(index, this.f15829m);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
