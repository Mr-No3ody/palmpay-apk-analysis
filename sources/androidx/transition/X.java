package androidx.transition;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoTransition f18012a = new AutoTransition();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f18013b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f18014c = new ArrayList();

    public static void a(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = f18014c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (transition == null) {
            transition = f18012a;
        }
        Transition transitionMo73clone = transition.mo73clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).pause(viewGroup);
            }
        }
        if (transitionMo73clone != null) {
            transitionMo73clone.captureValues(viewGroup, true);
        }
        if (viewGroup.getTag(E.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(E.transition_current_scene, null);
        if (transitionMo73clone != null) {
            W w3 = new W();
            w3.f18010a = transitionMo73clone;
            w3.f18011b = viewGroup;
            viewGroup.addOnAttachStateChangeListener(w3);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(w3);
        }
    }

    public static M.f b() {
        M.f fVar;
        ThreadLocal threadLocal = f18013b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (fVar = (M.f) weakReference.get()) != null) {
            return fVar;
        }
        M.f fVar2 = new M.f(0);
        threadLocal.set(new WeakReference(fVar2));
        return fVar2;
    }
}
