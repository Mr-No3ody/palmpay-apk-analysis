package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class W implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Transition f18010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f18011b;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup = this.f18011b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = X.f18014c;
        ViewGroup viewGroup2 = this.f18011b;
        if (!arrayList.remove(viewGroup2)) {
            return true;
        }
        M.f fVarB = X.b();
        ArrayList arrayList2 = (ArrayList) fVarB.get(viewGroup2);
        ArrayList arrayList3 = null;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            fVarB.put(viewGroup2, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList3 = new ArrayList(arrayList2);
        }
        Transition transition = this.f18010a;
        arrayList2.add(transition);
        transition.addListener(new V(this, fVarB));
        transition.captureValues(viewGroup2, false);
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).resume(viewGroup2);
            }
        }
        transition.playTransition(viewGroup2);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f18011b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = X.f18014c;
        ViewGroup viewGroup2 = this.f18011b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) X.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).resume(viewGroup2);
            }
        }
        this.f18010a.clearValues(true);
    }
}
