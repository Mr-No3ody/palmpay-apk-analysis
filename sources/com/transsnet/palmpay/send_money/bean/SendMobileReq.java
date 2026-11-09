package com.transsnet.palmpay.send_money.bean;

/* JADX INFO: loaded from: classes4.dex */
public class SendMobileReq extends PreOrderBaseReq {
    private String accountTierTips;
    private boolean agent;
    private long createTime;
    private String facebookName;
    private boolean isAuthed;
    private boolean isMember;
    private String mobileMoneyAccountTier;
    private String palmPayTag;
    private String payeeQRAccountNo;
    private String recipientAvatar;
    private String recipientEmail;
    private String recipientFirstName;
    private String recipientFullName;
    private String recipientLastName;
    private String recipientMemberId;
    private String recipientNickname;
    private String recipientPhone;
    private int relationship = -1;
    private String relationshipPic;
    private int transferPurpose;

    public String getAccountTierTips() {
        return this.accountTierTips;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getFacebookName() {
        return this.facebookName;
    }

    public String getMobileMoneyAccountTier() {
        return this.mobileMoneyAccountTier;
    }

    public String getPalmPayTag() {
        return this.palmPayTag;
    }

    public String getPayeeQRAccountNo() {
        return this.payeeQRAccountNo;
    }

    public String getRecipientAvatar() {
        return this.recipientAvatar;
    }

    public String getRecipientEmail() {
        return this.recipientEmail;
    }

    public String getRecipientFirstName() {
        return this.recipientFirstName;
    }

    public String getRecipientFullName() {
        return this.recipientFullName;
    }

    public String getRecipientLastName() {
        return this.recipientLastName;
    }

    public String getRecipientMemberId() {
        return this.recipientMemberId;
    }

    public String getRecipientNickname() {
        return this.recipientNickname;
    }

    public String getRecipientPhone() {
        return this.recipientPhone;
    }

    public int getRelationship() {
        return this.relationship;
    }

    public String getRelationshipPic() {
        return this.relationshipPic;
    }

    public int getTransferPurpose() {
        return this.transferPurpose;
    }

    public boolean isAgent() {
        return this.agent;
    }

    public boolean isAuthed() {
        return this.isAuthed;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public void setAccountTierTips(String str) {
        this.accountTierTips = str;
    }

    public void setAgent(boolean z3) {
        this.agent = z3;
    }

    public void setAuthed(boolean z3) {
        this.isAuthed = z3;
    }

    public void setCreateTime(long j6) {
        this.createTime = j6;
    }

    public void setFacebookName(String str) {
        this.facebookName = str;
    }

    public void setMember(boolean z3) {
        this.isMember = z3;
    }

    public void setMobileMoneyAccountTier(String str) {
        this.mobileMoneyAccountTier = str;
    }

    public void setPalmPayTag(String str) {
        this.palmPayTag = str;
    }

    public void setPayeeQRAccountNo(String str) {
        this.payeeQRAccountNo = str;
    }

    public void setRecipientAvatar(String str) {
        this.recipientAvatar = str;
    }

    public void setRecipientEmail(String str) {
        this.recipientEmail = str;
    }

    public void setRecipientFirstName(String str) {
        this.recipientFirstName = str;
    }

    public void setRecipientFullName(String str) {
        this.recipientFullName = str;
    }

    public void setRecipientLastName(String str) {
        this.recipientLastName = str;
    }

    public void setRecipientMemberId(String str) {
        this.recipientMemberId = str;
    }

    public void setRecipientNickname(String str) {
        this.recipientNickname = str;
    }

    public void setRecipientPhone(String str) {
        this.recipientPhone = str;
    }

    public void setRelationship(int i7) {
        this.relationship = i7;
    }

    public void setRelationshipPic(String str) {
        this.relationshipPic = str;
    }

    public void setTransferPurpose(int i7) {
        this.transferPurpose = i7;
    }
}
