package com.transsnet.palmpay.task;

import Od.c;
import Od.d;
import Pa.r0;
import android.app.Application;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import com.transsnet.palmpay.main.export.bean.rsp.GetHomeCommonRsp;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_INIT_ADSDK, BaseInitTaskKt.TASK_HTTP_CLIENT_WARM}, name = BaseInitTaskKt.TASK_HOME_MENU_INIT)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/task/HomeMenuConfigTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "preloadHomeMenu", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaskName", "", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeMenuConfigTask extends BaseInitTask {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object preloadHomeMenu(Continuation<? super Unit> continuation) {
        d dVar;
        List<HomePageMenuData> list;
        HomePageMenuData homePageMenuData;
        List<HomePageMenuData> list2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i7 = dVar.f6812c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dVar.f6812c = i7 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, continuation);
            }
        } else {
            dVar = new d(this, continuation);
        }
        Object objQueryHomeInfo = dVar.f6810a;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = dVar.f6812c;
        try {
            if (i10 == 0) {
                g.M(objQueryHomeInfo);
                IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
                dVar.f6812c = 1;
                objQueryHomeInfo = iApiMainService.queryHomeInfo(8, false, dVar);
                if (objQueryHomeInfo == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(objQueryHomeInfo);
            }
            GetHomeCommonRsp getHomeCommonRsp = (GetHomeCommonRsp) objQueryHomeInfo;
            if (getHomeCommonRsp != null && getHomeCommonRsp.isSuccess()) {
                g.e(getHomeCommonRsp);
                GetHomeCommonRsp.DataBean data = getHomeCommonRsp.getData();
                if (((data == null || (list2 = data.funMenu) == null) ? 0 : list2.size()) > 10) {
                    for (int i11 = 0; i11 < 10; i11++) {
                        GetHomeCommonRsp.DataBean data2 = getHomeCommonRsp.getData();
                        String str = (data2 == null || (list = data2.funMenu) == null || (homePageMenuData = list.get(i11)) == null) ? null : homePageMenuData.iconUrlBig;
                        if (!TextUtils.isEmpty(str)) {
                            r0.D1(BaseApplication.get(), str);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            F6.d.c(BaseInitTask.TAG, "preloadHomeMenu", e10);
        }
        return Unit.f38893a;
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new c(this, getTaskName());
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_HOME_MENU_INIT;
    }
}
