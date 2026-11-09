package com.transsnet.palmpay.core.init;

import C0.G;
import F6.d;
import Pa.g0;
import Pa.r0;
import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.utils.executor.g;
import com.alibaba.android.alpha.Task;
import com.flexibank.sdk.FlexiBankFaceVerificationCallback;
import com.flexibank.sdk.FlexiBankReauthorizationListener;
import com.flexibank.sdk.core.util.FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack;
import com.flexibank.sdk.k;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.palmpay.init.annotation.InitTask;
import com.palmpay.lib.liveness.LiveID$ILiveIDListener;
import com.palmpay.lib.liveness.model.AuthenticationRequest;
import com.palmpay.lib.liveness.model.CheckResponse;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.req.GenerateAuthCodeReq;
import com.transsnet.palmpay.core.bean.rsp.GenerateAuthCodeResp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.m;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p232p6.p;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_GLIDE_INIT}, name = BaseInitTaskKt.TASK_FLEXIBANK_SDK_INIT)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001a\u001a\u00020\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/transsnet/palmpay/core/init/FlexiBankSdkInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "Landroid/app/Application;", "application", "", "initializeFlexiBankSdk", "(Landroid/app/Application;)V", "Lcom/flexibank/sdk/a;", "buildFlexiBankConfig", "()Lcom/flexibank/sdk/a;", "Landroid/app/Activity;", "activity", "", "scene", "", "mobileNo", "bizId", "Lcom/flexibank/sdk/core/util/FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack;", "callback", "startFaceVerification", "(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Lcom/flexibank/sdk/core/util/FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack;)V", "upstreamErrorCode", "upstreamErrorMessage", "LI3/a;", "generateAuthCodeForReauthorization", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/flexibank/sdk/c;", "buildFlexiBankDeviceInfo", "()Lcom/flexibank/sdk/c;", "Lcom/flexibank/sdk/b;", "resolveFlexiBankEnvironment", "()Lcom/flexibank/sdk/b;", "getTaskName", "()Ljava/lang/String;", "Lcom/alibaba/android/alpha/Task;", "getTask", "(Landroid/app/Application;)Lcom/alibaba/android/alpha/Task;", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlexiBankSdkInitTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexiBankSdkInitTask.kt\ncom/transsnet/palmpay/core/init/FlexiBankSdkInitTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
public final class FlexiBankSdkInitTask extends BaseInitTask {

    @NotNull
    private static final String DEVICE_TYPE_ANDROID = "ANDROID";

    @NotNull
    private static final String ERROR_EMPTY_AUTH_CODE = "EMPTY_AUTH_CODE";

    @NotNull
    private static final String ERROR_GENERATE_AUTH_CODE = "GENERATE_AUTH_CODE_ERROR";

    @NotNull
    private static final String FLEXIBANK_TNT_CODE = "FLEXIBANK";

    @NotNull
    private static final String MESSAGE_EMPTY_AUTH_CODE = "授权码为空";

    @NotNull
    private static final String MESSAGE_GENERATE_AUTH_CODE_FAILED = "生成授权码失败";

