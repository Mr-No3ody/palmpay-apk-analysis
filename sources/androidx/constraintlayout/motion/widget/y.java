package androidx.constraintlayout.motion.widget;

import C0.G;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f15483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4.a f15484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f15485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f15487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f15488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f15489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f15490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseIntArray f15491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MotionEvent f15494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s f15497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final E2.a f15499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f15500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f15501s;

    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    public y(Context context, MotionLayout motionLayout, int i7) {
        this.f15484b = null;
        this.f15485c = null;
        ArrayList arrayList = new ArrayList();
        this.f15486d = arrayList;
        this.f15487e = null;
        this.f15488f = new ArrayList();
        this.f15489g = new SparseArray();
        this.f15490h = new HashMap();
        this.f15491i = new SparseIntArray();
        this.f15492j = 400;
        this.f15493k = 0;
        this.f15495m = false;
        this.f15496n = false;
        this.f15483a = motionLayout;
        this.f15499q = new E2.a(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            x xVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    switch (xml.getName()) {
                        case "MotionScene":
                            l(context, xml);
                            break;
                        case "Transition":
                            xVar = new x(this, context, xml);
                            arrayList.add(xVar);
                            if (this.f15485c == null && !xVar.f15466b) {
                                this.f15485c = xVar;
                                A a3 = xVar.f15476l;
                                if (a3 != null) {
                                    a3.c(this.f15498p);
                                }
                            }
                            if (!xVar.f15466b) {
                                break;
                            } else {
                                if (xVar.f15467c == -1) {
                                    this.f15487e = xVar;
                                } else {
                                    this.f15488f.add(xVar);
                                }
                                arrayList.remove(xVar);
                                break;
                            }
                            break;
                        case "OnSwipe":
                            if (xVar == null) {
                                context.getResources().getResourceEntryName(i7);
                                xml.getLineNumber();
                            }
                            if (xVar == null) {
                                break;
                            } else {
                                xVar.f15476l = new A(context, this.f15483a, xml);
                                break;
                            }
                            break;
                        case "OnClick":
                            if (xVar == null) {
                                break;
                            } else {
                                xVar.f15477m.add(new w(context, xVar, xml));
                                break;
                            }
                            break;
                        case "StateSet":
                            this.f15484b = new C4.a(context, xml);
                            break;
                        case "ConstraintSet":
                            i(context, xml);
                            break;
                        case "include":
                        case "Include":
                            k(context, xml);
                            break;
                        case "KeyFrameSet":
                            f fVar = new f(context, xml);
                            if (xVar == null) {
                                break;
                            } else {
                                xVar.f15475k.add(fVar);
                                break;
                            }
                            break;
                        case "ViewTransition":
                            C c6 = new C(context, xml);
                            E2.a aVar = this.f15499q;
                            ((ArrayList) aVar.f2185d).add(c6);
                            aVar.f2184c = null;
                            int i10 = c6.f15231b;
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    ConstraintLayout.getSharedValues().a(c6.f15249u, new D(aVar, c6, c6.f15249u, false, c6.t));
                                }
                                break;
                            } else {
                                ConstraintLayout.getSharedValues().a(c6.f15249u, new D(aVar, c6, c6.f15249u, true, c6.t));
                                break;
                            }
                            break;
                    }
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
        this.f15489g.put(androidx.constraintlayout.widget.o.motion_base, new androidx.constraintlayout.widget.m());
        this.f15490h.put("motion_base", Integer.valueOf(androidx.constraintlayout.widget.o.motion_base));
    }

    public final boolean a(MotionLayout motionLayout, int i7) {
        x xVar;
        if (this.f15497o != null) {
            return false;
        }
        for (x xVar2 : this.f15486d) {
            int i10 = xVar2.f15478n;
            if (i10 != 0 && ((xVar = this.f15485c) != xVar2 || (xVar.f15482r & 2) == 0)) {
                int i11 = xVar2.f15468d;
                u uVar = u.f15443d;
                u uVar2 = u.f15442c;
                u uVar3 = u.f15441b;
                if (i7 == i11 && (i10 == 4 || i10 == 2)) {
                    motionLayout.setState(uVar);
                    motionLayout.setTransition(xVar2);
                    if (xVar2.f15478n == 4) {
                        motionLayout.x();
                        motionLayout.setState(uVar3);
                        motionLayout.setState(uVar2);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.j(true);
                    motionLayout.setState(uVar3);
                    motionLayout.setState(uVar2);
                    motionLayout.setState(uVar);
                    motionLayout.r();
                    return true;
                }
                if (i7 == xVar2.f15467c && (i10 == 3 || i10 == 1)) {
                    motionLayout.setState(uVar);
                    motionLayout.setTransition(xVar2);
                    if (xVar2.f15478n == 3) {
                        motionLayout.y();
                        motionLayout.setState(uVar3);
                        motionLayout.setState(uVar2);
                        return true;
                    }
                    motionLayout.setProgress(0.0f);
                    motionLayout.j(true);
                    motionLayout.setState(uVar3);
                    motionLayout.setState(uVar2);
                    motionLayout.setState(uVar);
                    motionLayout.r();
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.m b(int i7) {
        int iK;
        SparseArray sparseArray = this.f15489g;
        C4.a aVar = this.f15484b;
        if (aVar != null && (iK = aVar.k(i7)) != -1) {
            i7 = iK;
        }
        if (sparseArray.get(i7) != null) {
            return (androidx.constraintlayout.widget.m) sparseArray.get(i7);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + J3.a.r(i7, this.f15483a.getContext()) + " In MotionScene");
        return (androidx.constraintlayout.widget.m) sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c() {
        x xVar = this.f15485c;
        return xVar != null ? xVar.f15472h : this.f15492j;
    }

    public final int d(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public final Interpolator e() {
        x xVar = this.f15485c;
        int i7 = xVar.f15469e;
        if (i7 == -2) {
            return AnimationUtils.loadInterpolator(this.f15483a.getContext(), this.f15485c.f15471g);
        }
        if (i7 == -1) {
            return new l(O.e.d(xVar.f15470f), 1);
        }
        if (i7 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i7 == 1) {
            return new AccelerateInterpolator();
        }
        if (i7 == 2) {
            return new DecelerateInterpolator();
        }
        if (i7 == 4) {
            return new BounceInterpolator();
        }
        if (i7 == 5) {
            return new OvershootInterpolator();
        }
        if (i7 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void f(m mVar) {
        x xVar = this.f15485c;
        if (xVar != null) {
            Iterator it = xVar.f15475k.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(mVar);
            }
        } else {
            x xVar2 = this.f15487e;
            if (xVar2 != null) {
                Iterator it2 = xVar2.f15475k.iterator();
                while (it2.hasNext()) {
                    ((f) it2.next()).a(mVar);
                }
            }
        }
    }

    public final float g() {
        A a3;
        x xVar = this.f15485c;
        if (xVar == null || (a3 = xVar.f15476l) == null) {
            return 0.0f;
        }
        return a3.t;
    }

    public final int h() {
        x xVar = this.f15485c;
        if (xVar == null) {
            return -1;
        }
        return xVar.f15468d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:6:0x002d  */
    public final int i(Context context, XmlResourceParser xmlResourceParser) {
        androidx.constraintlayout.widget.m mVar = new androidx.constraintlayout.widget.m();
        mVar.f15857e = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iD = -1;
        int iD2 = -1;
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlResourceParser.getAttributeName(i7);
            String attributeValue = xmlResourceParser.getAttributeValue(i7);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iD2 = d(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        mVar.f15855c = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                mVar.f15855c = 4;
                                break;
                            case "left":
                                mVar.f15855c = 2;
                                break;
                            case "none":
                                mVar.f15855c = 0;
                                break;
                            case "right":
                                mVar.f15855c = 1;
                                break;
                            case "x_right":
                                mVar.f15855c = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iD = d(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.f15490h.put(attributeValue, Integer.valueOf(iD));
                    mVar.f15853a = J3.a.r(iD, context);
                    break;
            }
        }
        if (iD != -1) {
            int i10 = this.f15483a.f15281Q;
            mVar.n(context, xmlResourceParser);
            if (iD2 != -1) {
                this.f15491i.put(iD, iD2);
            }
            this.f15489g.put(iD, mVar);
        }
        return iD;
    }

    public final int j(int i7, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return i(context, xml);
                }
            }
            return -1;
        } catch (IOException e10) {
            e10.printStackTrace();
            return -1;
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.p.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == androidx.constraintlayout.widget.p.include_constraintSet) {
                j(typedArrayObtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.p.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == androidx.constraintlayout.widget.p.MotionScene_defaultDuration) {
                int i10 = typedArrayObtainStyledAttributes.getInt(index, this.f15492j);
                this.f15492j = i10;
                if (i10 < 8) {
                    this.f15492j = 8;
                }
            } else if (index == androidx.constraintlayout.widget.p.MotionScene_layoutDuringTransition) {
                this.f15493k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void m(MotionLayout motionLayout, int i7) {
        SparseArray sparseArray = this.f15489g;
        androidx.constraintlayout.widget.m mVar = (androidx.constraintlayout.widget.m) sparseArray.get(i7);
        mVar.f15854b = mVar.f15853a;
        int i10 = this.f15491i.get(i7);
        HashMap map = mVar.f15858f;
        if (i10 > 0) {
            m(motionLayout, i10);
            androidx.constraintlayout.widget.m mVar2 = (androidx.constraintlayout.widget.m) sparseArray.get(i10);
            if (mVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + J3.a.r(i10, this.f15483a.getContext()));
                return;
            }
            mVar.f15854b += "/" + mVar2.f15854b;
            HashMap map2 = mVar2.f15858f;
            for (Integer num : map2.keySet()) {
                num.getClass();
                androidx.constraintlayout.widget.h hVar = (androidx.constraintlayout.widget.h) map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new androidx.constraintlayout.widget.h());
                }
                androidx.constraintlayout.widget.h hVar2 = (androidx.constraintlayout.widget.h) map.get(num);
                if (hVar2 != null) {
                    androidx.constraintlayout.widget.i iVar = hVar2.f15747e;
                    if (!iVar.f15780b) {
                        iVar.a(hVar.f15747e);
                    }
                    androidx.constraintlayout.widget.k kVar = hVar2.f15745c;
                    if (!kVar.f15830a) {
                        androidx.constraintlayout.widget.k kVar2 = hVar.f15745c;
                        kVar.f15830a = kVar2.f15830a;
                        kVar.f15831b = kVar2.f15831b;
                        kVar.f15833d = kVar2.f15833d;
                        kVar.f15834e = kVar2.f15834e;
                        kVar.f15832c = kVar2.f15832c;
                    }
                    androidx.constraintlayout.widget.l lVar = hVar2.f15748f;
                    if (!lVar.f15836a) {
                        lVar.a(hVar.f15748f);
                    }
                    androidx.constraintlayout.widget.j jVar = hVar2.f15746d;
                    if (!jVar.f15817a) {
                        jVar.a(hVar.f15746d);
                    }
                    for (String str : hVar.f15749g.keySet()) {
                        if (!hVar2.f15749g.containsKey(str)) {
                            hVar2.f15749g.put(str, (androidx.constraintlayout.widget.a) hVar.f15749g.get(str));
                        }
                    }
                }
            }
        } else {
            mVar.f15854b = G.r(new StringBuilder(), mVar.f15854b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = motionLayout.getChildAt(i11);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                int id2 = childAt.getId();
                if (mVar.f15857e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!map.containsKey(Integer.valueOf(id2))) {
                    map.put(Integer.valueOf(id2), new androidx.constraintlayout.widget.h());
                }
                androidx.constraintlayout.widget.h hVar3 = (androidx.constraintlayout.widget.h) map.get(Integer.valueOf(id2));
                if (hVar3 != null) {
                    androidx.constraintlayout.widget.i iVar2 = hVar3.f15747e;
                    if (!iVar2.f15780b) {
                        hVar3.c(id2, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            iVar2.f15794j0 = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                iVar2.f15804o0 = barrier.getAllowsGoneWidget();
                                iVar2.f15789g0 = barrier.getType();
                                iVar2.f15791h0 = barrier.getMargin();
                            }
                        }
                        iVar2.f15780b = true;
                    }
                    androidx.constraintlayout.widget.k kVar3 = hVar3.f15745c;
                    if (!kVar3.f15830a) {
                        kVar3.f15831b = childAt.getVisibility();
                        kVar3.f15833d = childAt.getAlpha();
                        kVar3.f15830a = true;
                    }
                    androidx.constraintlayout.widget.l lVar2 = hVar3.f15748f;
                    if (!lVar2.f15836a) {
                        lVar2.f15836a = true;
                        lVar2.f15837b = childAt.getRotation();
                        lVar2.f15838c = childAt.getRotationX();
                        lVar2.f15839d = childAt.getRotationY();
                        lVar2.f15840e = childAt.getScaleX();
                        lVar2.f15841f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            lVar2.f15842g = pivotX;
                            lVar2.f15843h = pivotY;
                        }
                        lVar2.f15845j = childAt.getTranslationX();
                        lVar2.f15846k = childAt.getTranslationY();
                        lVar2.f15847l = childAt.getTranslationZ();
                        if (lVar2.f15848m) {
                            lVar2.f15849n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (androidx.constraintlayout.widget.h hVar4 : map.values()) {
            if (hVar4.f15750h != null) {
                if (hVar4.f15744b != null) {
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.h hVarL = mVar.l(((Integer) it.next()).intValue());
                        String str2 = hVarL.f15747e.f15798l0;
                        if (str2 != null && hVar4.f15744b.matches(str2)) {
                            hVar4.f15750h.e(hVarL);
                            hVarL.f15749g.putAll((HashMap) hVar4.f15749g.clone());
                        }
                    }
                } else {
                    hVar4.f15750h.e(mVar.l(hVar4.f15743a));
                }
            }
        }
    }

    public final void n(MotionLayout motionLayout) {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f15489g;
            if (i7 >= sparseArray.size()) {
                return;
            }
            int iKeyAt = sparseArray.keyAt(i7);
            SparseIntArray sparseIntArray = this.f15491i;
            int i10 = sparseIntArray.get(iKeyAt);
            int size = sparseIntArray.size();
            while (i10 > 0) {
                if (i10 != iKeyAt) {
                    int i11 = size - 1;
                    if (size >= 0) {
                        i10 = sparseIntArray.get(i10);
                        size = i11;
                    }
                }
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            m(motionLayout, iKeyAt);
            i7++;
        }
    }

    public final void o(View view, int i7, String str, Object obj) {
        x xVar = this.f15485c;
        if (xVar == null) {
            return;
        }
        for (f fVar : xVar.f15475k) {
            Iterator it = ((ArrayList) fVar.f15343a.get(Integer.valueOf(view.getId()))).iterator();
            while (it.hasNext()) {
                if (((AbstractC1029b) it.next()).f15322a == i7) {
                    if (obj != null) {
                    }
                    str.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0033  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public final void p(int i7, int i10) {
        int iK;
        int iK2;
        x xVar;
        ArrayList arrayList;
        Iterator it;
        x xVar2;
        x xVar3;
        x xVar4;
        int i11;
        A a3;
        C4.a aVar = this.f15484b;
        if (aVar != null) {
            iK = aVar.k(i7);
            if (iK == -1) {
                iK = i7;
            }
            iK2 = this.f15484b.k(i10);
            if (iK2 == -1) {
            }
            xVar = this.f15485c;
            if (xVar == null && xVar.f15467c == i10 && xVar.f15468d == i7) {
                return;
            }
            arrayList = this.f15486d;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    xVar2 = this.f15487e;
                    for (x xVar5 : this.f15488f) {
                        if (xVar5.f15467c == i10) {
                            xVar2 = xVar5;
                        }
                    }
                    xVar3 = new x(this, xVar2);
                    xVar3.f15468d = iK;
                    xVar3.f15467c = iK2;
                    if (iK != -1) {
                        arrayList.add(xVar3);
                    }
                    this.f15485c = xVar3;
                    return;
                }
                xVar4 = (x) it.next();
                i11 = xVar4.f15467c;
                if ((i11 != iK2 && xVar4.f15468d == iK) || (i11 == i10 && xVar4.f15468d == i7)) {
                    break;
                }
            }
            this.f15485c = xVar4;
            a3 = xVar4.f15476l;
            if (a3 != null) {
                a3.c(this.f15498p);
            }
        }
        iK = i7;
        iK2 = i10;
        xVar = this.f15485c;
        if (xVar == null) {
        }
        arrayList = this.f15486d;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                xVar2 = this.f15487e;
                while (r4.hasNext()) {
                    if (xVar5.f15467c == i10) {
                        xVar2 = xVar5;
                    }
                }
                xVar3 = new x(this, xVar2);
                xVar3.f15468d = iK;
                xVar3.f15467c = iK2;
                if (iK != -1) {
                    arrayList.add(xVar3);
                }
                this.f15485c = xVar3;
                return;
            }
            xVar4 = (x) it.next();
            i11 = xVar4.f15467c;
            if (i11 != iK2) {
            }
        }
        this.f15485c = xVar4;
        a3 = xVar4.f15476l;
        if (a3 != null) {
            a3.c(this.f15498p);
        }
    }

    public final boolean q() {
        Iterator it = this.f15486d.iterator();
        while (it.hasNext()) {
            if (((x) it.next()).f15476l != null) {
                return true;
            }
        }
        x xVar = this.f15485c;
        return (xVar == null || xVar.f15476l == null) ? false : true;
    }
}
