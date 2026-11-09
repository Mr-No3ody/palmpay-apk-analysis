package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.rsp.NotificationSettings;
import com.transsnet.palmpay.account.bean.rsp.SettingSwitchRsp;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.main.export.bean.req.ThresholdListRsp;
import com.transsnet.palmpay.main.export.bean.req.ThresholdReq;
import com.transsnet.palmpay.main.export.bean.req.ThresholdRsp;

/* JADX INFO: loaded from: classes4.dex */
public interface SettingsContract {

    public interface Presenter extends IBasePresenter<View> {
        void createOneStepPayThreshold(ThresholdReq thresholdReq);

        void logout();

        void modifyOneStepPayThreshold(ThresholdReq thresholdReq);

        void queryNotificationSetting();

        void queryOneStepPayThreshold();

        void queryPaymentThresholds();

        void querySettingSwitch();

        void updateNotificationSetting(NotificationSettings notificationSettings);
    }

    public interface View extends IBaseView {
        default void handleCreateOneStepPayThreshold(CommonResult commonResult) {
        }

        default void handleLogoutRsp(CommonResult commonResult) {
        }

        default void handleModifyOneStepPayThreshold(CommonResult commonResult) {
        }

        default void handleNotificationSettings(CommonBeanResult<NotificationSettings> commonBeanResult) {
        }

        default void handleOneStepPayThreshold(CommonBeanResult<ThresholdRsp> commonBeanResult) {
        }

        default void handlePaymentThresholds(ThresholdListRsp thresholdListRsp) {
        }

        default void handleSettingSwitchRsp(CommonBeanResult<SettingSwitchRsp> commonBeanResult) {
        }

        default void handleUpdateNotificationSettingsResult(CommonResult commonResult) {
        }
    }
}
