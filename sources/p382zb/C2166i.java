package p382zb;

import C0.G;
import com.transsnet.palmpay.credit.bean.req.QueryInstallmentWithdrawReq;
import com.transsnet.palmpay.credit.bean.req.SignProtocolReq;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.credit.view.InstallmentLoanView;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: renamed from: zb.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2166i implements InstallmentLoanView.OnButtonClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLMainFragment f44590a;

    public C2166i(CLMainFragment cLMainFragment) {
        this.f44590a = cLMainFragment;
    }

    @Override // com.transsnet.palmpay.credit.view.InstallmentLoanView.OnButtonClickListener
    public final void onBorrowClick() {
        int i7 = CLMainFragment.j1;
        CLMainFragment cLMainFragment = this.f44590a;
        cLMainFragment.showLoadingDialog(true);
        G.h(c.f40268a).queryInstallmentLoanWithdrawPreCheck(new QueryInstallmentWithdrawReq(new SignProtocolReq(1))).k(f.f42629b).i(b.a()).subscribe(new C2164g(cLMainFragment, 1));
    }
}
