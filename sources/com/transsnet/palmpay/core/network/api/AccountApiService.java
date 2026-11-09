package com.transsnet.palmpay.core.network.api;

import com.transsnet.palmpay.core.bean.AccountFlowBean;
import com.transsnet.palmpay.core.bean.BalanceAccountInfo;
import com.transsnet.palmpay.core.bean.BindBankCardFeeBean;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.DefaultPayMethodResp;
import com.transsnet.palmpay.core.bean.LinkBankAccountResp;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.core.bean.PaymentMethodResp;
import com.transsnet.palmpay.core.bean.UnlinkBankCardReq;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfPaymentMethodReq;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfPaymentMethodResp;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfWithdrawalReq;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfWithdrawalResp;
import com.transsnet.palmpay.core.bean.cashier.ManualCalcOfWithdrawalReq;
import com.transsnet.palmpay.core.bean.cashier.ManualCalcOfWithdrawalResp;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.req.AccountFlowReq;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.req.CheckCardBindNumReq;
import com.transsnet.palmpay.core.bean.req.CheckModifyBankCardReq;
import com.transsnet.palmpay.core.bean.req.DefaultPayMethodReq;
import com.transsnet.palmpay.core.bean.req.DoubleOpenStaySendCouponReq;
import com.transsnet.palmpay.core.bean.req.PaymentMethodReq;
import com.transsnet.palmpay.core.bean.req.QueryManagementInfoReq;
import com.transsnet.palmpay.core.bean.req.SetDefaultPaymentBankCardReq;
import com.transsnet.palmpay.core.bean.req.ShareAccountDetailReq;
import com.transsnet.palmpay.core.bean.req.ViewBankCardReq;
import com.transsnet.palmpay.core.bean.rsp.CheckBankCardInfoRsp;
import com.transsnet.palmpay.core.bean.rsp.CheckModifyBankCardResp;
import com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp;
import com.transsnet.palmpay.core.bean.rsp.PaymentMethodV3Resp;
import com.transsnet.palmpay.core.bean.rsp.PaymentMethodV4Resp;
import com.transsnet.palmpay.core.bean.rsp.QueryManagementInfoResp;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderNoRsp;
import com.transsnet.palmpay.core.bean.rsp.ShareAccountDetailBean;
import com.transsnet.palmpay.core.bean.rsp.ViewBankCardResp;
import com.transsnet.palmpay.core.bean.rsp.WithdrawBankAccRsp;
import com.transsnet.palmpay.core.bean.rsp.WithdrawalMenuRsp;
import com.transsnet.palmpay.core.network.annotation.JsonName;
import df.d;
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
@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H'¢\u0006\u0004\b\u0007\u0010\u0005J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\n2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u0015\u0010\u0013J\u001c\u0010\u0018\u001a\u00020\u00172\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001aH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0002H'¢\u0006\u0004\b \u0010\u0005J\u0010\u0010!\u001a\u00020\u001fH§@¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00022\n\b\u0001\u0010$\u001a\u0004\u0018\u00010#H'¢\u0006\u0004\b&\u0010'J\u001c\u0010(\u001a\u00020%2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010#H§@¢\u0006\u0004\b(\u0010)J\"\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00102\n\b\u0001\u0010$\u001a\u0004\u0018\u00010*H§@¢\u0006\u0004\b,\u0010-J!\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00022\n\b\u0001\u0010/\u001a\u0004\u0018\u00010.H'¢\u0006\u0004\b1\u00102J\"\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00102\n\b\u0001\u00104\u001a\u0004\u0018\u000103H§@¢\u0006\u0004\b6\u00107J\u001c\u00108\u001a\u0002002\n\b\u0001\u0010/\u001a\u0004\u0018\u00010.H§@¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0002H'¢\u0006\u0004\b;\u0010\u0005J\u0010\u0010<\u001a\u00020:H§@¢\u0006\u0004\b<\u0010\"J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u0002H'¢\u0006\u0004\b>\u0010\u0005J!\u0010A\u001a\b\u0012\u0004\u0012\u00020%0\u00022\n\b\u0001\u0010@\u001a\u0004\u0018\u00010?H'¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\b\u0012\u0004\u0012\u00020%0\u00022\n\b\u0001\u0010C\u001a\u0004\u0018\u00010.H'¢\u0006\u0004\bD\u00102J(\u0010F\u001a\u00020%2\n\b\u0001\u0010C\u001a\u0004\u0018\u00010.2\n\b\u0001\u0010E\u001a\u0004\u0018\u00010.H§@¢\u0006\u0004\bF\u0010GJ!\u0010I\u001a\b\u0012\u0004\u0012\u00020%0\u00022\n\b\u0001\u0010H\u001a\u0004\u0018\u00010.H'¢\u0006\u0004\bI\u00102J!\u0010K\u001a\b\u0012\u0004\u0012\u00020%0\u00022\n\b\u0001\u0010@\u001a\u0004\u0018\u00010JH'¢\u0006\u0004\bK\u0010LJ\u001c\u0010M\u001a\u00020%2\n\b\u0001\u0010@\u001a\u0004\u0018\u00010JH§@¢\u0006\u0004\bM\u0010NJ\"\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u00102\n\b\u0001\u0010@\u001a\u0004\u0018\u00010OH§@¢\u0006\u0004\bQ\u0010RJ!\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u00022\n\b\u0001\u0010@\u001a\u0004\u0018\u00010SH'¢\u0006\u0004\bU\u0010VJ\u001c\u0010W\u001a\u00020T2\n\b\u0001\u0010@\u001a\u0004\u0018\u00010SH§@¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\u0003H§@¢\u0006\u0004\bY\u0010\"J\u001a\u0010Z\u001a\u00020\u001c2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\bZ\u0010[J\u0016\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\u0010H§@¢\u0006\u0004\b]\u0010\"J\u0010\u0010_\u001a\u00020^H§@¢\u0006\u0004\b_\u0010\"J'\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0\u00100\u00022\n\b\u0001\u0010a\u001a\u0004\u0018\u00010`H'¢\u0006\u0004\bc\u0010dJ\"\u0010e\u001a\b\u0012\u0004\u0012\u00020b0\u00102\n\b\u0001\u0010a\u001a\u0004\u0018\u00010`H§@¢\u0006\u0004\be\u0010fJ'\u0010h\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00100\u00022\b\b\u0001\u0010@\u001a\u00020gH'¢\u0006\u0004\bh\u0010iJ'\u0010l\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010k0\u00100\u00022\b\b\u0001\u0010@\u001a\u00020jH'¢\u0006\u0004\bl\u0010mJ\u001c\u0010p\u001a\u00020o2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010nH§@¢\u0006\u0004\bp\u0010qJ\u001c\u0010t\u001a\u00020s2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010rH§@¢\u0006\u0004\bt\u0010uJ\u001c\u0010x\u001a\u00020w2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010vH§@¢\u0006\u0004\bx\u0010y¨\u0006z"}, d2 = {"Lcom/transsnet/palmpay/core/network/api/AccountApiService;", "", "Ldf/d;", "Lcom/transsnet/palmpay/core/bean/BalanceAccountInfo;", "queryBalanceAccount", "()Ldf/d;", "Lcom/transsnet/palmpay/core/bean/PaymentMethodResp;", "queryPaymentMethod", "Lcom/transsnet/palmpay/core/bean/req/PaymentMethodReq;", "methodReq", "Lcom/transsnet/palmpay/core/bean/rsp/PaymentMethodV3Resp;", "queryPaymentMethodV3", "(Lcom/transsnet/palmpay/core/bean/req/PaymentMethodReq;)Ldf/d;", "queryPaymentMethodV3New", "(Lcom/transsnet/palmpay/core/bean/req/PaymentMethodReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/DefaultPayMethodReq;", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/core/bean/DefaultPayMethodResp;", "queryDefaultMethod", "(Lcom/transsnet/palmpay/core/bean/req/DefaultPayMethodReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/rsp/PaymentMethodV4Resp;", "queryPaymentMethodV4", "Lcom/transsnet/palmpay/core/bean/cashier/DefaultCalcOfPaymentMethodReq;", "Lcom/transsnet/palmpay/core/bean/cashier/DefaultCalcOfPaymentMethodResp;", "queryPaymentMethodByVM", "(Lcom/transsnet/palmpay/core/bean/cashier/DefaultCalcOfPaymentMethodReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/AccountFlowReq;", "accountFlowReq", "Lcom/transsnet/palmpay/core/bean/AccountFlowBean;", "queryBalanceAccFlow", "(Lcom/transsnet/palmpay/core/bean/req/AccountFlowReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/rsp/WithdrawBankAccRsp;", "queryWithdrawBankAccount", "queryWithdrawBankAccountByNew", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/CheckCardBindNumReq;", "body", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "checkCardBindNum", "(Lcom/transsnet/palmpay/core/bean/req/CheckCardBindNumReq;)Ldf/d;", "checkCardBindNumVM", "(Lcom/transsnet/palmpay/core/bean/req/CheckCardBindNumReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/CheckModifyBankCardReq;", "Lcom/transsnet/palmpay/core/bean/rsp/CheckModifyBankCardResp;", "checkModifyBankCard", "(Lcom/transsnet/palmpay/core/bean/req/CheckModifyBankCardReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "payId", "Lcom/transsnet/palmpay/core/bean/rsp/QueryOrderNoRsp;", "queryOrderNoByPayId", "(Ljava/lang/String;)Ldf/d;", "", "cardBusinessType", "Lcom/transsnet/palmpay/core/bean/BindBankCardFeeBean;", "queryBindBankCardFee", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryOrderNoByPayIdForMVVM", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/LinkBankCardResp;", "queryLinkBankCardList", "queryLinkBankCardListMvvm", "Lcom/transsnet/palmpay/core/bean/LinkBankAccountResp;", "queryLinkBankAccountList", "Lcom/transsnet/palmpay/core/bean/UnlinkBankCardReq;", "req", "unLinkBankCard", "(Lcom/transsnet/palmpay/core/bean/UnlinkBankCardReq;)Ldf/d;", "accountId", "deleteLinkBankCard", "orderId", "deleteLinkBankCardMvvm", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bankAccountNo", "deleteLinkBankAccount", "Lcom/transsnet/palmpay/core/bean/req/SetDefaultPaymentBankCardReq;", "setDefaultPaymentBankCard", "(Lcom/transsnet/palmpay/core/bean/req/SetDefaultPaymentBankCardReq;)Ldf/d;", "setDefaultPaymentBankCardMvvm", "(Lcom/transsnet/palmpay/core/bean/req/SetDefaultPaymentBankCardReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/ViewBankCardReq;", "Lcom/transsnet/palmpay/core/bean/rsp/ViewBankCardResp;", "canViewBankCardNo", "(Lcom/transsnet/palmpay/core/bean/req/ViewBankCardReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/CheckBankCardInfoReq;", "Lcom/transsnet/palmpay/core/bean/rsp/CheckBankCardInfoRsp;", "checkInputBankInfo", "(Lcom/transsnet/palmpay/core/bean/req/CheckBankCardInfoReq;)Ldf/d;", "checkInputBankInfoMvvm", "(Lcom/transsnet/palmpay/core/bean/req/CheckBankCardInfoReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryBalanceAccountByNew", "queryBalanceAccFlowNew", "(Lcom/transsnet/palmpay/core/bean/req/AccountFlowReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/rsp/GetAutoTransferConfigResp;", "getAutoTransferConfig", "Lcom/transsnet/palmpay/core/bean/rsp/WithdrawalMenuRsp;", "queryWithdrawalMenuConfig", "Lcom/transsnet/palmpay/core/bean/req/ShareAccountDetailReq;", "userTagReq", "Lcom/transsnet/palmpay/core/bean/rsp/ShareAccountDetailBean;", "queryShareAccountDetail", "(Lcom/transsnet/palmpay/core/bean/req/ShareAccountDetailReq;)Ldf/d;", "queryShareAccountDetailMvvm", "(Lcom/transsnet/palmpay/core/bean/req/ShareAccountDetailReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/DoubleOpenStaySendCouponReq;", "doubleOpenStaySendCoupon", "(Lcom/transsnet/palmpay/core/bean/req/DoubleOpenStaySendCouponReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/QueryManagementInfoReq;", "Lcom/transsnet/palmpay/core/bean/rsp/QueryManagementInfoResp;", "queryManagementInfo", "(Lcom/transsnet/palmpay/core/bean/req/QueryManagementInfoReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/cashier/DefaultCalcOfWithdrawalReq;", "Lcom/transsnet/palmpay/core/bean/cashier/DefaultCalcOfWithdrawalResp;", "defaultCalcOfWithdrawalVM", "(Lcom/transsnet/palmpay/core/bean/cashier/DefaultCalcOfWithdrawalReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/cashier/ManualCalcOfWithdrawalReq;", "Lcom/transsnet/palmpay/core/bean/cashier/ManualCalcOfWithdrawalResp;", "manualCalcOfWithdrawalVM", "(Lcom/transsnet/palmpay/core/bean/cashier/ManualCalcOfWithdrawalReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/payment/PayByOrderReq;", "Lcom/transsnet/palmpay/core/bean/payment/PayByOrderResp;", "withdrawalByOrderNo", "(Lcom/transsnet/palmpay/core/bean/payment/PayByOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AccountApiService {
    @Headers({"Black-Code: yes"})
    @POST("/api/transfer-product/bank/card/viewBankCardNo")
    @Nullable
    Object canViewBankCardNo(@Body @Nullable ViewBankCardReq viewBankCardReq, @NotNull Continuation<? super CommonBeanResult<ViewBankCardResp>> continuation);

    @POST("/api/cfront/account/checkCardBindNum")
    @NotNull
    d<CommonResult> checkCardBindNum(@Body @Nullable CheckCardBindNumReq body);

    @POST("/api/cfront/account/checkCardBindNum")
    @Nullable
    Object checkCardBindNumVM(@Body @Nullable CheckCardBindNumReq checkCardBindNumReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/account/bankCardCheck")
    @NotNull
    d<CheckBankCardInfoRsp> checkInputBankInfo(@Body @Nullable CheckBankCardInfoReq req);

    @POST("/api/cfront/account/bankCardCheck")
    @Nullable
    Object checkInputBankInfoMvvm(@Body @Nullable CheckBankCardInfoReq checkBankCardInfoReq, @NotNull Continuation<? super CheckBankCardInfoRsp> continuation);

    @POST("/api/transfer-product/bank/card/modifyBankCardCheck")
    @Nullable
    Object checkModifyBankCard(@Body @Nullable CheckModifyBankCardReq checkModifyBankCardReq, @NotNull Continuation<? super CommonBeanResult<CheckModifyBankCardResp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/cashier-center/receive/getCashierInfo")
    @Nullable
    Object defaultCalcOfWithdrawalVM(@Body @Nullable DefaultCalcOfWithdrawalReq defaultCalcOfWithdrawalReq, @NotNull Continuation<? super DefaultCalcOfWithdrawalResp> continuation);

    @POST("/api/cfront/account/delWithdrawBankAcc")
    @NotNull
    d<CommonResult> deleteLinkBankAccount(@Body @JsonName("bankAccountNo") @Nullable String bankAccountNo);

    @GET("/api/cfront/account/deleteLinkedAccount")
    @NotNull
    d<CommonResult> deleteLinkBankCard(@Nullable @Query("accountId") String accountId);

    @GET("/api/cfront/account/deleteLinkedAccount")
    @Nullable
    Object deleteLinkBankCardMvvm(@Nullable @Query("accountId") String str, @Nullable @Query("orderId") String str2, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/flexi-service/api/v1/staySendCoupon")
    @NotNull
    d<CommonBeanResult<String>> doubleOpenStaySendCoupon(@Body @NotNull DoubleOpenStaySendCouponReq req);

    @GET("/api/finance-saving-product/autoTransfer/get")
    @Nullable
    Object getAutoTransferConfig(@NotNull Continuation<? super CommonBeanResult<GetAutoTransferConfigResp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/cashier-center/receive/previewPayInfo")
    @Nullable
    Object manualCalcOfWithdrawalVM(@Body @Nullable ManualCalcOfWithdrawalReq manualCalcOfWithdrawalReq, @NotNull Continuation<? super ManualCalcOfWithdrawalResp> continuation);

    @POST("/api/cfront/account/balanceAccFlowPage")
    @NotNull
    d<AccountFlowBean> queryBalanceAccFlow(@Body @Nullable AccountFlowReq accountFlowReq);

    @POST("/api/cfront/account/balanceAccFlowPage")
    @Nullable
    Object queryBalanceAccFlowNew(@Body @NotNull AccountFlowReq accountFlowReq, @NotNull Continuation<? super AccountFlowBean> continuation);

    @POST("/api/cfront/account/queryBalanceAccount")
    @NotNull
    d<BalanceAccountInfo> queryBalanceAccount();

    @POST("/api/cfront/account/queryBalanceAccount")
    @Nullable
    Object queryBalanceAccountByNew(@NotNull Continuation<? super BalanceAccountInfo> continuation);

    @GET("/api/transfer-product/bank/card/bindBankCardFeeContent")
    @Nullable
    Object queryBindBankCardFee(@Nullable @Query("cardBusinessType") Long l5, @NotNull Continuation<? super CommonBeanResult<BindBankCardFeeBean>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/account/getDefaultPayMethodV2")
    @NotNull
    d<CommonBeanResult<DefaultPayMethodResp>> queryDefaultMethod(@Body @Nullable DefaultPayMethodReq methodReq);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/account/manage/queryWithdrawBankAccs")
    @NotNull
    d<LinkBankAccountResp> queryLinkBankAccountList();

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/account/manage/queryLinkAccounts")
    @NotNull
    d<LinkBankCardResp> queryLinkBankCardList();

    @Headers({"No-Token: yes"})
    @POST("/api/c-bff-product/account/manage/queryLinkAccountsV2")
    @Nullable
    Object queryLinkBankCardListMvvm(@NotNull Continuation<? super LinkBankCardResp> continuation);

    @POST("/api/flexi-service/v1/flexi-cash/queryManagementInfo")
    @NotNull
    d<CommonBeanResult<QueryManagementInfoResp>> queryManagementInfo(@Body @NotNull QueryManagementInfoReq req);

    @GET("/api/cfront/account/queryOrderNoByPayId")
    @NotNull
    d<QueryOrderNoRsp> queryOrderNoByPayId(@Nullable @Query("payId") String payId);

    @GET("/api/cfront/account/queryOrderNoByPayId")
    @Nullable
    Object queryOrderNoByPayIdForMVVM(@Nullable @Query("payId") String str, @NotNull Continuation<? super QueryOrderNoRsp> continuation);

    @POST("/api/cfront/account/queryPaymentMethod")
    @NotNull
    d<PaymentMethodResp> queryPaymentMethod();

    @Headers({"Black-Code: yes"})
    @POST("/api/cashier-center/payment/method/getCashierInfoV2")
    @Nullable
    Object queryPaymentMethodByVM(@Body @Nullable DefaultCalcOfPaymentMethodReq defaultCalcOfPaymentMethodReq, @NotNull Continuation<? super DefaultCalcOfPaymentMethodResp> continuation);

    @POST("/api/cfront/account/v3/queryPaymentMethod")
    @NotNull
    d<PaymentMethodV3Resp> queryPaymentMethodV3(@Body @Nullable PaymentMethodReq methodReq);

    @POST("/api/cfront/account/v3/queryPaymentMethod")
    @Nullable
    Object queryPaymentMethodV3New(@Body @Nullable PaymentMethodReq paymentMethodReq, @NotNull Continuation<? super PaymentMethodV3Resp> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/cashier/payment/method/getCashierInfo")
    @NotNull
    d<PaymentMethodV4Resp> queryPaymentMethodV4(@Body @Nullable DefaultPayMethodReq methodReq);

    @POST("/api/transfer-product/share/queryShareAccountDetail")
    @NotNull
    d<CommonBeanResult<ShareAccountDetailBean>> queryShareAccountDetail(@Body @Nullable ShareAccountDetailReq userTagReq);

    @POST("/api/transfer-product/share/queryShareAccountDetail")
    @Nullable
    Object queryShareAccountDetailMvvm(@Body @Nullable ShareAccountDetailReq shareAccountDetailReq, @NotNull Continuation<? super CommonBeanResult<ShareAccountDetailBean>> continuation);

    @POST("/api/cfront/account/queryWithdrawBankAcc")
    @NotNull
    d<WithdrawBankAccRsp> queryWithdrawBankAccount();

    @POST("/api/cfront/account/queryWithdrawBankAcc")
    @Nullable
    Object queryWithdrawBankAccountByNew(@NotNull Continuation<? super WithdrawBankAccRsp> continuation);

    @GET("/api/transfer-product/poster/queryWithdrawalMenuConfig")
    @Nullable
    Object queryWithdrawalMenuConfig(@NotNull Continuation<? super WithdrawalMenuRsp> continuation);

    @POST("/api/cfront/account/setDefaultPayFlag")
    @NotNull
    d<CommonResult> setDefaultPaymentBankCard(@Body @Nullable SetDefaultPaymentBankCardReq req);

    @POST("/api/cfront/account/setDefaultPayFlag")
    @Nullable
    Object setDefaultPaymentBankCardMvvm(@Body @Nullable SetDefaultPaymentBankCardReq setDefaultPaymentBankCardReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/account/unlinkedAccount")
    @NotNull
    d<CommonResult> unLinkBankCard(@Body @Nullable UnlinkBankCardReq req);

    @Headers({"Black-Code: yes", "Custom_Read_Timeout:120", "Use_Sign_V2: yes"})
    @POST("/api/cashier-center/receive/payByOrderNo")
    @Nullable
    Object withdrawalByOrderNo(@Body @Nullable PayByOrderReq payByOrderReq, @NotNull Continuation<? super PayByOrderResp> continuation);
}
