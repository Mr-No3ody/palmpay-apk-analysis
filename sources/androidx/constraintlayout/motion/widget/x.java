package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f15473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f15474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f15475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public A f15476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f15477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f15478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f15481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15482r;

    public x(y yVar, x xVar) {
        this.f15465a = -1;
        this.f15466b = false;
        this.f15467c = -1;
        this.f15468d = -1;
        this.f15469e = 0;
        this.f15470f = null;
        this.f15471g = -1;
        this.f15472h = 400;
        this.f15473i = 0.0f;
        this.f15475k = new ArrayList();
        this.f15476l = null;
        this.f15477m = new ArrayList();
        this.f15478n = 0;
        this.f15479o = false;
        this.f15480p = -1;
        this.f15481q = 0;
        this.f15482r = 0;
        this.f15474j = yVar;
        this.f15472h = yVar.f15492j;
        if (xVar != null) {
            this.f15480p = xVar.f15480p;
            this.f15469e = xVar.f15469e;
            this.f15470f = xVar.f15470f;
            this.f15471g = xVar.f15471g;
            this.f15472h = xVar.f15472h;
            this.f15475k = xVar.f15475k;
            this.f15473i = xVar.f15473i;
            this.f15481q = xVar.f15481q;
        }
    }

    public x(y yVar, int i7, int i10) {
        this.f15465a = -1;
        this.f15466b = false;
        this.f15467c = -1;
        this.f15468d = -1;
        this.f15469e = 0;
        this.f15470f = null;
        this.f15471g = -1;
        this.f15472h = 400;
        this.f15473i = 0.0f;
        this.f15475k = new ArrayList();
        this.f15476l = null;
        this.f15477m = new ArrayList();
        this.f15478n = 0;
        this.f15479o = false;
        this.f15480p = -1;
        this.f15481q = 0;
        this.f15482r = 0;
        this.f15465a = -1;
        this.f15474j = yVar;
        this.f15468d = i7;
        this.f15467c = i10;
        this.f15472h = yVar.f15492j;
        this.f15481q = yVar.f15493k;
    }

    public x(y yVar, Context context, XmlResourceParser xmlResourceParser) {
        this.f15465a = -1;
        this.f15466b = false;
        this.f15467c = -1;
        this.f15468d = -1;
        this.f15469e = 0;
        this.f15470f = null;
        this.f15471g = -1;
        this.f15472h = 400;
        this.f15473i = 0.0f;
        this.f15475k = new ArrayList();
        this.f15476l = null;
        this.f15477m = new ArrayList();
        this.f15478n = 0;
        this.f15479o = false;
        this.f15480p = -1;
        this.f15481q = 0;
        this.f15482r = 0;
        this.f15472h = yVar.f15492j;
        this.f15481q = yVar.f15493k;
        this.f15474j = yVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.p.Transition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            int i10 = androidx.constraintlayout.widget.p.Transition_constraintSetEnd;
            SparseArray sparseArray = yVar.f15489g;
            if (index == i10) {
                this.f15467c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f15467c);
                if ("layout".equals(resourceTypeName)) {
                    androidx.constraintlayout.widget.m mVar = new androidx.constraintlayout.widget.m();
                    mVar.m(this.f15467c, context);
                    sparseArray.append(this.f15467c, mVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.f15467c = yVar.j(this.f15467c, context);
                }
            } else if (index == androidx.constraintlayout.widget.p.Transition_constraintSetStart) {
                this.f15468d = typedArrayObtainStyledAttributes.getResourceId(index, this.f15468d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.f15468d);
                if ("layout".equals(resourceTypeName2)) {
                    androidx.constraintlayout.widget.m mVar2 = new androidx.constraintlayout.widget.m();
                    mVar2.m(this.f15468d, context);
                    sparseArray.append(this.f15468d, mVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.f15468d = yVar.j(this.f15468d, context);
                }
            } else if (index == androidx.constraintlayout.widget.p.Transition_motionInterpolator) {
                int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f15471g = resourceId;
                    if (resourceId != -1) {
                        this.f15469e = -2;
                    }
                } else if (i11 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f15470f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.f15471g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f15469e = -2;
                        } else {
                            this.f15469e = -1;
                        }
                    }
                } else {
                    this.f15469e = typedArrayObtainStyledAttributes.getInteger(index, this.f15469e);
                }
            } else if (index == androidx.constraintlayout.widget.p.Transition_duration) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f15472h);
                this.f15472h = i12;
                if (i12 < 8) {
                    this.f15472h = 8;
                }
            } else if (index == androidx.constraintlayout.widget.p.Transition_staggered) {
                this.f15473i = typedArrayObtainStyledAttributes.getFloat(index, this.f15473i);
            } else if (index == androidx.constraintlayout.widget.p.Transition_autoTransition) {
                this.f15478n = typedArrayObtainStyledAttributes.getInteger(index, this.f15478n);
            } else if (index == androidx.constraintlayout.widget.p.Transition_android_id) {
                this.f15465a = typedArrayObtainStyledAttributes.getResourceId(index, this.f15465a);
            } else if (index == androidx.constraintlayout.widget.p.Transition_transitionDisable) {
                this.f15479o = typedArrayObtainStyledAttributes.getBoolean(index, this.f15479o);
            } else if (index == androidx.constraintlayout.widget.p.Transition_pathMotionArc) {
                this.f15480p = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == androidx.constraintlayout.widget.p.Transition_layoutDuringTransition) {
                this.f15481q = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == androidx.constraintlayout.widget.p.Transition_transitionFlags) {
                this.f15482r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f15468d == -1) {
            this.f15466b = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
