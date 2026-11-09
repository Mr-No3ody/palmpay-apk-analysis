package com.transsnet.palmpay.core.rnbridge.bridge;

import Ff.c;
import Ff.h;
import G9.i;
import J3.d;
import J3.e;
import J3.f;
import Pa.C0525w;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import android.app.Activity;
import androidx.activity.AbstractActivityC0822m;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.video.u;
import androidx.emoji2.text.j;
import androidx.lifecycle.LifecycleOwner;
import com.didi.drouter.annotation.Service;
import com.flexibank.sdk.callback.FlexiBankAuthorizationCallback;
import com.flexibank.sdk.k;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.palmpay.lib.bridge.AsyncBridge;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.req.GenerateAuthCodeReq;
import com.transsnet.palmpay.core.bean.rsp.GenerateAuthCodeResp;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.core.network.PayApiService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/mfb/bankSDKManager"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/MfbBankSdkManagerBridge;", "Lcom/palmpay/lib/bridge/AsyncBridge;", "Lcom/transsnet/palmpay/core/rnbridge/bridge/BankSdkManagerParams;", "<init>", "()V", "params", "", MfbBankSdkManagerBridge.ACTION_CALL_CASHIER_DESK, "(Lcom/transsnet/palmpay/core/rnbridge/bridge/BankSdkManagerParams;)V", "", "rawExtras", "", "", "parseCashierDisplayFields", "(Ljava/lang/String;)Ljava/util/List;", "LJ3/e;", "result", "handleCashierResult", "(LJ3/e;)V", MfbBankSdkManagerBridge.ACTION_REFRESH_BANK_TOKEN, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authCode", "authorizeBank", "(Ljava/lang/String;)V", "", "resId", "getBridgeString", "(I)Ljava/lang/String;", "action", "errorCode", "errorMessage", "handleBankSdkReject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "onHandle", "(Lcom/transsnet/palmpay/core/rnbridge/bridge/BankSdkManagerParams;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "Lkotlinx/coroutines/Job;", "requestJob", "Lkotlinx/coroutines/Job;", "", "isDestroyed", "Z", "Companion", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMfbBankSdkManagerBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MfbBankSdkManagerBridge.kt\ncom/transsnet/palmpay/core/rnbridge/bridge/MfbBankSdkManagerBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n1#2:337\n*E\n"})
public final class MfbBankSdkManagerBridge extends AsyncBridge<BankSdkManagerParams> {

    @NotNull
    private static final String ACTION_CALL_CASHIER_DESK = "callCashierDesk";

    @NotNull
    private static final String ACTION_REFRESH_BANK_TOKEN = "refreshBankToken";

    @NotNull
    private static final String ERROR_ACTIVITY_NOT_AVAILABLE = "ACTIVITY_NOT_AVAILABLE";

    @NotNull
    private static final String ERROR_CASHIER = "CASHIER_ERROR";

    @NotNull
    private static final String ERROR_CASHIER_LAUNCH = "CASHIER_LAUNCH_ERROR";

    @NotNull
    private static final String ERROR_EMPTY_AUTH_CODE = "EMPTY_AUTH_CODE";

    @NotNull
    private static final String ERROR_GENERATE_AUTH_CODE = "GENERATE_AUTH_CODE_ERROR";

    @NotNull
    private static final String ERROR_SDK_AUTHORIZATION = "SDK_AUTHORIZATION_ERROR";

    @NotNull
    private static final String ERROR_SDK_NOT_INITIALIZED = "SDK_NOT_INITIALIZED";

    @NotNull
    private static final String ERROR_UNKNOWN = "UNKNOWN_ERROR";

    @NotNull
    private static final String TAG = "MfbBankSdkManagerBridge";
    private volatile boolean isDestroyed;

