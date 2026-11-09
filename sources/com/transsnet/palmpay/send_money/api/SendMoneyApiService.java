package com.transsnet.palmpay.send_money.api;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.palmpay.common.export.bean.req.DialogConfigSettingsReq;
import com.transsnet.palmpay.common.export.bean.resp.DialogConfigSettingsResp;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonBooleanResult;
import com.transsnet.palmpay.core.bean.CommonListResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.CreateBizOrderReq;
import com.transsnet.palmpay.core.bean.QueryBankListRsp;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.req.AnalysisPartnerInCodeReq;
import com.transsnet.palmpay.core.bean.req.CancelVoucherReq;
import com.transsnet.palmpay.core.bean.req.CommonListReq;
import com.transsnet.palmpay.core.bean.rsp.AnalysisPartnerInCodeRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryShopNameByQrCodeResp;
import com.transsnet.palmpay.send_money.bean.AddFromContactListResp;
import com.transsnet.palmpay.send_money.bean.AddRecipientReq;
import com.transsnet.palmpay.send_money.bean.AddRecipientResp;
import com.transsnet.palmpay.send_money.bean.AllBankListResp;
import com.transsnet.palmpay.send_money.bean.AnalysisCodeSendMoneyReq;
import com.transsnet.palmpay.send_money.bean.ApplyVoucherReq;
import com.transsnet.palmpay.send_money.bean.ApplyVoucherResp;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import com.transsnet.palmpay.send_money.bean.EditRecipientReq;
import com.transsnet.palmpay.send_money.bean.QrcodeParseResp;
import com.transsnet.palmpay.send_money.bean.QueryMemberByKeywordResp;
import com.transsnet.palmpay.send_money.bean.QueryMemberDetailReq;
import com.transsnet.palmpay.send_money.bean.QueryMemberDetailResp;
import com.transsnet.palmpay.send_money.bean.QueryRecipientReq;
import com.transsnet.palmpay.send_money.bean.QueryRecordReq;
import com.transsnet.palmpay.send_money.bean.QueryRecordResp;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.RecipientDetailResp;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.req.BeneficiaryByBankCodeReq;
import com.transsnet.palmpay.send_money.bean.req.LocalContactReq;
import com.transsnet.palmpay.send_money.bean.req.MatchBankReq;
import com.transsnet.palmpay.send_money.bean.req.MemberDetailReq;
import com.transsnet.palmpay.send_money.bean.req.QueryRecipientMemberInfoReq;
import com.transsnet.palmpay.send_money.bean.req.RecipientMemberLogoutReq;
import com.transsnet.palmpay.send_money.bean.req.SaveTransferLimitSettingReq;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferCreateReq;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferForBankUnstableListReq;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferForBankUnstableOrderReq;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferForBankUnstableReq;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferSubOrderListReq;
import com.transsnet.palmpay.send_money.bean.req.ToPalmPayBeneficiaryReq;
import com.transsnet.palmpay.send_money.bean.req.TransactionHistoryLinkReq;
import com.transsnet.palmpay.send_money.bean.req.TransferBankChannelInfoReq;
import com.transsnet.palmpay.send_money.bean.req.TransferBankEntranceReq;
import com.transsnet.palmpay.send_money.bean.req.TransferCreateOrderReq;
import com.transsnet.palmpay.send_money.bean.req.TransferMatchMemberReq;
import com.transsnet.palmpay.send_money.bean.req.TransferPalmPayEntranceReq;
import com.transsnet.palmpay.send_money.bean.req.TransferToBankHomeRecipientsReq;
import com.transsnet.palmpay.send_money.bean.resp.AddFavoriteRelationshipBean;
import com.transsnet.palmpay.send_money.bean.resp.AddFavoriteReq;
import com.transsnet.palmpay.send_money.bean.resp.BankAccountMemberInfoResp;
import com.transsnet.palmpay.send_money.bean.resp.CheckCreateOrderResp;
import com.transsnet.palmpay.send_money.bean.resp.CompensationDetailResp;
import com.transsnet.palmpay.send_money.bean.resp.LocalContactsResp;
import com.transsnet.palmpay.send_money.bean.resp.MatchBankRecipientsResp;
import com.transsnet.palmpay.send_money.bean.resp.MatchPalmPayRecipientsResp;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.bean.resp.NotificationEmailResp;
import com.transsnet.palmpay.send_money.bean.resp.PosterAccountBean;
import com.transsnet.palmpay.send_money.bean.resp.PosterAccountResp;
import com.transsnet.palmpay.send_money.bean.resp.QueryRecipientMemberInfoResp;
import com.transsnet.palmpay.send_money.bean.resp.QueryRecipientRelationshipListResp;
import com.transsnet.palmpay.send_money.bean.resp.RecipientMemberLogOutResp;
import com.transsnet.palmpay.send_money.bean.resp.RecipientResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleBeforeResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferCreateResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferDetailOrderResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferEntranceResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableCreateOrderResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableListResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableOrderResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferHomeResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferOrderResp;
import com.transsnet.palmpay.send_money.bean.resp.SearchPalmPayAccountResp;
import com.transsnet.palmpay.send_money.bean.resp.ToBankConfigResp;
import com.transsnet.palmpay.send_money.bean.resp.TransReceiptTypeResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferBankChannelInfoResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferBizConfigResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferLimitSettingResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferMatchMemberRsp;
import com.transsnet.palmpay.send_money.bean.resp.TransferOrderCreateResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferToBankAccountInfoResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferToPalmPayHomeConfigResp;
import com.transsnet.palmpay.send_money.bean.resp.VoiceNotifyResp;
import df.d;
import java.util.ArrayList;
import java.util.List;
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
@Metadata(d1 = {"\u0000¤\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u0015H'¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b#\u0010!J\"\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010$H§@¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020*0&H§@¢\u0006\u0004\b+\u0010,J&\u0010/\u001a\u00020.2\b\b\u0001\u0010%\u001a\u00020$2\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020.2\b\b\u0001\u00101\u001a\u00020\u0010H§@¢\u0006\u0004\b2\u0010\u0014J\u001f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00162\b\b\u0001\u0010\u0003\u001a\u000203H'¢\u0006\u0004\b5\u00106J\u001c\u00107\u001a\u0002042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u000103H§@¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00162\b\b\u0001\u0010\u0003\u001a\u000209H'¢\u0006\u0004\b;\u0010<J\u001c\u0010;\u001a\u00020:2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u000109H§@¢\u0006\u0004\b;\u0010=J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0016H'¢\u0006\u0004\b?\u0010@J\u001a\u0010A\u001a\u0002042\b\b\u0001\u0010\u0003\u001a\u000203H§@¢\u0006\u0004\bA\u00108J\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00162\b\b\u0001\u0010\u0003\u001a\u00020BH'¢\u0006\u0004\bD\u0010EJ\u001a\u0010F\u001a\u00020C2\b\b\u0001\u0010\u0003\u001a\u00020BH§@¢\u0006\u0004\bF\u0010GJ\"\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00042\n\b\u0001\u0010%\u001a\u0004\u0018\u00010$H§@¢\u0006\u0004\bI\u0010)J\u001b\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u00040\u0016H'¢\u0006\u0004\bK\u0010@J\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u00162\b\b\u0001\u0010\u0003\u001a\u00020LH'¢\u0006\u0004\bN\u0010OJ\u001f\u0010P\u001a\b\u0012\u0004\u0012\u00020M0\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\bP\u0010QJ&\u0010U\u001a\u00020C2\b\b\u0001\u0010S\u001a\u00020R2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\bU\u0010VJ\u001c\u0010X\u001a\u00020C2\n\b\u0001\u0010W\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\bX\u0010\u0014J\u001c\u0010Y\u001a\u00020C2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\bY\u0010\u0014J&\u0010Z\u001a\u00020C2\b\b\u0001\u0010S\u001a\u00020R2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\bZ\u0010VJ\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u0004H§@¢\u0006\u0004\b\\\u0010,J8\u0010`\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010^j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u0001`_0\u00042\b\b\u0001\u0010\u0003\u001a\u00020]H§@¢\u0006\u0004\b`\u0010aJ\u0016\u0010c\u001a\b\u0012\u0004\u0012\u00020b0&H§@¢\u0006\u0004\bc\u0010,J\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020e0\u00162\b\b\u0001\u0010d\u001a\u00020\u0010H'¢\u0006\u0004\bN\u0010QJ\u001c\u0010g\u001a\u00020C2\n\b\u0001\u0010f\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\bg\u0010\u0014J\u001a\u0010i\u001a\u00020C2\b\b\u0001\u0010h\u001a\u00020RH§@¢\u0006\u0004\bi\u0010jJ\u001c\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0k0\u0004H§@¢\u0006\u0004\bm\u0010,J\u001c\u0010p\u001a\u00020o2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010nH§@¢\u0006\u0004\bp\u0010qJ\u001c\u0010t\u001a\u00020s2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010rH§@¢\u0006\u0004\bt\u0010uJ\u001c\u0010x\u001a\u00020w2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010vH§@¢\u0006\u0004\bx\u0010yJ.\u0010}\u001a\b\u0012\u0004\u0012\u00020|0\u00042\n\b\u0001\u0010z\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010{\u001a\u0004\u0018\u00010RH§@¢\u0006\u0004\b}\u0010~J%\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u00042\n\b\u0001\u0010\u007f\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0005\b\u0081\u0001\u0010\u0014J!\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0082\u0001H§@¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J \u0010\u0087\u0001\u001a\u00020\u00172\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0086\u0001H§@¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J(\u0010\u008c\u0001\u001a\n\u0012\u0005\u0012\u00030\u008b\u00010\u008a\u00012\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0089\u0001H§@¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J(\u0010\u008f\u0001\u001a\n\u0012\u0005\u0012\u00030\u008b\u00010\u008a\u00012\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u008e\u0001H§@¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J(\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u008a\u00012\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u008e\u0001H§@¢\u0006\u0006\b\u0092\u0001\u0010\u0090\u0001J\u0012\u0010\u0093\u0001\u001a\u00020MH§@¢\u0006\u0005\b\u0093\u0001\u0010,J\u0012\u0010\u0094\u0001\u001a\u00020MH§@¢\u0006\u0005\b\u0094\u0001\u0010,J \u0010\u0096\u0001\u001a\u00020M2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0095\u0001H§@¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J \u0010\u0098\u0001\u001a\u00020M2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u008e\u0001H§@¢\u0006\u0006\b\u0098\u0001\u0010\u0090\u0001J%\u0010\u009b\u0001\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010\u00042\t\b\u0001\u0010\u0003\u001a\u00030\u0099\u0001H§@¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J,\u0010\u009e\u0001\u001a\u00020C2\u000b\b\u0001\u0010\u009d\u0001\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J \u0010¡\u0001\u001a\u00020M2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010 \u0001H§@¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001f\u0010¤\u0001\u001a\u00030£\u00012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010$H§@¢\u0006\u0005\b¤\u0001\u0010)J\u0013\u0010¥\u0001\u001a\u00030£\u0001H§@¢\u0006\u0005\b¥\u0001\u0010,J!\u0010¨\u0001\u001a\u00030§\u00012\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010¦\u0001H§@¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u0010«\u0001\u001a\t\u0012\u0005\u0012\u00030ª\u00010\u0004H§@¢\u0006\u0005\b«\u0001\u0010,J\u001f\u0010®\u0001\u001a\u00030\u00ad\u00012\t\b\u0001\u0010\u0003\u001a\u00030¬\u0001H§@¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0019\u0010±\u0001\u001a\t\u0012\u0005\u0012\u00030°\u00010\u0004H§@¢\u0006\u0005\b±\u0001\u0010,J%\u0010´\u0001\u001a\t\u0012\u0005\u0012\u00030³\u00010\u00042\t\b\u0001\u0010\u0003\u001a\u00030²\u0001H§@¢\u0006\u0006\b´\u0001\u0010µ\u0001J@\u0010¹\u0001\u001a\t\u0012\u0005\u0012\u00030¸\u00010\u00042\u000b\b\u0001\u0010¶\u0001\u001a\u0004\u0018\u00010\u00102\u000b\b\u0001\u0010·\u0001\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010{\u001a\u0004\u0018\u00010RH§@¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0012\u0010»\u0001\u001a\u00020CH§@¢\u0006\u0005\b»\u0001\u0010,J'\u0010¾\u0001\u001a\t\u0012\u0005\u0012\u00030½\u00010\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010¼\u0001H§@¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\"\u0010Ã\u0001\u001a\u00030Â\u00012\f\b\u0001\u0010Á\u0001\u001a\u0005\u0018\u00010À\u0001H§@¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J \u0010Å\u0001\u001a\u00020\u00172\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0086\u0001H§@¢\u0006\u0006\bÅ\u0001\u0010\u0088\u0001J \u0010È\u0001\u001a\u00030Ç\u00012\u000b\b\u0001\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0005\bÈ\u0001\u0010\u0014J&\u0010Ë\u0001\u001a\t\u0012\u0005\u0012\u00030Ê\u00010\u00042\u000b\b\u0001\u0010É\u0001\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0005\bË\u0001\u0010\u0014J\u0019\u0010Í\u0001\u001a\t\u0012\u0005\u0012\u00030Ì\u00010\u0004H§@¢\u0006\u0005\bÍ\u0001\u0010,J\u0013\u0010Ï\u0001\u001a\u00030Î\u0001H§@¢\u0006\u0005\bÏ\u0001\u0010,J\u0019\u0010Ñ\u0001\u001a\t\u0012\u0005\u0012\u00030Ð\u00010\u0004H§@¢\u0006\u0005\bÑ\u0001\u0010,J%\u0010Ó\u0001\u001a\t\u0012\u0005\u0012\u00030Ò\u00010\u00042\n\b\u0001\u0010\u007f\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0005\bÓ\u0001\u0010\u0014J'\u0010Ö\u0001\u001a\t\u0012\u0005\u0012\u00030Õ\u00010\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010Ô\u0001H§@¢\u0006\u0006\bÖ\u0001\u0010×\u0001J&\u0010Ù\u0001\u001a\t\u0012\u0005\u0012\u00030Î\u00010\u00042\u000b\b\u0001\u0010Ø\u0001\u001a\u0004\u0018\u00010$H§@¢\u0006\u0005\bÙ\u0001\u0010)J \u0010Ü\u0001\u001a\u00030Û\u00012\u000b\b\u0001\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0005\bÜ\u0001\u0010\u0014J\u0013\u0010Ý\u0001\u001a\u00030Û\u0001H§@¢\u0006\u0005\bÝ\u0001\u0010,J%\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u000b\b\u0001\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0005\bß\u0001\u0010\u0014J\u0018\u0010à\u0001\u001a\b\u0012\u0004\u0012\u00020R0\u0004H§@¢\u0006\u0005\bà\u0001\u0010,J\u0019\u0010â\u0001\u001a\t\u0012\u0005\u0012\u00030á\u00010\u0004H§@¢\u0006\u0005\bâ\u0001\u0010,J\u001e\u0010ä\u0001\u001a\u00020C2\t\b\u0001\u0010\u0003\u001a\u00030ã\u0001H§@¢\u0006\u0006\bä\u0001\u0010å\u0001J'\u0010è\u0001\u001a\t\u0012\u0005\u0012\u00030ç\u00010\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010æ\u0001H§@¢\u0006\u0006\bè\u0001\u0010é\u0001J&\u0010ë\u0001\u001a\t\u0012\u0005\u0012\u00030ê\u00010\u00042\u000b\b\u0001\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0005\bë\u0001\u0010\u0014J\u0019\u0010í\u0001\u001a\t\u0012\u0005\u0012\u00030ì\u00010\u0004H§@¢\u0006\u0005\bí\u0001\u0010,J,\u0010ï\u0001\u001a\u00020C2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u00102\u000b\b\u0001\u0010î\u0001\u001a\u0004\u0018\u00010$H§@¢\u0006\u0006\bï\u0001\u0010ð\u0001J'\u0010ó\u0001\u001a\t\u0012\u0005\u0012\u00030ò\u00010\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010ñ\u0001H§@¢\u0006\u0006\bó\u0001\u0010ô\u0001J'\u0010÷\u0001\u001a\t\u0012\u0005\u0012\u00030ö\u00010&2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010õ\u0001H§@¢\u0006\u0006\b÷\u0001\u0010ø\u0001J'\u0010÷\u0001\u001a\t\u0012\u0005\u0012\u00030ö\u00010&2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010ù\u0001H§@¢\u0006\u0006\b÷\u0001\u0010ú\u0001J'\u0010ý\u0001\u001a\t\u0012\u0005\u0012\u00030ü\u00010\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010û\u0001H§@¢\u0006\u0006\bý\u0001\u0010þ\u0001J\u0019\u0010\u0080\u0002\u001a\t\u0012\u0005\u0012\u00030ÿ\u00010&H§@¢\u0006\u0005\b\u0080\u0002\u0010,J'\u0010\u0081\u0002\u001a\t\u0012\u0005\u0012\u00030ÿ\u00010&2\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u008e\u0001H§@¢\u0006\u0006\b\u0081\u0002\u0010\u0090\u0001J'\u0010\u0084\u0002\u001a\t\u0012\u0005\u0012\u00030\u0083\u00020\u00042\u000b\b\u0001\u0010\u0003\u001a\u0005\u0018\u00010\u0082\u0002H§@¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002J%\u0010\u0086\u0002\u001a\t\u0012\u0005\u0012\u00030ÿ\u00010\u00042\n\b\u0001\u0010f\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0005\b\u0086\u0002\u0010\u0014J\u001e\u0010\u0087\u0002\u001a\u00020C2\n\b\u0001\u0010f\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0005\b\u0087\u0002\u0010\u0014J\u0019\u0010\u0089\u0002\u001a\t\u0012\u0005\u0012\u00030\u0088\u00020&H§@¢\u0006\u0005\b\u0089\u0002\u0010,J\u0019\u0010\u008a\u0002\u001a\t\u0012\u0005\u0012\u00030\u0088\u00020&H§@¢\u0006\u0005\b\u008a\u0002\u0010,J\u001e\u0010\u008c\u0002\u001a\u00020C2\t\b\u0001\u0010\u0003\u001a\u00030\u008b\u0002H§@¢\u0006\u0006\b\u008c\u0002\u0010\u008d\u0002J(\u0010\u0090\u0002\u001a\t\u0012\u0005\u0012\u00030\u008f\u00020\u00042\f\b\u0001\u0010Á\u0001\u001a\u0005\u0018\u00010\u008e\u0002H§@¢\u0006\u0006\b\u0090\u0002\u0010\u0091\u0002J(\u0010\u0094\u0002\u001a\u00020C2\t\b\u0001\u0010\u0092\u0002\u001a\u00020$2\t\b\u0001\u0010\u0093\u0002\u001a\u00020\u0010H§@¢\u0006\u0005\b\u0094\u0002\u00100¨\u0006\u0095\u0002"}, d2 = {"Lcom/transsnet/palmpay/send_money/api/SendMoneyApiService;", "", "Lcom/transsnet/palmpay/core/bean/CreateBizOrderReq;", "req", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/send_money/bean/resp/CheckCreateOrderResp;", "checkCreateOrder", "(Lcom/transsnet/palmpay/core/bean/CreateBizOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/AnalysisCodeSendMoneyReq;", "Lcom/transsnet/palmpay/send_money/bean/QrcodeParseResp;", "parseQrcodeData", "(Lcom/transsnet/palmpay/send_money/bean/AnalysisCodeSendMoneyReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/AnalysisPartnerInCodeReq;", "Lcom/transsnet/palmpay/core/bean/rsp/AnalysisPartnerInCodeRsp;", "analysisPartnerInCode", "(Lcom/transsnet/palmpay/core/bean/req/AnalysisPartnerInCodeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "qrCode", "Lcom/transsnet/palmpay/core/bean/rsp/QueryShopNameByQrCodeResp;", "getShopNameByQrCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/ApplyVoucherReq;", "Ldf/d;", "Lcom/transsnet/palmpay/send_money/bean/ApplyVoucherResp;", "applyVoucher", "(Lcom/transsnet/palmpay/send_money/bean/ApplyVoucherReq;)Ldf/d;", "Lcom/transsnet/palmpay/send_money/bean/QueryRecordReq;", "Lcom/transsnet/palmpay/send_money/bean/QueryRecordResp;", "queryTransferRecord", "(Lcom/transsnet/palmpay/send_money/bean/QueryRecordReq;)Ldf/d;", "Lcom/transsnet/palmpay/send_money/bean/QueryMemberDetailReq;", "Lcom/transsnet/palmpay/send_money/bean/QueryMemberByKeywordResp;", "queryMemberDetailByKeyWords", "(Lcom/transsnet/palmpay/send_money/bean/QueryMemberDetailReq;)Ldf/d;", "Lcom/transsnet/palmpay/send_money/bean/QueryMemberDetailResp;", "queryMemberDetailByPhone", "", "sourceType", "Lcom/transsnet/palmpay/core/bean/CommonListResultV2;", "Lcom/transsnet/palmpay/send_money/bean/resp/MatchPalmPayRecipientsResp;", "matchPalmPayRecipients", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/resp/MatchBankRecipientsResp;", "matchBankRecipients", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bankAccNo", "Lcom/transsnet/palmpay/send_money/bean/AllBankListResp;", "queryAllBankListForToBank", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "queryAllBankList", "Lcom/transsnet/palmpay/send_money/bean/AddRecipientReq;", "Lcom/transsnet/palmpay/send_money/bean/AddRecipientResp;", "createRecipient", "(Lcom/transsnet/palmpay/send_money/bean/AddRecipientReq;)Ldf/d;", "createRecipientMV", "(Lcom/transsnet/palmpay/send_money/bean/AddRecipientReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/req/QueryRecipientMemberInfoReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/QueryRecipientMemberInfoResp;", "queryRecipientMemberInfo", "(Lcom/transsnet/palmpay/send_money/bean/req/QueryRecipientMemberInfoReq;)Ldf/d;", "(Lcom/transsnet/palmpay/send_money/bean/req/QueryRecipientMemberInfoReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/resp/QueryRecipientRelationshipListResp;", "queryRecipientRelationshipList", "()Ldf/d;", "createRecipientMvvm", "Lcom/transsnet/palmpay/send_money/bean/EditRecipientReq;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "editRecipient", "(Lcom/transsnet/palmpay/send_money/bean/EditRecipientReq;)Ldf/d;", "editRecipientMvvm", "(Lcom/transsnet/palmpay/send_money/bean/EditRecipientReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/resp/AddFavoriteRelationshipBean;", "queryRecipientLabel", "Lcom/transsnet/palmpay/send_money/bean/resp/TransferBizConfigResp;", "getTransferBizConfig", "Lcom/transsnet/palmpay/send_money/bean/QueryRecipientReq;", "Lcom/transsnet/palmpay/send_money/bean/RecipientListResp;", "queryRecipients", "(Lcom/transsnet/palmpay/send_money/bean/QueryRecipientReq;)Ldf/d;", "queryRecipientsV2", "(Ljava/lang/String;)Ldf/d;", "", "favorite", "relationId", "updateFavoriteRecipient", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recipientId", "deleteBeneficiariesMvvm", "deleteRecipient", "updateFavoriteMvvm", "Lcom/transsnet/palmpay/send_money/bean/resp/ToBankConfigResp;", "getTransToBankTopTabInfo", "Lcom/transsnet/palmpay/send_money/bean/req/TransactionHistoryLinkReq;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "queryTransactionLink", "(Lcom/transsnet/palmpay/send_money/bean/req/TransactionHistoryLinkReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/BankInfo;", "getNoNetUssdBankList", "recipientMemberId", "Lcom/transsnet/palmpay/send_money/bean/RecipientDetailResp;", "taskNo", "clickRecentlyScheduleTransfer", "noticeFlag", "updateNotificationEmailMvvm", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/transsnet/palmpay/send_money/bean/resp/NotificationEmailResp;", "queryNotificationEmailMvvm", "Lcom/transsnet/palmpay/send_money/bean/req/TransferCreateOrderReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/TransferOrderCreateResp;", "createOrderMvvm", "(Lcom/transsnet/palmpay/send_money/bean/req/TransferCreateOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/VerifyPaymentInfoReq;", "Lcom/transsnet/palmpay/send_money/bean/VerifyPaymentInfoRsp;", "strangerCheckV2", "(Lcom/transsnet/palmpay/send_money/bean/VerifyPaymentInfoReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/req/TransferMatchMemberReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/TransferMatchMemberRsp;", "getMatchTransferBankDetail", "(Lcom/transsnet/palmpay/send_money/bean/req/TransferMatchMemberReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "keyWord", "existRecipient", "Lcom/transsnet/palmpay/send_money/bean/resp/SearchPalmPayAccountResp;", "searchPpAccount", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountNo", "Lcom/transsnet/palmpay/send_money/bean/resp/BankAccountMemberInfoResp;", "getBankAccountMemberInfo", "Lcom/transsnet/palmpay/send_money/bean/req/MatchBankReq;", "Lcom/transsnet/palmpay/core/bean/QueryBankListRsp;", "queryMatchedBank", "(Lcom/transsnet/palmpay/send_money/bean/req/MatchBankReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/CancelVoucherReq;", "cancelRequestMoneyMvvm", "(Lcom/transsnet/palmpay/core/bean/req/CancelVoucherReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/req/ToPalmPayBeneficiaryReq;", "Lcom/transsnet/palmpay/core/bean/CommonListResult;", "Lcom/transsnet/palmpay/send_money/bean/RecipientBeanV2;", "queryToPalmPayAllRecipients", "(Lcom/transsnet/palmpay/send_money/bean/req/ToPalmPayBeneficiaryReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/CommonListReq;", "queryToPalmPayFavoriteRecipients", "(Lcom/transsnet/palmpay/core/bean/req/CommonListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/resp/LocalContactsResp$LocalContactBean;", "queryToPalmPayLocalContactRecipients", "queryHomeBankRecentlyRecipients", "queryHomeBankFavoriteRecipients", "Lcom/transsnet/palmpay/send_money/bean/req/TransferToBankHomeRecipientsReq;", "queryBankAllRecipients", "(Lcom/transsnet/palmpay/send_money/bean/req/TransferToBankHomeRecipientsReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryBankFavoriteRecipients", "Lcom/transsnet/palmpay/send_money/bean/req/RecipientMemberLogoutReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/RecipientMemberLogOutResp;", "getRecipientMemberLogOut", "(Lcom/transsnet/palmpay/send_money/bean/req/RecipientMemberLogoutReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recipientType", "removeTransferRecipient", "(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/req/BeneficiaryByBankCodeReq;", "queryBankRecipientsByBankCode", "(Lcom/transsnet/palmpay/send_money/bean/req/BeneficiaryByBankCodeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/resp/RecipientResp;", "queryPalmPayRecentlyList", "queryPalmPayFavoriteList", "Lcom/transsnet/palmpay/send_money/bean/req/LocalContactReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/LocalContactsResp;", "queryLocalContactsList", "(Lcom/transsnet/palmpay/send_money/bean/req/LocalContactReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleBeforeResp;", "getScheduleBefore", "Lcom/transsnet/palmpay/send_money/bean/ConfigReq;", "Lcom/transsnet/palmpay/core/bean/BalanceAndLimitResp;", "queryBalanceAndLimitMvvm", "(Lcom/transsnet/palmpay/send_money/bean/ConfigReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferHomeResp;", "queryScheduleTransferHome", "Lcom/transsnet/palmpay/send_money/bean/req/TransferBankChannelInfoReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/TransferBankChannelInfoResp;", "getChannelInfo", "(Lcom/transsnet/palmpay/send_money/bean/req/TransferBankChannelInfoReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bankCode", "bankAccount", "Lcom/transsnet/palmpay/send_money/bean/resp/TransferToBankAccountInfoResp;", "getInputAmountBankDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clickTransferCsLevyFeeGuide", "Lcom/transsnet/palmpay/send_money/bean/req/MemberDetailReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/MemberDetailResp;", "queryMemberDetail", "(Lcom/transsnet/palmpay/send_money/bean/req/MemberDetailReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/payment/CheckPayReq;", "body", "Lcom/transsnet/palmpay/core/bean/payment/CheckPayResp;", "queryPayResult", "(Lcom/transsnet/palmpay/core/bean/payment/CheckPayReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelVoucherMvvm", "orderId", "Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp;", "queryRecordOrderDetailMvvm", "orderNo", "Lcom/transsnet/palmpay/send_money/bean/resp/CompensationDetailResp;", "queryCompensationOrderDetailMvvm", "Lcom/transsnet/palmpay/send_money/bean/resp/TransReceiptTypeResp;", "queryReceiptType", "Lcom/transsnet/palmpay/send_money/bean/resp/PosterAccountResp;", "queryPosterAccount", "Lcom/transsnet/palmpay/send_money/bean/resp/VoiceNotifyResp;", "queryVoiceNotify", "Lcom/transsnet/palmpay/send_money/bean/resp/PosterAccountBean;", "applyPoster", "Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferForBankUnstableListReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableListResp;", "getBookTransferList", "(Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferForBankUnstableListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "status", "voiceNotify", "bookNo", "Lcom/transsnet/palmpay/core/bean/CommonBooleanResult;", "cancelBookTransfer", "checkTrialMvvm", "mappingAccountNo", "handleCashBackLabel", "transferShortcutSwitch", "Lcom/transsnet/palmpay/send_money/bean/resp/TransferLimitSettingResp;", "queryTransferLimitSetting", "Lcom/transsnet/palmpay/send_money/bean/req/SaveTransferLimitSettingReq;", "saveTransferLimitSetting", "(Lcom/transsnet/palmpay/send_money/bean/req/SaveTransferLimitSettingReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferForBankUnstableReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableResp;", "getBookTransferForm", "(Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferForBankUnstableReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableOrderResp;", "getBookTransferDetail", "Lcom/transsnet/palmpay/send_money/bean/resp/TransferToPalmPayHomeConfigResp;", "queryToPalmPayConfig", "businessType", "cancelPhoneFavoriteWarn", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferForBankUnstableOrderReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableCreateOrderResp;", "createBookTransfer", "(Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferForBankUnstableOrderReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/req/TransferPalmPayEntranceReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferEntranceResp;", "showTransferEntrance", "(Lcom/transsnet/palmpay/send_money/bean/req/TransferPalmPayEntranceReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/req/TransferBankEntranceReq;", "(Lcom/transsnet/palmpay/send_money/bean/req/TransferBankEntranceReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferCreateReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferCreateResp;", "createScheduleTransferOrder", "(Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferCreateReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferOrderResp;", "queryScheduleTransferRunningList", "queryScheduleTransferList", "Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferSubOrderListReq;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferDetailOrderResp;", "queryScheduleTransferSubOrderListV2", "(Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferSubOrderListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryScheduleTaskDetail", "cancelScheduleTask", "Lcom/transsnet/palmpay/send_money/bean/AddFromContactListResp;", "queryBankNoFavoriteRecipients", "queryPhoneNoFavoriteRecipients", "Lcom/transsnet/palmpay/send_money/bean/resp/AddFavoriteReq;", "createFavoriteRecipient", "(Lcom/transsnet/palmpay/send_money/bean/resp/AddFavoriteReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/common/export/bean/req/DialogConfigSettingsReq;", "Lcom/transsnet/palmpay/common/export/bean/resp/DialogConfigSettingsResp;", "queryDialogConfig", "(Lcom/transsnet/palmpay/common/export/bean/req/DialogConfigSettingsReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAutoTransfer", "source", "updateAutoTransferConfig", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SendMoneyApiService {
    @POST("/api/cfront/offline/merchant/analysisPartnerInCode")
    @Nullable
    Object analysisPartnerInCode(@Body @NotNull AnalysisPartnerInCodeReq analysisPartnerInCodeReq, @NotNull Continuation<? super AnalysisPartnerInCodeRsp> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/transfer-product/poster/applyPoster")
    Object applyPoster(@Field("accountNo") @Nullable String str, @NotNull Continuation<? super CommonBeanResult<PosterAccountBean>> continuation);

    @POST("/api/cfront/sendMoney/withdraw2balance")
    @NotNull
    d<ApplyVoucherResp> applyVoucher(@Body @NotNull ApplyVoucherReq req);

    @GET("/api/transfer-product/book/transfer/cancelBookTransfer")
    @Nullable
    Object cancelBookTransfer(@Nullable @Query("bookNo") String str, @NotNull Continuation<? super CommonBooleanResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/transfer-product/phone/cancelPhoneFavoriteWarn")
    Object cancelPhoneFavoriteWarn(@Field("relationId") @Nullable String str, @Field("businessType") @Nullable Integer num, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/sendMoney/moneyCancel")
    @Nullable
    Object cancelRequestMoneyMvvm(@Body @Nullable CancelVoucherReq cancelVoucherReq, @NotNull Continuation<? super ApplyVoucherResp> continuation);

    @GET("/api/transfer-product/schedule/transfer/cancelScheduleTask")
    @Nullable
    Object cancelScheduleTask(@Nullable @Query("taskNo") String str, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/sendMoney/cancelVoucher")
    @Nullable
    Object cancelVoucherMvvm(@Body @Nullable CancelVoucherReq cancelVoucherReq, @NotNull Continuation<? super ApplyVoucherResp> continuation);

    @Headers({"Black-Code: yes"})
    @POST("/api/scene-offline-product/codePlate/checkCreateOrder")
    @Nullable
    Object checkCreateOrder(@Body @Nullable CreateBizOrderReq createBizOrderReq, @NotNull Continuation<? super CommonBeanResult<CheckCreateOrderResp>> continuation);

    @POST("/api/cfront/earlyRefund/trial")
    @Nullable
    Object checkTrialMvvm(@NotNull Continuation<? super CommonBooleanResult> continuation);

    @GET("/api/transfer-product/schedule/transfer/clickRecentlyScheduleTransfer")
    @Nullable
    Object clickRecentlyScheduleTransfer(@Nullable @Query("taskNo") String str, @NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/transfer-product/transfer/clickTransferCsLevyFeeGuide")
    @Nullable
    Object clickTransferCsLevyFeeGuide(@NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/transfer-product/book/transfer/createBookTransfer")
    @Nullable
    Object createBookTransfer(@Body @Nullable ScheduleTransferForBankUnstableOrderReq scheduleTransferForBankUnstableOrderReq, @NotNull Continuation<? super CommonBeanResult<ScheduleTransferForBankUnstableCreateOrderResp>> continuation);

    @POST("/api/transfer-product/recipient/createFavoriteRecipient")
    @Nullable
    Object createFavoriteRecipient(@Body @NotNull AddFavoriteReq addFavoriteReq, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/transfer-product/transfer/createBizOrder")
    @Nullable
    Object createOrderMvvm(@Body @Nullable TransferCreateOrderReq transferCreateOrderReq, @NotNull Continuation<? super TransferOrderCreateResp> continuation);

    @POST("/api/transfer-product/phone/beneficiary/createPhoneRecipient")
    @NotNull
    d<AddRecipientResp> createRecipient(@Body @NotNull AddRecipientReq req);

    @POST("/api/transfer-product/phone/beneficiary/createPhoneRecipient")
    @Nullable
    Object createRecipientMV(@Body @Nullable AddRecipientReq addRecipientReq, @NotNull Continuation<? super AddRecipientResp> continuation);

    @POST("/api/transfer-product/bank/beneficiary/createBankRecipient")
    @Nullable
    Object createRecipientMvvm(@Body @NotNull AddRecipientReq addRecipientReq, @NotNull Continuation<? super AddRecipientResp> continuation);

    @Headers({"Black-Code: yes", "Use_Sign_V2: yes"})
    @POST("/api/transfer-product/schedule/transfer/createScheduleTask")
    @Nullable
    Object createScheduleTransferOrder(@Body @Nullable ScheduleTransferCreateReq scheduleTransferCreateReq, @NotNull Continuation<? super CommonBeanResult<ScheduleTransferCreateResp>> continuation);

    @GET("/api/transfer-product/bank/beneficiary/removeBankRecipient")
    @Nullable
    Object deleteBeneficiariesMvvm(@Nullable @Query("recipientId") String str, @NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/transfer-product/phone/beneficiary/removePhoneRecipient")
    @Nullable
    Object deleteRecipient(@Nullable @Query("relationId") String str, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/cfront/sendMoney/updateRecipient")
    @NotNull
    d<CommonResult> editRecipient(@Body @NotNull EditRecipientReq req);

    @POST("/api/cfront/sendMoney/updateRecipient")
    @Nullable
    Object editRecipientMvvm(@Body @NotNull EditRecipientReq editRecipientReq, @NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/transfer-product/transfer/getBankAccountMemberInfo")
    @Nullable
    Object getBankAccountMemberInfo(@Nullable @Query("accountNo") String str, @NotNull Continuation<? super CommonBeanResult<BankAccountMemberInfoResp>> continuation);

    @GET("/api/transfer-product/book/transfer/getBookTransferDetail")
    @Nullable
    Object getBookTransferDetail(@Nullable @Query("bookNo") String str, @NotNull Continuation<? super CommonBeanResult<ScheduleTransferForBankUnstableOrderResp>> continuation);

    @POST("/api/transfer-product/book/transfer/getBookTransferForm")
    @Nullable
    Object getBookTransferForm(@Body @Nullable ScheduleTransferForBankUnstableReq scheduleTransferForBankUnstableReq, @NotNull Continuation<? super CommonBeanResult<ScheduleTransferForBankUnstableResp>> continuation);

    @POST("/api/transfer-product/book/transfer/pageBookingHistory")
    @Nullable
    Object getBookTransferList(@Body @Nullable ScheduleTransferForBankUnstableListReq scheduleTransferForBankUnstableListReq, @NotNull Continuation<? super CommonBeanResult<ScheduleTransferForBankUnstableListResp>> continuation);

    @POST("/api/transfer-product/book/transfer/getChannelInfo")
    @Nullable
    Object getChannelInfo(@Body @NotNull TransferBankChannelInfoReq transferBankChannelInfoReq, @NotNull Continuation<? super CommonBeanResult<TransferBankChannelInfoResp>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/transfer-product/transfer/getInputAmountBankDetail")
    Object getInputAmountBankDetail(@Field("bankCode") @Nullable String str, @Field("bankAccount") @Nullable String str2, @Field("existRecipient") @Nullable Boolean bool, @NotNull Continuation<? super CommonBeanResult<TransferToBankAccountInfoResp>> continuation);

    @POST("/api/transfer-product/transfer/getMatchTransferBankDetail")
    @Nullable
    Object getMatchTransferBankDetail(@Body @Nullable TransferMatchMemberReq transferMatchMemberReq, @NotNull Continuation<? super TransferMatchMemberRsp> continuation);

    @GET("/api/transfer-product/transfer/getNoNetUssdBankList")
    @Nullable
    Object getNoNetUssdBankList(@NotNull Continuation<? super CommonListResultV2<BankInfo>> continuation);

    @POST("/api/transfer-product/transfer/getRecipientMemberLogOut")
    @Nullable
    Object getRecipientMemberLogOut(@Body @NotNull RecipientMemberLogoutReq recipientMemberLogoutReq, @NotNull Continuation<? super CommonBeanResult<RecipientMemberLogOutResp>> continuation);

    @GET("/api/transfer-product/schedule/transfer/getScheduleBefore")
    @Nullable
    Object getScheduleBefore(@NotNull Continuation<? super CommonBeanResult<ScheduleBeforeResp>> continuation);

    @GET("api/cfront/offline/merchant/getShopNameByQrCode")
    @Nullable
    Object getShopNameByQrCode(@NotNull @Query("qrCode") String str, @NotNull Continuation<? super QueryShopNameByQrCodeResp> continuation);

    @GET("/api/transfer-product/transfer/getTransToBankTopTabInfo")
    @Nullable
    Object getTransToBankTopTabInfo(@NotNull Continuation<? super CommonBeanResult<ToBankConfigResp>> continuation);

    @GET("/api/transfer-product/transfer/getTransferBizConfig")
    @NotNull
    d<CommonBeanResult<TransferBizConfigResp>> getTransferBizConfig();

    @GET("/api/transfer-product/poster/handleCashBackLabel")
    @Nullable
    Object handleCashBackLabel(@Nullable @Query("mappingAccountNo") String str, @NotNull Continuation<? super CommonBeanResult<String>> continuation);

    @GET("/api/transfer-product/bank/beneficiary/getHomeBankRecipients")
    @Nullable
    Object matchBankRecipients(@NotNull Continuation<? super CommonListResultV2<MatchBankRecipientsResp>> continuation);

    @GET("/api/transfer-product/phone/beneficiary/getHomePhoneRecipients")
    @Nullable
    Object matchPalmPayRecipients(@Nullable @Query("sourceType") Integer num, @NotNull Continuation<? super CommonListResultV2<MatchPalmPayRecipientsResp>> continuation);

    @POST("/api/cfront/sendMoney/analysisCodeSendMoney")
    @Nullable
    Object parseQrcodeData(@Body @NotNull AnalysisCodeSendMoneyReq analysisCodeSendMoneyReq, @NotNull Continuation<? super QrcodeParseResp> continuation);

    @GET("/api/cfront/basic-data/selectTransferBank")
    @Nullable
    Object queryAllBankList(@NotNull @Query(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) String str, @NotNull Continuation<? super AllBankListResp> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/transfer-product/transfer/getTransferBankList")
    Object queryAllBankListForToBank(@Field("sourceType") int i7, @Field("bankAccNo") @Nullable String str, @NotNull Continuation<? super AllBankListResp> continuation);

    @POST("/api/cfront/sendMoney/v3/sendmoeny/config")
    @Nullable
    Object queryBalanceAndLimitMvvm(@Body @NotNull ConfigReq configReq, @NotNull Continuation<? super BalanceAndLimitResp> continuation);

    @POST("/api/transfer-product/bank/beneficiary/queryBankRecipients")
    @Nullable
    Object queryBankAllRecipients(@Body @Nullable TransferToBankHomeRecipientsReq transferToBankHomeRecipientsReq, @NotNull Continuation<? super RecipientListResp> continuation);

    @POST("/api/transfer-product/bank/beneficiary/queryBankFavorites")
    @Nullable
    Object queryBankFavoriteRecipients(@Body @Nullable CommonListReq commonListReq, @NotNull Continuation<? super RecipientListResp> continuation);

    @GET("/api/transfer-product/bank/beneficiary/queryBankNoFavoriteRecipients")
    @Nullable
    Object queryBankNoFavoriteRecipients(@NotNull Continuation<? super CommonListResultV2<AddFromContactListResp>> continuation);

    @POST("/api/transfer-product/bank/beneficiary/queryBankRecipientsByBankCode")
    @Nullable
    Object queryBankRecipientsByBankCode(@Body @Nullable BeneficiaryByBankCodeReq beneficiaryByBankCodeReq, @NotNull Continuation<? super RecipientListResp> continuation);

    @GET("/api/transfer-product/poster/queryClaimSlipOrder")
    @Nullable
    Object queryCompensationOrderDetailMvvm(@Nullable @Query("orderNo") String str, @NotNull Continuation<? super CommonBeanResult<CompensationDetailResp>> continuation);

    @POST("/api/wallet-bff-product/toastFatigue/queryToast")
    @Nullable
    Object queryDialogConfig(@Body @Nullable DialogConfigSettingsReq dialogConfigSettingsReq, @NotNull Continuation<? super CommonBeanResult<DialogConfigSettingsResp>> continuation);

    @GET("/api/transfer-product/bank/beneficiary/queryRecentlyBankFavorite")
    @Nullable
    Object queryHomeBankFavoriteRecipients(@NotNull Continuation<? super RecipientListResp> continuation);

    @GET("/api/transfer-product/bank/beneficiary/queryRecentlyBankRecipient")
    @Nullable
    Object queryHomeBankRecentlyRecipients(@NotNull Continuation<? super RecipientListResp> continuation);

    @POST("/api/transfer-product/phone/queryRecentlyLocalPhoneRecipients")
    @Nullable
    Object queryLocalContactsList(@Body @Nullable LocalContactReq localContactReq, @NotNull Continuation<? super LocalContactsResp> continuation);

    @POST("/api/transfer-product/transfer/getMatchTransferBankList")
    @Nullable
    Object queryMatchedBank(@Body @Nullable MatchBankReq matchBankReq, @NotNull Continuation<? super QueryBankListRsp> continuation);

    @POST("/api/transfer-product/transfer/queryMemberVoDetail")
    @Nullable
    Object queryMemberDetail(@Body @Nullable MemberDetailReq memberDetailReq, @NotNull Continuation<? super CommonBeanResult<MemberDetailResp>> continuation);

    @POST("/api/cfront/member/queryMemberByKeword")
    @NotNull
    d<QueryMemberByKeywordResp> queryMemberDetailByKeyWords(@Body @NotNull QueryMemberDetailReq req);

    @POST("/api/cfront/member/queryMemberDetail")
    @NotNull
    d<QueryMemberDetailResp> queryMemberDetailByPhone(@Body @NotNull QueryMemberDetailReq req);

    @POST("/api/cfront/member/queryNoticeFlagByMemberIds")
    @Nullable
    Object queryNotificationEmailMvvm(@NotNull Continuation<? super CommonBeanResult<List<NotificationEmailResp>>> continuation);

    @GET("/api/transfer-product/phone/queryRecentlyPhoneFavorite")
    @Nullable
    Object queryPalmPayFavoriteList(@NotNull Continuation<? super RecipientResp> continuation);

    @GET("/api/transfer-product/phone/queryRecentlyPhoneRecipient")
    @Nullable
    Object queryPalmPayRecentlyList(@Nullable @Query("sourceType") Integer num, @NotNull Continuation<? super RecipientResp> continuation);

    @POST("/api/cashier/pay/queryPayRlt")
    @Nullable
    Object queryPayResult(@Body @Nullable CheckPayReq checkPayReq, @NotNull Continuation<? super CheckPayResp> continuation);

    @GET("/api/transfer-product/phone/beneficiary/queryPhoneNoFavoriteRecipients")
    @Nullable
    Object queryPhoneNoFavoriteRecipients(@NotNull Continuation<? super CommonListResultV2<AddFromContactListResp>> continuation);

    @GET("/api/transfer-product/poster/queryPosterAccountByMemberId")
    @Nullable
    Object queryPosterAccount(@NotNull Continuation<? super PosterAccountResp> continuation);

    @GET("/api/transfer-product/transfer/getTransferReceiptConfig")
    @Nullable
    Object queryReceiptType(@NotNull Continuation<? super CommonBeanResult<TransReceiptTypeResp>> continuation);

    @GET("/api/transfer-product/recipient/queryRecipientLabel")
    @Nullable
    Object queryRecipientLabel(@Nullable @Query("sourceType") Integer num, @NotNull Continuation<? super CommonBeanResult<AddFavoriteRelationshipBean>> continuation);

    @POST("/api/transfer-product/recipient/queryRecipientMemberInfo")
    @NotNull
    d<QueryRecipientMemberInfoResp> queryRecipientMemberInfo(@Body @NotNull QueryRecipientMemberInfoReq req);

    @POST("/api/transfer-product/recipient/queryRecipientMemberInfo")
    @Nullable
    Object queryRecipientMemberInfo(@Body @Nullable QueryRecipientMemberInfoReq queryRecipientMemberInfoReq, @NotNull Continuation<? super QueryRecipientMemberInfoResp> continuation);

    @GET("/api/transfer-product/recipient/queryRecipientRelationshipEnum")
    @NotNull
    d<QueryRecipientRelationshipListResp> queryRecipientRelationshipList();

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/sendMoney/queryRecipient")
    @NotNull
    d<RecipientListResp> queryRecipients(@Body @NotNull QueryRecipientReq req);

    @GET("/api/cfront/sendMoney/query/one/memberId")
    @NotNull
    d<RecipientDetailResp> queryRecipients(@NotNull @Query("recipientMemberId") String recipientMemberId);

    @GET("/api/transfer-product/recipient/queryPhoneRecipient")
    @NotNull
    d<RecipientListResp> queryRecipientsV2(@NotNull @Query("param") String req);

    @GET("/api/transfer-product/transfer/querytransferOrderDetail")
    @Nullable
    Object queryRecordOrderDetailMvvm(@Nullable @Query("orderId") String str, @NotNull Continuation<? super TradeRecordDetailResp> continuation);

    @GET("/api/transfer-product/schedule/transfer/scheduleTaskDetail")
    @Nullable
    Object queryScheduleTaskDetail(@Nullable @Query("taskNo") String str, @NotNull Continuation<? super CommonBeanResult<ScheduleTransferOrderResp>> continuation);

    @POST("/api/transfer-product/schedule/transfer/scheduleTransferHome")
    @Nullable
    Object queryScheduleTransferHome(@NotNull Continuation<? super CommonBeanResult<ScheduleTransferHomeResp>> continuation);

    @POST("/api/transfer-product/schedule/transfer/queryEndTask")
    @Nullable
    Object queryScheduleTransferList(@Body @Nullable CommonListReq commonListReq, @NotNull Continuation<? super CommonListResultV2<ScheduleTransferOrderResp>> continuation);

    @POST("/api/transfer-product/schedule/transfer/queryRunningTask")
    @Nullable
    Object queryScheduleTransferRunningList(@NotNull Continuation<? super CommonListResultV2<ScheduleTransferOrderResp>> continuation);

    @POST("/api/transfer-product/schedule/transfer/queryScheduleDetailPageTransferRecord")
    @Nullable
    Object queryScheduleTransferSubOrderListV2(@Body @Nullable ScheduleTransferSubOrderListReq scheduleTransferSubOrderListReq, @NotNull Continuation<? super CommonBeanResult<ScheduleTransferDetailOrderResp>> continuation);

    @POST("/api/transfer-product/phone/beneficiary/queryPhoneRecipients")
    @Nullable
    Object queryToPalmPayAllRecipients(@Body @Nullable ToPalmPayBeneficiaryReq toPalmPayBeneficiaryReq, @NotNull Continuation<? super CommonListResult<RecipientBeanV2>> continuation);

    @GET("/api/transfer-product/phone/getPhoneRecipientIndexInfo")
    @Nullable
    Object queryToPalmPayConfig(@NotNull Continuation<? super CommonBeanResult<TransferToPalmPayHomeConfigResp>> continuation);

    @POST("/api/transfer-product/phone/beneficiary/queryPhoneFavorites")
    @Nullable
    Object queryToPalmPayFavoriteRecipients(@Body @Nullable CommonListReq commonListReq, @NotNull Continuation<? super CommonListResult<RecipientBeanV2>> continuation);

    @POST("/api/transfer-product/phone/beneficiary/queryLocalPhoneRecipients")
    @Nullable
    Object queryToPalmPayLocalContactRecipients(@Body @Nullable CommonListReq commonListReq, @NotNull Continuation<? super CommonListResult<LocalContactsResp.LocalContactBean>> continuation);

    @POST("/api/online-agent-product/order/history/page/link")
    @Nullable
    Object queryTransactionLink(@Body @NotNull TransactionHistoryLinkReq transactionHistoryLinkReq, @NotNull Continuation<? super CommonBeanResult<ArrayList<String>>> continuation);

    @GET("/api/transfer-product/transfer/setting/queryLimitSetting")
    @Nullable
    Object queryTransferLimitSetting(@NotNull Continuation<? super CommonBeanResult<TransferLimitSettingResp>> continuation);

    @POST("/api/cfront/sendMoney/transferList")
    @NotNull
    d<QueryRecordResp> queryTransferRecord(@Body @NotNull QueryRecordReq req);

    @GET("/api/transfer-product/poster/queryMemberLabelInfo")
    @Nullable
    Object queryVoiceNotify(@NotNull Continuation<? super CommonBeanResult<VoiceNotifyResp>> continuation);

    @GET("/api/transfer-product/recipient/removeTransferRecipient")
    @Nullable
    Object removeTransferRecipient(@Nullable @Query("recipientType") Integer num, @Nullable @Query("relationId") String str, @NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/transfer-product/transfer/setting/saveLimitSetting")
    @Nullable
    Object saveTransferLimitSetting(@Body @NotNull SaveTransferLimitSettingReq saveTransferLimitSettingReq, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/transfer-product/transfer/searchPpAccount")
    Object searchPpAccount(@Field("keyWord") @Nullable String str, @Field("existRecipient") @Nullable Boolean bool, @NotNull Continuation<? super CommonBeanResult<SearchPalmPayAccountResp>> continuation);

    @POST("/api/transfer-product/transfer/inputAmountBankEntrance")
    @Nullable
    Object showTransferEntrance(@Body @Nullable TransferBankEntranceReq transferBankEntranceReq, @NotNull Continuation<? super CommonListResultV2<ScheduleTransferEntranceResp>> continuation);

    @POST("/api/transfer-product/transfer/inputAmountPpEntrance")
    @Nullable
    Object showTransferEntrance(@Body @Nullable TransferPalmPayEntranceReq transferPalmPayEntranceReq, @NotNull Continuation<? super CommonListResultV2<ScheduleTransferEntranceResp>> continuation);

    @POST("/api/transfer-product/transfer/strangerCheck")
    @Nullable
    Object strangerCheckV2(@Body @Nullable VerifyPaymentInfoReq verifyPaymentInfoReq, @NotNull Continuation<? super VerifyPaymentInfoRsp> continuation);

    @GET("/api/transfer-product/transfer/transferShortcutSwitch")
    @Nullable
    Object transferShortcutSwitch(@NotNull Continuation<? super CommonBeanResult<Boolean>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/finance-saving-product/autoTransfer/update")
    Object updateAutoTransferConfig(@Field("isAutoTransfer") int i7, @Field("source") @NotNull String str, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/transfer-product/bank/beneficiary/updateBankFavorite")
    Object updateFavoriteMvvm(@Field("favorite") boolean z3, @Field("relationId") @Nullable String str, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/transfer-product/phone/beneficiary/updatePhoneFavorite")
    Object updateFavoriteRecipient(@Field("favorite") boolean z3, @Field("relationId") @Nullable String str, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/cfront/member/updateNoticeFlag")
    Object updateNotificationEmailMvvm(@Field("noticeFlag") boolean z3, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/transfer-product/poster/markMemberLabel")
    Object voiceNotify(@Field("status") @Nullable Integer num, @NotNull Continuation<? super CommonBeanResult<PosterAccountResp>> continuation);
}
