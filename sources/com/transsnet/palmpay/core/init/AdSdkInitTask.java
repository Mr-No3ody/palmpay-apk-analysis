package com.transsnet.palmpay.core.init;

import Pa.r0;
import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.palmpay.lib.apm.network.NQEHttpEventListener;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.BuildConfig;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import com.transsnet.palmpay.util.DeviceUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_INIT_1, BaseInitTaskKt.TASK_FIREBASE_INIT}, name = BaseInitTaskKt.TASK_INIT_ADSDK)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/init/AdSdkInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "initAdSdk", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdSdkInitTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSdkInitTask.kt\ncom/transsnet/palmpay/core/init/AdSdkInitTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public final class AdSdkInitTask extends BaseInitTask {
    /* JADX INFO: Access modifiers changed from: private */
    public final void initAdSdk(Application application) {
        try {
            AdManager.AdConfiguration adConfiguration = new AdManager.AdConfiguration();
            adConfiguration.setUserId(p367ya.a.d().i());
            adConfiguration.setUrl(BuildConfig.adReleaseUrl);
            adConfiguration.setAppChannel(BaseApplication.getChannel());
            adConfiguration.setGaId(p367ya.a.d().c());
            adConfiguration.setMerchantInfo("MC9790366341", "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBALpUsOOkuWpIfe42DrMnLKDNJWEtad4LY+fBQYGXIgWjVRRi8nHNOSyT8DDu/9pQyVsB8n+sQAvWwDqZMXiRSKU1JuJeaCKIDKDYTjppPlzyXBujGl7yncouLfMEIPkL3fEj/nUzU1FV1oLX8YKSsF+6VlE/dwC2qH0IRDEQ5q1pAgMBAAECgYBVHAAcSw6CNJCI8VovjNI+tNXBGIxF5zAAGO8B8XWR27Qt9rBFOPdHnF9XCqQFJWeD0VTh6lzqy3HMklLdfocOX129xGjj4QUJXPSyxqVFyjgV9BgPs5q4CB69A2hMfAn7xhwf1Droag0EcvEkI8HvIgh3dc04it34q0ofvNpEgQJBAOg9xNRuhU3U00HXsxElBo4O/Geg/87CZZfz1XNbUW/HVSTIyK3sm8+aEEmL+xJcuwwtmnBk1evYtnN+jRjXtRkCQQDNZI91ABF/0oL0qUcZf7mmKQO6XdPtWjYrL3EOXLCpyv7SSaA80uSnbkZgro2OjnAyo61W9Ei0tY9GJeIHsPTRAj9MM/hhu+IBp9Opxxz6gyujcUdguXM2ZJLxSRDAyTXvd3h4mWk/qGN3uxWdDFFVtReq50vFlVCcEn/LZbrma+ECQQCsfS009u+7RxEPYzIAqhFBB+THmJCoHkCrl9X8V79NeNrzwz08l2fLbILSIwVimSCEhozGH7UHfgpqwNnH18ZhAkAcPUZSEGSZHa681QPFJhtwK1daONDcLfaW6KpAsuYtWRN+t8vxa8OxZ/sIrlA7sqdz1tl5lRXv2MQ3l1IZTCej");
            adConfiguration.setAppId("8A322717B04B361C495DB44970CF6667");
            adConfiguration.setCountryCode(BaseApplication.getCountryLocale());
            boolean zZ0 = false;
            adConfiguration.setDebug(false);
            adConfiguration.setEventListener(new NQEHttpEventListener());
            if (!r0.V0()) {
                zZ0 = r0.Z0();
            } else if (r0.J0(application.getResources()) == 32) {
                zZ0 = true;
            }
            adConfiguration.setUseDarkMode(zZ0);
            HashMap map = new HashMap();
            map.put(CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO, DeviceUtils.getAndroidID());
            String strH = p059e1.a.H("firebase_sp_appsflyer_campaign");
            if (strH != null) {
                if (TextUtils.isEmpty(strH)) {
                    strH = null;
                }
                if (strH != null) {
                    map.put("campaign", strH);
                }
            }
            adConfiguration.setExtras(map);
            adConfiguration.setOkHttpClient(BaseApplication.get().getHttpClient());
            AdManager.get().init(application, adConfiguration);
        } catch (Exception e10) {
            Log.e(BaseInitTask.TAG, "initAdSdk: ", e10);
        }
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.AdSdkInitTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(AdSdkInitTask.this, null, 1, null);
                AdSdkInitTask.this.initAdSdk(application);
                BaseInitTask.endSection$default(AdSdkInitTask.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_INIT_ADSDK;
    }
}