    @NotNull
    private static final String PALMPAY_APP_SOURCE = "0";

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.init.FlexiBankSdkInitTask$buildFlexiBankConfig$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 implements FlexiBankReauthorizationListener, FunctionAdapter {
        public AnonymousClass1() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlexiBankReauthorizationListener) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new m(3, FlexiBankSdkInitTask.this, FlexiBankSdkInitTask.class, "generateAuthCodeForReauthorization", "generateAuthCodeForReauthorization(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.flexibank.sdk.FlexiBankReauthorizationListener
        public final Object onReauthorizationRequired(String str, String str2, Continuation<? super I3.a> continuation) {
            return FlexiBankSdkInitTask.this.generateAuthCodeForReauthorization(str, str2, continuation);
        }
    }

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.init.FlexiBankSdkInitTask$generateAuthCodeForReauthorization$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.transsnet.palmpay.core.init.FlexiBankSdkInitTask", f = "FlexiBankSdkInitTask.kt", i = {0, 0}, l = {173}, m = "generateAuthCodeForReauthorization", n = {"upstreamErrorCode", "upstreamErrorMessage"}, s = {"L$0", "L$1"})
    public static final class C14601 extends Ff.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C14601(Continuation<? super C14601> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlexiBankSdkInitTask.this.generateAuthCodeForReauthorization(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.transsnet.palmpay.core.init.a] */
    private final com.flexibank.sdk.a buildFlexiBankConfig() {
        String lowerCase;
        String countryLocale = BaseApplication.getCountryLocale();
        com.flexibank.sdk.c cVarA = null;
        if (countryLocale == null) {
            lowerCase = "NG";
        } else {
            if (StringsKt.F(countryLocale)) {
                countryLocale = null;
            }
            if (countryLocale != null) {
                lowerCase = countryLocale.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase == null) {
                    lowerCase = "NG";
                }
            } else {
                lowerCase = "NG";
            }
        }
        String countryCode = lowerCase;
        Intrinsics.checkNotNullParameter("P260617092568177297851", RemoteConfigConstants.RequestFieldKey.APP_ID);
        Intrinsics.checkNotNullParameter(FLEXIBANK_TNT_CODE, "tntCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter("0", "appSource");
        com.flexibank.sdk.b bVar = com.flexibank.sdk.b.PRODUCTION;
        com.flexibank.sdk.b value = resolveFlexiBankEnvironment();
        Intrinsics.checkNotNullParameter(value, "value");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        ?? r10 = new FlexiBankFaceVerificationCallback() { // from class: com.transsnet.palmpay.core.init.a
            @Override // com.flexibank.sdk.FlexiBankFaceVerificationCallback
            public final void start(Activity activity, int i7, String str, String str2, boolean z3, FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack flexiBankScanFaceLogicUtil$ScanFaceResultCallBack) {
                FlexiBankSdkInitTask.buildFlexiBankConfig$lambda$1(this.f27389a, activity, i7, str, str2, z3, flexiBankScanFaceLogicUtil$ScanFaceResultCallBack);
            }
        };
        com.flexibank.sdk.c cVarBuildFlexiBankDeviceInfo = buildFlexiBankDeviceInfo();
        if (cVarBuildFlexiBankDeviceInfo != null) {
            String strB = cVarBuildFlexiBankDeviceInfo.getDeviceId();
            if (!y.m(strB, "fb_", false)) {
                strB = "fb_".concat(strB);
            }
            cVarA = com.flexibank.sdk.c.a(cVarBuildFlexiBankDeviceInfo, strB, null, 123);
        }
        return new com.flexibank.sdk.a(countryCode, value, new com.palmpay.lib.bridgewrapper.photo.upload.a(16), r10, anonymousClass1, cVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildFlexiBankConfig$lambda$1(FlexiBankSdkInitTask flexiBankSdkInitTask, Activity activity, int i7, String str, String str2, boolean z3, FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        flexiBankSdkInitTask.startFaceVerification(activity, i7, str, str2, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String buildFlexiBankConfig$lambda$2(String originBody) {
        Intrinsics.checkNotNullParameter(originBody, "originBody");
        String strD = r0.d(originBody);
        return strD == null ? originBody : strD;
    }

    private final com.flexibank.sdk.c buildFlexiBankDeviceInfo() {
        String versionName = BaseApplication.getInstance().getVersionName();
        if (versionName == null) {
            versionName = "";
        }
        String manufacturer = DeviceUtils.getManufacturer();
        if (manufacturer == null) {
            manufacturer = "";
        }
        String androidID = DeviceUtils.getAndroidID();
        if (androidID == null) {
            androidID = "";
        }
        String sDKVersionName = DeviceUtils.getSDKVersionName();
        if (sDKVersionName == null) {
            sDKVersionName = "";
        }
        String strConcat = "Android".concat(sDKVersionName);
        String uniqueId = PhoneUtils.getUniqueId();
        if (uniqueId == null) {
            uniqueId = "";
        }
        String model = DeviceUtils.getModel();
        if (model == null) {
            model = "";
        }
        return new com.flexibank.sdk.c(versionName, manufacturer, androidID, DEVICE_TYPE_ANDROID, strConcat, uniqueId, model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object generateAuthCodeForReauthorization(String str, String str2, Continuation<? super I3.a> continuation) {
        C14601 c14601;
        String str3;
        String str4;
        String str5;
        String str6;
        if (continuation instanceof C14601) {
            c14601 = (C14601) continuation;
            int i7 = c14601.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c14601.label = i7 - Integer.MIN_VALUE;
            } else {
                c14601 = new C14601(continuation);
            }
        } else {
            c14601 = new C14601(continuation);
        }
        Object objGenerateAuthCode = c14601.result;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = c14601.label;
        try {
            if (i10 == 0) {
                g.M(objGenerateAuthCode);
                d.h(BaseInitTask.TAG, 5, "FlexiBank reauthorization: " + str + ", " + str2);
                PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
                GenerateAuthCodeReq generateAuthCodeReq = new GenerateAuthCodeReq("P260617092568177297851");
                c14601.L$0 = str;
                c14601.L$1 = str2;
                c14601.label = 1;
                objGenerateAuthCode = payApiService.generateAuthCode(generateAuthCodeReq, c14601);
                if (objGenerateAuthCode == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) c14601.L$1;
                str = (String) c14601.L$0;
                g.M(objGenerateAuthCode);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) objGenerateAuthCode;
            GenerateAuthCodeResp generateAuthCodeResp = (GenerateAuthCodeResp) commonBeanResult.data;
            String authCode = generateAuthCodeResp != null ? generateAuthCodeResp.getAuthCode() : null;
            if (commonBeanResult.isSuccess() && authCode != null && !StringsKt.F(authCode)) {
                return new I3.a(authCode, 12, null, true, null);
            }
            if (commonBeanResult.isSuccess()) {
                String respMsg = commonBeanResult.getRespMsg();
                if (respMsg != null) {
                    str6 = respMsg;
                } else if (str2 == null) {
                    respMsg = MESSAGE_EMPTY_AUTH_CODE;
                    str6 = respMsg;
                } else {
                    str6 = str2;
                }
                return new I3.a(null, 2, ERROR_EMPTY_AUTH_CODE, false, str6);
            }
            String respCode = commonBeanResult.getRespCode();
            if (respCode == null) {
                if (str == null) {
                    str = ERROR_GENERATE_AUTH_CODE;
                }
                str4 = str;
            } else {
                str4 = respCode;
            }
            String respMsg2 = commonBeanResult.getRespMsg();
            if (respMsg2 == null) {
                str5 = str2 == null ? MESSAGE_GENERATE_AUTH_CODE_FAILED : str2;
            } else {
                str5 = respMsg2;
            }
            return new I3.a(null, 2, str4, false, str5);
        } catch (Exception e10) {
            d.c(BaseInitTask.TAG, "Generate FlexiBank auth code failed", e10);
            String message = e10.getMessage();
            if (message == null) {
                str3 = str2 == null ? MESSAGE_GENERATE_AUTH_CODE_FAILED : str2;
            } else {
                str3 = message;
            }
            return new I3.a(null, 2, ERROR_GENERATE_AUTH_CODE, false, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeFlexiBankSdk(Application application) {
        if (k.k()) {
            return;
        }
        try {
            k.j(application, buildFlexiBankConfig());
        } catch (Exception e10) {
            d.c(BaseInitTask.TAG, "FlexiBank SDK init failed", e10);
        }
    }

    private final com.flexibank.sdk.b resolveFlexiBankEnvironment() {
        return com.flexibank.sdk.b.PRODUCTION;
    }

    private final void startFaceVerification(Activity activity, int scene, String mobileNo, String bizId, final FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack callback) {
        d.c(BaseInitTask.TAG, G.m(scene, "FlexiBank face verification start: scene="));
        p pVar = p.f41234a;
        r6.a aVar = p.f41237d;
        if (aVar != null) {
            aVar.f41575g = 0;
        }
        LivenessTask.INSTANCE.initLiveness(activity.getApplication());
        p.j(activity, new AuthenticationRequest(Integer.valueOf(scene), null, bizId, mobileNo, "{\"countryCode\":\"NG\",\"tntCode\":\"FLEXIBANK\"}", 2, null), new LiveID$ILiveIDListener() { // from class: com.transsnet.palmpay.core.init.FlexiBankSdkInitTask.startFaceVerification.1
            @Override // com.palmpay.lib.liveness.LiveID$ILiveIDListener
            public void onCompleted(CheckResponse response, String transactionId) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (TextUtils.isEmpty(response.getData().getToken())) {
                    callback.onFailed(response.getRespCode(), response.getRespMsg());
                } else {
                    callback.onSuccess(new p006a4.a(response.getData().getS3Url(), response.getData().getToken(), response.getData().getSimilarity(), response.getRespMsg()));
                }
            }

            @Override // com.palmpay.lib.liveness.LiveID$ILiveIDListener
            public void onInterrupted(String code, String error, String addition) {
                StringBuilder sbF = F.f("FlexiBank face verification failed: ", code, " ", error, " ");
                sbF.append(addition);
                d.c(BaseInitTask.TAG, sbF.toString());
                callback.onFailed(code, error);
            }
        });
        g0.f7080h.refreshDeviceToken();
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.FlexiBankSdkInitTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(FlexiBankSdkInitTask.this, null, 1, null);
                try {
                    FlexiBankSdkInitTask.this.initializeFlexiBankSdk(application);
                } finally {
                    BaseInitTask.endSection$default(FlexiBankSdkInitTask.this, null, 1, null);
                }
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_FLEXIBANK_SDK_INIT;
    }
}
