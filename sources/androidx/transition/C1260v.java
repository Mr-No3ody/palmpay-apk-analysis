package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.transition.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1260v extends androidx.fragment.app.s0 {
    public static boolean s(Transition transition) {
        return (androidx.fragment.app.s0.h(transition.getTargetIds()) && androidx.fragment.app.s0.h(transition.getTargetNames()) && androidx.fragment.app.s0.h(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.s0
    public final void a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.s0
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i7 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.f18003a.size();
            while (i7 < size) {
                b(transitionSet.g(i7), arrayList);
                i7++;
            }
            return;
        }
        if (s(transition) || !androidx.fragment.app.s0.h(transition.getTargets())) {
            return;
        }
        int size2 = arrayList.size();
        while (i7 < size2) {
            transition.addTarget((View) arrayList.get(i7));
            i7++;
        }
    }

    @Override // androidx.fragment.app.s0
    public final void c(ViewGroup viewGroup, Object obj) {
        X.a(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.s0
    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.s0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).mo73clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.s0
    public final Object i(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.f(transition);
            transitionSet.f(transition2);
            transitionSet.k(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.f(transition);
        }
        transitionSet2.f(transition3);
        return transitionSet2;
    }

    @Override // androidx.fragment.app.s0
    public final Object j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.f((Transition) obj);
        }
        transitionSet.f((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.s0
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C1257s(view, arrayList));
    }

    @Override // androidx.fragment.app.s0
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C1258t(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.s0
    public final void m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            androidx.fragment.app.s0.g(view, rect);
            ((Transition) obj).setEpicenterCallback(new r(0, rect));
        }
    }

    @Override // androidx.fragment.app.s0
    public final void n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new r(1, rect));
    }

    @Override // androidx.fragment.app.s0
    public final void o(Object obj, androidx.core.os.d dVar, androidx.fragment.app.v0 v0Var) {
        Transition transition = (Transition) obj;
        dVar.b(new U8.a(17, transition, v0Var));
        transition.addListener(new C1259u(v0Var));
    }

    @Override // androidx.fragment.app.s0
    public final void p(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            androidx.fragment.app.s0.d(targets, (View) arrayList.get(i7));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.s0
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            t(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.s0
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.f((Transition) obj);
        return transitionSet;
    }

    public final void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        int i7 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.f18003a.size();
            while (i7 < size) {
                t(transitionSet.g(i7), arrayList, arrayList2);
                i7++;
            }
            return;
        }
        if (s(transition)) {
            return;
        }
        List<View> targets = transition.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            while (i7 < size2) {
                transition.addTarget((View) arrayList2.get(i7));
                i7++;
            }
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                transition.removeTarget((View) arrayList.get(size3));
            }
        }
    }
}
