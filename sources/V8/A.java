package V8;

import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationUserProfileFragment;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationUserProfileFragment f10105b;

    public /* synthetic */ A(IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment, int i7) {
        this.f10104a = i7;
        this.f10105b = identityVerificationUserProfileFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextView textView;
        PpButton ppButton;
        IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10105b;
        String errorMsg = (String) obj;
        switch (this.f10104a) {
            case 0:
                int i7 = IdentityVerificationUserProfileFragment.f26181L;
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                p220oa.h.y(identityVerificationUserProfileFragment, errorMsg);
                break;
            case 1:
                int i10 = IdentityVerificationUserProfileFragment.f26181L;
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                p220oa.h.y(identityVerificationUserProfileFragment, errorMsg);
                break;
            case 2:
                int i11 = IdentityVerificationUserProfileFragment.f26181L;
                Intrinsics.checkNotNullParameter(errorMsg, "it");
                I8.t tVar = (I8.t) identityVerificationUserProfileFragment.f27335j;
                if (tVar != null && (ppButton = tVar.f4224w) != null) {
                    ppButton.b(false);
                }
                I8.t tVar2 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                if (tVar2 != null && (textView = tVar2.f4210C) != null) {
                    textView.setEnabled(true);
                }
                ToastUtils.showLong(errorMsg, new Object[0]);
                break;
            case 3:
                int i12 = IdentityVerificationUserProfileFragment.f26181L;
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                p220oa.h.y(identityVerificationUserProfileFragment, errorMsg);
                break;
            case 4:
                int i13 = IdentityVerificationUserProfileFragment.f26181L;
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                p220oa.h.y(identityVerificationUserProfileFragment, errorMsg);
                break;
            default:
                int i14 = IdentityVerificationUserProfileFragment.f26181L;
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                p220oa.h.y(identityVerificationUserProfileFragment, errorMsg);
                break;
        }
        return Unit.f38893a;
    }
}
