package com.transsnet.palmpay.contacts.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface LocalContactsListContract$IPresenter<T> extends IBasePresenter<T> {
    void queryContactLike(String searchText, List<PalmPayContact> contacts);

    void queryPhoneContact();
}
