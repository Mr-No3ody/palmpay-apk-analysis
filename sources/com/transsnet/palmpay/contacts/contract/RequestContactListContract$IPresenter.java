package com.transsnet.palmpay.contacts.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.db.entity.RequestContact;

/* JADX INFO: loaded from: classes3.dex */
public interface RequestContactListContract$IPresenter extends IBasePresenter<RequestContactListContract$IView> {
    void deleteContact(RequestContact contact);

    void queryRequestContactsList(String memberId);

    void updateContact(RequestContact contact);
}
