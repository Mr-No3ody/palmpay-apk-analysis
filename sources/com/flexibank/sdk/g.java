package com.flexibank.sdk;

import android.app.Activity;
import android.app.job.JobParameters;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Process;
import android.view.Surface;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.flexibank.sdk.callback.FlexiBankAuthorizationCallback;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.api.Service;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.config.DeviceCacheManager;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.growingio.android.sdk.track.webservices.widget.TipView;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.SyncBridge;
import com.reactnativecommunity.webview.RNCWebView;
import com.transsnet.adsdk.remote.RemoteDrawImpl;
import com.transsnet.adsdk.widgets.banner.bannerview.BannerViewPager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.CommonShareNewRsp;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.rnbridge.bridge.ShowRichTextDialogBridge;
import com.transsnet.palmpay.credit.bean.resp.BlockItem;
import com.transsnet.palmpay.credit.ui.dialog.CLRouteInterceptDialog;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.util.ClipboardUtils;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22305c;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.f22303a = i7;
        this.f22304b = obj;
        this.f22305c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22303a) {
            case 0:
                String strB = ((W3.c) this.f22305c).b();
                if (strB == null) {
                    strB = "";
                }
                ((FlexiBankAuthorizationCallback) this.f22304b).onError("BusFail", strB);
                return;
            case 1:
                String message = ((Throwable) this.f22305c).getMessage();
                if (message == null) {
                    message = "Authorization failed";
                }
                ((FlexiBankAuthorizationCallback) this.f22304b).onError("NetworkFail", message);
                return;
            case 2:
                ((JobInfoSchedulerService) this.f22304b).lambda$onStartJob$0((JobParameters) this.f22305c);
                return;
            case 3:
                ((RemovalListener) this.f22304b).onRemoval((RemovalNotification) this.f22305c);
                return;
            case 4:
                ((UserMetadata) this.f22304b).lambda$updateRolloutsState$1((List) this.f22305c);
                return;
            case 5:
                ((DeviceCacheManager) this.f22304b).lambda$setContext$0((Context) this.f22305c);
                return;
            case 6:
                ((AppStartTrace) this.f22304b).lambda$logExperimentTrace$0((TraceMetric.Builder) this.f22305c);
                return;
            case 7:
                io.fastkv.n.Q((ProducerScope) this.f22304b, (ConfigUpdate) this.f22305c);
                return;
            case 8:
                p039cb.c cVar = (p039cb.c) this.f22304b;
                cVar.c();
                ((TipView) cVar.f18901b).setContent(com.growingio.android.circler.d.growing_circler_progress);
                ((TipView) cVar.f18901b).setOnClickListener(new p010a9.b(8, cVar, (Ab.r) this.f22305c));
                return;
            case 9:
                p039cb.c cVar2 = (p039cb.c) this.f22304b;
                cVar2.c();
                ((TipView) cVar2.f18901b).c((Activity) this.f22305c);
                return;
            case 10:
                androidx.work.impl.model.b bVar = (androidx.work.impl.model.b) this.f22304b;
                bVar.g();
                ((TipView) bVar.f18580b).c((Activity) this.f22305c);
                return;
            case 11:
                androidx.work.impl.model.b bVar2 = (androidx.work.impl.model.b) this.f22304b;
                bVar2.g();
                ((TipView) bVar2.f18580b).setContent(com.growingio.android.debugger.h.growing_debugger_progress);
                ((TipView) bVar2.f18580b).setOnClickListener(new p010a9.b(9, bVar2, (com.google.firebase.crashlytics.internal.concurrency.b) this.f22305c));
                return;
            case 12:
                BaseBridge.m106start$lambda1((Activity) this.f22304b, (BaseBridge) this.f22305c);
                return;
            case 13:
                SyncBridge.m107execute$lambda0((SyncBridge) this.f22304b, this.f22305c);
                return;
            case 14:
                ((BannerViewPager) this.f22304b).lambda$refreshData$1((List) this.f22305c);
                return;
            case 15:
                BaseApplication.lambda$scheduleInitTask$3((Runnable) this.f22304b, (CountDownLatch) this.f22305c);
                return;
            case 16:
                ShowRichTextDialogBridge.onHandle$lambda$1$lambda$0((Activity) this.f22304b, (ShowRichTextDialogBridge.DialogParam) this.f22305c);
                return;
            case 17:
                ClipboardUtils.clearClipboardIfMatch((ClipboardManager) this.f22304b, (CharSequence) this.f22305c);
                return;
            case 18:
                ((SelectInstance) this.f22304b).trySelect((p056dg.b) this.f22305c, Unit.f38893a);
                return;
            case 19:
                p061e3.t this$0 = (p061e3.t) this.f22304b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Runnable runnable = (Runnable) this.f22305c;
                Intrinsics.checkNotNullParameter(runnable, "$runnable");
                try {
                    this$0.getClass();
                    Process.setThreadPriority(10);
                    break;
                } catch (Throwable unused) {
                }
                runnable.run();
                return;
            case 20:
                StringBuilder sb2 = new StringBuilder();
                io.fastkv.m mVar = (io.fastkv.m) this.f22304b;
                sb2.append(mVar.f37647a);
                sb2.append(mVar.f37648b);
                io.fastkv.n.f(new File(sb2.toString(), (String) this.f22305c));
                return;
            case 21:
                Runnable runnable2 = (Runnable) this.f22305c;
                io.fastkv.o oVar = (io.fastkv.o) this.f22304b;
                oVar.getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                    oVar.a();
                }
            case 22:
                p143jb.o oVar2 = (p143jb.o) this.f22304b;
                LoadingDialog loadingDialog = oVar2.f38562u;
                if (loadingDialog == null || !loadingDialog.isShowing()) {
                    Activity context = (Activity) this.f22305c;
                    Intrinsics.checkNotNullParameter(context, "context");
                    com.transsnet.palmpay.custom_view.dialog.n nVar = new com.transsnet.palmpay.custom_view.dialog.n(context);
                    nVar.f31290d = Integer.valueOf(p116hb.e.cs_cash_loading);
                    LoadingDialog loadingDialogA = nVar.a();
                    loadingDialogA.show();
                    oVar2.f38562u = loadingDialogA;
                    return;
                }
                return;
            case 23:
                new CLRouteInterceptDialog((Activity) this.f22304b, (BlockItem) this.f22305c).show();
                return;
            case 24:
                ShareDialog shareDialog = ((p185ma.r) this.f22304b).f39621i;
                if (shareDialog.isActivityValid(shareDialog.getContext())) {
                    shareDialog.bindShareChannelArea((CommonShareNewRsp) ((CommonBeanResult) this.f22305c).data);
                    return;
                }
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((RemoteDrawImpl) this.f22304b).draw((Surface) this.f22305c);
                return;
            case 26:
                if (((AtomicBoolean) this.f22304b).compareAndSet(false, true)) {
                    int i7 = p232p6.p.f41240g;
                    if (i7 == 0 || 3 == i7) {
                        p232p6.p.f41240g = 3;
                        ((D6.a) this.f22305c).invoke(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                RNCWebView rNCWebView = ((p265r7.e) this.f22304b).f41609a;
                rNCWebView.c((String) this.f22305c, rNCWebView.getUrl());
                return;
            case 28:
                MessageQueueThreadImpl.callOnQueue$lambda$0((SimpleSettableFuture) this.f22304b, (Callable) this.f22305c);
                return;
            default:
                com.facebook.imagepipeline.nativecode.b.D(((p297te.h) this.f22304b).f42614a, (String) this.f22305c);
                return;
        }
    }
}
