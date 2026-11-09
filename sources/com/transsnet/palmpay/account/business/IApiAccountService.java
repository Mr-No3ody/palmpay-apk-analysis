package com.transsnet.palmpay.account.business;

import com.appsflyer.AdRevenueScheme;
import com.transsnet.palmpay.account.bean.AccountHistoryListRsp;
import com.transsnet.palmpay.account.bean.ApplyForTier3Req;
import com.transsnet.palmpay.account.bean.ChangeTempPinReq;
import com.transsnet.palmpay.account.bean.ChangeTempPinRsp;
import com.transsnet.palmpay.account.bean.CheckInviteCodeReq;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.MyBankListRsp;
import com.transsnet.palmpay.account.bean.RealNameAuthInfoRsp;
import com.transsnet.palmpay.account.bean.RegularRuleRsp;
import com.transsnet.palmpay.account.bean.ResetPinVerificationReq;
import com.transsnet.palmpay.account.bean.ResetPinVerifyListRsp;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.SendSmsRsp;
import com.transsnet.palmpay.account.bean.SignUpReq;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp;
import com.transsnet.palmpay.account.bean.UserValidIdInfoRsp;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req;
import com.transsnet.palmpay.account.bean.req.ApplyT3QuotaReq;
import com.transsnet.palmpay.account.bean.req.BindGuardianReq;
import com.transsnet.palmpay.account.bean.req.ChangePhoneNoTokenReq;
import com.transsnet.palmpay.account.bean.req.ChangeUserInfoReq;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.bean.req.CheckPinTouchWithOrderReq;
import com.transsnet.palmpay.account.bean.req.CheckSecurityVerifyMethodReq;
import com.transsnet.palmpay.account.bean.req.DeviceActionReq;
import com.transsnet.palmpay.account.bean.req.ModifyMemberInfoReq;
import com.transsnet.palmpay.account.bean.req.NameCheckReq;
import com.transsnet.palmpay.account.bean.req.ResetPasswordReq;
import com.transsnet.palmpay.account.bean.req.ResetPinNoTokenReq;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.bean.req.SignUpSuccessCouponReq;
import com.transsnet.palmpay.account.bean.req.SubmitGuardianReq;
import com.transsnet.palmpay.account.bean.req.UserPhotoReq;
import com.transsnet.palmpay.account.bean.req.VerifyAccountHistoryReq;
import com.transsnet.palmpay.account.bean.req.VerifyRealNameReq;
import com.transsnet.palmpay.account.bean.rsp.AddUserExtraActionRsp;
import com.transsnet.palmpay.account.bean.rsp.BvnIdentityInfoRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckIdentifyRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckPasswordRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckPinRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckSecurityVerifyMethodRsp;
import com.transsnet.palmpay.account.bean.rsp.CountryRegionList;
import com.transsnet.palmpay.account.bean.rsp.DeviceActionRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.bean.rsp.GuardianConfig;
import com.transsnet.palmpay.account.bean.rsp.GuardianRelationListBean;
import com.transsnet.palmpay.account.bean.rsp.IdIdentityListRsp;
import com.transsnet.palmpay.account.bean.rsp.IndustryList;
import com.transsnet.palmpay.account.bean.rsp.InterestRateConfigResp;
import com.transsnet.palmpay.account.bean.rsp.LatestBillerOrderDetailRsp;
import com.transsnet.palmpay.account.bean.rsp.NameCheckRsp;
import com.transsnet.palmpay.account.bean.rsp.NotificationSettings;
import com.transsnet.palmpay.account.bean.rsp.PreCheckApplyTier3Rsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.bean.rsp.PreSignUpRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryAddressFromBillRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryBvnRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryDeviceRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryGuardianInfoRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryT3QuotaRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryTeenStatusRsp;
import com.transsnet.palmpay.account.bean.rsp.RegisterCouponResp;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethodRsp;
import com.transsnet.palmpay.account.bean.rsp.SettingSwitchRsp;
import com.transsnet.palmpay.account.bean.rsp.SubmitGuardianRsp;
import com.transsnet.palmpay.account.bean.rsp.TrialCalculation;
import com.transsnet.palmpay.account.bean.rsp.UploadAppsFlyerRsp;
import com.transsnet.palmpay.account.bean.rsp.UserRawIdNo;
import com.transsnet.palmpay.account.bean.rsp.VerifyAccountHistoryRsp;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonBooleanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.network.annotation.JsonName;
import df.d;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000È\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\t\u0010\u0007J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\n\u0010\u0007J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0014\u0010\u0013J8\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\r2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001e\u001a\u00020\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u001dH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u00020\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u001dH§@¢\u0006\u0004\b \u0010\u001fJ\u001c\u0010#\u001a\u00020\"2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010!H§@¢\u0006\u0004\b#\u0010$J\u001c\u0010&\u001a\u00020%2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010!H§@¢\u0006\u0004\b&\u0010$J\u001c\u0010(\u001a\u00020'2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010!H§@¢\u0006\u0004\b(\u0010$J\"\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\r2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010)H§@¢\u0006\u0004\b+\u0010,J\"\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\r2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010-H§@¢\u0006\u0004\b/\u00100J\u001c\u00102\u001a\u00020\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u000101H§@¢\u0006\u0004\b2\u00103J\"\u00105\u001a\b\u0012\u0004\u0012\u00020.0\r2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u000104H§@¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00042\b\b\u0001\u00107\u001a\u00020\u0018H'¢\u0006\u0004\b9\u0010:J\u001a\u0010;\u001a\u0002082\b\b\u0001\u00107\u001a\u00020\u0018H§@¢\u0006\u0004\b;\u0010<J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\rH§@¢\u0006\u0004\b>\u0010?J'\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\r0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010@H'¢\u0006\u0004\bB\u0010CJ!\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\bE\u0010FJ'\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\r0\u00042\n\b\u0001\u0010G\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\bI\u0010FJ!\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010JH'¢\u0006\u0004\bL\u0010MJ!\u0010N\u001a\b\u0012\u0004\u0012\u00020K0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010JH'¢\u0006\u0004\bN\u0010MJ'\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\r0\u00042\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\bQ\u0010FJ3\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\r0\u00042\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010R\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\bS\u0010TJ1\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0V0\u00042\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010U\u001a\u00020\u0018H'¢\u0006\u0004\bX\u0010YJ'\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\r0\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\b[\u0010FJ;\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0\r0\u00042\b\b\u0001\u0010]\u001a\u00020\\2\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010^\u001a\u00020\u0018H'¢\u0006\u0004\b`\u0010aJ.\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\r2\n\b\u0001\u0010R\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0004\bc\u0010dJ \u0010g\u001a\b\u0012\u0004\u0012\u00020f0\r2\b\b\u0001\u0010\u0003\u001a\u00020eH§@¢\u0006\u0004\bg\u0010hJ\u0016\u0010j\u001a\b\u0012\u0004\u0012\u00020i0\rH§@¢\u0006\u0004\bj\u0010?J!\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010kH'¢\u0006\u0004\bl\u0010mJ'\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0\r0\u00042\n\b\u0001\u0010n\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\bp\u0010FJ\"\u0010q\u001a\b\u0012\u0004\u0012\u00020o0\r2\n\b\u0001\u0010n\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0004\bq\u0010rJ,\u0010v\u001a\b\u0012\u0004\u0012\u00020u0\r2\n\b\u0001\u0010s\u001a\u0004\u0018\u00010\u00152\b\b\u0003\u0010t\u001a\u00020\\H§@¢\u0006\u0004\bv\u0010wJ.\u0010x\u001a\b\u0012\u0004\u0012\u00020u0\r2\n\b\u0001\u0010s\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0004\bx\u0010dJ'\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0\r0\u00042\n\b\u0001\u0010n\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\by\u0010FJ.\u0010z\u001a\b\u0012\u0004\u0012\u00020o0\r2\n\b\u0001\u0010n\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0004\bz\u0010dJ\u001c\u0010|\u001a\u00020\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010{H§@¢\u0006\u0004\b|\u0010}J\u001c\u0010~\u001a\u00020\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010{H§@¢\u0006\u0004\b~\u0010}J$\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020K0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u007fH'¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001f\u0010\u0082\u0001\u001a\u00020K2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u007fH§@¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001e\u0010\u0084\u0001\u001a\u00020\u00052\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0005\b\u0084\u0001\u0010rJ+\u0010\u0087\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0086\u00010V0\u00042\u000b\b\u0001\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0005\b\u0087\u0001\u0010FJ&\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010V2\u000b\b\u0001\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0005\b\u0088\u0001\u0010rJ+\u0010\u008b\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010V0\u00042\u000b\b\u0001\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0005\b\u008b\u0001\u0010FJ%\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u008c\u0001H'¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J%\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u008c\u0001H'¢\u0006\u0006\b\u008f\u0001\u0010\u008e\u0001J$\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000b\b\u0001\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0005\b\u0091\u0001\u0010FJ%\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0092\u0001H'¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J%\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0095\u0001H'¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J'\u0010\u009a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010\r2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0098\u0001H§@¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J'\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\r2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u009c\u0001H§@¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001JM\u0010¤\u0001\u001a\t\u0012\u0005\u0012\u00030£\u00010\r2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000b\b\u0003\u0010 \u0001\u001a\u0004\u0018\u00010\u00152\u000b\b\u0003\u0010¡\u0001\u001a\u0004\u0018\u00010\u00182\u000b\b\u0003\u0010¢\u0001\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0006\b¤\u0001\u0010¥\u0001J'\u0010¨\u0001\u001a\t\u0012\u0005\u0012\u00030§\u00010\r2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010¦\u0001H§@¢\u0006\u0006\b¨\u0001\u0010©\u0001J+\u0010¬\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030«\u00010V0\u00042\u000b\b\u0001\u0010ª\u0001\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0005\b¬\u0001\u0010FJ&\u0010\u00ad\u0001\u001a\t\u0012\u0005\u0012\u00030«\u00010V2\u000b\b\u0001\u0010ª\u0001\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0005\b\u00ad\u0001\u0010rJ+\u0010°\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¯\u00010\r0\u00042\u000b\b\u0001\u0010®\u0001\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0005\b°\u0001\u0010FJ4\u0010´\u0001\u001a\t\u0012\u0005\u0012\u00030³\u00010\r2\u000b\b\u0001\u0010±\u0001\u001a\u0004\u0018\u00010\u00152\u000b\b\u0003\u0010²\u0001\u001a\u0004\u0018\u00010\\H§@¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0019\u0010·\u0001\u001a\t\u0012\u0005\u0012\u00030¶\u00010\rH§@¢\u0006\u0005\b·\u0001\u0010?J\u0019\u0010¹\u0001\u001a\t\u0012\u0005\u0012\u00030¸\u00010\rH§@¢\u0006\u0005\b¹\u0001\u0010?J \u0010º\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010¸\u0001H§@¢\u0006\u0006\bº\u0001\u0010»\u0001J\u0012\u0010¼\u0001\u001a\u00020KH§@¢\u0006\u0005\b¼\u0001\u0010?J\u001e\u0010¿\u0001\u001a\u00030¾\u00012\t\b\u0001\u0010½\u0001\u001a\u00020\u0018H§@¢\u0006\u0005\b¿\u0001\u0010<J\u001e\u0010Á\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u0003\u001a\u00030À\u0001H§@¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u0019\u0010Ä\u0001\u001a\t\u0012\u0005\u0012\u00030Ã\u00010\rH§@¢\u0006\u0005\bÄ\u0001\u0010?J#\u0010Æ\u0001\u001a\t\u0012\u0005\u0012\u00030Å\u00010V2\b\b\u0001\u0010U\u001a\u00020\u0018H§@¢\u0006\u0005\bÆ\u0001\u0010<J&\u0010É\u0001\u001a\t\u0012\u0005\u0012\u00030È\u00010\r2\u000b\b\u0001\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0005\bÉ\u0001\u0010rJ&\u0010Ì\u0001\u001a\t\u0012\u0005\u0012\u00030Ë\u00010\r2\u000b\b\u0001\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0005\bÌ\u0001\u0010rJ'\u0010Î\u0001\u001a\t\u0012\u0005\u0012\u00030È\u00010\r2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Í\u0001H§@¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J'\u0010Ò\u0001\u001a\t\u0012\u0005\u0012\u00030Ñ\u00010\r2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Ð\u0001H§@¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J'\u0010Ô\u0001\u001a\t\u0012\u0005\u0012\u00030Ñ\u00010\r2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Ð\u0001H§@¢\u0006\u0006\bÔ\u0001\u0010Ó\u0001J'\u0010×\u0001\u001a\t\u0012\u0005\u0012\u00030Ö\u00010\r2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Õ\u0001H§@¢\u0006\u0006\b×\u0001\u0010Ø\u0001J3\u0010Ü\u0001\u001a\t\u0012\u0005\u0012\u00030Û\u00010\r2\u000b\b\u0001\u0010Ù\u0001\u001a\u0004\u0018\u00010\u00152\u000b\b\u0001\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0005\bÜ\u0001\u0010dJA\u0010á\u0001\u001a\t\u0012\u0005\u0012\u00030à\u00010\r2\u000b\b\u0001\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00152\u000b\b\u0001\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00152\u000b\b\u0001\u0010ß\u0001\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0006\bá\u0001\u0010â\u0001J$\u0010ä\u0001\u001a\t\u0012\u0005\u0012\u00030à\u00010\r2\t\b\u0001\u0010ã\u0001\u001a\u00020\u0015H§@¢\u0006\u0005\bä\u0001\u0010rJ)\u0010å\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030à\u00010\r0\u00042\t\b\u0001\u0010ã\u0001\u001a\u00020\u0015H'¢\u0006\u0005\bå\u0001\u0010FJ'\u0010è\u0001\u001a\t\u0012\u0005\u0012\u00030ç\u00010\r2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010æ\u0001H§@¢\u0006\u0006\bè\u0001\u0010é\u0001J'\u0010ê\u0001\u001a\t\u0012\u0005\u0012\u00030ç\u00010\r2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010æ\u0001H§@¢\u0006\u0006\bê\u0001\u0010é\u0001J \u0010ì\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010ë\u0001H§@¢\u0006\u0006\bì\u0001\u0010í\u0001J\u0019\u0010ï\u0001\u001a\t\u0012\u0005\u0012\u00030î\u00010\rH§@¢\u0006\u0005\bï\u0001\u0010?J3\u0010ò\u0001\u001a\t\u0012\u0005\u0012\u00030ç\u00010\r2\u000b\b\u0001\u0010ð\u0001\u001a\u0004\u0018\u00010\u00152\u000b\b\u0001\u0010ñ\u0001\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0005\bò\u0001\u0010dJ\u0019\u0010ô\u0001\u001a\t\u0012\u0005\u0012\u00030ó\u00010VH§@¢\u0006\u0005\bô\u0001\u0010?J&\u0010ö\u0001\u001a\t\u0012\u0005\u0012\u00030õ\u00010\r2\u000b\b\u0001\u0010ð\u0001\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0005\bö\u0001\u0010rJ&\u0010ø\u0001\u001a\t\u0012\u0005\u0012\u00030÷\u00010\r2\u000b\b\u0001\u0010ð\u0001\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0005\bø\u0001\u0010rJ\u0019\u0010ú\u0001\u001a\t\u0012\u0005\u0012\u00030ù\u00010\rH§@¢\u0006\u0005\bú\u0001\u0010?J(\u0010þ\u0001\u001a\t\u0012\u0005\u0012\u00030ý\u00010V2\f\b\u0001\u0010ü\u0001\u001a\u0005\u0018\u00010û\u0001H§@¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001¨\u0006\u0080\u0002"}, d2 = {"Lcom/transsnet/palmpay/account/business/IApiAccountService;", "", "Lcom/transsnet/palmpay/account/bean/req/DeviceActionReq;", "req", "Ldf/d;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "deleteDevice", "(Lcom/transsnet/palmpay/account/bean/req/DeviceActionReq;)Ldf/d;", "Lcom/transsnet/palmpay/account/bean/rsp/DeviceActionRsp;", "deActivateDevice", "activateDevice", "Lcom/transsnet/palmpay/account/bean/ChangeTempPinReq;", "body", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/account/bean/ChangeTempPinRsp;", "changeTempPinOrPsw", "(Lcom/transsnet/palmpay/account/bean/ChangeTempPinReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/req/ResetPasswordReq;", "resetPasswordNoToken", "(Lcom/transsnet/palmpay/account/bean/req/ResetPasswordReq;)Ldf/d;", SecurityVerifyMethodReq.LOGIN_RESET_PASSWORD, "", "phone", "faceToken", "", "sceneType", "Lcom/transsnet/palmpay/account/bean/rsp/BvnIdentityInfoRsp;", "queryBvnIdentityInfo", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/req/ResetPinNoTokenReq;", "resetPinNoToken", "(Lcom/transsnet/palmpay/account/bean/req/ResetPinNoTokenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPinV2", "Lcom/transsnet/palmpay/core/bean/req/SmsActionReq;", "Lcom/transsnet/palmpay/account/bean/SendSmsRsp;", "sendSmsV2", "(Lcom/transsnet/palmpay/core/bean/req/SmsActionReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/SendSmsNewV2Rsp;", "sendSmsNewV2", "Lcom/transsnet/palmpay/account/bean/SmsActionRsp;", "checkSmsCodeV2", "Lcom/transsnet/palmpay/account/bean/SignUpReq;", "Lcom/transsnet/palmpay/account/bean/rsp/PreSignUpRsp;", "preSignUp", "(Lcom/transsnet/palmpay/account/bean/SignUpReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/LogInReq;", "Lcom/transsnet/palmpay/account/bean/SignUpRsp;", "logIn", "(Lcom/transsnet/palmpay/account/bean/LogInReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/CheckInviteCodeReq;", "checkInviteCode", "(Lcom/transsnet/palmpay/account/bean/CheckInviteCodeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/req/ApplyBalanceV2Req;", "applyForBalanceV2", "(Lcom/transsnet/palmpay/account/bean/req/ApplyBalanceV2Req;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ruleType", "Lcom/transsnet/palmpay/account/bean/RegularRuleRsp;", "getRegularRule", "(I)Ldf/d;", "getRegularRuleMvvm", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/RealNameAuthInfoRsp;", "queryRealNameAuthInfoMvvm", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/ApplyForTier3Req;", "Lcom/transsnet/palmpay/account/bean/Tier3ApplyStatusRsp;", "applyForTier3", "(Lcom/transsnet/palmpay/account/bean/ApplyForTier3Req;)Ldf/d;", "idImg", "verifyNinIdImg", "(Ljava/lang/String;)Ldf/d;", "smsToken", "Lcom/transsnet/palmpay/account/bean/ResetPinVerifyTypeRsp;", "getResetPinVerifyType", "Lcom/transsnet/palmpay/account/bean/ResetPinVerificationReq;", "Lcom/transsnet/palmpay/core/bean/rsp/CommonStringResult;", "resetPinVerify", "(Lcom/transsnet/palmpay/account/bean/ResetPinVerificationReq;)Ldf/d;", "resetPinVerifyV2", "mobileNo", "Lcom/transsnet/palmpay/account/bean/ResetPinVerifyListRsp;", "getResetPinVerifyList", "flowId", "getResetPinVerifyListV2", "(Ljava/lang/String;Ljava/lang/String;)Ldf/d;", "type", "Lcom/transsnet/palmpay/core/bean/CommonListResultV2;", "Lcom/transsnet/palmpay/account/bean/MyBankListRsp;", "queryMyBankList", "(Ljava/lang/String;I)Ldf/d;", "Lcom/transsnet/palmpay/account/bean/UserValidIdInfoRsp;", "queryUserValidIdInfo", "", "canReceiveOtp", "scene", "Lcom/transsnet/palmpay/account/bean/rsp/GetSecurityFlowRsp;", "getSecurityFlow", "(ZLjava/lang/String;I)Ldf/d;", "Lcom/transsnet/palmpay/account/bean/AccountHistoryListRsp;", "queryAccountDeviceHistory", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/req/VerifyAccountHistoryReq;", "Lcom/transsnet/palmpay/account/bean/rsp/VerifyAccountHistoryRsp;", "verifyAccountDeviceHistory", "(Lcom/transsnet/palmpay/account/bean/req/VerifyAccountHistoryReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/rsp/PreCheckApplyTier3Rsp;", "preCheckApplyTier3", "Lcom/transsnet/palmpay/account/bean/req/UserPhotoReq;", "setUserPhotoByType", "(Lcom/transsnet/palmpay/account/bean/req/UserPhotoReq;)Ldf/d;", "pin", "Lcom/transsnet/palmpay/account/bean/rsp/CheckPinRsp;", "checkPin", "checkPinMvvm", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginPassword", "enablePassword", "Lcom/transsnet/palmpay/account/bean/rsp/CheckPasswordRsp;", "checkLoginPassword", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkLoginPasswordNoToken", "checkTransferPin", "checkPinNoToken", "Lcom/transsnet/palmpay/account/bean/req/ChangePhoneNoTokenReq;", "changePhone", "(Lcom/transsnet/palmpay/account/bean/req/ChangePhoneNoTokenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePhoneNoToken", "Lcom/transsnet/palmpay/account/bean/req/CheckPinTouchWithOrderReq;", "checkPinTouchWithOrder", "(Lcom/transsnet/palmpay/account/bean/req/CheckPinTouchWithOrderReq;)Ldf/d;", "checkPinTouchWithOrderMvvm", "(Lcom/transsnet/palmpay/account/bean/req/CheckPinTouchWithOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPhoneIsReg", "imei", "Lcom/transsnet/palmpay/account/bean/rsp/QueryDeviceRsp;", "queryDevice", "queryDeviceMvvm", "authLevel", "Lcom/transsnet/palmpay/account/bean/rsp/IdIdentityListRsp;", "getIdIdentityList", "Lcom/transsnet/palmpay/account/bean/req/ChangeUserInfoReq;", "changeUserName", "(Lcom/transsnet/palmpay/account/bean/req/ChangeUserInfoReq;)Ldf/d;", "modifyUserName", "middleName", "modifyMiddleName", "Lcom/transsnet/palmpay/account/bean/req/ModifyMemberInfoReq;", "verifyMobileNumberRealName", "(Lcom/transsnet/palmpay/account/bean/req/ModifyMemberInfoReq;)Ldf/d;", "Lcom/transsnet/palmpay/account/bean/req/VerifyRealNameReq;", "verifyRealName", "(Lcom/transsnet/palmpay/account/bean/req/VerifyRealNameReq;)Ldf/d;", "Lcom/transsnet/palmpay/account/bean/req/SignUpSuccessCouponReq;", "Lcom/transsnet/palmpay/account/bean/rsp/RegisterCouponResp;", "queryRegisterCouponV2", "(Lcom/transsnet/palmpay/account/bean/req/SignUpSuccessCouponReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/req/NameCheckReq;", "Lcom/transsnet/palmpay/account/bean/rsp/NameCheckRsp;", "checkInputNameMvvm", "(Lcom/transsnet/palmpay/account/bean/req/NameCheckReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginName", "otpScene", "mtnCode", "Lcom/transsnet/palmpay/account/bean/rsp/PreCheckPhoneRsp;", "preCheckPhoneMvvm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/req/CheckIdentifyReq;", "Lcom/transsnet/palmpay/account/bean/rsp/CheckIdentifyRsp;", "checkIdentify", "(Lcom/transsnet/palmpay/account/bean/req/CheckIdentifyReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "Lcom/transsnet/palmpay/account/bean/rsp/CountryRegionList;", "getCountryRegionList", "getCountryRegionListMvvm", "billNo", "Lcom/transsnet/palmpay/account/bean/rsp/LatestBillerOrderDetailRsp;", "getLatestBillerOrderDetail", "openUrl", "queryMemberAddress", "Lcom/transsnet/palmpay/account/bean/rsp/QueryAddressFromBillRsp;", "queryAddressFromBill", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/rsp/SettingSwitchRsp;", "querySettingSwitch", "Lcom/transsnet/palmpay/account/bean/rsp/NotificationSettings;", "queryNotificationSetting", "updateNotificationSetting", "(Lcom/transsnet/palmpay/account/bean/rsp/NotificationSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateAccountNumber", "accountType", "Lcom/transsnet/palmpay/core/bean/CommonBooleanResult;", "setShowAccountNumber", "Lcom/transsnet/palmpay/account/bean/req/ApplyT3QuotaReq;", "applyTier3TransactionLimit", "(Lcom/transsnet/palmpay/account/bean/req/ApplyT3QuotaReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/rsp/QueryT3QuotaRsp;", "queryTier3TransactionLimit", "Lcom/transsnet/palmpay/account/bean/rsp/IndustryList;", "queryIndustryBasicData", "showDialog", "Lcom/transsnet/palmpay/account/bean/rsp/AddUserExtraActionRsp;", "queryAddUserExtraAction", "verifyToken", "Lcom/transsnet/palmpay/account/bean/rsp/UserRawIdNo;", "queryUserRawIdNo", "Lcom/transsnet/palmpay/account/bean/req/AddUserExtraInfoReq;", "addUserExtraInfo", "(Lcom/transsnet/palmpay/account/bean/req/AddUserExtraInfoReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/req/SecurityVerifyMethodReq;", "Lcom/transsnet/palmpay/account/bean/rsp/SecurityVerifyMethodRsp;", "getSecurityVerifyMethodNotLogin", "(Lcom/transsnet/palmpay/account/bean/req/SecurityVerifyMethodReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSecurityVerifyMethod", "Lcom/transsnet/palmpay/account/bean/req/CheckSecurityVerifyMethodReq;", "Lcom/transsnet/palmpay/account/bean/rsp/CheckSecurityVerifyMethodRsp;", "checkSecurityVerifyMethod", "(Lcom/transsnet/palmpay/account/bean/req/CheckSecurityVerifyMethodReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bankCode", "bankAccount", "Lcom/transsnet/palmpay/account/bean/rsp/QueryBvnRsp;", "queryBvnByBankAccount", "appsflyerId", "campaign", "reportData", "Lcom/transsnet/palmpay/account/bean/rsp/UploadAppsFlyerRsp;", "uploadAppsFlyerConversation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "campaignContent", "getPopupDialogConfig", "getPopupDialogConfigV2", "Lcom/transsnet/palmpay/account/bean/req/SubmitGuardianReq;", "Lcom/transsnet/palmpay/account/bean/rsp/SubmitGuardianRsp;", "submitGuardian", "(Lcom/transsnet/palmpay/account/bean/req/SubmitGuardianReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "approveGuardian", "Lcom/transsnet/palmpay/account/bean/req/BindGuardianReq;", "bindGuardian", "(Lcom/transsnet/palmpay/account/bean/req/BindGuardianReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/account/bean/rsp/QueryGuardianInfoRsp;", "queryGuardianInfo", "authToken", "guardianMemberId", "resubmitGuardian", "Lcom/transsnet/palmpay/account/bean/rsp/GuardianRelationListBean;", "queryGuardianRelationList", "Lcom/transsnet/palmpay/account/bean/rsp/QueryTeenStatusRsp;", "queryTeenStatus", "Lcom/transsnet/palmpay/account/bean/rsp/GuardianConfig;", "queryGuardianConfig", "Lcom/transsnet/palmpay/account/bean/rsp/InterestRateConfigResp;", "getInterestRateConfig", "", "amount", "Lcom/transsnet/palmpay/account/bean/rsp/TrialCalculation;", "cashBoxTrialCalculation", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module_account_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IApiAccountService {
    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/device/unSuspendDevice")
    @NotNull
    d<DeviceActionRsp> activateDevice(@Body @Nullable DeviceActionReq req);

    @Headers({"Black-Code: yes"})
    @POST("/api/c-bff-product/member/kycSubmit")
    @Nullable
    Object addUserExtraInfo(@Body @Nullable AddUserExtraInfoReq addUserExtraInfoReq, @NotNull Continuation<? super CommonBeanResult<AddUserExtraActionRsp>> continuation);

    @Headers({"Black-Code: yes", "No-Token: yes"})
    @POST("/api/c-bff-product/start/registerSupplementNameVerify")
    @Nullable
    Object applyForBalanceV2(@Body @Nullable ApplyBalanceV2Req applyBalanceV2Req, @NotNull Continuation<? super CommonBeanResult<SignUpRsp>> continuation);

    @POST("/api/c-bff-product/member/applyMemberTireOrderV2")
    @NotNull
    d<CommonBeanResult<Tier3ApplyStatusRsp>> applyForTier3(@Body @Nullable ApplyForTier3Req req);

    @Headers({"Black-Code: yes"})
    @POST("/api/member-product/setting/setTransactionLimit")
    @Nullable
    Object applyTier3TransactionLimit(@Body @NotNull ApplyT3QuotaReq applyT3QuotaReq, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/online-agent-product/agent/teen/guardianApply")
    @Nullable
    Object approveGuardian(@Body @Nullable SubmitGuardianReq submitGuardianReq, @NotNull Continuation<? super CommonBeanResult<SubmitGuardianRsp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/online-agent-product/agent/teen/bind")
    @Nullable
    Object bindGuardian(@Body @Nullable BindGuardianReq bindGuardianReq, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"No-Token: yes", "Convert-Form-Data: yes"})
    @POST("/api/postpay-virtual-bank/v1/postpay/account/cashBoxTrialCalculation")
    Object cashBoxTrialCalculation(@Field("amount") @Nullable Long l5, @NotNull Continuation<? super CommonListResultV2<TrialCalculation>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/c-bff-product/securityVerify/changePhoneV2")
    @Nullable
    Object changePhone(@Body @Nullable ChangePhoneNoTokenReq changePhoneNoTokenReq, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Black-Code: yes", "No-Token: yes"})
    @POST("/api/c-bff-product/securityVerify/unLoginChangePhoneV2")
    @Nullable
    Object changePhoneNoToken(@Body @Nullable ChangePhoneNoTokenReq changePhoneNoTokenReq, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"No-Token: yes", "Black-Code: yes"})
    @POST("/api/cfront/startAppBasic/temporaryPINUpdate")
    @Nullable
    Object changeTempPinOrPsw(@Body @Nullable ChangeTempPinReq changeTempPinReq, @NotNull Continuation<? super CommonBeanResult<ChangeTempPinRsp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/member/changeName")
    @NotNull
    d<CommonResult> changeUserName(@Body @Nullable ChangeUserInfoReq req);

    @Headers({"No-Token: yes", "Black-Code: yes"})
    @POST("/api/c-bff-product/start/nameVerify")
    @Nullable
    Object checkIdentify(@Body @Nullable CheckIdentifyReq checkIdentifyReq, @NotNull Continuation<? super CommonBeanResult<CheckIdentifyRsp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/c-bff-product/startAppBasic/nameCheck")
    @Nullable
    Object checkInputNameMvvm(@Body @Nullable NameCheckReq nameCheckReq, @NotNull Continuation<? super CommonBeanResult<NameCheckRsp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/startAppBasic/checkInviteQrCode")
    @Nullable
    Object checkInviteCode(@Body @Nullable CheckInviteCodeReq checkInviteCodeReq, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes"})
    @POST("/api/member-product/operation/checkPassword")
    Object checkLoginPassword(@Field("loginPassword") @Nullable String str, @Field("enablePassword") boolean z3, @NotNull Continuation<? super CommonBeanResult<CheckPasswordRsp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes", "No-Token: yes"})
    @POST("/api/member-product/operation/checkPasswordUnLogin")
    Object checkLoginPasswordNoToken(@Field("loginPassword") @Nullable String str, @Field("phone") @Nullable String str2, @NotNull Continuation<? super CommonBeanResult<CheckPasswordRsp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/startAppBasic/checkPhone")
    @Nullable
    Object checkPhoneIsReg(@Body @JsonName("mobileNo") @Nullable String str, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Use_Sign_V2: yes"})
    @POST("/api/cfront/member/checkPin")
    @NotNull
    d<CommonBeanResult<CheckPinRsp>> checkPin(@Body @JsonName("pin") @Nullable String pin);

    @Headers({"Use_Sign_V2: yes"})
    @POST("/api/cfront/member/checkPin")
    @Nullable
    Object checkPinMvvm(@Body @JsonName("pin") @Nullable String str, @NotNull Continuation<? super CommonBeanResult<CheckPinRsp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes", "No-Token: yes"})
    @POST("/api/cfront/securityVerify/checkPin")
    Object checkPinNoToken(@Field("pin") @Nullable String str, @Field("mobileNo") @Nullable String str2, @NotNull Continuation<? super CommonBeanResult<CheckPinRsp>> continuation);

    @POST("/api/cfront/member/checkPinTouch")
    @NotNull
    d<CommonStringResult> checkPinTouchWithOrder(@Body @Nullable CheckPinTouchWithOrderReq req);

    @POST("/api/cfront/member/checkPinTouch")
    @Nullable
    Object checkPinTouchWithOrderMvvm(@Body @Nullable CheckPinTouchWithOrderReq checkPinTouchWithOrderReq, @NotNull Continuation<? super CommonStringResult> continuation);

    @Headers({"Black-Code: yes", "No-Token: yes"})
    @POST("/api/c-bff-product/securityVerify/verifyParamCheck")
    @Nullable
    Object checkSecurityVerifyMethod(@Body @Nullable CheckSecurityVerifyMethodReq checkSecurityVerifyMethodReq, @NotNull Continuation<? super CommonBeanResult<CheckSecurityVerifyMethodRsp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/startAppBasic/checkSms")
    @Nullable
    Object checkSmsCodeV2(@Body @Nullable SmsActionReq smsActionReq, @NotNull Continuation<? super SmsActionRsp> continuation);

    @POST("/api/transfer-product/schedule/transfer/checkPin")
    @NotNull
    d<CommonBeanResult<CheckPinRsp>> checkTransferPin(@Body @JsonName("pin") @Nullable String pin);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/device/suspendDevice")
    @NotNull
    d<DeviceActionRsp> deActivateDevice(@Body @Nullable DeviceActionReq req);

    @POST("/api/cfront/device/removeDevice")
    @NotNull
    d<CommonResult> deleteDevice(@Body @Nullable DeviceActionReq req);

    @GET("/api/member-product/setting/generateAccountNumber")
    @Nullable
    Object generateAccountNumber(@NotNull Continuation<? super CommonStringResult> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/c-bff-product/basic-data/queryAllByCountryV2")
    @NotNull
    d<CommonListResultV2<CountryRegionList>> getCountryRegionList(@Nullable @Query(AdRevenueScheme.COUNTRY) String code);

    @Headers({"No-Token: yes"})
    @GET("/api/c-bff-product/basic-data/queryAllByCountryV2")
    @Nullable
    Object getCountryRegionListMvvm(@Nullable @Query(AdRevenueScheme.COUNTRY) String str, @NotNull Continuation<? super CommonListResultV2<CountryRegionList>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/startAppBasic/certificationRule")
    @NotNull
    d<CommonListResultV2<IdIdentityListRsp>> getIdIdentityList(@Body @JsonName("authLevel") @Nullable String authLevel);

    @GET("/api/finance-saving-product/cash/saving/getAllRateConfig")
    @Nullable
    Object getInterestRateConfig(@NotNull Continuation<? super CommonBeanResult<InterestRateConfigResp>> continuation);

    @GET("/api/c-bff-product/member/queryLastElectricityBill")
    @NotNull
    d<CommonBeanResult<LatestBillerOrderDetailRsp>> getLatestBillerOrderDetail(@Nullable @Query("billNo") String billNo);

    @Headers({"No-Token: yes"})
    @GET("/api/scene-activity-product/retain/popup/getPopupConfig")
    @Nullable
    Object getPopupDialogConfig(@NotNull @Query("campaignContent") String str, @NotNull Continuation<? super CommonBeanResult<UploadAppsFlyerRsp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/scene-activity-product/retain/popup/getPopupConfig")
    @NotNull
    d<CommonBeanResult<UploadAppsFlyerRsp>> getPopupDialogConfigV2(@NotNull @Query("campaignContent") String campaignContent);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/member/getRegularRule")
    @NotNull
    d<RegularRuleRsp> getRegularRule(@Body @JsonName("ruleType") int ruleType);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/member/getRegularRule")
    @Nullable
    Object getRegularRuleMvvm(@Body @JsonName("ruleType") int i7, @NotNull Continuation<? super RegularRuleRsp> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/member/v2/getDistributeList")
    @NotNull
    d<CommonBeanResult<ResetPinVerifyListRsp>> getResetPinVerifyList(@Nullable @Query("mobileNo") String mobileNo);

    @NotNull
    @FormUrlEncoded
    @Headers({"No-Token: yes", "Convert-Form-Data: yes"})
    @POST("/api/cfront/securityVerify/getVerifyType")
    d<CommonBeanResult<ResetPinVerifyListRsp>> getResetPinVerifyListV2(@Field("mobileNo") @Nullable String mobileNo, @Field("flowId") @Nullable String flowId);

    @Headers({"No-Token: yes"})
    @GET("/api/cfront/member/resetPinRandomVerifyType")
    @NotNull
    d<CommonBeanResult<ResetPinVerifyTypeRsp>> getResetPinVerifyType(@Nullable @Query("smsToken") String smsToken);

    @NotNull
    @FormUrlEncoded
    @Headers({"No-Token: yes", "Convert-Form-Data: yes", "Black-Code: yes"})
    @POST("/api/cfront/securityVerify/getSecurityFlow")
    d<CommonBeanResult<GetSecurityFlowRsp>> getSecurityFlow(@Field("canReceiveOtp") boolean canReceiveOtp, @Field("mobileNo") @Nullable String mobileNo, @Field("scene") int scene);

    @Headers({"Black-Code: yes"})
    @POST("/api/c-bff-product/securityVerify/getVerifyMethod")
    @Nullable
    Object getSecurityVerifyMethod(@Body @Nullable SecurityVerifyMethodReq securityVerifyMethodReq, @NotNull Continuation<? super CommonBeanResult<SecurityVerifyMethodRsp>> continuation);

    @Headers({"Black-Code: yes", "No-Token: yes"})
    @POST("/api/c-bff-product/securityVerify/getVerifyMethodUnlogin")
    @Nullable
    Object getSecurityVerifyMethodNotLogin(@Body @Nullable SecurityVerifyMethodReq securityVerifyMethodReq, @NotNull Continuation<? super CommonBeanResult<SecurityVerifyMethodRsp>> continuation);

    @Headers({"No-Token: yes", "Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/c-bff-product/start/loginV2")
    @Nullable
    Object logIn(@Body @Nullable LogInReq logInReq, @NotNull Continuation<? super CommonBeanResult<SignUpRsp>> continuation);

    @GET("/api/cfront/member/modifyMiddleName")
    @NotNull
    d<CommonResult> modifyMiddleName(@Nullable @Query("middleName") String middleName);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/member/v2/modifyName")
    @NotNull
    d<CommonResult> modifyUserName(@Body @Nullable ChangeUserInfoReq req);

    @GET("/api/c-bff-product/member/preCheckApplyTier3")
    @Nullable
    Object preCheckApplyTier3(@NotNull Continuation<? super CommonBeanResult<PreCheckApplyTier3Rsp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Black-Code: yes", "Convert-Form-Data: yes", "No-Token: yes"})
    @POST("/api/c-bff-product/startAppBasic/phonePreCheckV2")
    Object preCheckPhoneMvvm(@Field("phone") @Nullable String str, @Field("loginName") @Nullable String str2, @Field("otpScene") @Nullable Integer num, @Field("mtnCode") @Nullable String str3, @NotNull Continuation<? super CommonBeanResult<PreCheckPhoneRsp>> continuation);

    @Headers({"No-Token: yes", "Black-Code: yes"})
    @POST("/api/c-bff-product/start/preRegister")
    @Nullable
    Object preSignUp(@Body @Nullable SignUpReq signUpReq, @NotNull Continuation<? super CommonBeanResult<PreSignUpRsp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"No-Token: yes", "Convert-Form-Data: yes", "Black-Code: yes"})
    @POST("/api/cfront/securityVerify/getSecurityQuestion")
    Object queryAccountDeviceHistory(@Field("flowId") @Nullable String str, @Field("mobileNo") @Nullable String str2, @NotNull Continuation<? super CommonBeanResult<AccountHistoryListRsp>> continuation);

    @POST("/api/c-bff-product/member/kycPreCheck")
    @Nullable
    Object queryAddUserExtraAction(@Body @JsonName("showDialog") @Nullable String str, @NotNull Continuation<? super CommonBeanResult<AddUserExtraActionRsp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes", "Custom_Read_Timeout:30", "Custom_Write_Timeout:30"})
    @POST("/api/validator-service/ocr/checkT3AddressBill")
    Object queryAddressFromBill(@Field("openUrl") @Nullable String str, @Field("queryMemberAddress") @Nullable Boolean bool, @NotNull Continuation<? super CommonBeanResult<QueryAddressFromBillRsp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"No-Token: yes", "Convert-Form-Data: yes"})
    @POST("/api/validator-service/identity/bankAccount/resolveBvn")
    Object queryBvnByBankAccount(@Field("bankCode") @Nullable String str, @Field("bankAccount") @Nullable String str2, @NotNull Continuation<? super CommonBeanResult<QueryBvnRsp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes", "No-Token: yes"})
    @POST("/api/c-bff-product/start/queryIdentityInfo")
    Object queryBvnIdentityInfo(@Field("phone") @Nullable String str, @Field("faceToken") @Nullable String str2, @Field("sceneType") int i7, @NotNull Continuation<? super CommonBeanResult<BvnIdentityInfoRsp>> continuation);

    @POST("/api/cfront/device/queryDevice")
    @NotNull
    d<CommonListResultV2<QueryDeviceRsp>> queryDevice(@Body @JsonName("imei") @Nullable String imei);

    @POST("/api/cfront/device/queryDevice")
    @Nullable
    Object queryDeviceMvvm(@Body @JsonName("imei") @Nullable String str, @NotNull Continuation<? super CommonListResultV2<QueryDeviceRsp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/online-agent-product/agent/teen/applyConfigInfo")
    @Nullable
    Object queryGuardianConfig(@Nullable @Query("authToken") String str, @NotNull Continuation<? super CommonBeanResult<GuardianConfig>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/online-agent-product/agent/teen/teenInfo")
    @Nullable
    Object queryGuardianInfo(@NotNull Continuation<? super CommonBeanResult<QueryGuardianInfoRsp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/online-agent-product/agent/teen/listRelationType")
    @Nullable
    Object queryGuardianRelationList(@NotNull Continuation<? super CommonListResultV2<GuardianRelationListBean>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/member-product/basic/queryBasicDataNoChildren")
    @Nullable
    Object queryIndustryBasicData(@Query("type") int i7, @NotNull Continuation<? super CommonListResultV2<IndustryList>> continuation);

    @NotNull
    @FormUrlEncoded
    @Headers({"No-Token: yes", "Convert-Form-Data: yes"})
    @POST("/api/cfront/account/getBankOrAccountList")
    d<CommonListResultV2<MyBankListRsp>> queryMyBankList(@Field("mobileNo") @Nullable String mobileNo, @Field("type") int type);

    @GET("/api/member-product/setting/queryMemberNotifySetting")
    @Nullable
    Object queryNotificationSetting(@NotNull Continuation<? super CommonBeanResult<NotificationSettings>> continuation);

    @GET("/api/cfront/authen/main")
    @Nullable
    Object queryRealNameAuthInfoMvvm(@NotNull Continuation<? super CommonBeanResult<RealNameAuthInfoRsp>> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/scene-activity-product/register/matchedCoupons")
    @Nullable
    Object queryRegisterCouponV2(@Body @Nullable SignUpSuccessCouponReq signUpSuccessCouponReq, @NotNull Continuation<? super CommonBeanResult<RegisterCouponResp>> continuation);

    @GET("/api/c-bff-product/home/settingSwitch")
    @Nullable
    Object querySettingSwitch(@NotNull Continuation<? super CommonBeanResult<SettingSwitchRsp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"No-Token: yes", "Convert-Form-Data: yes"})
    @POST("/api/online-agent-product/agent/teen/loginCheck")
    Object queryTeenStatus(@Field("authToken") @Nullable String str, @NotNull Continuation<? super CommonBeanResult<QueryTeenStatusRsp>> continuation);

    @GET("/api/member-product/setting/queryTransactionLimit")
    @Nullable
    Object queryTier3TransactionLimit(@NotNull Continuation<? super CommonBeanResult<QueryT3QuotaRsp>> continuation);

    @POST("/api/member-product/operation/queryMemberPlainInfo")
    @Nullable
    Object queryUserRawIdNo(@Body @JsonName("verifyToken") @Nullable String str, @NotNull Continuation<? super CommonBeanResult<UserRawIdNo>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/member/idAtuthInfo")
    @NotNull
    d<CommonBeanResult<UserValidIdInfoRsp>> queryUserValidIdInfo(@Body @JsonName("phone") @Nullable String phone);

    @Headers({"Black-Code: yes"})
    @POST("/api/c-bff-product/securityVerify/changePasswordV2")
    @NotNull
    d<CommonResult> resetPassword(@Body @Nullable ResetPasswordReq req);

    @Headers({"Black-Code: yes", "No-Token: yes"})
    @POST("/api/c-bff-product/securityVerify/unLoginChangePasswordV2")
    @NotNull
    d<CommonResult> resetPasswordNoToken(@Body @Nullable ResetPasswordReq req);

    @Headers({"Black-Code: yes", "No-Token: yes"})
    @POST("/api/c-bff-product/securityVerify/unLoginChangePinV2")
    @Nullable
    Object resetPinNoToken(@Body @Nullable ResetPinNoTokenReq resetPinNoTokenReq, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/c-bff-product/securityVerify/changePinV2")
    @Nullable
    Object resetPinV2(@Body @Nullable ResetPinNoTokenReq resetPinNoTokenReq, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/member/resetPinVerification")
    @NotNull
    d<CommonStringResult> resetPinVerify(@Body @Nullable ResetPinVerificationReq req);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/securityVerify/verificationInfo")
    @NotNull
    d<CommonStringResult> resetPinVerifyV2(@Body @Nullable ResetPinVerificationReq req);

    @Nullable
    @FormUrlEncoded
    @Headers({"No-Token: yes", "Convert-Form-Data: yes", "Black-Code: yes"})
    @POST("/api/online-agent-product/agent/teen/againApply")
    Object resubmitGuardian(@Field("authToken") @Nullable String str, @Field("guardianMemberId") @Nullable String str2, @NotNull Continuation<? super CommonBeanResult<SubmitGuardianRsp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/c-bff-product/startAppBasic/sendSmsV2")
    @Nullable
    Object sendSmsNewV2(@Body @Nullable SmsActionReq smsActionReq, @NotNull Continuation<? super SendSmsNewV2Rsp> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/startAppBasic/sendSms")
    @Nullable
    Object sendSmsV2(@Body @Nullable SmsActionReq smsActionReq, @NotNull Continuation<? super SendSmsRsp> continuation);

    @POST("/api/member-product/setting/setShowAccountNumber")
    @Nullable
    Object setShowAccountNumber(@Body @JsonName("accountType") int i7, @NotNull Continuation<? super CommonBooleanResult> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/member/setSetSelfieByType")
    @NotNull
    d<CommonResult> setUserPhotoByType(@Body @Nullable UserPhotoReq req);

    @Headers({"No-Token: yes", "Black-Code: yes"})
    @POST("/api/online-agent-product/agent/teen/apply")
    @Nullable
    Object submitGuardian(@Body @Nullable SubmitGuardianReq submitGuardianReq, @NotNull Continuation<? super CommonBeanResult<SubmitGuardianRsp>> continuation);

    @POST("/api/member-product/setting/updateMemberNotifySetting")
    @Nullable
    Object updateNotificationSetting(@Body @Nullable NotificationSettings notificationSettings, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"No-Token: yes", "Convert-Form-Data: yes"})
    @POST("/api/scene-activity-product/retain/popup/app/report")
    Object uploadAppsFlyerConversation(@Field("appsflyerId") @Nullable String str, @Field("campaign") @Nullable String str2, @Field("reportData") @Nullable String str3, @NotNull Continuation<? super CommonBeanResult<UploadAppsFlyerRsp>> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/securityVerify/answerQuestion")
    @Nullable
    Object verifyAccountDeviceHistory(@Body @NotNull VerifyAccountHistoryReq verifyAccountHistoryReq, @NotNull Continuation<? super CommonBeanResult<VerifyAccountHistoryRsp>> continuation);

    @POST("/api/cfront/member/phoneVerification")
    @NotNull
    d<CommonResult> verifyMobileNumberRealName(@Body @Nullable ModifyMemberInfoReq req);

    @POST("/api/validator/authen/verifyIdImg")
    @NotNull
    d<CommonResult> verifyNinIdImg(@Body @JsonName("idImg") @Nullable String idImg);

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/authen/changeName")
    @NotNull
    d<CommonResult> verifyRealName(@Body @Nullable VerifyRealNameReq req);
}
