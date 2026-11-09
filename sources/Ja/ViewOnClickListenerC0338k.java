package Ja;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckCVVFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ja.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0338k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckCVVFragment f4661b;

    public /* synthetic */ ViewOnClickListenerC0338k(CheckCVVFragment checkCVVFragment, int i7) {
        this.f4660a = i7;
        this.f4661b = checkCVVFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CheckCVVFragment checkCVVFragment = this.f4661b;
        switch (this.f4660a) {
            case 0:
                CheckCVVFragment.a aVar = CheckCVVFragment.f27973A;
                Context contextRequireContext = checkCVVFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                new CheckCVVFragment.CheckCvvDialog(contextRequireContext).show();
                break;
            default:
                CheckCVVFragment.a aVar2 = CheckCVVFragment.f27973A;
                PayVerificationCallback payVerificationCallbackU = checkCVVFragment.u();
                if (payVerificationCallbackU != null) {
                    AppCompatEditText appCompatEditText = (AppCompatEditText) checkCVVFragment.f27975o.getValue();
                    payVerificationCallbackU.verifyPayMethod(String.valueOf(appCompatEditText != null ? appCompatEditText.getEditableText() : null), 9);
                }
                break;
        }
    }
}
