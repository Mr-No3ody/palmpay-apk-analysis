package com.transsnet.palmpay.contacts.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface MobileContactListContract$IView extends IBaseView {
    void completed();

    void showError(String msg);

    void showLikeQueryPhoneContact(List<PalmPayContact> contacts);

    void showPhoneContact(List<PalmPayContact> contacts);
}
