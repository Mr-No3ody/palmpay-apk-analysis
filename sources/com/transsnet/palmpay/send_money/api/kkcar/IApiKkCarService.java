package com.transsnet.palmpay.send_money.api.kkcar;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.send_money.bean.req.kkcar.GetQrCodePollOrderReq;
import com.transsnet.palmpay.send_money.bean.req.kkcar.GetQrCodeReq;
import com.transsnet.palmpay.send_money.bean.req.kkcar.PassengerAuthReq;
import com.transsnet.palmpay.send_money.bean.req.kkcar.QrCodeOrderResultReq;
import com.transsnet.palmpay.send_money.bean.req.kkcar.UpdateCodeStatusReq;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarAuthInfoRsp;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarQrCodeConfigRsp;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarQrCodePollOrderRsp;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarQrCodeRsp;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.PassengerAuthRsp;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.UpdateCodeStatusRsp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\b\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\b\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\b\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\b\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/send_money/api/kkcar/IApiKkCarService;", "", "getAuthInfo", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarAuthInfoRsp;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "passengerAuth", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/PassengerAuthRsp;", "req", "Lcom/transsnet/palmpay/send_money/bean/req/kkcar/PassengerAuthReq;", "(Lcom/transsnet/palmpay/send_money/bean/req/kkcar/PassengerAuthReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQrCode", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp;", "Lcom/transsnet/palmpay/send_money/bean/req/kkcar/GetQrCodeReq;", "(Lcom/transsnet/palmpay/send_money/bean/req/kkcar/GetQrCodeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "qrCodeOrderResult", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "Lcom/transsnet/palmpay/send_money/bean/req/kkcar/QrCodeOrderResultReq;", "(Lcom/transsnet/palmpay/send_money/bean/req/kkcar/QrCodeOrderResultReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQrCodePollOrder", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodePollOrderRsp;", "Lcom/transsnet/palmpay/send_money/bean/req/kkcar/GetQrCodePollOrderReq;", "(Lcom/transsnet/palmpay/send_money/bean/req/kkcar/GetQrCodePollOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQrCodeConfig", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeConfigRsp;", "updateCodeStatus", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/UpdateCodeStatusRsp;", "Lcom/transsnet/palmpay/send_money/bean/req/kkcar/UpdateCodeStatusReq;", "(Lcom/transsnet/palmpay/send_money/bean/req/kkcar/UpdateCodeStatusReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IApiKkCarService {
    @GET("/api/finance-qrc-product/kkCar/getAuthInfo")
    @Nullable
    Object getAuthInfo(@NotNull Continuation<? super CommonBeanResult<KkCarAuthInfoRsp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/finance-qrc-product/kkCar/getQrCode")
    @Nullable
    Object getQrCode(@Body @NotNull GetQrCodeReq getQrCodeReq, @NotNull Continuation<? super CommonBeanResult<KkCarQrCodeRsp>> continuation);

    @POST("/api/finance-qrc-product/kkCar/getQrCodeConfig")
    @Nullable
    Object getQrCodeConfig(@NotNull Continuation<? super CommonBeanResult<KkCarQrCodeConfigRsp>> continuation);

    @POST("/api/finance-qrc-product/kkCar/getQrCodePollOrder")
    @Nullable
    Object getQrCodePollOrder(@Body @NotNull GetQrCodePollOrderReq getQrCodePollOrderReq, @NotNull Continuation<? super CommonBeanResult<KkCarQrCodePollOrderRsp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/finance-qrc-product/kkCar/passengerAuth")
    @Nullable
    Object passengerAuth(@Body @NotNull PassengerAuthReq passengerAuthReq, @NotNull Continuation<? super CommonBeanResult<PassengerAuthRsp>> continuation);

    @POST("/api/finance-qrc-product/kkCar/qrCodeOrderResult")
    @Nullable
    Object qrCodeOrderResult(@Body @NotNull QrCodeOrderResultReq qrCodeOrderResultReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/finance-qrc-product/kkCar/updateCodeStatus")
    @Nullable
    Object updateCodeStatus(@Body @NotNull UpdateCodeStatusReq updateCodeStatusReq, @NotNull Continuation<? super CommonBeanResult<UpdateCodeStatusRsp>> continuation);
}
