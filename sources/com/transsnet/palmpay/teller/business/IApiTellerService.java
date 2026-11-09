package com.transsnet.palmpay.teller.business;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.palmpay.airtime.bean.rsp.AutoRenewTaskBean;
import com.transsnet.palmpay.airtime.bean.rsp.AvailableOrderParamsInfo;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.betting.bean.BettingBillerListRsp;
import com.transsnet.palmpay.betting.bean.BettingQuickILotHomeBean;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.MobileWalletResp;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.bean.req.CheckAccountStatusReq;
import com.transsnet.palmpay.core.bean.req.CheckPaymentItemReq;
import com.transsnet.palmpay.core.bean.req.DeleteFamilyAccontReq;
import com.transsnet.palmpay.core.bean.rsp.QueryMobileWalletTypeByPhoneRsp;
import com.transsnet.palmpay.teller.bean.AddAutoRenewTaskReq;
import com.transsnet.palmpay.teller.bean.AddFavoriteReq;
import com.transsnet.palmpay.teller.bean.AgentOrderDetailRsp;
import com.transsnet.palmpay.teller.bean.BettingAcmountItemData;
import com.transsnet.palmpay.teller.bean.BettingWithdrawRecentUserIDReq;
import com.transsnet.palmpay.teller.bean.BettingWithdrawRedeemCodeReq;
import com.transsnet.palmpay.teller.bean.BettingWithdrawRedeemPayReq;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.bean.BillerListRsp;
import com.transsnet.palmpay.teller.bean.CheckBettingValidationReq;
import com.transsnet.palmpay.teller.bean.CheckCustomerIdReq;
import com.transsnet.palmpay.teller.bean.CheckCustomerIdRsp;
import com.transsnet.palmpay.teller.bean.CheckTvItemRsp;
import com.transsnet.palmpay.teller.bean.CommonBillerTipsBean;
import com.transsnet.palmpay.teller.bean.CreateBettingAutoRenewalReq;
import com.transsnet.palmpay.teller.bean.CreateBettingOrderReq;
import com.transsnet.palmpay.teller.bean.CreateQucikBettingOrderReq;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp;
import com.transsnet.palmpay.teller.bean.DataBundleExtraItemInfo;
import com.transsnet.palmpay.teller.bean.DataBundleHighlyRecommendBean;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.bean.DelFavoriteReq;
import com.transsnet.palmpay.teller.bean.ElectricitytemTipsBean;
import com.transsnet.palmpay.teller.bean.HistoryOrderReq;
import com.transsnet.palmpay.teller.bean.OrderReminderSubscribeReq;
import com.transsnet.palmpay.teller.bean.PaymentItemListReq;
import com.transsnet.palmpay.teller.bean.PaymentItemListRsp;
import com.transsnet.palmpay.teller.bean.QtQuotaCheckReq;
import com.transsnet.palmpay.teller.bean.QueryLastBillerReq;
import com.transsnet.palmpay.teller.bean.QueryLastBillerRsp;
import com.transsnet.palmpay.teller.bean.QueryRecommendReq;
import com.transsnet.palmpay.teller.bean.QueryRecommendRsp;
import com.transsnet.palmpay.teller.bean.TransactionLinkReq;
import com.transsnet.palmpay.teller.bean.TvItemTipsResp;
import com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp;
import com.transsnet.palmpay.teller.bean.WAECOperatorResp;
import com.transsnet.palmpay.teller.bean.resp.BannerWithCouponBean;
import com.transsnet.palmpay.teller.bean.resp.BettingAutoRenewalRecommendRsp;
import com.transsnet.palmpay.teller.bean.resp.BettingAutoRenewalTaskRsp;
import com.transsnet.palmpay.teller.bean.resp.BettingHomePageData;
import com.transsnet.palmpay.teller.bean.resp.BettingInfoConfigData;
import com.transsnet.palmpay.teller.bean.resp.BettingRaceScheduleData;
import com.transsnet.palmpay.teller.bean.resp.BettingWithdrawRecentUserIDResp;
import com.transsnet.palmpay.teller.bean.resp.BettingWithdrawRedeemCodeData;
import com.transsnet.palmpay.teller.bean.resp.BillCommonConfigBean;
import com.transsnet.palmpay.teller.bean.resp.BillOrderInfoConfirmData;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponRetentionBean;
import com.transsnet.palmpay.teller.bean.resp.BillerHistoryItemBean;
import com.transsnet.palmpay.teller.bean.resp.CheckBettingValidationResp;
import com.transsnet.palmpay.teller.bean.resp.CouponWithPointBean;
import com.transsnet.palmpay.teller.bean.resp.CreateBettingOrderData;
import com.transsnet.palmpay.teller.bean.resp.DataBundleHomeLinkBean;
import com.transsnet.palmpay.teller.bean.resp.QueryAccountHistoryResp;
import com.transsnet.palmpay.teller.bean.resp.QueryCustomerIdIsExitResp;
import com.transsnet.palmpay.teller.bean.resp.QueryElectricCustomerIdIsExitBean;
import com.transsnet.palmpay.teller.bean.resp.QueryLastBillData;
import df.d;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0094\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\b\u001d\u0010\u001cJ\"\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001f\u0010\u001cJ\"\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b!\u0010\u001cJ\u001c\u0010$\u001a\u00020#2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\b$\u0010\u001cJ<\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00042\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\b(\u0010)J<\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00042\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\b+\u0010)J\u0010\u0010-\u001a\u00020,H§@¢\u0006\u0004\b-\u0010\u0016J\u001a\u00100\u001a\u00020/2\b\b\u0001\u0010.\u001a\u00020\u0017H§@¢\u0006\u0004\b0\u0010\u001cJ\u001a\u00103\u001a\u0002022\b\b\u0001\u00101\u001a\u00020\u0017H§@¢\u0006\u0004\b3\u0010\u001cJ \u00105\u001a\b\u0012\u0004\u0012\u0002040\u00042\b\b\u0001\u0010.\u001a\u00020\u0017H§@¢\u0006\u0004\b5\u0010\u001cJ*\u00108\u001a\b\u0012\u0004\u0012\u0002040\u00042\b\b\u0001\u0010.\u001a\u00020\u00172\b\b\u0001\u00107\u001a\u000206H§@¢\u0006\u0004\b8\u00109J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0004H§@¢\u0006\u0004\b;\u0010\u0016J\u001a\u0010=\u001a\u00020<2\b\b\u0001\u00101\u001a\u00020\u0017H§@¢\u0006\u0004\b=\u0010\u001cJ \u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00192\b\b\u0001\u00101\u001a\u00020\u0017H§@¢\u0006\u0004\b?\u0010\u001cJ\u001c\u0010B\u001a\u00020A2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010@H§@¢\u0006\u0004\bB\u0010CJ\u001c\u0010E\u001a\u00020D2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010@H§@¢\u0006\u0004\bE\u0010CJ\u001c\u0010G\u001a\u00020\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010FH§@¢\u0006\u0004\bG\u0010HJ\u001c\u0010K\u001a\u00020J2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010IH§@¢\u0006\u0004\bK\u0010LJ\u001c\u0010N\u001a\u00020\u00142\n\b\u0001\u0010M\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\bN\u0010\u001cJ\u001c\u0010O\u001a\u00020\u00142\n\b\u0001\u0010M\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\bO\u0010\u001cJ\u001c\u0010R\u001a\u00020Q2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010PH§@¢\u0006\u0004\bR\u0010SJ(\u0010T\u001a\u00020Q2\n\b\u0001\u0010M\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\bT\u0010UJ\u001c\u0010V\u001a\u00020Q2\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\bV\u0010\u001cJ\u001c\u0010Z\u001a\u00020Y2\n\b\u0001\u0010X\u001a\u0004\u0018\u00010WH§@¢\u0006\u0004\bZ\u0010[J\u001c\u0010^\u001a\u00020]2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\\H§@¢\u0006\u0004\b^\u0010_J\u001c\u0010`\u001a\u00020]2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\\H§@¢\u0006\u0004\b`\u0010_J\u001c\u0010a\u001a\u00020]2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\\H§@¢\u0006\u0004\ba\u0010_J0\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00042\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\bc\u0010UJH\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010f0\u00042\n\b\u0001\u0010d\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\bg\u0010hJ\"\u0010l\u001a\b\u0012\u0004\u0012\u00020k0j2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010iH§@¢\u0006\u0004\bl\u0010mJ$\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010n0\u00042\n\b\u0001\u0010X\u001a\u0004\u0018\u00010WH§@¢\u0006\u0004\bo\u0010[J\u0018\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010p0\u0004H§@¢\u0006\u0004\bq\u0010\u0016J\u0018\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010r0\u0004H§@¢\u0006\u0004\bs\u0010\u0016J\u0018\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010t0\u0004H§@¢\u0006\u0004\bu\u0010\u0016J\u001c\u0010v\u001a\u00020Q2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010PH§@¢\u0006\u0004\bv\u0010SJ$\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010w0\u00042\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\bx\u0010\u001cJ.\u0010z\u001a\b\u0012\u0004\u0012\u00020y0\u00192\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\bz\u0010UJ \u0010|\u001a\b\u0012\u0004\u0012\u00020{0\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b|\u0010\u001cJ\"\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010}0\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b~\u0010\u001cJ%\u0010\u0081\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010\u00042\b\b\u0001\u0010\u007f\u001a\u00020\u0017H§@¢\u0006\u0005\b\u0081\u0001\u0010\u001cJ3\u0010\u0084\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00042\u0016\b\u0001\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0082\u0001H§@¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J1\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0016\b\u0001\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0082\u0001H§@¢\u0006\u0006\b\u0086\u0001\u0010\u0085\u0001J'\u0010\u0089\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0088\u00010\u00042\t\b\u0001\u0010\u0003\u001a\u00030\u0087\u0001H§@¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J'\u0010\u008c\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0088\u00010\u00042\t\b\u0001\u0010\u0003\u001a\u00030\u008b\u0001H§@¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J!\u0010\u0090\u0001\u001a\u00020\n2\f\b\u0001\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001H§@¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J!\u0010\u0092\u0001\u001a\u00020\n2\f\b\u0001\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001H§@¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u0013\u0010\u0094\u0001\u001a\u00030\u0093\u0001H§@¢\u0006\u0005\b\u0094\u0001\u0010\u0016J!\u0010\u0096\u0001\u001a\u00020\n2\f\b\u0001\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0095\u0001H§@¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J!\u0010\u0098\u0001\u001a\u00020\n2\f\b\u0001\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001H§@¢\u0006\u0006\b\u0098\u0001\u0010\u0091\u0001J\u001e\u0010\u009b\u0001\u001a\u00030\u009a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\u0017H§@¢\u0006\u0005\b\u009b\u0001\u0010\u001cJ(\u0010\u009d\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u009c\u00010\u00042\u000b\b\u0001\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0005\b\u009d\u0001\u0010\u001cJ(\u0010\u009e\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u009c\u00010\u00042\u000b\b\u0001\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0005\b\u009e\u0001\u0010\u001cJ5\u0010 \u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u009c\u00010\u00042\u000b\b\u0001\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00172\u000b\b\u0001\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0005\b \u0001\u0010UJ\u001f\u0010£\u0001\u001a\u00030¢\u00012\t\b\u0001\u0010\u0003\u001a\u00030¡\u0001H§@¢\u0006\u0006\b£\u0001\u0010¤\u0001J'\u0010¦\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010¥\u00010\u00042\t\b\u0001\u0010\u0003\u001a\u00030¡\u0001H§@¢\u0006\u0006\b¦\u0001\u0010¤\u0001J(\u0010§\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u009c\u00010\u00042\u000b\b\u0001\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0005\b§\u0001\u0010\u001cJ\u0013\u0010©\u0001\u001a\u00030¨\u0001H§@¢\u0006\u0005\b©\u0001\u0010\u0016J&\u0010¬\u0001\u001a\t\u0012\u0005\u0012\u00030«\u00010\u00192\u000b\b\u0001\u0010ª\u0001\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0005\b¬\u0001\u0010\u001cJ)\u0010¯\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010®\u00010\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u00ad\u0001H§@¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001e\u0010±\u0001\u001a\u00020]2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\\H§@¢\u0006\u0005\b±\u0001\u0010_J \u0010³\u0001\u001a\u00020\n2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010²\u0001H§@¢\u0006\u0006\b³\u0001\u0010´\u0001J'\u0010·\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010\u00042\t\b\u0001\u0010\u0003\u001a\u00030µ\u0001H§@¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001d\u0010\u0012\u001a\u00030º\u00012\t\b\u0001\u0010\u0003\u001a\u00030¹\u0001H§@¢\u0006\u0005\b\u0012\u0010»\u0001J'\u0010¼\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0088\u00010\u00042\t\b\u0001\u0010\u0003\u001a\u00030\u0087\u0001H§@¢\u0006\u0006\b¼\u0001\u0010\u008a\u0001J>\u0010À\u0001\u001a\"\u0012\u001e\u0012\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010¾\u0001j\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u0001`¿\u00010\u00042\t\b\u0001\u0010\u0003\u001a\u00030½\u0001H§@¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J%\u0010Ã\u0001\u001a\t\u0012\u0005\u0012\u00030Â\u00010\u00192\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0005\bÃ\u0001\u0010\u001cJ%\u0010Æ\u0001\u001a\t\u0012\u0005\u0012\u00030Å\u00010\u00042\t\b\u0001\u0010\u0003\u001a\u00030Ä\u0001H§@¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u0012\u0010È\u0001\u001a\u00020\nH§@¢\u0006\u0005\bÈ\u0001\u0010\u0016J(\u0010Ê\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010É\u00010\u00042\u000b\b\u0001\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0005\bÊ\u0001\u0010\u001cJ'\u0010Í\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Ì\u00010\u00042\t\b\u0001\u0010\u0003\u001a\u00030Ë\u0001H§@¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u0012\u0010Ï\u0001\u001a\u00020\nH§@¢\u0006\u0005\bÏ\u0001\u0010\u0016J'\u0010Ñ\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00042\u000b\b\u0001\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0005\bÑ\u0001\u0010\u001cJ\u001b\u0010Ó\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Ò\u00010\u0004H§@¢\u0006\u0005\bÓ\u0001\u0010\u0016¨\u0006Ô\u0001"}, d2 = {"Lcom/transsnet/palmpay/teller/business/IApiTellerService;", "", "Lcom/transsnet/palmpay/teller/bean/OrderReminderSubscribeReq;", "req", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "", "subscribeLowData", "(Lcom/transsnet/palmpay/teller/bean/OrderReminderSubscribeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/teller/bean/AddFavoriteReq;", "Ldf/d;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "addFavorite", "(Lcom/transsnet/palmpay/teller/bean/AddFavoriteReq;)Ldf/d;", "Lcom/transsnet/palmpay/teller/bean/DelFavoriteReq;", "delFavorite", "(Lcom/transsnet/palmpay/teller/bean/DelFavoriteReq;)Ldf/d;", "Lcom/transsnet/palmpay/teller/bean/BettingWithdrawRedeemPayReq;", "Lcom/transsnet/palmpay/core/bean/payment/CheckPayResp;", "bettingWithdrawRedeemCodePay", "(Lcom/transsnet/palmpay/teller/bean/BettingWithdrawRedeemPayReq;)Ldf/d;", "Lcom/transsnet/palmpay/teller/bean/BillerListRsp;", "getAllBillerList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "transType", "Lcom/transsnet/palmpay/core/bean/CommonListResultV2;", "Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponItemBean;", "queryCoupon", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryCouponV2", "Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponRetentionBean;", "queryCouponRetention", "Lcom/transsnet/palmpay/teller/bean/resp/BillCommonConfigBean;", "queryBillCommonConfig", "mobileNo", "Lcom/transsnet/palmpay/core/bean/rsp/QueryMobileWalletTypeByPhoneRsp;", "queryMobileWalletTypeByPhoneByNew", "phone", "couponCode", "Lcom/transsnet/palmpay/airtime/bean/rsp/AvailableOrderParamsInfo;", "queryAvailableCoupon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "queryOrderParamsWithCode", "Lcom/transsnet/palmpay/core/bean/MobileWalletResp;", "queryTelecomOperatorListByNew", "billerName", "Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp;", "queryCategoryByOperatorCode", "billerId", "Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp;", "queryTvCategoryByOperatorCode", "Lcom/transsnet/palmpay/teller/bean/DataBundleExtraItemInfo;", "queryTipsByOperatorCode", "", "bundleCategoryId", "queryMoreTipsByOperatorCode", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/teller/bean/DataBundleHighlyRecommendBean;", "queryDataBundleHighlyRecommendItems", "Lcom/transsnet/palmpay/teller/bean/TvItemTipsResp;", "queryTvTipsByOperatorCode", "Lcom/transsnet/palmpay/teller/bean/ElectricitytemTipsBean;", "queryElecTipsByOperatorCode", "Lcom/transsnet/palmpay/teller/bean/CheckCustomerIdReq;", "Lcom/transsnet/palmpay/teller/bean/CheckCustomerIdRsp;", "checkTvValidation", "(Lcom/transsnet/palmpay/teller/bean/CheckCustomerIdReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/teller/bean/CheckTvItemRsp;", "checkTvBuyAgain", "Lcom/transsnet/palmpay/core/bean/req/CheckPaymentItemReq;", "checkPaymentItemByNew", "(Lcom/transsnet/palmpay/core/bean/req/CheckPaymentItemReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/teller/bean/QueryRecommendReq;", "Lcom/transsnet/palmpay/teller/bean/QueryRecommendRsp;", "queryRecommendPaymentItemByNew", "(Lcom/transsnet/palmpay/teller/bean/QueryRecommendReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "categoryId", "getBillerListByNew", "getBillerListByCategoryId", "Lcom/transsnet/palmpay/teller/bean/PaymentItemListReq;", "Lcom/transsnet/palmpay/teller/bean/PaymentItemListRsp;", "getPaymentItemListByNew", "(Lcom/transsnet/palmpay/teller/bean/PaymentItemListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentItemListByBillerId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getElectricityItemListByBillerId", "Lcom/transsnet/palmpay/teller/bean/QueryLastBillerReq;", "queryLastBillerReq", "Lcom/transsnet/palmpay/teller/bean/QueryLastBillerRsp;", "queryLastBillerByNew", "(Lcom/transsnet/palmpay/teller/bean/QueryLastBillerReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/teller/bean/CreateTellerOrderReq;", "Lcom/transsnet/palmpay/teller/bean/CreateTellerOrderRsp;", "createOtherBillOrder", "(Lcom/transsnet/palmpay/teller/bean/CreateTellerOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDataBundleOrder", "createFlashSaleDataBundleOrder", "itemId", "queryCustomerIdByNew", "customerId", "amount", "Lcom/transsnet/palmpay/teller/bean/resp/BillOrderInfoConfirmData;", "queryOrderInfoConfirm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/teller/bean/HistoryOrderReq;", "Lcom/transsnet/palmpay/core/bean/CommonListResult;", "Lcom/transsnet/palmpay/teller/bean/resp/BillerHistoryItemBean;", "queryBillerHistory", "(Lcom/transsnet/palmpay/teller/bean/HistoryOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/teller/bean/resp/QueryLastBillData;", "queryRecentItem", "Lcom/transsnet/palmpay/teller/bean/resp/BettingHomePageData;", "queryBettingHomeInfo", "Lcom/transsnet/palmpay/betting/bean/BettingBillerListRsp;", "getBettingBillerList", "Lcom/transsnet/palmpay/teller/bean/resp/DataBundleHomeLinkBean;", "getDataBundleHomeLink", "getBettingPaymentItemList", "Lcom/transsnet/palmpay/teller/bean/resp/BettingInfoConfigData;", "queryBettingConfig", "Lcom/transsnet/palmpay/teller/bean/BettingAcmountItemData;", "queryBettingAmountItemNew", "Lcom/transsnet/palmpay/teller/bean/resp/BannerWithCouponBean;", "queryBannerWithCoupon", "Lcom/transsnet/palmpay/teller/bean/resp/CouponWithPointBean;", "queryCouponAndPointInfo", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "Lcom/transsnet/palmpay/teller/bean/resp/BettingRaceScheduleData;", "bettingRaceSchedule", "", "params", "claimCoupon", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "claimCouponPackage", "Lcom/transsnet/palmpay/teller/bean/CreateBettingOrderReq;", "Lcom/transsnet/palmpay/teller/bean/resp/CreateBettingOrderData;", "createBettingOrder", "(Lcom/transsnet/palmpay/teller/bean/CreateBettingOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/teller/bean/CreateQucikBettingOrderReq;", "createQuickBettingOrder", "(Lcom/transsnet/palmpay/teller/bean/CreateQucikBettingOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/AddFamilyAccontReq;", "body", "addFamilyAccount", "(Lcom/transsnet/palmpay/core/bean/req/AddFamilyAccontReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addFamilyAccountByHome", "Lcom/transsnet/palmpay/teller/bean/resp/QueryAccountHistoryResp;", "queryAccountHistory", "Lcom/transsnet/palmpay/core/bean/req/DeleteFamilyAccontReq;", "deleteFamilyAccount", "(Lcom/transsnet/palmpay/core/bean/req/DeleteFamilyAccontReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFamilyAccount", "orderNo", "Lcom/transsnet/palmpay/teller/bean/AgentOrderDetailRsp;", "queryAgentOrderDetail", "Lcom/transsnet/palmpay/teller/bean/BillPaymentOrderDetailRsp;", "getOrderDetailByNew", "getOrderDetailByGiftCard", "source", "getOrderDetailByDataBundle", "Lcom/transsnet/palmpay/core/bean/req/CheckAccountStatusReq;", "Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp;", "queryCustomerIdInBeneficiaries", "(Lcom/transsnet/palmpay/core/bean/req/CheckAccountStatusReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/teller/bean/resp/QueryElectricCustomerIdIsExitBean;", "queryElectricCustomerIdInBeneficiaries", "getBettingOrderDetailByNew", "Lcom/transsnet/palmpay/teller/bean/WAECOperatorResp;", "queryWAECOperator", "multiModeFlag", "Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "getBettingWithdrawBillerList", "Lcom/transsnet/palmpay/teller/bean/CheckBettingValidationReq;", "Lcom/transsnet/palmpay/teller/bean/resp/CheckBettingValidationResp;", "checkBettingValidation", "(Lcom/transsnet/palmpay/teller/bean/CheckBettingValidationReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addQuickTellerOrderV2MVVM", "Lcom/transsnet/palmpay/teller/bean/QtQuotaCheckReq;", "quickTellerQuotaCheck", "(Lcom/transsnet/palmpay/teller/bean/QtQuotaCheckReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/teller/bean/BettingWithdrawRedeemCodeReq;", "Lcom/transsnet/palmpay/teller/bean/resp/BettingWithdrawRedeemCodeData;", "bettingWithdrawRedeemCodeCheck", "(Lcom/transsnet/palmpay/teller/bean/BettingWithdrawRedeemCodeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/teller/bean/BettingWithdrawRecentUserIDReq;", "Lcom/transsnet/palmpay/teller/bean/resp/BettingWithdrawRecentUserIDResp;", "(Lcom/transsnet/palmpay/teller/bean/BettingWithdrawRecentUserIDReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBettingOrder2", "Lcom/transsnet/palmpay/teller/bean/TransactionLinkReq;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "queryTransactionLink", "(Lcom/transsnet/palmpay/teller/bean/TransactionLinkReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/teller/bean/CommonBillerTipsBean;", "queryBillerTipsInfo", "Lcom/transsnet/palmpay/teller/bean/AddAutoRenewTaskReq;", "Lcom/transsnet/palmpay/airtime/bean/rsp/AutoRenewTaskBean;", "addScheduleTask", "(Lcom/transsnet/palmpay/teller/bean/AddAutoRenewTaskReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ignoreScheduleTask", "Lcom/transsnet/palmpay/teller/bean/resp/BettingAutoRenewalRecommendRsp;", "getBettingAutoRenewalRecommend", "Lcom/transsnet/palmpay/teller/bean/CreateBettingAutoRenewalReq;", "Lcom/transsnet/palmpay/teller/bean/resp/BettingAutoRenewalTaskRsp;", "createBettingAutoRenewal", "(Lcom/transsnet/palmpay/teller/bean/CreateBettingAutoRenewalReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableBettingAutoRenewalPopup", "url", "queryBettingGetQuickWebUrl", "Lcom/transsnet/palmpay/betting/bean/BettingQuickILotHomeBean;", "queryQuickBetHome", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IApiTellerService {
    @POST("/api/cfront/airtime/addFamilyAccount")
    @Nullable
    Object addFamilyAccount(@Body @Nullable AddFamilyAccontReq addFamilyAccontReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/airtime/addFamilyAccount/v3")
    @Nullable
    Object addFamilyAccountByHome(@Body @Nullable AddFamilyAccontReq addFamilyAccontReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/quickteller/addFavorite")
    @NotNull
    d<CommonResult> addFavorite(@Body @Nullable AddFavoriteReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/quickteller/v1/addOrder")
    @Nullable
    Object addQuickTellerOrderV2MVVM(@Body @Nullable CreateTellerOrderReq createTellerOrderReq, @NotNull Continuation<? super CreateTellerOrderRsp> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/scene-data-product/data/autoRenewal/task/add")
    @Nullable
    Object addScheduleTask(@Body @NotNull AddAutoRenewTaskReq addAutoRenewTaskReq, @NotNull Continuation<? super CommonBeanResult<AutoRenewTaskBean>> continuation);

    @GET("/api/gateway/betting/match")
    @Nullable
    Object bettingRaceSchedule(@NotNull @Query(RemoteConfigConstants.RequestFieldKey.TIME_ZONE) String str, @NotNull Continuation<? super CommonBeanResult<BettingRaceScheduleData>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/betting/withdraw/redeemCode/check")
    @Nullable
    Object bettingWithdrawRedeemCodeCheck(@Body @NotNull BettingWithdrawRedeemCodeReq bettingWithdrawRedeemCodeReq, @NotNull Continuation<? super CommonBeanResult<BettingWithdrawRedeemCodeData>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/betting/withdraw/redeemCode/pay")
    @NotNull
    d<CheckPayResp> bettingWithdrawRedeemCodePay(@Body @NotNull BettingWithdrawRedeemPayReq req);

    @POST("/api/betting/withdraw/customerId")
    @Nullable
    Object bettingWithdrawRedeemCodePay(@Body @NotNull BettingWithdrawRecentUserIDReq bettingWithdrawRecentUserIDReq, @NotNull Continuation<? super BettingWithdrawRecentUserIDResp> continuation);

    @POST("/api/cfront/quickteller/betting/withdraw/validation")
    @Nullable
    Object checkBettingValidation(@Body @Nullable CheckBettingValidationReq checkBettingValidationReq, @NotNull Continuation<? super CommonBeanResult<CheckBettingValidationResp>> continuation);

    @POST("/api/cfront/quickteller/bundle/support")
    @Nullable
    Object checkPaymentItemByNew(@Body @Nullable CheckPaymentItemReq checkPaymentItemReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/airtime/live/tv/buyAgain")
    @Nullable
    Object checkTvBuyAgain(@Body @Nullable CheckCustomerIdReq checkCustomerIdReq, @NotNull Continuation<? super CheckTvItemRsp> continuation);

    @POST("/api/gateway/airtime/recharge/tv/validation")
    @Nullable
    Object checkTvValidation(@Body @Nullable CheckCustomerIdReq checkCustomerIdReq, @NotNull Continuation<? super CheckCustomerIdRsp> continuation);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/online-agent-product/bettingHomeBenefits/claimCoupon")
    @Nullable
    Object claimCoupon(@Body @NotNull Map<String, String> map, @NotNull Continuation<? super CommonBeanResult<BillerCouponItemBean>> continuation);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/online-agent-product/bill/home/marketing/claimCombo")
    @Nullable
    Object claimCouponPackage(@Body @NotNull Map<String, String> map, @NotNull Continuation<? super CommonListResultV2<BillerCouponItemBean>> continuation);

    @POST("/api/betting-product/auto/app/createAutoRenewal")
    @Nullable
    Object createBettingAutoRenewal(@Body @NotNull CreateBettingAutoRenewalReq createBettingAutoRenewalReq, @NotNull Continuation<? super CommonBeanResult<BettingAutoRenewalTaskRsp>> continuation);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/gateway/betting/createBizOrder")
    @Nullable
    Object createBettingOrder(@Body @NotNull CreateBettingOrderReq createBettingOrderReq, @NotNull Continuation<? super CommonBeanResult<CreateBettingOrderData>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/betting-product/otp/createBizOrder")
    @Nullable
    Object createBettingOrder2(@Body @NotNull CreateBettingOrderReq createBettingOrderReq, @NotNull Continuation<? super CommonBeanResult<CreateBettingOrderData>> continuation);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/data/bundle/createBizOrder")
    @Nullable
    Object createDataBundleOrder(@Body @Nullable CreateTellerOrderReq createTellerOrderReq, @NotNull Continuation<? super CreateTellerOrderRsp> continuation);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/airtime/data/discountPackage/createBizOrder")
    @Nullable
    Object createFlashSaleDataBundleOrder(@Body @Nullable CreateTellerOrderReq createTellerOrderReq, @NotNull Continuation<? super CreateTellerOrderRsp> continuation);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/gateway/airtime/recharge/createBizOrder")
    @Nullable
    Object createOtherBillOrder(@Body @Nullable CreateTellerOrderReq createTellerOrderReq, @NotNull Continuation<? super CreateTellerOrderRsp> continuation);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/betting-product/quickBet/createBizOrder")
    @Nullable
    Object createQuickBettingOrder(@Body @NotNull CreateQucikBettingOrderReq createQucikBettingOrderReq, @NotNull Continuation<? super CommonBeanResult<CreateBettingOrderData>> continuation);

    @POST("/api/cfront/quickteller/delFavorite")
    @NotNull
    d<CommonResult> delFavorite(@Body @Nullable DelFavoriteReq req);

    @POST("/api/cfront/airtime/deleteFamilyAccount")
    @Nullable
    Object deleteFamilyAccount(@Body @Nullable DeleteFamilyAccontReq deleteFamilyAccontReq, @NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/betting-product/auto/app/popup/disable")
    @Nullable
    Object disableBettingAutoRenewalPopup(@NotNull Continuation<? super CommonResult> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/quickteller/institutions/specify")
    @Nullable
    Object getAllBillerList(@NotNull Continuation<? super BillerListRsp> continuation);

    @GET("/api/betting-product/auto/app/getAutoRenewal")
    @Nullable
    Object getBettingAutoRenewalRecommend(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<BettingAutoRenewalRecommendRsp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/betting-product/home/v5/billerList")
    @Nullable
    Object getBettingBillerList(@NotNull Continuation<? super CommonBeanResult<BettingBillerListRsp>> continuation);

    @GET("/api/betting/order/info")
    @Nullable
    Object getBettingOrderDetailByNew(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<BillPaymentOrderDetailRsp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/betting-product/biller/v2/itemsList")
    @Nullable
    Object getBettingPaymentItemList(@Body @Nullable PaymentItemListReq paymentItemListReq, @NotNull Continuation<? super PaymentItemListRsp> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/betting/withdraw/biller/list/enable/v2")
    @Nullable
    Object getBettingWithdrawBillerList(@Nullable @Query("multiModeFlag") String str, @NotNull Continuation<? super CommonListResultV2<BettingBillerListItemBean>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/airtime/live/biller")
    @Nullable
    Object getBillerListByCategoryId(@Nullable @Query("categoryId") String str, @NotNull Continuation<? super BillerListRsp> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/quickteller/queryFistClass")
    @Nullable
    Object getBillerListByNew(@Nullable @Query("categoryId") String str, @NotNull Continuation<? super BillerListRsp> continuation);

    @GET("/api/scene-share-product/data-share/sharer/inlet")
    @Nullable
    Object getDataBundleHomeLink(@NotNull Continuation<? super CommonBeanResult<DataBundleHomeLinkBean>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/airtime/live/electricity/itemList")
    @Nullable
    Object getElectricityItemListByBillerId(@Nullable @Query("billerId") String str, @NotNull Continuation<? super PaymentItemListRsp> continuation);

    @GET("/api/scene-data-product/bundle/orderDetail")
    @Nullable
    Object getOrderDetailByDataBundle(@Nullable @Query("orderNo") String str, @Nullable @Query("source") String str2, @NotNull Continuation<? super CommonBeanResult<BillPaymentOrderDetailRsp>> continuation);

    @GET("/api/live-product/gateway/giftcard/order/detail")
    @Nullable
    Object getOrderDetailByGiftCard(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<BillPaymentOrderDetailRsp>> continuation);

    @GET("/api/cfront/quickteller/orderDetail")
    @Nullable
    Object getOrderDetailByNew(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<BillPaymentOrderDetailRsp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/airtime/live/biller/item")
    @Nullable
    Object getPaymentItemListByBillerId(@Nullable @Query("categoryId") String str, @Nullable @Query("billerId") String str2, @NotNull Continuation<? super PaymentItemListRsp> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/quickteller/querySecondClass")
    @Nullable
    Object getPaymentItemListByNew(@Body @Nullable PaymentItemListReq paymentItemListReq, @NotNull Continuation<? super PaymentItemListRsp> continuation);

    @POST("/api/scene-data-product/data/autoRenewal/task/popup/disable")
    @Nullable
    Object ignoreScheduleTask(@NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/airtime/live/tv/customerId/history")
    @Nullable
    Object queryAccountHistory(@NotNull Continuation<? super QueryAccountHistoryResp> continuation);

    @GET("/api/online-agent-product/agent/commissionOrderDetail")
    @Nullable
    Object queryAgentOrderDetail(@NotNull @Query("orderNo") String str, @NotNull Continuation<? super AgentOrderDetailRsp> continuation);

    @GET("/api/airtime/couponConfig/get")
    @Nullable
    Object queryAvailableCoupon(@Nullable @Query("phone") String str, @Nullable @Query("couponCode") String str2, @Nullable @Query("transType") String str3, @NotNull Continuation<? super CommonBeanResult<AvailableOrderParamsInfo>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/online-agent-product/bill/home/marketing/getComboPromotion")
    @Nullable
    Object queryBannerWithCoupon(@NotNull @Query("transType") String str, @NotNull Continuation<? super CommonListResultV2<BannerWithCouponBean>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/betting-product/home/v3/getAmountListByItemId")
    @Nullable
    Object queryBettingAmountItemNew(@Nullable @Query("billerId") String str, @Nullable @Query("itemId") String str2, @NotNull Continuation<? super CommonListResultV2<BettingAcmountItemData>> continuation);

    @GET("/api/betting-product/home/v4/getBettingInfo")
    @Nullable
    Object queryBettingConfig(@Nullable @Query("billerId") String str, @NotNull Continuation<? super CommonBeanResult<BettingInfoConfigData>> continuation);

    @GET("/api/betting-product/channel/getAccessToken")
    @Nullable
    Object queryBettingGetQuickWebUrl(@Nullable @Query("url") String str, @NotNull Continuation<? super CommonBeanResult<String>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/betting-product/home/v5/getHomeInfoPure")
    @Nullable
    Object queryBettingHomeInfo(@NotNull Continuation<? super CommonBeanResult<BettingHomePageData>> continuation);

    @GET("/api/online-agent-product/bill/common/queryCommonConfig")
    @Nullable
    Object queryBillCommonConfig(@NotNull @Query("transType") String str, @NotNull Continuation<? super CommonBeanResult<BillCommonConfigBean>> continuation);

    @POST("/api/cfront/quickteller/queryAllList")
    @Nullable
    Object queryBillerHistory(@Body @Nullable HistoryOrderReq historyOrderReq, @NotNull Continuation<? super CommonListResult<BillerHistoryItemBean>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/online-agent-product/businessBiller/getBillerTips")
    @Nullable
    Object queryBillerTipsInfo(@Nullable @Query("transType") String str, @NotNull Continuation<? super CommonListResultV2<CommonBillerTipsBean>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/scene-data-product/bundleItemList/v3")
    @Nullable
    Object queryCategoryByOperatorCode(@NotNull @Query("billerName") String str, @NotNull Continuation<? super DataBundleListByCategoryIdResp> continuation);

    @GET("/api/online-agent-product/bettingHomeBenefits/getCouponDetailList")
    @Nullable
    Object queryCoupon(@Nullable @Query("transType") String str, @NotNull Continuation<? super CommonListResultV2<BillerCouponItemBean>> continuation);

    @GET("/api/online-agent-product/bettingHomeBenefits/getCouponListAndPoint")
    @Nullable
    Object queryCouponAndPointInfo(@NotNull @Query("transType") String str, @NotNull Continuation<? super CommonBeanResult<CouponWithPointBean>> continuation);

    @GET("/api/scene-billpayment-core/coupon/list")
    @Nullable
    Object queryCouponRetention(@NotNull @Query("transType") String str, @NotNull Continuation<? super CommonBeanResult<BillerCouponRetentionBean>> continuation);

    @GET("/api/online-agent-product/bettingHomeBenefits/getCouponDetailListV2")
    @Nullable
    Object queryCouponV2(@Nullable @Query("transType") String str, @NotNull Continuation<? super CommonListResultV2<BillerCouponItemBean>> continuation);

    @GET("/api/cfront/airtime/v2/customerId")
    @Nullable
    Object queryCustomerIdByNew(@Nullable @Query("billerId") String str, @Nullable @Query("itemId") String str2, @NotNull Continuation<? super CommonBeanResult<String>> continuation);

    @POST("/api/airtime/live/biller/customer/validation")
    @Nullable
    Object queryCustomerIdInBeneficiaries(@Body @NotNull CheckAccountStatusReq checkAccountStatusReq, @NotNull Continuation<? super QueryCustomerIdIsExitResp> continuation);

    @GET("/api/scene-data-product/data/highlyRecommend/dataItems")
    @Nullable
    Object queryDataBundleHighlyRecommendItems(@NotNull Continuation<? super CommonBeanResult<DataBundleHighlyRecommendBean>> continuation);

    @GET("/api/airtime/live/electricity/itemTips")
    @Nullable
    Object queryElecTipsByOperatorCode(@NotNull @Query("billerId") String str, @NotNull Continuation<? super CommonListResultV2<ElectricitytemTipsBean>> continuation);

    @POST("/api/airtime/live/electricity/queryAccount")
    @Nullable
    Object queryElectricCustomerIdInBeneficiaries(@Body @NotNull CheckAccountStatusReq checkAccountStatusReq, @NotNull Continuation<? super CommonBeanResult<QueryElectricCustomerIdIsExitBean>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/quickteller/getLastBill")
    @Nullable
    Object queryLastBillerByNew(@Body @Nullable QueryLastBillerReq queryLastBillerReq, @NotNull Continuation<? super QueryLastBillerRsp> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/quickteller/resolve/network/query")
    @Nullable
    Object queryMobileWalletTypeByPhoneByNew(@Nullable @Query("mobileNo") String str, @NotNull Continuation<? super QueryMobileWalletTypeByPhoneRsp> continuation);

    @GET("/api/scene-data-product/categoryItems/tips/v4/byTabId")
    @Nullable
    Object queryMoreTipsByOperatorCode(@NotNull @Query("billerName") String str, @Query("tabId") int i7, @NotNull Continuation<? super CommonBeanResult<DataBundleExtraItemInfo>> continuation);

    @GET("api/airtime/live/biller/customer/info")
    @Nullable
    Object queryOrderInfoConfirm(@Nullable @Query("customerId") String str, @Nullable @Query("itemId") String str2, @Nullable @Query("billerName") String str3, @Nullable @Query("amount") String str4, @NotNull Continuation<? super CommonBeanResult<BillOrderInfoConfirmData>> continuation);

    @GET("/api/airtime/flashPay")
    @Nullable
    Object queryOrderParamsWithCode(@Nullable @Query("phone") String str, @Nullable @Query("code") String str2, @Nullable @Query("transType") String str3, @NotNull Continuation<? super CommonBeanResult<AvailableOrderParamsInfo>> continuation);

    @GET("/api/betting-product/quickBet/getQuickBetInfo")
    @Nullable
    Object queryQuickBetHome(@NotNull Continuation<? super CommonBeanResult<BettingQuickILotHomeBean>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/betting-product/customer/v2/getCustomerId")
    @Nullable
    Object queryRecentItem(@Body @Nullable QueryLastBillerReq queryLastBillerReq, @NotNull Continuation<? super CommonBeanResult<QueryLastBillData>> continuation);

    @POST("/api/cfront/airtime/queryRecommendItem")
    @Nullable
    Object queryRecommendPaymentItemByNew(@Body @Nullable QueryRecommendReq queryRecommendReq, @NotNull Continuation<? super QueryRecommendRsp> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/airtime/bundleMenuList")
    @Nullable
    Object queryTelecomOperatorListByNew(@NotNull Continuation<? super MobileWalletResp> continuation);

    @GET("/api/scene-data-product/categoryItems/tips/v4")
    @Nullable
    Object queryTipsByOperatorCode(@NotNull @Query("billerName") String str, @NotNull Continuation<? super CommonBeanResult<DataBundleExtraItemInfo>> continuation);

    @POST("/api/online-agent-product/order/history/page/link")
    @Nullable
    Object queryTransactionLink(@Body @NotNull TransactionLinkReq transactionLinkReq, @NotNull Continuation<? super CommonBeanResult<ArrayList<String>>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/airtime/live/tv/item")
    @Nullable
    Object queryTvCategoryByOperatorCode(@NotNull @Query("billerId") String str, @NotNull Continuation<? super TvListByCategoryIdResp> continuation);

    @GET("/api/airtime/live/tv/item/tips")
    @Nullable
    Object queryTvTipsByOperatorCode(@NotNull @Query("billerId") String str, @NotNull Continuation<? super TvItemTipsResp> continuation);

    @GET("/api/cfront/quickteller/waec/network")
    @Nullable
    Object queryWAECOperator(@NotNull Continuation<? super WAECOperatorResp> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/quickteller/quotaCheck")
    @Nullable
    Object quickTellerQuotaCheck(@Body @Nullable QtQuotaCheckReq qtQuotaCheckReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/scene-data-product/lowData/order/subscribe")
    @Nullable
    Object subscribeLowData(@Body @NotNull OrderReminderSubscribeReq orderReminderSubscribeReq, @NotNull Continuation<? super CommonBeanResult<Boolean>> continuation);

    @POST("/api/cfront/airtime/updateFamilyAccount")
    @Nullable
    Object updateFamilyAccount(@Body @Nullable AddFamilyAccontReq addFamilyAccontReq, @NotNull Continuation<? super CommonResult> continuation);
}
