package com.transsnet.palmpay.task;

import F6.d;
import Od.k;
import Od.l;
import Pa.r0;
import android.app.Application;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import com.transsnet.palmpay.main.export.bean.rsp.WelcomeNewUserConfigRsp;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_INIT_ADSDK, BaseInitTaskKt.TASK_FIREBASE_INIT}, name = BaseInitTaskKt.TASK_WELCOME_NEW_USER_INIT)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/task/WelcomeNewUserConfigTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "queryConfig", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaskName", "", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WelcomeNewUserConfigTask extends BaseInitTask {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object queryConfig(Continuation<? super Unit> continuation) {
        l lVar;
        WelcomeNewUserConfigRsp welcomeNewUserConfigRsp;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i7 = lVar.f6826c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                lVar.f6826c = i7 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, continuation);
            }
        } else {
            lVar = new l(this, continuation);
        }
        Object objQueryWelcomeNewUserConfig = lVar.f6824a;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = lVar.f6826c;
        try {
            if (i10 == 0) {
                g.M(objQueryWelcomeNewUserConfig);
                String strC = p367ya.a.d().c();
                IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
                lVar.f6826c = 1;
                objQueryWelcomeNewUserConfig = iApiMainService.queryWelcomeNewUserConfig(strC, lVar);
                if (objQueryWelcomeNewUserConfig == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(objQueryWelcomeNewUserConfig);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) objQueryWelcomeNewUserConfig;
            if (commonBeanResult != null && (welcomeNewUserConfigRsp = (WelcomeNewUserConfigRsp) commonBeanResult.data) != null) {
                if (TextUtils.isEmpty(welcomeNewUserConfigRsp.photoUrl)) {
                    p059e1.a.U(0, "main_sp_welcome_new_user_show_count");
                } else if (!welcomeNewUserConfigRsp.photoUrl.equals(p059e1.a.H("main_sp_welcome_new_user_config"))) {
                    r0.D1(BaseApplication.getContext(), welcomeNewUserConfigRsp.photoUrl);
                    String str = welcomeNewUserConfigRsp.photoUrl;
                    Intrinsics.e(str);
                    p059e1.a.W("main_sp_welcome_new_user_config", str);
                    p059e1.a.U(welcomeNewUserConfigRsp.showCount, "main_sp_welcome_new_user_show_count");
                }
                String str2 = welcomeNewUserConfigRsp.androidJumpUrl;
                if (str2 == null) {
                    str2 = "";
                }
                p059e1.a.W("main_sp_welcome_new_user_link", str2);
            }
        } catch (Throwable th) {
            d.h(BaseInitTask.TAG, 3, "run: ", th);
        }
        return Unit.f38893a;
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new k(this, getTaskName());
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_WELCOME_NEW_USER_INIT;
    }
}