    @Nullable
    private Job requestJob;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f.values().length];
            try {
                f fVar = f.f4511a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f fVar2 = f.f4511a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f fVar3 = f.f4511a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.rnbridge.bridge.MfbBankSdkManagerBridge$onHandle$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.transsnet.palmpay.core.rnbridge.bridge.MfbBankSdkManagerBridge$onHandle$1", f = "MfbBankSdkManagerBridge.kt", i = {}, l = {HomeMenuBean.BOTTOM_TAB_FINANCE}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14651 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C14651(Continuation<? super C14651> continuation) {
            super(2, continuation);
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfbBankSdkManagerBridge.this.new C14651(continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            Ef.a aVar = Ef.a.f2423a;
            int i7 = this.label;
            if (i7 == 0) {
                g.M(obj);
                MfbBankSdkManagerBridge mfbBankSdkManagerBridge = MfbBankSdkManagerBridge.this;
                this.label = 1;
                if (mfbBankSdkManagerBridge.refreshBankToken(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            return Unit.f38893a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14651) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.rnbridge.bridge.MfbBankSdkManagerBridge$refreshBankToken$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.transsnet.palmpay.core.rnbridge.bridge.MfbBankSdkManagerBridge", f = "MfbBankSdkManagerBridge.kt", i = {}, l = {176}, m = MfbBankSdkManagerBridge.ACTION_REFRESH_BANK_TOKEN, n = {}, s = {})
    public static final class C14661 extends c {
        int label;
        /* synthetic */ Object result;

        public C14661(Continuation<? super C14661> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MfbBankSdkManagerBridge.this.refreshBankToken(this);
        }
    }

    private final void authorizeBank(String authCode) {
        try {
            k.c(authCode, new FlexiBankAuthorizationCallback() { // from class: com.transsnet.palmpay.core.rnbridge.bridge.MfbBankSdkManagerBridge.authorizeBank.1
                @Override // com.flexibank.sdk.callback.FlexiBankAuthorizationCallback
                public void onError(String errorCode, String errorMessage) {
                    MfbBankSdkManagerBridge.this.handleBankSdkReject(MfbBankSdkManagerBridge.ACTION_REFRESH_BANK_TOKEN, errorCode, errorMessage);
                }

                @Override // com.flexibank.sdk.callback.FlexiBankAuthorizationCallback
                public void onSuccess(String token, String memberId, String phoneNumber, boolean securityAlert, boolean firstLogin) {
                    if (MfbBankSdkManagerBridge.this.isDestroyed) {
                        return;
                    }
                    BaseBridge.handleSuccess$default(MfbBankSdkManagerBridge.this, new RefreshBankTokenResult(Boolean.TRUE, memberId), null, 2, null);
                }
            });
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = getBridgeString(L9.c.cm_mfb_sdk_authorization_failed);
            }
            handleBankSdkReject(ACTION_REFRESH_BANK_TOKEN, ERROR_SDK_AUTHORIZATION, message);
        }
    }

    private final void callCashierDesk(BankSdkManagerParams params) {
        String transType;
        String orderNo;
        String orderNo2 = (params == null || (orderNo = params.getOrderNo()) == null) ? null : StringsKt.V(orderNo).toString();
        String transType2 = (params == null || (transType = params.getTransType()) == null) ? null : StringsKt.V(transType).toString();
        Long orderAmount = params != null ? params.getOrderAmount() : null;
        if (orderNo2 == null || orderNo2.length() == 0) {
            handleIllegalArgument("orderNo is required");
            return;
        }
        if (transType2 == null || transType2.length() == 0) {
            handleIllegalArgument("transType is required");
            return;
        }
        if (orderAmount == null || orderAmount.longValue() <= 0) {
            handleIllegalArgument("orderAmount must be greater than zero");
            return;
        }
        List<Object> value = parseCashierDisplayFields(params.getJsonExtras());
        if (value == null) {
            return;
        }
        Activity activity = getActivity();
        AbstractActivityC0822m abstractActivityC0822m = activity instanceof AbstractActivityC0822m ? (AbstractActivityC0822m) activity : null;
        if (abstractActivityC0822m == null) {
            handleBankSdkReject(ACTION_CALL_CASHIER_DESK, ERROR_ACTIVITY_NOT_AVAILABLE, "Activity result registry is unavailable");
            return;
        }
        try {
            long jLongValue = orderAmount.longValue();
            String payeeAccountType = params.getPayeeAccountType();
            if (payeeAccountType == null) {
                payeeAccountType = "";
            }
            String payeeAccountType2 = payeeAccountType;
            Intrinsics.checkNotNullParameter(orderNo2, "orderNo");
            Intrinsics.checkNotNullParameter(transType2, "transType");
            Intrinsics.checkNotNullParameter(payeeAccountType2, "payeeAccountType");
            String subTransType = params.getSubTransType();
            String payerAccountId = params.getPayerAccountId();
            String str = (payerAccountId == null || StringsKt.F(payerAccountId)) ? null : payerAccountId;
            String calculationExtInfo = params.getCalculationExtInfo();
            Intrinsics.checkNotNullParameter(value, "value");
            Boolean boolIsNoPullCashier = params.isNoPullCashier();
            abstractActivityC0822m.runOnUiThread(new j(this, 19, abstractActivityC0822m, new d(orderNo2, transType2, subTransType, jLongValue, str, payeeAccountType2, calculationExtInfo, value, !(boolIsNoPullCashier != null ? boolIsNoPullCashier.booleanValue() : false))));
        } catch (IllegalArgumentException e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "invalid cashier parameters";
            }
            handleIllegalArgument(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void callCashierDesk$lambda$2(MfbBankSdkManagerBridge mfbBankSdkManagerBridge, AbstractActivityC0822m abstractActivityC0822m, d dVar) {
        if (mfbBankSdkManagerBridge.isDestroyed) {
            return;
        }
        try {
            k.l(abstractActivityC0822m, dVar, new i(mfbBankSdkManagerBridge, 5));
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Failed to launch cashier";
            }
            mfbBankSdkManagerBridge.handleBankSdkReject(ACTION_CALL_CASHIER_DESK, ERROR_CASHIER_LAUNCH, message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void callCashierDesk$lambda$2$lambda$1(MfbBankSdkManagerBridge mfbBankSdkManagerBridge, e result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (mfbBankSdkManagerBridge.isDestroyed) {
            return;
        }
        mfbBankSdkManagerBridge.handleCashierResult(result);
    }

    private final String getBridgeString(int resId) {
        String string = BaseApplication.getContext().getString(resId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0012  */
    /* JADX WARN: Code duplicated, block: B:19:0x0020  */
    public final void handleBankSdkReject(String action, String errorCode, String errorMessage) {
        if (this.isDestroyed) {
            return;
        }
        if (errorCode == null) {
            errorCode = ERROR_UNKNOWN;
        } else {
            if (StringsKt.F(errorCode)) {
                errorCode = null;
            }
            if (errorCode == null) {
                errorCode = ERROR_UNKNOWN;
            }
        }
        if (errorMessage == null) {
            errorMessage = getBridgeString(L9.c.cm_mfb_unknown_error);
        } else {
            if (StringsKt.F(errorMessage)) {
                errorMessage = null;
            }
            if (errorMessage == null) {
                errorMessage = getBridgeString(L9.c.cm_mfb_unknown_error);
            }
        }
        F6.d.c(TAG, u.n(action, " failed, errorCode=", errorCode, ", errorMessage=", errorMessage));
        handleReject(((Gson) C0525w.f().f7166b).toJson(new BankSdkManagerError(errorCode, errorMessage)));
    }

    private final void handleCashierResult(e result) {
        int i7 = WhenMappings.$EnumSwitchMapping$0[result.f4503a.ordinal()];
        if (i7 == 1) {
            BaseBridge.handleSuccess$default(this, result, null, 2, null);
            return;
        }
        if (i7 == 2) {
            handleCancel("cashier canceled");
            return;
        }
        if (i7 != 3) {
            throw new l();
        }
        String str = result.f4509g;
        if (str == null) {
            str = ERROR_CASHIER;
        }
        String str2 = result.f4510h;
        if (str2 == null) {
            str2 = "Cashier failed";
        }
        handleBankSdkReject(ACTION_CALL_CASHIER_DESK, str, str2);
    }

    private final List<Object> parseCashierDisplayFields(String rawExtras) {
        if (rawExtras == null || StringsKt.F(rawExtras)) {
            return z.f38935a;
        }
        try {
            ArrayList arrayList = (ArrayList) C0525w.f().e(rawExtras, new TypeToken<ArrayList<Object>>() { // from class: com.transsnet.palmpay.core.rnbridge.bridge.MfbBankSdkManagerBridge$parseCashierDisplayFields$type$1
            }.getType());
            if (arrayList != null) {
                return arrayList;
            }
            throw new IllegalArgumentException("jsonExtras must be a json array");
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "jsonExtras must be valid json";
            }
            handleIllegalArgument(message);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object refreshBankToken(Continuation<? super Unit> continuation) {
        C14661 c14661;
        String authCode;
        if (continuation instanceof C14661) {
            c14661 = (C14661) continuation;
            int i7 = c14661.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c14661.label = i7 - Integer.MIN_VALUE;
            } else {
                c14661 = new C14661(continuation);
            }
        } else {
            c14661 = new C14661(continuation);
        }
        Object objGenerateAuthCode = c14661.result;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = c14661.label;
        try {
            if (i10 == 0) {
                g.M(objGenerateAuthCode);
                PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
                GenerateAuthCodeReq generateAuthCodeReq = new GenerateAuthCodeReq("P260617092568177297851");
                c14661.label = 1;
                objGenerateAuthCode = payApiService.generateAuthCode(generateAuthCodeReq, c14661);
                if (objGenerateAuthCode == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(objGenerateAuthCode);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) objGenerateAuthCode;
            if (!commonBeanResult.isSuccess()) {
                String respCode = commonBeanResult.getRespCode();
                if (respCode == null) {
                    respCode = ERROR_GENERATE_AUTH_CODE;
                }
                String respMsg = commonBeanResult.getRespMsg();
                if (respMsg == null) {
                    respMsg = getBridgeString(L9.c.cm_mfb_generate_auth_code_failed);
                }
                handleBankSdkReject(ACTION_REFRESH_BANK_TOKEN, respCode, respMsg);
                return Unit.f38893a;
            }
            GenerateAuthCodeResp generateAuthCodeResp = (GenerateAuthCodeResp) commonBeanResult.data;
            String str = null;
            if (generateAuthCodeResp != null && (authCode = generateAuthCodeResp.getAuthCode()) != null && !StringsKt.F(authCode)) {
                str = authCode;
            }
            if (str == null || StringsKt.F(str)) {
                handleBankSdkReject(ACTION_REFRESH_BANK_TOKEN, ERROR_EMPTY_AUTH_CODE, getBridgeString(L9.c.cm_mfb_empty_auth_code));
                return Unit.f38893a;
            }
            authorizeBank(str);
            return Unit.f38893a;
        } catch (CancellationException e10) {
            throw e10;
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = getBridgeString(L9.c.cm_mfb_generate_auth_code_failed);
            }
            handleBankSdkReject(ACTION_REFRESH_BANK_TOKEN, ERROR_GENERATE_AUTH_CODE, message);
            return Unit.f38893a;
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.isDestroyed = true;
        Job job = this.requestJob;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.requestJob = null;
        super.onDestroy(owner);
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable BankSdkManagerParams params, @Nullable IBridgeCallback callback) {
        String key = params != null ? params.getKey() : null;
        if (!Intrinsics.c(key, ACTION_REFRESH_BANK_TOKEN) && !Intrinsics.c(key, ACTION_CALL_CASHIER_DESK)) {
            handleIllegalArgument("key must be refreshBankToken or callCashierDesk");
            return;
        }
        if (!k.k()) {
            handleBankSdkReject(key, ERROR_SDK_NOT_INITIALIZED, getBridgeString(L9.c.cm_mfb_sdk_not_initialized));
            return;
        }
        if (!Intrinsics.c(key, ACTION_REFRESH_BANK_TOKEN)) {
            if (Intrinsics.c(key, ACTION_CALL_CASHIER_DESK)) {
                callCashierDesk(params);
            }
        } else {
            Job job = this.requestJob;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            p042cg.f fVar = I.f10809a;
            this.requestJob = AbstractC0780y.m(AbstractC0777v.a(p042cg.e.f19009c), null, null, new C14651(null), 3);
        }
    }
}
