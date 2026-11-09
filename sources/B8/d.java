package B8;

import E.m0;
import M1.j;
import N8.q0;
import Pa.F;
import Pa.n0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.Preview$SurfaceProvider;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.v;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.utils.Consts;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.google.api.Service;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.utils.DateUtils;
import com.transsnet.mtn.sdk.ui.view.TitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.main.export.bean.rsp.NewExclusiveDataBean;
import com.transsnet.palmpay.main.export.bean.rsp.ProductData;
import com.transsnet.palmpay.main.export.bean.rsp.QueryFundModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryInsuranceModuleResp;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;
import com.transsnet.palmpay.ui.fragment.InvestGuideFragment;
import com.transsnet.palmpay.ui.fragment.settings.LoginSettingsFragment;
import com.transsnet.palmpay.util.MainUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p259r.c$a;
import top.zibin.luban.CompressionPredicate;
import top.zibin.luban.OnRenameListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements c$a, BaseRecyclerViewAdapter$ItemViewOnClickListener, Argument2Callback, OnItemClickListener, OnRenameListener, CompressionPredicate, OnCompleteListener, Preview$SurfaceProvider, EncoderFactory, UIManagerProvider, UIConstantsProviderBinding.DefaultEventTypesProvider, ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter, LibraryVersionComponent.VersionExtractor, OnFailureListener, Transformer, Continuation, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f567a;

    public /* synthetic */ d(int i7) {
        this.f567a = i7;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        switch (this.f567a) {
            case 1:
                TransHistoryRsp.DataBean.ListBean listBean = (TransHistoryRsp.DataBean.ListBean) obj;
                int i7 = MoneyTransferHistoryFragment.f33669X;
                if (listBean != null) {
                    Ea.a.e(listBean.transType, listBean.orderNo, "");
                    break;
                }
                break;
            default:
                ProductData data = (ProductData) obj;
                InvestGuideFragment.a aVar = InvestGuideFragment.f35185t0;
                Intrinsics.checkNotNullParameter(data, "data");
                MainUtils.jumpLoginWithParam(MainUtils.MAIN_WEALTH_TAB_PATH);
                break;
        }
    }

    @Override // p259r.c$a
    public void a() {
        int i7 = TitleBar.f25734i;
        if (Oe.a.f6828d == null) {
            Oe.a.f6828d = new Oe.a(23);
        }
        Oe.a aVar = Oe.a.f6828d;
        aVar.getClass();
        ArrayList arrayList = new ArrayList((ArrayList) aVar.f6830b);
        Collections.reverse(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eh.a aVar2 = (eh.a) it.next();
            it.remove();
            aVar2.finish();
        }
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        return TextInputLayout.lambda$new$0(editable);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderFactory
    public Encoder createEncoder(Executor executor, EncoderConfig encoderConfig) {
        return new v(executor, encoderConfig);
    }

    @Override // com.facebook.react.bridge.UIManagerProvider
    public UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        return ReactNativeHost.lambda$getUIManagerProvider$0(reactApplicationContext);
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        Context context = (Context) obj;
        switch (this.f567a) {
            case 17:
                return FirebaseCommonRegistrar.lambda$getComponents$0(context);
            case 18:
                return FirebaseCommonRegistrar.lambda$getComponents$1(context);
            case 19:
                return FirebaseCommonRegistrar.lambda$getComponents$2(context);
            default:
                return FirebaseCommonRegistrar.lambda$getComponents$3(context);
        }
    }

    @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.DefaultEventTypesProvider
    public NativeMap getDefaultEventTypes() {
        return ReactInstance._init_$lambda$0();
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        LoginSettingsFragment.a aVar = LoginSettingsFragment.f35263B;
        if (iIntValue == -1) {
            BaseApplication.get().getUser().enableLoginPsw();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        if (task == null || !task.isComplete()) {
            return;
        }
        n0.g().v("HomeSuccessfullyTriggerRate");
        p367ya.a.d().f44149a.f(1, "key_rate_dialog_show_status");
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        FirebaseCrashlytics.lambda$init$0(exc);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j adapter, View view, int i7) {
        switch (this.f567a) {
            case 4:
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Object item = adapter.getItem(i7);
                Intrinsics.f(item, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.NewExclusiveDataBean");
                NewExclusiveDataBean newExclusiveDataBean = (NewExclusiveDataBean) item;
                ClickEvent clickEvent = new ClickEvent("new_user_bonus_page_element_click");
                clickEvent.add(ViewProps.POSITION, String.valueOf(i7 + 1));
                String title = newExclusiveDataBean.getTitle();
                if (title == null) {
                    title = "";
                }
                clickEvent.add("title", title);
                n0.g().q(clickEvent);
                if (!TextUtils.isEmpty(newExclusiveDataBean.getAndroidUrl())) {
                    String androidUrl = newExclusiveDataBean.getAndroidUrl();
                    int jumpType = newExclusiveDataBean.getJumpType();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jumpType);
                    F.f(androidUrl, sb2.toString(), null);
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Object item2 = adapter.getItem(i7);
                Intrinsics.f(item2, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.QueryFundModuleResp");
                QueryFundModuleResp queryFundModuleResp = (QueryFundModuleResp) item2;
                if (!BaseApplication.hasLogin()) {
                    MainUtils.jumpLoginWithParam(MainUtils.MAIN_WEALTH_TAB_PATH);
                } else {
                    n0.g().k(new ClickEvent("FinanceTab_MutualFunds_Invest_Click").add("element_name", queryFundModuleResp.fundName));
                    com.palmpay.lib.apm.launchcounter.util.d.x(p002a.a.e(new Pair("fundId", queryFundModuleResp.fundId)), "FundDetail");
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Object item3 = adapter.getItem(i7);
                Intrinsics.f(item3, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.QueryInsuranceModuleResp");
                QueryInsuranceModuleResp queryInsuranceModuleResp = (QueryInsuranceModuleResp) item3;
                if (!BaseApplication.hasLogin()) {
                    MainUtils.jumpLoginWithParam(MainUtils.MAIN_WEALTH_TAB_PATH);
                } else {
                    n0.g().k(new ClickEvent("FinanceTab_Insurance_Get_Click").add("element_name", queryInsuranceModuleResp.insuranceName));
                    Bundle bundle = new Bundle();
                    bundle.putString("insuranceName", queryInsuranceModuleResp.insuranceName);
                    bundle.putString("insuranceCode", queryInsuranceModuleResp.insuranceCode);
                    Integer num = queryInsuranceModuleResp.insuranceType;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, iIntValue != 2 ? iIntValue != 3 ? "InsurancePreview" : "ScreenInsurancePreview" : "MotorInsurancePreview");
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Object item4 = adapter.getItem(i7);
                Intrinsics.f(item4, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.QueryTargetSavingModuleResp");
                MainUtils.jumpLoginWithParam(MainUtils.MAIN_WEALTH_TAB_PATH);
                break;
        }
    }

    @Override // androidx.camera.core.Preview$SurfaceProvider
    public void onSurfaceRequested(m0 m0Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(m0Var.f2056b.getWidth(), m0Var.f2056b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        m0Var.b(surface, org.chromium.support_lib_boundary.util.b.u(), new G.d(1, surface, surfaceTexture));
    }

    @Override // top.zibin.luban.OnRenameListener
    public String rename(String str) {
        String strSubstring;
        Intrinsics.e(str);
        int iG = StringsKt.G(str, 6, Consts.DOT);
        if (iG != -1) {
            strSubstring = str.substring(iG);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = PictureMimeType.JPG;
        }
        return q0.j(DateUtils.getCreateFileName("CMP_"), strSubstring);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f567a) {
            case 27:
                return FirebaseRemoteConfig.lambda$fetch$3((ConfigFetchHandler.FetchResponse) obj);
            case 28:
                return FirebaseRemoteConfig.lambda$setDefaultsWithStringsMapAsync$7((ConfigContainer) obj);
            default:
                return FirebaseRemoteConfig.lambda$fetch$4((ConfigFetchHandler.FetchResponse) obj);
        }
    }

    public /* synthetic */ d(MoneyTransferHistoryFragment moneyTransferHistoryFragment) {
        this.f567a = 1;
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        switch (this.f567a) {
            case 22:
                return DataTransportCrashlyticsReportSender.lambda$static$0((CrashlyticsReport) obj);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((MessagingClientEventExtension) obj).toByteArray();
            default:
                return ((PerfMetric) obj).toByteArray();
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f567a) {
            case 23:
                return FcmBroadcastProcessor.lambda$startMessagingService$1(task);
            default:
                return FcmBroadcastProcessor.lambda$bindToMessagingService$3(task);
        }
    }

    @Override // top.zibin.luban.CompressionPredicate
    public boolean apply(String str) {
        return (PictureMimeType.isUrlHasImage(str) && !PictureMimeType.isHasHttp(str)) || !PictureMimeType.isUrlHasGif(str);
    }
}
