package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.camera.camera2.internal.Q0;
import androidx.core.os.CancellationSignal$OnCancelListener;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC1067t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1176k extends D0 {
    public static void h(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View child = viewGroup.getChildAt(i7);
            if (child.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                h(child, arrayList);
            }
        }
    }

    public static void i(M.f fVar, View view) {
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        String strF = androidx.core.view.E.f(view);
        if (strF != null) {
            fVar.put(strF, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View child = viewGroup.getChildAt(i7);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    i(fVar, child);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:230:0x0754  */
    /* JADX WARN: Code duplicated, block: B:243:0x0794  */
    /* JADX WARN: Code duplicated, block: B:247:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:248:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:250:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:253:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:258:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:262:0x0801  */
    /* JADX WARN: Code duplicated, block: B:268:0x0812  */
    /* JADX WARN: Code duplicated, block: B:272:0x0826  */
    /* JADX WARN: Code duplicated, block: B:274:0x082c  */
    /* JADX WARN: Code duplicated, block: B:276:0x0832  */
    /* JADX WARN: Code duplicated, block: B:278:0x083b  */
    /* JADX WARN: Code duplicated, block: B:280:0x0856  */
    /* JADX WARN: Code duplicated, block: B:289:0x0882 A[LOOP:10: B:287:0x087c->B:289:0x0882, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:292:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:325:0x07e0 A[EDGE_INSN: B:325:0x07e0->B:255:0x07e0 BREAK  A[LOOP:8: B:228:0x074c->B:334:0x074c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0765 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0761 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0772 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x076e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x077c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0778 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x079b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x078c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0808 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x07f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0819 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x080c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x0872 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x086c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.D0
    public final void b(ArrayList operations, boolean z3) {
        Object next;
        Object objPrevious;
        ArrayList<x0> arrayList;
        ArrayList arrayList2;
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        boolean z8;
        boolean z10;
        ArrayList arrayList3;
        M.n nVar;
        x0 x0Var4;
        int i7;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Object obj;
        Object obj2;
        ArrayList arrayList6;
        View view;
        View view2;
        ArrayList arrayList7;
        M.f fVar;
        ArrayList arrayList8;
        Pair pair;
        View view3;
        boolean zContainsValue;
        Context context;
        ArrayList<C1171f> arrayList9;
        Iterator it;
        boolean z11;
        String str;
        C1176k c1176k;
        x0 x0Var5;
        Fragment fragment;
        View view4;
        F fC;
        Animation animation;
        C1171f c1171f;
        F fC2;
        final Animator animator;
        final x0 x0Var6;
        boolean zC;
        Fragment fragment2;
        boolean z12;
        int i10 = 0;
        int i11 = 2;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator it2 = operations.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            x0 x0Var7 = (x0) next;
            A0 a3 = B0.f16949a;
            View view5 = x0Var7.f17248c.mView;
            Intrinsics.checkNotNullExpressionValue(view5, "operation.fragment.mView");
            B0 b0AsOperationState = a3.asOperationState(view5);
            B0 b0 = B0.f16951c;
            if (b0AsOperationState == b0 && x0Var7.f17246a != b0) {
                break;
            }
        }
        x0 x0Var8 = (x0) next;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            x0 x0Var9 = (x0) objPrevious;
            A0 a10 = B0.f16949a;
            View view6 = x0Var9.f17248c.mView;
            Intrinsics.checkNotNullExpressionValue(view6, "operation.fragment.mView");
            B0 b0AsOperationState2 = a10.asOperationState(view6);
            B0 b7 = B0.f16951c;
            if (b0AsOperationState2 != b7 && x0Var9.f17246a == b7) {
                break;
            }
        }
        x0 x0Var10 = (x0) objPrevious;
        if (Z.L(2)) {
            Objects.toString(x0Var8);
            Objects.toString(x0Var10);
        }
        ArrayList arrayList10 = new ArrayList();
        ArrayList<C1173h> arrayList11 = new ArrayList();
        ArrayList arrayListZ = CollectionsKt.Z(operations);
        Fragment fragment3 = ((x0) CollectionsKt.K(operations)).f17248c;
        Iterator it3 = operations.iterator();
        while (it3.hasNext()) {
            int i12 = i11;
            C1188x c1188x = ((x0) it3.next()).f17248c.mAnimationInfo;
            C1188x c1188x2 = fragment3.mAnimationInfo;
            c1188x.f17228b = c1188x2.f17228b;
            c1188x.f17229c = c1188x2.f17229c;
            c1188x.f17230d = c1188x2.f17230d;
            c1188x.f17231e = c1188x2.f17231e;
            i11 = i12;
        }
        int i13 = i11;
        int i14 = 1;
        Iterator it4 = operations.iterator();
        while (it4.hasNext()) {
            x0 x0Var11 = (x0) it4.next();
            androidx.core.os.d signal = new androidx.core.os.d();
            x0Var11.getClass();
            Intrinsics.checkNotNullParameter(signal, "signal");
            x0Var11.d();
            LinkedHashSet linkedHashSet = x0Var11.f17250e;
            linkedHashSet.add(signal);
            arrayList10.add(new C1171f(x0Var11, signal, z3));
            androidx.core.os.d signal2 = new androidx.core.os.d();
            Intrinsics.checkNotNullParameter(signal2, "signal");
            x0Var11.d();
            linkedHashSet.add(signal2);
            arrayList11.add(new C1173h(x0Var11, signal2, z3, !z3 ? x0Var11 != x0Var10 : x0Var11 != x0Var8));
            RunnableC1165c listener = new RunnableC1165c(arrayListZ, i10, x0Var11, this);
            Intrinsics.checkNotNullParameter(listener, "listener");
            x0Var11.f17249d.add(listener);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList12 = new ArrayList();
        for (Object obj3 : arrayList11) {
            if (!((C1173h) obj3).b()) {
                arrayList12.add(obj3);
            }
        }
        ArrayList<C1173h> arrayList13 = new ArrayList();
        for (Object obj4 : arrayList12) {
            if (((C1173h) obj4).c() != null) {
                arrayList13.add(obj4);
            }
        }
        s0 s0Var = null;
        for (C1173h c1173h : arrayList13) {
            s0 s0VarC = c1173h.c();
            if (s0Var != null && s0VarC != s0Var) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c1173h.f17128a.f17248c + " returned Transition " + c1173h.f17136c + " which uses a different Transition type than other Fragments.").toString());
            }
            s0Var = s0VarC;
        }
        ViewGroup viewGroup = this.f16974a;
        if (s0Var != null) {
            View view7 = new View(viewGroup.getContext());
            Rect rect = new Rect();
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            M.f fVar2 = new M.f(0);
            Iterator it5 = arrayList11.iterator();
            boolean z13 = false;
            View view8 = null;
            loop11: while (true) {
                Object obj5 = null;
                while (true) {
                    if (!it5.hasNext()) {
                        ArrayList arrayList16 = arrayList11;
                        arrayList = arrayListZ;
                        x0 x0Var12 = x0Var10;
                        M.n nVar2 = fVar2;
                        s0 s0Var2 = s0Var;
                        arrayList2 = arrayList10;
                        ArrayList arrayList17 = arrayList15;
                        ArrayList arrayList18 = arrayList14;
                        x0Var = x0Var8;
                        ArrayList arrayList19 = new ArrayList();
                        Iterator it6 = arrayList16.iterator();
                        Object objJ = null;
                        Object objJ2 = null;
                        while (it6.hasNext()) {
                            C1173h c1173h2 = (C1173h) it6.next();
                            boolean zB = c1173h2.b();
                            it6 = it6;
                            x0 x0Var13 = c1173h2.f17128a;
                            if (zB) {
                                arrayList4 = arrayList18;
                                linkedHashMap.put(x0Var13, Boolean.FALSE);
                                c1173h2.a();
                                arrayList5 = arrayList17;
                                obj = obj5;
                            } else {
                                arrayList4 = arrayList18;
                                Object objF = s0Var2.f(c1173h2.f17136c);
                                arrayList5 = arrayList17;
                                obj = obj5;
                                boolean z14 = obj != null && (x0Var13 == x0Var || x0Var13 == x0Var12);
                                if (objF != null) {
                                    x0 x0Var14 = x0Var12;
                                    ArrayList arrayList20 = new ArrayList();
                                    Fragment fragment4 = x0Var13.f17248c;
                                    Object obj6 = objJ2;
                                    View view9 = fragment4.mView;
                                    Intrinsics.checkNotNullExpressionValue(view9, "operation.fragment.mView");
                                    h(view9, arrayList20);
                                    if (z14) {
                                        if (x0Var13 == x0Var) {
                                            arrayList20.removeAll(CollectionsKt.b0(arrayList4));
                                        } else {
                                            arrayList20.removeAll(CollectionsKt.b0(arrayList5));
                                        }
                                    }
                                    if (arrayList20.isEmpty()) {
                                        s0Var2.a(view7, objF);
                                        view = view7;
                                        arrayList6 = arrayList20;
                                        obj2 = objF;
                                    } else {
                                        s0Var2.b(objF, arrayList20);
                                        s0Var2.l(objF, objF, arrayList20, null, null);
                                        obj2 = objF;
                                        arrayList6 = arrayList20;
                                        view = view7;
                                        if (x0Var13.f17246a == B0.f16952d) {
                                            arrayList.remove(x0Var13);
                                            ArrayList arrayList21 = new ArrayList(arrayList6);
                                            arrayList21.remove(fragment4.mView);
                                            s0Var2.k(obj2, fragment4.mView, arrayList21);
                                            ViewTreeObserverOnPreDrawListenerC1067t.a(viewGroup, new RunnableC1182q(arrayList6, 1));
                                        }
                                    }
                                    if (x0Var13.f17246a == B0.f16951c) {
                                        arrayList19.addAll(arrayList6);
                                        if (z13) {
                                            s0Var2.n(obj2, rect);
                                        }
                                        view2 = view8;
                                    } else {
                                        view2 = view8;
                                        s0Var2.m(view2, obj2);
                                    }
                                    linkedHashMap.put(x0Var13, Boolean.TRUE);
                                    if (c1173h2.f17137d) {
                                        objJ = s0Var2.j(objJ, obj2);
                                        view8 = view2;
                                        arrayList18 = arrayList4;
                                        view7 = view;
                                        arrayList17 = arrayList5;
                                        x0Var12 = x0Var14;
                                        obj5 = obj;
                                        objJ2 = obj6;
                                    } else {
                                        objJ2 = s0Var2.j(obj6, obj2);
                                        view8 = view2;
                                        arrayList18 = arrayList4;
                                        view7 = view;
                                        arrayList17 = arrayList5;
                                        x0Var12 = x0Var14;
                                        obj5 = obj;
                                    }
                                } else if (!z14) {
                                    linkedHashMap.put(x0Var13, Boolean.FALSE);
                                    c1173h2.a();
                                }
                            }
                            obj5 = obj;
                            arrayList18 = arrayList4;
                            arrayList17 = arrayList5;
                        }
                        ArrayList arrayList22 = arrayList17;
                        ArrayList arrayList23 = arrayList18;
                        Object obj7 = obj5;
                        x0 x0Var15 = x0Var12;
                        Object objI = s0Var2.i(objJ, objJ2, obj7);
                        if (objI != null) {
                            ArrayList<C1173h> arrayList24 = new ArrayList();
                            for (Object obj8 : arrayList16) {
                                if (!((C1173h) obj8).b()) {
                                    arrayList24.add(obj8);
                                }
                            }
                            for (C1173h c1173h3 : arrayList24) {
                                Object obj9 = c1173h3.f17136c;
                                x0 x0Var16 = c1173h3.f17128a;
                                x0 x0Var17 = x0Var15;
                                boolean z15 = obj7 != null && (x0Var16 == x0Var || x0Var16 == x0Var17);
                                if (obj9 != null || z15) {
                                    WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                                    if (viewGroup.isLaidOut()) {
                                        s0Var2.o(objI, c1173h3.f17129b, new v0(c1173h3, x0Var16, i13));
                                    } else {
                                        if (Z.L(i13)) {
                                            Objects.toString(viewGroup);
                                            Objects.toString(x0Var16);
                                        }
                                        c1173h3.a();
                                    }
                                }
                                x0Var15 = x0Var17;
                                i13 = 2;
                            }
                            x0Var2 = x0Var15;
                            WeakHashMap weakHashMap2 = androidx.core.view.N.f16168a;
                            if (!viewGroup.isLaidOut()) {
                                break loop11;
                            }
                            l0.a(4, arrayList19);
                            ArrayList arrayList25 = new ArrayList();
                            int size = arrayList22.size();
                            int i15 = 0;
                            while (i15 < size) {
                                ArrayList arrayList26 = arrayList22;
                                View view10 = (View) arrayList26.get(i15);
                                WeakHashMap weakHashMap3 = androidx.core.view.N.f16168a;
                                arrayList25.add(androidx.core.view.E.f(view10));
                                androidx.core.view.E.o(view10, null);
                                i15++;
                                arrayList22 = arrayList26;
                            }
                            ArrayList arrayList27 = arrayList22;
                            if (Z.L(2)) {
                                for (Object sharedElementFirstOutViews : arrayList23) {
                                    Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                                    View view11 = (View) sharedElementFirstOutViews;
                                    Objects.toString(view11);
                                    androidx.core.view.E.f(view11);
                                }
                                for (Object sharedElementLastInViews : arrayList27) {
                                    Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                                    View view12 = (View) sharedElementLastInViews;
                                    Objects.toString(view12);
                                    androidx.core.view.E.f(view12);
                                }
                            }
                            s0Var2.c(viewGroup, objI);
                            int size2 = arrayList27.size();
                            ArrayList arrayList28 = new ArrayList();
                            int i16 = 0;
                            while (i16 < size2) {
                                ArrayList arrayList29 = arrayList23;
                                View view13 = (View) arrayList29.get(i16);
                                WeakHashMap weakHashMap4 = androidx.core.view.N.f16168a;
                                String strF = androidx.core.view.E.f(view13);
                                arrayList28.add(strF);
                                if (strF == null) {
                                    i7 = size2;
                                    arrayList3 = arrayList28;
                                    x0Var4 = x0Var;
                                    nVar = nVar2;
                                } else {
                                    arrayList3 = arrayList28;
                                    androidx.core.view.E.o(view13, null);
                                    nVar = nVar2;
                                    String str2 = (String) nVar.get(strF);
                                    x0Var4 = x0Var;
                                    int i17 = 0;
                                    while (true) {
                                        i7 = size2;
                                        if (i17 >= size2) {
                                            break;
                                        }
                                        if (str2.equals(arrayList25.get(i17))) {
                                            androidx.core.view.E.o((View) arrayList27.get(i17), strF);
                                            break;
                                        } else {
                                            i17++;
                                            size2 = i7;
                                        }
                                    }
                                }
                                i16++;
                                nVar2 = nVar;
                                arrayList23 = arrayList29;
                                x0Var = x0Var4;
                                size2 = i7;
                                arrayList28 = arrayList3;
                            }
                            x0Var3 = x0Var;
                            ArrayList arrayList30 = arrayList23;
                            z8 = true;
                            ViewTreeObserverOnPreDrawListenerC1067t.a(viewGroup, new r0(size2, arrayList27, arrayList25, arrayList30, arrayList28));
                            z10 = false;
                            l0.a(0, arrayList19);
                            s0Var2.q(obj7, arrayList30, arrayList27);
                            break loop11;
                        }
                        x0Var2 = x0Var15;
                    } else {
                        Object obj10 = ((C1173h) it5.next()).f17138e;
                        if (obj10 == null || x0Var8 == null || x0Var10 == null) {
                            arrayList7 = arrayList11;
                            fVar = fVar2;
                            arrayList8 = arrayList10;
                            s0Var = s0Var;
                            arrayList15 = arrayList15;
                            x0Var8 = x0Var8;
                            x0Var10 = x0Var10;
                            arrayListZ = arrayListZ;
                            arrayList14 = arrayList14;
                        } else {
                            Object objR = s0Var.r(s0Var.f(obj10));
                            Fragment inFragment = x0Var10.f17248c;
                            ArrayList arrayList31 = arrayListZ;
                            ArrayList<String> sharedElementSourceNames = inFragment.getSharedElementSourceNames();
                            Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                            Fragment outFragment = x0Var8.f17248c;
                            ArrayList arrayList32 = arrayList11;
                            ArrayList<String> sharedElementSourceNames2 = outFragment.getSharedElementSourceNames();
                            x0 x0Var18 = x0Var10;
                            Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementTargetNames = outFragment.getSharedElementTargetNames();
                            x0 x0Var19 = x0Var8;
                            Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                            int size3 = sharedElementTargetNames.size();
                            int i18 = 0;
                            while (i18 < size3) {
                                int i19 = size3;
                                int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i18));
                                ArrayList<String> arrayList33 = sharedElementTargetNames;
                                if (iIndexOf != -1) {
                                    sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i18));
                                }
                                i18++;
                                size3 = i19;
                                sharedElementTargetNames = arrayList33;
                            }
                            ArrayList<String> sharedElementTargetNames2 = inFragment.getSharedElementTargetNames();
                            Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                            if (z3) {
                                outFragment.getEnterTransitionCallback();
                                inFragment.getExitTransitionCallback();
                                pair = new Pair(null, null);
                            } else {
                                outFragment.getExitTransitionCallback();
                                inFragment.getEnterTransitionCallback();
                                pair = new Pair(null, null);
                            }
                            if (pair.f38891a != null) {
                                throw new ClassCastException();
                            }
                            if (pair.f38892b != null) {
                                throw new ClassCastException();
                            }
                            int i20 = 0;
                            for (int size4 = sharedElementSourceNames.size(); i20 < size4; size4 = size4) {
                                fVar2.put(sharedElementSourceNames.get(i20), sharedElementTargetNames2.get(i20));
                                i20++;
                            }
                            if (Z.L(i13)) {
                                for (String str3 : sharedElementTargetNames2) {
                                }
                                for (String str4 : sharedElementSourceNames) {
                                }
                            }
                            M.f sharedElements = new M.f(0);
                            View view14 = outFragment.mView;
                            Intrinsics.checkNotNullExpressionValue(view14, "firstOut.fragment.mView");
                            i(sharedElements, view14);
                            sharedElements.m(sharedElementSourceNames);
                            fVar2.m(sharedElements.keySet());
                            M.f namedViews = new M.f(0);
                            View view15 = inFragment.mView;
                            Intrinsics.checkNotNullExpressionValue(view15, "lastIn.fragment.mView");
                            i(namedViews, view15);
                            namedViews.m(sharedElementTargetNames2);
                            namedViews.m(fVar2.values());
                            q0 q0Var = l0.f17180a;
                            Intrinsics.checkNotNullParameter(fVar2, "<this>");
                            Intrinsics.checkNotNullParameter(namedViews, "namedViews");
                            int i21 = fVar2.f5695c - 1;
                            arrayList8 = arrayList10;
                            int i22 = -1;
                            while (i22 < i21) {
                                int i23 = i22;
                                if (!namedViews.containsKey((String) fVar2.j(i21))) {
                                    fVar2.h(i21);
                                }
                                i21--;
                                i22 = i23;
                            }
                            Set setKeySet = fVar2.keySet();
                            Intrinsics.checkNotNullExpressionValue(setKeySet, "sharedElementNameMapping.keys");
                            Set entries = sharedElements.entrySet();
                            Intrinsics.checkNotNullExpressionValue(entries, "entries");
                            M.f fVar3 = fVar2;
                            C0.J predicate = new C0.J(setKeySet, 6);
                            Intrinsics.checkNotNullParameter(entries, "<this>");
                            Intrinsics.checkNotNullParameter(predicate, "predicate");
                            kotlin.collections.v.q(entries, predicate, false);
                            Collection collectionValues = fVar3.values();
                            Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                            Set entries2 = namedViews.entrySet();
                            Intrinsics.checkNotNullExpressionValue(entries2, "entries");
                            C0.J predicate2 = new C0.J(collectionValues, 6);
                            Intrinsics.checkNotNullParameter(entries2, "<this>");
                            Intrinsics.checkNotNullParameter(predicate2, "predicate");
                            kotlin.collections.v.q(entries2, predicate2, false);
                            if (fVar3.isEmpty()) {
                                arrayList14.clear();
                                arrayList15.clear();
                                arrayListZ = arrayList31;
                                arrayList11 = arrayList32;
                                x0Var10 = x0Var18;
                                x0Var8 = x0Var19;
                                arrayList10 = arrayList8;
                                fVar2 = fVar3;
                            } else {
                                Intrinsics.checkNotNullParameter(inFragment, "inFragment");
                                Intrinsics.checkNotNullParameter(outFragment, "outFragment");
                                Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                                if (z3) {
                                    outFragment.getEnterTransitionCallback();
                                } else {
                                    inFragment.getEnterTransitionCallback();
                                }
                                ArrayList arrayList34 = arrayList15;
                                ArrayList arrayList35 = arrayList14;
                                fVar = fVar3;
                                arrayList7 = arrayList32;
                                ViewTreeObserverOnPreDrawListenerC1067t.a(viewGroup, new RunnableC1169e(0, x0Var18, x0Var19, namedViews, z3));
                                arrayList35.addAll(sharedElements.values());
                                if (!sharedElementSourceNames.isEmpty()) {
                                    View view16 = (View) sharedElements.get(sharedElementSourceNames.get(0));
                                    s0Var.m(view16, objR);
                                    view8 = view16;
                                }
                                arrayList34.addAll(namedViews.values());
                                if (!sharedElementTargetNames2.isEmpty() && (view3 = (View) namedViews.get(sharedElementTargetNames2.get(0))) != null) {
                                    ViewTreeObserverOnPreDrawListenerC1067t.a(viewGroup, new RunnableC1165c(s0Var, i14, view3, rect));
                                    z13 = true;
                                }
                                s0Var.p(objR, view7, arrayList35);
                                s0 s0Var3 = s0Var;
                                s0Var3.l(objR, null, null, objR, arrayList34);
                                Boolean bool = Boolean.TRUE;
                                linkedHashMap.put(x0Var19, bool);
                                linkedHashMap.put(x0Var18, bool);
                                s0Var = s0Var3;
                                arrayList15 = arrayList34;
                                x0Var8 = x0Var19;
                                x0Var10 = x0Var18;
                                arrayListZ = arrayList31;
                                arrayList14 = arrayList35;
                                obj5 = objR;
                            }
                        }
                        arrayList10 = arrayList8;
                        fVar2 = fVar;
                        i14 = 1;
                        arrayList11 = arrayList7;
                    }
                }
            }
            zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
            context = viewGroup.getContext();
            arrayList9 = new ArrayList();
            it = arrayList2.iterator();
            z11 = z10;
            while (true) {
                str = "context";
                if (it.hasNext()) {
                    break;
                }
                c1171f = (C1171f) it.next();
                if (c1171f.b()) {
                    c1171f.a();
                } else {
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    fC2 = c1171f.c(context);
                    if (fC2 == null) {
                        c1171f.a();
                    } else {
                        animator = (Animator) fC2.f16980b;
                        if (animator == null) {
                            arrayList9.add(c1171f);
                        } else {
                            x0Var6 = c1171f.f17128a;
                            zC = Intrinsics.c(linkedHashMap.get(x0Var6), Boolean.TRUE);
                            fragment2 = x0Var6.f17248c;
                            if (zC) {
                                if (Z.L(2)) {
                                    Objects.toString(fragment2);
                                }
                                c1171f.a();
                            } else {
                                if (x0Var6.f17246a == B0.f16952d) {
                                    z12 = z8;
                                } else {
                                    z12 = z10;
                                }
                                if (z12) {
                                    arrayList.remove(x0Var6);
                                }
                                View view17 = fragment2.mView;
                                viewGroup.startViewTransition(view17);
                                animator.addListener(new C1174i(this, view17, z12, x0Var6, c1171f));
                                animator.setTarget(view17);
                                animator.start();
                                if (Z.L(2)) {
                                    x0Var6.toString();
                                }
                                c1171f.f17129b.b(new CancellationSignal$OnCancelListener() { // from class: androidx.fragment.app.d
                                    @Override // androidx.core.os.CancellationSignal$OnCancelListener
                                    public final void onCancel() {
                                        x0 operation = x0Var6;
                                        Intrinsics.checkNotNullParameter(operation, "$operation");
                                        animator.end();
                                        if (Z.L(2)) {
                                            Objects.toString(operation);
                                        }
                                    }
                                });
                                z11 = z8;
                            }
                        }
                    }
                }
            }
            c1176k = this;
            for (C1171f c1171f2 : arrayList9) {
                x0Var5 = c1171f2.f17128a;
                fragment = x0Var5.f17248c;
                if (zContainsValue) {
                    if (Z.L(2)) {
                        Objects.toString(fragment);
                    }
                    c1171f2.a();
                } else if (z11) {
                    if (Z.L(2)) {
                        Objects.toString(fragment);
                    }
                    c1171f2.a();
                } else {
                    view4 = fragment.mView;
                    Intrinsics.checkNotNullExpressionValue(context, str);
                    fC = c1171f2.c(context);
                    if (fC != null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    animation = (Animation) fC.f16979a;
                    if (animation != null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (x0Var5.f17246a != B0.f16950b) {
                        view4.startAnimation(animation);
                        c1171f2.a();
                    } else {
                        viewGroup.startViewTransition(view4);
                        G g7 = new G(animation, viewGroup, view4);
                        g7.setAnimationListener(new AnimationAnimationListenerC1175j(x0Var5, c1176k, view4, c1171f2));
                        view4.startAnimation(g7);
                        if (Z.L(2)) {
                            x0Var5.toString();
                        }
                    }
                    String str5 = str;
                    c1171f2.f17129b.b(new Q0(view4, c1176k, c1171f2, x0Var5, 3));
                    c1176k = this;
                    str = str5;
                }
            }
            for (x0 x0Var20 : arrayList) {
                View view18 = x0Var20.f17248c.mView;
                B0 b10 = x0Var20.f17246a;
                Intrinsics.checkNotNullExpressionValue(view18, "view");
                b10.a(view18);
            }
            arrayList.clear();
            if (Z.L(2)) {
                Objects.toString(x0Var3);
                Objects.toString(x0Var2);
            }
        }
        for (C1173h c1173h4 : arrayList11) {
            linkedHashMap.put(c1173h4.f17128a, Boolean.FALSE);
            c1173h4.a();
        }
        arrayList = arrayListZ;
        x0Var2 = x0Var10;
        x0Var = x0Var8;
        arrayList2 = arrayList10;
        x0Var3 = x0Var;
        z10 = false;
        z8 = true;
        zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        context = viewGroup.getContext();
        arrayList9 = new ArrayList();
        it = arrayList2.iterator();
        z11 = z10;
        while (true) {
            str = "context";
            if (it.hasNext()) {
                break;
                break;
            }
            c1171f = (C1171f) it.next();
            if (c1171f.b()) {
                c1171f.a();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                fC2 = c1171f.c(context);
                if (fC2 == null) {
                    c1171f.a();
                } else {
                    animator = (Animator) fC2.f16980b;
                    if (animator == null) {
                        arrayList9.add(c1171f);
                    } else {
                        x0Var6 = c1171f.f17128a;
                        zC = Intrinsics.c(linkedHashMap.get(x0Var6), Boolean.TRUE);
                        fragment2 = x0Var6.f17248c;
                        if (zC) {
                            if (Z.L(2)) {
                                Objects.toString(fragment2);
                            }
                            c1171f.a();
                        } else {
                            if (x0Var6.f17246a == B0.f16952d) {
                                z12 = z8;
                            } else {
                                z12 = z10;
                            }
                            if (z12) {
                                arrayList.remove(x0Var6);
                            }
                            View view19 = fragment2.mView;
                            viewGroup.startViewTransition(view19);
                            animator.addListener(new C1174i(this, view19, z12, x0Var6, c1171f));
                            animator.setTarget(view19);
                            animator.start();
                            if (Z.L(2)) {
                                x0Var6.toString();
                            }
                            c1171f.f17129b.b(new CancellationSignal$OnCancelListener() { // from class: androidx.fragment.app.d
                                @Override // androidx.core.os.CancellationSignal$OnCancelListener
                                public final void onCancel() {
                                    x0 operation = x0Var6;
                                    Intrinsics.checkNotNullParameter(operation, "$operation");
                                    animator.end();
                                    if (Z.L(2)) {
                                        Objects.toString(operation);
                                    }
                                }
                            });
                            z11 = z8;
                        }
                    }
                }
            }
        }
        c1176k = this;
        while (r7.hasNext()) {
            x0Var5 = c1171f2.f17128a;
            fragment = x0Var5.f17248c;
            if (zContainsValue) {
                if (Z.L(2)) {
                    Objects.toString(fragment);
                }
                c1171f2.a();
            } else if (z11) {
                if (Z.L(2)) {
                    Objects.toString(fragment);
                }
                c1171f2.a();
            } else {
                view4 = fragment.mView;
                Intrinsics.checkNotNullExpressionValue(context, str);
                fC = c1171f2.c(context);
                if (fC != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                animation = (Animation) fC.f16979a;
                if (animation != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (x0Var5.f17246a != B0.f16950b) {
                    view4.startAnimation(animation);
                    c1171f2.a();
                } else {
                    viewGroup.startViewTransition(view4);
                    G g10 = new G(animation, viewGroup, view4);
                    g10.setAnimationListener(new AnimationAnimationListenerC1175j(x0Var5, c1176k, view4, c1171f2));
                    view4.startAnimation(g10);
                    if (Z.L(2)) {
                        x0Var5.toString();
                    }
                }
                String str6 = str;
                c1171f2.f17129b.b(new Q0(view4, c1176k, c1171f2, x0Var5, 3));
                c1176k = this;
                str = str6;
            }
        }
        while (r0.hasNext()) {
            View view110 = x0Var20.f17248c.mView;
            B0 b11 = x0Var20.f17246a;
            Intrinsics.checkNotNullExpressionValue(view110, "view");
            b11.a(view110);
        }
        arrayList.clear();
        if (Z.L(2)) {
            Objects.toString(x0Var3);
            Objects.toString(x0Var2);
        }
    }
}
