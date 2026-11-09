package com.transsnet.palmpay.credit.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.credit.bean.resp.QueryMemberByKeywordResp;
import com.transsnet.palmpay.credit.bean.resp.QueryMemberDetailResp;
import com.transsnet.palmpay.credit.bean.resp.RecipientListResp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface ContactListContract$IView extends IBaseView {
    void showDeleteRecipientResult(boolean z3, String str);

    void showLikeQueryRecipients(List<RecipientListResp.RecipientBean> list);

    void showQueryMemberByKeyword(QueryMemberByKeywordResp queryMemberByKeywordResp, String str);

    void showQueryMemberDetail(QueryMemberDetailResp queryMemberDetailResp, String str);

    void showQueryMemberDetailError(String str);

    void showRecipientListResp(RecipientListResp recipientListResp);

    void showRecipientListRespError(String str);
}
