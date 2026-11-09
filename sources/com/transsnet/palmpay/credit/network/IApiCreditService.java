package com.transsnet.palmpay.credit.network;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonBooleanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonLongResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.req.CommonPageListReq;
import com.transsnet.palmpay.core.bean.req.UploadAppListV2Req;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoReq;
import com.transsnet.palmpay.core.bean.rsp.AllAuthInfoRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryUserCouponsRsp;
import com.transsnet.palmpay.core.bean.rsp.UploadAppListV2Rsp;
import com.transsnet.palmpay.core.network.annotation.JsonName;
import com.transsnet.palmpay.credit.bean.BorrowAllDiscountConfig;
import com.transsnet.palmpay.credit.bean.CouponAndPoint;
import com.transsnet.palmpay.credit.bean.FlexiCashBalanceData;
import com.transsnet.palmpay.credit.bean.LoanEnterPreCheckInfo;
import com.transsnet.palmpay.credit.bean.LoanHomeDataInfoV2;
import com.transsnet.palmpay.credit.bean.RaiseRecord;
import com.transsnet.palmpay.credit.bean.UnfreezeResp;
import com.transsnet.palmpay.credit.bean.UserDeduceDateResp;
import com.transsnet.palmpay.credit.bean.req.CLBillDetailReq;
import com.transsnet.palmpay.credit.bean.req.CLBorrowAllDiscountConfigReq;
import com.transsnet.palmpay.credit.bean.req.CLCalcReturnSendCouponReq;
import com.transsnet.palmpay.credit.bean.req.CLComparePhotoReq;
import com.transsnet.palmpay.credit.bean.req.CLComparePhotoResp;
import com.transsnet.palmpay.credit.bean.req.CLCreateDownPaymentWalletOrderReq;
import com.transsnet.palmpay.credit.bean.req.CLCurrentBillReq;
import com.transsnet.palmpay.credit.bean.req.CLFamilyAndFriendPayReq;
import com.transsnet.palmpay.credit.bean.req.CLHistoryBillReq;
import com.transsnet.palmpay.credit.bean.req.CLInitReq;
import com.transsnet.palmpay.credit.bean.req.CLOpenAccountReq;
import com.transsnet.palmpay.credit.bean.req.CLQueryApplyAuditResultReq;
import com.transsnet.palmpay.credit.bean.req.CLRepayOrderReq;
import com.transsnet.palmpay.credit.bean.req.CLRepaymentPlanReq;
import com.transsnet.palmpay.credit.bean.req.CLRepaymentPlanV4Req;
import com.transsnet.palmpay.credit.bean.req.CLSaveCashierContextReq;
import com.transsnet.palmpay.credit.bean.req.CLTaskReq;
import com.transsnet.palmpay.credit.bean.req.CLWithdrawReq;
import com.transsnet.palmpay.credit.bean.req.DoubleSignReq;
import com.transsnet.palmpay.credit.bean.req.GetAvailableCouponListReq;
import com.transsnet.palmpay.credit.bean.req.GetPriorityCouponReq;
import com.transsnet.palmpay.credit.bean.req.MTNLoginReq;
import com.transsnet.palmpay.credit.bean.req.MultiMediaReq;
import com.transsnet.palmpay.credit.bean.req.OLRepaymentListReq;
import com.transsnet.palmpay.credit.bean.req.OcAddContactReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyReq;
import com.transsnet.palmpay.credit.bean.req.OcFeedbackReq;
import com.transsnet.palmpay.credit.bean.req.OcLocationInfoReq;
import com.transsnet.palmpay.credit.bean.req.OcOrderDetailReq;
import com.transsnet.palmpay.credit.bean.req.OcOrderReq;
import com.transsnet.palmpay.credit.bean.req.OcPhoneLockErrorReq;
import com.transsnet.palmpay.credit.bean.req.OcRepaidRecordListReq;
import com.transsnet.palmpay.credit.bean.req.OcRouterReq;
import com.transsnet.palmpay.credit.bean.req.OcSaveSmsTokenReq;
import com.transsnet.palmpay.credit.bean.req.OcUnfreezeReq;
import com.transsnet.palmpay.credit.bean.req.OcUploadALiFaceResultReq;
import com.transsnet.palmpay.credit.bean.req.OcUploadDeviceInfo;
import com.transsnet.palmpay.credit.bean.req.OcUploadRouterReq;
import com.transsnet.palmpay.credit.bean.req.OcVerifyOneLoopReq;
import com.transsnet.palmpay.credit.bean.req.PermissionReq;
import com.transsnet.palmpay.credit.bean.req.QueryBusinessConfigReq;
import com.transsnet.palmpay.credit.bean.req.QueryInstallmentWithdrawReq;
import com.transsnet.palmpay.credit.bean.req.QueryLoanAmountIncreaseReq;
import com.transsnet.palmpay.credit.bean.req.QueryMemberDetailReq;
import com.transsnet.palmpay.credit.bean.req.QueryRecipientReq;
import com.transsnet.palmpay.credit.bean.req.QueryWithdrawPreReq;
import com.transsnet.palmpay.credit.bean.req.SendMTNOTPReq;
import com.transsnet.palmpay.credit.bean.req.SendOneLoopOTPReq;
import com.transsnet.palmpay.credit.bean.req.SignInstallmentWithdrawReq;
import com.transsnet.palmpay.credit.bean.req.TemporaryUnlockReq;
import com.transsnet.palmpay.credit.bean.req.TriggerFullExemptionReq;
import com.transsnet.palmpay.credit.bean.req.UpLoadLoanDialogPopUps;
import com.transsnet.palmpay.credit.bean.req.UploadDeviceLocationReq;
import com.transsnet.palmpay.credit.bean.req.UploadMonoTokenReq;
import com.transsnet.palmpay.credit.bean.resp.CLBillDetailResp;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponResp;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLCalcReturnSendCouponResp;
import com.transsnet.palmpay.credit.bean.resp.CLCashInfoResp;
import com.transsnet.palmpay.credit.bean.resp.CLCheckBvnResp;
import com.transsnet.palmpay.credit.bean.resp.CLCreateDownPaymentWalletOrderResp;
import com.transsnet.palmpay.credit.bean.resp.CLCurrentBillResp;
import com.transsnet.palmpay.credit.bean.resp.CLExtendPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLFamilyAndFriendPayResp;
import com.transsnet.palmpay.credit.bean.resp.CLFirstRepaymentResp;
import com.transsnet.palmpay.credit.bean.resp.CLH5BorrowUrlResp;
import com.transsnet.palmpay.credit.bean.resp.CLHistoryBillResp;
import com.transsnet.palmpay.credit.bean.resp.CLInitResp;
import com.transsnet.palmpay.credit.bean.resp.CLInstallmentLoanMainPageResp;
import com.transsnet.palmpay.credit.bean.resp.CLInstallmentLoanRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLMultipleRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountResp;
import com.transsnet.palmpay.credit.bean.resp.CLOpenUserListResp;
import com.transsnet.palmpay.credit.bean.resp.CLOrderDetailResp;
import com.transsnet.palmpay.credit.bean.resp.CLQueryApplyAuditResultResp;
import com.transsnet.palmpay.credit.bean.resp.CLQueryBorrowLoanProductResp;
import com.transsnet.palmpay.credit.bean.resp.CLQueryFirstLoanBean;
import com.transsnet.palmpay.credit.bean.resp.CLRepayOrderData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanV4Resp;
import com.transsnet.palmpay.credit.bean.resp.CLShortCashRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLTaskResp;
import com.transsnet.palmpay.credit.bean.resp.CLWithdrawResp;
import com.transsnet.palmpay.credit.bean.resp.CreditIncreaseInfo;
import com.transsnet.palmpay.credit.bean.resp.MTNLoginResp;
import com.transsnet.palmpay.credit.bean.resp.OcActivityConfigResp;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultResp;
import com.transsnet.palmpay.credit.bean.resp.OcAutoDeductOrderDetailRsp;
import com.transsnet.palmpay.credit.bean.resp.OcAutoRepaymentListResp;
import com.transsnet.palmpay.credit.bean.resp.OcBillInsRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.OcClOverdueBillResp;
import com.transsnet.palmpay.credit.bean.resp.OcDefaultPayMethodStatusResp;
import com.transsnet.palmpay.credit.bean.resp.OcExtendBillResp;
import com.transsnet.palmpay.credit.bean.resp.OcFeedbackHistoryResp;
import com.transsnet.palmpay.credit.bean.resp.OcFinanceMenuResp;
import com.transsnet.palmpay.credit.bean.resp.OcGoldCardLevelResp;
import com.transsnet.palmpay.credit.bean.resp.OcHasUnFreezeResp;
import com.transsnet.palmpay.credit.bean.resp.OcHistoryBillListResp;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseLimitResp;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseListResp;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseResp;
import com.transsnet.palmpay.credit.bean.resp.OcInsRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.OcInstallmentQRBillDetailResp;
import com.transsnet.palmpay.credit.bean.resp.OcInstallmentRaiseAmountRsp;
import com.transsnet.palmpay.credit.bean.resp.OcInterestRulesResp;
import com.transsnet.palmpay.credit.bean.resp.OcInviteCodeResp;
import com.transsnet.palmpay.credit.bean.resp.OcInviteListResp;
import com.transsnet.palmpay.credit.bean.resp.OcLockWhiteResp;
import com.transsnet.palmpay.credit.bean.resp.OcMarqueeResp;
import com.transsnet.palmpay.credit.bean.resp.OcOneLoopDataResp;
import com.transsnet.palmpay.credit.bean.resp.OcOrderDetailResp;
import com.transsnet.palmpay.credit.bean.resp.OcOrderRsp;
import com.transsnet.palmpay.credit.bean.resp.OcPhoneNumberValidResp;
import com.transsnet.palmpay.credit.bean.resp.OcReferEarnWithdrawResp;
import com.transsnet.palmpay.credit.bean.resp.OcRepayBillResp;
import com.transsnet.palmpay.credit.bean.resp.OcRepayExitResp;
import com.transsnet.palmpay.credit.bean.resp.OcRewardListResp;
import com.transsnet.palmpay.credit.bean.resp.OcRouterResp;
import com.transsnet.palmpay.credit.bean.resp.OcSignStatusResp;
import com.transsnet.palmpay.credit.bean.resp.OcSkipOneLoopResp;
import com.transsnet.palmpay.credit.bean.resp.OcSumRewardResp;
import com.transsnet.palmpay.credit.bean.resp.OcTotalOverpaymentResp;
import com.transsnet.palmpay.credit.bean.resp.OcUpgradeGoldCardResp;
import com.transsnet.palmpay.credit.bean.resp.OcWithdrawListResp;
import com.transsnet.palmpay.credit.bean.resp.PalmPayCardBillDetailReq;
import com.transsnet.palmpay.credit.bean.resp.QueryCanBorrowAgainResp;
import com.transsnet.palmpay.credit.bean.resp.QueryCreditIncreaseResp;
import com.transsnet.palmpay.credit.bean.resp.QueryFlexiPaymentViewSwitchResp;
import com.transsnet.palmpay.credit.bean.resp.QueryInstallmentWithdrawResp;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.credit.bean.resp.QueryMemberByKeywordResp;
import com.transsnet.palmpay.credit.bean.resp.QueryMemberDetailResp;
import com.transsnet.palmpay.credit.bean.resp.QueryOneLoopInfoResp;
import com.transsnet.palmpay.credit.bean.resp.QueryPopUpsBean;
import com.transsnet.palmpay.credit.bean.resp.QueryWithdrawPreCheckResp;
import com.transsnet.palmpay.credit.bean.resp.RecipientListResp;
import com.transsnet.palmpay.credit.bean.resp.ReferEarnHomeResp;
import com.transsnet.palmpay.credit.bean.resp.SendMTNOTPResp;
import com.transsnet.palmpay.credit.bean.resp.TemporaryUnlockResp;
import com.transsnet.palmpay.credit.bean.resp.TopUpOrderDetailRsp;
import com.transsnet.palmpay.credit.bean.resp.TransferSuccessExistsData;
import com.transsnet.palmpay.credit.bean.resp.TriggerFullExemptionData;
import com.transsnet.palmpay.credit.bean.resp.UnfreezePopupDataResp;
import com.transsnet.palmpay.credit.bean.rsp.CLCanBorrowResp;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.bean.rsp.CLProductResp;
import com.transsnet.palmpay.credit.bean.rsp.CommonLinkRsp;
import com.transsnet.palmpay.credit.bean.rsp.FinanceStatusResp;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentCardListResp;
import com.transsnet.palmpay.credit.bean.rsp.OcAllBillListResp;
import com.transsnet.palmpay.credit.bean.rsp.OcBillDetailResp;
import com.transsnet.palmpay.credit.bean.rsp.OcBillInstallmentBillResp;
import com.transsnet.palmpay.credit.bean.rsp.OcOfflineInstallmentBillResp;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListResp;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRsp;
import com.transsnet.palmpay.credit.bean.rsp.OpenCashProductResp;
import com.transsnet.palmpay.credit.bean.rsp.PalmPayCardBillDetailResp;
import com.transsnet.palmpay.credit.bean.rsp.QueryDataInfoResp;
import com.transsnet.palmpay.credit.bean.rsp.QueryLoanUserConfigResp;
import com.transsnet.palmpay.credit.bean.rsp.QueryPopUpsReq;
import com.transsnet.palmpay.credit.bean.rsp.QuerySysConfigResp;
import com.transsnet.palmpay.util.OcCameraInfoBean;
import df.d;
import java.util.ArrayList;
import java.util.Map;
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
@Metadata(d1 = {"\u0000ö\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\fH'¢\u0006\u0004\b\u0010\u0010\u000fJ/\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\b2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b \u0010\u001eJ\u001a\u0010#\u001a\u00020\"2\b\b\u0001\u0010\u0003\u001a\u00020!H§@¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\b2\b\b\u0001\u0010\u0003\u001a\u00020%H'¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0\b2\b\b\u0001\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0\b2\b\b\u0001\u0010\u0003\u001a\u00020+H'¢\u0006\u0004\b,\u0010-J!\u00101\u001a\b\u0012\u0004\u0012\u0002000\b2\n\b\u0001\u0010/\u001a\u0004\u0018\u00010.H'¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\b\u0012\u0004\u0012\u0002030\bH'¢\u0006\u0004\b4\u00105J#\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\b2\n\b\u0001\u00106\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b8\u0010\u001aJ\u0015\u0010:\u001a\b\u0012\u0004\u0012\u0002090\bH'¢\u0006\u0004\b:\u00105J\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\bH'¢\u0006\u0004\b<\u00105J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\bH'¢\u0006\u0004\b>\u00105J\u0015\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\bH'¢\u0006\u0004\b@\u00105J\u0015\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\bH'¢\u0006\u0004\bB\u00105J\u0015\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\bH'¢\u0006\u0004\bD\u00105J\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\bH'¢\u0006\u0004\bF\u00105J\u0015\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\bH'¢\u0006\u0004\bH\u00105J\u0015\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\bH'¢\u0006\u0004\bJ\u00105J\u001f\u0010L\u001a\b\u0012\u0004\u0012\u00020\"0\b2\b\b\u0001\u0010\u0003\u001a\u00020KH'¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\bH'¢\u0006\u0004\bO\u00105J\u001f\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\b2\b\b\u0001\u0010\u0003\u001a\u00020PH'¢\u0006\u0004\bR\u0010SJ\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\b2\b\b\u0001\u0010\u0003\u001a\u00020TH'¢\u0006\u0004\bV\u0010WJ\u001a\u0010X\u001a\u00020U2\b\b\u0001\u0010\u0003\u001a\u00020TH§@¢\u0006\u0004\bX\u0010YJ\u0015\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\bH'¢\u0006\u0004\b[\u00105J\u0015\u0010\\\u001a\b\u0012\u0004\u0012\u00020Z0\bH'¢\u0006\u0004\b\\\u00105J\u001f\u0010^\u001a\b\u0012\u0004\u0012\u00020Q0\b2\b\b\u0001\u0010\u0003\u001a\u00020]H'¢\u0006\u0004\b^\u0010_J\u001a\u0010`\u001a\u00020Q2\b\b\u0001\u0010\u0003\u001a\u00020]H§@¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020\"H§@¢\u0006\u0004\bb\u0010cJ\u001f\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\b2\b\b\u0001\u0010\u0003\u001a\u00020dH'¢\u0006\u0004\bf\u0010gJ\u001a\u0010h\u001a\u00020e2\b\b\u0001\u0010\u0003\u001a\u00020dH§@¢\u0006\u0004\bh\u0010iJ9\u0010n\u001a\b\u0012\u0004\u0012\u00020m0\b2\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010l\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\bn\u0010oJ\u001f\u0010q\u001a\b\u0012\u0004\u0012\u00020e0\b2\b\b\u0001\u0010\u0003\u001a\u00020pH'¢\u0006\u0004\bq\u0010rJ\u001f\u0010u\u001a\b\u0012\u0004\u0012\u00020t0\b2\b\b\u0001\u0010\u0003\u001a\u00020sH'¢\u0006\u0004\bu\u0010vJ\u0015\u0010x\u001a\b\u0012\u0004\u0012\u00020w0\bH'¢\u0006\u0004\bx\u00105J\u0015\u0010y\u001a\b\u0012\u0004\u0012\u00020w0\bH'¢\u0006\u0004\by\u00105J!\u0010}\u001a\b\u0012\u0004\u0012\u00020|0\b2\n\b\u0001\u0010{\u001a\u0004\u0018\u00010zH'¢\u0006\u0004\b}\u0010~J$\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\b2\n\b\u0001\u0010\u007f\u001a\u0004\u0018\u00010zH'¢\u0006\u0005\b\u0081\u0001\u0010~J \u0010\u0082\u0001\u001a\u00030\u0080\u00012\n\b\u0001\u0010\u007f\u001a\u0004\u0018\u00010zH§@¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J'\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0084\u00012\n\b\u0001\u0010l\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0012\u0010\u0088\u0001\u001a\u00020wH§@¢\u0006\u0005\b\u0088\u0001\u0010cJ&\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0089\u0001H'¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J$\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030\u008d\u0001H'¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J+\u0010\u0093\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0092\u00010\u0084\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030\u0091\u0001H'¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J$\u0010\u0097\u0001\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030\u0095\u0001H'¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J$\u0010\u009b\u0001\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030\u0099\u0001H'¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J$\u0010\u009d\u0001\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030\u0099\u0001H'¢\u0006\u0006\b\u009d\u0001\u0010\u009c\u0001J&\u0010\u009f\u0001\u001a\t\u0012\u0005\u0012\u00030\u009e\u00010\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0089\u0001H'¢\u0006\u0006\b\u009f\u0001\u0010\u008c\u0001J$\u0010¢\u0001\u001a\t\u0012\u0005\u0012\u00030¡\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030 \u0001H'¢\u0006\u0006\b¢\u0001\u0010£\u0001J%\u0010¦\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010\b2\u000b\b\u0001\u0010¤\u0001\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\b¦\u0001\u0010\u001aJ%\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010§\u0001H'¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001a\u0010«\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010ª\u00010\bH'¢\u0006\u0005\b«\u0001\u00105J \u0010\u00ad\u0001\u001a\u00030¬\u00012\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0006\b\u00ad\u0001\u0010\u0087\u0001J$\u0010®\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010\b2\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\b®\u0001\u0010\u001aJ \u0010¯\u0001\u001a\u00020\"2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010§\u0001H§@¢\u0006\u0006\b¯\u0001\u0010°\u0001J'\u0010±\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010§\u0001H'¢\u0006\u0006\b±\u0001\u0010©\u0001J)\u0010µ\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010´\u00010\b2\f\b\u0001\u0010³\u0001\u001a\u0005\u0018\u00010²\u0001H'¢\u0006\u0006\bµ\u0001\u0010¶\u0001J'\u0010¸\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010·\u0001H'¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u0013\u0010»\u0001\u001a\u00030º\u0001H§@¢\u0006\u0005\b»\u0001\u0010cJ\u0018\u0010¼\u0001\u001a\t\u0012\u0005\u0012\u00030º\u00010\bH'¢\u0006\u0005\b¼\u0001\u00105J6\u0010Á\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010À\u00010\b2\u000b\b\u0001\u0010½\u0001\u001a\u0004\u0018\u00010\u00112\f\b\u0001\u0010¿\u0001\u001a\u0005\u0018\u00010¾\u0001H'¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J'\u0010Ä\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Ã\u00010\b2\u000b\b\u0001\u0010½\u0001\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\bÄ\u0001\u0010\u001aJ]\u0010È\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Ç\u00010\b2\u000b\b\u0001\u0010½\u0001\u001a\u0004\u0018\u00010\u00112\f\b\u0001\u0010³\u0001\u001a\u0005\u0018\u00010²\u00012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00112\f\b\u0001\u0010Å\u0001\u001a\u0005\u0018\u00010¾\u00012\u000b\b\u0001\u0010Æ\u0001\u001a\u0004\u0018\u00010zH'¢\u0006\u0006\bÈ\u0001\u0010É\u0001J&\u0010Ì\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Ë\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030Ê\u0001H'¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J#\u0010Î\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\bÎ\u0001\u0010\u001aJ$\u0010Ñ\u0001\u001a\t\u0012\u0005\u0012\u00030Ð\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030Ï\u0001H'¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J$\u0010Ó\u0001\u001a\t\u0012\u0005\u0012\u00030Ð\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030Ï\u0001H'¢\u0006\u0006\bÓ\u0001\u0010Ò\u0001J\u001f\u0010Ô\u0001\u001a\u00030Ð\u00012\t\b\u0001\u0010\u0003\u001a\u00030Ï\u0001H§@¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u001a\u0010×\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Ö\u00010\bH'¢\u0006\u0005\b×\u0001\u00105J$\u0010Ú\u0001\u001a\t\u0012\u0005\u0012\u00030Ù\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030Ø\u0001H'¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J&\u0010Ý\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Ü\u00010\b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\bÝ\u0001\u0010\u001aJ4\u0010ß\u0001\u001a\t\u0012\u0005\u0012\u00030Þ\u00010\b2\f\b\u0001\u0010³\u0001\u001a\u0005\u0018\u00010²\u00012\u000b\b\u0001\u0010½\u0001\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0006\bß\u0001\u0010à\u0001J$\u0010ã\u0001\u001a\t\u0012\u0005\u0012\u00030â\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030á\u0001H'¢\u0006\u0006\bã\u0001\u0010ä\u0001J$\u0010ç\u0001\u001a\t\u0012\u0005\u0012\u00030æ\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030å\u0001H'¢\u0006\u0006\bç\u0001\u0010è\u0001J'\u0010ê\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010é\u00010\b2\u000b\b\u0001\u0010½\u0001\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\bê\u0001\u0010\u001aJ&\u0010ì\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010ë\u00010\b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\bì\u0001\u0010\u001aJ\u0018\u0010î\u0001\u001a\t\u0012\u0005\u0012\u00030í\u00010\bH'¢\u0006\u0005\bî\u0001\u00105J&\u0010ï\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u008a\u00010\b2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\bï\u0001\u0010\u001aJ\u0013\u0010ñ\u0001\u001a\u00030ð\u0001H§@¢\u0006\u0005\bñ\u0001\u0010cJ\u0018\u0010ó\u0001\u001a\t\u0012\u0005\u0012\u00030ò\u00010\bH'¢\u0006\u0005\bó\u0001\u00105J\u0013\u0010ô\u0001\u001a\u00030ò\u0001H§@¢\u0006\u0005\bô\u0001\u0010cJ$\u0010÷\u0001\u001a\t\u0012\u0005\u0012\u00030ö\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030õ\u0001H'¢\u0006\u0006\b÷\u0001\u0010ø\u0001J$\u0010û\u0001\u001a\t\u0012\u0005\u0012\u00030ú\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030ù\u0001H'¢\u0006\u0006\bû\u0001\u0010ü\u0001J\"\u0010þ\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\b2\t\b\u0001\u0010ý\u0001\u001a\u00020\u0011H'¢\u0006\u0005\bþ\u0001\u0010\u001aJ$\u0010\u0080\u0002\u001a\t\u0012\u0005\u0012\u00030ÿ\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030õ\u0001H'¢\u0006\u0006\b\u0080\u0002\u0010ø\u0001J\"\u0010\u0082\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\b2\b\b\u0001\u0010l\u001a\u00020\u0011H'¢\u0006\u0005\b\u0082\u0002\u0010\u001aJ\u0018\u0010\u0084\u0002\u001a\t\u0012\u0005\u0012\u00030\u0083\u00020\bH'¢\u0006\u0005\b\u0084\u0002\u00105J$\u0010\u0086\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u00020\b2\b\b\u0001\u0010l\u001a\u00020\u0011H'¢\u0006\u0005\b\u0086\u0002\u0010\u001aJ\u001a\u0010\u0088\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0087\u00020\bH'¢\u0006\u0005\b\u0088\u0002\u00105J\u0013\u0010\u0089\u0002\u001a\u00030\u0087\u0002H§@¢\u0006\u0005\b\u0089\u0002\u0010cJ \u0010\u008b\u0002\u001a\u00020\"2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u008a\u0002H§@¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J%\u0010\u008f\u0002\u001a\t\u0012\u0005\u0012\u00030\u008e\u00020\b2\u000b\b\u0001\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\b\u008f\u0002\u0010\u001aJ\u0013\u0010\u0091\u0002\u001a\u00030\u0090\u0002H§@¢\u0006\u0005\b\u0091\u0002\u0010cJ.\u0010\u0094\u0002\u001a\u00030\u0093\u00022\u000b\b\u0001\u0010½\u0001\u001a\u0004\u0018\u00010\u00112\u000b\b\u0001\u0010\u0092\u0002\u001a\u0004\u0018\u00010zH§@¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002J%\u0010\u0098\u0002\u001a\t\u0012\u0005\u0012\u00030\u0097\u00020\b2\u000b\b\u0001\u0010\u0096\u0002\u001a\u0004\u0018\u00010zH'¢\u0006\u0005\b\u0098\u0002\u0010~J%\u0010\u009b\u0002\u001a\t\u0012\u0005\u0012\u00030\u009a\u00020\b2\u000b\b\u0001\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\b\u009b\u0002\u0010\u001aJ\u0013\u0010\u009d\u0002\u001a\u00030\u009c\u0002H§@¢\u0006\u0005\b\u009d\u0002\u0010cJ\u001a\u0010\u009f\u0002\u001a\n\u0012\u0005\u0012\u00030\u009e\u00020\u0084\u0001H§@¢\u0006\u0005\b\u009f\u0002\u0010cJ\u0018\u0010¡\u0002\u001a\t\u0012\u0005\u0012\u00030 \u00020\bH'¢\u0006\u0005\b¡\u0002\u00105J-\u0010¤\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030£\u00020\u0084\u00010\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010¢\u0002H'¢\u0006\u0006\b¤\u0002\u0010¥\u0002J&\u0010¨\u0002\u001a\t\u0012\u0005\u0012\u00030§\u00020\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010¦\u0002H'¢\u0006\u0006\b¨\u0002\u0010©\u0002J$\u0010«\u0002\u001a\t\u0012\u0005\u0012\u00030ª\u00020\b2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\b«\u0002\u0010\u001aJ\u0013\u0010\u00ad\u0002\u001a\u00030¬\u0002H§@¢\u0006\u0005\b\u00ad\u0002\u0010cJ\u0012\u0010®\u0002\u001a\u00020\"H§@¢\u0006\u0005\b®\u0002\u0010cJ$\u0010±\u0002\u001a\t\u0012\u0005\u0012\u00030°\u00020\b2\t\b\u0001\u0010\u0003\u001a\u00030¯\u0002H'¢\u0006\u0006\b±\u0002\u0010²\u0002J#\u0010³\u0002\u001a\b\u0012\u0004\u0012\u00020\"0\b2\t\b\u0001\u0010\u0003\u001a\u00030¯\u0002H'¢\u0006\u0006\b³\u0002\u0010²\u0002J!\u0010¶\u0002\u001a\u00030µ\u00022\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010´\u0002H§@¢\u0006\u0006\b¶\u0002\u0010·\u0002J\u0013\u0010¹\u0002\u001a\u00030¸\u0002H§@¢\u0006\u0005\b¹\u0002\u0010cJ\u001a\u0010»\u0002\u001a\n\u0012\u0005\u0012\u00030º\u00020\u0084\u0001H§@¢\u0006\u0005\b»\u0002\u0010cJ\u0013\u0010½\u0002\u001a\u00030¼\u0002H§@¢\u0006\u0005\b½\u0002\u0010cJ\u0018\u0010¾\u0002\u001a\t\u0012\u0005\u0012\u00030¼\u00020\bH'¢\u0006\u0005\b¾\u0002\u00105J$\u0010À\u0002\u001a\t\u0012\u0005\u0012\u00030â\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030¿\u0002H'¢\u0006\u0006\bÀ\u0002\u0010Á\u0002J&\u0010Ã\u0002\u001a\t\u0012\u0005\u0012\u00030æ\u00010\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Â\u0002H'¢\u0006\u0006\bÃ\u0002\u0010Ä\u0002J%\u0010Ç\u0002\u001a\t\u0012\u0005\u0012\u00030Æ\u00020\b2\u000b\b\u0001\u0010Å\u0002\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\bÇ\u0002\u0010\u001aJ\u001a\u0010Ê\u0002\u001a\n\u0012\u0005\u0012\u00030É\u00020È\u0002H§@¢\u0006\u0005\bÊ\u0002\u0010cJ<\u0010Î\u0002\u001a!\u0012\u001d\u0012\u001b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u00110Ì\u0002j\t\u0012\u0004\u0012\u00020\u0011`Í\u00020\u0084\u00010\b2\t\b\u0001\u0010Ë\u0002\u001a\u00020zH'¢\u0006\u0006\bÎ\u0002\u0010Ï\u0002J$\u0010Ñ\u0002\u001a\t\u0012\u0005\u0012\u00030Ð\u00020\b2\t\b\u0001\u0010Ë\u0002\u001a\u00020zH'¢\u0006\u0006\bÑ\u0002\u0010Ï\u0002J%\u0010Ô\u0002\u001a\t\u0012\u0005\u0012\u00030Ó\u00020\b2\u000b\b\u0001\u0010Ò\u0002\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\bÔ\u0002\u0010\u001aJ!\u0010Õ\u0002\u001a\u00030Ó\u00022\u000b\b\u0001\u0010Ò\u0002\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0006\bÕ\u0002\u0010\u0087\u0001J&\u0010Ø\u0002\u001a\t\u0012\u0005\u0012\u00030×\u00020\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Ö\u0002H'¢\u0006\u0006\bØ\u0002\u0010Ù\u0002J&\u0010Û\u0002\u001a\t\u0012\u0005\u0012\u00030×\u00020\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Ú\u0002H'¢\u0006\u0006\bÛ\u0002\u0010Ü\u0002J)\u0010ß\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Þ\u00020\b2\f\b\u0001\u0010Ý\u0002\u001a\u0005\u0018\u00010¾\u0001H'¢\u0006\u0006\bß\u0002\u0010à\u0002J\"\u0010á\u0002\u001a\u00030Þ\u00022\f\b\u0001\u0010Ý\u0002\u001a\u0005\u0018\u00010¾\u0001H§@¢\u0006\u0006\bá\u0002\u0010â\u0002J'\u0010ä\u0002\u001a\t\u0012\u0005\u0012\u00030ã\u00020\b2\f\b\u0001\u0010³\u0001\u001a\u0005\u0018\u00010²\u0001H'¢\u0006\u0006\bä\u0002\u0010¶\u0001J4\u0010æ\u0002\u001a\t\u0012\u0005\u0012\u00030ã\u00020\b2\u000b\b\u0001\u0010½\u0001\u001a\u0004\u0018\u00010\u00112\f\b\u0001\u0010å\u0002\u001a\u0005\u0018\u00010²\u0001H'¢\u0006\u0006\bæ\u0002\u0010ç\u0002J%\u0010é\u0002\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010è\u0002H'¢\u0006\u0006\bé\u0002\u0010ê\u0002J\u001f\u0010í\u0002\u001a\u00030ì\u00022\t\b\u0001\u0010\u0003\u001a\u00030ë\u0002H§@¢\u0006\u0006\bí\u0002\u0010î\u0002J4\u0010ñ\u0002\u001a\n\u0012\u0005\u0012\u00030ð\u00020\u0084\u00012\n\b\u0001\u0010{\u001a\u0004\u0018\u00010z2\u000b\b\u0001\u0010ï\u0002\u001a\u0004\u0018\u00010zH§@¢\u0006\u0006\bñ\u0002\u0010ò\u0002J9\u0010ó\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030ð\u00020\u0084\u00010\b2\n\b\u0001\u0010{\u001a\u0004\u0018\u00010z2\u000b\b\u0001\u0010ï\u0002\u001a\u0004\u0018\u00010zH'¢\u0006\u0006\bó\u0002\u0010ô\u0002J\u001f\u0010õ\u0002\u001a\u00020|2\n\b\u0001\u0010{\u001a\u0004\u0018\u00010zH§@¢\u0006\u0006\bõ\u0002\u0010\u0083\u0001J\u001f\u0010ö\u0002\u001a\u00030\u009a\u00012\t\b\u0001\u0010\u0003\u001a\u00030\u0099\u0001H§@¢\u0006\u0006\bö\u0002\u0010÷\u0002J\u001f\u0010ø\u0002\u001a\u00030\u009a\u00012\t\b\u0001\u0010\u0003\u001a\u00030\u0099\u0001H§@¢\u0006\u0006\bø\u0002\u0010÷\u0002J\u001f\u0010ù\u0002\u001a\u00030\u009a\u00012\t\b\u0001\u0010\u0003\u001a\u00030\u0099\u0001H§@¢\u0006\u0006\bù\u0002\u0010÷\u0002J\u001f\u0010ú\u0002\u001a\u00030\u008e\u00012\t\b\u0001\u0010\u0003\u001a\u00030\u008d\u0001H§@¢\u0006\u0006\bú\u0002\u0010û\u0002J#\u0010ý\u0002\u001a\b\u0012\u0004\u0012\u00020\"0\b2\t\b\u0001\u0010\u0003\u001a\u00030ü\u0002H'¢\u0006\u0006\bý\u0002\u0010þ\u0002J+\u0010\u0081\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0080\u00030\u0084\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030ÿ\u0002H'¢\u0006\u0006\b\u0081\u0003\u0010\u0082\u0003J@\u0010\u0087\u0003\u001a\n\u0012\u0005\u0012\u00030\u0086\u00030\u0084\u00012\n\b\u0001\u0010\u0083\u0003\u001a\u00030¾\u00012\n\b\u0001\u0010\u0084\u0003\u001a\u00030¾\u00012\u000b\b\u0003\u0010\u0085\u0003\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0006\b\u0087\u0003\u0010\u0088\u0003J#\u0010\u008a\u0003\u001a\b\u0012\u0004\u0012\u00020\"0\b2\t\b\u0001\u0010\u0003\u001a\u00030\u0089\u0003H'¢\u0006\u0006\b\u008a\u0003\u0010\u008b\u0003J\u0018\u0010\u008d\u0003\u001a\t\u0012\u0005\u0012\u00030\u008c\u00030\bH'¢\u0006\u0005\b\u008d\u0003\u00105J-\u0010\u0090\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008f\u00030\u0084\u00010\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u008e\u0003H'¢\u0006\u0006\b\u0090\u0003\u0010\u0091\u0003J&\u0010\u0094\u0003\u001a\t\u0012\u0005\u0012\u00030\u0093\u00030\b2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0092\u0003H'¢\u0006\u0006\b\u0094\u0003\u0010\u0095\u0003J \u0010\u0096\u0003\u001a\u0011\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0084\u00010\bH'¢\u0006\u0005\b\u0096\u0003\u00105J\u0018\u0010\u0098\u0003\u001a\t\u0012\u0005\u0012\u00030\u0097\u00030\bH'¢\u0006\u0005\b\u0098\u0003\u00105J#\u0010\u009a\u0003\u001a\b\u0012\u0004\u0012\u00020\"0\b2\t\b\u0001\u0010\u0003\u001a\u00030\u0099\u0003H'¢\u0006\u0006\b\u009a\u0003\u0010\u009b\u0003J#\u0010\u009d\u0003\u001a\b\u0012\u0004\u0012\u00020\"0\b2\t\b\u0001\u0010\u0003\u001a\u00030\u009c\u0003H'¢\u0006\u0006\b\u009d\u0003\u0010\u009e\u0003J\u001e\u0010\u009f\u0003\u001a\u00020\"2\t\b\u0001\u0010\u0003\u001a\u00030\u009c\u0003H§@¢\u0006\u0006\b\u009f\u0003\u0010 \u0003J\u0018\u0010¢\u0003\u001a\t\u0012\u0005\u0012\u00030¡\u00030\bH'¢\u0006\u0005\b¢\u0003\u00105J\u0018\u0010¤\u0003\u001a\t\u0012\u0005\u0012\u00030£\u00030\bH'¢\u0006\u0005\b¤\u0003\u00105J#\u0010¦\u0003\u001a\t\u0012\u0005\u0012\u00030¥\u00030\b2\b\b\u0001\u0010\u007f\u001a\u00020zH'¢\u0006\u0006\b¦\u0003\u0010Ï\u0002J\u0013\u0010§\u0003\u001a\u00030£\u0003H§@¢\u0006\u0005\b§\u0003\u0010cJ$\u0010©\u0003\u001a\t\u0012\u0005\u0012\u00030¨\u00030\b2\t\b\u0001\u0010\u0003\u001a\u00030\u0099\u0001H'¢\u0006\u0006\b©\u0003\u0010\u009c\u0001J\u001f\u0010¬\u0003\u001a\u00030«\u00032\t\b\u0001\u0010\u0003\u001a\u00030ª\u0003H§@¢\u0006\u0006\b¬\u0003\u0010\u00ad\u0003J\u001e\u0010¯\u0003\u001a\u00020\"2\t\b\u0001\u0010\u0003\u001a\u00030®\u0003H§@¢\u0006\u0006\b¯\u0003\u0010°\u0003J$\u0010²\u0003\u001a\t\u0012\u0005\u0012\u00030±\u00030\b2\t\b\u0001\u0010\u0003\u001a\u00030\u0099\u0001H'¢\u0006\u0006\b²\u0003\u0010\u009c\u0001J#\u0010´\u0003\u001a\t\u0012\u0005\u0012\u00030³\u00030\b2\b\b\u0001\u0010\u007f\u001a\u00020zH'¢\u0006\u0006\b´\u0003\u0010Ï\u0002J4\u0010¸\u0003\u001a\t\u0012\u0005\u0012\u00030·\u00030\b2\u000b\b\u0001\u0010µ\u0003\u001a\u0004\u0018\u00010\u00112\f\b\u0001\u0010¶\u0003\u001a\u0005\u0018\u00010¾\u0001H'¢\u0006\u0006\b¸\u0003\u0010Â\u0001J\u0018\u0010º\u0003\u001a\t\u0012\u0005\u0012\u00030¹\u00030\bH'¢\u0006\u0005\bº\u0003\u00105J$\u0010½\u0003\u001a\t\u0012\u0005\u0012\u00030¼\u00030\b2\t\b\u0001\u0010\u0003\u001a\u00030»\u0003H'¢\u0006\u0006\b½\u0003\u0010¾\u0003J#\u0010À\u0003\u001a\b\u0012\u0004\u0012\u00020\"0\b2\t\b\u0001\u0010\u0003\u001a\u00030¿\u0003H'¢\u0006\u0006\bÀ\u0003\u0010Á\u0003J\u0018\u0010Ã\u0003\u001a\t\u0012\u0005\u0012\u00030Â\u00030\bH'¢\u0006\u0005\bÃ\u0003\u00105J=\u0010Æ\u0003\u001a\"\u0012\u001e\u0012\u001c\u0012\u0017\u0012\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010Å\u00030\u0084\u00010\b2\t\b\u0001\u0010\u0003\u001a\u00030Ä\u0003H'¢\u0006\u0006\bÆ\u0003\u0010Ç\u0003J8\u0010È\u0003\u001a\u001c\u0012\u0017\u0012\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010Å\u00030\u0084\u00012\t\b\u0001\u0010\u0003\u001a\u00030Ä\u0003H§@¢\u0006\u0006\bÈ\u0003\u0010É\u0003J(\u0010Ì\u0003\u001a\n\u0012\u0005\u0012\u00030Ë\u00030\u0084\u00012\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Ê\u0003H§@¢\u0006\u0006\bÌ\u0003\u0010Í\u0003J \u0010Ï\u0003\u001a\u00020\"2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Î\u0003H§@¢\u0006\u0006\bÏ\u0003\u0010Ð\u0003J\u0013\u0010Ò\u0003\u001a\u00030Ñ\u0003H§@¢\u0006\u0005\bÒ\u0003\u0010cJ!\u0010Ó\u0003\u001a\u00030Ñ\u00032\u000b\b\u0001\u0010\u0085\u0003\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0006\bÓ\u0003\u0010\u0087\u0001J\u001a\u0010Õ\u0003\u001a\n\u0012\u0005\u0012\u00030Ô\u00030\u0084\u0001H§@¢\u0006\u0005\bÕ\u0003\u0010cJ\u0012\u0010Ö\u0003\u001a\u00020\"H§@¢\u0006\u0005\bÖ\u0003\u0010cJ\u001a\u0010Ø\u0003\u001a\n\u0012\u0005\u0012\u00030×\u00030\u0084\u0001H§@¢\u0006\u0005\bØ\u0003\u0010cJ#\u0010Ù\u0003\u001a\b\u0012\u0004\u0012\u00020\"0\b2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0005\bÙ\u0003\u0010\u001aJ:\u0010Ý\u0003\u001a\u00020E2\u000b\b\u0001\u0010Ú\u0003\u001a\u0004\u0018\u00010\u00112\u000b\b\u0001\u0010Û\u0003\u001a\u0004\u0018\u00010\u00112\u000b\b\u0001\u0010Ü\u0003\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0006\bÝ\u0003\u0010Þ\u0003J\u001e\u0010à\u0003\u001a\u00030ß\u00032\b\b\u0001\u0010\u0003\u001a\u00020pH§@¢\u0006\u0006\bà\u0003\u0010á\u0003J\u0013\u0010ã\u0003\u001a\u00030â\u0003H§@¢\u0006\u0005\bã\u0003\u0010cJ\u001f\u0010æ\u0003\u001a\u00030å\u00032\t\b\u0001\u0010\u0003\u001a\u00030ä\u0003H§@¢\u0006\u0006\bæ\u0003\u0010ç\u0003J$\u0010ê\u0003\u001a\t\u0012\u0005\u0012\u00030é\u00030\b2\t\b\u0001\u0010\u0003\u001a\u00030è\u0003H'¢\u0006\u0006\bê\u0003\u0010ë\u0003J\u001f\u0010î\u0003\u001a\u00030í\u00032\t\b\u0001\u0010\u0003\u001a\u00030ì\u0003H§@¢\u0006\u0006\bî\u0003\u0010ï\u0003J\u001a\u0010ñ\u0003\u001a\n\u0012\u0005\u0012\u00030ð\u00030\u0084\u0001H§@¢\u0006\u0005\bñ\u0003\u0010cJ\u001a\u0010ò\u0003\u001a\n\u0012\u0005\u0012\u00030ð\u00030\u0084\u0001H§@¢\u0006\u0005\bò\u0003\u0010cJ\u0013\u0010ô\u0003\u001a\u00030ó\u0003H§@¢\u0006\u0005\bô\u0003\u0010cJ&\u0010÷\u0003\u001a\n\u0012\u0005\u0012\u00030ö\u00030\u0084\u00012\t\b\u0001\u0010\u0003\u001a\u00030õ\u0003H§@¢\u0006\u0006\b÷\u0003\u0010ø\u0003J\u0012\u0010ù\u0003\u001a\u00020\"H§@¢\u0006\u0005\bù\u0003\u0010c¨\u0006ú\u0003"}, d2 = {"Lcom/transsnet/palmpay/credit/network/IApiCreditService;", "", "Lcom/transsnet/palmpay/credit/bean/req/OcApplyReq;", "req", "Lcom/transsnet/palmpay/credit/bean/resp/OcApplyResultResp;", "applyOkCardV2", "(Lcom/transsnet/palmpay/credit/bean/req/OcApplyReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/CommonPageListReq;", "Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/resp/OcHistoryBillListResp;", "getHistoryBillList", "(Lcom/transsnet/palmpay/core/bean/req/CommonPageListReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/OcOrderReq;", "Lcom/transsnet/palmpay/credit/bean/resp/OcOrderRsp;", "createOcOrder", "(Lcom/transsnet/palmpay/credit/bean/req/OcOrderReq;)Ldf/d;", "createOcOrderV2", "", "orderId", "transType", "Lcom/transsnet/palmpay/credit/bean/resp/TopUpOrderDetailRsp;", "getOcRepayResult", "(Ljava/lang/String;Ljava/lang/String;)Ldf/d;", "orderNo", "Lcom/transsnet/palmpay/credit/bean/resp/OcInstallmentQRBillDetailResp;", "getInstallmentOrderDetail", "(Ljava/lang/String;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/OcOrderDetailReq;", "Lcom/transsnet/palmpay/credit/bean/resp/OcOrderDetailResp;", "getOcOrderDetail", "(Lcom/transsnet/palmpay/credit/bean/req/OcOrderDetailReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/resp/CLOrderDetailResp;", "getCLOrderDetail", "Lcom/transsnet/palmpay/credit/bean/req/OcUploadDeviceInfo;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "uploadDeviceInfo", "(Lcom/transsnet/palmpay/credit/bean/req/OcUploadDeviceInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/req/OcLocationInfoReq;", "uploadLocationInfo", "(Lcom/transsnet/palmpay/credit/bean/req/OcLocationInfoReq;)Ldf/d;", "Lcom/transsnet/palmpay/util/OcCameraInfoBean;", "uploadCameraInfo", "(Lcom/transsnet/palmpay/util/OcCameraInfoBean;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean;", "uploadDeviceInfoNew", "(Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/UploadAppListV2Req;", "body", "Lcom/transsnet/palmpay/core/bean/rsp/UploadAppListV2Rsp;", "uploadAppChannelInfo", "(Lcom/transsnet/palmpay/core/bean/req/UploadAppListV2Req;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/resp/OcIncreaseResp;", "queryIncreaseList", "()Ldf/d;", "penaltyRuleNo", "Lcom/transsnet/palmpay/credit/bean/resp/OcInterestRulesResp;", "queryInterestRules", "Lcom/transsnet/palmpay/credit/bean/resp/OcHasUnFreezeResp;", "hasUnfreeze", "Lcom/transsnet/palmpay/credit/bean/resp/OcInviteListResp;", "queryOcInviteList", "Lcom/transsnet/palmpay/credit/bean/resp/OcMarqueeResp;", "queryOcMarquee", "Lcom/transsnet/palmpay/credit/bean/resp/OcRewardListResp;", "queryRewardList", "Lcom/transsnet/palmpay/credit/bean/resp/OcSumRewardResp;", "querySumReward", "Lcom/transsnet/palmpay/credit/bean/resp/ReferEarnHomeResp;", "queryReferEarnHome", "Lcom/transsnet/palmpay/core/bean/CommonLongResult;", "okCardBaseAmount", "Lcom/transsnet/palmpay/credit/bean/resp/OcWithdrawListResp;", "queryWithdrawList", "Lcom/transsnet/palmpay/credit/bean/resp/OcReferEarnWithdrawResp;", "ocReferEarnWithdraw", "Lcom/transsnet/palmpay/credit/bean/req/OcFeedbackReq;", "addFeedback", "(Lcom/transsnet/palmpay/credit/bean/req/OcFeedbackReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/resp/OcFeedbackHistoryResp;", "queryFeedbackHistory", "Lcom/transsnet/palmpay/credit/bean/req/OcAddContactReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CLInitResp;", "addContact", "(Lcom/transsnet/palmpay/credit/bean/req/OcAddContactReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/OcRouterReq;", "Lcom/transsnet/palmpay/credit/bean/resp/OcRouterResp;", "getRouterList", "(Lcom/transsnet/palmpay/credit/bean/req/OcRouterReq;)Ldf/d;", "getRouterListV2", "(Lcom/transsnet/palmpay/credit/bean/req/OcRouterReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/resp/OcAutoRepaymentListResp;", "getAutoRepaymentList", "getAutoRepaymentBankCardList", "Lcom/transsnet/palmpay/credit/bean/req/CLInitReq;", "clInitApply", "(Lcom/transsnet/palmpay/credit/bean/req/CLInitReq;)Ldf/d;", "clInitApplyV2", "(Lcom/transsnet/palmpay/credit/bean/req/CLInitReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signFlexiAgreement", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/req/CLOpenAccountReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CLOpenAccountResp;", "openCashLoan", "(Lcom/transsnet/palmpay/credit/bean/req/CLOpenAccountReq;)Ldf/d;", "openCashLoanV2", "(Lcom/transsnet/palmpay/credit/bean/req/CLOpenAccountReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyId", "memberId", "loanProduct", "Lcom/transsnet/palmpay/credit/bean/resp/OcInstallmentRaiseAmountRsp;", "installmentRaiseAmountV2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/CLQueryApplyAuditResultReq;", "queryCashLoanStatus", "(Lcom/transsnet/palmpay/credit/bean/req/CLQueryApplyAuditResultReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/CLComparePhotoReq;", "Lcom/transsnet/palmpay/credit/bean/req/CLComparePhotoResp;", "comparePhoto", "(Lcom/transsnet/palmpay/credit/bean/req/CLComparePhotoReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/rsp/CLMainResp;", "getCashLoan", "getCashLoanNew", "", "productSubId", "Lcom/transsnet/palmpay/credit/bean/rsp/CLProductResp;", "getProductDetail", "(Ljava/lang/Integer;)Ldf/d;", "accountType", "Lcom/transsnet/palmpay/credit/bean/rsp/CLCanBorrowResp;", "canBorrow", "canBorrowForMvvm", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/credit/bean/resp/TransferSuccessExistsData;", "getTransferSuccessExists", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCashLoanV2", "Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;", "Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowCouponResp;", "getBorrowCoupon", "(Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/CLWithdrawReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CLWithdrawResp;", "clCreateBorrowOrder", "(Lcom/transsnet/palmpay/credit/bean/req/CLWithdrawReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/CLRepayOrderReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CLRepayOrderData;", "clCreateRepayOrder", "(Lcom/transsnet/palmpay/credit/bean/req/CLRepayOrderReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/CLHistoryBillReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CLHistoryBillResp;", "clQueryHistoryBillList", "(Lcom/transsnet/palmpay/credit/bean/req/CLHistoryBillReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/CLRepaymentPlanReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CLShortCashRepaymentPlanResp;", "clQueryCashRepaymentPlan", "(Lcom/transsnet/palmpay/credit/bean/req/CLRepaymentPlanReq;)Ldf/d;", "clQueryShortCashRepaymentPlan", "Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanResp;", "clBorrowUseCoupon", "Lcom/transsnet/palmpay/credit/bean/req/CLBillDetailReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CLBillDetailResp;", "clGetBillDetail", "(Lcom/transsnet/palmpay/credit/bean/req/CLBillDetailReq;)Ldf/d;", "invitationCode", "Lcom/transsnet/palmpay/credit/bean/resp/OcInviteCodeResp;", "ocSubmitInviteCode", "Lcom/transsnet/palmpay/credit/bean/req/OcSaveSmsTokenReq;", "ocSaveSmsCode", "(Lcom/transsnet/palmpay/credit/bean/req/OcSaveSmsTokenReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/resp/OcIncreaseListResp;", "getIncreaseList", "Lcom/transsnet/palmpay/credit/bean/resp/OcOneLoopDataResp;", "getOneLoopDataForMVVM", "getOneLoopData", "confirmOneLoopDataForMVVM", "(Lcom/transsnet/palmpay/credit/bean/req/OcSaveSmsTokenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmOneLoopData", "", "billId", "Lcom/transsnet/palmpay/credit/bean/resp/OcExtendBillResp;", "getExpendData", "(Ljava/lang/Long;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/OcPhoneLockErrorReq;", "uploadPhoneLockError", "(Lcom/transsnet/palmpay/credit/bean/req/OcPhoneLockErrorReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/rsp/AllAuthInfoRsp;", "queryAllVerifyInfoForMVVM", "queryAllVerifyInfo", "cardNo", "", "includeFeatureBill", "Lcom/transsnet/palmpay/credit/bean/rsp/OcAllBillListResp;", "queryAllBillList", "(Ljava/lang/String;Ljava/lang/Boolean;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/rsp/OcOfflineInstallmentBillResp;", "queryOfflineInstallmentBillDetail", "repayAllFlag", "installmentType", "Lcom/transsnet/palmpay/credit/bean/resp/OcRepayBillResp;", "getRepayBillDetail", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/resp/PalmPayCardBillDetailReq;", "Lcom/transsnet/palmpay/credit/bean/rsp/PalmPayCardBillDetailResp;", "queryPalmPayCardBillDetail", "(Lcom/transsnet/palmpay/credit/bean/resp/PalmPayCardBillDetailReq;)Ldf/d;", "queryOcStatus", "Lcom/transsnet/palmpay/credit/bean/req/CLTaskReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp;", "getFailTaskList", "(Lcom/transsnet/palmpay/credit/bean/req/CLTaskReq;)Ldf/d;", "getCashFailTaskList", "getUnfreezeTaskList", "(Lcom/transsnet/palmpay/credit/bean/req/CLTaskReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/resp/OcClOverdueBillResp;", "getOcCLOverdueBill", "Lcom/transsnet/palmpay/credit/bean/req/CLCurrentBillReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CLCurrentBillResp;", "clGetCurrentBillDetail", "(Lcom/transsnet/palmpay/credit/bean/req/CLCurrentBillReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowRepaymentPlanResp;", "getBorrowRepaymentPlan", "Lcom/transsnet/palmpay/credit/bean/resp/OcInsRepaymentPlanResp;", "getOcInsRepaymentData", "(Ljava/lang/Long;Ljava/lang/String;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/SendMTNOTPReq;", "Lcom/transsnet/palmpay/credit/bean/resp/SendMTNOTPResp;", "sendMTNOTP", "(Lcom/transsnet/palmpay/credit/bean/req/SendMTNOTPReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/MTNLoginReq;", "Lcom/transsnet/palmpay/credit/bean/resp/MTNLoginResp;", "mtnLogin", "(Lcom/transsnet/palmpay/credit/bean/req/MTNLoginReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/rsp/OcBillInstallmentBillResp;", "queryBillInstallmentData", "Lcom/transsnet/palmpay/credit/bean/resp/OcBillInsRepaymentPlanResp;", "getBillInsRepaymentPlan", "Lcom/transsnet/palmpay/credit/bean/resp/OcLockWhiteResp;", "getLockWhite", "getRepayTopCoupon", "Lcom/transsnet/palmpay/credit/bean/resp/OcTotalOverpaymentResp;", "getTotalOverpayment", "Lcom/transsnet/palmpay/credit/bean/resp/OcFinanceMenuResp;", "getFlexiMenuData", "getCashHomeMenuDataSuspend", "Lcom/transsnet/palmpay/credit/bean/req/QueryMemberDetailReq;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryMemberDetailResp;", "queryMemberDetailByPhone", "(Lcom/transsnet/palmpay/credit/bean/req/QueryMemberDetailReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/QueryRecipientReq;", "Lcom/transsnet/palmpay/credit/bean/resp/RecipientListResp;", "queryRecipients", "(Lcom/transsnet/palmpay/credit/bean/req/QueryRecipientReq;)Ldf/d;", "recipientId", "removeRecipient", "Lcom/transsnet/palmpay/credit/bean/resp/QueryMemberByKeywordResp;", "queryMemberDetailByKeyWords", "Lcom/transsnet/palmpay/credit/bean/resp/OcIncreaseLimitResp;", "getIncreaseData", "Lcom/transsnet/palmpay/credit/bean/resp/CLCheckBvnResp;", "checkBvn", "Lcom/transsnet/palmpay/credit/bean/resp/OcRepayExitResp;", "getExitData", "Lcom/transsnet/palmpay/credit/bean/resp/CLOpenUserListResp;", "getCLOpenUserListData", "getCLOpenUserListDataV2", "Lcom/transsnet/palmpay/credit/bean/req/OcUploadALiFaceResultReq;", "uploadALiFaceResult", "(Lcom/transsnet/palmpay/credit/bean/req/OcUploadALiFaceResultReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loanNo", "Lcom/transsnet/palmpay/credit/bean/resp/CLExtendPlanResp;", "clGetExtendPlan", "Lcom/transsnet/palmpay/credit/bean/resp/OcGoldCardLevelResp;", "getGoldLevel", "billDay", "Lcom/transsnet/palmpay/credit/bean/resp/OcUpgradeGoldCardResp;", "changeRepaymentDate", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productId", "Lcom/transsnet/palmpay/credit/bean/resp/CLH5BorrowUrlResp;", "getH5BorrowUrl", "payId", "Lcom/transsnet/palmpay/credit/bean/resp/CLFirstRepaymentResp;", "getFirstRepaymentDate", "Lcom/transsnet/palmpay/core/bean/CommonBooleanResult;", "getCodePlateOrderFlag", "Lcom/transsnet/palmpay/credit/bean/CouponAndPoint;", "getCouponAndPoint", "Lcom/transsnet/palmpay/credit/bean/resp/OcActivityConfigResp;", "getActivityData", "Lcom/transsnet/palmpay/credit/bean/req/GetPriorityCouponReq;", "Lcom/transsnet/palmpay/core/bean/CouponItem;", "getPriorityCoupon", "(Lcom/transsnet/palmpay/credit/bean/req/GetPriorityCouponReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/GetAvailableCouponListReq;", "Lcom/transsnet/palmpay/core/bean/rsp/QueryUserCouponsRsp;", "queryUserCouponList", "(Lcom/transsnet/palmpay/credit/bean/req/GetAvailableCouponListReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/resp/OcAutoDeductOrderDetailRsp;", "getAutoDeductOrderDetail", "Lcom/transsnet/palmpay/credit/bean/resp/OcDefaultPayMethodStatusResp;", "getPayMethodStatus", "setDefPayMethod", "Lcom/transsnet/palmpay/credit/bean/req/DoubleSignReq;", "Lcom/transsnet/palmpay/credit/bean/resp/OcSignStatusResp;", "querySignStatus", "(Lcom/transsnet/palmpay/credit/bean/req/DoubleSignReq;)Ldf/d;", "signProtocol", "Lcom/transsnet/palmpay/credit/bean/req/OcUnfreezeReq;", "Lcom/transsnet/palmpay/credit/bean/UnfreezeResp;", "unfreeze", "(Lcom/transsnet/palmpay/credit/bean/req/OcUnfreezeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/resp/UnfreezePopupDataResp;", "queryUnfreezePopupData", "Lcom/transsnet/palmpay/credit/bean/FlexiCashBalanceData;", "queryAccountBalance", "Lcom/transsnet/palmpay/credit/bean/resp/OcSkipOneLoopResp;", "querySkipOneLoopForMVVM", "querySkipOneLoop", "Lcom/transsnet/palmpay/credit/bean/req/SendOneLoopOTPReq;", "sendOneLoopOTP", "(Lcom/transsnet/palmpay/credit/bean/req/SendOneLoopOTPReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/OcVerifyOneLoopReq;", "verifyOneLoopOTP", "(Lcom/transsnet/palmpay/credit/bean/req/OcVerifyOneLoopReq;)Ldf/d;", "phone", "Lcom/transsnet/palmpay/credit/bean/resp/OcPhoneNumberValidResp;", "queryPhoneNumValid", "Lcom/transsnet/palmpay/core/bean/CommonListResultV2;", "Lcom/transsnet/palmpay/credit/bean/RaiseRecord;", "queryRaiseRecord", "carouseSource", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "queryEvaluationNotice", "(I)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryFlexiPaymentViewSwitchResp;", "queryFlexiPaymentSwitch", "loginType", "Lcom/transsnet/palmpay/credit/bean/rsp/OkCardMainPageRsp;", "okCardMainPage", "okCardMainPageV2", "Lcom/transsnet/palmpay/credit/bean/req/OcRepaidRecordListReq;", "Lcom/transsnet/palmpay/credit/bean/rsp/OcRepaidListResp;", "getRepaidRecordList", "(Lcom/transsnet/palmpay/credit/bean/req/OcRepaidRecordListReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/OLRepaymentListReq;", "clGetRepaymentList", "(Lcom/transsnet/palmpay/credit/bean/req/OLRepaymentListReq;)Ldf/d;", "flagAccount", "Lcom/transsnet/palmpay/credit/bean/rsp/FinanceStatusResp;", "getFinanceData", "(Ljava/lang/Boolean;)Ldf/d;", "getFinanceDataSuspend", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/rsp/OcBillDetailResp;", "queryBillDetailById", "repaymentDate", "queryFutureDetailById", "(Ljava/lang/String;Ljava/lang/Long;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/OcUploadRouterReq;", "uploadRouterData", "(Lcom/transsnet/palmpay/credit/bean/req/OcUploadRouterReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/QueryLoanAmountIncreaseReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo;", "queryLoanAmountIncrease", "(Lcom/transsnet/palmpay/credit/bean/req/QueryLoanAmountIncreaseReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loanSource", "Lcom/transsnet/palmpay/credit/bean/resp/CLQueryFirstLoanBean;", "queryFirstLoan", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryFirstLoanRx", "(Ljava/lang/Integer;Ljava/lang/Integer;)Ldf/d;", "getProductDetailSus", "clQueryInsCashRepaymentPlanSus", "(Lcom/transsnet/palmpay/credit/bean/req/CLRepaymentPlanReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clQueryCashRepaymentPlanSus", "clQueryShortCashRepaymentPlanSus", "clCreateBorrowOrderSus", "(Lcom/transsnet/palmpay/credit/bean/req/CLWithdrawReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/req/UploadMonoTokenReq;", "uploadMonoToken", "(Lcom/transsnet/palmpay/credit/bean/req/UploadMonoTokenReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/rsp/QueryPopUpsReq;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryPopUpsBean;", "queryPopUps", "(Lcom/transsnet/palmpay/credit/bean/rsp/QueryPopUpsReq;)Ldf/d;", "queryCoupon", "queryRepaymentInfo", "productScene", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean;", "queryLoanDialogPopUps", "(ZZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/req/UpLoadLoanDialogPopUps;", "uploadLoanDialogPopUps", "(Lcom/transsnet/palmpay/credit/bean/req/UpLoadLoanDialogPopUps;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/rsp/OpenCashProductResp;", "queryOpenCashProduct", "Lcom/transsnet/palmpay/credit/bean/req/CLBorrowAllDiscountConfigReq;", "Lcom/transsnet/palmpay/credit/bean/BorrowAllDiscountConfig;", "getBorrowAllDiscountConfig", "(Lcom/transsnet/palmpay/credit/bean/req/CLBorrowAllDiscountConfigReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/QueryWithdrawPreReq;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryWithdrawPreCheckResp;", "queryWithdrawPreCheckV1", "(Lcom/transsnet/palmpay/credit/bean/req/QueryWithdrawPreReq;)Ldf/d;", "uploadCashSign", "Lcom/transsnet/palmpay/credit/bean/resp/QueryOneLoopInfoResp;", "queryOneLoopInfo", "Lcom/transsnet/palmpay/credit/bean/req/MultiMediaReq;", "uploadMultiMediaInfo", "(Lcom/transsnet/palmpay/credit/bean/req/MultiMediaReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/PermissionReq;", "uploadPermissionResult", "(Lcom/transsnet/palmpay/credit/bean/req/PermissionReq;)Ldf/d;", "uploadPermissionResultMvvm", "(Lcom/transsnet/palmpay/credit/bean/req/PermissionReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryCreditIncreaseResp;", "queryCreditIncrease", "Lcom/transsnet/palmpay/credit/bean/resp/CLInstallmentLoanMainPageResp;", "getInstallmentLoanMainPage", "Lcom/transsnet/palmpay/credit/bean/resp/QueryCanBorrowAgainResp;", "queryCanBorrowAgain", "getInstallmentLoanMainPageForMVVM", "Lcom/transsnet/palmpay/credit/bean/resp/CLMultipleRepaymentPlanResp;", "queryRepaymentPlan", "Lcom/transsnet/palmpay/credit/bean/req/CLRepaymentPlanV4Req;", "Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanV4Resp;", "queryRepaymentPlanV4", "(Lcom/transsnet/palmpay/credit/bean/req/CLRepaymentPlanV4Req;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/req/CLSaveCashierContextReq;", "saveCashierContext", "(Lcom/transsnet/palmpay/credit/bean/req/CLSaveCashierContextReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/resp/CLInstallmentLoanRepaymentPlanResp;", "queryInstallmentLoanRepaymentPlan", "Lcom/transsnet/palmpay/credit/bean/resp/CLCashInfoResp;", "queryCashInfo", "type", "multiLanguage", "Lcom/transsnet/palmpay/credit/bean/rsp/QuerySysConfigResp;", "querySysConfig", "Lcom/transsnet/palmpay/credit/bean/rsp/QueryLoanUserConfigResp;", "queryLoanUserConfig", "Lcom/transsnet/palmpay/credit/bean/req/QueryInstallmentWithdrawReq;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryInstallmentWithdrawResp;", "queryInstallmentLoanWithdrawPreCheck", "(Lcom/transsnet/palmpay/credit/bean/req/QueryInstallmentWithdrawReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/SignInstallmentWithdrawReq;", "signInstallmentLoanWithdrawPreCheck", "(Lcom/transsnet/palmpay/credit/bean/req/SignInstallmentWithdrawReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/UserDeduceDateResp;", "queryUserDeduceDate", "Lcom/transsnet/palmpay/credit/bean/req/QueryBusinessConfigReq;", "", "queryBusinessConfig", "(Lcom/transsnet/palmpay/credit/bean/req/QueryBusinessConfigReq;)Ldf/d;", "queryBusinessConfigForMVVM", "(Lcom/transsnet/palmpay/credit/bean/req/QueryBusinessConfigReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/req/TemporaryUnlockReq;", "Lcom/transsnet/palmpay/credit/bean/resp/TemporaryUnlockResp;", "queryTmpUnlock", "(Lcom/transsnet/palmpay/credit/bean/req/TemporaryUnlockReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/req/UploadDeviceLocationReq;", "uploadDeviceLocation", "(Lcom/transsnet/palmpay/credit/bean/req/UploadDeviceLocationReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/rsp/QueryDataInfoResp;", "queryLoanHomeDataInfoForMVVM", "queryLoanHomeDataInfoForMVVMCLPhone", "Lcom/transsnet/palmpay/credit/bean/LoanHomeDataInfoV2;", "queryLoanHomeDataInfoV2ForMVVM", "reportLoanOnboardingRead", "Lcom/transsnet/palmpay/credit/bean/LoanEnterPreCheckInfo;", "loanEnterPreCheckForMvvm", "confirmHirePurchaseRepaymentAppLogin", "styleScene", "appVersionName", "mobileNo", "queryStyleConfigVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/resp/CLQueryApplyAuditResultResp;", "queryApplyAuditResult", "(Lcom/transsnet/palmpay/credit/bean/req/CLQueryApplyAuditResultReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/resp/CLQueryBorrowLoanProductResp;", "queryBorrowLoanProduct", "Lcom/transsnet/palmpay/credit/bean/req/CLCalcReturnSendCouponReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CLCalcReturnSendCouponResp;", "calcReturnSendCouponForMVVM", "(Lcom/transsnet/palmpay/credit/bean/req/CLCalcReturnSendCouponReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/req/CLFamilyAndFriendPayReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CLFamilyAndFriendPayResp;", "queryOutstanding", "(Lcom/transsnet/palmpay/credit/bean/req/CLFamilyAndFriendPayReq;)Ldf/d;", "Lcom/transsnet/palmpay/credit/bean/req/CLCreateDownPaymentWalletOrderReq;", "Lcom/transsnet/palmpay/credit/bean/resp/CLCreateDownPaymentWalletOrderResp;", "createDownPaymentWalletOrder", "(Lcom/transsnet/palmpay/credit/bean/req/CLCreateDownPaymentWalletOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/credit/bean/rsp/CommonLinkRsp;", "queryRepaymentPageLink", "queryBorrowPageLink", "Lcom/transsnet/palmpay/credit/bean/rsp/LoanHomeRepaymentCardListResp;", "queryLoanHomeRepaymentCardList", "Lcom/transsnet/palmpay/credit/bean/req/TriggerFullExemptionReq;", "Lcom/transsnet/palmpay/credit/bean/resp/TriggerFullExemptionData;", "triggerFullExemption", "(Lcom/transsnet/palmpay/credit/bean/req/TriggerFullExemptionReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mfbMemberMappingInitialize", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IApiCreditService {
    @POST("/api/cfront/okcard/saveContact")
    @NotNull
    d<CLInitResp> addContact(@Body @NotNull OcAddContactReq req);

    @POST("/api/cfront/okcard/addFeedback")
    @NotNull
    d<CommonResult> addFeedback(@Body @NotNull OcFeedbackReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/okcard/openAccount")
    @Nullable
    Object applyOkCardV2(@Body @NotNull OcApplyReq ocApplyReq, @NotNull Continuation<? super OcApplyResultResp> continuation);

    @POST("api/flexi-service/api/v1/flexi/coupon/calcReturnSendCoupon")
    @Nullable
    Object calcReturnSendCouponForMVVM(@Body @NotNull CLCalcReturnSendCouponReq cLCalcReturnSendCouponReq, @NotNull Continuation<? super CLCalcReturnSendCouponResp> continuation);

    @GET("/api/flexi-service/v1/query/can-credit")
    @NotNull
    d<CLCanBorrowResp> canBorrow(@Nullable @Query("accountType") Integer accountType);

    @GET("/api/flexi-service/v1/query/can-credit")
    @Nullable
    Object canBorrowForMvvm(@Nullable @Query("accountType") Integer num, @NotNull Continuation<? super CLCanBorrowResp> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/flexi-service/v1/flexi/modify/bill-day")
    Object changeRepaymentDate(@Field("cardNo") @Nullable String str, @Field("billDay") @Nullable Integer num, @NotNull Continuation<? super OcUpgradeGoldCardResp> continuation);

    @POST("/api/flexi-service/v1/flexi/query/bvnAndFaceId")
    @NotNull
    d<CLCheckBvnResp> checkBvn();

    @POST("/api/flexi-service/v1/flexi/cash/calc/coupon-change")
    @NotNull
    d<CLRepaymentPlanResp> clBorrowUseCoupon(@Body @Nullable CLRepaymentPlanData req);

    @POST("/api/cfront/cashLoan/withdraw/v2")
    @NotNull
    d<CLWithdrawResp> clCreateBorrowOrder(@Body @NotNull CLWithdrawReq req);

    @POST("/api/cfront/cashLoan/withdraw/v2")
    @Nullable
    Object clCreateBorrowOrderSus(@Body @NotNull CLWithdrawReq cLWithdrawReq, @NotNull Continuation<? super CLWithdrawResp> continuation);

    @POST("/api/cfront/cashLoan/rePayment/createOrder")
    @NotNull
    d<CommonBeanResult<CLRepayOrderData>> clCreateRepayOrder(@Body @NotNull CLRepayOrderReq req);

    @POST("/api/cfront/cashLoan/query/borrow_detail")
    @NotNull
    d<CLBillDetailResp> clGetBillDetail(@Body @NotNull CLBillDetailReq req);

    @POST("/api/flexi-service/cashLoan/query/current/repayment_plan")
    @NotNull
    d<CLCurrentBillResp> clGetCurrentBillDetail(@Body @NotNull CLCurrentBillReq req);

    @NotNull
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/flexi-service/cashLoan/calc/extension-repayment")
    d<CLExtendPlanResp> clGetExtendPlan(@Field("loanNo") @Nullable String loanNo);

    @POST("/api/cfront/cashLoan/queryRepayOrder")
    @NotNull
    d<OcRepaidListResp> clGetRepaymentList(@Body @Nullable OLRepaymentListReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/cashLoan/initApplyLog")
    @NotNull
    d<CLInitResp> clInitApply(@Body @NotNull CLInitReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/cashLoan/initApplyLog")
    @Nullable
    Object clInitApplyV2(@Body @NotNull CLInitReq cLInitReq, @NotNull Continuation<? super CLInitResp> continuation);

    @POST("/api/flexi-service/v2/flexi/cash/repayment-plan-cash")
    @NotNull
    d<CLShortCashRepaymentPlanResp> clQueryCashRepaymentPlan(@Body @NotNull CLRepaymentPlanReq req);

    @POST("/api/flexi-service/v2/flexi/cash/repayment-plan-cash")
    @Nullable
    Object clQueryCashRepaymentPlanSus(@Body @NotNull CLRepaymentPlanReq cLRepaymentPlanReq, @NotNull Continuation<? super CLShortCashRepaymentPlanResp> continuation);

    @POST("/api/cfront/cashLoan/query/borrow_record")
    @NotNull
    d<CLHistoryBillResp> clQueryHistoryBillList(@Body @NotNull CLHistoryBillReq req);

    @POST("/api/v1/flexi/cash/repayment-plan-install")
    @Nullable
    Object clQueryInsCashRepaymentPlanSus(@Body @NotNull CLRepaymentPlanReq cLRepaymentPlanReq, @NotNull Continuation<? super CLShortCashRepaymentPlanResp> continuation);

    @POST("/api/v1/flexi/cash/repayment-plan-instant")
    @NotNull
    d<CLShortCashRepaymentPlanResp> clQueryShortCashRepaymentPlan(@Body @NotNull CLRepaymentPlanReq req);

    @POST("/api/v1/flexi/cash/repayment-plan-instant")
    @Nullable
    Object clQueryShortCashRepaymentPlanSus(@Body @NotNull CLRepaymentPlanReq cLRepaymentPlanReq, @NotNull Continuation<? super CLShortCashRepaymentPlanResp> continuation);

    @POST("/api/cfront/cashLoan/uploadPhoto/v2")
    @NotNull
    d<CLComparePhotoResp> comparePhoto(@Body @NotNull CLComparePhotoReq req);

    @NotNull
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/loan/hire/purchase/confirmHirePurchaseRepaymentAppLogin")
    d<CommonResult> confirmHirePurchaseRepaymentAppLogin(@Field("orderNo") @Nullable String orderNo);

    @POST("/api/cfront/okcard/route/confirmResultOneLoop")
    @NotNull
    d<CommonResult> confirmOneLoopData(@Body @Nullable OcSaveSmsTokenReq req);

    @POST("/api/cfront/okcard/route/confirmResultOneLoop")
    @Nullable
    Object confirmOneLoopDataForMVVM(@Body @Nullable OcSaveSmsTokenReq ocSaveSmsTokenReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/scene-share-product/down/payment/createDownPaymentWalletOrder")
    @Nullable
    Object createDownPaymentWalletOrder(@Body @NotNull CLCreateDownPaymentWalletOrderReq cLCreateDownPaymentWalletOrderReq, @NotNull Continuation<? super CLCreateDownPaymentWalletOrderResp> continuation);

    @POST("/api/cfront/okcard/createOrder")
    @NotNull
    d<OcOrderRsp> createOcOrder(@Body @Nullable OcOrderReq req);

    @POST("/api/cfront/okcard/v2/createOrder")
    @NotNull
    d<OcOrderRsp> createOcOrderV2(@Body @Nullable OcOrderReq req);

    @GET("/api/flexi-service/v1/flexi/query/finance/activity/config")
    @NotNull
    d<OcActivityConfigResp> getActivityData();

    @GET("/api/cfront/merchantdeduce/queryMerchantDecudeDetail")
    @NotNull
    d<OcAutoDeductOrderDetailRsp> getAutoDeductOrderDetail(@Nullable @Query("orderNo") String orderNo);

    @POST("/api/account-service/api/v1/gateway/query/fastpay/cards")
    @NotNull
    d<OcAutoRepaymentListResp> getAutoRepaymentBankCardList();

    @GET("/api/cfront/okcard/deducePayCardList")
    @NotNull
    d<OcAutoRepaymentListResp> getAutoRepaymentList();

    @GET("/api/cfront/okcard/repayment/queryByOrderNo")
    @NotNull
    d<OcBillInsRepaymentPlanResp> getBillInsRepaymentPlan(@Nullable @Query("orderId") String orderId);

    @POST("/api/flexi-service/v1/flexi/cash/query/borrow/all/discount/config")
    @NotNull
    d<CommonBeanResult<BorrowAllDiscountConfig>> getBorrowAllDiscountConfig(@Body @Nullable CLBorrowAllDiscountConfigReq req);

    @POST("/api/cfront/postPayMarketing/query/flexi-cash/borrow-coupon-list")
    @NotNull
    d<CLBorrowCouponResp> getBorrowCoupon(@Body @Nullable CLRepaymentPlanData req);

    @GET("/api/cfront/cashLoan/queryByOrderId")
    @NotNull
    d<CLBorrowRepaymentPlanResp> getBorrowRepaymentPlan(@Nullable @Query("orderId") String orderId);

    @GET("/api/flexi-service/v1/flexi/query/carousel-data")
    @NotNull
    d<CLOpenUserListResp> getCLOpenUserListData();

    @GET("/api/flexi-service/v1/repayment/query/carousel-data")
    @Nullable
    Object getCLOpenUserListDataV2(@NotNull Continuation<? super CLOpenUserListResp> continuation);

    @POST("/api/cfront/cashLoan/query/repayment/detail")
    @NotNull
    d<CLOrderDetailResp> getCLOrderDetail(@Body @NotNull OcOrderDetailReq req);

    @Headers({"GAME-PRODUCT-ACTIVITY-CODE: CASH-CREDIT-FAIL-TASK"})
    @POST("/api/scene-activity-product/flexiUnfreeze/getTaskList")
    @NotNull
    d<CLTaskResp> getCashFailTaskList(@Body @NotNull CLTaskReq req);

    @GET("/api/flexi-service/v1/cash/queryCashKingKongConfig")
    @Nullable
    Object getCashHomeMenuDataSuspend(@NotNull Continuation<? super OcFinanceMenuResp> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/cashLoan/mainPage")
    @NotNull
    d<CLMainResp> getCashLoan();

    @Headers({"No-Token: yes"})
    @POST("/api/v2/flexi/cash/main-page")
    @NotNull
    d<CLMainResp> getCashLoanNew();

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/cashLoan/mainPage")
    @Nullable
    Object getCashLoanV2(@NotNull Continuation<? super CLMainResp> continuation);

    @GET("/api/scene-offline-product/codePlate/getCodePlateOrderFlag")
    @Nullable
    Object getCodePlateOrderFlag(@NotNull Continuation<? super CommonBooleanResult> continuation);

    @GET("/api/scene-offline-product/codePlate/getCouponAndPoint")
    @Nullable
    Object getCouponAndPoint(@NotNull Continuation<? super CommonBeanResult<CouponAndPoint>> continuation);

    @GET("/api/flexi-service/v1/flexi/query/queryRepaymentConfig")
    @NotNull
    d<OcRepayExitResp> getExitData(@NotNull @Query("loanProduct") String loanProduct);

    @GET("/api/cfront/okcard/query/extension/repayment/info")
    @NotNull
    d<OcExtendBillResp> getExpendData(@Nullable @Query("billId") Long billId);

    @Headers({"GAME-PRODUCT-ACTIVITY-CODE: FLEXI-ACTIVATION-TASK"})
    @POST("/api/scene-activity-product/flexiUnfreeze/getTaskList")
    @NotNull
    d<CLTaskResp> getFailTaskList(@Body @NotNull CLTaskReq req);

    @POST("/api/cfront/okcard/queryFinancePage")
    @NotNull
    d<FinanceStatusResp> getFinanceData(@Body @JsonName("flagAccount") @Nullable Boolean flagAccount);

    @POST("/api/cfront/okcard/queryFinancePage")
    @Nullable
    Object getFinanceDataSuspend(@Body @JsonName("flagAccount") @Nullable Boolean bool, @NotNull Continuation<? super FinanceStatusResp> continuation);

    @NotNull
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/flexi-service/v1/borrow-result/query/popup-data")
    d<CLFirstRepaymentResp> getFirstRepaymentDate(@Field("payId") @Nullable String payId);

    @GET("/api/flexi-service/v1/queryFlexiHomePageKingKongConfig")
    @NotNull
    d<OcFinanceMenuResp> getFlexiMenuData();

    @POST("/api/flexi-service/v1/flexi/query/card-level/info")
    @Nullable
    Object getGoldLevel(@NotNull Continuation<? super OcGoldCardLevelResp> continuation);

    @GET("/api/flexi-service/v1/query/h5-borrow-url")
    @NotNull
    d<CLH5BorrowUrlResp> getH5BorrowUrl(@Nullable @Query("productId") Integer productId);

    @POST("/api/cfront/okcard/queryBillList")
    @NotNull
    d<OcHistoryBillListResp> getHistoryBillList(@Body @NotNull CommonPageListReq req);

    @GET("/api/flexi-service/okcard/queryRaiseDashboard")
    @NotNull
    d<OcIncreaseLimitResp> getIncreaseData(@NotNull @Query("loanProduct") String loanProduct);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/okcard/query/raiseMission")
    @NotNull
    d<OcIncreaseListResp> getIncreaseList();

    @GET("/api/flexi-service/api/240228/installment-loan/main-page")
    @NotNull
    d<CLInstallmentLoanMainPageResp> getInstallmentLoanMainPage();

    @GET("/api/flexi-service/api/240228/installment-loan/main-page")
    @Nullable
    Object getInstallmentLoanMainPageForMVVM(@NotNull Continuation<? super CLInstallmentLoanMainPageResp> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("/api/cfront/qr-code/qr-code/orderDetail")
    @NotNull
    d<OcInstallmentQRBillDetailResp> getInstallmentOrderDetail(@Nullable @Query("orderNo") String orderNo);

    @GET("/api/cfront/okcard/queryFlexiRouteConfig")
    @NotNull
    d<OcLockWhiteResp> getLockWhite();

    @GET("/api/cfront/cashLoan/queryOverdueBill")
    @NotNull
    d<OcClOverdueBillResp> getOcCLOverdueBill();

    @NotNull
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/cfront/okcard/trial/spread/repayment/plan")
    d<OcInsRepaymentPlanResp> getOcInsRepaymentData(@Field("billId") @Nullable Long billId, @Field("cardNo") @Nullable String cardNo);

    @POST("/api/cfront/okcard/queryOrder")
    @NotNull
    d<OcOrderDetailResp> getOcOrderDetail(@Body @NotNull OcOrderDetailReq req);

    @GET("/api/cfront/okcard/queryDetail")
    @NotNull
    d<TopUpOrderDetailRsp> getOcRepayResult(@Nullable @Query("orderId") String orderId, @Nullable @Query("transType") String transType);

    @POST("/api/cfront/one_loop/apply/auth/token")
    @NotNull
    d<OcOneLoopDataResp> getOneLoopData(@Body @JsonName("applyId") @Nullable String applyId);

    @POST("/api/cfront/one_loop/apply/auth/token")
    @Nullable
    Object getOneLoopDataForMVVM(@Body @JsonName("applyId") @Nullable String str, @NotNull Continuation<? super OcOneLoopDataResp> continuation);

    @GET("/api/flexi-service/v1/flexi/queryPreferPaymentMethod")
    @Nullable
    Object getPayMethodStatus(@NotNull Continuation<? super OcDefaultPayMethodStatusResp> continuation);

    @POST("/api/marketing-service/coupon/getPriority")
    @NotNull
    d<CommonBeanResult<CouponItem>> getPriorityCoupon(@Body @Nullable GetPriorityCouponReq req);

    @GET("/api/flexi-service/v1/flexi/query/acct-product-sub")
    @NotNull
    d<CLProductResp> getProductDetail(@Nullable @Query("productSubId") Integer productSubId);

    @GET("/api/flexi-service/v1/flexi/query/acct-product-sub")
    @Nullable
    Object getProductDetailSus(@Nullable @Query("productSubId") Integer num, @NotNull Continuation<? super CLProductResp> continuation);

    @POST("/api/cfront/okcard/queryRepayOrderByCard")
    @NotNull
    d<OcRepaidListResp> getRepaidRecordList(@Body @Nullable OcRepaidRecordListReq req);

    @GET("/api/cfront/okcard/query/ok_card/repayment/info")
    @NotNull
    d<OcRepayBillResp> getRepayBillDetail(@Nullable @Query("cardNo") String cardNo, @Nullable @Query("billId") Long billId, @Nullable @Query("orderNo") String orderNo, @Nullable @Query("repayAllFlag") Boolean repayAllFlag, @Nullable @Query("installmentType") Integer installmentType);

    @GET("/api/v1/flexi/coupon/repay-coupon-list")
    @NotNull
    d<CLBorrowCouponResp> getRepayTopCoupon(@Nullable @Query("transType") String transType);

    @POST("/api/cfront/okcard/query/loanRoute")
    @NotNull
    d<OcRouterResp> getRouterList(@Body @NotNull OcRouterReq req);

    @POST("/api/cfront/okcard/query/loanRoute")
    @Nullable
    Object getRouterListV2(@Body @NotNull OcRouterReq ocRouterReq, @NotNull Continuation<? super OcRouterResp> continuation);

    @POST("/api/v1/flexi/query/user/overpayment/info")
    @Nullable
    Object getTotalOverpayment(@NotNull Continuation<? super OcTotalOverpaymentResp> continuation);

    @GET("/api/flexi-service/api/cfront/cashLoan/transfer/success-exists")
    @Nullable
    Object getTransferSuccessExists(@Nullable @Query("loanProduct") String str, @NotNull Continuation<? super CommonBeanResult<TransferSuccessExistsData>> continuation);

    @Headers({"GAME-PRODUCT-ACTIVITY-CODE: FLEXI-UNFREEZE-TASK"})
    @POST("/api/scene-activity-product/flexiUnfreeze/getTaskList")
    @Nullable
    Object getUnfreezeTaskList(@Body @NotNull CLTaskReq cLTaskReq, @NotNull Continuation<? super CLTaskResp> continuation);

    @GET("/api/cfront/okcard/invite/activity/query/hasUnfreeze")
    @NotNull
    d<OcHasUnFreezeResp> hasUnfreeze();

    @NotNull
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes"})
    @POST("/api/cfront/okcard/query/installmentRaiseAmount")
    d<OcInstallmentRaiseAmountRsp> installmentRaiseAmountV2(@Field("applyId") @Nullable String applyId, @Field("memberId") @Nullable String memberId, @Field("loanProduct") @Nullable String loanProduct);

    @GET("/api/flexi-service/mainLoan/querySignedProtocol")
    @Nullable
    Object loanEnterPreCheckForMvvm(@NotNull Continuation<? super CommonBeanResult<LoanEnterPreCheckInfo>> continuation);

    @POST("/api/flexi-service/mfb/member-mapping/initialize")
    @Nullable
    Object mfbMemberMappingInitialize(@NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/one_loop/login")
    @NotNull
    d<MTNLoginResp> mtnLogin(@Body @NotNull MTNLoginReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/okcard/invite/activity/withdraw")
    @NotNull
    d<OcReferEarnWithdrawResp> ocReferEarnWithdraw();

    @POST("/api/cfront/okcard/route/confirmResultOtp")
    @NotNull
    d<CommonResult> ocSaveSmsCode(@Body @Nullable OcSaveSmsTokenReq req);

    @POST("/api/cfront/okcard/invite/activity/bind/invitation/code")
    @NotNull
    d<OcInviteCodeResp> ocSubmitInviteCode(@Body @JsonName("invitationCode") @Nullable String invitationCode);

    @GET("/api/cfront/okcard/invite/activity/query/baseAmount")
    @NotNull
    d<CommonLongResult> okCardBaseAmount();

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/okcard/mainPage")
    @NotNull
    d<OkCardMainPageRsp> okCardMainPage(@Nullable @Query("loginType") String loginType);

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/okcard/mainPage")
    @Nullable
    Object okCardMainPageV2(@Nullable @Query("loginType") String str, @NotNull Continuation<? super OkCardMainPageRsp> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/cashLoan/submit")
    @NotNull
    d<CLOpenAccountResp> openCashLoan(@Body @NotNull CLOpenAccountReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/cashLoan/submit")
    @Nullable
    Object openCashLoanV2(@Body @NotNull CLOpenAccountReq cLOpenAccountReq, @NotNull Continuation<? super CLOpenAccountResp> continuation);

    @GET("/api/flexi-service/queryAccountBalance")
    @Nullable
    Object queryAccountBalance(@NotNull Continuation<? super CommonBeanResult<FlexiCashBalanceData>> continuation);

    @GET("/api/cfront/okcard/query/outstanding/bills")
    @NotNull
    d<OcAllBillListResp> queryAllBillList(@Nullable @Query("cardNo") String cardNo, @Nullable @Query("includeFeatureBill") Boolean includeFeatureBill);

    @GET("/api/cfront/authen/mainV2")
    @NotNull
    d<AllAuthInfoRsp> queryAllVerifyInfo();

    @GET("/api/cfront/authen/mainV2")
    @Nullable
    Object queryAllVerifyInfoForMVVM(@NotNull Continuation<? super AllAuthInfoRsp> continuation);

    @POST("/api/flexi-service/api/cfront/cashLoan/queryApplyAuditResult")
    @Nullable
    Object queryApplyAuditResult(@Body @NotNull CLQueryApplyAuditResultReq cLQueryApplyAuditResultReq, @NotNull Continuation<? super CLQueryApplyAuditResultResp> continuation);

    @GET("/api/cfront/okcard/querBillById")
    @NotNull
    d<OcBillDetailResp> queryBillDetailById(@Nullable @Query("id") Long billId);

    @GET("/api/cfront/okcard/query/spread/order")
    @NotNull
    d<OcBillInstallmentBillResp> queryBillInstallmentData(@Nullable @Query("orderNo") String cardNo);

    @GET("/api/flexi-service/query/borrow/loanProduct")
    @Nullable
    Object queryBorrowLoanProduct(@NotNull Continuation<? super CLQueryBorrowLoanProductResp> continuation);

    @GET("/api/scene-lending-product/deeplink/getWithdrawPageDeeplink")
    @Nullable
    Object queryBorrowPageLink(@NotNull Continuation<? super CommonBeanResult<CommonLinkRsp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/flexi-service/mainLoan/v1/queryBusinessConfig")
    @NotNull
    d<CommonBeanResult<Map<String, String>>> queryBusinessConfig(@Body @NotNull QueryBusinessConfigReq req);

    @Headers({"No-Token: yes"})
    @POST("/api/flexi-service/mainLoan/v1/queryBusinessConfig")
    @Nullable
    Object queryBusinessConfigForMVVM(@Body @NotNull QueryBusinessConfigReq queryBusinessConfigReq, @NotNull Continuation<? super CommonBeanResult<Map<String, String>>> continuation);

    @GET("/api/flexi-service/v1/query/can/borrow/again")
    @NotNull
    d<QueryCanBorrowAgainResp> queryCanBorrowAgain(@Query("currentLoanAccountType") int accountType);

    @GET("/api/flexi-service/v1/flexi/query/simple/card")
    @NotNull
    d<CLCashInfoResp> queryCashInfo(@Query("accountType") int accountType);

    @POST("/api/cfront/cashLoan/queryApplyStatusV2")
    @NotNull
    d<CLOpenAccountResp> queryCashLoanStatus(@Body @NotNull CLQueryApplyAuditResultReq req);

    @GET("/api/loan/api/v2/cashLoan/checkApplyIncreaseQuota")
    @NotNull
    d<QueryCreditIncreaseResp> queryCreditIncrease();

    @Headers({"No-Token: yes"})
    @GET("/api/flexi-service/v1/flexi/query/union-apply-page/carousel-data")
    @NotNull
    d<CommonBeanResult<ArrayList<String>>> queryEvaluationNotice(@Query("carouseSource") int carouseSource);

    @GET("/api/cfront/okcard/feedback/history")
    @NotNull
    d<OcFeedbackHistoryResp> queryFeedbackHistory();

    @GET("/api/flexi-service/v1/query/queryFirstLoan")
    @Nullable
    Object queryFirstLoan(@Nullable @Query("productSubId") Integer num, @Nullable @Query("loanSource") Integer num2, @NotNull Continuation<? super CommonBeanResult<CLQueryFirstLoanBean>> continuation);

    @GET("/api/flexi-service/v1/query/queryFirstLoan")
    @NotNull
    d<CommonBeanResult<CLQueryFirstLoanBean>> queryFirstLoanRx(@Nullable @Query("productSubId") Integer productSubId, @Nullable @Query("loanSource") Integer loanSource);

    @Headers({"No-Token: yes"})
    @GET("/api/flexi-service/v1/flexi/query/paymentSwitch")
    @NotNull
    d<QueryFlexiPaymentViewSwitchResp> queryFlexiPaymentSwitch(@Query("type") int carouseSource);

    @GET("/api/cfront/okcard/query/feature/installment/bill")
    @NotNull
    d<OcBillDetailResp> queryFutureDetailById(@Nullable @Query("cardNo") String cardNo, @Nullable @Query("repaymentDateStamp") Long repaymentDate);

    @GET("/api/cfront/okcard/queryRaiseRecord")
    @NotNull
    d<OcIncreaseResp> queryIncreaseList();

    @POST("/api/flexi-service/v1/calc/installment-loan/repayment-plan")
    @NotNull
    d<CLInstallmentLoanRepaymentPlanResp> queryInstallmentLoanRepaymentPlan(@Body @NotNull CLRepaymentPlanReq req);

    @POST("/api/flexi-service/api/231215/installmentLoan/queryWithdrawPreCheck")
    @NotNull
    d<QueryInstallmentWithdrawResp> queryInstallmentLoanWithdrawPreCheck(@Body @NotNull QueryInstallmentWithdrawReq req);

    @GET("/api/v1/postpay/query/penalty/rule/byruleno")
    @NotNull
    d<OcInterestRulesResp> queryInterestRules(@Nullable @Query("penaltyRuleNo") String penaltyRuleNo);

    @POST("/api/loan/v2/log/quota/query")
    @Nullable
    Object queryLoanAmountIncrease(@Body @NotNull QueryLoanAmountIncreaseReq queryLoanAmountIncreaseReq, @NotNull Continuation<? super CreditIncreaseInfo> continuation);

    @GET("/api/loan/api/v1/flexi2023/queryPopUpsV2")
    @Nullable
    Object queryLoanDialogPopUps(@Query("queryCoupon") boolean z3, @Query("queryRepaymentInfo") boolean z8, @Nullable @Query("productScene") String str, @NotNull Continuation<? super CommonBeanResult<QueryLoanDialogPopUpsBean>> continuation);

    @GET("/api/flexi-service/mainLoan/v1/queryDataInfo")
    @Nullable
    Object queryLoanHomeDataInfoForMVVM(@NotNull Continuation<? super QueryDataInfoResp> continuation);

    @GET("/api/flexi-service/mainLoan/v1/queryDataInfo")
    @Nullable
    Object queryLoanHomeDataInfoForMVVMCLPhone(@Nullable @Query("productScene") String str, @NotNull Continuation<? super QueryDataInfoResp> continuation);

    @POST("/api/scene-lending-product/loanTab/home")
    @Nullable
    Object queryLoanHomeDataInfoV2ForMVVM(@NotNull Continuation<? super CommonBeanResult<LoanHomeDataInfoV2>> continuation);

    @POST("/api/scene-lending-product/loanTab/repayment/aggregate")
    @Nullable
    Object queryLoanHomeRepaymentCardList(@NotNull Continuation<? super LoanHomeRepaymentCardListResp> continuation);

    @GET("/api/loan/api/240313/queryPersonalInfo")
    @NotNull
    d<QueryLoanUserConfigResp> queryLoanUserConfig();

    @POST("/api/cfront/member/queryMemberByKeword")
    @NotNull
    d<QueryMemberByKeywordResp> queryMemberDetailByKeyWords(@Body @NotNull QueryMemberDetailReq req);

    @POST("/api/cfront/member/queryMemberDetail")
    @NotNull
    d<QueryMemberDetailResp> queryMemberDetailByPhone(@Body @NotNull QueryMemberDetailReq req);

    @GET("/api/cfront/okcard/invite/activity/query/inviteList")
    @NotNull
    d<OcInviteListResp> queryOcInviteList();

    @GET("/api/cfront/okcard/invite/activity/query/lastReward")
    @NotNull
    d<OcMarqueeResp> queryOcMarquee();

    @POST("/api/cfront/okcard/queryUser")
    @NotNull
    d<OcApplyResultResp> queryOcStatus(@Body @JsonName("applyId") @Nullable String applyId);

    @GET("/api/cfront/okcard/query/installment/order")
    @NotNull
    d<OcOfflineInstallmentBillResp> queryOfflineInstallmentBillDetail(@Nullable @Query("orderNo") String cardNo);

    @GET("/api/loan/api/v1/flexi2023/queryOneLoopInfo")
    @NotNull
    d<QueryOneLoopInfoResp> queryOneLoopInfo();

    @GET("/api/flexi-service/v1/query/openCashProduct")
    @NotNull
    d<OpenCashProductResp> queryOpenCashProduct();

    @POST("/api/flexi-service/paymentLink/queryOutstanding")
    @NotNull
    d<CLFamilyAndFriendPayResp> queryOutstanding(@Body @NotNull CLFamilyAndFriendPayReq req);

    @POST("/api/flexi-service/palmpay-card/query/outstanding/info")
    @NotNull
    d<PalmPayCardBillDetailResp> queryPalmPayCardBillDetail(@Body @NotNull PalmPayCardBillDetailReq req);

    @Headers({"Accept-Encoding: gzip,deflate"})
    @GET("/api/pay-route/mmo/name/queryNetwork")
    @NotNull
    d<OcPhoneNumberValidResp> queryPhoneNumValid(@Nullable @Query("phone") String phone);

    @POST("/api/loan/api/v1/flexi2023/queryPopUps")
    @NotNull
    d<CommonBeanResult<QueryPopUpsBean>> queryPopUps(@Body @NotNull QueryPopUpsReq req);

    @GET("/api/loan/api/v1/cashLoan/queryRaiseRecord")
    @Nullable
    Object queryRaiseRecord(@NotNull Continuation<? super CommonListResultV2<RaiseRecord>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/sendMoney/queryRecipient")
    @NotNull
    d<RecipientListResp> queryRecipients(@Body @NotNull QueryRecipientReq req);

    @GET("/api/cfront/referEarn/latest")
    @NotNull
    d<ReferEarnHomeResp> queryReferEarnHome();

    @GET("/api/scene-lending-product/deeplink/getRepaymentPageDeeplink")
    @Nullable
    Object queryRepaymentPageLink(@NotNull Continuation<? super CommonBeanResult<CommonLinkRsp>> continuation);

    @POST("/api/flexi-service/v3/flexi/cash/repayment-plan")
    @NotNull
    d<CLMultipleRepaymentPlanResp> queryRepaymentPlan(@Body @NotNull CLRepaymentPlanReq req);

    @POST("/api/flexi-service/api/v4/flexi/cash/repayment-plan")
    @Nullable
    Object queryRepaymentPlanV4(@Body @NotNull CLRepaymentPlanV4Req cLRepaymentPlanV4Req, @NotNull Continuation<? super CLRepaymentPlanV4Resp> continuation);

    @GET("/api/cfront/okcard/invite/activity/query/rewardList")
    @NotNull
    d<OcRewardListResp> queryRewardList();

    @POST("/api/loan/api/v1/flexi2022/queryDoubleSign")
    @NotNull
    d<OcSignStatusResp> querySignStatus(@Body @NotNull DoubleSignReq req);

    @POST("/api/loan/api/v1/flexi2022/querySkipOneLoop")
    @NotNull
    d<OcSkipOneLoopResp> querySkipOneLoop();

    @POST("/api/loan/api/v1/flexi2022/querySkipOneLoop")
    @Nullable
    Object querySkipOneLoopForMVVM(@NotNull Continuation<? super OcSkipOneLoopResp> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/flexi-service/mainLoan/v1/queryConfigVersionV2")
    @Nullable
    Object queryStyleConfigVersion(@Nullable @Query("scene") String str, @Nullable @Query("appVersionName") String str2, @Nullable @Query("mobileNo") String str3, @NotNull Continuation<? super CommonLongResult> continuation);

    @GET("/api/cfront/okcard/invite/activity/query/sumReward")
    @NotNull
    d<OcSumRewardResp> querySumReward();

    @GET("/api/flexi-service/api/v1/flexi/querySysConfig")
    @NotNull
    d<QuerySysConfigResp> querySysConfig(@Nullable @Query("type") String type, @Nullable @Query("multiLanguage") Boolean multiLanguage);

    @POST("/api/flexi-service/hirePurchase/tmpUnlock")
    @Nullable
    Object queryTmpUnlock(@Body @Nullable TemporaryUnlockReq temporaryUnlockReq, @NotNull Continuation<? super CommonBeanResult<TemporaryUnlockResp>> continuation);

    @GET("/api/flexi-service/v1/flexi/queryUnfreezePopupData")
    @Nullable
    Object queryUnfreezePopupData(@NotNull Continuation<? super UnfreezePopupDataResp> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/coupon/userCouponList")
    @NotNull
    d<QueryUserCouponsRsp> queryUserCouponList(@Body @Nullable GetAvailableCouponListReq req);

    @GET("/api/flexi-service/v1/flexi/query/user/deduce-date")
    @NotNull
    d<UserDeduceDateResp> queryUserDeduceDate();

    @GET("/api/cfront/okcard/invite/activity/query/withdrawList")
    @NotNull
    d<OcWithdrawListResp> queryWithdrawList();

    @POST("/api/flexi-service/240910/common/queryWithdrawPreCheckV1")
    @NotNull
    d<QueryWithdrawPreCheckResp> queryWithdrawPreCheckV1(@Body @Nullable QueryWithdrawPreReq req);

    @GET("/api/cfront/sendMoney/removeRecipient")
    @NotNull
    d<CommonResult> removeRecipient(@NotNull @Query("recipientId") String recipientId);

    @POST("/api/scene-lending-product/loanTab/onboarding/read")
    @Nullable
    Object reportLoanOnboardingRead(@NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/flexi-service/cfront/cashLoan/withdraw/saveCashierContext")
    @Nullable
    Object saveCashierContext(@Body @NotNull CLSaveCashierContextReq cLSaveCashierContextReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/one_loop/send-otp")
    @NotNull
    d<SendMTNOTPResp> sendMTNOTP(@Body @NotNull SendMTNOTPReq req);

    @POST("/api/flexi-service/v2/oneloop/send-otp")
    @NotNull
    d<SendMTNOTPResp> sendOneLoopOTP(@Body @NotNull SendOneLoopOTPReq req);

    @GET("/api/flexi-service/v1/flexi/setFlexiPreferPaymentMethod")
    @Nullable
    Object setDefPayMethod(@NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/flexi-service/api/cfront/okcard/signUserV2")
    @Nullable
    Object signFlexiAgreement(@NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/flexi-service/api/cfront/protocol/signProtocol")
    @NotNull
    d<CommonResult> signInstallmentLoanWithdrawPreCheck(@Body @NotNull SignInstallmentWithdrawReq req);

    @POST("/api/loan/api/v1/flexi2022/doubleSign")
    @NotNull
    d<CommonResult> signProtocol(@Body @NotNull DoubleSignReq req);

    @POST("/api/flexi-service/api/v1/flexi/repay/collection-exemption/trigger-full-exemption")
    @Nullable
    Object triggerFullExemption(@Body @NotNull TriggerFullExemptionReq triggerFullExemptionReq, @NotNull Continuation<? super CommonBeanResult<TriggerFullExemptionData>> continuation);

    @POST("/api/flexi-service/unfreeze")
    @Nullable
    Object unfreeze(@Body @Nullable OcUnfreezeReq ocUnfreezeReq, @NotNull Continuation<? super UnfreezeResp> continuation);

    @POST("/api/flexi-service/v2/cashLoan/face-detect/lively")
    @Nullable
    Object uploadALiFaceResult(@Body @Nullable OcUploadALiFaceResultReq ocUploadALiFaceResultReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/device/uploadAppChannelInfo")
    @NotNull
    d<UploadAppListV2Rsp> uploadAppChannelInfo(@Body @Nullable UploadAppListV2Req body);

    @POST("/api/cfront/okcard/riskData/camera")
    @NotNull
    d<CommonResult> uploadCameraInfo(@Body @NotNull OcCameraInfoBean req);

    @POST("/api/loan/api/v1/flexi2023/cashSign")
    @NotNull
    d<CommonBeanResult<String>> uploadCashSign();

    @POST("/api/cfront/okcard/sendDeviceInfo")
    @Nullable
    Object uploadDeviceInfo(@Body @NotNull OcUploadDeviceInfo ocUploadDeviceInfo, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/okcard/riskData/deviceInfo")
    @NotNull
    d<CommonResult> uploadDeviceInfoNew(@Body @NotNull UploadDeviceInfoReq.DeviceInfoBean req);

    @POST("/api/flexi-service/api/cfront/device/location")
    @Nullable
    Object uploadDeviceLocation(@Body @Nullable UploadDeviceLocationReq uploadDeviceLocationReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/loan/api/v1/flexi2023/readPopUps")
    @NotNull
    d<CommonResult> uploadLoanDialogPopUps(@Body @NotNull UpLoadLoanDialogPopUps req);

    @POST("/api/cfront/okcard/riskData/locationInfo")
    @NotNull
    d<CommonResult> uploadLocationInfo(@Body @NotNull OcLocationInfoReq req);

    @POST("/api/postpay-channel/v1/mono/exchange-token")
    @NotNull
    d<CommonResult> uploadMonoToken(@Body @NotNull UploadMonoTokenReq req);

    @POST("/api/flexi-service/v1/data-collection/multimedia")
    @NotNull
    d<CommonResult> uploadMultiMediaInfo(@Body @NotNull MultiMediaReq req);

    @POST("/api/flexi-service/v1/data-collection/permissions")
    @NotNull
    d<CommonResult> uploadPermissionResult(@Body @NotNull PermissionReq req);

    @POST("/api/flexi-service/v1/data-collection/permissions")
    @Nullable
    Object uploadPermissionResultMvvm(@Body @NotNull PermissionReq permissionReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/okcard/phoneLockError/submit")
    @NotNull
    d<CommonResult> uploadPhoneLockError(@Body @Nullable OcPhoneLockErrorReq req);

    @POST("/api/cfront/okcard/route/confirm")
    @NotNull
    d<CommonResult> uploadRouterData(@Body @Nullable OcUploadRouterReq req);

    @POST("/api/flexi-service/v2/oneloop/login")
    @NotNull
    d<MTNLoginResp> verifyOneLoopOTP(@Body @Nullable OcVerifyOneLoopReq req);
}
