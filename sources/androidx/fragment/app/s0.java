package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public static void d(List list, View view) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (list.get(i7) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        if (androidx.core.view.E.f(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = (View) list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            if (androidx.core.view.E.f(childAt) == null) {
                                break;
                            }
                            list.add(childAt);
                            break;
                        } else if (list.get(i12) == childAt) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
    }

    public static void g(View view, Rect rect) {
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean h(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public abstract Object i(Object obj, Object obj2, Object obj3);

    public abstract Object j(Object obj, Object obj2);

    public abstract void k(Object obj, View view, ArrayList arrayList);

    public abstract void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract void m(View view, Object obj);

    public abstract void n(Object obj, Rect rect);

    public abstract void o(Object obj, androidx.core.os.d dVar, v0 v0Var);

    public abstract void p(Object obj, View view, ArrayList arrayList);

    public abstract void q(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object r(Object obj);
}
