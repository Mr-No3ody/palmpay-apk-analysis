package com.transsnet.palmpay.core.init;

import Da.g;
import F6.d;
import Pa.i0;
import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.palmpay.lib.apm.LibApm;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.apm.network.bean.NQEQualityBean;
import com.palmpay.lib.apm.network.bean.NetworkBadThreshold;
import com.palmpay.lib.apm.network.bean.NetworkCalculateConfig;
import com.transsnet.analysis.utils.GsonUtil;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p183m6.n;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_FIREBASE_INIT}, name = BaseInitTaskKt.TASK_ACTIVITY_TRACE)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/init/ActivityTraceInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "initActivityTrace", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivityTraceInitTask extends BaseInitTask {
    /* JADX INFO: Access modifiers changed from: private */
    public final void initActivityTrace(Application application) {
        Application application2;
        NetworkBadThreshold networkBadThreshold;
        NetworkCalculateConfig networkCalculateConfig;
        boolean zB = false;
        try {
            zB = n.f39523a.instance().b("featureActivityTrace", false);
        } catch (Exception unused) {
        }
        if (zB) {
            try {
                application2 = application;
                LibApm.enableActivityTrace$default(LibApm.INSTANCE, application2, "ActivityTraceV3", false, 0, 12, null);
            } catch (Exception unused2) {
                return;
            }
        } else {
            application2 = application;
        }
        NQEManager nQEManager = NQEManager.INSTANCE;
        nQEManager.init(application2);
        nQEManager.getConfig().setEnable(p059e1.a.C("nqe_sp_nqe_enable", true));
        String strH = p059e1.a.H("nqe_sp_calculate_config");
        if (!TextUtils.isEmpty(strH) && (networkCalculateConfig = (NetworkCalculateConfig) GsonUtil.get().fromJson(strH, NetworkCalculateConfig.class)) != null) {
            nQEManager.getConfig().setNetworkQualityConfig(networkCalculateConfig);
        }
        String strH2 = p059e1.a.H("nqe_sp_bad_threshold_config");
        if (!TextUtils.isEmpty(strH2) && (networkBadThreshold = (NetworkBadThreshold) GsonUtil.get().fromJson(strH2, NetworkBadThreshold.class)) != null) {
            nQEManager.getConfig().setNetworkBadThreshold(networkBadThreshold);
        }
        nQEManager.addNetworkStateChangeListener(new com.palmpay.lib.bridgewrapper.photo.upload.a(15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActivityTrace$lambda$1(Integer num, Integer num2, NQEQualityBean nQEQualityBean) {
        try {
            d.h(NQEManager.TAG, 3, "networkState: " + num2);
            List<Activity> activityList = ActivityUtils.getActivityList();
            Intrinsics.checkNotNullExpressionValue(activityList, "getActivityList(...)");
            if (activityList.isEmpty()) {
                return;
            }
            Activity topActivity = ActivityUtils.getTopActivity();
            if (i0.W(topActivity) && (topActivity instanceof BaseActivity)) {
                ((BaseActivity) topActivity).runOnUiThread(new g((BaseActivity) topActivity, num, num2, nQEQualityBean, 17));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActivityTrace$lambda$1$lambda$0(Activity activity, Integer num, Integer num2, NQEQualityBean nQEQualityBean) {
        ((BaseActivity) activity).onNetworkStateChanged(num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : 3, nQEQualityBean);
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.ActivityTraceInitTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(ActivityTraceInitTask.this, null, 1, null);
                ActivityTraceInitTask.this.initActivityTrace(application);
                BaseInitTask.endSection$default(ActivityTraceInitTask.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_ACTIVITY_TRACE;
    }
}
