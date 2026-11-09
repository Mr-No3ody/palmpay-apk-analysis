package com.palmpay.lib.bridgewrapper.photo.upload;

import C0.G;
import M1.j;
import Pa.i0;
import android.text.TextUtils;
import android.view.View;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionChangedListener;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.facebook.cache.common.CacheKey;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.flexibank.sdk.FlexiBankTongDunBlackBoxCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.apm.network.bean.NQEQualityBean;
import com.palmpay.lib.apm.network.impl.OnNetworkStateChangeListener;
import com.palmpay.lib.bridgewrapper.photo.upload.util.CompressUtils;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebMonitor;
import com.palmpay.lib.webview.offline.threadpool.IExecutorServiceProvider;
import com.rnmaps.maps.MapView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.palmpay.account.init.BaseAppsFlyerInitTask;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.init.ActivityTraceInitTask;
import com.transsnet.palmpay.core.init.FlexiBankSdkInitTask;
import com.transsnet.palmpay.core.init.WebViewInitTask;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.custom_view.interfac.OnCopyListener;
import com.transsnet.palmpay.custom_view.interfac.OnItemClickListener;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import com.transsnet.palmpay.managemoney.ui.fragment.FundTransactionHistoryFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.TargetSavingsTransactionHistoryFragment;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashResultActivity;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.GooglePlayInnerAppHelper;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import okhttp3.logging.HttpLoggingInterceptor$Logger;
import p025ba.e;
import p077f4.l;
import p169l7.c;
import top.zibin.luban.CompressionPredicate;
import top.zibin.luban.OnRenameListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements CompressionPredicate, OnRenameListener, MapView.EventCreator, ObservableOnSubscribe, Predicate, OnAttributionChangedListener, OnNetworkStateChangeListener, FlexiBankTongDunBlackBoxCallback, IExecutorServiceProvider, IEnhWebMonitor, OnItemChildClickListener, OnItemClickListener, OnFailureListener, OnCompleteListener, OnCopyListener, androidx.core.util.Predicate, com.facebook.common.internal.Predicate, HttpLoggingInterceptor$Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23806a;

    public /* synthetic */ a(int i7) {
        this.f23806a = i7;
    }

    @Override // com.flexibank.sdk.FlexiBankTongDunBlackBoxCallback
    public String addTongDunBlackCode(String str) {
        return FlexiBankSdkInitTask.buildFlexiBankConfig$lambda$2(str);
    }

    @Override // com.facebook.common.internal.Predicate
    /* JADX INFO: renamed from: apply */
    public boolean mo123apply(Object obj) {
        CacheKey it = (CacheKey) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    @Override // com.rnmaps.maps.MapView.EventCreator
    public Event create(int i7, int i10, WritableMap writableMap) {
        switch (this.f23806a) {
            case 6:
                return new c(i7, i10, writableMap, 8);
            case 7:
                return new c(i7, i10, writableMap, 7);
            case 8:
                return new c(i7, i10, writableMap, 9);
            case 9:
                return new c(i7, i10, writableMap, 11);
            default:
                return new c(i7, i10, writableMap, 26);
        }
    }

    @Override // com.palmpay.lib.webview.offline.threadpool.IExecutorServiceProvider
    public ExecutorService get() {
        return WebViewInitTask.initOfflineWebView$lambda$5();
    }

    @Override // okhttp3.logging.HttpLoggingInterceptor$Logger
    public void log(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        l.f36389b.logToFile(message);
    }

    @Override // com.adjust.sdk.OnAttributionChangedListener
    public void onAttributionChanged(AdjustAttribution adjustAttribution) {
        BaseAppsFlyerInitTask.Companion.initAdjustSdk$lambda$6(adjustAttribution);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f23806a) {
            case 23:
                GooglePlayInnerAppHelper.innerAppForceUpdate$lambda$4(task);
                break;
            default:
                GooglePlayInnerAppHelper.innerAppSmartUpdate$lambda$9(task);
                break;
        }
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnCopyListener
    public void onCopy(CharSequence charSequence) {
        ArrayList arrayList = Recharge2CashResultActivity.f33131i;
        ToastUtils.showShort(v.cv_copy_successful);
        ClipboardUtils.copyText(y.k(charSequence.toString(), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, ""));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.f23806a) {
            case 22:
                GooglePlayInnerAppHelper.innerAppForceUpdate$lambda$3(exc);
                break;
            default:
                GooglePlayInnerAppHelper.innerAppSmartUpdate$lambda$8(exc);
                break;
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(j adapter, View view, int i7) {
        int i10 = CoreCashierPreviewActivity.f27486Y0;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        Object item = adapter.getItem(i7);
        Intrinsics.f(item, "null cannot be cast to non-null type com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean");
        CashierPaymentMethodBean cashierPaymentMethodBean = (CashierPaymentMethodBean) item;
        if (view.getId() == e.tv_cashier_item_top_up && cashierPaymentMethodBean.senderAccountType == 1) {
            d.F("/cashin_out/add_money");
        }
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnItemClickListener
    public void onItemClick(Object obj) {
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) obj;
        switch (this.f23806a) {
            case 20:
                FundTransactionHistoryFragment.a aVar = FundTransactionHistoryFragment.f32458Z;
                i0.b0("/cashbox/common-transaction-detail?orderId=" + cashBoxTransaction.getOrgOrderNo() + "&transType=" + cashBoxTransaction.getTransType());
                break;
            default:
                TargetSavingsTransactionHistoryFragment.a aVar2 = TargetSavingsTransactionHistoryFragment.f32549X;
                if ("2".equals(cashBoxTransaction.getRedirect()) && !TextUtils.isEmpty(cashBoxTransaction.getOrgOrderNo())) {
                    i0.b0("/h5/transaction-router/home?transType=" + cashBoxTransaction.getTransactionType() + "&orderId=" + cashBoxTransaction.getOrgOrderNo());
                } else {
                    String strO = G.o(" /cashbox/target-detail-withdraw.html?id=", cashBoxTransaction.getOrgOrderNo());
                    if (cashBoxTransaction.getOperationType() == 1) {
                        strO = G.o("/cashbox/target-detail-deposit.html?id=", cashBoxTransaction.getOrgOrderNo());
                    }
                    i0.b0(strO);
                }
                break;
        }
    }

    @Override // com.palmpay.lib.apm.network.impl.OnNetworkStateChangeListener
    public void onNetworkStateChanged(Integer num, Integer num2, NQEQualityBean nQEQualityBean) {
        ActivityTraceInitTask.initActivityTrace$lambda$1(num, num2, nQEQualityBean);
    }

    @Override // top.zibin.luban.OnRenameListener
    public String rename(String str) {
        switch (this.f23806a) {
            case 1:
                return ImageCompressEngine.m111onStartCompress$lambda1(str);
            case 2:
            default:
                return CompressUtils.m118compressPhoto$lambda2(str);
            case 3:
                return PhotoUploadBridge.m113compressPhoto$lambda10(str);
        }
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IEnhWebMonitor
    public void report(String str, HashMap map, HashMap map2) {
        WebViewInitTask.initOfflineWebView$lambda$6(str, map, map2);
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) throws Exception {
        switch (this.f23806a) {
            case 11:
                MarqueeView.lambda$loadAdData$1(observableEmitter);
                break;
            default:
                MarqueeViewV2.fetchData$lambda$2(observableEmitter);
                break;
        }
    }

    @Override // io.reactivex.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f23806a) {
            case 12:
                return ((Boolean) obj).booleanValue();
            default:
                return Objects.isNull(obj);
        }
    }

    @Override // top.zibin.luban.CompressionPredicate
    public boolean apply(String str) {
        switch (this.f23806a) {
            case 0:
                return ImageCompressEngine.m110onStartCompress$lambda0(str);
            case 1:
            default:
                return CompressUtils.m117compressPhoto$lambda1(str);
            case 2:
                return PhotoUploadBridge.m114compressPhoto$lambda9(str);
        }
    }
}
