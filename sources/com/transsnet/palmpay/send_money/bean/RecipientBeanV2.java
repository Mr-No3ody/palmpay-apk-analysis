package com.transsnet.palmpay.send_money.bean;

import android.text.TextUtils;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.send_money.utils.OnSectionListener;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\b\"\u0004\b'\u0010\nR\u001c\u0010(\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010\nR\u001c\u0010+\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010\nR\u001c\u0010.\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\b\"\u0004\b0\u0010\nR\u001c\u00101\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\b\"\u0004\b3\u0010\nR\u001c\u00104\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\b\"\u0004\b6\u0010\nR\u001c\u00107\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\b\"\u0004\b9\u0010\nR\u001c\u0010:\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\b\"\u0004\b<\u0010\nR\u001c\u0010=\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\b\"\u0004\b?\u0010\nR\u001c\u0010@\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\b\"\u0004\bB\u0010\nR\u001c\u0010C\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\b\"\u0004\bE\u0010\nR\u001e\u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001c\u0010S\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\b\"\u0004\bU\u0010\nR\u0014\u0010V\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0016\u0010X\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\b¨\u0006Z"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/RecipientBeanV2;", "Lcom/chad/library/adapter/base/entity/SectionEntity;", "Lcom/transsnet/palmpay/send_money/utils/OnSectionListener;", "<init>", "()V", "relationId", "", "getRelationId", "()Ljava/lang/String;", "setRelationId", "(Ljava/lang/String;)V", "memberId", "getMemberId", "setMemberId", "phone", "getPhone", "setPhone", "businessType", "", "getBusinessType", "()Ljava/lang/Integer;", "setBusinessType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "headPortrait", "getHeadPortrait", "setHeadPortrait", "fullName", "getFullName", "setFullName", "favorite", "", "getFavorite", "()Ljava/lang/Boolean;", "setFavorite", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "accountNo", "getAccountNo", "setAccountNo", "accountMark", "getAccountMark", "setAccountMark", "darkAccountMark", "getDarkAccountMark", "setDarkAccountMark", "transType", "getTransType", "setTransType", "palmPayTag", "getPalmPayTag", "setPalmPayTag", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "setLabel", "relationshipPic", "getRelationshipPic", "setRelationshipPic", "relationshipDarkPic", "getRelationshipDarkPic", "setRelationshipDarkPic", "toFavoriteTip", "getToFavoriteTip", "setToFavoriteTip", "ppAccountNo", "getPpAccountNo", "setPpAccountNo", "orderTimeDesc", "getOrderTimeDesc", "setOrderTimeDesc", "orderTime", "", "getOrderTime", "()Ljava/lang/Long;", "setOrderTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "invite", "Lcom/transsnet/palmpay/send_money/bean/InviteBean;", "getInvite", "()Lcom/transsnet/palmpay/send_money/bean/InviteBean;", "setInvite", "(Lcom/transsnet/palmpay/send_money/bean/InviteBean;)V", "header", "getHeader", "setHeader", "isHeader", "()Z", "section", "getSection", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RecipientBeanV2 implements SectionEntity, OnSectionListener {

    @Nullable
    private String accountMark;

    @Nullable
    private String accountNo;

    @Nullable
    private Integer businessType;

    @Nullable
    private String darkAccountMark;

    @Nullable
    private Boolean favorite;

    @Nullable
    private String fullName;

    @Nullable
    private String headPortrait;

    @Nullable
    private String header;

    @Nullable
    private InviteBean invite;

    @Nullable
    private String label;

    @Nullable
    private String memberId;

    @Nullable
    private Long orderTime;

    @Nullable
    private String orderTimeDesc;

    @Nullable
    private String palmPayTag;

    @Nullable
    private String phone;

    @Nullable
    private String ppAccountNo;

    @Nullable
    private String relationId;

    @Nullable
    private String relationshipDarkPic;

    @Nullable
    private String relationshipPic;

    @Nullable
    private String toFavoriteTip;

    @Nullable
    private String transType;

    @Nullable
    public final String getAccountMark() {
        return this.accountMark;
    }

    @Nullable
    public final String getAccountNo() {
        return this.accountNo;
    }

    @Nullable
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getDarkAccountMark() {
        return this.darkAccountMark;
    }

    @Nullable
    public final Boolean getFavorite() {
        return this.favorite;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final String getHeadPortrait() {
        return this.headPortrait;
    }

    @Nullable
    public final String getHeader() {
        return this.header;
    }

    @Nullable
    public final InviteBean getInvite() {
        return this.invite;
    }

    @Override // com.chad.library.adapter.base.entity.SectionEntity, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return l.j(this);
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final Long getOrderTime() {
        return this.orderTime;
    }

    @Nullable
    public final String getOrderTimeDesc() {
        return this.orderTimeDesc;
    }

    @Nullable
    public final String getPalmPayTag() {
        return this.palmPayTag;
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
    public final String getRelationId() {
        return this.relationId;
    }

    @Nullable
    public final String getRelationshipDarkPic() {
        return this.relationshipDarkPic;
    }

    @Nullable
    public final String getRelationshipPic() {
        return this.relationshipPic;
    }

    @Override // com.transsnet.palmpay.send_money.utils.OnSectionListener
    @Nullable
    public String getSection() {
        return this.fullName;
    }

    @Nullable
    public final String getToFavoriteTip() {
        return this.toFavoriteTip;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    @Override // com.chad.library.adapter.base.entity.SectionEntity
    public boolean isHeader() {
        return !TextUtils.isEmpty(this.header);
    }

    public final void setAccountMark(@Nullable String str) {
        this.accountMark = str;
    }

    public final void setAccountNo(@Nullable String str) {
        this.accountNo = str;
    }

    public final void setBusinessType(@Nullable Integer num) {
        this.businessType = num;
    }

    public final void setDarkAccountMark(@Nullable String str) {
        this.darkAccountMark = str;
    }

    public final void setFavorite(@Nullable Boolean bool) {
        this.favorite = bool;
    }

    public final void setFullName(@Nullable String str) {
        this.fullName = str;
    }

    public final void setHeadPortrait(@Nullable String str) {
        this.headPortrait = str;
    }

    public final void setHeader(@Nullable String str) {
        this.header = str;
    }

    public final void setInvite(@Nullable InviteBean inviteBean) {
        this.invite = inviteBean;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setMemberId(@Nullable String str) {
        this.memberId = str;
    }

    public final void setOrderTime(@Nullable Long l5) {
        this.orderTime = l5;
    }

    public final void setOrderTimeDesc(@Nullable String str) {
        this.orderTimeDesc = str;
    }

    public final void setPalmPayTag(@Nullable String str) {
        this.palmPayTag = str;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setPpAccountNo(@Nullable String str) {
        this.ppAccountNo = str;
    }

    public final void setRelationId(@Nullable String str) {
        this.relationId = str;
    }

    public final void setRelationshipDarkPic(@Nullable String str) {
        this.relationshipDarkPic = str;
    }

    public final void setRelationshipPic(@Nullable String str) {
        this.relationshipPic = str;
    }

    public final void setToFavoriteTip(@Nullable String str) {
        this.toFavoriteTip = str;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }
}
