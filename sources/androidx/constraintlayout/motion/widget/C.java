package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15230a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f15235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.constraintlayout.widget.h f15236g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15240k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f15244o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15231b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15232c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15233d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15237h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15238i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15241l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f15242m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15243n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15245p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15246q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15247r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15248s = -1;
    public int t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15249u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15250v = -1;

    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C(Context context, XmlResourceParser xmlResourceParser) {
        byte b7;
        this.f15244o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                b7 = -1;
                            } else {
                                b7 = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                b7 = -1;
                            } else {
                                b7 = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                b7 = -1;
                            } else {
                                b7 = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                b7 = -1;
                            } else {
                                b7 = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                b7 = -1;
                            } else {
                                b7 = 3;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 == 0) {
                        c(context, xmlResourceParser);
                    } else if (b7 == 1) {
                        this.f15235f = new f(context, xmlResourceParser);
                    } else if (b7 == 2) {
                        this.f15236g = androidx.constraintlayout.widget.m.d(context, xmlResourceParser);
                    } else if (b7 == 3 || b7 == 4) {
                        androidx.constraintlayout.widget.a.d(context, xmlResourceParser, this.f15236g.f15749g);
                    } else {
                        Log.e("ViewTransition", J3.a.o() + " unknown tag " + name);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(".xml:");
                        sb2.append(xmlResourceParser.getLineNumber());
                        Log.e("ViewTransition", sb2.toString());
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public final void a(E2.a aVar, MotionLayout motionLayout, int i7, androidx.constraintlayout.widget.m mVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator lVar;
        if (this.f15232c) {
            return;
        }
        int i10 = this.f15234e;
        f fVar = this.f15235f;
        if (i10 != 2) {
            androidx.constraintlayout.widget.h hVar = this.f15236g;
            if (i10 == 1) {
                for (int i11 : motionLayout.getConstraintSetIds()) {
                    if (i11 != i7) {
                        androidx.constraintlayout.widget.m mVarN = motionLayout.n(i11);
                        for (View view : viewArr) {
                            androidx.constraintlayout.widget.h hVarL = mVarN.l(view.getId());
                            if (hVar != null) {
                                androidx.constraintlayout.widget.g gVar = hVar.f15750h;
                                if (gVar != null) {
                                    gVar.e(hVarL);
                                }
                                hVarL.f15749g.putAll(hVar.f15749g);
                            }
                        }
                    }
                }
            }
            androidx.constraintlayout.widget.m mVar2 = new androidx.constraintlayout.widget.m();
            mVar2.f(mVar);
            for (View view2 : viewArr) {
                androidx.constraintlayout.widget.h hVarL2 = mVar2.l(view2.getId());
                if (hVar != null) {
                    androidx.constraintlayout.widget.g gVar2 = hVar.f15750h;
                    if (gVar2 != null) {
                        gVar2.e(hVarL2);
                    }
                    hVarL2.f15749g.putAll(hVar.f15749g);
                }
            }
            motionLayout.C(i7, mVar2);
            motionLayout.C(androidx.constraintlayout.widget.o.view_transition, mVar);
            motionLayout.setState(androidx.constraintlayout.widget.o.view_transition, -1, -1);
            x xVar = new x(motionLayout.f15290a, androidx.constraintlayout.widget.o.view_transition, i7);
            for (View view3 : viewArr) {
                int i12 = this.f15237h;
                if (i12 != -1) {
                    xVar.f15472h = Math.max(i12, 8);
                }
                xVar.f15480p = this.f15233d;
                int i13 = this.f15241l;
                String str = this.f15242m;
                int i14 = this.f15243n;
                xVar.f15469e = i13;
                xVar.f15470f = str;
                xVar.f15471g = i14;
                int id2 = view3.getId();
                if (fVar != null) {
                    ArrayList arrayList = (ArrayList) fVar.f15343a.get(-1);
                    f fVar2 = new f();
                    fVar2.f15343a = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC1029b abstractC1029bA = ((AbstractC1029b) it.next()).clone();
                        abstractC1029bA.f15323b = id2;
                        fVar2.b(abstractC1029bA);
                    }
                    xVar.f15475k.add(fVar2);
                }
            }
            motionLayout.setTransition(xVar);
            androidx.camera.video.internal.encoder.o oVar = new androidx.camera.video.internal.encoder.o(11, this, viewArr);
            motionLayout.h(1.0f);
            motionLayout.f15286V0 = oVar;
            return;
        }
        View view4 = viewArr[0];
        m mVar3 = new m(view4);
        v vVar = mVar3.f15386f;
        vVar.f15451c = 0.0f;
        vVar.f15452d = 0.0f;
        mVar3.f15380G = true;
        vVar.e(view4.getX(), view4.getY(), view4.getWidth(), view4.getHeight());
        mVar3.f15387g.e(view4.getX(), view4.getY(), view4.getWidth(), view4.getHeight());
        k kVar = mVar3.f15388h;
        kVar.getClass();
        view4.getX();
        view4.getY();
        view4.getWidth();
        view4.getHeight();
        kVar.f15361c = view4.getVisibility();
        kVar.f15359a = view4.getVisibility() != 0 ? 0.0f : view4.getAlpha();
        kVar.f15362d = view4.getElevation();
        kVar.f15363e = view4.getRotation();
        kVar.f15364f = view4.getRotationX();
        kVar.f15365g = view4.getRotationY();
        kVar.f15366i = view4.getScaleX();
        kVar.f15367j = view4.getScaleY();
        kVar.f15368o = view4.getPivotX();
        kVar.f15369p = view4.getPivotY();
        kVar.t = view4.getTranslationX();
        kVar.f15370v = view4.getTranslationY();
        kVar.f15371w = view4.getTranslationZ();
        k kVar2 = mVar3.f15389i;
        kVar2.getClass();
        view4.getX();
        view4.getY();
        view4.getWidth();
        view4.getHeight();
        kVar2.f15361c = view4.getVisibility();
        kVar2.f15359a = view4.getVisibility() == 0 ? view4.getAlpha() : 0.0f;
        kVar2.f15362d = view4.getElevation();
        kVar2.f15363e = view4.getRotation();
        kVar2.f15364f = view4.getRotationX();
        kVar2.f15365g = view4.getRotationY();
        kVar2.f15366i = view4.getScaleX();
        kVar2.f15367j = view4.getScaleY();
        kVar2.f15368o = view4.getPivotX();
        kVar2.f15369p = view4.getPivotY();
        kVar2.t = view4.getTranslationX();
        kVar2.f15370v = view4.getTranslationY();
        kVar2.f15371w = view4.getTranslationZ();
        ArrayList arrayList2 = (ArrayList) fVar.f15343a.get(-1);
        if (arrayList2 != null) {
            mVar3.f15402w.addAll(arrayList2);
        }
        mVar3.k(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
        int i15 = this.f15237h;
        int i16 = this.f15238i;
        int i17 = this.f15231b;
        Context context = motionLayout.getContext();
        int i18 = this.f15241l;
        if (i18 != -2) {
            if (i18 == -1) {
                lVar = new l(O.e.d(this.f15242m), 2);
            } else if (i18 == 0) {
                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
            } else if (i18 == 1) {
                interpolatorLoadInterpolator = new AccelerateInterpolator();
            } else if (i18 == 2) {
                interpolatorLoadInterpolator = new DecelerateInterpolator();
            } else if (i18 == 4) {
                interpolatorLoadInterpolator = new BounceInterpolator();
            } else if (i18 != 5) {
                interpolatorLoadInterpolator = i18 != 6 ? null : new AnticipateInterpolator();
            } else {
                interpolatorLoadInterpolator = new OvershootInterpolator();
            }
            new B(aVar, mVar3, i15, i16, i17, lVar, this.f15245p, this.f15246q);
        }
        interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f15243n);
        lVar = interpolatorLoadInterpolator;
        new B(aVar, mVar3, i15, i16, i17, lVar, this.f15245p, this.f15246q);
    }

    public final boolean b(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if (this.f15239j == -1 && this.f15240k == null) {
            return false;
        }
        int i7 = this.f15247r;
        boolean z3 = i7 == -1 || view.getTag(i7) != null;
        int i10 = this.f15248s;
        boolean z8 = i10 == -1 || view.getTag(i10) == null;
        if (z3 && z8) {
            if (view.getId() == this.f15239j) {
                return true;
            }
            if (this.f15240k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).f15634Y) != null && str.matches(this.f15240k)) {
                return true;
            }
        }
        return false;
    }

    public final void c(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.p.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == androidx.constraintlayout.widget.p.ViewTransition_android_id) {
                this.f15230a = typedArrayObtainStyledAttributes.getResourceId(index, this.f15230a);
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_motionTarget) {
                if (MotionLayout.f1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f15239j);
                    this.f15239j = resourceId;
                    if (resourceId == -1) {
                        this.f15240k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f15240k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f15239j = typedArrayObtainStyledAttributes.getResourceId(index, this.f15239j);
                }
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_onStateTransition) {
                this.f15231b = typedArrayObtainStyledAttributes.getInt(index, this.f15231b);
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_transitionDisable) {
                this.f15232c = typedArrayObtainStyledAttributes.getBoolean(index, this.f15232c);
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_pathMotionArc) {
                this.f15233d = typedArrayObtainStyledAttributes.getInt(index, this.f15233d);
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_duration) {
                this.f15237h = typedArrayObtainStyledAttributes.getInt(index, this.f15237h);
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_upDuration) {
                this.f15238i = typedArrayObtainStyledAttributes.getInt(index, this.f15238i);
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_viewTransitionMode) {
                this.f15234e = typedArrayObtainStyledAttributes.getInt(index, this.f15234e);
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_motionInterpolator) {
                int i10 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i10 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f15243n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f15241l = -2;
                    }
                } else if (i10 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f15242m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f15241l = -1;
                    } else {
                        this.f15243n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f15241l = -2;
                    }
                } else {
                    this.f15241l = typedArrayObtainStyledAttributes.getInteger(index, this.f15241l);
                }
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_setsTag) {
                this.f15245p = typedArrayObtainStyledAttributes.getResourceId(index, this.f15245p);
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_clearsTag) {
                this.f15246q = typedArrayObtainStyledAttributes.getResourceId(index, this.f15246q);
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_ifTagSet) {
                this.f15247r = typedArrayObtainStyledAttributes.getResourceId(index, this.f15247r);
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_ifTagNotSet) {
                this.f15248s = typedArrayObtainStyledAttributes.getResourceId(index, this.f15248s);
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_SharedValueId) {
                this.f15249u = typedArrayObtainStyledAttributes.getResourceId(index, this.f15249u);
            } else if (index == androidx.constraintlayout.widget.p.ViewTransition_SharedValue) {
                this.t = typedArrayObtainStyledAttributes.getInteger(index, this.t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + J3.a.r(this.f15230a, this.f15244o) + ")";
    }
}
