package com.transsnet.palmpay.jara_packet.api;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.network.annotation.JsonName;
import com.transsnet.palmpay.jara_packet.bean.req.CommentReq;
import com.transsnet.palmpay.jara_packet.bean.resp.CommentResp;
import com.transsnet.palmpay.jara_packet.bean.resp.CommissionDetailsResp;
import com.transsnet.palmpay.jara_packet.bean.resp.RankListResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReInviteListResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnDetailsResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnHomeResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnOrderLatestResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnPersonalRankResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnPopResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecordsResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnResolveResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRewardsResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnWithDrawCreateResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnWithDrawHistoryResp;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH§@¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0005H§@¢\u0006\u0004\b\u000e\u0010\fJ6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0017\u0010\bJ\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005H§@¢\u0006\u0004\b\u0019\u0010\fJ&\u0010\u001d\u001a\u00020\u001c2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b \u0010!J/\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00050\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0010H'¢\u0006\u0004\b#\u0010$J3\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00050\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001aH'¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00050\u0004H'¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050\u0004H'¢\u0006\u0004\b,\u0010*J\"\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00052\n\b\u0001\u0010.\u001a\u0004\u0018\u00010-H§@¢\u0006\u0004\b0\u00101J/\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00050\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0010H'¢\u0006\u0004\b3\u0010$J\u0016\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0005H§@¢\u0006\u0004\b5\u0010\fJ\u001c\u00107\u001a\u00020\u001c2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u000106H§@¢\u0006\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/api/JaraPacketApiService;", "", "", "orderNo", "Ldf/d;", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/CommissionDetailsResp;", "queryCommissionDetails", "(Ljava/lang/String;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/CommonListResultV2;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnOrderLatestResp;", "queryReferEarnOrderLatest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnHomeResp;", "queryReferEarnHome", "id", "", "pageNum", "pageSize", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnRecordsResp;", "queryReferEarnRecords", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnRewardsResp;", "queryReferEarnRewards", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnPopResp;", "queryReferEarnPop", "", "skipValid", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "queryReferEarnWithDrawEnable", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnWithDrawCreateResp;", "referEarnWithDrawCreate", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnWithDrawHistoryResp;", "queryReferEarnWithDrawList", "(II)Ldf/d;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnDetailsResp;", "queryReferEarnById", "(Ljava/lang/String;Ljava/lang/Boolean;)Ldf/d;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnResolveResp;", "queryResolveConfig", "()Ldf/d;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnPersonalRankResp;", "queryPersonalRank", "Lcom/transsnet/palmpay/jara_packet/bean/req/CommentReq;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/jara_packet/bean/resp/CommentResp;", "queryComments", "(Lcom/transsnet/palmpay/jara_packet/bean/req/CommentReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/RankListResp;", "queryRankList", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReInviteListResp;", "queryReInviteList", "", "updateReInviteIsInvite", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface JaraPacketApiService {
    @POST("/api/cfront/comments/api/comment/queryComments")
    @Nullable
    Object queryComments(@Body @Nullable CommentReq commentReq, @NotNull Continuation<? super CommonBeanResult<CommentResp>> continuation);

    @GET("/api/cfront/palmpay/commission/queryPalmpayCommissionPayment")
    @NotNull
    d<CommonBeanResult<CommissionDetailsResp>> queryCommissionDetails(@Nullable @Query("orderNo") String orderNo);

    @GET("/api/cfront/referEarn/rank")
    @NotNull
    d<CommonBeanResult<ReferEarnPersonalRankResp>> queryPersonalRank();

    @GET("/api/cfront/referEarn/rankPage")
    @NotNull
    d<CommonBeanResult<RankListResp>> queryRankList(@Query("pageNum") int pageNum, @Query("pageSize") int pageSize);

    @GET("/api/social-product/re-invite/list")
    @Nullable
    Object queryReInviteList(@NotNull Continuation<? super CommonBeanResult<ReInviteListResp>> continuation);

    @GET("/api/cfront/referEarn/detail")
    @NotNull
    d<CommonBeanResult<ReferEarnDetailsResp>> queryReferEarnById(@Nullable @Query("id") String id2, @Nullable @Query("skipValid") Boolean skipValid);

    @GET("/api/cfront/referEarn/latest")
    @Nullable
    Object queryReferEarnHome(@NotNull Continuation<? super CommonBeanResult<ReferEarnHomeResp>> continuation);

    @GET("/api/cfront/referEarn/orders/latest")
    @Nullable
    Object queryReferEarnOrderLatest(@NotNull Continuation<? super CommonListResultV2<ReferEarnOrderLatestResp>> continuation);

    @GET("/api/cfront/referEarn/popups")
    @Nullable
    Object queryReferEarnPop(@NotNull Continuation<? super CommonBeanResult<ReferEarnPopResp>> continuation);

    @GET("/api/cfront/referEarn/records")
    @Nullable
    Object queryReferEarnRecords(@Nullable @Query("id") String str, @Query("pageNum") int i7, @Query("pageSize") int i10, @NotNull Continuation<? super CommonBeanResult<ReferEarnRecordsResp>> continuation);

    @GET("/api/cfront/referEarn/rewards")
    @NotNull
    d<CommonListResultV2<ReferEarnRewardsResp>> queryReferEarnRewards(@Nullable @Query("id") String id2);

    @GET("/api/cfront/referEarn/orders/enable")
    @Nullable
    Object queryReferEarnWithDrawEnable(@Nullable @Query("id") String str, @Query("skipValid") boolean z3, @NotNull Continuation<? super CommonResult> continuation);

    @GET("/api/cfront/referEarn/orders")
    @NotNull
    d<CommonBeanResult<ReferEarnWithDrawHistoryResp>> queryReferEarnWithDrawList(@Query("pageNum") int pageNum, @Query("pageSize") int pageSize);

    @GET("/api/cfront/referEarn/config")
    @NotNull
    d<CommonBeanResult<ReferEarnResolveResp>> queryResolveConfig();

    @Headers({"Black-Code: yes"})
    @POST("/api/cfront/referEarn/order/v2/create")
    @Nullable
    Object referEarnWithDrawCreate(@Body @JsonName("id") @Nullable String str, @NotNull Continuation<? super CommonBeanResult<ReferEarnWithDrawCreateResp>> continuation);

    @GET("/api/social-product/re-invite/updateIsInvite")
    @Nullable
    Object updateReInviteIsInvite(@Nullable @Query("id") Long l5, @NotNull Continuation<? super CommonResult> continuation);
}
