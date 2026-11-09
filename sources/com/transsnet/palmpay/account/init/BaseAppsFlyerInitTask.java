package com.transsnet.palmpay.account.init;

import C0.G;
import F6.d;
import Ff.h;
import Pa.AbstractC0520q;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import Z4.e;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.utils.executor.g;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustStoreInfo;
import com.adjust.sdk.LogLevel;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.palmpay.lib.bridgewrapper.photo.upload.a;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.bean.rsp.UploadAppsFlyerRsp;
import com.transsnet.palmpay.account.business.IApiAccountService;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.EncryptUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p042cg.f;
import p183m6.n;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\b&\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016J\u001e\u0010\r\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002J\u0018\u0010\u0012\u001a\u00020\t2\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0013H\u0002¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/account/init/BaseAppsFlyerInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "Lcom/appsflyer/AppsFlyerConversionListener;", "<init>", "()V", "onConversionDataSuccess", "", "map", "", "", "", "onConversionDataFail", "error", "onAppOpenAttribution", "onAttributionFailure", "uploadAppsFlyerData", "campaign", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "convertMapToJson", "", "Companion", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseAppsFlyerInitTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAppsFlyerInitTask.kt\ncom/transsnet/palmpay/account/init/BaseAppsFlyerInitTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
public abstract class BaseAppsFlyerInitTask extends BaseInitTask implements AppsFlyerConversionListener {

    @NotNull
    private static final String AF_DEV_KEY = "ZSRyKCs3pXGyjuZ4DCZvak";

    @NotNull
    private static final String AF_TAG = "AppsFlyer";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_AF_FIRST_OPEN = "key_af_first_open";

    @NotNull
    public static final String KEY_AF_UPLOAD_OK = "key_af_upload_ok";
    private static volatile boolean adjustSdkInitialized;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0012J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\r\u0010\u0014\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/account/init/BaseAppsFlyerInitTask$Companion;", "", "<init>", "()V", "AF_TAG", "", "AF_DEV_KEY", "KEY_AF_FIRST_OPEN", "KEY_AF_UPLOAD_OK", "adjustSdkInitialized", "", "initAppsFlyerLib", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/appsflyer/AppsFlyerConversionListener;", "intent", "Landroid/content/Intent;", "lateInit", "initAppsFlyerLib$module_account_impl_release", "parseIntent", "initAdjustSdk", "initAdjustSdk$module_account_impl_release", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initAdjustSdk$lambda$6(AdjustAttribution adjustAttribution) {
            d.h(com.adjust.sdk.Constants.LOGTAG, 3, G.p("onAttributionChanged: ", adjustAttribution.campaign, " ", adjustAttribution.clickLabel));
        }

