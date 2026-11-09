package com.transsnet.palmpay.main.export.business;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonBooleanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.bill.BillTotalCountReq;
import com.transsnet.palmpay.core.bean.bill.BillTotalCountResp;
import com.transsnet.palmpay.core.bean.bill.TransHistoryReqV2;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRspV2;
import com.transsnet.palmpay.core.bean.req.CommonListReq;
import com.transsnet.palmpay.core.bean.req.CommonPageListReq;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.network.annotation.JsonName;
import com.transsnet.palmpay.main.export.bean.req.BatchClaimPointReq;
import com.transsnet.palmpay.main.export.bean.req.ClaimRewardReq;
import com.transsnet.palmpay.main.export.bean.req.ClearRewardCacheReq;
import com.transsnet.palmpay.main.export.bean.req.CreateMerchantPaymentOrderReq;
import com.transsnet.palmpay.main.export.bean.req.CreateMerchantPaymentOrderRsp;
import com.transsnet.palmpay.main.export.bean.req.InviteeListReq;
import com.transsnet.palmpay.main.export.bean.req.MerchantOrderCheckSignReq;
import com.transsnet.palmpay.main.export.bean.req.MerchantOrderCompleteReq;
import com.transsnet.palmpay.main.export.bean.req.MerchantOrderPreviewReq;
import com.transsnet.palmpay.main.export.bean.req.PalmZoneTasksReq;
import com.transsnet.palmpay.main.export.bean.req.PremiumNoticeWithRewadReq;
import com.transsnet.palmpay.main.export.bean.req.QueryHomeBusinessReq;
import com.transsnet.palmpay.main.export.bean.req.QueryRefundBillDetailReq;
import com.transsnet.palmpay.main.export.bean.req.ThirdAuthorizationCodeReq;
import com.transsnet.palmpay.main.export.bean.req.ThresholdListRsp;
import com.transsnet.palmpay.main.export.bean.req.ThresholdReq;
import com.transsnet.palmpay.main.export.bean.req.ThresholdRsp;
import com.transsnet.palmpay.main.export.bean.rsp.AutoDeductOrderDetailRsp;
import com.transsnet.palmpay.main.export.bean.rsp.BulkDisbursementOrderDetailRsp;
import com.transsnet.palmpay.main.export.bean.rsp.ChargeBackOrderRsp;
import com.transsnet.palmpay.main.export.bean.rsp.CheckAppVersionAndUploadRsp;
import com.transsnet.palmpay.main.export.bean.rsp.ClaimPalmZoneRewardsRsp;
import com.transsnet.palmpay.main.export.bean.rsp.CommissionOrderDetailRsp;
import com.transsnet.palmpay.main.export.bean.rsp.FinanceSavingsV1HomeResp;
import com.transsnet.palmpay.main.export.bean.rsp.GetCoinRsp;
import com.transsnet.palmpay.main.export.bean.rsp.GetHomeCommonRsp;
import com.transsnet.palmpay.main.export.bean.rsp.GetInvestGuideConfigResp;
import com.transsnet.palmpay.main.export.bean.rsp.GetPointFlowRsp;
import com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountResp;
import com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountV2Resp;
import com.transsnet.palmpay.main.export.bean.rsp.GuaranteeQueryRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeCouponRewardsRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeMePageMenuRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsTabInfo;
import com.transsnet.palmpay.main.export.bean.rsp.InvestGuideBeanRsp;
import com.transsnet.palmpay.main.export.bean.rsp.InviteeListResp;
import com.transsnet.palmpay.main.export.bean.rsp.MeTabTotalAssetInfo;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantDisburseOrderDetailRsp;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantListRsp;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantLogoRsp;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantOrderDetailRsp;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantOrderPreviewResp;
import com.transsnet.palmpay.main.export.bean.rsp.MinorAccountBean;
import com.transsnet.palmpay.main.export.bean.rsp.MinorGuardianManagerResp;
import com.transsnet.palmpay.main.export.bean.rsp.PalmPrizeItem;
import com.transsnet.palmpay.main.export.bean.rsp.PalmSafeDetail;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneCouponRsp;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneReferEarnHomeResp;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneRewardsList;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneTaskRewardsListResp;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneTasksRsp;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneTasksRspV2;
import com.transsnet.palmpay.main.export.bean.rsp.PayCodeOrderDetailBean;
import com.transsnet.palmpay.main.export.bean.rsp.PaymentMethodListResp;
import com.transsnet.palmpay.main.export.bean.rsp.PremiumBenefitsRewardBean;
import com.transsnet.palmpay.main.export.bean.rsp.PremiumBenefitsRewardNoticeBean;
import com.transsnet.palmpay.main.export.bean.rsp.PremiumTrialClaimResultBean;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHomeAccountInfoRsp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHomeBusinessRsp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHotProductModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHotStockModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryInsuranceModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryLastTransactionHistoryRsp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryModuleRankResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRankFundModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRecommendModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRefundBillDetailRsp;
import com.transsnet.palmpay.main.export.bean.rsp.QuerySavingTaskModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryTargetSavingModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryTargetSavingsModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.SavingMainBodyResultBean;
import com.transsnet.palmpay.main.export.bean.rsp.TaskCenterRewardResultBean;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdAuthorizationCodeResp;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdPartyMerchantListResp;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdPartyMerchantOrderDetailResp;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdPartyMerchantResp;
import com.transsnet.palmpay.main.export.bean.rsp.UpdateAutoTransferConfig;
import com.transsnet.palmpay.main.export.bean.rsp.WelcomeCouponData;
import com.transsnet.palmpay.main.export.bean.rsp.WelcomeNewUserConfigRsp;
import df.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008c\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH§@¢\u0006\u0004\b\u000e\u0010\u000bJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH§@¢\u0006\u0004\b\u000f\u0010\u000bJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fH§@¢\u0006\u0004\b\u0011\u0010\u000bJ\u001c\u0010\u0015\u001a\u00020\u00142\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u001d\u001a\u00020\u001c2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\"\u001a\u00020\u00142\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u001fH§@¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\bH§@¢\u0006\u0004\b%\u0010\u000bJ$\u0010)\u001a\u00020(2\b\b\u0001\u0010&\u001a\u00020\u00122\b\b\u0003\u0010'\u001a\u00020\u0017H§@¢\u0006\u0004\b)\u0010*J \u0010-\u001a\b\u0012\u0004\u0012\u00020,0\b2\b\b\u0001\u0010\u0003\u001a\u00020+H§@¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/H§@¢\u0006\u0004\b0\u0010\u000bJ.\u00105\u001a\b\u0012\u0004\u0012\u0002040\b2\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u00103\u001a\u0004\u0018\u000102H§@¢\u0006\u0004\b5\u00106J'\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\b0\u00042\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\b9\u0010:J.\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\b2\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010<\u001a\u0004\u0018\u000102H§@¢\u0006\u0004\b>\u0010?J.\u0010A\u001a\b\u0012\u0004\u0012\u00020=0\b2\n\b\u0003\u0010@\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010<\u001a\u0004\u0018\u000102H§@¢\u0006\u0004\bA\u00106J'\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\b0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010BH'¢\u0006\u0004\bD\u0010EJ \u0010H\u001a\b\u0012\u0004\u0012\u00020G0\b2\b\b\u0001\u0010\u0003\u001a\u00020FH§@¢\u0006\u0004\bH\u0010IJ \u0010K\u001a\b\u0012\u0004\u0012\u00020J0\b2\b\b\u0001\u0010\u0003\u001a\u00020FH§@¢\u0006\u0004\bK\u0010IJ\u001a\u0010M\u001a\u00020L2\b\b\u0001\u0010\u0003\u001a\u00020FH§@¢\u0006\u0004\bM\u0010IJ\u001b\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0\f0\u0004H'¢\u0006\u0004\bO\u0010PJ!\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\n\b\u0001\u0010Q\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\bR\u0010:J'\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\b0\u00042\n\b\u0001\u0010Q\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\bT\u0010:J'\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\b0\u00042\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\bV\u0010:J'\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\b0\u00042\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\bX\u0010:J'\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0\b0\u00042\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\bZ\u0010:J'\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0\b0\u00042\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\b\\\u0010:J\u0015\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\u0004H'¢\u0006\u0004\b^\u0010PJ\u0015\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\u0004H'¢\u0006\u0004\b`\u0010PJ'\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0\b0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010aH'¢\u0006\u0004\bc\u0010dJ!\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010eH'¢\u0006\u0004\bf\u0010gJ'\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0\b0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010hH'¢\u0006\u0004\bj\u0010kJ!\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010lH'¢\u0006\u0004\bm\u0010nJ'\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0\b0\u00042\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\bp\u0010:J'\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0\b0\u00042\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\br\u0010:J\u0010\u0010t\u001a\u00020sH§@¢\u0006\u0004\bt\u0010\u000bJ\u0016\u0010v\u001a\b\u0012\u0004\u0012\u00020u0\bH§@¢\u0006\u0004\bv\u0010\u000bJ\u0016\u0010x\u001a\b\u0012\u0004\u0012\u00020w0\fH§@¢\u0006\u0004\bx\u0010\u000bJ\u0016\u0010z\u001a\b\u0012\u0004\u0012\u00020y0\bH§@¢\u0006\u0004\bz\u0010\u000bJ \u0010}\u001a\b\u0012\u0004\u0012\u00020|0\b2\b\b\u0001\u0010\u0003\u001a\u00020{H§@¢\u0006\u0004\b}\u0010~J&\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\b2\n\b\u0001\u0010\u007f\u001a\u0004\u0018\u00010\u001fH§@¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0019\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010\bH§@¢\u0006\u0005\b\u0084\u0001\u0010\u000bJ\u001e\u0010\u0086\u0001\u001a\u00020\u00142\t\b\u0001\u0010\u0003\u001a\u00030\u0085\u0001H§@¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J%\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\f2\t\b\u0001\u0010\u0003\u001a\u00030\u0085\u0001H§@¢\u0006\u0006\b\u0088\u0001\u0010\u0087\u0001J\u0019\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010\bH§@¢\u0006\u0005\b\u008a\u0001\u0010\u000bJ\u0013\u0010\u008c\u0001\u001a\u00030\u008b\u0001H§@¢\u0006\u0005\b\u008c\u0001\u0010\u000bJ\u0019\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010\bH§@¢\u0006\u0005\b\u008e\u0001\u0010\u000bJ!\u0010\u0091\u0001\u001a\u00020\u00142\f\b\u0001\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u0001H§@¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J!\u0010\u0093\u0001\u001a\u00020\u00142\f\b\u0001\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u0001H§@¢\u0006\u0006\b\u0093\u0001\u0010\u0092\u0001J2\u0010\u0097\u0001\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010\b2\t\b\u0001\u0010\u0094\u0001\u001a\u00020\u00122\u000b\b\u0003\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u001fH§@¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0019\u0010\u009a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010\bH§@¢\u0006\u0005\b\u009a\u0001\u0010\u000bJ\u0019\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\fH§@¢\u0006\u0005\b\u009c\u0001\u0010\u000bJ\u0019\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\bH§@¢\u0006\u0005\b\u009e\u0001\u0010\u000bJ&\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030 \u00010\b2\n\b\u0001\u0010\u0090\u0001\u001a\u00030\u009f\u0001H§@¢\u0006\u0006\b¡\u0001\u0010¢\u0001J&\u0010¤\u0001\u001a\t\u0012\u0005\u0012\u00030£\u00010\b2\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u001fH§@¢\u0006\u0006\b¤\u0001\u0010\u0082\u0001J/\u0010¨\u0001\u001a\t\u0012\u0005\u0012\u00030§\u00010\u00042\t\b\u0001\u0010¥\u0001\u001a\u00020\u001f2\t\b\u0001\u0010¦\u0001\u001a\u00020\u0012H'¢\u0006\u0006\b¨\u0001\u0010©\u0001J%\u0010¬\u0001\u001a\t\u0012\u0005\u0012\u00030«\u00010\u00042\u000b\b\u0001\u0010ª\u0001\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0005\b¬\u0001\u0010:J,\u0010¯\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030®\u00010\b0\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u00ad\u0001H'¢\u0006\u0006\b¯\u0001\u0010°\u0001J)\u0010³\u0001\u001a\u000b\u0012\u0005\u0012\u00030²\u0001\u0018\u00010\b2\u000b\b\u0001\u0010±\u0001\u001a\u0004\u0018\u00010\u001fH§@¢\u0006\u0006\b³\u0001\u0010\u0082\u0001J%\u0010¶\u0001\u001a\t\u0012\u0005\u0012\u00030µ\u00010\b2\t\b\u0001\u0010´\u0001\u001a\u00020\u001fH§@¢\u0006\u0006\b¶\u0001\u0010\u0082\u0001J\u0019\u0010¸\u0001\u001a\t\u0012\u0005\u0012\u00030·\u00010\bH§@¢\u0006\u0005\b¸\u0001\u0010\u000bJ%\u0010¹\u0001\u001a\t\u0012\u0005\u0012\u00030µ\u00010\b2\t\b\u0001\u0010´\u0001\u001a\u00020\u001fH§@¢\u0006\u0006\b¹\u0001\u0010\u0082\u0001J%\u0010¼\u0001\u001a\t\u0012\u0005\u0012\u00030»\u00010\b2\t\b\u0001\u0010º\u0001\u001a\u00020\u0012H§@¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0019\u0010¿\u0001\u001a\t\u0012\u0005\u0012\u00030¾\u00010\bH§@¢\u0006\u0005\b¿\u0001\u0010\u000bJ\u0019\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010\bH§@¢\u0006\u0005\bÁ\u0001\u0010\u000bJ\u0019\u0010Â\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010\bH§@¢\u0006\u0005\bÂ\u0001\u0010\u000bJ%\u0010Å\u0001\u001a\t\u0012\u0005\u0012\u00030Ä\u00010\b2\t\b\u0001\u0010Ã\u0001\u001a\u00020\u0012H§@¢\u0006\u0006\bÅ\u0001\u0010½\u0001J\u0019\u0010Ç\u0001\u001a\t\u0012\u0005\u0012\u00030Æ\u00010\bH§@¢\u0006\u0005\bÇ\u0001\u0010\u000bJ\u0019\u0010É\u0001\u001a\t\u0012\u0005\u0012\u00030È\u00010\bH§@¢\u0006\u0005\bÉ\u0001\u0010\u000bJ'\u0010Ì\u0001\u001a\t\u0012\u0005\u0012\u00030Ë\u00010\b2\u000b\b\u0001\u0010Ê\u0001\u001a\u0004\u0018\u000102H§@¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J \u0010Ï\u0001\u001a\u00020\u00142\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Î\u0001H§@¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J \u0010Ò\u0001\u001a\u00020\u00142\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Ñ\u0001H§@¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J'\u0010Ö\u0001\u001a\t\u0012\u0005\u0012\u00030Õ\u00010\f2\u000b\b\u0003\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u0019\u0010Ù\u0001\u001a\t\u0012\u0005\u0012\u00030Ø\u00010\bH§@¢\u0006\u0005\bÙ\u0001\u0010\u000bJ%\u0010Ü\u0001\u001a\t\u0012\u0005\u0012\u00030Û\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030Ú\u0001H§@¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J%\u0010à\u0001\u001a\t\u0012\u0005\u0012\u00030ß\u00010\b2\t\b\u0001\u0010Þ\u0001\u001a\u00020\u001fH§@¢\u0006\u0006\bà\u0001\u0010\u0082\u0001J \u0010â\u0001\u001a\u00020\u00142\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010á\u0001H§@¢\u0006\u0006\bâ\u0001\u0010ã\u0001J'\u0010æ\u0001\u001a\t\u0012\u0005\u0012\u00030å\u00010\b2\u000b\b\u0001\u0010ä\u0001\u001a\u0004\u0018\u00010\u001fH§@¢\u0006\u0006\bæ\u0001\u0010\u0082\u0001J\u0019\u0010ç\u0001\u001a\t\u0012\u0005\u0012\u00030å\u00010\fH§@¢\u0006\u0005\bç\u0001\u0010\u000bJ\u001f\u0010é\u0001\u001a\u00030è\u00012\t\b\u0001\u0010ä\u0001\u001a\u00020\u001fH§@¢\u0006\u0006\bé\u0001\u0010\u0082\u0001JF\u0010î\u0001\u001a\u00030í\u00012\t\b\u0001\u0010ä\u0001\u001a\u00020\u001f2\u000b\b\u0003\u0010ê\u0001\u001a\u0004\u0018\u00010\u001f2\u000b\b\u0003\u0010ë\u0001\u001a\u0004\u0018\u00010\u001f2\u000b\b\u0003\u0010ì\u0001\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0006\bî\u0001\u0010ï\u0001J\u0019\u0010ð\u0001\u001a\t\u0012\u0005\u0012\u00030å\u00010\fH§@¢\u0006\u0005\bð\u0001\u0010\u000bJ!\u0010ó\u0001\u001a\u00030ò\u00012\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010ñ\u0001H§@¢\u0006\u0006\bó\u0001\u0010ô\u0001J'\u0010÷\u0001\u001a\t\u0012\u0005\u0012\u00030ö\u00010\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010õ\u0001H§@¢\u0006\u0006\b÷\u0001\u0010ø\u0001J\u001f\u0010ù\u0001\u001a\u00030è\u00012\t\b\u0001\u0010ä\u0001\u001a\u00020\u001fH§@¢\u0006\u0006\bù\u0001\u0010\u0082\u0001JK\u0010û\u0001\u001a\b\u0012\u0004\u0012\u0002020\b2\t\b\u0001\u0010ä\u0001\u001a\u00020\u001f2\u000b\b\u0003\u0010ê\u0001\u001a\u0004\u0018\u00010\u001f2\u000b\b\u0003\u0010ú\u0001\u001a\u0004\u0018\u00010\u001f2\u000b\b\u0003\u0010ì\u0001\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0006\bû\u0001\u0010ï\u0001J\u0019\u0010ý\u0001\u001a\t\u0012\u0005\u0012\u00030ü\u00010\bH§@¢\u0006\u0005\bý\u0001\u0010\u000bJ\u001e\u0010ÿ\u0001\u001a\u00020\u00142\t\b\u0001\u0010þ\u0001\u001a\u00020\u001fH§@¢\u0006\u0006\bÿ\u0001\u0010\u0082\u0001J%\u0010\u0082\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\b2\t\b\u0001\u0010\u0080\u0002\u001a\u00020\u001fH§@¢\u0006\u0006\b\u0082\u0002\u0010\u0082\u0001J%\u0010\u0084\u0002\u001a\t\u0012\u0005\u0012\u00030\u0083\u00020\b2\t\b\u0001\u0010´\u0001\u001a\u00020\u001fH§@¢\u0006\u0006\b\u0084\u0002\u0010\u0082\u0001¨\u0006\u0085\u0002"}, d2 = {"Lcom/transsnet/palmpay/main/export/business/IApiMainService;", "", "Lcom/transsnet/palmpay/main/export/bean/req/InviteeListReq;", "req", "Ldf/d;", "Lcom/transsnet/palmpay/main/export/bean/rsp/InviteeListResp;", "queryInviteeList", "(Lcom/transsnet/palmpay/main/export/bean/req/InviteeListReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/main/export/bean/rsp/FinanceSavingsV1HomeResp;", "getFinanceSavingsV1Home", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/CommonListResultV2;", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryInsuranceModuleResp;", "queryInsuranceModule", "queryInsuranceModuleWithoutLogin", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryHotStockModuleResp;", "queryHotStocksModule", "", "status", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "reportDarkModeSetting", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enableBioLogin", "enableBioPay", "systemNotification", "bioType", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeMePageMenuRsp;", "mePageMenuList", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "msgObjectId", "templateCode", "markMessageAsRead", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/main/export/bean/rsp/MeTabTotalAssetInfo;", "queryMeTabTotalAssetInfo", "funCount", "appDowngrade", "Lcom/transsnet/palmpay/main/export/bean/rsp/GetHomeCommonRsp;", "queryHomeInfo", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/main/export/bean/req/QueryHomeBusinessReq;", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryHomeBusinessRsp;", "queryHomeData3", "(Lcom/transsnet/palmpay/main/export/bean/req/QueryHomeBusinessReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryLastTransactionHistoryRsp;", "queryLastTransactionHistory", "versionName", "", "versionCode", "Lcom/transsnet/palmpay/main/export/bean/rsp/CheckAppVersionAndUploadRsp;", "checkAppVersionAndUploadVersion", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderNo", "Lcom/transsnet/palmpay/main/export/bean/rsp/AutoDeductOrderDetailRsp;", "getAutoDeductOrderDetail", "(Ljava/lang/String;)Ldf/d;", "taskNum", "id", "Lcom/transsnet/palmpay/main/export/bean/rsp/ClaimPalmZoneRewardsRsp;", "claimProgressRewards", "(Ljava/lang/Integer;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "memberTaskNo", "claimTaskRewards", "Lcom/transsnet/palmpay/core/bean/req/CommonPageListReq;", "Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneRewardsList;", "palmZoneRewards", "(Lcom/transsnet/palmpay/core/bean/req/CommonPageListReq;)Ldf/d;", "Lcom/transsnet/palmpay/main/export/bean/req/PalmZoneTasksReq;", "Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneTasksRspV2;", "queryPalmZoneTasks", "(Lcom/transsnet/palmpay/main/export/bean/req/PalmZoneTasksReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCenterRsp;", "queryHomeRewardTasks", "Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneTasksRsp;", "getMoreRewardTaskList", "Lcom/transsnet/palmpay/main/export/bean/rsp/MerchantListRsp;", "queryMerchantList", "()Ldf/d;", "merchantNo", "unbindMerchant", "Lcom/transsnet/palmpay/main/export/bean/rsp/MerchantLogoRsp;", "getMerchantLogo", "Lcom/transsnet/palmpay/main/export/bean/rsp/MerchantOrderDetailRsp;", "getMerchantOrderDetail", "Lcom/transsnet/palmpay/main/export/bean/rsp/MerchantDisburseOrderDetailRsp;", "getMerchantDisburseOrderDetail", "Lcom/transsnet/palmpay/main/export/bean/rsp/CommissionOrderDetailRsp;", "queryCommissionOrderDetail", "Lcom/transsnet/palmpay/main/export/bean/rsp/BulkDisbursementOrderDetailRsp;", "queryBulkDisbursementOrderDetail", "Lcom/transsnet/palmpay/main/export/bean/rsp/ThirdPartyMerchantListResp;", "queryThirdPartyMerchant", "Lcom/transsnet/palmpay/main/export/bean/rsp/ThirdPartyMerchantResp;", "queryThirdPartyMerchantById", "Lcom/transsnet/palmpay/main/export/bean/req/ThirdAuthorizationCodeReq;", "Lcom/transsnet/palmpay/main/export/bean/rsp/ThirdAuthorizationCodeResp;", "requestAuthorization", "(Lcom/transsnet/palmpay/main/export/bean/req/ThirdAuthorizationCodeReq;)Ldf/d;", "Lcom/transsnet/palmpay/main/export/bean/req/MerchantOrderCheckSignReq;", "checkMerchantOrderSign", "(Lcom/transsnet/palmpay/main/export/bean/req/MerchantOrderCheckSignReq;)Ldf/d;", "Lcom/transsnet/palmpay/main/export/bean/req/MerchantOrderPreviewReq;", "Lcom/transsnet/palmpay/main/export/bean/rsp/MerchantOrderPreviewResp;", "queryMerchantPreviewInfo", "(Lcom/transsnet/palmpay/main/export/bean/req/MerchantOrderPreviewReq;)Ldf/d;", "Lcom/transsnet/palmpay/main/export/bean/req/MerchantOrderCompleteReq;", "completeMerchantOrder", "(Lcom/transsnet/palmpay/main/export/bean/req/MerchantOrderCompleteReq;)Ldf/d;", "Lcom/transsnet/palmpay/main/export/bean/rsp/ThirdPartyMerchantOrderDetailResp;", "queryThirdPartyMerchantOrderDetail", "Lcom/transsnet/palmpay/main/export/bean/rsp/ChargeBackOrderRsp;", "queryChargeBackOrderDetail", "Lcom/transsnet/palmpay/main/export/bean/rsp/GetUserAssetsAmountResp;", "getUserAssetsAmountForMVVM", "Lcom/transsnet/palmpay/main/export/bean/rsp/GetUserAssetsAmountV2Resp;", "getUserAssetsAmountV2", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryModuleRankResp;", "queryModuleRank", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsTabInfo;", "getRewardPageInfoV2", "Lcom/transsnet/palmpay/core/bean/req/CommonListReq;", "Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneTaskRewardsListResp;", "queryZoneTaskReward", "(Lcom/transsnet/palmpay/core/bean/req/CommonListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compensationNo", "Lcom/transsnet/palmpay/main/export/bean/rsp/PalmSafeDetail;", "getPalmSafeDetail", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/main/export/bean/rsp/GuaranteeQueryRsp;", "guaranteeDetail", "Lcom/transsnet/palmpay/main/export/bean/rsp/PaymentMethodListResp$DataBean$Data;", "setPaymentMethod", "(Lcom/transsnet/palmpay/main/export/bean/rsp/PaymentMethodListResp$DataBean$Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPaymentMethodList", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryHomeAccountInfoRsp;", "queryHomeAccountInfo", "Lcom/transsnet/palmpay/main/export/bean/req/ThresholdListRsp;", "queryOneStepPaymentThresholds", "Lcom/transsnet/palmpay/main/export/bean/req/ThresholdRsp;", "queryOneStepPayThreshold", "Lcom/transsnet/palmpay/main/export/bean/req/ThresholdReq;", "body", "createOneStepPayThreshold", "(Lcom/transsnet/palmpay/main/export/bean/req/ThresholdReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setOneStepPayThreshold", "isAutoTransfer", "source", "Lcom/transsnet/palmpay/main/export/bean/rsp/UpdateAutoTransferConfig;", "updateAutoTransferConfig", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/main/export/bean/rsp/InvestGuideBeanRsp;", "getSavingFinanceHomeNotLogin", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryTargetSavingModuleResp;", "getSavingTarget", "Lcom/transsnet/palmpay/main/export/bean/rsp/WelcomeCouponData;", "queryWelcomeBackCoupon", "Lcom/transsnet/palmpay/main/export/bean/req/CreateMerchantPaymentOrderReq;", "Lcom/transsnet/palmpay/main/export/bean/req/CreateMerchantPaymentOrderRsp;", "createMerchantPaymentOrder", "(Lcom/transsnet/palmpay/main/export/bean/req/CreateMerchantPaymentOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/main/export/bean/rsp/PayCodeOrderDetailBean;", "getOrderDetailByPayCode", "activityCode", "hitNum", "Lcom/transsnet/palmpay/main/export/bean/rsp/GetCoinRsp;", "getCoin", "(Ljava/lang/String;I)Ldf/d;", "loyaltyOrderId", "Lcom/transsnet/palmpay/main/export/bean/rsp/GetPointFlowRsp;", "getPointStatement", "Lcom/transsnet/palmpay/main/export/bean/req/QueryRefundBillDetailReq;", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryRefundBillDetailRsp;", "getRefundDetail", "(Lcom/transsnet/palmpay/main/export/bean/req/QueryRefundBillDetailReq;)Ldf/d;", "gaId", "Lcom/transsnet/palmpay/main/export/bean/rsp/WelcomeNewUserConfigRsp;", "queryWelcomeNewUserConfig", "entry", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryRankFundModuleResp;", "queryFundModule", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryTargetSavingsModuleResp;", "queryTargetModule", "queryFundModuleWithoutLogin", "appSource", "Lcom/transsnet/palmpay/main/export/bean/rsp/GetInvestGuideConfigResp;", "getBusinessLicense", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryRecommendModuleResp;", "getRecommendContentInfo", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryHotProductModuleResp;", "getHotProduct", "getHotProductWithoutLogin", "scene", "Lcom/transsnet/palmpay/main/export/bean/rsp/QuerySavingTaskModuleResp;", "getMarketingPosition", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeCouponRewardsRsp;", "queryCouponList", "Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneReferEarnHomeResp;", "queryReferEarnHome", "claimId", "Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneCouponRsp;", "claimCouponPackage", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/main/export/bean/req/ClaimRewardReq;", "claimRewardsCenterReward", "(Lcom/transsnet/palmpay/main/export/bean/req/ClaimRewardReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/main/export/bean/req/ClearRewardCacheReq;", "clearRewardsResultCache", "(Lcom/transsnet/palmpay/main/export/bean/req/ClearRewardCacheReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSupportHide", "Lcom/transsnet/palmpay/main/export/bean/rsp/PalmPrizeItem;", "queryPalmPrizeListResult", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/main/export/bean/rsp/PremiumBenefitsRewardBean;", "queryPremiumResultWithReward", "Lcom/transsnet/palmpay/main/export/bean/req/PremiumNoticeWithRewadReq;", "Lcom/transsnet/palmpay/main/export/bean/rsp/PremiumBenefitsRewardNoticeBean;", "queryPremiumNoticeWithReward", "(Lcom/transsnet/palmpay/main/export/bean/req/PremiumNoticeWithRewadReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "taskCode", "Lcom/transsnet/palmpay/main/export/bean/rsp/PremiumTrialClaimResultBean;", "claimTrialPremiumResult", "Lcom/transsnet/palmpay/main/export/bean/req/BatchClaimPointReq;", "batchClaimPoint", "(Lcom/transsnet/palmpay/main/export/bean/req/BatchClaimPointReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "teenMemberId", "Lcom/transsnet/palmpay/main/export/bean/rsp/MinorAccountBean;", "queryMinorAccountDetail", "guardianAuthApplyRecord", "Lcom/transsnet/palmpay/core/bean/rsp/CommonStringResult;", "guardianCancelAuthPre", "validatorToken", "authCancelToken", "validatorType", "Lcom/transsnet/palmpay/core/bean/CommonBooleanResult;", "guardianCancelAuth", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allTeenByGuardian", "Lcom/transsnet/palmpay/core/bean/bill/TransHistoryReqV2;", "Lcom/transsnet/palmpay/core/bean/bill/TransHistoryRspV2;", "queryWardBillList", "(Lcom/transsnet/palmpay/core/bean/bill/TransHistoryReqV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/bill/BillTotalCountReq;", "Lcom/transsnet/palmpay/core/bean/bill/BillTotalCountResp;", "getBillTotalCount", "(Lcom/transsnet/palmpay/core/bean/bill/BillTotalCountReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authDelayPre", "authDelayToken", "authDelay", "Lcom/transsnet/palmpay/main/export/bean/rsp/MinorGuardianManagerResp;", "finaGuardianByTeenMemberId", "businessId", "handleAsserBannerReport", "taskSceneType", "Lcom/transsnet/palmpay/main/export/bean/rsp/TaskCenterRewardResultBean;", "claimTaskCenterReward", "Lcom/transsnet/palmpay/main/export/bean/rsp/SavingMainBodyResultBean;", "getWealthMainbodyInfo", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IApiMainService {
    @GET("/api/online-agent-product/agent/teen/allTeenByGuardian")
    @Nullable
    Object allTeenByGuardian(@NotNull Continuation<? super CommonListResultV2<MinorAccountBean>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/online-agent-product/agent/teen/authDelay")
    Object authDelay(@Field("teenMemberId") @NotNull String str, @Field("validatorToken") @Nullable String str2, @Field("authDelayToken") @Nullable String str3, @Field("validatorType") @Nullable Integer num, @NotNull Continuation<? super CommonBeanResult<Long>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/online-agent-product/agent/teen/authDelayPre")
    Object authDelayPre(@Field("teenMemberId") @NotNull String str, @NotNull Continuation<? super CommonStringResult> continuation);

    @POST("/api/marketing-service/loyalty/account/batchClaimPoint")
    @Nullable
    Object batchClaimPoint(@Body @Nullable BatchClaimPointReq batchClaimPointReq, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes"})
    @POST("/api/cfront/device/updateMaxVersion")
    Object checkAppVersionAndUploadVersion(@Field("versionName") @Nullable String str, @Field("versionCode") @Nullable Long l5, @NotNull Continuation<? super CommonBeanResult<CheckAppVersionAndUploadRsp>> continuation);

    @POST("/api/cfront/merchant/channel/merChanneSign")
    @NotNull
    d<CommonResult> checkMerchantOrderSign(@Body @Nullable MerchantOrderCheckSignReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/scene-activity-product/rewards/claimCombo")
    @Nullable
    Object claimCouponPackage(@Body @JsonName("claimId") @Nullable Long l5, @NotNull Continuation<? super CommonBeanResult<PalmZoneCouponRsp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes"})
    @POST("/api/scene-activity-product/rewardSpecial/claimedProgressBarReward")
    Object claimProgressRewards(@Field("taskNum") @Nullable Integer num, @Field("rewardSpecialMemberCycleId") @Nullable Long l5, @NotNull Continuation<? super CommonBeanResult<ClaimPalmZoneRewardsRsp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/wallet-base-service/cfront/home/marketingCenterReceive")
    @Nullable
    Object claimRewardsCenterReward(@Body @Nullable ClaimRewardReq claimRewardReq, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Use_Sign_V2: yes", "Convert-Form-Data: yes"})
    @POST("/api/wallet-base-service/home/taskCenterExecute")
    Object claimTaskCenterReward(@Field("taskSceneType") @NotNull String str, @NotNull Continuation<? super CommonBeanResult<TaskCenterRewardResultBean>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes"})
    @POST("/api/scene-activity-product/rewards/revision/claimedTaskRewardV2")
    Object claimTaskRewards(@Field("memberTaskNo") @Nullable String str, @Field("rewardSpecialMemberCycleId") @Nullable Long l5, @NotNull Continuation<? super CommonBeanResult<ClaimPalmZoneRewardsRsp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes"})
    @POST("/api/online-agent-product/vip/task/claim")
    Object claimTrialPremiumResult(@Field("taskCode") @NotNull String str, @NotNull Continuation<? super CommonBeanResult<PremiumTrialClaimResultBean>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/wallet-base-service/wallet/home/marketingCenterCacheClear")
    @Nullable
    Object clearRewardsResultCache(@Body @Nullable ClearRewardCacheReq clearRewardCacheReq, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/merchant/channel/updateMerChannelOrderInfo")
    @NotNull
    d<CommonResult> completeMerchantOrder(@Body @Nullable MerchantOrderCompleteReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/scene-offline-product/payCode/createPayCodeOrder")
    @Nullable
    Object createMerchantPaymentOrder(@Body @NotNull CreateMerchantPaymentOrderReq createMerchantPaymentOrderReq, @NotNull Continuation<? super CommonBeanResult<CreateMerchantPaymentOrderRsp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/member/amount/threshold/create")
    @Nullable
    Object createOneStepPayThreshold(@Body @Nullable ThresholdReq thresholdReq, @NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/online-agent-product/agent/teen/finaGuardianByTeenMemberId")
    @Nullable
    Object finaGuardianByTeenMemberId(@NotNull Continuation<? super CommonBeanResult<MinorGuardianManagerResp>> continuation);

    @GET("/api/cfront/merchantdeduce/queryMerchantDecudeDetail")
    @NotNull
    d<CommonBeanResult<AutoDeductOrderDetailRsp>> getAutoDeductOrderDetail(@Nullable @Query("orderNo") String orderNo);

    @POST("/api/c-bff-product/bill/v2/wardBill/totalAmount")
    @Nullable
    Object getBillTotalCount(@Body @Nullable BillTotalCountReq billTotalCountReq, @NotNull Continuation<? super CommonBeanResult<BillTotalCountResp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/finance-saving-product/cash/saving/getBusinessLicense")
    @Nullable
    Object getBusinessLicense(@Query("appSource") int i7, @NotNull Continuation<? super CommonBeanResult<GetInvestGuideConfigResp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/market-game2-product/giftRain/giftRainLottery")
    @NotNull
    d<GetCoinRsp> getCoin(@Header("GAME-PRODUCT-ACTIVITY-CODE") @NotNull String activityCode, @Body @JsonName("hitNum") int hitNum);

    @Headers({"No-Token: yes"})
    @GET("/api/finance-bff-product/v1/saving/finance/index")
    @Nullable
    Object getFinanceSavingsV1Home(@NotNull Continuation<? super CommonBeanResult<FinanceSavingsV1HomeResp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/finance-saving-product/fixed/saving/getHotProduct")
    @Nullable
    Object getHotProduct(@NotNull Continuation<? super CommonBeanResult<QueryHotProductModuleResp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/finance-saving-product/fixed/saving/getHotProductWithoutLogin")
    @Nullable
    Object getHotProductWithoutLogin(@NotNull Continuation<? super CommonBeanResult<QueryHotProductModuleResp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/finance-bff-product/v1/marketingPosition/getMarketingPosition")
    @Nullable
    Object getMarketingPosition(@Body @JsonName("scene") int i7, @NotNull Continuation<? super CommonBeanResult<QuerySavingTaskModuleResp>> continuation);

    @GET("/api/cfront/merchant/merchantDisburseOrderDetail")
    @NotNull
    d<CommonBeanResult<MerchantDisburseOrderDetailRsp>> getMerchantDisburseOrderDetail(@Nullable @Query("orderNo") String orderNo);

    @GET("/api/cfront/merchant/queryMerchantLogoByMerId")
    @NotNull
    d<CommonBeanResult<MerchantLogoRsp>> getMerchantLogo(@Nullable @Query("merchantNo") String merchantNo);

    @GET("/api/cfront/merchant/merchantH5OrderDetail")
    @NotNull
    d<CommonBeanResult<MerchantOrderDetailRsp>> getMerchantOrderDetail(@Nullable @Query("orderNo") String orderNo);

    @Headers({"No-Token: yes"})
    @POST("/api/scene-activity-product/rewards/revision/getMoreTaskListV2")
    @Nullable
    Object getMoreRewardTaskList(@Body @NotNull PalmZoneTasksReq palmZoneTasksReq, @NotNull Continuation<? super PalmZoneTasksRsp> continuation);

    @GET("/api/scene-offline-product/payCode/queryPayCodeOrderDetail")
    @Nullable
    Object getOrderDetailByPayCode(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<PayCodeOrderDetailBean>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("/api/risk-control/compensationInfo/compensationDetail")
    @Nullable
    Object getPalmSafeDetail(@Nullable @Query("compensationNo") String str, @NotNull Continuation<? super CommonBeanResult<PalmSafeDetail>> continuation);

    @POST("/api/cfront/loyalty/statementView")
    @NotNull
    d<GetPointFlowRsp> getPointStatement(@Body @JsonName("loyaltyOrderId") @Nullable String loyaltyOrderId);

    @Headers({"No-Token: yes"})
    @GET("/api/finance-bff-product/v1/saving/finance/getRecommendContentInfo")
    @Nullable
    Object getRecommendContentInfo(@NotNull Continuation<? super CommonBeanResult<QueryRecommendModuleResp>> continuation);

    @POST("/api/cfront/bill/traHisRefundDetail")
    @NotNull
    d<CommonBeanResult<QueryRefundBillDetailRsp>> getRefundDetail(@Body @Nullable QueryRefundBillDetailReq req);

    @GET("/api/scene-activity-product/rewards/revision/getRewardPageInfoV2")
    @Nullable
    Object getRewardPageInfoV2(@NotNull Continuation<? super CommonBeanResult<HomeRewardsTabInfo>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/finance-bff-product/v1/wealth/index/getTopInfo")
    @Nullable
    Object getSavingFinanceHomeNotLogin(@NotNull Continuation<? super CommonBeanResult<InvestGuideBeanRsp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/finance-bff-product/v1/wealth/index/listTargetSavingCategory")
    @Nullable
    Object getSavingTarget(@NotNull Continuation<? super CommonListResultV2<QueryTargetSavingModuleResp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/c-bff-product/account/getmyassets")
    @Nullable
    Object getUserAssetsAmountForMVVM(@NotNull Continuation<? super GetUserAssetsAmountResp> continuation);

    @GET("/api/wallet-base-service/me/queryMyAssets")
    @Nullable
    Object getUserAssetsAmountV2(@NotNull Continuation<? super CommonBeanResult<GetUserAssetsAmountV2Resp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes", "No-Token: yes"})
    @POST("/api/finance-bff-product/v1/wealthCommon/getWealthMainbodyInfo/noLogin")
    Object getWealthMainbodyInfo(@Field("entry") @NotNull String str, @NotNull Continuation<? super CommonBeanResult<SavingMainBodyResultBean>> continuation);

    @POST("/api/member-product/right/guarantee/detail")
    @Nullable
    Object guaranteeDetail(@NotNull Continuation<? super CommonBeanResult<GuaranteeQueryRsp>> continuation);

    @GET("/api/online-agent-product/agent/teen/guardianAuthApplyRecord")
    @Nullable
    Object guardianAuthApplyRecord(@NotNull Continuation<? super CommonListResultV2<MinorAccountBean>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/online-agent-product/agent/teen/guardianCancelAuth")
    Object guardianCancelAuth(@Field("teenMemberId") @NotNull String str, @Field("validatorToken") @Nullable String str2, @Field("authCancelToken") @Nullable String str3, @Field("validatorType") @Nullable Integer num, @NotNull Continuation<? super CommonBooleanResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/online-agent-product/agent/teen/guardianCancelAuthPre")
    Object guardianCancelAuthPre(@Field("teenMemberId") @NotNull String str, @NotNull Continuation<? super CommonStringResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/wallet-bff-product/home/assert/banner/report")
    Object handleAsserBannerReport(@Field("businessId") @NotNull String str, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/message/msg/clearMessageBox")
    Object markMessageAsRead(@Field("msgObjectId") @Nullable String str, @Field("templateCode") @Nullable String str2, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"No-Token: yes", "Convert-Form-Data: yes"})
    @POST("/api/c-bff-product/home/v3/meMenu")
    Object mePageMenuList(@Field("enableBioLogin") @Nullable Boolean bool, @Field("enableBioPay") @Nullable Boolean bool2, @Field("systemNotification") @Nullable Boolean bool3, @Field("bioType") @Nullable Integer num, @NotNull Continuation<? super HomeMePageMenuRsp> continuation);

    @POST("/api/cfront/v2/activity/zone/getMyRewards")
    @NotNull
    d<CommonBeanResult<PalmZoneRewardsList>> palmZoneRewards(@Body @Nullable CommonPageListReq req);

    @GET("/api/cfront/mCustomerManagement/query/notication/bulk")
    @NotNull
    d<CommonBeanResult<BulkDisbursementOrderDetailRsp>> queryBulkDisbursementOrderDetail(@Nullable @Query("orderNo") String orderNo);

    @GET("/api/cfront/bill/chargeback")
    @NotNull
    d<CommonBeanResult<ChargeBackOrderRsp>> queryChargeBackOrderDetail(@Nullable @Query("orderNo") String orderNo);

    @GET("/api/cfront/settlement/incentive/queryOrderDetail")
    @NotNull
    d<CommonBeanResult<CommissionOrderDetailRsp>> queryCommissionOrderDetail(@Nullable @Query("orderNo") String orderNo);

    @GET("/api/scene-activity-product/rewards/getComboCoupons")
    @Nullable
    Object queryCouponList(@NotNull Continuation<? super CommonBeanResult<HomeCouponRewardsRsp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/finance-fund-product/v1/fund/listRankingListTypeWithFund")
    @Nullable
    Object queryFundModule(@Body @JsonName("entry") @NotNull String str, @NotNull Continuation<? super CommonBeanResult<QueryRankFundModuleResp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/finance-fund-product/v1/fund/listRankingListTypeWithFund/notLogin")
    @Nullable
    Object queryFundModuleWithoutLogin(@Body @JsonName("entry") @NotNull String str, @NotNull Continuation<? super CommonBeanResult<QueryRankFundModuleResp>> continuation);

    @Headers({"Ignore-Common-Dialog:yes", "Use_Sign_V2: yes"})
    @POST("/api/wallet-bff-product/wallet/home/queryHomeData1")
    @Nullable
    Object queryHomeAccountInfo(@NotNull Continuation<? super CommonBeanResult<QueryHomeAccountInfoRsp>> continuation);

    @Headers({"Use_Sign_V2: yes"})
    @POST("/api/c-bff-product/home/queryHomeData3")
    @Nullable
    Object queryHomeData3(@Body @NotNull QueryHomeBusinessReq queryHomeBusinessReq, @NotNull Continuation<? super CommonBeanResult<QueryHomeBusinessRsp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"No-Token: yes", "Convert-Form-Data: yes", "Use_Sign_V2: yes"})
    @POST("/api/wallet-bff-product/wallet/home/queryHomeData2")
    Object queryHomeInfo(@Field("funCount") int i7, @Field("appDowngrade") boolean z3, @NotNull Continuation<? super GetHomeCommonRsp> continuation);

    @Headers({"Use_Sign_V2: yes", "No-Token: yes", "Black-Code: yes"})
    @POST("/api/wallet-base-service/wallet/home/queryHomeData4")
    @Nullable
    Object queryHomeRewardTasks(@Body @NotNull PalmZoneTasksReq palmZoneTasksReq, @NotNull Continuation<? super CommonBeanResult<HomeRewardsCenterRsp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/finance-channels/v1/rockFlow/stock/hotStocks")
    @Nullable
    Object queryHotStocksModule(@NotNull Continuation<? super CommonListResultV2<QueryHotStockModuleResp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/finance-insure-product/v1/insure/query/hotProductList")
    @Nullable
    Object queryInsuranceModule(@NotNull Continuation<? super CommonListResultV2<QueryInsuranceModuleResp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/finance-insure-product/v1/insure/query/hotProductListWithoutLogin")
    @Nullable
    Object queryInsuranceModuleWithoutLogin(@NotNull Continuation<? super CommonListResultV2<QueryInsuranceModuleResp>> continuation);

    @POST("/api/cfront/member/queryInvitList")
    @NotNull
    d<InviteeListResp> queryInviteeList(@Body @Nullable InviteeListReq req);

    @Headers({"No-Token: yes"})
    @GET("/api/wallet-bff-product/home/queryTransactionHistoryLastList")
    @Nullable
    Object queryLastTransactionHistory(@NotNull Continuation<? super QueryLastTransactionHistoryRsp> continuation);

    @Headers({"Use_Sign_V2: yes"})
    @POST("/api/wallet-base-service/me/queryMeTop")
    @Nullable
    Object queryMeTabTotalAssetInfo(@NotNull Continuation<? super CommonBeanResult<MeTabTotalAssetInfo>> continuation);

    @POST("/api/cfront/merchant/queryBindMerchantInfo")
    @NotNull
    d<CommonListResultV2<MerchantListRsp>> queryMerchantList();

    @POST("/api/cfront/merchant/channel/calculation")
    @NotNull
    d<CommonBeanResult<MerchantOrderPreviewResp>> queryMerchantPreviewInfo(@Body @Nullable MerchantOrderPreviewReq req);

    @GET("/api/online-agent-product/agent/teen/teenManageInfo")
    @Nullable
    Object queryMinorAccountDetail(@Nullable @Query("teenMemberId") String str, @NotNull Continuation<? super CommonBeanResult<MinorAccountBean>> continuation);

    @GET("/api/scene-activity-product/rewards/revision/getHomeConfig")
    @Nullable
    Object queryModuleRank(@NotNull Continuation<? super CommonListResultV2<QueryModuleRankResp>> continuation);

    @GET("/api/cfront/member/amount/threshold/memberId")
    @Nullable
    Object queryOneStepPayThreshold(@NotNull Continuation<? super CommonBeanResult<ThresholdRsp>> continuation);

    @POST("/api/cfront/basic-data/queryAmountLimitCountryCode")
    @Nullable
    Object queryOneStepPaymentThresholds(@NotNull Continuation<? super ThresholdListRsp> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes"})
    @POST(" /api/social-product/lottery/member/availableLottery")
    Object queryPalmPrizeListResult(@Field("isSupportHide") @Nullable Boolean bool, @NotNull Continuation<? super CommonListResultV2<PalmPrizeItem>> continuation);

    @POST("/api/scene-activity-product/rewards/revision/getSpecialTaskListV2")
    @Nullable
    Object queryPalmZoneTasks(@Body @NotNull PalmZoneTasksReq palmZoneTasksReq, @NotNull Continuation<? super CommonBeanResult<PalmZoneTasksRspV2>> continuation);

    @POST("/api/cashier-center/cashier/config/app/queryPreferPaymentMethodList")
    @Nullable
    Object queryPaymentMethodList(@Body @NotNull PaymentMethodListResp.DataBean.Data data, @NotNull Continuation<? super CommonListResultV2<PaymentMethodListResp.DataBean.Data>> continuation);

    @POST("/api/online-agent-product/vip/benefit/benefitClaimCarousel")
    @Nullable
    Object queryPremiumNoticeWithReward(@Body @NotNull PremiumNoticeWithRewadReq premiumNoticeWithRewadReq, @NotNull Continuation<? super CommonBeanResult<PremiumBenefitsRewardNoticeBean>> continuation);

    @GET("/api/online-agent-product/vip/reward/homepage")
    @Nullable
    Object queryPremiumResultWithReward(@NotNull Continuation<? super CommonBeanResult<PremiumBenefitsRewardBean>> continuation);

    @GET("/api/cfront/referEarn/latest")
    @Nullable
    Object queryReferEarnHome(@NotNull Continuation<? super CommonBeanResult<PalmZoneReferEarnHomeResp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/finance-saving-product/v1/targetSaving/getTrendingTarget")
    @Nullable
    Object queryTargetModule(@NotNull Continuation<? super CommonBeanResult<QueryTargetSavingsModuleResp>> continuation);

    @POST("/api/cfront/merchant/queryThirdPartyMerchant")
    @NotNull
    d<ThirdPartyMerchantListResp> queryThirdPartyMerchant();

    @POST("/api/cfront/merchant/queryThirdPartyMerchantById")
    @NotNull
    d<ThirdPartyMerchantResp> queryThirdPartyMerchantById();

    @GET("/api/cfront/merchant/channel/queryMerChannelDetail")
    @NotNull
    d<CommonBeanResult<ThirdPartyMerchantOrderDetailResp>> queryThirdPartyMerchantOrderDetail(@Nullable @Query("orderNo") String orderNo);

    @POST("/api/c-bff-product/bill/v2/queryWardBillList")
    @Nullable
    Object queryWardBillList(@Body @Nullable TransHistoryReqV2 transHistoryReqV2, @NotNull Continuation<? super TransHistoryRspV2> continuation);

    @GET("/api/scene-activity-product/welcomeback/getHomeWelcomeRewardInfo")
    @Nullable
    Object queryWelcomeBackCoupon(@NotNull Continuation<? super CommonBeanResult<WelcomeCouponData>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/c-bff-product/startAppBasic/queryRegisterAd")
    @Nullable
    Object queryWelcomeNewUserConfig(@Nullable @Query("gaId") String str, @NotNull Continuation<? super CommonBeanResult<WelcomeNewUserConfigRsp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/scene-activity-product/rewardSpecial/getRewardHistory")
    @Nullable
    Object queryZoneTaskReward(@Body @NotNull CommonListReq commonListReq, @NotNull Continuation<? super CommonBeanResult<PalmZoneTaskRewardsListResp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/c-bff-product/home/darkModeSetting")
    Object reportDarkModeSetting(@Field("status") @Nullable Integer num, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/thirdOpenid/authorization")
    @NotNull
    d<CommonBeanResult<ThirdAuthorizationCodeResp>> requestAuthorization(@Body @Nullable ThirdAuthorizationCodeReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/c-bff-product/member/amount/threshold/modifyV2")
    @Nullable
    Object setOneStepPayThreshold(@Body @Nullable ThresholdReq thresholdReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cashier-center/cashier/config/app/setPreferPaymentMethod")
    @Nullable
    Object setPaymentMethod(@Body @NotNull PaymentMethodListResp.DataBean.Data data, @NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/cfront/merchant/unbindMerchantInfo")
    @NotNull
    d<CommonResult> unbindMerchant(@Nullable @Query("merchantNo") String merchantNo);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/finance-saving-product/autoTransfer/update")
    Object updateAutoTransferConfig(@Field("isAutoTransfer") int i7, @Field("source") @Nullable String str, @NotNull Continuation<? super CommonBeanResult<UpdateAutoTransferConfig>> continuation);
}
