package Fe;

import com.transsnet.palmpay.main.export.bean.req.InviteeListReq;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import com.transsnet.palmpay.ui.mvp.contract.InviteeListContract$IPresenter;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends com.transsnet.palmpay.core.base.j implements InviteeListContract$IPresenter {
    @Override // com.transsnet.palmpay.ui.mvp.contract.InviteeListContract$IPresenter
    public final void queryInviteeList(InviteeListReq inviteeListReq) {
        ((IApiMainService) Cc.a.f1353a.f39520b).queryInviteeList(inviteeListReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Ab.D(this, 6));
    }
}
