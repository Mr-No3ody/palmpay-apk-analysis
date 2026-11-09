package com.transsnet.palmpay.airtime.network;

import com.transsnet.palmpay.airtime.bean.AirtimeDetailData;
import com.transsnet.palmpay.airtime.bean.AirtimeExtraItemInfoBean;
import com.transsnet.palmpay.airtime.bean.AirtimeGroupPurchaseDetailData;
import com.transsnet.palmpay.airtime.bean.AirtimeOrderList;
import com.transsnet.palmpay.airtime.bean.AirtimeOrderStatusRsp;
import com.transsnet.palmpay.airtime.bean.BillerBottomMenuBean;
import com.transsnet.palmpay.airtime.bean.QueryAirtimeV2Rsp;
import com.transsnet.palmpay.airtime.bean.R2CHistoryItemListBean;
import com.transsnet.palmpay.airtime.bean.ScheduleTopUpFAQResp;
import com.transsnet.palmpay.airtime.bean.req.AddScheduleTopUpTaskReq;
import com.transsnet.palmpay.airtime.bean.req.AirtimeDownTimeOrderUpdateReq;
import com.transsnet.palmpay.airtime.bean.req.AirtimeOrderAddReq;
import com.transsnet.palmpay.airtime.bean.req.AirtimePreOrderCancelReq;
import com.transsnet.palmpay.airtime.bean.req.DeleteScheduleTopUpTaskReq;
import com.transsnet.palmpay.airtime.bean.req.EditScheduleTopUpTaskReq;
import com.transsnet.palmpay.airtime.bean.req.GroupPurchaseReq;
import com.transsnet.palmpay.airtime.bean.req.MTNLoginReq;
import com.transsnet.palmpay.airtime.bean.req.R2CCreateOrderReq;
import com.transsnet.palmpay.airtime.bean.req.SendRecharge2CashOTPReq;
import com.transsnet.palmpay.airtime.bean.rsp.AirtimeDownTimeOrderUpdateRsp;
import com.transsnet.palmpay.airtime.bean.rsp.AutoRenewTaskBean;
import com.transsnet.palmpay.airtime.bean.rsp.CreateGroupPurchaseRsp;
import com.transsnet.palmpay.airtime.bean.rsp.DowntimeOrderListBean;
import com.transsnet.palmpay.airtime.bean.rsp.FlashSalesProductsItemBean;
import com.transsnet.palmpay.airtime.bean.rsp.GroupPurchaseRsp;
import com.transsnet.palmpay.airtime.bean.rsp.R2CCreateOrderResp;
import com.transsnet.palmpay.airtime.bean.rsp.R2CHomeInfoResp;
import com.transsnet.palmpay.airtime.bean.rsp.R2COrderDetailResp;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemRemark;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemRsp;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAuthorizeInfoResp;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpConfigInfoBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpRecommendResp;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskRsp;
import com.transsnet.palmpay.common.export.bean.req.DialogConfigSettingsReq;
import com.transsnet.palmpay.common.export.bean.resp.DialogConfigSettingsResp;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonLongResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.rsp.R2CUssdDialNoResp;
import com.transsnet.palmpay.teller.bean.HistoryOrderReq;
import com.transsnet.palmpay.teller.bean.OrderReminderSubscribeReq;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\fH§@¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H§@¢\u0006\u0002\u0010\u0005J&\u0010\u0010\u001a\u00020\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013H§@¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0018H§@¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003H§@¢\u0006\u0002\u0010\u0005J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0013H§@¢\u0006\u0002\u0010\u001fJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010#H§@¢\u0006\u0002\u0010$J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0001\u0010(\u001a\u00020)H§@¢\u0006\u0002\u0010*J\u0018\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020.H§@¢\u0006\u0002\u0010/J\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010&H§@¢\u0006\u0002\u0010\u0005J\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0003H§@¢\u0006\u0002\u0010\u0005J \u00104\u001a\b\u0012\u0004\u0012\u0002050\u00032\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013H§@¢\u0006\u0002\u0010\u001fJ \u00106\u001a\b\u0012\u0004\u0012\u0002050\u00032\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u0013H§@¢\u0006\u0002\u0010\u001fJ\u0018\u00108\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u000209H§@¢\u0006\u0002\u0010:J\u0018\u0010;\u001a\u00020<2\b\b\u0001\u0010\b\u001a\u00020=H§@¢\u0006\u0002\u0010>J\"\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0\u00032\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0013H§@¢\u0006\u0002\u0010\u001fJ \u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0\u00032\b\b\u0001\u0010\b\u001a\u00020CH§@¢\u0006\u0002\u0010DJ\u001a\u0010E\u001a\u00020\u00072\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0013H§@¢\u0006\u0002\u0010\u001fJ \u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00032\n\b\u0001\u0010-\u001a\u0004\u0018\u00010HH§@¢\u0006\u0002\u0010IJ\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00032\b\b\u0001\u0010N\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u001fJ\u001e\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00032\b\b\u0001\u00107\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u001fJ\u0018\u0010Q\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020RH§@¢\u0006\u0002\u0010SJ\u001e\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\u00032\b\b\u0001\u0010\b\u001a\u00020RH§@¢\u0006\u0002\u0010SJ\u0018\u0010V\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020WH§@¢\u0006\u0002\u0010XJ\u0018\u0010Y\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020ZH§@¢\u0006\u0002\u0010[J\u001e\u0010\\\u001a\b\u0012\u0004\u0012\u00020U0\u00032\b\b\u0001\u0010]\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u001fJ(\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u00032\b\b\u0001\u0010N\u001a\u00020\u00132\b\b\u0001\u00107\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0015J\u001e\u0010`\u001a\b\u0012\u0004\u0012\u00020a0\u00032\b\b\u0001\u0010N\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u001fJ\u0018\u0010b\u001a\u00020c2\b\b\u0001\u0010-\u001a\u00020#H§@¢\u0006\u0002\u0010$J\u0014\u0010d\u001a\b\u0012\u0004\u0012\u00020e0&H§@¢\u0006\u0002\u0010\u0005J\u000e\u0010f\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010g\u001a\b\u0012\u0004\u0012\u00020h0\u00032\b\b\u0001\u0010]\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u001fJ\"\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010j0\u00032\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0013H§@¢\u0006\u0002\u0010\u001fJ\u0016\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010l0\u0003H§@¢\u0006\u0002\u0010\u0005J \u0010m\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010n0\u00032\b\b\u0001\u0010-\u001a\u00020oH§@¢\u0006\u0002\u0010pJ\u000e\u0010q\u001a\u00020rH§@¢\u0006\u0002\u0010\u0005¨\u0006s"}, d2 = {"Lcom/transsnet/palmpay/airtime/network/IAirtimeService;", "", "queryScheduleFaqResp", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/airtime/bean/ScheduleTopUpFAQResp;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendRechargeToCashOTPMvvm", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "req", "Lcom/transsnet/palmpay/airtime/bean/req/SendRecharge2CashOTPReq;", "(Lcom/transsnet/palmpay/airtime/bean/req/SendRecharge2CashOTPReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recharge2CashLoginMvvm", "Lcom/transsnet/palmpay/airtime/bean/req/MTNLoginReq;", "(Lcom/transsnet/palmpay/airtime/bean/req/MTNLoginReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getR2CHomeInfo", "Lcom/transsnet/palmpay/airtime/bean/rsp/R2CHomeInfoResp;", "getAirtimeBalance", "Lcom/transsnet/palmpay/core/bean/CommonLongResult;", "network", "", "phone", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createR2COrder", "Lcom/transsnet/palmpay/airtime/bean/rsp/R2CCreateOrderResp;", "Lcom/transsnet/palmpay/airtime/bean/req/R2CCreateOrderReq;", "(Lcom/transsnet/palmpay/airtime/bean/req/R2CCreateOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUSSDDialNo", "Lcom/transsnet/palmpay/core/bean/rsp/R2CUssdDialNoResp;", "getR2CDetailMvvm", "Lcom/transsnet/palmpay/airtime/bean/rsp/R2COrderDetailResp;", "orderNo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getR2CShareHistory", "Lcom/transsnet/palmpay/core/bean/CommonListResult;", "Lcom/transsnet/palmpay/airtime/bean/R2CHistoryItemListBean;", "Lcom/transsnet/palmpay/teller/bean/HistoryOrderReq;", "(Lcom/transsnet/palmpay/teller/bean/HistoryOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryMoreServiceByBusinessType", "Lcom/transsnet/palmpay/core/bean/CommonListResultV2;", "Lcom/transsnet/palmpay/airtime/bean/BillerBottomMenuBean;", "businessType", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "airtimeOrderAddV2ByNew", "Lcom/transsnet/palmpay/airtime/bean/AirtimeOrderStatusRsp;", "body", "Lcom/transsnet/palmpay/airtime/bean/req/AirtimeOrderAddReq;", "(Lcom/transsnet/palmpay/airtime/bean/req/AirtimeOrderAddReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryFlashSalesProductsByOld", "Lcom/transsnet/palmpay/airtime/bean/rsp/FlashSalesProductsItemBean;", "getDowntimeOrderList", "Lcom/transsnet/palmpay/airtime/bean/rsp/DowntimeOrderListBean;", "initItemCashbackInfo", "Lcom/transsnet/palmpay/airtime/bean/AirtimeExtraItemInfoBean;", "getItemCashbackInfo", "billerId", "cancelPreOrder", "Lcom/transsnet/palmpay/airtime/bean/req/AirtimePreOrderCancelReq;", "(Lcom/transsnet/palmpay/airtime/bean/req/AirtimePreOrderCancelReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentMethod", "Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeDownTimeOrderUpdateRsp;", "Lcom/transsnet/palmpay/airtime/bean/req/AirtimeDownTimeOrderUpdateReq;", "(Lcom/transsnet/palmpay/airtime/bean/req/AirtimeDownTimeOrderUpdateReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "airtimeOrderDetail", "Lcom/transsnet/palmpay/airtime/bean/AirtimeDetailData;", "subscribeLowBalance", "", "Lcom/transsnet/palmpay/teller/bean/OrderReminderSubscribeReq;", "(Lcom/transsnet/palmpay/teller/bean/OrderReminderSubscribeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dfsApplyRefund", "queryDialogConfig", "Lcom/transsnet/palmpay/common/export/bean/resp/DialogConfigSettingsResp;", "Lcom/transsnet/palmpay/common/export/bean/req/DialogConfigSettingsReq;", "(Lcom/transsnet/palmpay/common/export/bean/req/DialogConfigSettingsReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryScheduleTopUpConfigInfo", "Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpConfigInfoBean;", "queryScheduleList", "Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpTaskRsp;", "memberId", "queryScheduleItemByOperator", "Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpAmountItemRsp;", "checkNetworkValidation", "Lcom/transsnet/palmpay/airtime/bean/req/AddScheduleTopUpTaskReq;", "(Lcom/transsnet/palmpay/airtime/bean/req/AddScheduleTopUpTaskReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addScheduleTask", "Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpTaskBean;", "editScheduleTask", "Lcom/transsnet/palmpay/airtime/bean/req/EditScheduleTopUpTaskReq;", "(Lcom/transsnet/palmpay/airtime/bean/req/EditScheduleTopUpTaskReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteScheduleTask", "Lcom/transsnet/palmpay/airtime/bean/req/DeleteScheduleTopUpTaskReq;", "(Lcom/transsnet/palmpay/airtime/bean/req/DeleteScheduleTopUpTaskReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryScheduleTaskById", "taskId", "queryScheduleRecommendIdByBillerId", "Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpRecommendResp;", "queryScheduleTopUpAuthorizeInfo", "Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpAuthorizeInfoResp;", "getAirtimeOrderList", "Lcom/transsnet/palmpay/airtime/bean/AirtimeOrderList;", "queryScheduleTopUpItemRemark", "Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpAmountItemRemark;", "ignoreAutoTopupPopu", "getAutoRenewTaskStatusDetail", "Lcom/transsnet/palmpay/airtime/bean/rsp/AutoRenewTaskBean;", "airtimeGroupPurchaseOrderDetail", "Lcom/transsnet/palmpay/airtime/bean/AirtimeGroupPurchaseDetailData;", "queryGroupPurchase", "Lcom/transsnet/palmpay/airtime/bean/rsp/GroupPurchaseRsp;", "createGroupPurchaseOrder", "Lcom/transsnet/palmpay/airtime/bean/rsp/CreateGroupPurchaseRsp;", "Lcom/transsnet/palmpay/airtime/bean/req/GroupPurchaseReq;", "(Lcom/transsnet/palmpay/airtime/bean/req/GroupPurchaseReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAirtimeItemV4Mvvm", "Lcom/transsnet/palmpay/airtime/bean/QueryAirtimeV2Rsp;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IAirtimeService {
    @Headers({"Black-Code: yes"})
    @POST("/api/airtime/scheduledAirtimeTopUp/edit/confirm/save")
    @Nullable
    Object addScheduleTask(@Body @NotNull AddScheduleTopUpTaskReq addScheduleTopUpTaskReq, @NotNull Continuation<? super CommonBeanResult<ScheduleTopUpTaskBean>> continuation);

    @GET("/api/airtime/groupBuying/order/detail")
    @Nullable
    Object airtimeGroupPurchaseOrderDetail(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<AirtimeGroupPurchaseDetailData>> continuation);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/gateway/airtime/createBizOrder")
    @Nullable
    Object airtimeOrderAddV2ByNew(@Body @NotNull AirtimeOrderAddReq airtimeOrderAddReq, @NotNull Continuation<? super AirtimeOrderStatusRsp> continuation);

    @GET("/api/airtime/airtimeOrderDetailV2")
    @Nullable
    Object airtimeOrderDetail(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<AirtimeDetailData>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/airtime/preOrders/cancel")
    @Nullable
    Object cancelPreOrder(@Body @NotNull AirtimePreOrderCancelReq airtimePreOrderCancelReq, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/airtime/scheduledAirtimeTopUp/edit/confirm/networkValidation")
    @Nullable
    Object checkNetworkValidation(@Body @NotNull AddScheduleTopUpTaskReq addScheduleTopUpTaskReq, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/airtime/groupBuying/activity/inside/join")
    @Nullable
    Object createGroupPurchaseOrder(@Body @NotNull GroupPurchaseReq groupPurchaseReq, @NotNull Continuation<? super CommonBeanResult<CreateGroupPurchaseRsp>> continuation);

    @Headers({"Use_Sign_V2: yes"})
    @POST("/api/airtime/gateway/r2c/v2/createOrder")
    @Nullable
    Object createR2COrder(@Body @Nullable R2CCreateOrderReq r2CCreateOrderReq, @NotNull Continuation<? super CommonBeanResult<R2CCreateOrderResp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/airtime/scheduledAirtimeTopUp/edit/confirm/delete")
    @Nullable
    Object deleteScheduleTask(@Body @NotNull DeleteScheduleTopUpTaskReq deleteScheduleTopUpTaskReq, @NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/airtime/dfs/refund")
    @Nullable
    Object dfsApplyRefund(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/airtime/scheduledAirtimeTopUp/edit/confirm/edit")
    @Nullable
    Object editScheduleTask(@Body @NotNull EditScheduleTopUpTaskReq editScheduleTopUpTaskReq, @NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/airtime/gateway/r2c/v2/getAirtimeBalance")
    @Nullable
    Object getAirtimeBalance(@Nullable @Query("network") String str, @Nullable @Query("phoneNo") String str2, @NotNull Continuation<? super CommonLongResult> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("/api/cfront/airtime/airtimeOrderList")
    @Nullable
    Object getAirtimeOrderList(@Body @NotNull HistoryOrderReq historyOrderReq, @NotNull Continuation<? super AirtimeOrderList> continuation);

    @GET("/api/scene-data-product/data/autoRenewal/task/detail/v2")
    @Nullable
    Object getAutoRenewTaskStatusDetail(@NotNull @Query("taskId") String str, @NotNull Continuation<? super CommonBeanResult<AutoRenewTaskBean>> continuation);

    @GET("/api/airtime/preOrders/page/v2")
    @Nullable
    Object getDowntimeOrderList(@NotNull Continuation<? super CommonBeanResult<DowntimeOrderListBean>> continuation);

    @GET("/api/airtime/V3/item/tipsByBillerV3")
    @Nullable
    Object getItemCashbackInfo(@Nullable @Query("billerId") String str, @NotNull Continuation<? super CommonBeanResult<AirtimeExtraItemInfoBean>> continuation);

    @GET("/api/airtime/gateway/r2c/v2/detail")
    @Nullable
    Object getR2CDetailMvvm(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<R2COrderDetailResp>> continuation);

    @GET("/api/airtime/gateway/r2c/v2/getHomeInfo")
    @Nullable
    Object getR2CHomeInfo(@NotNull Continuation<? super CommonBeanResult<R2CHomeInfoResp>> continuation);

    @POST("/api/airtime/gateway/r2c/page")
    @Nullable
    Object getR2CShareHistory(@Body @Nullable HistoryOrderReq historyOrderReq, @NotNull Continuation<? super CommonListResult<R2CHistoryItemListBean>> continuation);

    @POST("/api/oneloop-gw-service/v1/operator/common/query/ussdPhone")
    @Nullable
    Object getUSSDDialNo(@NotNull Continuation<? super CommonBeanResult<R2CUssdDialNoResp>> continuation);

    @GET("/api/airtime/scheduledAirtimeTopUp/popup/disable")
    @Nullable
    Object ignoreAutoTopupPopu(@NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/airtime/V3/item/defaultTipsV4")
    @Nullable
    Object initItemCashbackInfo(@Nullable @Query("phone") String str, @NotNull Continuation<? super CommonBeanResult<AirtimeExtraItemInfoBean>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/airtime/menu/v4")
    @Nullable
    Object queryAirtimeItemV4Mvvm(@NotNull Continuation<? super QueryAirtimeV2Rsp> continuation);

    @POST("/api/wallet-bff-product/toastFatigue/queryToast")
    @Nullable
    Object queryDialogConfig(@Body @Nullable DialogConfigSettingsReq dialogConfigSettingsReq, @NotNull Continuation<? super CommonBeanResult<DialogConfigSettingsResp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/airtime/buyProducts/v2")
    @Nullable
    Object queryFlashSalesProductsByOld(@NotNull Continuation<? super CommonListResultV2<FlashSalesProductsItemBean>> continuation);

    @GET("/api/airtime/groupBuying/activity/join/recommend")
    @Nullable
    Object queryGroupPurchase(@NotNull Continuation<? super CommonBeanResult<GroupPurchaseRsp>> continuation);

    @GET("/api/scene-billpayment-core/moreService/queryByBusinessType")
    @Nullable
    Object queryMoreServiceByBusinessType(@Query("businessType") int i7, @NotNull Continuation<? super CommonListResultV2<BillerBottomMenuBean>> continuation);

    @GET("/api/airtime/scheduledAirtimeTopUp/home/FAQ")
    @Nullable
    Object queryScheduleFaqResp(@NotNull Continuation<? super CommonBeanResult<ScheduleTopUpFAQResp>> continuation);

    @GET("/api/airtime/scheduledAirtimeTopUp/edit/categoryItems")
    @Nullable
    Object queryScheduleItemByOperator(@NotNull @Query("billerId") String str, @NotNull Continuation<? super CommonBeanResult<ScheduleTopUpAmountItemRsp>> continuation);

    @GET("/api/airtime/scheduledAirtimeTopUp/home/schedules")
    @Nullable
    Object queryScheduleList(@NotNull @Query("memberId") String str, @NotNull Continuation<? super CommonBeanResult<ScheduleTopUpTaskRsp>> continuation);

    @GET("/api/airtime/scheduledAirtimeTopUp/edit/recommendPhone")
    @Nullable
    Object queryScheduleRecommendIdByBillerId(@NotNull @Query("memberId") String str, @NotNull @Query("billerId") String str2, @NotNull Continuation<? super CommonBeanResult<ScheduleTopUpRecommendResp>> continuation);

    @GET("/api/airtime/scheduledAirtimeTopUp/schedule/detail/v2")
    @Nullable
    Object queryScheduleTaskById(@NotNull @Query("id") String str, @NotNull Continuation<? super CommonBeanResult<ScheduleTopUpTaskBean>> continuation);

    @GET("/api/airtime/scheduledAirtimeTopUp/authorize/get")
    @Nullable
    Object queryScheduleTopUpAuthorizeInfo(@NotNull @Query("memberId") String str, @NotNull Continuation<? super CommonBeanResult<ScheduleTopUpAuthorizeInfoResp>> continuation);

    @GET("/api/airtime/scheduledAirtimeTopUp/edit/contents")
    @Nullable
    Object queryScheduleTopUpConfigInfo(@NotNull Continuation<? super CommonBeanResult<ScheduleTopUpConfigInfoBean>> continuation);

    @GET("/api/airtime/scheduledAirtimeTopUp/item/tips")
    @Nullable
    Object queryScheduleTopUpItemRemark(@NotNull Continuation<? super CommonListResultV2<ScheduleTopUpAmountItemRemark>> continuation);

    @POST("/api/oneloop-gw-service/v2/operator/shareAirtime/login")
    @Nullable
    Object recharge2CashLoginMvvm(@Body @Nullable MTNLoginReq mTNLoginReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/oneloop-gw-service/v2/operator/shareAirtime/sendOtp")
    @Nullable
    Object sendRechargeToCashOTPMvvm(@Body @Nullable SendRecharge2CashOTPReq sendRecharge2CashOTPReq, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Content-Type: application/json"})
    @POST("/api/airtime/balanceShortage/order/subscribe")
    @Nullable
    Object subscribeLowBalance(@Body @NotNull OrderReminderSubscribeReq orderReminderSubscribeReq, @NotNull Continuation<? super CommonBeanResult<Boolean>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/airtime/preOrders/updatePayType")
    @Nullable
    Object updatePaymentMethod(@Body @NotNull AirtimeDownTimeOrderUpdateReq airtimeDownTimeOrderUpdateReq, @NotNull Continuation<? super AirtimeDownTimeOrderUpdateRsp> continuation);
}
