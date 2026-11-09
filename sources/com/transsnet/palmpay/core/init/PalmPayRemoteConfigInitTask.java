package com.transsnet.palmpay.core.init;

import C0.G;
import Eg.g;
import F6.d;
import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.util.PhoneUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p183m6.n;
import p183m6.r;
import p183m6.s;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_INIT_ADSDK, BaseInitTaskKt.TASK_HTTP_CLIENT_WARM}, name = BaseInitTaskKt.TASK_PALMPAY_REMOTE_CONFIG)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0002¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/core/init/PalmPayRemoteConfigInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "applyConfigSideEffects", "", "getMinimumFetchIntervalInSeconds", "", "getAppId", "", "getEnv", "", "getTaskName", "updateLogConfig", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmPayRemoteConfigInitTask extends BaseInitTask {
    /* JADX INFO: Access modifiers changed from: private */
    public final void applyConfigSideEffects() {
        try {
            n nVarInstance = n.f39523a.instance();
            p059e1.a.X("key_dark_mode_setting_enable", nVarInstance.b("enableDarkMode", true));
            p059e1.a.W("key_dynamic_base_url_v3", nVarInstance.d("dynamicBaseUrlV3", ""));
            p059e1.a.X("key_enable_cronet", nVarInstance.b("enableCronet", true));
            p059e1.a.W("statistics_sp_key_statistic_event_filter", nVarInstance.d("statisticEventFilter", ""));
            p059e1.a.X("key_switch_network_stack", nVarInstance.b("featureSwitchNetworkStack", false));
            p059e1.a.X("key_enable_hw_bitmap", nVarInstance.b("featureEnableHwBitmap", false));
            p059e1.a.X("nqe_sp_nqe_enable", nVarInstance.b("featureNqeEnable", true));
            p059e1.a.X("nqe_sp_nqe_tips_enable", nVarInstance.b("featureNqeTipsEnable", false));
            p059e1.a.W("nqe_sp_calculate_config", nVarInstance.d("featureNetworkCalculateConfig", ""));
            p059e1.a.W("nqe_sp_bad_threshold_config", nVarInstance.d("featureNetworkBadThreshold", ""));
            p059e1.a.X("key_http_dns", nVarInstance.b("featureHttpDnsEnable", true));
            p059e1.a.X("key_http_dns_cache", nVarInstance.b("featureHttpDnsEnableCache", true));
            p059e1.a.X("key_render_anr_patch", nVarInstance.b("configRenderAnrPatch", false));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAppId() {
        return "F7BC099E31AF41EEA5FC988A7102076A";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getEnv() {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getMinimumFetchIntervalInSeconds() {
        return 28800L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    public final void updateLogConfig() {
        boolean zB;
        boolean zB2;
        boolean zB3;
        boolean z3;
        g gVar = d.f2604d;
        try {
            zB = n.f39523a.instance().b("enablePPLog", false);
        } catch (Exception unused) {
            zB = false;
        }
        if (!zB) {
            try {
                zB2 = n.f39523a.instance().b("enablePPLog_" + PhoneUtils.getUniqueId(), false);
            } catch (Exception unused2) {
                zB2 = false;
            }
            if (!zB2) {
                User user = BaseApplication.get().getUser();
                String phoneNumber = user == null ? "" : user.getPhoneNumber();
                if (TextUtils.isEmpty(phoneNumber)) {
                    zB3 = false;
                } else {
                    try {
                        zB3 = n.f39523a.instance().b("enablePPLog_" + phoneNumber, false);
                    } catch (Exception unused3) {
                        zB3 = false;
                    }
                }
                z3 = zB3;
            }
        }
        gVar.f2441b = z3;
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.PalmPayRemoteConfigInitTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseApplication baseApplication;
                BaseInitTask.beginSection$default(PalmPayRemoteConfigInitTask.this, null, 1, null);
                r rVar = new r();
                rVar.f39533a = TimeUnit.HOURS.toSeconds(12L);
                rVar.f39534b = "";
                rVar.f39535c = 4;
                rVar.f39537e = "NG";
                String appId = PalmPayRemoteConfigInitTask.this.getAppId();
                Intrinsics.checkNotNullParameter(appId, "appId");
                rVar.f39534b = appId;
                rVar.f39535c = PalmPayRemoteConfigInitTask.this.getEnv();
                rVar.f39536d = BaseApplication.getChannel();
                rVar.f39539g = G.k();
                rVar.f39538f = L9.d.core_remote_config_defaults;
                long minimumFetchIntervalInSeconds = PalmPayRemoteConfigInitTask.this.getMinimumFetchIntervalInSeconds();
                if (minimumFetchIntervalInSeconds < 0) {
                    throw new IllegalArgumentException(("Minimum interval between fetches has to be a non-negative number. " + minimumFetchIntervalInSeconds + " is an invalid argument").toString());
                }
                rVar.f39533a = minimumFetchIntervalInSeconds;
                rVar.f39540h = true;
                n.f39523a.init(application, new s(rVar));
                PalmPayRemoteConfigInitTask.this.updateLogConfig();
                PalmPayRemoteConfigInitTask.this.applyConfigSideEffects();
                boolean z3 = false;
                try {
                    if (Build.VERSION.SDK_INT == 31 && (baseApplication = BaseApplication.get()) != null && baseApplication.isOldAndroidDevice()) {
                        z3 = true;
                    }
                } catch (Exception unused) {
                }
                LoadingDialog.sForceOverlay = Boolean.valueOf(z3);
                G.u(MessageEvent.EVENT_REMOTE_CONFIG_DONE, org.greenrobot.eventbus.c.b());
                BaseInitTask.endSection$default(PalmPayRemoteConfigInitTask.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_PALMPAY_REMOTE_CONFIG;
    }
}
