package com.flexibank.sdk.api;

import O3.g;
import O3.h;
import O3.i;
import O3.k;
import W3.c;
import Z3.a;
import Z3.b;
import Z3.d;
import Z3.j;
import com.flexibank.sdk.cashier.bean.FlexiBankPayByOrderResp;
import com.flexibank.sdk.core.network.annotation.FlexiBankJsonName;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.e;
import p006a4.f;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0015\u001a\u00020\u00142\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u001a\u001a\u00020\u00192\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0001\u0010\u0013\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\b\u0001\u0010\u0013\u001a\u00020 H§@¢\u0006\u0004\b#\u0010$J \u0010'\u001a\b\u0012\u0004\u0012\u00020&0!2\b\b\u0001\u0010\u0013\u001a\u00020%H§@¢\u0006\u0004\b'\u0010(J\u001c\u0010+\u001a\u00020*2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010)H§@¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u00020\u00042\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b-\u0010\u0006J\u001c\u0010/\u001a\u00020.2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b/\u0010\u0016J\u001c\u00101\u001a\u00020*2\n\b\u0001\u00100\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b1\u00102J\u001c\u00106\u001a\u0002052\n\b\u0001\u00104\u001a\u0004\u0018\u000103H§@¢\u0006\u0004\b6\u00107J\u001c\u00109\u001a\u00020*2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u000108H§@¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/flexibank/sdk/api/FlexiBankApiCashierService;", "", "LO3/e;", "body", "Lcom/flexibank/sdk/cashier/bean/a;", "checkSavingPay", "(LO3/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "accountType", "", "transType", "La4/i;", "queryPaymentReward", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LO3/i;", "Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp;", "payByNewOrderNoByVM", "(LO3/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LO3/k;", "req", "LO3/h;", "queryPreviewPayInfoByVM", "(LO3/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LO3/f;", "methodReq", "LO3/g;", "queryPaymentMethodByVM", "(LO3/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LO3/c;", "LO3/d;", "queryUserCouponListByConditionByVM", "(LO3/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZ3/a;", "LW3/c;", "La4/a;", "aliFaceCheckResultV2", "(LZ3/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZ3/b;", "La4/b;", "aliFaceInit", "(LZ3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZ3/g;", "LW3/f;", "sendPayVerifySms", "(LZ3/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryNewPayResult", "La4/e;", "checkCouponByVM", "reference", "sendPostPayOtp", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZ3/d;", "otpReq", "La4/f;", "fundSendOtp", "(LZ3/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZ3/j;", "ubaBankAccPayResendOtp", "(LZ3/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FlexiBankApiCashierService {
    @POST("/api/validator/face/capture/checkResultV2")
    @Nullable
    Object aliFaceCheckResultV2(@Body @NotNull a aVar, @NotNull Continuation<? super c<p006a4.a>> continuation);

    @POST("/api/validator/face/capture/initialize")
    @Nullable
    Object aliFaceInit(@Body @NotNull b bVar, @NotNull Continuation<? super c<p006a4.b>> continuation);

    @POST("/api/cfront/pay/couponPreviewPayInfo")
    @Nullable
    Object checkCouponByVM(@Body @Nullable k kVar, @NotNull Continuation<? super e> continuation);

    @POST("/api/cashier-center/flexiBank/reqCheckPay")
    @Nullable
    Object checkSavingPay(@Body @Nullable O3.e eVar, @NotNull Continuation<? super com.flexibank.sdk.cashier.bean.a> continuation);

    @POST("/api/cfront/account/payBankAccSendOtp")
    @Nullable
    Object fundSendOtp(@Body @Nullable d dVar, @NotNull Continuation<? super f> continuation);

    @Headers({"Black-Code: yes", "Custom_Read_Timeout:120"})
    @POST("/api/cashier-center/flexiBank/submitPayOrder")
    @Nullable
    Object payByNewOrderNoByVM(@Body @NotNull i iVar, @NotNull Continuation<? super FlexiBankPayByOrderResp> continuation);

    @POST("/api/cashier/pay/queryPayRlt")
    @Nullable
    Object queryNewPayResult(@Body @Nullable O3.e eVar, @NotNull Continuation<? super com.flexibank.sdk.cashier.bean.a> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/cashier-center/flexiBank/getCashierInfo4Fb")
    @Nullable
    Object queryPaymentMethodByVM(@Body @Nullable O3.f fVar, @NotNull Continuation<? super g> continuation);

    @GET("/api/cfront/account/getPayDetainment")
    @Nullable
    Object queryPaymentReward(@Query("accountType") int i7, @NotNull @Query("transType") String str, @NotNull Continuation<? super p006a4.i> continuation);

    @POST("/api/cashier-center/flexiBank/previewPayInfo4Fb")
    @Nullable
    Object queryPreviewPayInfoByVM(@Body @Nullable k kVar, @NotNull Continuation<? super h> continuation);

    @POST("/api/cashier-center/coupon/userAllCouponV2")
    @Nullable
    Object queryUserCouponListByConditionByVM(@Body @NotNull O3.c cVar, @NotNull Continuation<? super O3.d> continuation);

    @POST("/api/cfront/risk/riskReSendSMS")
    @Nullable
    Object sendPayVerifySms(@Body @Nullable Z3.g gVar, @NotNull Continuation<? super W3.f> continuation);

    @POST("/api/v1/postpay/sendCreditCardOtp")
    @Nullable
    Object sendPostPayOtp(@Body @FlexiBankJsonName("reference") @Nullable String str, @NotNull Continuation<? super W3.f> continuation);

    @POST("/api/cfront/account/bankAccPayResendOtp")
    @Nullable
    Object ubaBankAccPayResendOtp(@Body @Nullable j jVar, @NotNull Continuation<? super W3.f> continuation);
}
