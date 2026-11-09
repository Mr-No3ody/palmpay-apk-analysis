package com.transsnet.palmpay.managemoney.api;

import com.transsnet.palmpay.account.bean.rsp.TrialCalculation;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.CreateCashBoxCouponOrderReq;
import com.transsnet.palmpay.core.bean.rsp.CreateCashBoxCouponOrderResp;
import com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp;
import com.transsnet.palmpay.core.bean.rsp.GetCashBoxNewcomerResp;
import com.transsnet.palmpay.main.export.bean.rsp.SavingMainBodyResultBean;
import com.transsnet.palmpay.managemoney.bean.CashBoxInterestDetail;
import com.transsnet.palmpay.managemoney.bean.CashBoxRemainingBalance;
import com.transsnet.palmpay.managemoney.bean.FixedSavingPlanRenewPopBean;
import com.transsnet.palmpay.managemoney.bean.req.CashBoxTrialCalculationReq;
import com.transsnet.palmpay.managemoney.bean.req.CreateCashBoxOrderReq;
import com.transsnet.palmpay.managemoney.bean.req.CreateOrderReq;
import com.transsnet.palmpay.managemoney.bean.req.CreateWithdrawOrderReq;
import com.transsnet.palmpay.managemoney.bean.req.EditStateReq;
import com.transsnet.palmpay.managemoney.bean.req.GetPageDataReq;
import com.transsnet.palmpay.managemoney.bean.req.GetTrialIncomeTaxReq;
import com.transsnet.palmpay.managemoney.bean.req.OpenCashBoxAccountReq;
import com.transsnet.palmpay.managemoney.bean.req.PreviewOrderReq;
import com.transsnet.palmpay.managemoney.bean.req.QueryCashBoxStatReq;
import com.transsnet.palmpay.managemoney.bean.req.QueryFundStatReq;
import com.transsnet.palmpay.managemoney.bean.req.SavePayoutOptionsReq;
import com.transsnet.palmpay.managemoney.bean.resp.AdvanceRepayResp;
import com.transsnet.palmpay.managemoney.bean.resp.CashCouponWriteOffResp;
import com.transsnet.palmpay.managemoney.bean.resp.CreateCashBoxOrderResp;
import com.transsnet.palmpay.managemoney.bean.resp.CreateOrderResp;
import com.transsnet.palmpay.managemoney.bean.resp.CreateWithdrawOrderResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxAccountInfoResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxBeforeOrderConfigResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxHomeResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxOrderDetailResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetFixedSavingsProductListResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetHistoryPlanListResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetIdentityResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetInterestRateConfigResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetInterestSwitchResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetIntroductionResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetNewMemberConfigResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetPayoutOptionsResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetPlanDetailResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetPlanListResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetRemindTurnOnAutoSaveResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetSavingHomeResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetStateInfoListResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetThresholdResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetTrialIncomeTaxResp;
import com.transsnet.palmpay.managemoney.bean.resp.OpenCashBoxAccountResp;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxStatResp;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import com.transsnet.palmpay.managemoney.bean.resp.WithdrawOrderDetailResp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0088\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010J&\u0010\u0013\u001a\u00020\u00142\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00192\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u001bH§@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u000e\u001a\u00020\u001fH§@¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u001e2\b\b\u0001\u0010\u000e\u001a\u00020\"H§@¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020%2\b\b\u0001\u0010\u000e\u001a\u00020&H§@¢\u0006\u0002\u0010'J&\u0010(\u001a\u00020)2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\u0017J\u000e\u0010*\u001a\u00020+H§@¢\u0006\u0002\u0010\u0004J$\u0010,\u001a\u00020-2\b\b\u0001\u0010\u0016\u001a\u00020.2\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u00100J\u000e\u00101\u001a\u000202H§@¢\u0006\u0002\u0010\u0004J\u001a\u00103\u001a\u00020-2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u000104H§@¢\u0006\u0002\u00105J\u000e\u00106\u001a\u000207H§@¢\u0006\u0002\u0010\u0004J\u0018\u00108\u001a\u0002092\b\b\u0001\u0010:\u001a\u00020.H§@¢\u0006\u0002\u0010;J \u0010<\u001a\b\u0012\u0004\u0012\u00020>0=2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010?H§@¢\u0006\u0002\u0010@J\u001a\u0010A\u001a\u00020B2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010CH§@¢\u0006\u0002\u0010DJ\u001a\u0010E\u001a\u00020F2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010CH§@¢\u0006\u0002\u0010DJ\u000e\u0010G\u001a\u00020HH§@¢\u0006\u0002\u0010\u0004J\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020K0JH§@¢\u0006\u0002\u0010\u0004J\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020M0JH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010N\u001a\u00020-2\b\b\u0001\u0010O\u001a\u00020.H§@¢\u0006\u0002\u0010;J\u001a\u0010P\u001a\u00020Q2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010RH§@¢\u0006\u0002\u0010SJ\u001a\u0010T\u001a\u00020Q2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010RH§@¢\u0006\u0002\u0010SJ$\u0010U\u001a\u00020V2\n\b\u0001\u0010W\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010:\u001a\u00020.H§@¢\u0006\u0002\u0010XJ$\u0010Y\u001a\u00020V2\n\b\u0001\u0010W\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010:\u001a\u00020.H§@¢\u0006\u0002\u0010XJ\u0014\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0JH§@¢\u0006\u0002\u0010\u0004J\u0014\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0JH§@¢\u0006\u0002\u0010\u0004J(\u0010^\u001a\b\u0012\u0004\u0012\u00020_0J2\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010/\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0017J,\u0010`\u001a\u00020-2\b\b\u0001\u0010a\u001a\u00020.2\b\b\u0001\u0010b\u001a\u00020\b2\b\b\u0003\u0010c\u001a\u00020\bH§@¢\u0006\u0002\u0010dJ\u000e\u0010e\u001a\u00020fH§@¢\u0006\u0002\u0010\u0004J\u001a\u0010g\u001a\u00020h2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010iH§@¢\u0006\u0002\u0010jJ \u0010k\u001a\b\u0012\u0004\u0012\u00020l0J2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010mH§@¢\u0006\u0002\u0010nJ\u001a\u0010o\u001a\u00020-2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010pH§@¢\u0006\u0002\u0010qJ\u000e\u0010r\u001a\u00020sH§@¢\u0006\u0002\u0010\u0004J\u000e\u0010t\u001a\u00020uH§@¢\u0006\u0002\u0010\u0004J\u000e\u0010v\u001a\u00020wH§@¢\u0006\u0002\u0010\u0004J \u0010x\u001a\b\u0012\u0004\u0012\u00020y0J2\n\b\u0001\u0010z\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\tJ\u0014\u0010{\u001a\b\u0012\u0004\u0012\u00020|0JH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010}\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u001a\u0010~\u001a\u00020\u007f2\t\b\u0001\u0010\u000e\u001a\u00030\u0080\u0001H§@¢\u0006\u0003\u0010\u0081\u0001J \u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010J2\b\b\u0001\u0010\u0015\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u001b\u0010\u0084\u0001\u001a\u00020F2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010CH§@¢\u0006\u0002\u0010DJ\u001b\u0010\u0085\u0001\u001a\u00020B2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010CH§@¢\u0006\u0002\u0010DJ\u001d\u0010\u0086\u0001\u001a\u00020F2\u000b\b\u0001\u0010\u000e\u001a\u0005\u0018\u00010\u0087\u0001H§@¢\u0006\u0003\u0010\u0088\u0001J\u001d\u0010\u0089\u0001\u001a\u00020B2\u000b\b\u0001\u0010\u000e\u001a\u0005\u0018\u00010\u0087\u0001H§@¢\u0006\u0003\u0010\u0088\u0001J$\u0010\u008a\u0001\u001a\u00020-2\b\b\u0001\u0010\u0015\u001a\u00020\b2\t\b\u0001\u0010\u008b\u0001\u001a\u00020.H§@¢\u0006\u0002\u0010XJ!\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010J2\t\b\u0001\u0010\u008e\u0001\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0016\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010JH§@¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u000b\b\u0001\u0010\u0093\u0001\u001a\u0004\u0018\u00010_H§@¢\u0006\u0003\u0010\u0094\u0001J\u001d\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u000b\b\u0001\u0010\u0097\u0001\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\t¨\u0006\u0098\u0001"}, d2 = {"Lcom/transsnet/palmpay/managemoney/api/ManageApiService;", "", "getIdentity", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetIdentityResp;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIntroduction", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetIntroductionResp;", "memberId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavingHomeInfo", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetSavingHomeResp;", "getPlanList", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetPlanListResp;", "req", "Lcom/transsnet/palmpay/managemoney/bean/req/GetPageDataReq;", "(Lcom/transsnet/palmpay/managemoney/bean/req/GetPageDataReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHistoryPlanList", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetHistoryPlanListResp;", "getPlanDetail", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetPlanDetailResp;", "orderId", "transType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBeforeOrder", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp;", "productId", "", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderPreview", "Lcom/transsnet/palmpay/managemoney/bean/resp/CreateOrderResp;", "Lcom/transsnet/palmpay/managemoney/bean/req/PreviewOrderReq;", "(Lcom/transsnet/palmpay/managemoney/bean/req/PreviewOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createOrder", "Lcom/transsnet/palmpay/managemoney/bean/req/CreateOrderReq;", "(Lcom/transsnet/palmpay/managemoney/bean/req/CreateOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrialIncomeTax", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetTrialIncomeTaxResp;", "Lcom/transsnet/palmpay/managemoney/bean/req/GetTrialIncomeTaxReq;", "(Lcom/transsnet/palmpay/managemoney/bean/req/GetTrialIncomeTaxReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderDetail", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetOrderDetailResp;", "getNewMemberConfig", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetNewMemberConfigResp;", "openAccount", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "", "subTransType", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStateInfoList", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetStateInfoListResp;", "editState", "Lcom/transsnet/palmpay/managemoney/bean/req/EditStateReq;", "(Lcom/transsnet/palmpay/managemoney/bean/req/EditStateReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCashBoxAccountInfoByBFF", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxAccountInfoResp;", "getCashBoxBeforeOrderConfig", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxBeforeOrderConfigResp;", "type", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cashBoxTrialCalculation", "Lcom/transsnet/palmpay/core/bean/CommonListResultV2;", "Lcom/transsnet/palmpay/account/bean/rsp/TrialCalculation;", "Lcom/transsnet/palmpay/managemoney/bean/req/CashBoxTrialCalculationReq;", "(Lcom/transsnet/palmpay/managemoney/bean/req/CashBoxTrialCalculationReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryCashBoxStat", "Lcom/transsnet/palmpay/managemoney/bean/resp/QueryCashBoxStatResp;", "Lcom/transsnet/palmpay/managemoney/bean/req/QueryCashBoxStatReq;", "(Lcom/transsnet/palmpay/managemoney/bean/req/QueryCashBoxStatReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryCashBoxTransactionList", "Lcom/transsnet/palmpay/managemoney/bean/resp/QueryCashBoxTransactionListResp;", "getFixedSavingsProductList", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetFixedSavingsProductListResp;", "getInterestRateConfig", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetInterestRateConfigResp;", "getInterestSwitch", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetInterestSwitchResp;", "updateInterestSwitch", "switchStatus", "createCashBoxOrder", "Lcom/transsnet/palmpay/managemoney/bean/resp/CreateCashBoxOrderResp;", "Lcom/transsnet/palmpay/managemoney/bean/req/CreateCashBoxOrderReq;", "(Lcom/transsnet/palmpay/managemoney/bean/req/CreateCashBoxOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createWithdrawCashBoxOrder", "getCashBoxOrderDetail", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxOrderDetailResp;", "orderNo", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCashBoxWithdrawalOrderDetail", "getCashBoxNewcomer", "Lcom/transsnet/palmpay/core/bean/rsp/GetCashBoxNewcomerResp;", "getAutoTransferConfig", "Lcom/transsnet/palmpay/core/bean/rsp/GetAutoTransferConfigResp;", "isPopUpForTradeResultPage", "", "updateAutoTransferConfig", "isAutoTransfer", "source", "closeReason", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCampaignThreshold", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetThresholdResp;", "openCashBoxAccount", "Lcom/transsnet/palmpay/managemoney/bean/resp/OpenCashBoxAccountResp;", "Lcom/transsnet/palmpay/managemoney/bean/req/OpenCashBoxAccountReq;", "(Lcom/transsnet/palmpay/managemoney/bean/req/OpenCashBoxAccountReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCashBoxCouponOrder", "Lcom/transsnet/palmpay/core/bean/rsp/CreateCashBoxCouponOrderResp;", "Lcom/transsnet/palmpay/core/bean/req/CreateCashBoxCouponOrderReq;", "(Lcom/transsnet/palmpay/core/bean/req/CreateCashBoxCouponOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePayoutOptions", "Lcom/transsnet/palmpay/managemoney/bean/req/SavePayoutOptionsReq;", "(Lcom/transsnet/palmpay/managemoney/bean/req/SavePayoutOptionsReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCashBoxHome", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxHomeResp;", "getPayoutOptions", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetPayoutOptionsResp;", "getRemindTurnOnAutoSave", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetRemindTurnOnAutoSaveResp;", "getInterestDetail", "Lcom/transsnet/palmpay/managemoney/bean/CashBoxInterestDetail;", "orgOrderNo", "getCashBoxRemainingBalance", "Lcom/transsnet/palmpay/managemoney/bean/CashBoxRemainingBalance;", "getWithdrawOrderPreview", "createWithdrawOrder", "Lcom/transsnet/palmpay/managemoney/bean/resp/CreateWithdrawOrderResp;", "Lcom/transsnet/palmpay/managemoney/bean/req/CreateWithdrawOrderReq;", "(Lcom/transsnet/palmpay/managemoney/bean/req/CreateWithdrawOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWithdrawOrderDetail", "Lcom/transsnet/palmpay/managemoney/bean/resp/WithdrawOrderDetailResp;", "queryTargetSavingList", "queryStat", "queryFundList", "Lcom/transsnet/palmpay/managemoney/bean/req/QueryFundStatReq;", "(Lcom/transsnet/palmpay/managemoney/bean/req/QueryFundStatReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryFundStat", "updateRenewDepositSwitch", "renewDepositSwitch", "getWealthMainbodyInfo", "Lcom/transsnet/palmpay/main/export/bean/rsp/SavingMainBodyResultBean;", "entry", "getRenewPopInfo", "Lcom/transsnet/palmpay/managemoney/bean/FixedSavingPlanRenewPopBean;", "cashCouponWriteOff", "Lcom/transsnet/palmpay/managemoney/bean/resp/CashCouponWriteOffResp;", "isOpen", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "advanceRepay", "Lcom/transsnet/palmpay/managemoney/bean/resp/AdvanceRepayResp;", "advanceNo", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ManageApiService {
    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes", "Black-Code: yes"})
    @POST("/api/finance-saving-product/fixed/advance/repay")
    Object advanceRepay(@Field("advanceNo") @Nullable String str, @NotNull Continuation<? super AdvanceRepayResp> continuation);

    @POST("/api/postpay-virtual-bank/v1/postpay/account/cashBoxTrialCalculation")
    @Nullable
    Object cashBoxTrialCalculation(@Body @Nullable CashBoxTrialCalculationReq cashBoxTrialCalculationReq, @NotNull Continuation<? super CommonListResultV2<TrialCalculation>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes", "Black-Code: yes"})
    @POST("/api/finance-saving-product/cash/saving/cashCouponWriteOff")
    Object cashCouponWriteOff(@Field("isOpen") @Nullable Boolean bool, @NotNull Continuation<? super CashCouponWriteOffResp> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/finance-saving-product/cash/saving/createCashCoupon")
    @Nullable
    Object createCashBoxCouponOrder(@Body @Nullable CreateCashBoxCouponOrderReq createCashBoxCouponOrderReq, @NotNull Continuation<? super CommonBeanResult<CreateCashBoxCouponOrderResp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/finance-saving-product/cash/saving/createCashOrder")
    @Nullable
    Object createCashBoxOrder(@Body @Nullable CreateCashBoxOrderReq createCashBoxOrderReq, @NotNull Continuation<? super CreateCashBoxOrderResp> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/finance-saving-product/fixed/saving/createOrder")
    @Nullable
    Object createOrder(@Body @NotNull CreateOrderReq createOrderReq, @NotNull Continuation<? super CreateOrderResp> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/finance-saving-product/cash/saving/createWithdrawalCashBoxOrder")
    @Nullable
    Object createWithdrawCashBoxOrder(@Body @Nullable CreateCashBoxOrderReq createCashBoxOrderReq, @NotNull Continuation<? super CreateCashBoxOrderResp> continuation);

    @POST("/api/finance-saving-product/fixed/saving/createWithdrawOrder")
    @Nullable
    Object createWithdrawOrder(@Body @NotNull CreateWithdrawOrderReq createWithdrawOrderReq, @NotNull Continuation<? super CreateWithdrawOrderResp> continuation);

    @POST("/api/flexi-service/v1/financialAccount/updateStateInfo")
    @Nullable
    Object editState(@Body @Nullable EditStateReq editStateReq, @NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/finance-saving-product/autoTransfer/get")
    @Nullable
    Object getAutoTransferConfig(@NotNull Continuation<? super CommonBeanResult<GetAutoTransferConfigResp>> continuation);

    @GET("/api/finance-saving-product/fixed/saving/getBeforeOrder")
    @Nullable
    Object getBeforeOrder(@Nullable @Query("productId") Long l5, @NotNull Continuation<? super GetBeforeOrderResp> continuation);

    @GET("/api/scene-activity-product/cashbox/getThreshold")
    @Nullable
    Object getCampaignThreshold(@NotNull Continuation<? super GetThresholdResp> continuation);

    @GET("/api/finance-bff-product/v1/cashBox/getCashBoxHome")
    @Nullable
    Object getCashBoxAccountInfoByBFF(@NotNull Continuation<? super GetCashBoxAccountInfoResp> continuation);

    @GET("/api/finance-saving-product/cash/saving/getCashBoxBeforeOrder")
    @Nullable
    Object getCashBoxBeforeOrderConfig(@Query("type") int i7, @NotNull Continuation<? super GetCashBoxBeforeOrderConfigResp> continuation);

    @GET("/api/finance-saving-product/cash/saving/getCashBoxHome")
    @Nullable
    Object getCashBoxHome(@NotNull Continuation<? super GetCashBoxHomeResp> continuation);

    @GET("/api/postpay-virtual-bank/v1/postpay/account/isCashBoxNewcomer")
    @Nullable
    Object getCashBoxNewcomer(@NotNull Continuation<? super CommonBeanResult<GetCashBoxNewcomerResp>> continuation);

    @GET("/api/finance-saving-product/cash/saving/cashBoxDepositOrderDetails")
    @Nullable
    Object getCashBoxOrderDetail(@Nullable @Query("orderNo") String str, @Query("type") int i7, @NotNull Continuation<? super GetCashBoxOrderDetailResp> continuation);

    @GET("/api/finance-saving-product/cash/saving/cashBoxRemainingBalance")
    @Nullable
    Object getCashBoxRemainingBalance(@NotNull Continuation<? super CommonBeanResult<CashBoxRemainingBalance>> continuation);

    @GET("/api/finance-saving-product/cash/saving/cashBoxWithdrawalOrderDetails")
    @Nullable
    Object getCashBoxWithdrawalOrderDetail(@Nullable @Query("orderNo") String str, @Query("type") int i7, @NotNull Continuation<? super GetCashBoxOrderDetailResp> continuation);

    @GET("/api/finance-saving-product/fixed/saving/fixedProducts")
    @Nullable
    Object getFixedSavingsProductList(@NotNull Continuation<? super GetFixedSavingsProductListResp> continuation);

    @POST("/api/finance-saving-product/fixed/saving/getHistoryPlanList")
    @Nullable
    Object getHistoryPlanList(@Body @NotNull GetPageDataReq getPageDataReq, @NotNull Continuation<? super GetHistoryPlanListResp> continuation);

    @GET("/api/finance-saving-product/fixed/saving/getIdentity")
    @Nullable
    Object getIdentity(@NotNull Continuation<? super GetIdentityResp> continuation);

    @GET("/api/finance-account-core/v1/cashBoxTransactionHistory/detail")
    @Nullable
    Object getInterestDetail(@Nullable @Query("orgOrderNo") String str, @NotNull Continuation<? super CommonBeanResult<CashBoxInterestDetail>> continuation);

    @GET("/api/finance-saving-product/cash/saving/getAllRateConfig")
    @Nullable
    Object getInterestRateConfig(@NotNull Continuation<? super CommonBeanResult<GetInterestRateConfigResp>> continuation);

    @GET("/api/finance-saving-product/v1/interestSwitch/config/get")
    @Nullable
    Object getInterestSwitch(@NotNull Continuation<? super CommonBeanResult<GetInterestSwitchResp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/finance-saving-product/fixed/saving/getIntroduction")
    @Nullable
    Object getIntroduction(@Nullable @Query("memberId") String str, @NotNull Continuation<? super GetIntroductionResp> continuation);

    @GET("/api/finance-saving-product/v3/cash/saving/newMemberConfig")
    @Nullable
    Object getNewMemberConfig(@NotNull Continuation<? super GetNewMemberConfigResp> continuation);

    @GET("/api/finance-saving-product/fixed/saving/getOrderDetail")
    @Nullable
    Object getOrderDetail(@Nullable @Query("orderId") String str, @Nullable @Query("transType") String str2, @NotNull Continuation<? super GetOrderDetailResp> continuation);

    @POST("/api/finance-saving-product/fixed/saving/getOrderPreview")
    @Nullable
    Object getOrderPreview(@Body @NotNull PreviewOrderReq previewOrderReq, @NotNull Continuation<? super CreateOrderResp> continuation);

    @GET("/api/finance-saving-product/fixed/saving/getPayoutOption")
    @Nullable
    Object getPayoutOptions(@NotNull Continuation<? super GetPayoutOptionsResp> continuation);

    @GET("/api/finance-saving-product/fixed/saving/getPlanDetail")
    @Nullable
    Object getPlanDetail(@Nullable @Query("orderId") String str, @Nullable @Query("transType") String str2, @NotNull Continuation<? super GetPlanDetailResp> continuation);

    @POST("/api/finance-saving-product/fixed/saving/getPlanList")
    @Nullable
    Object getPlanList(@Body @NotNull GetPageDataReq getPageDataReq, @NotNull Continuation<? super GetPlanListResp> continuation);

    @GET("/api/finance-saving-product/autoTransfer/remind")
    @Nullable
    Object getRemindTurnOnAutoSave(@NotNull Continuation<? super GetRemindTurnOnAutoSaveResp> continuation);

    @GET("/api/finance-saving-product/fixed/saving/getRenewPopInfo")
    @Nullable
    Object getRenewPopInfo(@NotNull Continuation<? super CommonBeanResult<FixedSavingPlanRenewPopBean>> continuation);

    @GET("/api/finance-saving-product/fixed/saving/getSavingHome")
    @Nullable
    Object getSavingHomeInfo(@NotNull Continuation<? super GetSavingHomeResp> continuation);

    @GET("/api/finance-saving-product/cash/saving/stateInfo")
    @Nullable
    Object getStateInfoList(@NotNull Continuation<? super GetStateInfoListResp> continuation);

    @POST("/api/finance-saving-product/fixed/saving/getTrialIncomeTax")
    @Nullable
    Object getTrialIncomeTax(@Body @NotNull GetTrialIncomeTaxReq getTrialIncomeTaxReq, @NotNull Continuation<? super GetTrialIncomeTaxResp> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/finance-bff-product/v1/wealthCommon/getWealthMainbodyInfo")
    Object getWealthMainbodyInfo(@Field("entry") @NotNull String str, @NotNull Continuation<? super CommonBeanResult<SavingMainBodyResultBean>> continuation);

    @GET("/api/finance-saving-product/fixed/saving/getWithdrawOrderDetail")
    @Nullable
    Object getWithdrawOrderDetail(@NotNull @Query("cashOrderId") String str, @NotNull Continuation<? super CommonBeanResult<WithdrawOrderDetailResp>> continuation);

    @GET("/api/finance-saving-product/v2/fixed/saving/getWithdrawOrderPreview")
    @Nullable
    Object getWithdrawOrderPreview(@NotNull @Query("orderId") String str, @NotNull Continuation<? super GetPlanDetailResp> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/finance-saving-product/autoTransfer/isPopUpForTradeResultPage")
    Object isPopUpForTradeResultPage(@Field("transType") @NotNull String str, @Field("subTransType") @NotNull String str2, @NotNull Continuation<? super CommonBeanResult<Boolean>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/finance-saving-product/cash/saving/openAccount")
    Object openAccount(@Field("isAutoTransfer") int i7, @Field("source") @Nullable String str, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/scene-activity-product/cashbox/open")
    @Nullable
    Object openCashBoxAccount(@Body @Nullable OpenCashBoxAccountReq openCashBoxAccountReq, @NotNull Continuation<? super OpenCashBoxAccountResp> continuation);

    @POST("/api/postpay-virtual-bank/v1/cashBoxTransactionHistory/queryStat")
    @Nullable
    Object queryCashBoxStat(@Body @Nullable QueryCashBoxStatReq queryCashBoxStatReq, @NotNull Continuation<? super QueryCashBoxStatResp> continuation);

    @POST("/api/postpay-virtual-bank/v1/cashBoxTransactionHistory/queryList")
    @Nullable
    Object queryCashBoxTransactionList(@Body @Nullable QueryCashBoxStatReq queryCashBoxStatReq, @NotNull Continuation<? super QueryCashBoxTransactionListResp> continuation);

    @POST("/api/finance-account-core/v1/fund/account/queryList")
    @Nullable
    Object queryFundList(@Body @Nullable QueryFundStatReq queryFundStatReq, @NotNull Continuation<? super QueryCashBoxTransactionListResp> continuation);

    @POST("/api/finance-account-core/v1/fund/account/queryStat")
    @Nullable
    Object queryFundStat(@Body @Nullable QueryFundStatReq queryFundStatReq, @NotNull Continuation<? super QueryCashBoxStatResp> continuation);

    @POST("/api/finance-account-core/v1/targetSaving/account/queryStat")
    @Nullable
    Object queryStat(@Body @Nullable QueryCashBoxStatReq queryCashBoxStatReq, @NotNull Continuation<? super QueryCashBoxStatResp> continuation);

    @POST("/api/finance-account-core/v1/targetSaving/account/queryList")
    @Nullable
    Object queryTargetSavingList(@Body @Nullable QueryCashBoxStatReq queryCashBoxStatReq, @NotNull Continuation<? super QueryCashBoxTransactionListResp> continuation);

    @POST("/api/finance-saving-product/fixed/saving/savePayoutOptions")
    @Nullable
    Object savePayoutOptions(@Body @Nullable SavePayoutOptionsReq savePayoutOptionsReq, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/finance-saving-product/autoTransfer/update")
    Object updateAutoTransferConfig(@Field("isAutoTransfer") int i7, @Field("source") @NotNull String str, @Field("closeReason") @NotNull String str2, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes"})
    @POST("/api/finance-saving-product/v1/interestSwitch/config/update")
    Object updateInterestSwitch(@Field("switchStatus") int i7, @NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/finance-saving-product/fixed/saving/updateRenewDepositSwitch")
    @Nullable
    Object updateRenewDepositSwitch(@NotNull @Query("orderId") String str, @Query("renewDepositSwitch") int i7, @NotNull Continuation<? super CommonResult> continuation);
}
