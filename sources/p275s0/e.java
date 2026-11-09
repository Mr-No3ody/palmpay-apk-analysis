package p275s0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f42006a = d.f42004b;

    public static d a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                Z parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                parentFragmentManager.getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return f42006a;
    }

    public static void b(j jVar) {
        if (Z.L(3)) {
            jVar.f42008a.getClass();
        }
    }

    public static final void c(Fragment fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        b(new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        a(fragment).f42005a.contains(b.f41996a);
    }
}
