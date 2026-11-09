package M7;

import android.os.Build;
import androidx.core.view.W;
import androidx.core.view.d0;
import androidx.core.view.q0;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetDelegate f5782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenStackFragment f5783b;

    public D(SheetDelegate sheetDelegate, ScreenStackFragment screenStackFragment) {
        this.f5782a = sheetDelegate;
        this.f5783b = screenStackFragment;
    }

    @Override // androidx.core.view.W
    public final void onEnd(d0 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f5783b.getScreen().e();
    }

    @Override // androidx.core.view.W
    public final q0 onProgress(q0 insets, List runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        if (Build.VERSION.SDK_INT >= 30) {
            SheetDelegate sheetDelegate = this.f5782a;
            Intrinsics.checkNotNullParameter(insets, "insets");
            sheetDelegate.f25399f = insets.f16277a.g(8).f16061d;
            if (!sheetDelegate.f25397d) {
                sheetDelegate.f(0.0f);
            }
        }
        return insets;
    }
}
