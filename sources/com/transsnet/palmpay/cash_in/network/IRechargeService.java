package com.transsnet.palmpay.cash_in.network;

import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.bean.OrderList;
import com.transsnet.palmpay.cash_in.bean.request.CheckCashInAmountReq;
import com.transsnet.palmpay.cash_in.bean.request.CreateCashInOutOrderReqV2;
import com.transsnet.palmpay.cash_in.bean.request.CreateCashOutOrderReq;
import com.transsnet.palmpay.cash_in.bean.request.GetFundConfigReq;
import com.transsnet.palmpay.cash_in.bean.request.NearbyAgentsReq;
import com.transsnet.palmpay.cash_in.bean.response.BindBankCardDetail;
import com.transsnet.palmpay.cash_in.bean.response.CashInGuidanceConfigBean;
import com.transsnet.palmpay.cash_in.bean.response.CreateCashInOutOrderRsp;
import com.transsnet.palmpay.cash_in.bean.response.FundInstructionRsp;
import com.transsnet.palmpay.cash_in.bean.response.FundMethodListResp;
import com.transsnet.palmpay.cash_in.bean.response.GetFundConfigResp;
import com.transsnet.palmpay.cash_in.bean.response.NearbyAgentsResp;
import com.transsnet.palmpay.cash_in.bean.response.QueryFundActivityIconRsp;
import com.transsnet.palmpay.cash_in.bean.response.QueryUssdLastOrderResp;
import com.transsnet.palmpay.cash_in.bean.response.UssdLastOrderResp;
import com.transsnet.palmpay.cash_in.bean.response.WithdrawHomeEntranceBean;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.main.export.bean.rsp.MeTabTotalAssetInfo;
import df.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0006J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\f\u001a\u00020\u0001H'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\f\u001a\u00020\u0001H'¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b\u001b\u0010\u0019J\u001b\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00140\bH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0014H§@¢\u0006\u0004\b#\u0010!J\"\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00142\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010$H§@¢\u0006\u0004\b&\u0010'J \u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00142\b\b\u0001\u0010\u0003\u001a\u00020(H§@¢\u0006\u0004\b*\u0010+J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0014H§@¢\u0006\u0004\b-\u0010!J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b.\u0010\u0019J\"\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00142\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010/H§@¢\u0006\u0004\b1\u00102J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0014H§@¢\u0006\u0004\b4\u0010!J\u0016\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0014H§@¢\u0006\u0004\b6\u0010!J \u00109\u001a\b\u0012\u0004\u0012\u0002080\u00142\b\b\u0001\u00107\u001a\u00020\u0012H§@¢\u0006\u0004\b9\u0010\u0019¨\u0006:"}, d2 = {"Lcom/transsnet/palmpay/cash_in/network/IRechargeService;", "", "Lcom/transsnet/palmpay/cash_in/bean/request/CreateCashInOutOrderReqV2;", "req", "Lcom/transsnet/palmpay/cash_in/bean/response/CreateCashInOutOrderRsp;", "createCashInOrderV2", "(Lcom/transsnet/palmpay/cash_in/bean/request/CreateCashInOutOrderReqV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/cash_in/bean/request/CreateCashOutOrderReq;", "Ldf/d;", "createCashOutOrder", "(Lcom/transsnet/palmpay/cash_in/bean/request/CreateCashOutOrderReq;)Ldf/d;", "createCashOutOrderV2ByNew", "body", "Lretrofit2/Call;", "Lcom/transsnet/palmpay/cash_in/bean/OrderList;", "queryCashOutList", "(Ljava/lang/Object;)Lretrofit2/Call;", "queryCashInList", "", "orderNo", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/cash_in/bean/BillDetail;", "queryCashInDetail", "(Ljava/lang/String;)Ldf/d;", "queryCashInDetailNew", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/cash_in/bean/response/BindBankCardDetail;", "queryBindBankCardDetail", "Lcom/transsnet/palmpay/cash_in/bean/response/FundInstructionRsp;", "getFundInstruction", "()Ldf/d;", "Lcom/transsnet/palmpay/cash_in/bean/response/QueryFundActivityIconRsp;", "queryFundActivityIcon", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/cash_in/bean/response/FundMethodListResp;", "queryFundMethodList", "Lcom/transsnet/palmpay/cash_in/bean/request/NearbyAgentsReq;", "Lcom/transsnet/palmpay/cash_in/bean/response/NearbyAgentsResp;", "queryNearbyAgents", "(Lcom/transsnet/palmpay/cash_in/bean/request/NearbyAgentsReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/cash_in/bean/request/CheckCashInAmountReq;", "Lcom/transsnet/palmpay/cash_in/bean/response/UssdLastOrderResp;", "queryUSSDLast", "(Lcom/transsnet/palmpay/cash_in/bean/request/CheckCashInAmountReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/cash_in/bean/response/QueryUssdLastOrderResp;", "queryUssdLastOrder", "queryCashOutDetailMvvm", "Lcom/transsnet/palmpay/cash_in/bean/request/GetFundConfigReq;", "Lcom/transsnet/palmpay/cash_in/bean/response/GetFundConfigResp;", "getFundConfig", "(Lcom/transsnet/palmpay/cash_in/bean/request/GetFundConfigReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/cash_in/bean/response/WithdrawHomeEntranceBean;", "getHomeEntranceInfo", "Lcom/transsnet/palmpay/main/export/bean/rsp/MeTabTotalAssetInfo;", "queryMeTabTotalAssetInfo", "scene", "Lcom/transsnet/palmpay/cash_in/bean/response/CashInGuidanceConfigBean;", "cashInGuidanceConfig", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IRechargeService {
    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/transfer-product/cash/in/cashInGuidanceConfig")
    Object cashInGuidanceConfig(@Field("scene") @NotNull String str, @NotNull Continuation<? super CommonBeanResult<CashInGuidanceConfigBean>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/transfer-product/cash/in/createBizOrder")
    @Nullable
    Object createCashInOrderV2(@Body @NotNull CreateCashInOutOrderReqV2 createCashInOutOrderReqV2, @NotNull Continuation<? super CreateCashInOutOrderRsp> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("/api/cfront/cashInOut/createCashOutOrder")
    @NotNull
    d<CreateCashInOutOrderRsp> createCashOutOrder(@Body @NotNull CreateCashOutOrderReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/transfer-product/cash/out/createBizOrder")
    @Nullable
    Object createCashOutOrderV2ByNew(@Body @Nullable CreateCashInOutOrderReqV2 createCashInOutOrderReqV2, @NotNull Continuation<? super CreateCashInOutOrderRsp> continuation);

    @POST("/api/transfer-product/cash/in/getFundConfig")
    @Nullable
    Object getFundConfig(@Body @Nullable GetFundConfigReq getFundConfigReq, @NotNull Continuation<? super CommonBeanResult<GetFundConfigResp>> continuation);

    @POST("/api/cfront/home/getFundInstruction")
    @NotNull
    d<CommonBeanResult<FundInstructionRsp>> getFundInstruction();

    @GET("/api/transfer-product/cash/out/getHomeEntranceInfo")
    @Nullable
    Object getHomeEntranceInfo(@NotNull Continuation<? super CommonBeanResult<WithdrawHomeEntranceBean>> continuation);

    @GET("/api/transfer-product/bank/card/queryBankCardDetail")
    @Nullable
    Object queryBindBankCardDetail(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<BindBankCardDetail>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("/api/transfer-product/cash/in/queryCashInDetail")
    @NotNull
    d<CommonBeanResult<BillDetail>> queryCashInDetail(@NotNull @Query("orderNo") String orderNo);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("/api/transfer-product/cash/in/queryCashInDetail")
    @Nullable
    Object queryCashInDetailNew(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<BillDetail>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("/api/transfer-product/cash/in/queryCashInList")
    @NotNull
    Call<OrderList> queryCashInList(@Body @NotNull Object body);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("/api/transfer-product/cash/out/queryCashOutDetail")
    @Nullable
    Object queryCashOutDetailMvvm(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<BillDetail>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("/api/transfer-product/cash/out/queryCashOutList")
    @NotNull
    Call<OrderList> queryCashOutList(@Body @NotNull Object body);

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/cashInOut/queryFundActivityIcon")
    @Nullable
    Object queryFundActivityIcon(@NotNull Continuation<? super QueryFundActivityIconRsp> continuation);

    @GET("/api/transfer-product/cash/in/getFundMethodList")
    @Nullable
    Object queryFundMethodList(@NotNull Continuation<? super CommonBeanResult<FundMethodListResp>> continuation);

    @POST("/api/c-bff-product/home/meTabTop")
    @Nullable
    Object queryMeTabTotalAssetInfo(@NotNull Continuation<? super CommonBeanResult<MeTabTotalAssetInfo>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/scene-offline-product/nearbyAgent/withdrawNearbyAgentHome")
    @Nullable
    Object queryNearbyAgents(@Body @Nullable NearbyAgentsReq nearbyAgentsReq, @NotNull Continuation<? super CommonBeanResult<NearbyAgentsResp>> continuation);

    @POST("/api/transfer-product/cash/in/last/ussd/order")
    @Nullable
    Object queryUSSDLast(@Body @NotNull CheckCashInAmountReq checkCashInAmountReq, @NotNull Continuation<? super CommonBeanResult<UssdLastOrderResp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/transfer-product/cash/in/last/complete/ussd/order")
    @Nullable
    Object queryUssdLastOrder(@NotNull Continuation<? super CommonBeanResult<QueryUssdLastOrderResp>> continuation);
}
