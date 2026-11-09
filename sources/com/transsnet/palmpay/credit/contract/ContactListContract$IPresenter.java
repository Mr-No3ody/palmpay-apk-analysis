package com.transsnet.palmpay.credit.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.credit.bean.resp.RecipientListResp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface ContactListContract$IPresenter<T> extends IBasePresenter<T> {
    void deleteRecipient(String str);

    void queryMemberDetailByKeyword(String str);

    void queryMemberDetailByPhone(String str);

    void queryRecipientLike(String str, List<RecipientListResp.RecipientBean> list);

    void queryRecipientList(int i7, int i10);
}
