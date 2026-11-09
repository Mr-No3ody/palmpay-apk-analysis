package p294tb;

import com.transsnet.palmpay.credit.ui.activity.cashloan.CLMainActivity;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tb.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2058u implements CLMainFragment.LoanProductChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLMainActivity f42514a;

    public C2058u(CLMainActivity cLMainActivity) {
        this.f42514a = cLMainActivity;
    }

    @Override // com.transsnet.palmpay.credit.ui.fragment.CLMainFragment.LoanProductChangeListener
    public final void onLoanProductChange(String productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        CLMainActivity cLMainActivity = this.f42514a;
        cLMainActivity.getClass();
        Intrinsics.checkNotNullParameter(productType, "<set-?>");
        cLMainActivity.f29209v = productType;
    }
}
