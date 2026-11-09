package com.transsnet.palmpay.contacts.api;

import com.transsnet.palmpay.contacts.bean.req.AcceptContactReq;
import com.transsnet.palmpay.contacts.bean.req.AddRelationShipReq;
import com.transsnet.palmpay.contacts.bean.req.MobileContactReq;
import com.transsnet.palmpay.contacts.bean.req.QueryLastRelationShipReq;
import com.transsnet.palmpay.contacts.bean.req.QueryPhonesBean;
import com.transsnet.palmpay.contacts.bean.req.QueryRelationshipLogListReq;
import com.transsnet.palmpay.contacts.bean.req.UpdateContactReq;
import com.transsnet.palmpay.contacts.bean.resp.CheckUserByNumberRsp;
import com.transsnet.palmpay.contacts.bean.resp.MemberQRCode;
import com.transsnet.palmpay.contacts.bean.resp.QueryPhonesResp;
import com.transsnet.palmpay.contacts.bean.resp.QueryRecipientRelationshipListResp;
import com.transsnet.palmpay.contacts.bean.resp.QueryRelationShipResp;
import com.transsnet.palmpay.contacts.bean.resp.QueryRelationshipListResp;
import com.transsnet.palmpay.contacts.bean.resp.RelationShipLogListResp;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.QueryFamilyAccountRspV2;
import com.transsnet.palmpay.core.bean.req.AddContactReq;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontBatchReq;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.bean.req.DeleteFamilyAccontReq;
import com.transsnet.palmpay.core.bean.req.QueryFamilyAccountReq;
import com.transsnet.palmpay.core.bean.rsp.MobileContactListResp;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactListResp;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactQueryResp;
import com.transsnet.palmpay.core.network.annotation.JsonName;
import df.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010H'¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0011H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004H'¢\u0006\u0004\b\u001c\u0010\nJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010\u0003\u001a\u00020 H'¢\u0006\u0004\b\"\u0010#J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0013\b\u0001\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020$0\u0010¢\u0006\u0002\b%H'¢\u0006\u0004\b&\u0010\u0014J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0003\u001a\u00020'H'¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00182\b\b\u0001\u0010+\u001a\u00020*H§@¢\u0006\u0004\b,\u0010-J\u001a\u0010.\u001a\u00020\u00182\b\b\u0001\u0010+\u001a\u00020*H§@¢\u0006\u0004\b.\u0010-J \u00101\u001a\b\u0012\u0004\u0012\u0002000/2\b\b\u0001\u0010+\u001a\u00020*H§@¢\u0006\u0004\b1\u0010-J \u00101\u001a\b\u0012\u0004\u0012\u0002000/2\b\b\u0001\u0010+\u001a\u000202H§@¢\u0006\u0004\b1\u00103J \u00104\u001a\b\u0012\u0004\u0012\u0002000/2\b\b\u0001\u0010+\u001a\u00020*H§@¢\u0006\u0004\b4\u0010-J\u001b\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206050\u0004H'¢\u0006\u0004\b7\u0010\nJ\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020805H§@¢\u0006\u0004\b9\u0010\fJ\"\u0010<\u001a\b\u0012\u0004\u0012\u00020;0/2\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020>H§@¢\u0006\u0004\b?\u0010@J \u0010C\u001a\b\u0012\u0004\u0012\u00020B0/2\b\b\u0001\u0010\u0003\u001a\u00020AH§@¢\u0006\u0004\bC\u0010DJ*\u0010I\u001a\u00020H2\u0018\b\u0001\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020F0Ej\b\u0012\u0004\u0012\u00020F`GH§@¢\u0006\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/transsnet/palmpay/contacts/api/ContactsApiService;", "", "Lcom/transsnet/palmpay/contacts/bean/req/AcceptContactReq;", "body", "Ldf/d;", "Lcom/transsnet/palmpay/core/bean/rsp/PalmPayContactQueryResp;", "acceptContact", "(Lcom/transsnet/palmpay/contacts/bean/req/AcceptContactReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/rsp/PalmPayContactListResp;", "queryMemberContactsList", "()Ldf/d;", "queryMemberContactsListNew", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/contacts/bean/req/UpdateContactReq;", "updateMemberContact", "(Lcom/transsnet/palmpay/contacts/bean/req/UpdateContactReq;)Ldf/d;", "", "", "Lcom/transsnet/palmpay/core/bean/rsp/MobileContactListResp;", "queryMobileContacts", "(Ljava/util/List;)Ldf/d;", "Lcom/transsnet/palmpay/contacts/bean/req/MobileContactReq;", "queryMobileAndPalmPayContacts", "memberId", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "deleteMemberContact", "(Ljava/lang/String;)Ldf/d;", "Lcom/transsnet/palmpay/contacts/bean/resp/MemberQRCode;", "createMemberQRCode", "Lcom/transsnet/palmpay/core/bean/req/AddFamilyAccontReq;", "updateFamilyAccount", "(Lcom/transsnet/palmpay/core/bean/req/AddFamilyAccontReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/QueryFamilyAccountReq;", "Lcom/transsnet/palmpay/core/bean/QueryFamilyAccountRspV2;", "queryFamilyAccountListV2", "(Lcom/transsnet/palmpay/core/bean/req/QueryFamilyAccountReq;)Ldf/d;", "Lcom/transsnet/palmpay/core/bean/req/DeleteFamilyAccontReq;", "Lkotlin/jvm/JvmSuppressWildcards;", "deleteFamilyAccountBatch", "Lcom/transsnet/palmpay/core/bean/req/AddFamilyAccontBatchReq;", "saveFamilyAccountBatch", "(Lcom/transsnet/palmpay/core/bean/req/AddFamilyAccontBatchReq;)Ldf/d;", "Lcom/transsnet/palmpay/contacts/bean/req/AddRelationShipReq;", "req", "addRelationShip", "(Lcom/transsnet/palmpay/contacts/bean/req/AddRelationShipReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRelationShip", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/contacts/bean/resp/QueryRelationShipResp;", "queryRelationShip", "Lcom/transsnet/palmpay/contacts/bean/req/QueryLastRelationShipReq;", "(Lcom/transsnet/palmpay/contacts/bean/req/QueryLastRelationShipReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRelationShip", "Lcom/transsnet/palmpay/core/bean/CommonListResultV2;", "Lcom/transsnet/palmpay/contacts/bean/resp/QueryRecipientRelationshipListResp;", "queryRecipientRelationshipEnumList", "Lcom/transsnet/palmpay/contacts/bean/resp/QueryRelationshipListResp;", "queryRecipientRelationshipList", "phone", "Lcom/transsnet/palmpay/contacts/bean/resp/CheckUserByNumberRsp;", "checkUserByNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/core/bean/req/AddContactReq;", "addContact", "(Lcom/transsnet/palmpay/core/bean/req/AddContactReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/palmpay/contacts/bean/req/QueryRelationshipLogListReq;", "Lcom/transsnet/palmpay/contacts/bean/resp/RelationShipLogListResp;", "queryRelationShipLog", "(Lcom/transsnet/palmpay/contacts/bean/req/QueryRelationshipLogListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/contacts/bean/req/QueryPhonesBean;", "Lkotlin/collections/ArrayList;", "Lcom/transsnet/palmpay/contacts/bean/resp/QueryPhonesResp;", "queryPhones", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ContactsApiService {
    @POST("/api/cfront/member/contacts/acceptMemberContacts")
    @NotNull
    d<PalmPayContactQueryResp> acceptContact(@Body @NotNull AcceptContactReq body);

    @POST("/api/cfront/member/contacts/addMemberContacts")
    @Nullable
    Object addContact(@Body @NotNull AddContactReq addContactReq, @NotNull Continuation<? super PalmPayContactQueryResp> continuation);

    @POST("/api/member/relationship/addMemberRelationship")
    @Nullable
    Object addRelationShip(@Body @NotNull AddRelationShipReq addRelationShipReq, @NotNull Continuation<? super CommonResult> continuation);

    @Headers({"No-Token: yes"})
    @POST("/api/cfront/startAppBasic/queryMemberSourceByPhone")
    @Nullable
    Object checkUserByNumber(@Body @JsonName("phone") @Nullable String str, @NotNull Continuation<? super CommonBeanResult<CheckUserByNumberRsp>> continuation);

    @GET("/api/cfront/member/createMemberQrCode")
    @NotNull
    d<MemberQRCode> createMemberQRCode();

    @POST("/api/cfront/airtime/v2/delete")
    @NotNull
    d<CommonResult> deleteFamilyAccountBatch(@Body @NotNull List<DeleteFamilyAccontReq> body);

    @POST("/api/cfront/member/contacts/deleteMemberContacts")
    @NotNull
    d<CommonResult> deleteMemberContact(@Body @JsonName("contactsMemberId") @NotNull String memberId);

    @POST("/api/member/relationship/deleteMemberRelationship")
    @Nullable
    Object deleteRelationShip(@Body @NotNull AddRelationShipReq addRelationShipReq, @NotNull Continuation<? super CommonBeanResult<QueryRelationShipResp>> continuation);

    @POST("/api/cfront/airtime/v2/queryFamilyAccount")
    @NotNull
    d<QueryFamilyAccountRspV2> queryFamilyAccountListV2(@Body @NotNull QueryFamilyAccountReq body);

    @GET("/api/cfront/member/contacts/queryMemberContactsList")
    @NotNull
    d<PalmPayContactListResp> queryMemberContactsList();

    @GET("/api/cfront/member/contacts/queryMemberContactsList")
    @Nullable
    Object queryMemberContactsListNew(@NotNull Continuation<? super PalmPayContactListResp> continuation);

    @POST("/api/cfront/member/contacts/queryMobileContactsAll")
    @NotNull
    d<MobileContactListResp> queryMobileAndPalmPayContacts(@Body @NotNull List<? extends MobileContactReq> body);

    @POST("/api/cfront/member/contacts/queryMobileContacts")
    @NotNull
    d<MobileContactListResp> queryMobileContacts(@Body @NotNull List<String> body);

    @POST("/api/marketing/incentive/query/checkByPhones")
    @Nullable
    Object queryPhones(@Body @NotNull ArrayList<QueryPhonesBean> arrayList, @NotNull Continuation<? super QueryPhonesResp> continuation);

    @GET("/api/transfer-product/recipient/queryRecipientRelationshipEnum")
    @NotNull
    d<CommonListResultV2<QueryRecipientRelationshipListResp>> queryRecipientRelationshipEnumList();

    @GET("/api/member/relationship/queryMemberRelationshipList")
    @Nullable
    Object queryRecipientRelationshipList(@NotNull Continuation<? super CommonListResultV2<QueryRelationshipListResp>> continuation);

    @POST("/api/member/relationship/queryMemberRelationship")
    @Nullable
    Object queryRelationShip(@Body @NotNull AddRelationShipReq addRelationShipReq, @NotNull Continuation<? super CommonBeanResult<QueryRelationShipResp>> continuation);

    @POST("/api/member/relationship/queryMemberRelationship")
    @Nullable
    Object queryRelationShip(@Body @NotNull QueryLastRelationShipReq queryLastRelationShipReq, @NotNull Continuation<? super CommonBeanResult<QueryRelationShipResp>> continuation);

    @POST("/api/member/relationship/queryMemberRelationshipLog")
    @Nullable
    Object queryRelationShipLog(@Body @NotNull QueryRelationshipLogListReq queryRelationshipLogListReq, @NotNull Continuation<? super CommonBeanResult<RelationShipLogListResp>> continuation);

    @POST("/api/cfront/airtime/v2/save")
    @NotNull
    d<CommonResult> saveFamilyAccountBatch(@Body @NotNull AddFamilyAccontBatchReq body);

    @POST("/api/cfront/airtime/updateFamilyAccount")
    @NotNull
    d<CommonResult> updateFamilyAccount(@Body @NotNull AddFamilyAccontReq body);

    @POST("/api/cfront/member/contacts/updateMemberContacts")
    @NotNull
    d<PalmPayContactQueryResp> updateMemberContact(@Body @NotNull UpdateContactReq body);

    @POST("/api/member/relationship/updateMemberRelationship")
    @Nullable
    Object updateRelationShip(@Body @NotNull AddRelationShipReq addRelationShipReq, @NotNull Continuation<? super CommonResult> continuation);
}
