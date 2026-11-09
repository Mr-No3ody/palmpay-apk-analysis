package com.transsnet.palmpay.p2pcash.business;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.p2pcash.bean.req.CreateBalancePaymentOrderReq;
import com.transsnet.palmpay.p2pcash.bean.req.CreateBizOrderReq;
import com.transsnet.palmpay.p2pcash.bean.req.GetCashierInfoReq;
import com.transsnet.palmpay.p2pcash.bean.req.QueryAppointmentHistoryReq;
import com.transsnet.palmpay.p2pcash.bean.req.QueryAppointmentTimeBusinessCountReq;
import com.transsnet.palmpay.p2pcash.bean.req.QueryNearbyAgentByLocationReq;
import com.transsnet.palmpay.p2pcash.bean.req.QueryNearbyAgentReq;
import com.transsnet.palmpay.p2pcash.bean.req.ShopHomeByMemberIdReq;
import com.transsnet.palmpay.p2pcash.bean.rsp.CommonMoneyListResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.CreateBalancePaymentOrderResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.CreateBizOrderResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.GetCashierInfoResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentDetailResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentHistoryResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentTimeBusinessCountResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentTimeResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAreaByCountryResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAreaByParentResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryBalancePaymentDetailResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryCancelOrderReasonResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryNearbyAgentByLocationResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryNearbyAgentResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import df.d;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H'¢\u0006\u0004\b\f\u0010\u0005J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\u0013\b\u0001\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rH'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u001dH'¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00022\b\b\u0001\u0010\u0007\u001a\u00020!H'¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00022\n\b\u0001\u0010&\u001a\u0004\u0018\u00010%H'¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00022\n\b\u0001\u0010*\u001a\u0004\u0018\u00010%H'¢\u0006\u0004\b,\u0010)J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00022\b\b\u0001\u0010\u0007\u001a\u00020-H'¢\u0006\u0004\b/\u00100J!\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00022\n\b\u0001\u00101\u001a\u0004\u0018\u00010%H'¢\u0006\u0004\b3\u0010)J!\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00022\n\b\u0001\u00101\u001a\u0004\u0018\u00010%H'¢\u0006\u0004\b5\u0010)J!\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00022\n\b\u0001\u00101\u001a\u0004\u0018\u00010%H'¢\u0006\u0004\b7\u0010)J\u0015\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0002H'¢\u0006\u0004\b9\u0010\u0005J-\u0010;\u001a\b\u0012\u0004\u0012\u0002060\u00022\n\b\u0001\u00101\u001a\u0004\u0018\u00010%2\n\b\u0001\u0010:\u001a\u0004\u0018\u00010%H'¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00022\b\b\u0001\u0010\u0007\u001a\u00020=H'¢\u0006\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/transsnet/palmpay/p2pcash/business/IApiP2PCashService;", "", "Ldf/d;", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/CommonMoneyListResp;", "commonMoneyList", "()Ldf/d;", "Lcom/transsnet/palmpay/p2pcash/bean/req/ShopHomeByMemberIdReq;", "req", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/ShopHomeByMemberIdResp;", "shopHomeByMemberId", "(Lcom/transsnet/palmpay/p2pcash/bean/req/ShopHomeByMemberIdReq;)Ldf/d;", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryAppointmentTimeResp;", "queryAppointmentTime", "", "Lcom/transsnet/palmpay/p2pcash/bean/req/QueryAppointmentTimeBusinessCountReq;", "Lkotlin/jvm/JvmSuppressWildcards;", "list", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryAppointmentTimeBusinessCountResp;", "queryAppointmentTimeBusinessCount", "(Ljava/util/List;)Ldf/d;", "Lcom/transsnet/palmpay/p2pcash/bean/req/CreateBizOrderReq;", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/CreateBizOrderResp;", "createBizOrder", "(Lcom/transsnet/palmpay/p2pcash/bean/req/CreateBizOrderReq;)Ldf/d;", "Lcom/transsnet/palmpay/p2pcash/bean/req/GetCashierInfoReq;", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/GetCashierInfoResp;", "getCashierInfo", "(Lcom/transsnet/palmpay/p2pcash/bean/req/GetCashierInfoReq;)Ldf/d;", "Lcom/transsnet/palmpay/p2pcash/bean/req/QueryAppointmentHistoryReq;", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryAppointmentHistoryResp;", "queryAppointmentHistory", "(Lcom/transsnet/palmpay/p2pcash/bean/req/QueryAppointmentHistoryReq;)Ldf/d;", "Lcom/transsnet/palmpay/p2pcash/bean/req/QueryNearbyAgentReq;", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryNearbyAgentResp;", "queryNearbyAgent", "(Lcom/transsnet/palmpay/p2pcash/bean/req/QueryNearbyAgentReq;)Ldf/d;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryAreaByCountryResp;", "queryAreaByCountry", "(Ljava/lang/String;)Ldf/d;", "parentAreaCode", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryAreaByParentResp;", "queryAreaByParent", "Lcom/transsnet/palmpay/p2pcash/bean/req/CreateBalancePaymentOrderReq;", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/CreateBalancePaymentOrderResp;", "createBalancePaymentOrder", "(Lcom/transsnet/palmpay/p2pcash/bean/req/CreateBalancePaymentOrderReq;)Ldf/d;", "orderNo", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryAppointmentDetailResp;", "queryAppointmentDetail", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryBalancePaymentDetailResp;", "queryBalancePaymentDetail", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "cancelOrder", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryCancelOrderReasonResp;", "queryCancelOrderReason", "reason", "uploadCancelOrderReason", "(Ljava/lang/String;Ljava/lang/String;)Ldf/d;", "Lcom/transsnet/palmpay/p2pcash/bean/req/QueryNearbyAgentByLocationReq;", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryNearbyAgentByLocationResp;", "queryNearbyAgentByLocation", "(Lcom/transsnet/palmpay/p2pcash/bean/req/QueryNearbyAgentByLocationReq;)Ldf/d;", "module_p2p_cash_in_out_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IApiP2PCashService {
    @GET("/api/scene-offline-product/appointmentForm/cancelOrder")
    @NotNull
    d<CommonResult> cancelOrder(@Nullable @Query("orderNo") String orderNo);

    @GET("/api/scene-offline-product/virtualAtmHome/commonMoneyList")
    @NotNull
    d<CommonMoneyListResp> commonMoneyList();

    @Headers({"Black-Code: yes"})
    @POST("/api/scene-offline-product/balanceSheet/createBizOrder")
    @NotNull
    d<CreateBalancePaymentOrderResp> createBalancePaymentOrder(@Body @NotNull CreateBalancePaymentOrderReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/scene-offline-product/appointmentForm/createBizOrder")
    @NotNull
    d<CommonBeanResult<CreateBizOrderResp>> createBizOrder(@Body @NotNull CreateBizOrderReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/cashier/payment/method/getCashierInfo")
    @NotNull
    d<GetCashierInfoResp> getCashierInfo(@Body @NotNull GetCashierInfoReq req);

    @GET("/api/scene-offline-product/appointmentForm/orderDetail")
    @NotNull
    d<QueryAppointmentDetailResp> queryAppointmentDetail(@Nullable @Query("orderNo") String orderNo);

    @POST("/api/scene-offline-product/appointmentForm/getAppointmentFormHistory")
    @NotNull
    d<QueryAppointmentHistoryResp> queryAppointmentHistory(@Body @NotNull QueryAppointmentHistoryReq req);

    @POST("/api/scene-offline-product/virtualAtmHome/appointmentTime")
    @NotNull
    d<QueryAppointmentTimeResp> queryAppointmentTime();

    @POST("/api/scene-offline-product/virtualAtmHome/appointmentTimeBusinessCount")
    @NotNull
    d<QueryAppointmentTimeBusinessCountResp> queryAppointmentTimeBusinessCount(@Body @NotNull List<QueryAppointmentTimeBusinessCountReq> list);

    @GET("/api/cfront/basic-data/queryAreaByCountry")
    @NotNull
    d<QueryAreaByCountryResp> queryAreaByCountry(@Nullable @Query(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) String countryCode);

    @GET("/api/cfront/basic-data/queryAreaByParent")
    @NotNull
    d<QueryAreaByParentResp> queryAreaByParent(@Nullable @Query("parentAreaCode") String parentAreaCode);

    @GET("/api/scene-offline-product/balanceSheet/feign/orderDetail")
    @NotNull
    d<QueryBalancePaymentDetailResp> queryBalancePaymentDetail(@Nullable @Query("orderNo") String orderNo);

    @GET("/api/scene-offline-product/appointmentForm/getCancelOrderReason")
    @NotNull
    d<QueryCancelOrderReasonResp> queryCancelOrderReason();

    @POST("/api/scene-offline-product/virtualAtmHome/moreShopHomeByMemberId")
    @NotNull
    d<QueryNearbyAgentResp> queryNearbyAgent(@Body @NotNull QueryNearbyAgentReq req);

    @POST("/api/scene-offline-product/nearbyAgent/memberNearbyAgent")
    @NotNull
    d<QueryNearbyAgentByLocationResp> queryNearbyAgentByLocation(@Body @NotNull QueryNearbyAgentByLocationReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/scene-offline-product/virtualAtmHome/shopHomeByMemberId")
    @NotNull
    d<ShopHomeByMemberIdResp> shopHomeByMemberId(@Body @NotNull ShopHomeByMemberIdReq req);

    @GET("/api/scene-offline-product/appointmentForm/cancelOrderReason")
    @NotNull
    d<CommonResult> uploadCancelOrderReason(@Nullable @Query("orderNo") String orderNo, @Nullable @Query("reason") String reason);
}
