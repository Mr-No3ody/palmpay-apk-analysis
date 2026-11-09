package Uc;

import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.ReasonForCancellationPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.p2pcash.ui.atm.view.ReasonItemView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class B0 implements ReasonItemView.Listener, P2PButton.OnP2PButtonClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReasonForCancellationPage f9533a;

    public /* synthetic */ B0(ReasonForCancellationPage reasonForCancellationPage) {
        this.f9533a = reasonForCancellationPage;
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton.OnP2PButtonClickListener
    public void onClick() {
        String strA;
        int i7 = ReasonForCancellationPage.f32913j;
        A0 a0M = this.f9533a.m();
        if (Intrinsics.c(a0M.a(), "Other")) {
            strA = (String) a0M.f9528c.getValue(a0M, A0.f9525e[2]);
        } else {
            strA = a0M.a();
        }
        ReasonForCancellationPage reasonForCancellationPage = a0M.f9529d;
        reasonForCancellationPage.showLoadingDialog(true);
        ((IApiP2PCashService) Tc.a.f9070a.f41176b).uploadCancelOrderReason((String) reasonForCancellationPage.f32919f.getValue(), strA).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Ab.D(reasonForCancellationPage, 29));
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.ReasonItemView.Listener
    public void onSelect(String str) {
        int i7 = ReasonForCancellationPage.f32913j;
        A0 a0M = this.f9533a.m();
        Intrinsics.e(str);
        a0M.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        a0M.f9527b.setValue(a0M, A0.f9525e[1], str);
    }
}
