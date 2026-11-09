package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.main.export.bean.req.InviteeListReq;

/* JADX INFO: loaded from: classes4.dex */
public interface InviteeListContract$IPresenter extends IBasePresenter<InviteeListContract$IView> {
    void queryInviteeList(InviteeListReq inviteeListReq);
}
