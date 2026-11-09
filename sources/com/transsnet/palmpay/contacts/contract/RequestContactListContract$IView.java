package com.transsnet.palmpay.contacts.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface RequestContactListContract$IView extends IBaseView {
    void showDeleteResult(RequestContact contact);

    void showRequestContactsList(List<RequestContact> list);

    void showUpdateResult(RequestContact contact);
}
