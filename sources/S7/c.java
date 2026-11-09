package S7;

import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreenFragment;
import kotlin.jvm.internal.Intrinsics;
import p045d3.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StackScreenFragment f8820b;

    public c(StackScreenFragment fragment, int i7) {
        this.f8819a = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                this.f8820b = fragment;
                break;
            default:
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                this.f8820b = fragment;
                break;
        }
    }

    @Override // S7.b
    public final void a(Z fragmentManager, j executor) {
        switch (this.f8819a) {
            case 0:
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(executor, "executor");
                executor.getClass();
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(this, "op");
                fragmentManager.T(1, this.f8820b.f25421a.getScreenKey());
                break;
            default:
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(executor, "executor");
                executor.getClass();
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(this, "op");
                Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
                C1161a c1161a = new C1161a(fragmentManager);
                c1161a.f17176p = true;
                Intrinsics.checkNotNullExpressionValue(c1161a, "setReorderingAllowed(...)");
                c1161a.o(this.f8820b);
                c1161a.h(true);
                break;
        }
    }
}
