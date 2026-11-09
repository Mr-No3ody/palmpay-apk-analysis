package com.transsnet.palmpay.core.init.late;

import Pa.r0;
import android.app.Application;
import android.content.Context;
import androidx.camera.video.internal.c;
import com.alibaba.android.alpha.Task;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.LocationRequest;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import com.transsnet.palmpay.util.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p115ha.a;
import p268ra.b;
import p268ra.d;
import p268ra.e;
import p283sa.f;
import ta.h;
import ta.p;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.LATE_INIT_APPSFLYER_TASK}, group = BaseInitTaskKt.GROUP_LATE_INIT, name = BaseInitTaskKt.LATE_INIT_PRELOAD_IMG_TASK)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/core/init/late/LateInitTask1;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "preloadGlideImage", "", "context", "Landroid/content/Context;", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLateInitTask1.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LateInitTask1.kt\ncom/transsnet/palmpay/core/init/late/LateInitTask1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1869#2,2:82\n1869#2,2:84\n*S KotlinDebug\n*F\n+ 1 LateInitTask1.kt\ncom/transsnet/palmpay/core/init/late/LateInitTask1\n*L\n39#1:82,2\n42#1:84,2\n*E\n"})
public final class LateInitTask1 extends BaseInitTask {

    @NotNull
    private static final String BASE_IMAGE_URL = "https://d1me2081qmgmx2.cloudfront.net";

    @NotNull
    private static final ArrayList<String> PRELOAD_URL = C1850q.e("/palmpay_app_icon/jp_pick_three_case.webp");

    @NotNull
    private static final ArrayList<String> PRELOAD_URL_2 = C1850q.e("/main_zone_top_bg.png", "/main_turn_on_save.webp", "/main_welcome_back_notice.webp", "/cs_oc_repay_exit_dialog_img.png", "/cs_cl_ins_open_top_bg_img.png", "/cs_main_tab_top_bg.png", "/cs_upgrade_install_account_bg.webp", "/oc_offline_installment_img.webp", "/cs_refer_earn_header.png", "/cs_oc_gold_card_upgrade.webp", "/cs_cl_repayment_date_img.webp", "/mm_icon_old_cashbox_users_text.png", "/mm_bg_old_campaign_dice.webp", "/mm_icon_campaign_top.png", "/mm_bg_campaign_dice.png", "/jp_cs_homepage_top_3.png", "/cash_box_welcome.webp");

    /* JADX INFO: Access modifiers changed from: private */
    public final void preloadGlideImage(Context context) {
        Iterator<T> it = PRELOAD_URL_2.iterator();
        while (it.hasNext()) {
            r0.D1(context, r0.y0((String) it.next()));
        }
        Iterator<T> it2 = PRELOAD_URL.iterator();
        while (it2.hasNext()) {
            r0.D1(context, BASE_IMAGE_URL + ((String) it2.next()));
        }
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.late.LateInitTask1.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(LateInitTask1.this, null, 1, null);
                BaseApplication baseApplication = BaseApplication.get();
                Context application2 = BaseApplication.getContext();
                a aVar = new a();
                aVar.f37359b = 0;
                aVar.f37358a = application2;
                aVar.f37360c = false;
                e eVar = new e();
                c cVar = new c(20);
                cVar.f14621b = new String[]{"android.permission.ACCESS_COARSE_LOCATION"};
                eVar.f41667a = cVar.d();
                d dVar = new d();
                LocationRequest fastestInterval = LocationRequest.create().setPriority(102).setInterval(300000L).setFastestInterval(60000L);
                Intrinsics.checkNotNullExpressionValue(fastestInterval, "setFastestInterval(...)");
                dVar.f41665a = fastestInterval;
                dVar.f41666b = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
                d dVar2 = new d();
                dVar2.f41665a = dVar.f41665a;
                dVar2.f41666b = dVar.f41666b;
                eVar.f41668b = dVar2;
                p268ra.a aVar2 = new p268ra.a();
                aVar2.f41655c = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
                aVar2.f41656d = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
                aVar2.f41658f = "";
                aVar2.f41653a = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
                aVar2.f41654b = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
                Intrinsics.checkNotNullParameter("Turn on GPS?", "gpsMessage");
                aVar2.f41658f = "Turn on GPS?";
                aVar2.f41655c = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
                aVar2.f41656d = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
                if (aVar2.f41657e == null && !StringUtils.isEmpty("Turn on GPS?")) {
                    aVar2.f41657e = new p(aVar2.f41658f);
                }
                eVar.f41669c = new b(aVar2);
                e locationConfiguration = eVar.a();
                Context context = BaseApplication.getContext().getApplicationContext();
                Intrinsics.checkNotNullParameter(context, "context");
                O2.a aVar3 = new O2.a();
                p283sa.a aVar4 = new p283sa.a();
                Application application3 = context instanceof Application ? (Application) context : null;
                if (application3 == null) {
                    throw new IllegalArgumentException("ContextProcessor can only be initialized with Application!");
                }
                aVar4.f42095a = application3;
                aVar4.f42096b = new WeakReference(null);
                aVar4.f42097c = new WeakReference(null);
                aVar3.f6553a = aVar4;
                Intrinsics.checkNotNullParameter(locationConfiguration, "locationConfiguration");
                aVar3.f6555c = locationConfiguration;
                Intrinsics.checkNotNullParameter(application2, "application");
                Intrinsics.checkNotNullParameter(application2, "<set-?>");
                aVar4.f42095a = application2;
                aVar3.f6554b = aVar;
                if (((e) aVar3.f6555c) == null) {
                    throw new IllegalStateException("You must set a configuration object.");
                }
                if (((h) aVar3.f6556d) == null) {
                    aVar3.f6556d = new h();
                }
                a listener = (a) aVar3.f6554b;
                if (listener != null) {
                    h hVar = (h) aVar3.f6556d;
                    Intrinsics.e(hVar);
                    e eVar2 = (e) aVar3.f6555c;
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    hVar.f42388c = aVar4;
                    hVar.f42387b = eVar2;
                    hVar.f42389d = new WeakReference(listener);
                }
                aVar.f37361d = new f(aVar3);
                org.greenrobot.eventbus.c.b().j(aVar);
                baseApplication.registerActivityLifecycleCallbacks(aVar);
                LateInitTask1.this.preloadGlideImage(application);
                BaseInitTask.endSection$default(LateInitTask1.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.LATE_INIT_PRELOAD_IMG_TASK;
    }
}
