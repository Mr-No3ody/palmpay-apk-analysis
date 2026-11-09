package com.transsnet.palmpay.credit.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface MobileContactListContract$IView extends IBaseView {
    void completed();

    void showError(String str);

    void showLikeQueryPhoneContact(List<PalmPayContact> list);

    void showPhoneContact(List<PalmPayContact> list);
}
