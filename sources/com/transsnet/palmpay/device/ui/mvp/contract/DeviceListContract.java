package com.transsnet.palmpay.device.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.rsp.DeviceActionRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryDeviceRsp;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface DeviceListContract {

    public interface Presenter extends IBasePresenter<View> {
        void activateDevice(QueryDeviceRsp queryDeviceRsp);

        void deActivateDevice(QueryDeviceRsp queryDeviceRsp);

        void deleteDevice(QueryDeviceRsp queryDeviceRsp);

        void loadDeviceList();
    }

    public interface View extends IBaseView {
        void showCommandResultView(CommonResult commonResult);

        void showDeviceActionResultView(DeviceActionRsp deviceActionRsp);

        void showDeviceList(List<QueryDeviceRsp> list);

        void showLoadingView(boolean z3);
    }
}
