package M7;

import androidx.core.view.V;
import androidx.core.view.W;
import androidx.core.view.d0;
import androidx.core.view.q0;
import com.swmansion.rnscreens.ScreenFooter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScreenFooter f5855a;

    public u(ScreenFooter screenFooter) {
        this.f5855a = screenFooter;
    }

    @Override // androidx.core.view.W
    public final void onEnd(d0 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f5855a.f25316c = false;
    }

    @Override // androidx.core.view.W
    public final q0 onProgress(q0 insets, List runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        int i7 = insets.f16277a.g(8).f16061d - insets.f16277a.g(2).f16061d;
        ScreenFooter screenFooter = this.f5855a;
        screenFooter.f25318e = i7;
        screenFooter.d(screenFooter.f25315b, screenFooter.getReactHeight(), ScreenFooter.c(screenFooter, screenFooter.f25317d), screenFooter.f25318e);
        return insets;
    }

    @Override // androidx.core.view.W
    public final V onStart(d0 animation, V bounds) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f5855a.f25316c = true;
        Intrinsics.checkNotNullExpressionValue(bounds, "onStart(...)");
        return bounds;
    }
}
