package androidx.core.view;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f16164d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f16165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray f16166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f16167c;

    public static boolean b(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(W.c.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((ViewCompat$OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public final View a(View view, KeyEvent keyEvent) {
        WeakHashMap weakHashMap = this.f16165a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        if (b(view, keyEvent)) {
            return view;
        }
        return null;
    }
}
