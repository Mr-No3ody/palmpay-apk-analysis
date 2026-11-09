package com.google.firebase.crashlytics.internal.concurrency;

import Ad.C0058e;
import U4.i;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.api.Service;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.growingio.android.circler.ThreadSafeTipView$OnExitListener;
import com.growingio.android.debugger.DebuggerEventWrapper$OnDebuggerEventListener;
import com.growingio.android.debugger.c;
import com.growingio.android.debugger.g;
import com.growingio.android.sdk.track.modelloader.data.HybridDom$OnDomChangedListener;
import com.growingio.android.sdk.track.webservices.log.WsLogger$Callback;
import com.palmpay.lib.bridgewrapper.location.LocationBridge;
import com.tencent.mmkv.MMKV;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.MarqueeTextView.e;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.adsdk.widgets.snackbar.SnackBarAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.rsp.UssdListRsp;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.dialog.SelectBankDialog;
import com.transsnet.palmpay.core.init.FaceGuardInitTask;
import com.transsnet.palmpay.core.rnbridge.bridge.AuthorizationBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.PickLocationBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.ScanCodeBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.SelectBankBridge;
import com.transsnet.palmpay.core.ui.activity.AddNewCardWithPaymentActivity;
import com.transsnet.palmpay.core.ui.activity.CoreUssdListActivity;
import com.transsnet.palmpay.core.viewmodel.ModelBankCardItem1;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.util.PhoneUtils;
import face.security.device.api.FaceSecInitListener;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import okhttp3.WebSocket;
import org.json.JSONException;
import org.json.JSONObject;
import p010a9.m;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Continuation, SuccessContinuation, ThreadSafeTipView$OnExitListener, WsLogger$Callback, com.growingio.android.debugger.ThreadSafeTipView$OnExitListener, HybridDom$OnDomChangedListener, OnFailureListener, Function, Predicate, MMKV.LibLoader, FaceSecInitListener, Consumer, Argument2Callback, SelectBankDialog.CallBack, BaseRecyclerViewAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22960b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f22959a = i7;
        this.f22960b = obj;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        int i7 = CoreUssdListActivity.f27608d;
        String opGuide = ((UssdListRsp) obj).getOpGuide();
        CoreUssdListActivity coreUssdListActivity = (CoreUssdListActivity) this.f22960b;
        coreUssdListActivity.f27610b = opGuide;
        if (Build.VERSION.SDK_INT < 26 || !PhoneUtils.isSimCardReady()) {
            CoreUssdListActivity.l(coreUssdListActivity.f27610b);
        } else {
            coreUssdListActivity.o();
        }
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        ((com.facebook.react.packagerconnection.a) this.f22960b).invoke(obj);
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        switch (this.f22959a) {
            case 7:
                return InterstitialAdView.fetchData$lambda$10((C0058e) this.f22960b, obj);
            case 8:
            case 9:
            case 10:
            case 14:
            case 15:
            default:
                return SnackBarAdView.fetchData$lambda$3((D6.a) this.f22960b, obj);
            case 11:
                return MarqueeViewV2.fetchData$lambda$6((e) this.f22960b, obj);
            case 12:
                return MarqueeViewV2.fetchData$lambda$8((e) this.f22960b, obj);
            case 13:
                return SingleAdView.fetchData$lambda$9((com.transsnet.adsdk.widgets.b) this.f22960b, obj);
            case 16:
                return SingleAdView.fetchData$lambda$7((com.transsnet.adsdk.widgets.b) this.f22960b, obj);
            case 17:
                return BannerAdView.fetchData$lambda$7((com.transsnet.adsdk.widgets.banner.b) this.f22960b, obj);
        }
    }

    @Override // com.growingio.android.sdk.track.webservices.log.WsLogger$Callback
    public void disposeLog(String str) {
        DebuggerEventWrapper$OnDebuggerEventListener debuggerEventWrapper$OnDebuggerEventListener = ((c) this.f22960b).f23156a;
        if (debuggerEventWrapper$OnDebuggerEventListener != null) {
            debuggerEventWrapper$OnDebuggerEventListener.onDebuggerMessage(str);
        }
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        int i7 = this.f22959a;
        int iIntValue = ((Integer) obj).intValue();
        Intent intent = (Intent) obj2;
        switch (i7) {
            case 24:
                AuthorizationBridge.onHandle$lambda$1((AuthorizationBridge) this.f22960b, iIntValue, intent);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                PickLocationBridge.onHandle$lambda$3$lambda$2$lambda$1((PickLocationBridge) this.f22960b, iIntValue, intent);
                break;
            case 26:
                ScanCodeBridge.onHandle$lambda$4$lambda$3$lambda$2((ScanCodeBridge) this.f22960b, iIntValue, intent);
                break;
            default:
                SelectBankBridge.onHandle$lambda$1((SelectBankBridge) this.f22960b, iIntValue, intent);
                break;
        }
    }

    @Override // com.tencent.mmkv.MMKV.LibLoader
    public void loadLibrary(String str) {
        ((BaseApplication) this.f22960b).lambda$initMMKV$4(str);
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectBankDialog.CallBack
    public void onChooseBankClick(BankInfo bankInfo) {
        AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = (AddNewCardWithPaymentActivity) this.f22960b;
        addNewCardWithPaymentActivity.f27424C = bankInfo;
        ModelBankCardItem1 modelBankCardItem1P = addNewCardWithPaymentActivity.p();
        if (modelBankCardItem1P != null) {
            modelBankCardItem1P.setBankInfo(addNewCardWithPaymentActivity.f27424C);
        }
        SelectBankDialog selectBankDialog = addNewCardWithPaymentActivity.f27445v;
        if (selectBankDialog != null) {
            selectBankDialog.dismiss();
        }
    }

    @Override // com.growingio.android.sdk.track.modelloader.data.HybridDom$OnDomChangedListener
    public void onDomChanged() {
        ((i) this.f22960b).x();
    }

    @Override // com.growingio.android.circler.ThreadSafeTipView$OnExitListener
    public void onExitDebugger() {
        switch (this.f22959a) {
            case 2:
                ((com.growingio.android.circler.c) this.f22960b).a();
                break;
            default:
                g gVar = (g) this.f22960b;
                gVar.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("msgType", "quit");
                    break;
                } catch (JSONException unused) {
                }
                String string = jSONObject.toString();
                WebSocket webSocket = gVar.f23175c.f23147b;
                if (webSocket != null) {
                    webSocket.send(string);
                }
                gVar.cancel();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        LocationBridge.m109getCurrentLocation$lambda3$lambda2$lambda1((LocationBridge) this.f22960b, exc);
    }

    @Override // face.security.device.api.FaceSecInitListener
    public void onInitFinish(int i7) {
        FaceGuardInitTask.C14591.run$lambda$0((FaceGuardInitTask) this.f22960b, i7);
    }

    @Override // io.reactivex.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f22959a) {
            case 8:
                return InterstitialAdView.fetchData$lambda$12((m) this.f22960b, obj);
            case 9:
                return MarqueeViewV2.fetchData$lambda$10((e) this.f22960b, obj);
            case 10:
                return MarqueeViewV2.fetchData$lambda$4((com.facebook.react.packagerconnection.a) this.f22960b, obj);
            case 11:
            case 12:
            case 13:
            case 16:
            case 17:
            default:
                return SnackBarAdView.fetchData$lambda$5((m) this.f22960b, obj);
            case 14:
                return SingleAdView.fetchData$lambda$11((com.transsnet.adsdk.widgets.b) this.f22960b, obj);
            case 15:
                return SingleAdView.fetchData$lambda$5((com.facebook.react.packagerconnection.a) this.f22960b, obj);
            case 18:
                return BannerAdView.fetchData$lambda$9((com.transsnet.adsdk.widgets.banner.b) this.f22960b, obj);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return ConfigFetchHandler.lambda$fetchFromBackendAndCacheResponse$4((ConfigFetchHandler.FetchResponse) this.f22960b, (ConfigContainer) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return CrashlyticsWorker.lambda$submitTaskOnSuccess$5((SuccessContinuation) this.f22960b, task);
    }
}
