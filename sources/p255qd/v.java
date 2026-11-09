package p255qd;

import Pa.C0525w;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.QueryMemberDetailReq;
import com.transsnet.palmpay.send_money.bean.QueryRecipientReq;
import com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IPresenter;
import java.util.Collections;
import p188md.b;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends j implements TransferToMobileContract$IPresenter {
    @Override // com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IPresenter
    public final void queryMemberDetailByKeyword(String str, int i7) {
        QueryMemberDetailReq queryMemberDetailReq = new QueryMemberDetailReq(str, i7);
        queryMemberDetailReq.setSources(Collections.singletonList("03"));
        ((SendMoneyApiService) b.f39648a.f6830b).queryMemberDetailByKeyWords(queryMemberDetailReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new t(this, str, 1));
    }

    @Override // com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IPresenter
    public final void queryMemberDetailByPhone(String str) {
        QueryMemberDetailReq queryMemberDetailReq = new QueryMemberDetailReq();
        queryMemberDetailReq.setPhone(str);
        ((SendMoneyApiService) b.f39648a.f6830b).queryMemberDetailByPhone(queryMemberDetailReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new t(this, str, 0));
    }

    @Override // com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IPresenter
    public final void queryRecipients(int i7, int i10) {
        QueryRecipientReq queryRecipientReq = new QueryRecipientReq();
        queryRecipientReq.setRecipientType(i7);
        queryRecipientReq.setNum(i10);
        queryRecipientReq.setPageNum(1);
        queryRecipientReq.setPageSize(i10);
        ((SendMoneyApiService) b.f39648a.f6830b).queryRecipientsV2(((Gson) C0525w.f().f7166b).toJson(queryRecipientReq)).k(f.f42629b).i(p071ef.b.a()).subscribe(new u(this));
    }
}
