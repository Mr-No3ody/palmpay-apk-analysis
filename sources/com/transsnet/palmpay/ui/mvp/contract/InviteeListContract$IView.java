package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.main.export.bean.rsp.InviteeListResp;

/* JADX INFO: loaded from: classes4.dex */
public interface InviteeListContract$IView extends IBaseView {
    void showError(String str);

    void showInviteeListResp(InviteeListResp inviteeListResp);
}
