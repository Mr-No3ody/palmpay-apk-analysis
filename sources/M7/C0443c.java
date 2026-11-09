package M7;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: M7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0443c implements OnApplyWindowInsetsListener, LifecycleEventListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f5812d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0443c f5809a = new C0443c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f5810b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference f5811c = new WeakReference(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f5813e = true;

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final q0 onApplyWindowInsets(View v3, q0 insets) {
        Intrinsics.checkNotNullParameter(v3, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        q0 q0VarL = f5813e ? androidx.core.view.N.l(v3, insets) : insets;
        Intrinsics.e(q0VarL);
        Iterator it = f5810b.iterator();
        while (it.hasNext()) {
            q0VarL = ((OnApplyWindowInsetsListener) it.next()).onApplyWindowInsets(v3, insets);
            Intrinsics.checkNotNullExpressionValue(q0VarL, "onApplyWindowInsets(...)");
        }
        return q0VarL;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        View view = (View) f5811c.get();
        if (!f5812d || view == null) {
            return;
        }
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        androidx.core.view.E.n(view, null);
        f5812d = false;
        f5811c.clear();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
    }
}
