package p235pb;

import N8.d0;
import android.content.Context;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.req.CommonShareReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends j implements OcReferEarnHomeContract.Presenter {
    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.Presenter
    public final void inviteList() {
        c.f40268a.getInstance().getClass();
        c.a().queryOcInviteList().k(f.f42629b).i(b.a()).subscribe(new i(this));
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.Presenter
    public final void inviteSms(Context context, ArrayList phones) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(phones, "phones");
        ((PayApiService) p324va.c.f43141a.f14621b).commonShare(new CommonShareReq(19)).i(b.a()).k(f.f42629b).subscribe(new d0(context, 3, phones, this));
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.Presenter
    public final void okCardBaseAmount() {
        ((OcReferEarnHomeContract.View) this.f27351a).showLoadingView(true);
        c.f40268a.getInstance().getClass();
        c.a().okCardBaseAmount().k(f.f42629b).i(b.a()).subscribe(new j(this));
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.Presenter
    public final void queryHasUnfreeze() {
        c.f40268a.getInstance().getClass();
        c.a().hasUnfreeze().k(f.f42629b).i(b.a()).subscribe(new k(this));
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.Presenter
    public final void queryMarquee() {
        c.f40268a.getInstance().getClass();
        c.a().queryOcMarquee().k(f.f42629b).i(b.a()).subscribe(new l(this));
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.Presenter
    public final void queryReferEarnHome() {
        ((OcReferEarnHomeContract.View) this.f27351a).showLoadingView(true);
        c.f40268a.getInstance().getClass();
        c.a().queryReferEarnHome().k(f.f42629b).i(b.a()).subscribe(new m(this));
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.Presenter
    public final void querySumReward() {
        ((OcReferEarnHomeContract.View) this.f27351a).showLoadingView(true);
        c.f40268a.getInstance().getClass();
        c.a().querySumReward().k(f.f42629b).i(b.a()).subscribe(new n(this));
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.Presenter
    public final void withdraw() {
        ((OcReferEarnHomeContract.View) this.f27351a).showLoadingView(true);
        c.f40268a.getInstance().getClass();
        c.a().ocReferEarnWithdraw().k(f.f42629b).i(b.a()).subscribe(new o(this));
    }
}
