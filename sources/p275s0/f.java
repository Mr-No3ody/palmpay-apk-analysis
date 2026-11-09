package p275s0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f42007b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Fragment fragment, ViewGroup container, int i7) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + container);
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(container, "container");
                super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
                this.f42007b = container;
                break;
            default:
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                this.f42007b = container;
                break;
        }
    }
}
