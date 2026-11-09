package N7;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStackFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenStackFragment f6114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Screen f6115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoordinatorLayout f6116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f6117d;

    public g(ScreenStackFragment fragment, Screen screen, CoordinatorLayout coordinatorLayout, d dimmingDelegate) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(dimmingDelegate, "dimmingDelegate");
        this.f6114a = fragment;
        this.f6115b = screen;
        this.f6116c = coordinatorLayout;
        this.f6117d = dimmingDelegate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.c(this.f6114a, gVar.f6114a) && Intrinsics.c(this.f6115b, gVar.f6115b) && Intrinsics.c(this.f6116c, gVar.f6116c) && Intrinsics.c(this.f6117d, gVar.f6117d);
    }

    public final int hashCode() {
        return this.f6117d.hashCode() + ((this.f6116c.hashCode() + ((this.f6115b.hashCode() + (this.f6114a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SheetAnimationContext(fragment=" + this.f6114a + ", screen=" + this.f6115b + ", coordinatorLayout=" + this.f6116c + ", dimmingDelegate=" + this.f6117d + ")";
    }
}
