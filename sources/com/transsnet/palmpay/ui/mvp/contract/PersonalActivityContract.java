package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.MemberInfo;
import com.transsnet.palmpay.core.db.entity.User;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/ui/mvp/contract/PersonalActivityContract;", "", "View", "Presenter", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PersonalActivityContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/mvp/contract/PersonalActivityContract$Presenter;", "Lcom/transsnet/palmpay/core/base/IBasePresenter;", "Lcom/transsnet/palmpay/ui/mvp/contract/PersonalActivityContract$View;", "loadPersonalInfo", "", "checkUpdateNameLimit", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends IBasePresenter<View> {
        void checkUpdateNameLimit();

        void loadPersonalInfo();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/ui/mvp/contract/PersonalActivityContract$View;", "Lcom/transsnet/palmpay/core/base/IBaseView;", "handlePersonalInfo", "", "user", "Lcom/transsnet/palmpay/core/db/entity/User;", "handleMemberInfo", "rsp", "Lcom/transsnet/palmpay/core/bean/MemberInfo;", "handleCheckUpdateNameLimit", "result", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends IBaseView {
        void handleCheckUpdateNameLimit(@NotNull CommonResult result);

        void handleMemberInfo(@NotNull MemberInfo rsp);

        void handlePersonalInfo(@NotNull User user);
    }
}
