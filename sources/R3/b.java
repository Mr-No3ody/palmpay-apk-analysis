package R3;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckCVVFragment;
import com.flexibank.sdk.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlexiBankCheckCVVFragment f7917b;

    public /* synthetic */ b(FlexiBankCheckCVVFragment flexiBankCheckCVVFragment, int i7) {
        this.f7916a = i7;
        this.f7917b = flexiBankCheckCVVFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AppCompatEditText appCompatEditText;
        FlexiBankCheckCVVFragment flexiBankCheckCVVFragment = this.f7917b;
        switch (this.f7916a) {
            case 0:
                FlexiBankCheckCVVFragment.a aVar = FlexiBankCheckCVVFragment.f22017p;
                Context context = flexiBankCheckCVVFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                new c(context, q.fb_layout_how_to_get_cvv, 4, 0).show();
                break;
            default:
                FlexiBankCheckCVVFragment.a aVar2 = FlexiBankCheckCVVFragment.f22017p;
                FlexiBankPayVerificationCallback flexiBankPayVerificationCallbackO = flexiBankCheckCVVFragment.o();
                if (flexiBankPayVerificationCallbackO != null) {
                    x4.c cVar = (x4.c) flexiBankCheckCVVFragment.f21944f;
                    flexiBankPayVerificationCallbackO.verifyPayMethod(String.valueOf((cVar == null || (appCompatEditText = cVar.f43584c) == null) ? null : appCompatEditText.getEditableText()), 9);
                }
                break;
        }
    }
}
