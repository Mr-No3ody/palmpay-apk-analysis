package N8;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import com.facebook.react.devsupport.RedBoxDialogSurfaceDelegate;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUp3Activity;
import com.transsnet.palmpay.credit.ui.activity.LoanHomeActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: N8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0474s implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6255a;

    public /* synthetic */ C0474s(int i7) {
        this.f6255a = i7;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final androidx.core.view.q0 onApplyWindowInsets(View v3, androidx.core.view.q0 insets) {
        switch (this.f6255a) {
            case 0:
                int i7 = PalmPayLevelUp3Activity.f25901v;
                Intrinsics.checkNotNullParameter(v3, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                Intrinsics.checkNotNullExpressionValue(insets.f16277a.g(7), "getInsets(...)");
                if (v3.getPaddingTop() != 0 || v3.getPaddingLeft() != 0 || v3.getPaddingRight() != 0 || v3.getPaddingBottom() != 0) {
                    v3.setPadding(0, 0, 0, 0);
                }
                return insets;
            case 1:
                return RedBoxDialogSurfaceDelegate.AnonymousClass2.onCreate$lambda$0(135, v3, insets);
            default:
                int i10 = LoanHomeActivity.f28689f;
                Intrinsics.checkNotNullParameter(v3, "view");
                Intrinsics.checkNotNullParameter(insets, "insets");
                androidx.core.graphics.e eVarG = insets.f16277a.g(2);
                Intrinsics.checkNotNullExpressionValue(eVarG, "getInsets(...)");
                v3.setPadding(v3.getPaddingLeft(), v3.getPaddingTop(), v3.getPaddingRight(), eVarG.f16061d);
                return insets;
        }
    }
}
