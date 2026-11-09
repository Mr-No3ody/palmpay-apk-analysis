package M7;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import com.facebook.react.views.safeareaview.ReactSafeAreaView;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5777b;

    public /* synthetic */ A(Object obj, int i7) {
        this.f5776a = i7;
        this.f5777b = obj;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final q0 onApplyWindowInsets(View view, q0 insets) {
        Object obj = this.f5777b;
        switch (this.f5776a) {
            case 0:
                int i7 = ScreenStackFragment.f25339X;
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "windowInsets");
                SheetDelegate sheetDelegate = (SheetDelegate) obj;
                Intrinsics.checkNotNullParameter(insets, "insets");
                sheetDelegate.f25399f = insets.f16277a.g(8).f16061d;
                if (!sheetDelegate.f25397d) {
                    sheetDelegate.f(0.0f);
                }
                return insets;
            case 1:
                int i10 = ScreenStackFragment.f25339X;
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "windowInsets");
                ((ScreenStackFragment) obj).h(insets);
                return insets;
            default:
                return ReactSafeAreaView.onAttachedToWindow$lambda$0((ReactSafeAreaView) obj, view, insets);
        }
    }
}
