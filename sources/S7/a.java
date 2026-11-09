package S7;

import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreenFragment;
import kotlin.jvm.internal.Intrinsics;
import p045d3.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StackScreenFragment f8816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8818c;

    public a(StackScreenFragment fragment, int i7, boolean z3) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f8816a = fragment;
        this.f8817b = i7;
        this.f8818c = z3;
    }

    @Override // S7.b
    public final void a(Z fragmentManager, j executor) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(executor, "executor");
        executor.getClass();
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(this, "op");
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        C1161a c1161a = new C1161a(fragmentManager);
        c1161a.f17176p = true;
        Intrinsics.checkNotNullExpressionValue(c1161a, "setReorderingAllowed(...)");
        StackScreenFragment stackScreenFragment = this.f8816a;
        c1161a.d(this.f8817b, stackScreenFragment, null, 1);
        if (this.f8818c) {
            c1161a.c(stackScreenFragment.f25421a.getScreenKey());
        }
        c1161a.h(true);
    }
}
