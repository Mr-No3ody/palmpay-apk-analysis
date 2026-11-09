package p132ie;

import V9.C0714c;
import android.view.View;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.ui.activity.bankcard.SetRepaymentDefaultCardActivity;
import p071ef.b;
import p298tf.f;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f37583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetRepaymentDefaultCardActivity f37584b;

    public e(SetRepaymentDefaultCardActivity setRepaymentDefaultCardActivity, Object obj) {
        this.f37584b = setRepaymentDefaultCardActivity;
        this.f37583a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String accountId = ((LinkBankCardResp.LinkBankCard) this.f37583a).getAccountId();
        SetRepaymentDefaultCardActivity setRepaymentDefaultCardActivity = this.f37584b;
        setRepaymentDefaultCardActivity.showLoadingDialog(true);
        ((PayApiService) c.f43141a.f14621b).setDefaultRepaymentCard(accountId).k(f.f42629b).i(b.a()).subscribe(new C0714c(setRepaymentDefaultCardActivity, 11));
    }
}
