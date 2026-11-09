package com.transsnet.palmpay.send_money.bean.resp;

import com.google.android.gms.common.Scopes;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b6\n\u0002\u0010\t\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001e\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00103\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR\u001c\u00106\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR\u001c\u00109\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR\u001c\u0010<\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR\u001c\u0010?\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\tR\u001c\u0010B\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR\u001c\u0010E\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR\u001c\u0010H\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR\u001e\u0010K\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\bL\u0010\u0010\"\u0004\bM\u0010\u0012R\u001c\u0010N\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0007\"\u0004\bP\u0010\tR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0007\"\u0004\bS\u0010\tR\u001c\u0010T\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0007\"\u0004\bV\u0010\tR\u001e\u0010W\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\bX\u0010/\"\u0004\bY\u00101R\u001e\u0010Z\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b[\u0010\u0010\"\u0004\b\\\u0010\u0012R\u001c\u0010]\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0007\"\u0004\b_\u0010\tR\u001e\u0010`\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\ba\u0010/\"\u0004\bb\u00101R\u001e\u0010c\u001a\u0004\u0018\u00010dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010i\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001a\u0010j\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001c\u0010o\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0007\"\u0004\bq\u0010\tR\u001c\u0010r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0007\"\u0004\bt\u0010\tR\u001c\u0010u\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0007\"\u0004\bw\u0010\tR\u001c\u0010x\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0007\"\u0004\bz\u0010\tR\u001e\u0010{\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b|\u0010/\"\u0004\b}\u00101¨\u0006~"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/MemberDetailResp;", "", "<init>", "()V", "accountNo", "", "getAccountNo", "()Ljava/lang/String;", "setAccountNo", "(Ljava/lang/String;)V", "accountTierTips", "getAccountTierTips", "setAccountTierTips", "agent", "", "getAgent", "()Ljava/lang/Boolean;", "setAgent", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "agentMemberId", "getAgentMemberId", "setAgentMemberId", "authen", "getAuthen", "setAuthen", "birthday", "getBirthday", "setBirthday", "cardNo", "getCardNo", "setCardNo", Scopes.EMAIL, "getEmail", "setEmail", "facebookName", "getFacebookName", "setFacebookName", "firstName", "getFirstName", "setFirstName", "fullName", "getFullName", "setFullName", "gender", "", "getGender", "()Ljava/lang/Integer;", "setGender", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "headPortrait", "getHeadPortrait", "setHeadPortrait", "compensatePic", "getCompensatePic", "setCompensatePic", "lastName", "getLastName", "setLastName", "memberId", "getMemberId", "setMemberId", "memberName", "getMemberName", "setMemberName", "middleName", "getMiddleName", "setMiddleName", "mobileMoneyAccountTier", "getMobileMoneyAccountTier", "setMobileMoneyAccountTier", "nickName", "getNickName", "setNickName", "owner", "getOwner", "setOwner", "palmPayTag", "getPalmPayTag", "setPalmPayTag", "partnerAccountNo", "getPartnerAccountNo", "setPartnerAccountNo", "phone", "getPhone", "setPhone", "svaStatus", "getSvaStatus", "setSvaStatus", "hasFavorite", "getHasFavorite", "setHasFavorite", "userEmail", "getUserEmail", "setUserEmail", "payeeAccountType", "getPayeeAccountType", "setPayeeAccountType", "createTime", "", "getCreateTime", "()Ljava/lang/Long;", "setCreateTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "relationship", "getRelationship", "()I", "setRelationship", "(I)V", "relationshipDarkPic", "getRelationshipDarkPic", "setRelationshipDarkPic", "relationshipPic", "getRelationshipPic", "setRelationshipPic", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "setLabel", "ppAccountNo", "getPpAccountNo", "setPpAccountNo", "recipientTradeStatus", "getRecipientTradeStatus", "setRecipientTradeStatus", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MemberDetailResp {

    @Nullable
    private String accountNo;

    @Nullable
    private String accountTierTips;

    @Nullable
    private Boolean agent;

    @Nullable
    private String agentMemberId;

    @Nullable
    private Boolean authen;

    @Nullable
    private String birthday;

    @Nullable
    private String cardNo;

    @Nullable
    private String compensatePic;

    @Nullable
    private Long createTime;

    @Nullable
    private String email;

    @Nullable
    private String facebookName;

    @Nullable
    private String firstName;

    @Nullable
    private String fullName;

    @Nullable
    private Integer gender;

    @Nullable
    private Boolean hasFavorite;

    @Nullable
    private String headPortrait;

    @Nullable
    private String label;

    @Nullable
    private String lastName;

    @Nullable
    private String memberId;

    @Nullable
    private String memberName;

    @Nullable
    private String middleName;

    @Nullable
    private String mobileMoneyAccountTier;

    @Nullable
    private String nickName;

    @Nullable
    private Boolean owner;

    @Nullable
    private String palmPayTag;

    @Nullable
    private String partnerAccountNo;

    @Nullable
    private Integer payeeAccountType;

    @Nullable
    private String phone;

    @Nullable
    private String ppAccountNo;

    @Nullable
    private Integer recipientTradeStatus;
    private int relationship = -1;

    @Nullable
    private String relationshipDarkPic;

    @Nullable
    private String relationshipPic;

    @Nullable
    private Integer svaStatus;

    @Nullable
    private String userEmail;

    @Nullable
    public final String getAccountNo() {
        return this.accountNo;
    }

    @Nullable
    public final String getAccountTierTips() {
        return this.accountTierTips;
    }

    @Nullable
    public final Boolean getAgent() {
        return this.agent;
    }

    @Nullable
    public final String getAgentMemberId() {
        return this.agentMemberId;
    }

    @Nullable
    public final Boolean getAuthen() {
        return this.authen;
    }

    @Nullable
    public final String getBirthday() {
        return this.birthday;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final String getCompensatePic() {
        return this.compensatePic;
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getFacebookName() {
        return this.facebookName;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final Integer getGender() {
        return this.gender;
    }

    @Nullable
    public final Boolean getHasFavorite() {
        return this.hasFavorite;
    }

    @Nullable
    public final String getHeadPortrait() {
        return this.headPortrait;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final String getMemberName() {
        return this.memberName;
    }

    @Nullable
    public final String getMiddleName() {
        return this.middleName;
    }

    @Nullable
    public final String getMobileMoneyAccountTier() {
        return this.mobileMoneyAccountTier;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final Boolean getOwner() {
        return this.owner;
    }

    @Nullable
    public final String getPalmPayTag() {
        return this.palmPayTag;
    }

    @Nullable
    public final String getPartnerAccountNo() {
        return this.partnerAccountNo;
    }

    @Nullable
    public final Integer getPayeeAccountType() {
        return this.payeeAccountType;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getPpAccountNo() {
        return this.ppAccountNo;
    }

    @Nullable
    public final Integer getRecipientTradeStatus() {
        return this.recipientTradeStatus;
    }

    public final int getRelationship() {
        return this.relationship;
    }

    @Nullable
    public final String getRelationshipDarkPic() {
        return this.relationshipDarkPic;
    }

    @Nullable
    public final String getRelationshipPic() {
        return this.relationshipPic;
    }

    @Nullable
    public final Integer getSvaStatus() {
        return this.svaStatus;
    }

    @Nullable
    public final String getUserEmail() {
        return this.userEmail;
    }

    public final void setAccountNo(@Nullable String str) {
        this.accountNo = str;
    }

    public final void setAccountTierTips(@Nullable String str) {
        this.accountTierTips = str;
    }

    public final void setAgent(@Nullable Boolean bool) {
        this.agent = bool;
    }

    public final void setAgentMemberId(@Nullable String str) {
        this.agentMemberId = str;
    }

    public final void setAuthen(@Nullable Boolean bool) {
        this.authen = bool;
    }

    public final void setBirthday(@Nullable String str) {
        this.birthday = str;
    }

    public final void setCardNo(@Nullable String str) {
        this.cardNo = str;
    }

    public final void setCompensatePic(@Nullable String str) {
        this.compensatePic = str;
    }

    public final void setCreateTime(@Nullable Long l5) {
        this.createTime = l5;
    }

    public final void setEmail(@Nullable String str) {
        this.email = str;
    }

    public final void setFacebookName(@Nullable String str) {
        this.facebookName = str;
    }

    public final void setFirstName(@Nullable String str) {
        this.firstName = str;
    }

    public final void setFullName(@Nullable String str) {
        this.fullName = str;
    }

    public final void setGender(@Nullable Integer num) {
        this.gender = num;
    }

    public final void setHasFavorite(@Nullable Boolean bool) {
        this.hasFavorite = bool;
    }

    public final void setHeadPortrait(@Nullable String str) {
        this.headPortrait = str;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setLastName(@Nullable String str) {
        this.lastName = str;
    }

    public final void setMemberId(@Nullable String str) {
        this.memberId = str;
    }

    public final void setMemberName(@Nullable String str) {
        this.memberName = str;
    }

    public final void setMiddleName(@Nullable String str) {
        this.middleName = str;
    }

    public final void setMobileMoneyAccountTier(@Nullable String str) {
        this.mobileMoneyAccountTier = str;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    public final void setOwner(@Nullable Boolean bool) {
        this.owner = bool;
    }

    public final void setPalmPayTag(@Nullable String str) {
        this.palmPayTag = str;
    }

    public final void setPartnerAccountNo(@Nullable String str) {
        this.partnerAccountNo = str;
    }

    public final void setPayeeAccountType(@Nullable Integer num) {
        this.payeeAccountType = num;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setPpAccountNo(@Nullable String str) {
        this.ppAccountNo = str;
    }

    public final void setRecipientTradeStatus(@Nullable Integer num) {
        this.recipientTradeStatus = num;
    }

    public final void setRelationship(int i7) {
        this.relationship = i7;
    }

    public final void setRelationshipDarkPic(@Nullable String str) {
        this.relationshipDarkPic = str;
    }

    public final void setRelationshipPic(@Nullable String str) {
        this.relationshipPic = str;
    }

    public final void setSvaStatus(@Nullable Integer num) {
        this.svaStatus = num;
    }

    public final void setUserEmail(@Nullable String str) {
        this.userEmail = str;
    }
}
