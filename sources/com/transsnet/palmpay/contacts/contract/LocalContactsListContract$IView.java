package com.transsnet.palmpay.contacts.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.rsp.MobileContactListResp;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface LocalContactsListContract$IView extends IBaseView {
    void complete();

    void showContactError(String msg);

    void showLikeQueryPhoneContactList(List<PalmPayContact> contacts);

    void showPhoneContactResp(MobileContactListResp resp);
}
