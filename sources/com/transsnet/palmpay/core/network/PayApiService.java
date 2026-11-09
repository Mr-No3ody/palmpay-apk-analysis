package com.transsnet.palmpay.core.network;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.bean.AnalysisPartnerInForCashOutReq;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.BillQuickAccessBean;
import com.transsnet.palmpay.core.bean.BillerUSSDInfoBean;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.CorePointInfoBean;
import com.transsnet.palmpay.core.bean.CreateBizOrderReq;
import com.transsnet.palmpay.core.bean.CreateBizOrderResp;
import com.transsnet.palmpay.core.bean.FlashSaleDataBundleBeanV2;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleBean;
import com.transsnet.palmpay.core.bean.MemberAddressBean;
import com.transsnet.palmpay.core.bean.QueryBankListRsp;
import com.transsnet.palmpay.core.bean.QueryBankcardUserNameRsp;
import com.transsnet.palmpay.core.bean.QueryFamilyAccountRsp;
import com.transsnet.palmpay.core.bean.QueryMemberByCodePlateResp;
import com.transsnet.palmpay.core.bean.RequestMoneyCancelResp;
import com.transsnet.palmpay.core.bean.RewardOrderDetail;
import com.transsnet.palmpay.core.bean.ShortUrlResp;
import com.transsnet.palmpay.core.bean.TopUpHistoryDataResp;
import com.transsnet.palmpay.core.bean.bill.BillReqNew;
import com.transsnet.palmpay.core.bean.bill.BillRsp;
import com.transsnet.palmpay.core.bean.bill.BillTotalCountReq;
import com.transsnet.palmpay.core.bean.bill.BillTotalCountResp;
import com.transsnet.palmpay.core.bean.bill.TransHistoryReq;
import com.transsnet.palmpay.core.bean.bill.TransHistoryReqV2;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRspV2;
import com.transsnet.palmpay.core.bean.bill.TransHistroyDownReq;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierQueryCouponReq;
import com.transsnet.palmpay.core.bean.cashier.CashierQueryUserCouponsRsp;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenRsp;
import com.transsnet.palmpay.core.bean.device.SetDeviceNotificationReq;
import com.transsnet.palmpay.core.bean.device.UpdatePushClientIdReq;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.payment.CancelPaymentRetryReq;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.payment.QueryPaymentRetryMethodsReq;
import com.transsnet.palmpay.core.bean.payment.SubmitPaymentRetryReq;
import com.transsnet.palmpay.core.bean.req.AddBankAccSendOtpReq;
import com.transsnet.palmpay.core.bean.req.AddBankAccountReq;
import com.transsnet.palmpay.core.bean.req.AddContactReq;
import com.transsnet.palmpay.core.bean.req.AnalysisBlankQrCodeReq;
import com.transsnet.palmpay.core.bean.req.AppListCollectUpload;
import com.transsnet.palmpay.core.bean.req.AppListCollectUploadBean;
import com.transsnet.palmpay.core.bean.req.BillPaymentEditReq;
import com.transsnet.palmpay.core.bean.req.BindBankAccountReq;
import com.transsnet.palmpay.core.bean.req.BindBankCardReq;
import com.transsnet.palmpay.core.bean.req.CancelVoucherReq;
import com.transsnet.palmpay.core.bean.req.ClaimCouponReq;
import com.transsnet.palmpay.core.bean.req.ClipboardMatchInfoReq;
import com.transsnet.palmpay.core.bean.req.CntDownSecondsCommonReq;
import com.transsnet.palmpay.core.bean.req.CommentAddReq;
import com.transsnet.palmpay.core.bean.req.CommitAnswerReq;
import com.transsnet.palmpay.core.bean.req.CommonShareReq;
import com.transsnet.palmpay.core.bean.req.ConfigReq;
import com.transsnet.palmpay.core.bean.req.DeleteHistoryOrderReq;
import com.transsnet.palmpay.core.bean.req.FundSendOtpReq;
import com.transsnet.palmpay.core.bean.req.GenerateAuthCodeReq;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.bean.req.GetMenuBySceneReq;
import com.transsnet.palmpay.core.bean.req.GetMsgByTypeReq;
import com.transsnet.palmpay.core.bean.req.GetRecentMerchantsReq;
import com.transsnet.palmpay.core.bean.req.GetS3PreSignedUrl;
import com.transsnet.palmpay.core.bean.req.GetS3PreSignedUrlForDownload;
import com.transsnet.palmpay.core.bean.req.GetSendCashDetailReq;
import com.transsnet.palmpay.core.bean.req.ParseInstalmentsQrcodeReq;
import com.transsnet.palmpay.core.bean.req.PayMerchantOrderAddReq;
import com.transsnet.palmpay.core.bean.req.PayPalmPayBusinessOrderAddReq;
import com.transsnet.palmpay.core.bean.req.PreviewCalcPayInfoReq;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.bean.req.QrcodeGenerateReq;
import com.transsnet.palmpay.core.bean.req.QueryBankListReq;
import com.transsnet.palmpay.core.bean.req.QueryBankcardUserNameReq;
import com.transsnet.palmpay.core.bean.req.QueryCouponByConditionReq;
import com.transsnet.palmpay.core.bean.req.QueryCouponStatisticsReq;
import com.transsnet.palmpay.core.bean.req.QueryFamilyAccountReq;
import com.transsnet.palmpay.core.bean.req.QueryLatestPushReq;
import com.transsnet.palmpay.core.bean.req.QueryLimitAmountV2Req;
import com.transsnet.palmpay.core.bean.req.QueryMemberByCodePlateReq;
import com.transsnet.palmpay.core.bean.req.QueryRecipientReq;
import com.transsnet.palmpay.core.bean.req.QueryServiceStateByCategoryIdReq;
import com.transsnet.palmpay.core.bean.req.QueryUiResourceReq;
import com.transsnet.palmpay.core.bean.req.QueryUnReadMsgCntReq;
import com.transsnet.palmpay.core.bean.req.ReportUssdRespondReq;
import com.transsnet.palmpay.core.bean.req.RiskControlOtcReq;
import com.transsnet.palmpay.core.bean.req.SendBettingOTPReq;
import com.transsnet.palmpay.core.bean.req.ShareOrderReq;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.bean.req.USSDFundResultReq;
import com.transsnet.palmpay.core.bean.req.UbaBankPaySendOtpReq;
import com.transsnet.palmpay.core.bean.req.UploadAppListV2Req;
import com.transsnet.palmpay.core.bean.req.UploadContactsItemReq;
import com.transsnet.palmpay.core.bean.req.UploadContactsReq;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoV2Req;
import com.transsnet.palmpay.core.bean.req.VerifyRiskControlSmsReq;
import com.transsnet.palmpay.core.bean.reward.OrderResultRewardResp;
import com.transsnet.palmpay.core.bean.reward.OrderResultRewardsReq;
import com.transsnet.palmpay.core.bean.rsp.AddBankAccSendOtpRsp;
import com.transsnet.palmpay.core.bean.rsp.AddPayBankAccRsp;
import com.transsnet.palmpay.core.bean.rsp.AnalysisBlankQrCodeRsp;
import com.transsnet.palmpay.core.bean.rsp.AnalysisCouponQrCodeRsp;
import com.transsnet.palmpay.core.bean.rsp.AnalysisPartnerInRsp;
import com.transsnet.palmpay.core.bean.rsp.AppListCollectConfigBean;
import com.transsnet.palmpay.core.bean.rsp.BillSavingBannerRsp;
import com.transsnet.palmpay.core.bean.rsp.BillerRenewalBodyBean;
import com.transsnet.palmpay.core.bean.rsp.BindActionRsp;
import com.transsnet.palmpay.core.bean.rsp.BuyEarlyRefundOrderDetailRsp;
import com.transsnet.palmpay.core.bean.rsp.CardNoBankInfoRsp;
import com.transsnet.palmpay.core.bean.rsp.CashBoxTrialCashEntryResp;
import com.transsnet.palmpay.core.bean.rsp.CashInOrderDetailRsp;
import com.transsnet.palmpay.core.bean.rsp.CheckCouponRsp;
import com.transsnet.palmpay.core.bean.rsp.ClipboardMatchInfoResp;
import com.transsnet.palmpay.core.bean.rsp.CommonRewardRsp;
import com.transsnet.palmpay.core.bean.rsp.CommonShareNewRsp;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.bean.rsp.CoreCommentResp;
import com.transsnet.palmpay.core.bean.rsp.ExpressInfo;
import com.transsnet.palmpay.core.bean.rsp.FundOtpRsp;
import com.transsnet.palmpay.core.bean.rsp.GenerateAuthCodeResp;
import com.transsnet.palmpay.core.bean.rsp.GetCashBoxNewcomerResp;
import com.transsnet.palmpay.core.bean.rsp.GetCustomerServiceUrlRsp;
import com.transsnet.palmpay.core.bean.rsp.GetFundActivityConfigRsp;
import com.transsnet.palmpay.core.bean.rsp.GetMenuBillPaymentRsp;
import com.transsnet.palmpay.core.bean.rsp.GetMenuBySceneRsp;
import com.transsnet.palmpay.core.bean.rsp.GetMoneyConfigResp;
import com.transsnet.palmpay.core.bean.rsp.GetRecentMerchantsResp;
import com.transsnet.palmpay.core.bean.rsp.InterBankCashInOrderDetailRsp;
import com.transsnet.palmpay.core.bean.rsp.LocalNotificationConfigRsp;
import com.transsnet.palmpay.core.bean.rsp.ManualCalcOfPaymentMethodBean;
import com.transsnet.palmpay.core.bean.rsp.ManualCalcOfPaymentMethodResp;
import com.transsnet.palmpay.core.bean.rsp.OkCardPreCreditInfoRsp;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactListResp;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactQueryResp;
import com.transsnet.palmpay.core.bean.rsp.ParseInstalmentsQrcodeRsp;
import com.transsnet.palmpay.core.bean.rsp.PayFailResultAdRsp;
import com.transsnet.palmpay.core.bean.rsp.PayMerchantOrderAddRsp;
import com.transsnet.palmpay.core.bean.rsp.PayMoneyToPalmpayBusinessDetailRsp;
import com.transsnet.palmpay.core.bean.rsp.PayPalmPayBusinessOrderAddRsp;
import com.transsnet.palmpay.core.bean.rsp.QrcodeGenerateResp;
import com.transsnet.palmpay.core.bean.rsp.QueryAcqOrderDetailRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryCouponClaimBodyData;
import com.transsnet.palmpay.core.bean.rsp.QueryGroupTagRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.core.bean.rsp.QueryMemberEmailRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryPaymentRewardRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryRecentlyMerchantResp;
import com.transsnet.palmpay.core.bean.rsp.QueryRefund2BillDetailRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryServiceStateByCategoryIdRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryUiResourceRsp1;
import com.transsnet.palmpay.core.bean.rsp.QueryUserCouponsRsp;
import com.transsnet.palmpay.core.bean.rsp.R2CUssdDialNoResp;
import com.transsnet.palmpay.core.bean.rsp.RegisterAccountResp;
import com.transsnet.palmpay.core.bean.rsp.ShareOrderRsp;
import com.transsnet.palmpay.core.bean.rsp.SmsActionRsp;
import com.transsnet.palmpay.core.bean.rsp.SmsChannelRsp;
import com.transsnet.palmpay.core.bean.rsp.TransactionFilterResp;
import com.transsnet.palmpay.core.bean.rsp.USSDFundResp;
import com.transsnet.palmpay.core.bean.rsp.UnReadMsgCntRsp;
import com.transsnet.palmpay.core.bean.rsp.UploadAppListV2Rsp;
import com.transsnet.palmpay.core.bean.rsp.UssdListRsp;
import com.transsnet.palmpay.core.bean.rsp.VerifyRiskControlSmsRsp;
import com.transsnet.palmpay.core.bean.rsp.WithdrawBettingOtpRsp;
import com.transsnet.palmpay.core.bean.verify.VerifyQuestionNodeBean;
import com.transsnet.palmpay.core.bean.verify.VerifySumbitAnswerRsp;
import com.transsnet.palmpay.core.network.annotation.JsonName;
import df.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009c\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\t\u0010\u0007J1\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\b\u0019\u0010\u0018J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u001eH'¢\u0006\u0004\b \u0010!J\"\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\"H§@¢\u0006\u0004\b%\u0010&J\u001c\u0010)\u001a\u00020(2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010'H§@¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010+H'¢\u0006\u0004\b-\u0010.J!\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010/H'¢\u0006\u0004\b1\u00102J\u001c\u00103\u001a\u0002002\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010/H§@¢\u0006\u0004\b3\u00104J\u001c\u00108\u001a\u0002072\n\b\u0001\u00106\u001a\u0004\u0018\u000105H§@¢\u0006\u0004\b8\u00109J!\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010:H'¢\u0006\u0004\b<\u0010=J!\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010>H'¢\u0006\u0004\b@\u0010AJ\u001c\u0010B\u001a\u00020;2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010:H§@¢\u0006\u0004\bB\u0010CJ\"\u0010E\u001a\b\u0012\u0004\u0012\u00020D0#2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010>H§@¢\u0006\u0004\bE\u0010FJ!\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010GH'¢\u0006\u0004\bI\u0010JJ\u001c\u0010K\u001a\u00020H2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010GH§@¢\u0006\u0004\bK\u0010LJ!\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010MH'¢\u0006\u0004\bO\u0010PJ!\u0010Q\u001a\b\u0012\u0004\u0012\u00020H0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010GH'¢\u0006\u0004\bQ\u0010JJ!\u0010R\u001a\b\u0012\u0004\u0012\u00020N0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010MH'¢\u0006\u0004\bR\u0010PJ!\u0010S\u001a\b\u0012\u0004\u0012\u00020N0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010MH'¢\u0006\u0004\bS\u0010PJ\u001b\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0#0\u0004H'¢\u0006\u0004\bU\u0010VJ!\u0010W\u001a\b\u0012\u0004\u0012\u00020N0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010MH'¢\u0006\u0004\bW\u0010PJ\u001c\u0010X\u001a\u00020N2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010MH§@¢\u0006\u0004\bX\u0010YJ!\u0010Z\u001a\b\u0012\u0004\u0012\u00020N0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010MH'¢\u0006\u0004\bZ\u0010PJ\u001c\u0010[\u001a\u00020N2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010MH§@¢\u0006\u0004\b[\u0010YJ!\u0010\\\u001a\b\u0012\u0004\u0012\u00020H0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010GH'¢\u0006\u0004\b\\\u0010JJ!\u0010]\u001a\b\u0012\u0004\u0012\u00020N0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010MH'¢\u0006\u0004\b]\u0010PJ!\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010^H'¢\u0006\u0004\b_\u0010`J!\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010aH'¢\u0006\u0004\bc\u0010dJ'\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0#0\u00042\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\bg\u0010hJ!\u0010k\u001a\b\u0012\u0004\u0012\u00020j0\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010iH'¢\u0006\u0004\bk\u0010lJ!\u0010o\u001a\b\u0012\u0004\u0012\u00020n0\u00042\n\b\u0001\u0010m\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\bo\u0010hJ)\u0010s\u001a\b\u0012\u0004\u0012\u00020r0\u00042\b\b\u0001\u0010p\u001a\u00020\f2\b\b\u0001\u0010q\u001a\u00020\nH'¢\u0006\u0004\bs\u0010tJ!\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\bv\u0010hJ$\u0010y\u001a\n\u0012\u0004\u0012\u00020x\u0018\u00010#2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010wH§@¢\u0006\u0004\by\u0010zJ\u001c\u0010}\u001a\u00020|2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010{H§@¢\u0006\u0004\b}\u0010~J%\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u007fH'¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J!\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u0083\u0001H§@¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J&\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u0087\u0001H'¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J'\u0010\u008c\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u008b\u00010#2\t\b\u0001\u0010\u0016\u001a\u00030\u008a\u0001H§@¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001c\u0010\u008e\u0001\u001a\u00020H2\b\b\u0001\u0010\u0003\u001a\u00020GH§@¢\u0006\u0005\b\u008e\u0001\u0010LJ\u001f\u0010\u0091\u0001\u001a\u00030\u0090\u00012\t\b\u0001\u0010\u0016\u001a\u00030\u008f\u0001H§@¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J'\u0010\u0095\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010\u000e2\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u0093\u0001H§@¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J \u0010\u0098\u0001\u001a\u00020H2\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u0097\u0001H§@¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J \u0010\u009b\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u009a\u0001H§@¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J!\u0010\u009f\u0001\u001a\u00030\u009e\u00012\u000b\b\u0001\u0010\u009d\u0001\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J!\u0010£\u0001\u001a\u00030¢\u00012\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010¡\u0001H§@¢\u0006\u0006\b£\u0001\u0010¤\u0001J2\u0010¦\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010#2\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010q\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001e\u0010©\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¨\u00010#0\u0004H'¢\u0006\u0005\b©\u0001\u0010VJ&\u0010¬\u0001\u001a\t\u0012\u0005\u0012\u00030«\u00010\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010ª\u0001H'¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J&\u0010¯\u0001\u001a\t\u0012\u0005\u0012\u00030«\u00010\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010®\u0001H'¢\u0006\u0006\b¯\u0001\u0010°\u0001J&\u0010³\u0001\u001a\t\u0012\u0005\u0012\u00030²\u00010\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010±\u0001H'¢\u0006\u0006\b³\u0001\u0010´\u0001J&\u0010·\u0001\u001a\t\u0012\u0005\u0012\u00030¶\u00010\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010µ\u0001H'¢\u0006\u0006\b·\u0001\u0010¸\u0001J&\u0010»\u0001\u001a\t\u0012\u0005\u0012\u00030º\u00010\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010¹\u0001H'¢\u0006\u0006\b»\u0001\u0010¼\u0001J,\u0010»\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¾\u00010#0\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010½\u0001H'¢\u0006\u0006\b»\u0001\u0010¿\u0001J$\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010\u00042\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH'¢\u0006\u0005\bÁ\u0001\u0010hJ*\u0010Ã\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Â\u00010#0\u00042\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH'¢\u0006\u0005\bÃ\u0001\u0010hJ!\u0010Æ\u0001\u001a\u00030Å\u00012\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010Ä\u0001H§@¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u0018\u0010É\u0001\u001a\t\u0012\u0005\u0012\u00030È\u00010\u0004H'¢\u0006\u0005\bÉ\u0001\u0010VJ&\u0010Ì\u0001\u001a\t\u0012\u0005\u0012\u00030Ë\u00010\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Ê\u0001H'¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J-\u0010Ñ\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ð\u00010#0\u00042\f\b\u0001\u0010Ï\u0001\u001a\u0005\u0018\u00010Î\u0001H'¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J!\u0010Õ\u0001\u001a\u00030Ô\u00012\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010Ó\u0001H§@¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J%\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010×\u0001H'¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J&\u0010Ü\u0001\u001a\t\u0012\u0005\u0012\u00030Û\u00010\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010Ú\u0001H'¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J!\u0010Þ\u0001\u001a\u00030Û\u00012\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010Ú\u0001H§@¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J,\u0010á\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030à\u00010#0\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010Ú\u0001H'¢\u0006\u0006\bá\u0001\u0010Ý\u0001J$\u0010ã\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000b\b\u0001\u0010â\u0001\u001a\u0004\u0018\u00010\nH'¢\u0006\u0005\bã\u0001\u0010hJ'\u0010ç\u0001\u001a\t\u0012\u0005\u0012\u00030æ\u00010\u00042\f\b\u0001\u0010å\u0001\u001a\u0005\u0018\u00010ä\u0001H'¢\u0006\u0006\bç\u0001\u0010è\u0001J\"\u0010é\u0001\u001a\u00030æ\u00012\f\b\u0001\u0010å\u0001\u001a\u0005\u0018\u00010ä\u0001H§@¢\u0006\u0006\bé\u0001\u0010ê\u0001J*\u0010ì\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ë\u00010#0\u00042\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH'¢\u0006\u0005\bì\u0001\u0010hJ*\u0010í\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ë\u00010#0\u00042\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH'¢\u0006\u0005\bí\u0001\u0010hJ*\u0010î\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ë\u00010#0\u00042\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH'¢\u0006\u0005\bî\u0001\u0010hJ&\u0010ñ\u0001\u001a\t\u0012\u0005\u0012\u00030ð\u00010\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010ï\u0001H'¢\u0006\u0006\bñ\u0001\u0010ò\u0001J!\u0010õ\u0001\u001a\u00030ô\u00012\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010ó\u0001H§@¢\u0006\u0006\bõ\u0001\u0010ö\u0001J%\u0010ù\u0001\u001a\t\u0012\u0005\u0012\u00030ø\u00010\u00042\u000b\b\u0001\u0010÷\u0001\u001a\u0004\u0018\u00010\nH'¢\u0006\u0005\bù\u0001\u0010hJ%\u0010ü\u0001\u001a\t\u0012\u0005\u0012\u00030û\u00010\u00042\u000b\b\u0001\u0010ú\u0001\u001a\u0004\u0018\u00010\nH'¢\u0006\u0005\bü\u0001\u0010hJ!\u0010ý\u0001\u001a\u00030û\u00012\u000b\b\u0001\u0010ú\u0001\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\bý\u0001\u0010 \u0001J%\u0010ÿ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010þ\u0001H'¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J%\u0010\u0082\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0081\u0002H'¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J&\u0010\u0086\u0002\u001a\t\u0012\u0005\u0012\u00030\u0085\u00020\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0084\u0002H'¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002J,\u0010\u008a\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00020#0\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0088\u0002H'¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002J%\u0010\u008d\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u008c\u0002H'¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002J$\u0010\u0090\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000b\b\u0001\u0010\u008f\u0002\u001a\u0004\u0018\u00010\nH'¢\u0006\u0005\b\u0090\u0002\u0010hJ$\u0010\u0092\u0002\u001a\t\u0012\u0005\u0012\u00030\u0091\u00020\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0005\b\u0092\u0002\u0010hJ$\u0010\u0094\u0002\u001a\t\u0012\u0005\u0012\u00030\u0093\u00020\u00042\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH'¢\u0006\u0005\b\u0094\u0002\u0010hJ \u0010\u0095\u0002\u001a\u00030\u0093\u00022\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b\u0095\u0002\u0010 \u0001J%\u0010\u0098\u0002\u001a\t\u0012\u0005\u0012\u00030\u0097\u00020\u00042\u000b\b\u0001\u0010\u0096\u0002\u001a\u0004\u0018\u00010\nH'¢\u0006\u0005\b\u0098\u0002\u0010hJ&\u0010\u009b\u0002\u001a\t\u0012\u0005\u0012\u00030\u009a\u00020\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u0099\u0002H'¢\u0006\u0006\b\u009b\u0002\u0010\u009c\u0002J\u0014\u0010\u009d\u0002\u001a\u00030Û\u0001H§@¢\u0006\u0006\b\u009d\u0002\u0010\u009e\u0002J&\u0010¡\u0002\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u009f\u0002H'¢\u0006\u0006\b¡\u0002\u0010¢\u0002J!\u0010£\u0002\u001a\u00030 \u00022\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u009f\u0002H§@¢\u0006\u0006\b£\u0002\u0010¤\u0002J\u001e\u0010¦\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¥\u00020#0\u0004H'¢\u0006\u0005\b¦\u0002\u0010VJ$\u0010©\u0002\u001a\t\u0012\u0005\u0012\u00030¨\u00020\u00042\t\b\u0001\u0010\u0016\u001a\u00030§\u0002H'¢\u0006\u0006\b©\u0002\u0010ª\u0002J\u001f\u0010«\u0002\u001a\u00030¨\u00022\t\b\u0001\u0010\u0016\u001a\u00030§\u0002H§@¢\u0006\u0006\b«\u0002\u0010¬\u0002J,\u0010¯\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030®\u00020#0\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u00ad\u0002H'¢\u0006\u0006\b¯\u0002\u0010°\u0002J*\u0010²\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030±\u00020#0\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010:H'¢\u0006\u0005\b²\u0002\u0010=J*\u0010³\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030±\u00020#0\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010>H'¢\u0006\u0005\b³\u0002\u0010AJ\u001f\u0010´\u0002\u001a\u00020j2\n\b\u0001\u0010q\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b´\u0002\u0010 \u0001J\u001f\u0010µ\u0002\u001a\u00020j2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010iH§@¢\u0006\u0006\bµ\u0002\u0010¶\u0002J\u001f\u0010¹\u0002\u001a\u00030¸\u00022\t\b\u0001\u0010\u0016\u001a\u00030·\u0002H§@¢\u0006\u0006\b¹\u0002\u0010º\u0002J\u001a\u0010¼\u0002\u001a\t\u0012\u0005\u0012\u00030»\u00020#H§@¢\u0006\u0006\b¼\u0002\u0010\u009e\u0002J\u001e\u0010¾\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030½\u00020#0\u0004H'¢\u0006\u0005\b¾\u0002\u0010VJ\u0014\u0010À\u0002\u001a\u00030¿\u0002H§@¢\u0006\u0006\bÀ\u0002\u0010\u009e\u0002J \u0010Â\u0002\u001a\u00020\u00052\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010Á\u0002H§@¢\u0006\u0006\bÂ\u0002\u0010Ã\u0002J#\u0010Å\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\t\b\u0001\u0010\u0016\u001a\u00030Ä\u0002H'¢\u0006\u0006\bÅ\u0002\u0010Æ\u0002J\u0014\u0010È\u0002\u001a\u00030Ç\u0002H§@¢\u0006\u0006\bÈ\u0002\u0010\u009e\u0002J\u0014\u0010Ê\u0002\u001a\u00030É\u0002H§@¢\u0006\u0006\bÊ\u0002\u0010\u009e\u0002J2\u0010Î\u0002\u001a\u00030É\u00022\u001c\b\u0001\u0010\u0016\u001a\u0016\u0012\u0005\u0012\u00030Ì\u00020Ë\u0002j\n\u0012\u0005\u0012\u00030Ì\u0002`Í\u0002H§@¢\u0006\u0006\bÎ\u0002\u0010Ï\u0002J%\u0010Ð\u0002\u001a\b\u0012\u0004\u0012\u00020f0#2\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\bÐ\u0002\u0010 \u0001J&\u0010Ò\u0002\u001a\t\u0012\u0005\u0012\u00030Ñ\u00020#2\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\bÒ\u0002\u0010 \u0001J\u0017\u0010Ó\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0005\bÓ\u0002\u0010VJ \u0010Õ\u0002\u001a\u00020\u00052\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010Ô\u0002H§@¢\u0006\u0006\bÕ\u0002\u0010Ö\u0002J\u001a\u0010Ø\u0002\u001a\t\u0012\u0005\u0012\u00030×\u00020#H§@¢\u0006\u0006\bØ\u0002\u0010\u009e\u0002J\u0013\u0010Ù\u0002\u001a\u00020\u0005H§@¢\u0006\u0006\bÙ\u0002\u0010\u009e\u0002J\u001a\u0010Û\u0002\u001a\t\u0012\u0005\u0012\u00030Ú\u00020#H§@¢\u0006\u0006\bÛ\u0002\u0010\u009e\u0002J'\u0010Þ\u0002\u001a\t\u0012\u0005\u0012\u00030Ý\u00020\u000e2\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010Ü\u0002H§@¢\u0006\u0006\bÞ\u0002\u0010ß\u0002J\u001e\u0010á\u0002\u001a\u00020\u00052\t\b\u0001\u0010\u0016\u001a\u00030à\u0002H§@¢\u0006\u0006\bá\u0002\u0010â\u0002J$\u0010ä\u0002\u001a\t\u0012\u0005\u0012\u00030ã\u00020#2\b\b\u0001\u0010q\u001a\u00020\nH§@¢\u0006\u0006\bä\u0002\u0010 \u0001J\u001a\u0010æ\u0002\u001a\t\u0012\u0005\u0012\u00030å\u00020#H§@¢\u0006\u0006\bæ\u0002\u0010\u009e\u0002J%\u0010é\u0002\u001a\t\u0012\u0005\u0012\u00030è\u00020#2\t\b\u0001\u0010ç\u0002\u001a\u00020\nH§@¢\u0006\u0006\bé\u0002\u0010 \u0001J$\u0010ë\u0002\u001a\t\u0012\u0005\u0012\u00030ê\u00020#2\b\b\u0001\u0010q\u001a\u00020\nH§@¢\u0006\u0006\bë\u0002\u0010 \u0001J$\u0010í\u0002\u001a\t\u0012\u0005\u0012\u00030ì\u00020#2\b\b\u0001\u0010q\u001a\u00020\nH§@¢\u0006\u0006\bí\u0002\u0010 \u0001J\u001d\u0010î\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0#0\u0004H'¢\u0006\u0005\bî\u0002\u0010VJ\u001e\u0010ð\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ï\u00020#0\u0004H'¢\u0006\u0005\bð\u0002\u0010VJ&\u0010ò\u0002\u001a\t\u0012\u0005\u0012\u00030ñ\u00020#2\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\bò\u0002\u0010 \u0001J\u001f\u0010õ\u0002\u001a\u00030ô\u00022\t\b\u0001\u0010\u0016\u001a\u00030ó\u0002H§@¢\u0006\u0006\bõ\u0002\u0010ö\u0002J'\u0010ù\u0002\u001a\t\u0012\u0005\u0012\u00030ø\u00020#2\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010÷\u0002H§@¢\u0006\u0006\bù\u0002\u0010ú\u0002J!\u0010ý\u0002\u001a\u00030ü\u00022\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010û\u0002H§@¢\u0006\u0006\bý\u0002\u0010þ\u0002J'\u0010\u0081\u0003\u001a\t\u0012\u0005\u0012\u00030\u0080\u00030\u000e2\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010ÿ\u0002H§@¢\u0006\u0006\b\u0081\u0003\u0010\u0082\u0003J'\u0010\u0085\u0003\u001a\t\u0012\u0005\u0012\u00030\u0084\u00030#2\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u0083\u0003H§@¢\u0006\u0006\b\u0085\u0003\u0010\u0086\u0003J'\u0010\u0087\u0003\u001a\t\u0012\u0005\u0012\u00030\u0084\u00030#2\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u0083\u0003H§@¢\u0006\u0006\b\u0087\u0003\u0010\u0086\u0003J&\u0010\u0089\u0003\u001a\t\u0012\u0005\u0012\u00030Û\u00010\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u0088\u0003H'¢\u0006\u0006\b\u0089\u0003\u0010\u008a\u0003J!\u0010\u008b\u0003\u001a\u00030Û\u00012\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u0088\u0003H§@¢\u0006\u0006\b\u008b\u0003\u0010\u008c\u0003J&\u0010\u008e\u0003\u001a\t\u0012\u0005\u0012\u00030Û\u00010\u00042\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010\u008d\u0003H'¢\u0006\u0006\b\u008e\u0003\u0010\u008f\u0003J*\u0010\u0092\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0091\u00030#0\u00042\t\b\u0001\u0010\u0016\u001a\u00030\u0090\u0003H'¢\u0006\u0006\b\u0092\u0003\u0010\u0093\u0003J'\u0010\u0096\u0003\u001a\t\u0012\u0005\u0012\u00030\u0095\u00030#2\u000b\b\u0001\u0010\u0094\u0003\u001a\u0004\u0018\u00010\fH§@¢\u0006\u0006\b\u0096\u0003\u0010\u0097\u0003J%\u0010\u009a\u0003\u001a\t\u0012\u0005\u0012\u00030\u0099\u00030#2\t\b\u0001\u0010\u0016\u001a\u00030\u0098\u0003H§@¢\u0006\u0006\b\u009a\u0003\u0010\u009b\u0003J \u0010\u009d\u0003\u001a\u00020\u00052\u000b\b\u0001\u0010\u009c\u0003\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b\u009d\u0003\u0010 \u0001J&\u0010\u009f\u0003\u001a\t\u0012\u0005\u0012\u00030\u009e\u00030#2\n\b\u0001\u0010q\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b\u009f\u0003\u0010 \u0001J3\u0010¢\u0003\u001a\t\u0012\u0005\u0012\u00030¡\u00030#2\u000b\b\u0001\u0010 \u0003\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010q\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b¢\u0003\u0010§\u0001J8\u0010£\u0003\u001a\u00020\u00052\n\b\u0001\u0010q\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010 \u0003\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b£\u0003\u0010¤\u0003J=\u0010¥\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010q\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010 \u0003\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\nH'¢\u0006\u0006\b¥\u0003\u0010¦\u0003J'\u0010©\u0003\u001a\t\u0012\u0005\u0012\u00030¨\u00030#2\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010§\u0003H§@¢\u0006\u0006\b©\u0003\u0010ª\u0003JR\u0010\u00ad\u0003\u001a\u00020\u00052\u000b\b\u0001\u0010«\u0003\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010q\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010\u0096\u0002\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010¬\u0003\u001a\u0004\u0018\u00010\fH§@¢\u0006\u0006\b\u00ad\u0003\u0010®\u0003J'\u0010±\u0003\u001a\t\u0012\u0005\u0012\u00030°\u00030#2\u000b\b\u0001\u0010¯\u0003\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b±\u0003\u0010 \u0001J'\u0010´\u0003\u001a\t\u0012\u0005\u0012\u00030³\u00030#2\u000b\b\u0001\u0010\u0016\u001a\u0005\u0018\u00010²\u0003H§@¢\u0006\u0006\b´\u0003\u0010µ\u0003J \u0010¶\u0003\u001a\u00020\u00052\u000b\b\u0001\u0010¯\u0003\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b¶\u0003\u0010 \u0001J-\u0010¸\u0003\u001a\u00020\u00052\u000b\b\u0001\u0010¯\u0003\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010·\u0003\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b¸\u0003\u0010§\u0001J/\u0010¹\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0006\b¹\u0003\u0010º\u0003J \u0010¼\u0003\u001a\u00020\u00052\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010»\u0003H§@¢\u0006\u0006\b¼\u0003\u0010½\u0003J\u001c\u0010¿\u0003\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010¾\u00030#H§@¢\u0006\u0006\b¿\u0003\u0010\u009e\u0002J4\u0010Â\u0003\u001a\t\u0012\u0005\u0012\u00030Á\u00030#2\u000b\b\u0001\u0010À\u0003\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010 \u0003\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\bÂ\u0003\u0010§\u0001J'\u0010Å\u0003\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Ä\u00030#2\t\b\u0001\u0010\u0003\u001a\u00030Ã\u0003H§@¢\u0006\u0006\bÅ\u0003\u0010Æ\u0003J \u0010È\u0003\u001a\u00020\u00052\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Ç\u0003H§@¢\u0006\u0006\bÈ\u0003\u0010É\u0003J\u001f\u0010Ì\u0003\u001a\u00030Ë\u00032\t\b\u0001\u0010Ê\u0003\u001a\u00020\fH§@¢\u0006\u0006\bÌ\u0003\u0010Í\u0003J%\u0010Ð\u0003\u001a\t\u0012\u0005\u0012\u00030Ï\u00030#2\t\b\u0001\u0010\u0016\u001a\u00030Î\u0003H§@¢\u0006\u0006\bÐ\u0003\u0010Ñ\u0003J#\u0010Ó\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\t\b\u0001\u0010\u0003\u001a\u00030Ò\u0003H'¢\u0006\u0006\bÓ\u0003\u0010Ô\u0003R#\u0010×\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Õ\u00030\u000e0\u00048gX¦\u0004¢\u0006\u0007\u001a\u0005\bÖ\u0003\u0010V¨\u0006Ø\u0003"}, d2 = {"Lcom/transsnet/palmpay/core/network/PayApiService;", "", "Lcom/transsnet/palmpay/core/bean/req/SmsActionReq;", "body", "Ldf/d;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "sendSms", "(Lcom/transsnet/palmpay/core/bean/req/SmsActionReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/rsp/SmsActionRsp;", "checkSmsCode", "", "phone", "", "scene", "Lcom/transsnet/palmpay/core/bean/CommonListResultV2;", "Lcom/transsnet/palmpay/core/bean/rsp/SmsChannelRsp;", "getSmsChannel", "(Ljava/lang/String;I)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/device/SetDeviceNotificationReq;", "enableDeviceNotification", "(Lcom/transsnet/palmpay/core/bean/device/SetDeviceNotificationReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/device/UpdatePushClientIdReq;", "req", "updatePushClientId", "(Lcom/transsnet/palmpay/core/bean/device/UpdatePushClientIdReq;)Ldf/d;", "saveDeviceInfo", "Lcom/transsnet/palmpay/core/bean/bill/BillReqNew;", "Lcom/transsnet/palmpay/core/bean/bill/BillRsp;", "getBills", "(Lcom/transsnet/palmpay/core/bean/bill/BillReqNew;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/bill/TransHistoryReq;", "Lcom/transsnet/palmpay/core/bean/bill/TransHistoryRsp;", "getTransactionHistory", "(Lcom/transsnet/palmpay/core/bean/bill/TransHistoryReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/bill/BillTotalCountReq;", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/core/bean/bill/BillTotalCountResp;", "getBillTotalCount", "(Lcom/transsnet/palmpay/core/bean/bill/BillTotalCountReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/bill/TransHistoryReqV2;", "Lcom/transsnet/palmpay/core/bean/bill/TransHistoryRspV2;", "getTransactionHistoryV2", "(Lcom/transsnet/palmpay/core/bean/bill/TransHistoryReqV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/GetMsgByTypeReq;", "Lcom/transsnet/palmpay/core/bean/message/GetMsgRsp;", "getMessagesByTypeV2", "(Lcom/transsnet/palmpay/core/bean/req/GetMsgByTypeReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/QueryBankListReq;", "Lcom/transsnet/palmpay/core/bean/QueryBankListRsp;", "queryBankList", "(Lcom/transsnet/palmpay/core/bean/req/QueryBankListReq;)Ldf/d;", "queryBankListMvvm", "(Lcom/transsnet/palmpay/core/bean/req/QueryBankListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/QueryBankcardUserNameReq;", "queryBankcardUserNameReq", "Lcom/transsnet/palmpay/core/bean/QueryBankcardUserNameRsp;", "queryBankcardUserNameMvvm", "(Lcom/transsnet/palmpay/core/bean/req/QueryBankcardUserNameReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/PreviewPayInfoV2Req;", "Lcom/transsnet/palmpay/core/bean/payment/PreviewPayInfoResp;", "queryPreviewPayInfoV2", "(Lcom/transsnet/palmpay/core/bean/req/PreviewPayInfoV2Req;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/PreviewCalcPayInfoReq;", "Lcom/transsnet/palmpay/core/bean/rsp/ManualCalcOfPaymentMethodResp;", "queryPreviewPayInfoByV4", "(Lcom/transsnet/palmpay/core/bean/req/PreviewCalcPayInfoReq;)Ldf/d;", "queryPreviewPayInfoV2New", "(Lcom/transsnet/palmpay/core/bean/req/PreviewPayInfoV2Req;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/rsp/ManualCalcOfPaymentMethodBean;", "queryPreviewPayInfoByVM", "(Lcom/transsnet/palmpay/core/bean/req/PreviewCalcPayInfoReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/payment/PayByOrderReq;", "Lcom/transsnet/palmpay/core/bean/payment/PayByOrderResp;", "payByOrderNoV2", "(Lcom/transsnet/palmpay/core/bean/payment/PayByOrderReq;)Ldf/d;", "payByOrderNoV2VM", "(Lcom/transsnet/palmpay/core/bean/payment/PayByOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/payment/CheckPayReq;", "Lcom/transsnet/palmpay/core/bean/payment/CheckPayResp;", "checkPay", "(Lcom/transsnet/palmpay/core/bean/payment/CheckPayReq;)Ldf/d;", "payByNewOrderNoV2", "checkSavingPay", "checkWithdrawalPay", "Lcom/transsnet/palmpay/core/bean/rsp/R2CUssdDialNoResp;", "getUSSDDialNo", "()Ldf/d;", "queryPayResult", "queryPayResultVM", "(Lcom/transsnet/palmpay/core/bean/payment/CheckPayReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryNewPayResult", "queryNewPayResultMv", "partnerPayByOrderNo", "partnerCheckPay", "Lcom/transsnet/palmpay/core/bean/req/RiskControlOtcReq;", "sendPayVerifySms", "(Lcom/transsnet/palmpay/core/bean/req/RiskControlOtcReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/VerifyRiskControlSmsReq;", "Lcom/transsnet/palmpay/core/bean/rsp/VerifyRiskControlSmsRsp;", "verifyRiskControlSms", "(Lcom/transsnet/palmpay/core/bean/req/VerifyRiskControlSmsReq;)Ldf/d;", "orderNo", "Lcom/transsnet/palmpay/core/bean/rsp/QueryRefund2BillDetailRsp;", "getRefund2Detail", "(Ljava/lang/String;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/QueryLimitAmountV2Req;", "Lcom/transsnet/palmpay/core/bean/rsp/QueryLimitAmountResp;", "queryLimitAmountV2", "(Lcom/transsnet/palmpay/core/bean/req/QueryLimitAmountV2Req;)Ldf/d;", "url", "Lcom/transsnet/palmpay/core/bean/ShortUrlResp;", "generatorShortUrl", "accountType", "transType", "Lcom/transsnet/palmpay/core/bean/rsp/QueryPaymentRewardRsp;", "queryPaymentReward", "(ILjava/lang/String;)Ldf/d;", "linkAccountId", "setDefaultRepaymentCard", "Lcom/transsnet/palmpay/core/bean/req/QueryUnReadMsgCntReq;", "Lcom/transsnet/palmpay/core/bean/rsp/UnReadMsgCntRsp;", "queryUnReadMessageCount", "(Lcom/transsnet/palmpay/core/bean/req/QueryUnReadMsgCntReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/GetMenuBySceneReq;", "Lcom/transsnet/palmpay/core/bean/rsp/GetMenuBySceneRsp;", "getMenuBySceneV2", "(Lcom/transsnet/palmpay/core/bean/req/GetMenuBySceneReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/ShareOrderReq;", "Lcom/transsnet/palmpay/core/bean/rsp/ShareOrderRsp;", "shareOrder", "(Lcom/transsnet/palmpay/core/bean/req/ShareOrderReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/QueryCouponStatisticsReq;", "Lcom/transsnet/palmpay/core/bean/rsp/QueryUserCouponsRsp;", "queryCouponStatisticsByNew", "(Lcom/transsnet/palmpay/core/bean/req/QueryCouponStatisticsReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/QueryCouponByConditionReq;", "queryUserCouponListByCondition", "(Lcom/transsnet/palmpay/core/bean/req/QueryCouponByConditionReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/cashier/CashierQueryCouponReq;", "Lcom/transsnet/palmpay/core/bean/cashier/CashierQueryUserCouponsRsp;", "queryUserCouponListByConditionByVM", "(Lcom/transsnet/palmpay/core/bean/cashier/CashierQueryCouponReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payByNewOrderNoByVM", "Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq;", "Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenRsp;", "flexiOneClickOpen", "(Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/payment/QueryPaymentRetryMethodsReq;", "Lcom/transsnet/palmpay/core/bean/cashier/CashierPaymentMethodBean;", "queryPaymentRetryMethods", "(Lcom/transsnet/palmpay/core/bean/payment/QueryPaymentRetryMethodsReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/payment/SubmitPaymentRetryReq;", "submitPaymentRetry", "(Lcom/transsnet/palmpay/core/bean/payment/SubmitPaymentRetryReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/payment/CancelPaymentRetryReq;", "cancelPaymentRetry", "(Lcom/transsnet/palmpay/core/bean/payment/CancelPaymentRetryReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiptUrl", "Lcom/transsnet/palmpay/core/bean/rsp/AnalysisCouponQrCodeRsp;", "analysisCouponQrCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/AnalysisBlankQrCodeReq;", "Lcom/transsnet/palmpay/core/bean/rsp/AnalysisBlankQrCodeRsp;", "analyzeBlankCode", "(Lcom/transsnet/palmpay/core/bean/req/AnalysisBlankQrCodeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/rsp/CashInOrderDetailRsp;", "getCashInOrderDetail", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/rsp/GetFundActivityConfigRsp;", "getFundActivityConfig", "Lcom/transsnet/palmpay/core/bean/req/BindBankCardReq;", "Lcom/transsnet/palmpay/core/bean/rsp/BindActionRsp;", "bindBankCard", "(Lcom/transsnet/palmpay/core/bean/req/BindBankCardReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/BindBankAccountReq;", "bindBankAccount", "(Lcom/transsnet/palmpay/core/bean/req/BindBankAccountReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/AddBankAccountReq;", "Lcom/transsnet/palmpay/core/bean/rsp/AddPayBankAccRsp;", "addBankAccount", "(Lcom/transsnet/palmpay/core/bean/req/AddBankAccountReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/AddBankAccSendOtpReq;", "Lcom/transsnet/palmpay/core/bean/rsp/AddBankAccSendOtpRsp;", "addBankAccSendOtp", "(Lcom/transsnet/palmpay/core/bean/req/AddBankAccSendOtpReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/PayMerchantOrderAddReq;", "Lcom/transsnet/palmpay/core/bean/rsp/PayMerchantOrderAddRsp;", "payMerchantOrderAdd", "(Lcom/transsnet/palmpay/core/bean/req/PayMerchantOrderAddReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/PayPalmPayBusinessOrderAddReq;", "Lcom/transsnet/palmpay/core/bean/rsp/PayPalmPayBusinessOrderAddRsp;", "(Lcom/transsnet/palmpay/core/bean/req/PayPalmPayBusinessOrderAddReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/rsp/QueryAcqOrderDetailRsp;", "queryAcqOrderDetail", "Lcom/transsnet/palmpay/core/bean/rsp/PayMoneyToPalmpayBusinessDetailRsp;", "querySendMoneyOrderByOrderId", "Lcom/transsnet/palmpay/core/bean/AnalysisPartnerInForCashOutReq;", "Lcom/transsnet/palmpay/core/bean/rsp/AnalysisPartnerInRsp;", "analysisPartnerInCode", "(Lcom/transsnet/palmpay/core/bean/AnalysisPartnerInForCashOutReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/rsp/PalmPayContactListResp;", "queryMemberContactsList", "Lcom/transsnet/palmpay/core/bean/req/AddContactReq;", "Lcom/transsnet/palmpay/core/bean/rsp/PalmPayContactQueryResp;", "addContact", "(Lcom/transsnet/palmpay/core/bean/req/AddContactReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/FundSendOtpReq;", "otpReq", "Lcom/transsnet/palmpay/core/bean/rsp/FundOtpRsp;", "fundSendOtp", "(Lcom/transsnet/palmpay/core/bean/req/FundSendOtpReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/QueryUiResourceReq;", "Lcom/transsnet/palmpay/core/bean/rsp/QueryUiResourceRsp1;", "queryUiResource", "(Lcom/transsnet/palmpay/core/bean/req/QueryUiResourceReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/UbaBankPaySendOtpReq;", "ubaBankAccPayResendOtp", "(Lcom/transsnet/palmpay/core/bean/req/UbaBankPaySendOtpReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/CommonShareReq;", "Lcom/transsnet/palmpay/core/bean/rsp/CommonStringResult;", "commonShare", "(Lcom/transsnet/palmpay/core/bean/req/CommonShareReq;)Ldf/d;", "commonShareKt", "(Lcom/transsnet/palmpay/core/bean/req/CommonShareReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/rsp/CommonShareNewRsp;", "commonShareNew", "reference", "sendPostPayOtp", "Lcom/transsnet/palmpay/core/bean/req/USSDFundResultReq;", "ussdReq", "Lcom/transsnet/palmpay/core/bean/rsp/USSDFundResp;", "getUSSDResult", "(Lcom/transsnet/palmpay/core/bean/req/USSDFundResultReq;)Ldf/d;", "getUSSDResultNew", "(Lcom/transsnet/palmpay/core/bean/req/USSDFundResultReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/rsp/ExpressInfo;", "queryCoinExpressInfo", "queryMallExpressInfo", "queryGroupBuyExpressInfo", "Lcom/transsnet/palmpay/core/bean/req/QrcodeGenerateReq;", "Lcom/transsnet/palmpay/core/bean/rsp/QrcodeGenerateResp;", "generateQrcode", "(Lcom/transsnet/palmpay/core/bean/req/QrcodeGenerateReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/QueryFamilyAccountReq;", "Lcom/transsnet/palmpay/core/bean/QueryFamilyAccountRsp;", "queryFamilyAccountList", "(Lcom/transsnet/palmpay/core/bean/req/QueryFamilyAccountReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "categoryId", "Lcom/transsnet/palmpay/core/bean/rsp/QueryGroupTagRsp;", "groupTag", "cardNo", "Lcom/transsnet/palmpay/core/bean/rsp/CardNoBankInfoRsp;", "getBankInfoByCardNo", "getBankInfoByCardNoMvvm", "Lcom/transsnet/palmpay/core/bean/req/UploadContactsReq;", "uploadContactList", "(Lcom/transsnet/palmpay/core/bean/req/UploadContactsReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoV2Req;", "uploadDeviceInfo", "(Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoV2Req;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/UploadAppListV2Req;", "Lcom/transsnet/palmpay/core/bean/rsp/UploadAppListV2Rsp;", "uploadAppList", "(Lcom/transsnet/palmpay/core/bean/req/UploadAppListV2Req;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/CommentAddReq;", "Lcom/transsnet/palmpay/core/bean/rsp/CoreCommentResp;", "addComment", "(Lcom/transsnet/palmpay/core/bean/req/CommentAddReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/CntDownSecondsCommonReq;", "countdownSecondsCommon", "(Lcom/transsnet/palmpay/core/bean/req/CntDownSecondsCommonReq;)Ldf/d;", "orderId", "homeSmDialogShown", "Lcom/transsnet/palmpay/core/bean/rsp/QueryMemberEmailRsp;", "queryMemberEmail", "Lcom/transsnet/palmpay/core/bean/rsp/BuyEarlyRefundOrderDetailRsp;", "queryBuyEarlyRefundOrderDetail", "queryBuyEarlyRefundOrderDetailMvvm", "payId", "Lcom/transsnet/palmpay/core/bean/rsp/PayFailResultAdRsp;", "payFailResultAd", "Lcom/transsnet/palmpay/core/bean/req/CancelVoucherReq;", "Lcom/transsnet/palmpay/core/bean/RequestMoneyCancelResp;", "cancelRequestMoney", "(Lcom/transsnet/palmpay/core/bean/req/CancelVoucherReq;)Ldf/d;", "lastWithdrawBankAccNo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/ParseInstalmentsQrcodeReq;", "Lcom/transsnet/palmpay/core/bean/rsp/ParseInstalmentsQrcodeRsp;", "parseInstalmentQrcode", "(Lcom/transsnet/palmpay/core/bean/req/ParseInstalmentsQrcodeReq;)Ldf/d;", "searchAccountNumber", "(Lcom/transsnet/palmpay/core/bean/req/ParseInstalmentsQrcodeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/rsp/OkCardPreCreditInfoRsp;", "getOkCardPreCreditInfo", "Lcom/transsnet/palmpay/core/bean/req/GetRecentMerchantsReq;", "Lcom/transsnet/palmpay/core/bean/rsp/GetRecentMerchantsResp;", "getRecentMerchants", "(Lcom/transsnet/palmpay/core/bean/req/GetRecentMerchantsReq;)Ldf/d;", "getRecentMerchantsMvvm", "(Lcom/transsnet/palmpay/core/bean/req/GetRecentMerchantsReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/SendBettingOTPReq;", "Lcom/transsnet/palmpay/core/bean/rsp/WithdrawBettingOtpRsp;", "sendBettingOTP", "(Lcom/transsnet/palmpay/core/bean/req/SendBettingOTPReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/rsp/CheckCouponRsp;", "checkCoupon", "checkCouponByVM", "queryLimitAmountV2ByNew", "queryLimitAmountV2Mvvm", "(Lcom/transsnet/palmpay/core/bean/req/QueryLimitAmountV2Req;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/QueryServiceStateByCategoryIdReq;", "Lcom/transsnet/palmpay/core/bean/rsp/QueryServiceStateByCategoryIdRsp;", "queryServiceStateByCategoryIdByNew", "(Lcom/transsnet/palmpay/core/bean/req/QueryServiceStateByCategoryIdReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/rsp/RegisterAccountResp;", "getRegisterAccount", "Lcom/transsnet/palmpay/core/bean/rsp/LocalNotificationConfigRsp;", "getLocalNotificationConfig", "Lcom/transsnet/palmpay/core/bean/TopUpHistoryDataResp;", "getLastHistoryOrderListByNew", "Lcom/transsnet/palmpay/core/bean/req/DeleteHistoryOrderReq;", "deleteHistoryOrderList", "(Lcom/transsnet/palmpay/core/bean/req/DeleteHistoryOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/ReportUssdRespondReq;", "reportUssdRespond", "(Lcom/transsnet/palmpay/core/bean/req/ReportUssdRespondReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/rsp/BillSavingBannerRsp;", "billpaymentHomeBanner", "Lcom/transsnet/palmpay/core/bean/rsp/GetMenuBillPaymentRsp;", "getBillPaymentMenu", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/core/bean/req/BillPaymentEditReq;", "Lkotlin/collections/ArrayList;", "editBillPayment", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefund2DetailMvvm", "Lcom/transsnet/palmpay/core/bean/rsp/InterBankCashInOrderDetailRsp;", "getInterBankCashInOrderDetailMvvm", "checkServerHealth", "Lcom/transsnet/palmpay/core/bean/bill/TransHistroyDownReq;", "checkBillDownload", "(Lcom/transsnet/palmpay/core/bean/bill/TransHistroyDownReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/MemberAddressBean;", "queryMemberAddress", "getBillDownloadCount", "Lcom/transsnet/palmpay/core/bean/rsp/TransactionFilterResp;", "getTransactionFilter", "Lcom/transsnet/palmpay/core/bean/req/QueryLatestPushReq;", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "queryLatestPushMessage", "(Lcom/transsnet/palmpay/core/bean/req/QueryLatestPushReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/ClaimCouponReq;", "claimCoupon", "(Lcom/transsnet/palmpay/core/bean/req/ClaimCouponReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/CorePointInfoBean;", "queryPointInfo", "Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleBean;", "queryHighlyRecommendDataBundle", "billerId", "Lcom/transsnet/palmpay/core/bean/FlashSaleDataBundleBeanV2;", "queryDataBundleFlashSaleList", "Lcom/transsnet/palmpay/core/bean/BillQuickAccessBean;", "queryBillQuickAccess", "Lcom/transsnet/palmpay/core/bean/BillerUSSDInfoBean;", "queryBillerUSSDInfo", "getBindBankCardTips", "Lcom/transsnet/palmpay/core/bean/rsp/GetCashBoxNewcomerResp;", "getCashBoxNewcomer", "Lcom/transsnet/palmpay/core/bean/rsp/QueryOrderDetailRsp;", "queryOrderDetail", "Lcom/transsnet/palmpay/core/bean/req/QueryRecipientReq;", "Lcom/transsnet/palmpay/core/bean/rsp/QueryRecentlyMerchantResp;", "queryRecentlyMerchantList", "(Lcom/transsnet/palmpay/core/bean/req/QueryRecipientReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/CreateBizOrderReq;", "Lcom/transsnet/palmpay/core/bean/CreateBizOrderResp;", "createBizOrder", "(Lcom/transsnet/palmpay/core/bean/CreateBizOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/ConfigReq;", "Lcom/transsnet/palmpay/core/bean/BalanceAndLimitResp;", "queryCodePlateConfig", "(Lcom/transsnet/palmpay/core/bean/req/ConfigReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/QueryMemberByCodePlateReq;", "Lcom/transsnet/palmpay/core/bean/QueryMemberByCodePlateResp;", "queryMemberByCodePlate", "(Lcom/transsnet/palmpay/core/bean/req/QueryMemberByCodePlateReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/GetSendCashDetailReq;", "Lcom/transsnet/palmpay/core/bean/RewardOrderDetail;", "getSendCashDetail", "(Lcom/transsnet/palmpay/core/bean/req/GetSendCashDetailReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSendCashDetailMvvm", "Lcom/transsnet/palmpay/core/bean/req/GetS3PreSignedUrl;", "generatePreSignedUrlForUpload", "(Lcom/transsnet/palmpay/core/bean/req/GetS3PreSignedUrl;)Ldf/d;", "generatePreSignedUrlForUploadMvvm", "(Lcom/transsnet/palmpay/core/bean/req/GetS3PreSignedUrl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/GetS3PreSignedUrlForDownload;", "generatePreSignedUrlForDownload", "(Lcom/transsnet/palmpay/core/bean/req/GetS3PreSignedUrlForDownload;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/GetCustomerServiceUrlReq;", "Lcom/transsnet/palmpay/core/bean/rsp/GetCustomerServiceUrlRsp;", "getCustomerServiceUrl", "(Lcom/transsnet/palmpay/core/bean/req/GetCustomerServiceUrlReq;)Ldf/d;", "sourceType", "Lcom/transsnet/palmpay/core/bean/rsp/CashBoxTrialCashEntryResp;", "queryCashBoxTrialCash", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/ClipboardMatchInfoReq;", "Lcom/transsnet/palmpay/core/bean/rsp/ClipboardMatchInfoResp;", "getClipboardMatchInfo", "(Lcom/transsnet/palmpay/core/bean/req/ClipboardMatchInfoReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "taskContentType", "reportBrowseFinished", "Lcom/transsnet/palmpay/core/bean/rsp/QueryCouponClaimBodyData;", "queryCouponList", "memberId", "Lcom/transsnet/palmpay/core/bean/rsp/BillerRenewalBodyBean;", "renewalItemByTransType", "noticeCashierClose", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "noticeCashierCloseRx", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/reward/OrderResultRewardsReq;", "Lcom/transsnet/palmpay/core/bean/reward/OrderResultRewardResp;", "queryOrderResultRewards", "(Lcom/transsnet/palmpay/core/bean/reward/OrderResultRewardsReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordNo", "rewardType", "claimReward", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "token", "Lcom/transsnet/palmpay/core/bean/verify/VerifyQuestionNodeBean;", "startSafetyAssessmentQA", "Lcom/transsnet/palmpay/core/bean/req/CommitAnswerReq;", "Lcom/transsnet/palmpay/core/bean/verify/VerifySumbitAnswerRsp;", "sumbitSafetyAssessmentQA", "(Lcom/transsnet/palmpay/core/bean/req/CommitAnswerReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSafetyAssessmentQA", "questionContent", "cancelSafetyAssessmentQA", "getSmsChannelVM", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/UploadContactsItemReq;", "uploadSystemContactList", "(Lcom/transsnet/palmpay/core/bean/req/UploadContactsItemReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "checkContactListResult", "extraParams", "Lcom/transsnet/palmpay/core/bean/rsp/CommonRewardRsp;", "claimCommonReward", "Lcom/transsnet/palmpay/core/bean/req/AppListCollectUpload;", "Lcom/transsnet/palmpay/core/bean/rsp/AppListCollectConfigBean;", "checkAppListCollectConfig", "(Lcom/transsnet/palmpay/core/bean/req/AppListCollectUpload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/AppListCollectUploadBean;", "uploadAppListCollect", "(Lcom/transsnet/palmpay/core/bean/req/AppListCollectUploadBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "Lcom/transsnet/palmpay/core/bean/rsp/GetMoneyConfigResp;", "getMoneyConfig", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/GenerateAuthCodeReq;", "Lcom/transsnet/palmpay/core/bean/rsp/GenerateAuthCodeResp;", "generateAuthCode", "(Lcom/transsnet/palmpay/core/bean/req/GenerateAuthCodeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/c0;", "collectTrackingEvents", "(Lokhttp3/c0;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/rsp/UssdListRsp;", "getUssdList", "ussdList", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PayApiService {
    @POST("/api/cfront/account/payBankAccSendOtp")
    @NotNull
    d<AddBankAccSendOtpRsp> addBankAccSendOtp(@Body @Nullable AddBankAccSendOtpReq req);

    @POST("/api/cfront/account/v1/addPayBankAcc")
    @NotNull
    d<AddPayBankAccRsp> addBankAccount(@Body @Nullable AddBankAccountReq req);

    @POST("/api/cfront/comments/add")
    @NotNull
    d<CommonBeanResult<CoreCommentResp>> addComment(@Body @Nullable CommentAddReq body);

    @POST("/api/cfront/member/contacts/addMemberContacts")
    @NotNull
    d<PalmPayContactQueryResp> addContact(@Body @Nullable AddContactReq body);

    @GET("/api/cfront/coupon/analysisQrCode")
    @Nullable
    Object analysisCouponQrCode(@Nullable @Query("receiptUrl") String str, @NotNull Continuation<? super AnalysisCouponQrCodeRsp> continuation);

    @POST("/api/cfront/promoter/faceToFace/analysisPartnerInCode")
    @Nullable
    Object analysisPartnerInCode(@Body @Nullable AnalysisPartnerInForCashOutReq analysisPartnerInForCashOutReq, @NotNull Continuation<? super AnalysisPartnerInRsp> continuation);

    @POST("/api/cfront/member/analyzeMicroCode")
    @Nullable
    Object analyzeBlankCode(@Body @Nullable AnalysisBlankQrCodeReq analysisBlankQrCodeReq, @NotNull Continuation<? super AnalysisBlankQrCodeRsp> continuation);

    @GET("/api/online-agent-product/annualBill/billPaymentHomeBanner")
    @Nullable
    Object billpaymentHomeBanner(@NotNull Continuation<? super BillSavingBannerRsp> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/authen/bindBankAccount")
    @NotNull
    d<BindActionRsp> bindBankAccount(@Body @Nullable BindBankAccountReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/authen/bindBankCard")
    @NotNull
    d<BindActionRsp> bindBankCard(@Body @Nullable BindBankCardReq req);

    @Headers({"Black-Code: yes", "Custom_Read_Timeout:120", "Use_Sign_V2: yes"})
    @POST("/api/cashier-center/pay/cancelPaymentRetry")
    @Nullable
    Object cancelPaymentRetry(@Body @Nullable CancelPaymentRetryReq cancelPaymentRetryReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/sendMoney/moneyCancel")
    @NotNull
    d<RequestMoneyCancelResp> cancelRequestMoney(@Body @Nullable CancelVoucherReq req);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/scene-base-service/fraud/cancelQa")
    Object cancelSafetyAssessmentQA(@Field("token") @Nullable String str, @Field("questionContent") @Nullable String str2, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/device/app/channel/check")
    @Nullable
    Object checkAppListCollectConfig(@Body @NotNull AppListCollectUpload appListCollectUpload, @NotNull Continuation<? super CommonBeanResult<AppListCollectConfigBean>> continuation);

    @POST("/api/cfront/bill/billDownload")
    @Nullable
    Object checkBillDownload(@Body @Nullable TransHistroyDownReq transHistroyDownReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/scene-billpayment-core/contract/exists/uploadList")
    @Nullable
    Object checkContactListResult(@NotNull Continuation<? super CommonBeanResult<Boolean>> continuation);

    @POST("/api/cfront/pay/couponPreviewPayInfo")
    @NotNull
    d<CommonBeanResult<CheckCouponRsp>> checkCoupon(@Body @Nullable PreviewPayInfoV2Req req);

    @POST("/api/cfront/pay/couponPreviewPayInfo")
    @NotNull
    d<CommonBeanResult<CheckCouponRsp>> checkCouponByVM(@Body @Nullable PreviewCalcPayInfoReq req);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/cfront/pay/reqCheckPay")
    @NotNull
    d<CheckPayResp> checkPay(@Body @Nullable CheckPayReq body);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/cashier/pay/reqCheckPay")
    @NotNull
    d<CheckPayResp> checkSavingPay(@Body @Nullable CheckPayReq body);

    @Headers({"No-Token: yes"})
    @GET("/api/health")
    @NotNull
    d<CommonResult> checkServerHealth();

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/startAppBasic/checkSms")
    @NotNull
    d<SmsActionRsp> checkSmsCode(@Body @Nullable SmsActionReq body);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/cashier-center/receive/reCheckPayOrder")
    @NotNull
    d<CheckPayResp> checkWithdrawalPay(@Body @Nullable CheckPayReq body);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes"})
    @POST("/api/scene-activity-product/reward/v1/claim")
    Object claimCommonReward(@Field("extraParams") @Nullable String str, @Field("memberId") @Nullable String str2, @NotNull Continuation<? super CommonBeanResult<CommonRewardRsp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/scene-activity-product/bill/pullNew/inside/claim")
    @Nullable
    Object claimCoupon(@Body @NotNull ClaimCouponReq claimCouponReq, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes"})
    @POST("/api/innovate-bff-product/reward/drawReward")
    Object claimReward(@Field("recordNo") @Nullable String str, @Field("transType") @Nullable String str2, @Field("payId") @Nullable String str3, @Field("orderNo") @Nullable String str4, @Field("rewardType") @Nullable Integer num, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/wallet-tracking-service/tracking/collect")
    @NotNull
    d<CommonResult> collectTrackingEvents(@Body @NotNull c0 body);

    @POST("/api/cfront/share/commonShare")
    @NotNull
    d<CommonStringResult> commonShare(@Body @Nullable CommonShareReq req);

    @POST("/api/cfront/share/commonShare")
    @Nullable
    Object commonShareKt(@Body @Nullable CommonShareReq commonShareReq, @NotNull Continuation<? super CommonStringResult> continuation);

    @POST("/api/scene-activity/share/commonShare")
    @NotNull
    d<CommonBeanResult<CommonShareNewRsp>> commonShareNew(@Body @Nullable CommonShareReq req);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/scene-base-service/fraud/confirmQa")
    Object confirmSafetyAssessmentQA(@Field("token") @Nullable String str, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/v2/activity/countdownSecondsCommon")
    @NotNull
    d<CommonResult> countdownSecondsCommon(@Body @Nullable CntDownSecondsCommonReq body);

    @Headers({"Black-Code: yes"})
    @POST("/api/scene-offline-product/codePlate/createBizOrder")
    @Nullable
    Object createBizOrder(@Body @Nullable CreateBizOrderReq createBizOrderReq, @NotNull Continuation<? super CommonBeanResult<CreateBizOrderResp>> continuation);

    @POST("/api/cfront/airtime/recharge/records/delete")
    @Nullable
    Object deleteHistoryOrderList(@Body @Nullable DeleteHistoryOrderReq deleteHistoryOrderReq, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/menus/saveLike")
    @Nullable
    Object editBillPayment(@Body @NotNull ArrayList<BillPaymentEditReq> arrayList, @NotNull Continuation<? super GetMenuBillPaymentRsp> continuation);

    @POST("/api/cfront/device/receiveNotifications")
    @NotNull
    d<CommonResult> enableDeviceNotification(@Body @Nullable SetDeviceNotificationReq body);

    @Headers({"Black-Code: yes", "Custom_Read_Timeout:15"})
    @POST("/api/cashier-center/payment/method/flexi/oneClickOpen")
    @Nullable
    Object flexiOneClickOpen(@Body @NotNull FlexiOneClickOpenReq flexiOneClickOpenReq, @NotNull Continuation<? super FlexiOneClickOpenRsp> continuation);

    @POST("/api/cfront/account/payBankAccSendOtp")
    @NotNull
    d<CommonBeanResult<FundOtpRsp>> fundSendOtp(@Body @Nullable FundSendOtpReq otpReq);

    @Headers({"Black-Code: yes"})
    @POST("/api/validator-service/auth/generateAuthCode")
    @Nullable
    Object generateAuthCode(@Body @NotNull GenerateAuthCodeReq generateAuthCodeReq, @NotNull Continuation<? super CommonBeanResult<GenerateAuthCodeResp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/obs/generatePresignedUrlForDownload")
    @NotNull
    d<CommonStringResult> generatePreSignedUrlForDownload(@Body @Nullable GetS3PreSignedUrlForDownload req);

    @Headers({"No-Token: yes"})
    @POST("/obs/generatePresignedUrlForUpload")
    @NotNull
    d<CommonStringResult> generatePreSignedUrlForUpload(@Body @Nullable GetS3PreSignedUrl req);

    @POST("/obs/generatePresignedUrlForUpload")
    @Nullable
    Object generatePreSignedUrlForUploadMvvm(@Body @Nullable GetS3PreSignedUrl getS3PreSignedUrl, @NotNull Continuation<? super CommonStringResult> continuation);

    @POST("/api/cfront/member/getQRcodeNew")
    @NotNull
    d<QrcodeGenerateResp> generateQrcode(@Body @Nullable QrcodeGenerateReq body);

    @GET("/api/cfront/sendMoney/generatorShortUrl")
    @NotNull
    d<ShortUrlResp> generatorShortUrl(@Nullable @Query("linkUrl") String url);

    @POST("/api/cfront/account/getBankInfoByCardNo")
    @NotNull
    d<CardNoBankInfoRsp> getBankInfoByCardNo(@Body @JsonName("bankCardNo") @Nullable String cardNo);

    @POST("/api/c-bff-product/account/getBankInfoByCardNoV2")
    @Nullable
    Object getBankInfoByCardNoMvvm(@Body @JsonName("bankCardNo") @Nullable String str, @NotNull Continuation<? super CardNoBankInfoRsp> continuation);

    @GET("/api/cfront/bill/billDownloadCount")
    @Nullable
    Object getBillDownloadCount(@NotNull Continuation<? super CommonResult> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/menus")
    @Nullable
    Object getBillPaymentMenu(@NotNull Continuation<? super GetMenuBillPaymentRsp> continuation);

    @POST("/api/c-bff-product/bill/v2/totalAmount")
    @Nullable
    Object getBillTotalCount(@Body @Nullable BillTotalCountReq billTotalCountReq, @NotNull Continuation<? super CommonBeanResult<BillTotalCountResp>> continuation);

    @POST("/api/cfront/bill/billFlow")
    @NotNull
    d<BillRsp> getBills(@Body @Nullable BillReqNew req);

    @GET("/api/transfer-product/cash/in/bindBankCardConfirm")
    @NotNull
    d<CommonBeanResult<String>> getBindBankCardTips();

    @GET("/api/postpay-virtual-bank/v1/postpay/account/isCashBoxNewcomer")
    @NotNull
    d<CommonBeanResult<GetCashBoxNewcomerResp>> getCashBoxNewcomer();

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/scene-cashin-product/cashIn/queryCashInOrderDetail")
    Object getCashInOrderDetail(@Field("orderNo") @Nullable String str, @Field("transType") @Nullable String str2, @NotNull Continuation<? super CommonBeanResult<CashInOrderDetailRsp>> continuation);

    @POST("/api/transfer-product/transfer/getClipboardMatchInfo")
    @Nullable
    Object getClipboardMatchInfo(@Body @NotNull ClipboardMatchInfoReq clipboardMatchInfoReq, @NotNull Continuation<? super CommonBeanResult<ClipboardMatchInfoResp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/c-bff-product/api/cfront/customer/getSobotChatUrl")
    @NotNull
    d<CommonBeanResult<GetCustomerServiceUrlRsp>> getCustomerServiceUrl(@Body @NotNull GetCustomerServiceUrlReq req);

    @GET("/api/transfer-product/cash/in/getFundActivityConfig")
    @NotNull
    d<CommonBeanResult<GetFundActivityConfigRsp>> getFundActivityConfig();

    @GET("/api/cfront/nibss/queryOrderInfo")
    @Nullable
    Object getInterBankCashInOrderDetailMvvm(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<InterBankCashInOrderDetailRsp>> continuation);

    @GET("/api/airtime/recharge/records/latest/v2")
    @Nullable
    Object getLastHistoryOrderListByNew(@NotNull Continuation<? super TopUpHistoryDataResp> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/dsp-job-center/eventNotice/queryEventNoticeList")
    @NotNull
    d<CommonBeanResult<LocalNotificationConfigRsp>> getLocalNotificationConfig();

    @Headers({"No-Token: yes"})
    @POST("/api/wallet-bff-product/home/MenuByScene")
    @Nullable
    Object getMenuBySceneV2(@Body @Nullable GetMenuBySceneReq getMenuBySceneReq, @NotNull Continuation<? super GetMenuBySceneRsp> continuation);

    @POST("/api/cfront/message/v2/queryMsgBySceneType")
    @NotNull
    d<GetMsgRsp> getMessagesByTypeV2(@Body @Nullable GetMsgByTypeReq body);

    @GET("/api/scene-offline-product/codePlate/getMoneyConfig")
    @Nullable
    Object getMoneyConfig(@Query("type") int i7, @NotNull Continuation<? super GetMoneyConfigResp> continuation);

    @POST("/api/cfront/account/getOkcardInfo")
    @NotNull
    d<CommonBeanResult<OkCardPreCreditInfoRsp>> getOkCardPreCreditInfo();

    @POST("/api/cfront/qr-code/orders/recentlyMerchant")
    @NotNull
    d<GetRecentMerchantsResp> getRecentMerchants(@Body @NotNull GetRecentMerchantsReq req);

    @POST("/api/scene-offline-product/codePlate/recentlyMerchantPage")
    @Nullable
    Object getRecentMerchantsMvvm(@Body @NotNull GetRecentMerchantsReq getRecentMerchantsReq, @NotNull Continuation<? super GetRecentMerchantsResp> continuation);

    @POST("/api/cfront/bill/traHisRefundDetailNew")
    @NotNull
    d<CommonBeanResult<QueryRefund2BillDetailRsp>> getRefund2Detail(@Body @JsonName("orderNo") @Nullable String orderNo);

    @POST("/api/cfront/bill/traHisRefundDetailNew")
    @Nullable
    Object getRefund2DetailMvvm(@Body @JsonName("orderNo") @Nullable String str, @NotNull Continuation<? super CommonBeanResult<QueryRefund2BillDetailRsp>> continuation);

    @GET("/api/scene-offline-product/registerResult/handlePageJump")
    @Nullable
    Object getRegisterAccount(@NotNull Continuation<? super CommonBeanResult<RegisterAccountResp>> continuation);

    @POST("/api/marketing-service/lottery/getSendCashDetail")
    @Nullable
    Object getSendCashDetail(@Body @Nullable GetSendCashDetailReq getSendCashDetailReq, @NotNull Continuation<? super CommonBeanResult<RewardOrderDetail>> continuation);

    @POST("/api/marketing-service/lottery/getSendCashDetail")
    @Nullable
    Object getSendCashDetailMvvm(@Body @Nullable GetSendCashDetailReq getSendCashDetailReq, @NotNull Continuation<? super CommonBeanResult<RewardOrderDetail>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/v1/otp/getChannel")
    @NotNull
    d<CommonListResultV2<SmsChannelRsp>> getSmsChannel(@Nullable @Query("phone") String phone, @Query("scene") int scene);

    @Headers({"No-Token: yes"})
    @GET("/api/v1/otp/getChannel")
    @Nullable
    Object getSmsChannelVM(@Nullable @Query("phone") String str, @Query("scene") int i7, @NotNull Continuation<? super CommonListResultV2<SmsChannelRsp>> continuation);

    @POST("/api/c-bff-product/bill/v2/conditionsConfig")
    @Nullable
    Object getTransactionFilter(@NotNull Continuation<? super CommonBeanResult<TransactionFilterResp>> continuation);

    @POST("/api/cfront/bill/transactionHistory")
    @NotNull
    d<TransHistoryRsp> getTransactionHistory(@Body @Nullable TransHistoryReq req);

    @POST("/api/c-bff-product/bill/v2/queryBillList")
    @Nullable
    Object getTransactionHistoryV2(@Body @Nullable TransHistoryReqV2 transHistoryReqV2, @NotNull Continuation<? super TransHistoryRspV2> continuation);

    @POST("/api/oneloop-gw-service/v1/operator/common/query/ussdPhone")
    @NotNull
    d<CommonBeanResult<R2CUssdDialNoResp>> getUSSDDialNo();

    @POST("/api/cfront/pay/getNgUssdInfo")
    @NotNull
    d<USSDFundResp> getUSSDResult(@Body @Nullable USSDFundResultReq ussdReq);

    @POST("/api/cfront/pay/getNgUssdInfo")
    @Nullable
    Object getUSSDResultNew(@Body @Nullable USSDFundResultReq uSSDFundResultReq, @NotNull Continuation<? super USSDFundResp> continuation);

    @GET("/api/cfront/basic-data/bank/ussdChannelList")
    @NotNull
    d<CommonListResultV2<UssdListRsp>> getUssdList();

    @POST("/api/cfront/quickteller/groupTag")
    @NotNull
    d<QueryGroupTagRsp> groupTag(@Body @JsonName("categoryId") @Nullable String categoryId);

    @GET("/api/cfront/sendMoney/query/updatePopUpAd")
    @NotNull
    d<CommonResult> homeSmDialogShown(@Nullable @Query("orderId") String orderId);

    @GET("/api/transfer-product/cash/out/last/bankAccNo")
    @Nullable
    Object lastWithdrawBankAccNo(@NotNull Continuation<? super CommonStringResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/cashier-center/pay/stopPayAction")
    Object noticeCashierClose(@Field("transType") @Nullable String str, @Field("memberId") @Nullable String str2, @Field("orderNo") @Nullable String str3, @NotNull Continuation<? super CommonResult> continuation);

    @NotNull
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/cashier-center/pay/stopPayAction")
    d<CommonResult> noticeCashierCloseRx(@Field("transType") @Nullable String transType, @Field("memberId") @Nullable String memberId, @Field("orderNo") @Nullable String orderNo);

    @POST("/api/cfront/qrcode/instation/indentify")
    @NotNull
    d<ParseInstalmentsQrcodeRsp> parseInstalmentQrcode(@Body @Nullable ParseInstalmentsQrcodeReq req);

    @POST("/api/cfront/offline/merchant/reqCheckPay")
    @NotNull
    d<CheckPayResp> partnerCheckPay(@Body @Nullable CheckPayReq body);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/offline/merchant/payByOrderNo")
    @NotNull
    d<PayByOrderResp> partnerPayByOrderNo(@Body @Nullable PayByOrderReq body);

    @Headers({"Black-Code: yes", "Custom_Read_Timeout:120"})
    @POST("/api/cashier/pay/payByOrderNo")
    @Nullable
    Object payByNewOrderNoByVM(@Body @NotNull PayByOrderReq payByOrderReq, @NotNull Continuation<? super PayByOrderResp> continuation);

    @Headers({"Black-Code: yes", "Custom_Read_Timeout:120", "Use_Sign_V2: yes"})
    @POST("/api/cashier/pay/payByOrderNo")
    @NotNull
    d<PayByOrderResp> payByNewOrderNoV2(@Body @Nullable PayByOrderReq body);

    @Headers({"Black-Code: yes", "Custom_Read_Timeout:120", "Use_Sign_V2: yes"})
    @POST("/api/cfront/pay/v2/payByOrderNo")
    @NotNull
    d<PayByOrderResp> payByOrderNoV2(@Body @Nullable PayByOrderReq body);

    @Headers({"Black-Code: yes", "Custom_Read_Timeout:120", "Use_Sign_V2: yes"})
    @POST("/api/cfront/pay/v2/payByOrderNo")
    @Nullable
    Object payByOrderNoV2VM(@Body @Nullable PayByOrderReq payByOrderReq, @NotNull Continuation<? super PayByOrderResp> continuation);

    @GET("/api/cfront/pay/payFailResultAd")
    @NotNull
    d<PayFailResultAdRsp> payFailResultAd(@Nullable @Query("payId") String payId);

    @POST("/api/cfront/offline/merchant/orderAdd")
    @NotNull
    d<PayMerchantOrderAddRsp> payMerchantOrderAdd(@Body @Nullable PayMerchantOrderAddReq req);

    @POST("/api/cfront/sendMoney/offlineQrcodeOrder")
    @NotNull
    d<CommonBeanResult<PayPalmPayBusinessOrderAddRsp>> payMerchantOrderAdd(@Body @Nullable PayPalmPayBusinessOrderAddReq req);

    @GET("/api/cfront/offline/merchant/queryAcqOrderDetail")
    @NotNull
    d<QueryAcqOrderDetailRsp> queryAcqOrderDetail(@Nullable @Query("orderNo") String orderNo);

    @POST("/api/cfront/basic-data/bank/list")
    @NotNull
    d<QueryBankListRsp> queryBankList(@Body @Nullable QueryBankListReq req);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/basic-data/bank/list")
    @Nullable
    Object queryBankListMvvm(@Body @Nullable QueryBankListReq queryBankListReq, @NotNull Continuation<? super QueryBankListRsp> continuation);

    @POST("/api/cfront/basic-data/accountValidate")
    @Nullable
    Object queryBankcardUserNameMvvm(@Body @Nullable QueryBankcardUserNameReq queryBankcardUserNameReq, @NotNull Continuation<? super QueryBankcardUserNameRsp> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/airtime/payBills")
    @Nullable
    Object queryBillQuickAccess(@NotNull @Query(FirebaseAnalytics.Param.LOCATION) String str, @NotNull Continuation<? super CommonBeanResult<BillQuickAccessBean>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/online-agent-product/ussd/offline/config")
    @Nullable
    Object queryBillerUSSDInfo(@NotNull @Query("transType") String str, @NotNull Continuation<? super CommonBeanResult<BillerUSSDInfoBean>> continuation);

    @GET("/api/cfront/earlyRefund/orderDetail")
    @NotNull
    d<BuyEarlyRefundOrderDetailRsp> queryBuyEarlyRefundOrderDetail(@Nullable @Query("orderNo") String orderNo);

    @GET("/api/cfront/earlyRefund/orderDetail")
    @Nullable
    Object queryBuyEarlyRefundOrderDetailMvvm(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super BuyEarlyRefundOrderDetailRsp> continuation);

    @GET("/api/transfer-product/transfer/getFinanceTiYanJinInfo")
    @Nullable
    Object queryCashBoxTrialCash(@Nullable @Query("sourceType") Integer num, @NotNull Continuation<? super CommonBeanResult<CashBoxTrialCashEntryResp>> continuation);

    @POST("/api/scene-offline-product/codePlate/queryCodePlateConfig")
    @Nullable
    Object queryCodePlateConfig(@Body @Nullable ConfigReq configReq, @NotNull Continuation<? super BalanceAndLimitResp> continuation);

    @GET("/api/cfront/businessOrder/queryLogisticsInfo")
    @NotNull
    d<CommonBeanResult<ExpressInfo>> queryCoinExpressInfo(@Nullable @Query("orderNo") String orderNo);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/scene-activity-product/bill/pullNew/tidyPullNewList")
    Object queryCouponList(@Field("transType") @Nullable String str, @NotNull Continuation<? super CommonBeanResult<QueryCouponClaimBodyData>> continuation);

    @POST("/api/cfront/coupon/statistics")
    @Nullable
    Object queryCouponStatisticsByNew(@Body @Nullable QueryCouponStatisticsReq queryCouponStatisticsReq, @NotNull Continuation<? super QueryUserCouponsRsp> continuation);

    @GET("/api/scene-data-product/item/discount/list")
    @Nullable
    Object queryDataBundleFlashSaleList(@NotNull @Query("billerId") String str, @NotNull Continuation<? super CommonBeanResult<FlashSaleDataBundleBeanV2>> continuation);

    @POST("/api/cfront/airtime/queryFamilyAccount")
    @Nullable
    Object queryFamilyAccountList(@Body @Nullable QueryFamilyAccountReq queryFamilyAccountReq, @NotNull Continuation<? super QueryFamilyAccountRsp> continuation);

    @GET("/api/cfront/groupbuy/queryLogisticsInfoByOrderId")
    @NotNull
    d<CommonBeanResult<ExpressInfo>> queryGroupBuyExpressInfo(@Nullable @Query("orderNo") String orderNo);

    @GET("/api/scene-data-product/data/highlyRecommend/items")
    @Nullable
    Object queryHighlyRecommendDataBundle(@NotNull Continuation<? super CommonBeanResult<HighlyRecommendDataBundleBean>> continuation);

    @POST("/api/push/queryTopByMemberId")
    @Nullable
    Object queryLatestPushMessage(@Body @Nullable QueryLatestPushReq queryLatestPushReq, @NotNull Continuation<? super CommonListResultV2<PushMessage>> continuation);

    @POST("/api/cfront/pay/queryLimitAmount/v2")
    @NotNull
    d<QueryLimitAmountResp> queryLimitAmountV2(@Body @Nullable QueryLimitAmountV2Req req);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/pay/queryLimitAmtForOrder")
    @Nullable
    Object queryLimitAmountV2ByNew(@Body @JsonName("transType") @Nullable String str, @NotNull Continuation<? super QueryLimitAmountResp> continuation);

    @POST("/api/cfront/pay/queryLimitAmount/v2")
    @Nullable
    Object queryLimitAmountV2Mvvm(@Body @Nullable QueryLimitAmountV2Req queryLimitAmountV2Req, @NotNull Continuation<? super QueryLimitAmountResp> continuation);

    @GET("/api/cfront/ecommerce/queryLogisticsInfo")
    @NotNull
    d<CommonBeanResult<ExpressInfo>> queryMallExpressInfo(@Nullable @Query("orderNo") String orderNo);

    @GET("/api/member-product/setting/queryMemberAddress")
    @Nullable
    Object queryMemberAddress(@NotNull Continuation<? super CommonBeanResult<MemberAddressBean>> continuation);

    @POST("/api/scene-offline-product/codePlate/queryMemberByCodePlate")
    @Nullable
    Object queryMemberByCodePlate(@Body @Nullable QueryMemberByCodePlateReq queryMemberByCodePlateReq, @NotNull Continuation<? super CommonListResultV2<QueryMemberByCodePlateResp>> continuation);

    @GET("/api/cfront/member/contacts/queryMemberContactsList")
    @NotNull
    d<PalmPayContactListResp> queryMemberContactsList();

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/member/queryMemberEmail")
    @NotNull
    d<QueryMemberEmailRsp> queryMemberEmail(@Nullable @Query("phone") String phone);

    @POST("/api/cashier/pay/queryPayRlt")
    @NotNull
    d<CheckPayResp> queryNewPayResult(@Body @Nullable CheckPayReq body);

    @POST("/api/cashier/pay/queryPayRlt")
    @Nullable
    Object queryNewPayResultMv(@Body @Nullable CheckPayReq checkPayReq, @NotNull Continuation<? super CheckPayResp> continuation);

    @GET("/api/scene-offline-product/codePlate/queryOrderDetail")
    @Nullable
    Object queryOrderDetail(@Nullable @Query("orderId") String str, @NotNull Continuation<? super CommonBeanResult<QueryOrderDetailRsp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/innovate-bff-product/reward/getRewardList")
    @Nullable
    Object queryOrderResultRewards(@Body @Nullable OrderResultRewardsReq orderResultRewardsReq, @NotNull Continuation<? super CommonBeanResult<OrderResultRewardResp>> continuation);

    @POST("/api/cfront/pay/queryPayRlt")
    @NotNull
    d<CheckPayResp> queryPayResult(@Body @Nullable CheckPayReq body);

    @POST("/api/cfront/pay/queryPayRlt")
    @Nullable
    Object queryPayResultVM(@Body @Nullable CheckPayReq checkPayReq, @NotNull Continuation<? super CheckPayResp> continuation);

    @Headers({"Black-Code: yes", "Custom_Read_Timeout:120", "Use_Sign_V2: yes"})
    @POST("/api/cashier-center/payment/method/queryPaymentRetryMethods")
    @Nullable
    Object queryPaymentRetryMethods(@Body @Nullable QueryPaymentRetryMethodsReq queryPaymentRetryMethodsReq, @NotNull Continuation<? super CommonListResultV2<CashierPaymentMethodBean>> continuation);

    @GET("/api/cfront/account/getPayDetainment")
    @NotNull
    d<QueryPaymentRewardRsp> queryPaymentReward(@Query("accountType") int accountType, @NotNull @Query("transType") String transType);

    @GET("/api/online-agent-product/cashback/homepage/tips")
    @Nullable
    Object queryPointInfo(@NotNull @Query("transType") String str, @NotNull Continuation<? super CommonBeanResult<CorePointInfoBean>> continuation);

    @Headers({"Use_Sign_V2: yes"})
    @POST("/api/cashier-center/payment/method/previewPayInfoV4")
    @NotNull
    d<ManualCalcOfPaymentMethodResp> queryPreviewPayInfoByV4(@Body @Nullable PreviewCalcPayInfoReq req);

    @Headers({"Use_Sign_V2: yes"})
    @POST("/api/cashier-center/payment/method/previewPayInfoV5")
    @Nullable
    Object queryPreviewPayInfoByVM(@Body @Nullable PreviewCalcPayInfoReq previewCalcPayInfoReq, @NotNull Continuation<? super CommonBeanResult<ManualCalcOfPaymentMethodBean>> continuation);

    @Headers({"Use_Sign_V2: yes"})
    @POST("/api/cfront/pay/previewPayInfoV3")
    @NotNull
    d<PreviewPayInfoResp> queryPreviewPayInfoV2(@Body @Nullable PreviewPayInfoV2Req req);

    @Headers({"Use_Sign_V2: yes"})
    @POST("/api/cfront/pay/previewPayInfoV3")
    @Nullable
    Object queryPreviewPayInfoV2New(@Body @Nullable PreviewPayInfoV2Req previewPayInfoV2Req, @NotNull Continuation<? super PreviewPayInfoResp> continuation);

    @POST("/api/scene-offline-product/codePlate/recentlyMerchant")
    @Nullable
    Object queryRecentlyMerchantList(@Body @NotNull QueryRecipientReq queryRecipientReq, @NotNull Continuation<? super QueryRecentlyMerchantResp> continuation);

    @GET("/api/cfront/sendMoney/getSendMoneyOrderByOrderId")
    @NotNull
    d<CommonBeanResult<PayMoneyToPalmpayBusinessDetailRsp>> querySendMoneyOrderByOrderId(@Nullable @Query("orderId") String orderNo);

    @POST("/api/cfront/airtime/v2/query/auto-onoff-sale-info")
    @Nullable
    Object queryServiceStateByCategoryIdByNew(@Body @NotNull QueryServiceStateByCategoryIdReq queryServiceStateByCategoryIdReq, @NotNull Continuation<? super QueryServiceStateByCategoryIdRsp> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/basic-data/queryResourceParam")
    @Nullable
    Object queryUiResource(@Body @Nullable QueryUiResourceReq queryUiResourceReq, @NotNull Continuation<? super QueryUiResourceRsp1> continuation);

    @POST("/api/cfront/message/queryMsgUnRead")
    @Nullable
    Object queryUnReadMessageCount(@Body @Nullable QueryUnReadMsgCntReq queryUnReadMsgCntReq, @NotNull Continuation<? super CommonBeanResult<UnReadMsgCntRsp>> continuation);

    @POST("/api/cashier-center/coupon/userAllCoupon")
    @NotNull
    d<QueryUserCouponsRsp> queryUserCouponListByCondition(@Body @Nullable QueryCouponByConditionReq req);

    @POST("/api/cashier-center/coupon/userAllCouponV2")
    @Nullable
    Object queryUserCouponListByConditionByVM(@Body @NotNull CashierQueryCouponReq cashierQueryCouponReq, @NotNull Continuation<? super CommonBeanResult<CashierQueryUserCouponsRsp>> continuation);

    @GET("/api/airtime/renewal/guidance/note")
    @Nullable
    Object renewalItemByTransType(@Nullable @Query("memberId") String str, @Nullable @Query("transType") String str2, @NotNull Continuation<? super CommonBeanResult<BillerRenewalBodyBean>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/market-game2-product/completeAnniversaryTask")
    Object reportBrowseFinished(@Field("taskContentType") @Nullable String str, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/oneloop-gw-service/v1/operator/transaction/r2c/order/analysis")
    @NotNull
    d<CommonResult> reportUssdRespond(@Body @NotNull ReportUssdRespondReq req);

    @Headers({"No-Token: yes", "Black-Code: yes"})
    @POST("/api/cfront/device/writeUnLoginDeviceInfo")
    @NotNull
    d<CommonResult> saveDeviceInfo(@Body @Nullable UpdatePushClientIdReq req);

    @POST("/api/cfront/qrcode/instation/indentify")
    @Nullable
    Object searchAccountNumber(@Body @Nullable ParseInstalmentsQrcodeReq parseInstalmentsQrcodeReq, @NotNull Continuation<? super ParseInstalmentsQrcodeRsp> continuation);

    @POST("/api/cfront/quickteller/betting/withdraw/otp/send")
    @NotNull
    d<CommonBeanResult<WithdrawBettingOtpRsp>> sendBettingOTP(@Body @Nullable SendBettingOTPReq req);

    @POST("/api/cfront/risk/riskReSendSMS")
    @NotNull
    d<CommonResult> sendPayVerifySms(@Body @Nullable RiskControlOtcReq req);

    @POST("/api/v1/postpay/sendCreditCardOtp")
    @NotNull
    d<CommonResult> sendPostPayOtp(@Body @JsonName("reference") @Nullable String reference);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/startAppBasic/sendSms")
    @NotNull
    d<CommonResult> sendSms(@Body @Nullable SmsActionReq body);

    @POST("/api/cfront/loan/setDefaultAcc")
    @NotNull
    d<CommonResult> setDefaultRepaymentCard(@Body @JsonName("accountId") @Nullable String linkAccountId);

    @POST("/api/cfront/share/shareOrder")
    @NotNull
    d<ShareOrderRsp> shareOrder(@Body @Nullable ShareOrderReq req);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/scene-base-service/fraud/startQa")
    Object startSafetyAssessmentQA(@Field("token") @Nullable String str, @NotNull Continuation<? super CommonBeanResult<VerifyQuestionNodeBean>> continuation);

    @Headers({"Black-Code: yes", "Custom_Read_Timeout:120", "Use_Sign_V2: yes"})
    @POST("/api/cashier-center/pay/submitPaymentRetry")
    @Nullable
    Object submitPaymentRetry(@Body @Nullable SubmitPaymentRetryReq submitPaymentRetryReq, @NotNull Continuation<? super PayByOrderResp> continuation);

    @POST("/api/scene-base-service/fraud/submitQa")
    @Nullable
    Object sumbitSafetyAssessmentQA(@Body @Nullable CommitAnswerReq commitAnswerReq, @NotNull Continuation<? super CommonBeanResult<VerifySumbitAnswerRsp>> continuation);

    @POST("/api/cfront/account/bankAccPayResendOtp")
    @NotNull
    d<CommonResult> ubaBankAccPayResendOtp(@Body @Nullable UbaBankPaySendOtpReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/device/changeDeviceClientId")
    @NotNull
    d<CommonResult> updatePushClientId(@Body @Nullable UpdatePushClientIdReq req);

    @POST("/api/cfront/device/uploadAppChannelInfo")
    @NotNull
    d<UploadAppListV2Rsp> uploadAppList(@Body @Nullable UploadAppListV2Req body);

    @Headers({"No-Token: yes"})
    @POST("/api/device/app/channel/info")
    @Nullable
    Object uploadAppListCollect(@Body @Nullable AppListCollectUploadBean appListCollectUploadBean, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/loan/palmcredit/uploadContactList")
    @NotNull
    d<CommonResult> uploadContactList(@Body @Nullable UploadContactsReq body);

    @POST("/api/cfront/device/uploadDeviceInfo")
    @NotNull
    d<CommonResult> uploadDeviceInfo(@Body @Nullable UploadDeviceInfoV2Req body);

    @POST("/api/scene-billpayment-core/contract/uploadList")
    @Nullable
    Object uploadSystemContactList(@Body @Nullable UploadContactsItemReq uploadContactsItemReq, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/risk/riskRecheck")
    @NotNull
    d<VerifyRiskControlSmsRsp> verifyRiskControlSms(@Body @Nullable VerifyRiskControlSmsReq req);
}