        public static /* synthetic */ void initAppsFlyerLib$module_account_impl_release$default(Companion companion, AppsFlyerConversionListener appsFlyerConversionListener, Intent intent, boolean z3, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                intent = null;
            }
            if ((i7 & 4) != 0) {
                z3 = false;
            }
            companion.initAppsFlyerLib$module_account_impl_release(appsFlyerConversionListener, intent, z3);
        }

        private final void parseIntent(Intent intent) {
            if (intent != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new b(intent, 1), 100L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void parseIntent$lambda$5$lambda$4(Intent intent) {
            Object objF;
            Companion companion = BaseAppsFlyerInitTask.INSTANCE;
            try {
                o oVar = q.f43977a;
                d.h(BaseAppsFlyerInitTask.AF_TAG, 3, "parseIntent: performOnDeepLinking (delayed)");
                AppsFlyerLib.getInstance().performOnDeepLinking(intent, BaseApplication.get());
                objF = Unit.f38893a;
            } catch (Throwable th) {
                o oVar2 = q.f43977a;
                objF = g.f(th);
            }
            Throwable thA = q.a(objF);
            if (thA != null) {
                d.c(BaseAppsFlyerInitTask.AF_TAG, "performOnDeepLinking failed", thA);
            }
        }

        public final void initAdjustSdk$module_account_impl_release() {
            User user;
            String memberId;
            if (BaseAppsFlyerInitTask.adjustSdkInitialized) {
                return;
            }
            AdjustConfig adjustConfig = new AdjustConfig(BaseApplication.getContext(), "y22tmc5yntog", AdjustConfig.ENVIRONMENT_PRODUCTION);
            adjustConfig.setLogLevel(LogLevel.WARN);
            adjustConfig.setExternalDeviceId(EncryptUtils.encryptMD5ToString(PhoneUtils.getUniqueId()));
            adjustConfig.enableCostDataInAttribution();
            adjustConfig.setOnAttributionChangedListener(new a(14));
            AdjustStoreInfo adjustStoreInfo = new AdjustStoreInfo(BaseApplication.getChannel());
            adjustStoreInfo.setStoreAppId(BaseApplication.getApplication().getPackageName());
            adjustConfig.setStoreInfo(adjustStoreInfo);
            Adjust.addGlobalCallbackParameter(AppsFlyerProperties.CHANNEL, BaseApplication.getChannel());
            Adjust.addGlobalCallbackParameter(AdRevenueScheme.COUNTRY, BaseApplication.getCountryLocale());
            if (BaseApplication.hasLogin() && (user = BaseApplication.get().getUser()) != null && (memberId = user.getMemberId()) != null) {
                if (TextUtils.isEmpty(memberId)) {
                    memberId = null;
                }
                if (memberId != null) {
                    Adjust.addGlobalCallbackParameter("member_id", EncryptUtils.encryptMD5ToString(memberId));
                }
            }
            Adjust.initSdk(adjustConfig);
            BaseAppsFlyerInitTask.adjustSdkInitialized = true;
        }

        public final void initAppsFlyerLib$module_account_impl_release(@Nullable AppsFlyerConversionListener listener, @Nullable Intent intent, boolean lateInit) {
            User user;
            String memberId;
            Context context = BaseApplication.getContext();
            AppsFlyerLib.getInstance().init(BaseAppsFlyerInitTask.AF_DEV_KEY, listener, context);
            try {
                AppsFlyerLib.getInstance().setCustomerUserId("new$" + PhoneUtils.getUniqueId() + "$");
                AppsFlyerLib.getInstance().setMinTimeBetweenSessions((lateInit && BaseApplication.get().isOldAndroidDevice()) ? 60 : 30);
                HashMap map = new HashMap();
                map.put(AppsFlyerProperties.CHANNEL, BaseApplication.getChannel());
                map.put(AdRevenueScheme.COUNTRY, BaseApplication.getCountryLocale());
                if (BaseApplication.hasLogin() && (user = BaseApplication.get().getUser()) != null && (memberId = user.getMemberId()) != null) {
                    if (TextUtils.isEmpty(memberId)) {
                        memberId = null;
                    }
                    if (memberId != null) {
                        map.put("member_id", memberId);
                    }
                }
                AppsFlyerLib.getInstance().setAdditionalData(map);
                String strH = e.h(context, "mediaSource");
                String strH2 = e.h(context, "campaign");
                if (!TextUtils.isEmpty(strH2) && !TextUtils.isEmpty(strH)) {
                    String strH3 = e.h(context, "siteId");
                    if (TextUtils.isEmpty(strH3)) {
                        strH3 = "0";
                    }
                    AppsFlyerLib.getInstance().setPreinstallAttribution(strH, strH2, strH3);
                }
            } catch (Throwable th) {
                Log.e(BaseAppsFlyerInitTask.AF_TAG, "initAppsFlyerLib: ", th);
            }
            AppsFlyerLib.getInstance().subscribeForDeepLink(new DeepLinkListener() { // from class: com.transsnet.palmpay.account.init.BaseAppsFlyerInitTask$Companion$initAppsFlyerLib$3

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[DeepLinkResult.Status.values().length];
                        try {
                            iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // com.appsflyer.deeplink.DeepLinkListener
                public void onDeepLinking(DeepLinkResult result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    DeepLinkResult.Status status = result.getStatus();
                    Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
                    int i7 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                    if (i7 != 1) {
                        if (i7 == 2) {
                            return;
                        } else {
                            Objects.toString(result.getError());
                        }
                    }
                    DeepLink deepLink = result.getDeepLink();
                    if (deepLink != null) {
                        String campaign = deepLink.getCampaign();
                        String mediaSource = deepLink.getMediaSource();
                        d.h(BaseInitTask.TAG, 3, F.d(F.f("onDeepLinking: ", campaign, " ", mediaSource, " "), deepLink.getAfSub1(), " ", deepLink.getAfSub2()));
                        try {
                            Intent intentA = Pa.F.a(BaseApplication.get(), deepLink.getDeepLinkValue());
                            if (intentA == null && !TextUtils.isEmpty(deepLink.getAfSub1())) {
                                intentA = Pa.F.a(BaseApplication.get(), deepLink.getAfSub1());
                            }
                            if (intentA != null) {
                                V v3 = V.f10828a;
                                f fVar = I.f10809a;
                                AbstractC0780y.m(v3, p015ag.o.f11960a, null, new BaseAppsFlyerInitTask$Companion$initAppsFlyerLib$3$onDeepLinking$1$1$1(intentA, null), 2);
                            }
                        } catch (Exception e10) {
                            Log.e("AppsFlyer", "onDeepLinking: ", e10);
                        }
                    }
                }
            });
            AppsFlyerLib.getInstance().start(context);
            parseIntent(intent);
            if (!AbstractC0520q.f7140f || !"Infinix X6528".equalsIgnoreCase(AbstractC0520q.f7136b)) {
                boolean zB = false;
                try {
                    zB = n.f39523a.instance().b("enableAdjust", false);
                } catch (Exception unused) {
                }
                if (!zB) {
                    return;
                }
            }
            initAdjustSdk$module_account_impl_release();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.transsnet.palmpay.account.init.BaseAppsFlyerInitTask$uploadAppsFlyerData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.transsnet.palmpay.account.init.BaseAppsFlyerInitTask$uploadAppsFlyerData$1", f = "BaseAppsFlyerInitTask.kt", i = {}, l = {297}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $campaign;
        final /* synthetic */ String $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$campaign = str;
            this.$data = str2;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$campaign, this.$data, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            List<SignUpRetainDialogConfig> list;
            Ef.a aVar = Ef.a.f2423a;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    g.M(obj);
                    if (TextUtils.isEmpty(this.$campaign) || TextUtils.isEmpty(this.$data)) {
                        d.h(BaseAppsFlyerInitTask.AF_TAG, 3, "uploadAppsFlyerData: campaign or data is empty");
                        return Unit.f38893a;
                    }
                    IApiAccountService iApiAccountServiceT = G8.a.t();
                    String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(BaseApplication.get());
                    String str = this.$campaign;
                    String str2 = this.$data;
                    this.label = 1;
                    obj = iApiAccountServiceT.uploadAppsFlyerConversation(appsFlyerUID, str, str2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.M(obj);
                }
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                if (commonBeanResult.isSuccess()) {
                    p059e1.a.X(BaseAppsFlyerInitTask.KEY_AF_UPLOAD_OK, true);
                    UploadAppsFlyerRsp uploadAppsFlyerRsp = (UploadAppsFlyerRsp) commonBeanResult.data;
                    if (uploadAppsFlyerRsp != null && (list = uploadAppsFlyerRsp.popupContents) != null && (!list.isEmpty())) {
                        c.b().f(new MessageEvent(MessageEvent.EVENT_UPLOAD_APPSFLYER_CONVERSATION_DONE, ((UploadAppsFlyerRsp) commonBeanResult.data).popupContents));
                    }
                    d.h(BaseAppsFlyerInitTask.AF_TAG, 3, "uploadAppsFlyerData: success");
                } else {
                    d.h(BaseAppsFlyerInitTask.AF_TAG, 3, "uploadAppsFlyerData: fail");
                }
            } catch (Exception e10) {
                d.h(BaseAppsFlyerInitTask.AF_TAG, 3, "uploadAppsFlyerData: error " + e10);
            }
            return Unit.f38893a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    private final String convertMapToJson(Map<?, ?> map) {
        try {
            String string = new JSONObject(map).toString();
            Intrinsics.e(string);
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    private final void uploadAppsFlyerData(String campaign, String data) {
        V v3 = V.f10828a;
        f fVar = I.f10809a;
        AbstractC0780y.m(v3, p042cg.e.f19009c, null, new AnonymousClass1(campaign, data, null), 2);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(@Nullable Map<String, String> map) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(@Nullable String error) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(@Nullable String error) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(@Nullable Map<String, Object> map) {
        Object obj;
        Intent intentA;
        Set<String> setKeySet;
        if (map != null && (setKeySet = map.keySet()) != null) {
            setKeySet.size();
        }
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                Objects.toString(map.get(it.next()));
            }
            Object obj2 = map.get("campaign");
            Object obj3 = null;
            if (obj2 != null) {
                if (!(obj2 instanceof String) || TextUtils.isEmpty((CharSequence) obj2)) {
                    obj2 = null;
                }
                if (obj2 != null) {
                    String str = (String) obj2;
                    p059e1.a.W("firebase_sp_appsflyer_campaign", str);
                    HashMap map2 = new HashMap();
                    map2.put("campaign", obj2);
                    map2.put(CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO, DeviceUtils.getAndroidID());
                    AdManager.setExtras(map2);
                    if (!p059e1.a.C(KEY_AF_UPLOAD_OK, false)) {
                        uploadAppsFlyerData(str, convertMapToJson(map));
                    }
                }
            }
            try {
                Object obj4 = map.get("af_dp");
                if (obj4 != null) {
                    if (!(obj4 instanceof String) || TextUtils.isEmpty((CharSequence) obj4)) {
                        obj4 = null;
                    }
                    if (obj4 == null || (obj = map.get("is_first_launch")) == null) {
                        return;
                    }
                    if ((obj instanceof Boolean) && obj.equals(Boolean.TRUE)) {
                        obj3 = obj;
                    }
                    if (obj3 == null || (intentA = Pa.F.a(BaseApplication.get(), (String) obj4)) == null) {
                        return;
                    }
                    ActivityUtils.startActivity(intentA);
                }
            } catch (Exception e10) {
                d.c(AF_TAG, "onConversionDataSuccess:", e10);
                Unit unit = Unit.f38893a;
            }
        }
    }
}
