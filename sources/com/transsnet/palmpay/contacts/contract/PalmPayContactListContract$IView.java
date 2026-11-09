package com.transsnet.palmpay.contacts.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactListResp;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface PalmPayContactListContract$IView extends IBaseView {
    void showError(String msg);

    void showLikeQueryPalmPayContact(List<PalmPayContact> contacts);

    void showPalmPayContact(PalmPayContactListResp resp);
}
