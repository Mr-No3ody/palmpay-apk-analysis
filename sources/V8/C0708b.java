package V8;

import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAddressFragment;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0708b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationAddressFragment f10119b;

    public /* synthetic */ C0708b(IdentityVerificationAddressFragment identityVerificationAddressFragment, int i7) {
        this.f10118a = i7;
        this.f10119b = identityVerificationAddressFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextView textView;
        PpButton ppButton;
        IdentityVerificationAddressFragment identityVerificationAddressFragment = this.f10119b;
        String it = (String) obj;
        switch (this.f10118a) {
            case 0:
                int i7 = IdentityVerificationAddressFragment.f26156Q;
                Intrinsics.checkNotNullParameter(it, "it");
                I8.p pVar = (I8.p) identityVerificationAddressFragment.f27335j;
                if (pVar != null && (ppButton = pVar.f4182i) != null) {
                    ppButton.b(false);
                }
                I8.p pVar2 = (I8.p) identityVerificationAddressFragment.f27335j;
                if (pVar2 != null && (textView = pVar2.f4184o) != null) {
                    textView.setEnabled(true);
                }
                ToastUtils.showLong(it, new Object[0]);
                break;
            default:
                int i10 = IdentityVerificationAddressFragment.f26156Q;
                Intrinsics.checkNotNullParameter(it, "errorMsg");
                p220oa.h.y(identityVerificationAddressFragment, it);
                break;
        }
        return Unit.f38893a;
    }
}
