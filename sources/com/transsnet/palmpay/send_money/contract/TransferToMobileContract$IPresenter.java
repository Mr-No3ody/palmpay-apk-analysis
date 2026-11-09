package com.transsnet.palmpay.send_money.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;

/* JADX INFO: loaded from: classes4.dex */
public interface TransferToMobileContract$IPresenter<T> extends IBasePresenter<T> {
    void queryMemberDetailByKeyword(String str, int i7);

    void queryMemberDetailByPhone(String str);

    void queryRecipients(int i7, int i10);
}
