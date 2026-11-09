package com.transsnet.palmpay.core.network.api;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.MemberInfo;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.bean.req.MemberLabelReq;
import com.transsnet.palmpay.core.bean.req.QueryContactReq;
import com.transsnet.palmpay.core.bean.rsp.InvitationCodeResp;
import com.transsnet.palmpay.core.bean.rsp.MemberQRCodeScanResp;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactQueryResp;
import com.transsnet.palmpay.core.bean.rsp.QueryAddEmailGuideConfigRsp;
import com.transsnet.palmpay.core.bean.update.AppUpdate;
import com.transsnet.palmpay.core.bean.update.QueryAppUpdate;
import com.transsnet.palmpay.core.network.annotation.JsonName;
import df.d;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u0007H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH§@¢\u0006\u0004\b\u0011\u0010\u0004J\u001c\u0010\u0015\u001a\u00020\u00142\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u0004J\u001c\u0010\u001f\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001dH§@¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b!\u0010 J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\bH§@¢\u0006\u0004\b#\u0010\u0004J(\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\b2\u0010\b\u0001\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$H§@¢\u0006\u0004\b'\u0010(J \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\b2\b\b\u0001\u0010*\u001a\u00020)H§@¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/transsnet/palmpay/core/network/api/MemberApiService;", "", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "logout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryAccountId", "Ldf/d;", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/core/bean/MemberInfo;", "queryCurMemberInfo", "(Z)Ldf/d;", "queryCurMemberInfoMvvm", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/rsp/InvitationCodeResp;", "queryInvitationCode", "()Ldf/d;", "queryInvitationCodeNew", "", GetCustomerServiceUrlReq.ENTER_TYPE_QRCODE, "Lcom/transsnet/palmpay/core/bean/rsp/MemberQRCodeScanResp;", "analysisMemberQrCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/QueryContactReq;", "body", "Lcom/transsnet/palmpay/core/bean/rsp/PalmPayContactQueryResp;", "queryMemberContact", "(Lcom/transsnet/palmpay/core/bean/req/QueryContactReq;)Ldf/d;", "checkUpdateNameLimit", "Lcom/transsnet/palmpay/core/bean/req/MemberLabelReq;", "req", "markMemberLabel", "(Lcom/transsnet/palmpay/core/bean/req/MemberLabelReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryMemberLabelInfo", "Lcom/transsnet/palmpay/core/bean/update/AppUpdate$VersionBean;", "getAppUpdateInfo", "", "codes", "Lcom/transsnet/palmpay/core/bean/update/QueryAppUpdate;", "queryAppConfig", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sceneCode", "Lcom/transsnet/palmpay/core/bean/rsp/QueryAddEmailGuideConfigRsp;", "queryAddEmailGuideConfig", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MemberApiService {
    @GET("/api/cfront/member/analysisMemberQrCode")
    @Nullable
    Object analysisMemberQrCode(@Nullable @Query("memberQrCodeUrl") String str, @NotNull Continuation<? super MemberQRCodeScanResp> continuation);

    @POST("/api/cfront/member/checkUpdateNameLimit")
    @Nullable
    Object checkUpdateNameLimit(@NotNull Continuation<? super CommonResult> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/c-bff-product/startAppBasic/appUpdateInfo")
    @Nullable
    Object getAppUpdateInfo(@NotNull Continuation<? super CommonBeanResult<AppUpdate.VersionBean>> continuation);

    @POST("/api/cfront/member/logout")
    @Nullable
    Object logout(@NotNull Continuation<? super CommonResult> continuation);

    @POST("/api/member/label/markMemberLabel")
    @Nullable
    Object markMemberLabel(@Body @Nullable MemberLabelReq memberLabelReq, @NotNull Continuation<? super CommonResult> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Convert-Form-Data: yes"})
    @POST("/api/c-bff-product/member/emailGuideAddPop")
    Object queryAddEmailGuideConfig(@Field("sceneCode") int i7, @NotNull Continuation<? super CommonBeanResult<QueryAddEmailGuideConfigRsp>> continuation);

    @Headers({"No-Token: yes"})
    @GET("/api/c-bff-product/startAppBasic/queryAppConfig")
    @Nullable
    Object queryAppConfig(@Nullable @Query("codes") List<String> list, @NotNull Continuation<? super CommonBeanResult<QueryAppUpdate>> continuation);

    @POST("/api/cfront/member/getMemberDetailInfo")
    @NotNull
    d<CommonBeanResult<MemberInfo>> queryCurMemberInfo(@Body @JsonName("queryAccountId") boolean queryAccountId);

    @POST("/api/cfront/member/getMemberDetailInfo")
    @Nullable
    Object queryCurMemberInfoMvvm(@Body @JsonName("queryAccountId") boolean z3, @NotNull Continuation<? super CommonBeanResult<MemberInfo>> continuation);

    @POST("/api/cfront/member/queryInvitQrCode")
    @NotNull
    d<CommonBeanResult<InvitationCodeResp>> queryInvitationCode();

    @POST("/api/cfront/member/queryInvitQrCode")
    @Nullable
    Object queryInvitationCodeNew(@NotNull Continuation<? super CommonBeanResult<InvitationCodeResp>> continuation);

    @POST("/api/cfront/member/contacts/queryMemberContacts")
    @NotNull
    d<PalmPayContactQueryResp> queryMemberContact(@Body @Nullable QueryContactReq body);

    @POST("/api/member/label/queryMemberLabelInfo")
    @Nullable
    Object queryMemberLabelInfo(@Body @NotNull MemberLabelReq memberLabelReq, @NotNull Continuation<? super CommonBeanResult<MemberLabelReq>> continuation);
}
