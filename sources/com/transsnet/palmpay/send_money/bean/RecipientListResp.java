package com.transsnet.palmpay.send_money.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RecipientListResp extends CommonResult {
    private List<RecipientBean> data;

    public List<RecipientBean> getData() {
        return this.data;
    }

    public void setData(List<RecipientBean> list) {
        this.data = list;
    }

    public static class RecipientBean implements Parcelable, SectionEntity {
        public static final Parcelable.Creator<RecipientBean> CREATOR = new Parcelable.Creator<RecipientBean>() { // from class: com.transsnet.palmpay.send_money.bean.RecipientListResp.RecipientBean.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public RecipientBean createFromParcel(Parcel parcel) {
                return new RecipientBean(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public RecipientBean[] newArray(int i7) {
                return new RecipientBean[i7];
            }
        };
        public String accountNo;
        private String accountTierTips;
        private String agentMemberId;
        private long amount;
        private boolean auther;
        private long createTime;
        private String facebookName;
        public boolean favorite;
        public InviteBean invite;
        public boolean isHeader;
        public int keywordType;
        private String label;
        private String mobileMoneyAccountTier;
        public long orderTime;
        public String orderTimeDesc;
        private String palmPayTag;
        public String payeeMemberId;
        public String ppAccountNo;
        private String recipientAccountId;
        private String recipientAccountNumber;
        private String recipientBankCode;
        private String recipientBankName;
        private String recipientChannel;
        private String recipientChannelName;
        private String recipientFirstName;
        private String recipientHeadImage;
        private String recipientId;
        private String recipientLastName;
        private String recipientMemberId;
        private String recipientNickname;
        private String recipientPhone;
        private int recipientType;
        private int relationship;
        public String relationshipDarkPic;
        public String relationshipPic;
        private int scheduleType;
        private int scheduleValue;
        public int tagType;
        public String toFavoriteTip;
        private String userEmail;

        public RecipientBean() {
            this.scheduleType = 1;
            this.favorite = false;
            this.relationship = -1;
            this.isHeader = false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAccountNo() {
            return this.accountNo;
        }

        public String getAccountTierTips() {
            return this.accountTierTips;
        }

        public String getAgentMemberId() {
            return this.agentMemberId;
        }

        public long getAmount() {
            return this.amount;
        }

        public long getCreateTime() {
            return this.createTime;
        }

        public String getFacebookName() {
            return this.facebookName;
        }

        @Override // com.chad.library.adapter.base.entity.SectionEntity, com.chad.library.adapter.base.entity.MultiItemEntity
        public int getItemType() {
            return this.isHeader ? -99 : -100;
        }

        public int getKeywordType() {
            return this.keywordType;
        }

        public String getLabel() {
            return this.label;
        }

        public String getMobileMoneyAccountTier() {
            return this.mobileMoneyAccountTier;
        }

        public String getPalmPayTag() {
            return this.palmPayTag;
        }

        public String getPpAccountNo() {
            return this.ppAccountNo;
        }

        public String getRecipientAccountId() {
            return this.recipientAccountId;
        }

        public String getRecipientAccountNumber() {
            return this.recipientAccountNumber;
        }

        public String getRecipientBankCode() {
            return this.recipientBankCode;
        }

        public String getRecipientBankName() {
            return this.recipientBankName;
        }

        public String getRecipientChannel() {
            return this.recipientChannel;
        }

        public String getRecipientChannelName() {
            return this.recipientChannelName;
        }

        public String getRecipientFirstName() {
            return this.recipientFirstName;
        }

        public String getRecipientHeadImage() {
            return this.recipientHeadImage;
        }

        public String getRecipientId() {
            return this.recipientId;
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

        public int getRecipientType() {
            return this.recipientType;
        }

        public int getRelationship() {
            return this.relationship;
        }

        public int getScheduleType() {
            return this.scheduleType;
        }

        public int getScheduleValue() {
            return this.scheduleValue;
        }

        public String getUserEmail() {
            return this.userEmail;
        }

        public boolean isAuther() {
            return this.auther;
        }

        public boolean isFavorite() {
            return this.favorite;
        }

        @Override // com.chad.library.adapter.base.entity.SectionEntity
        public boolean isHeader() {
            return this.isHeader;
        }

        public void setAccountNo(String str) {
            this.accountNo = str;
        }

        public void setAccountTierTips(String str) {
            this.accountTierTips = str;
        }

        public void setAgentMemberId(String str) {
            this.agentMemberId = str;
        }

        public void setAmount(long j6) {
            this.amount = j6;
        }

        public void setAuther(boolean z3) {
            this.auther = z3;
        }

        public void setCreateTime(long j6) {
            this.createTime = j6;
        }

        public void setFacebookName(String str) {
            this.facebookName = str;
        }

        public void setFavorite(boolean z3) {
            this.favorite = z3;
        }

        public void setHeader(boolean z3) {
            this.isHeader = z3;
        }

        public void setKeywordType(int i7) {
            this.keywordType = i7;
        }

        public void setLabel(String str) {
            this.label = str;
        }

        public void setMobileMoneyAccountTier(String str) {
            this.mobileMoneyAccountTier = str;
        }

        public void setPalmPayTag(String str) {
            this.palmPayTag = str;
        }

        public void setPpAccountNo(String str) {
            this.ppAccountNo = str;
        }

        public void setRecipientAccountId(String str) {
            this.recipientAccountId = str;
        }

        public void setRecipientAccountNumber(String str) {
            this.recipientAccountNumber = str;
        }

        public void setRecipientBankCode(String str) {
            this.recipientBankCode = str;
        }

        public void setRecipientBankName(String str) {
            this.recipientBankName = str;
        }

        public void setRecipientChannel(String str) {
            this.recipientChannel = str;
        }

        public void setRecipientChannelName(String str) {
            this.recipientChannelName = str;
        }

        public void setRecipientFirstName(String str) {
            this.recipientFirstName = str;
        }

        public void setRecipientHeadImage(String str) {
            this.recipientHeadImage = str;
        }

        public void setRecipientId(String str) {
            this.recipientId = str;
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

        public void setRecipientType(int i7) {
            this.recipientType = i7;
        }

        public void setRelationship(int i7) {
            this.relationship = i7;
        }

        public void setScheduleType(int i7) {
            this.scheduleType = i7;
        }

        public void setScheduleValue(int i7) {
            this.scheduleValue = i7;
        }

        public void setUserEmail(String str) {
            this.userEmail = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.recipientAccountId);
            parcel.writeString(this.recipientAccountNumber);
            parcel.writeString(this.recipientBankCode);
            parcel.writeString(this.recipientBankName);
            parcel.writeString(this.recipientChannel);
            parcel.writeString(this.recipientChannelName);
            parcel.writeString(this.recipientFirstName);
            parcel.writeString(this.recipientHeadImage);
            parcel.writeString(this.recipientId);
            parcel.writeString(this.recipientLastName);
            parcel.writeString(this.recipientNickname);
            parcel.writeString(this.recipientPhone);
            parcel.writeInt(this.recipientType);
            parcel.writeString(this.label);
            parcel.writeLong(this.amount);
            parcel.writeInt(this.scheduleType);
            parcel.writeInt(this.scheduleValue);
            parcel.writeInt(this.relationship);
        }

        public RecipientBean(Parcel parcel) {
            this.scheduleType = 1;
            this.favorite = false;
            this.relationship = -1;
            this.isHeader = false;
            this.recipientAccountId = parcel.readString();
            this.recipientAccountNumber = parcel.readString();
            this.recipientBankCode = parcel.readString();
            this.recipientBankName = parcel.readString();
            this.recipientChannel = parcel.readString();
            this.recipientChannelName = parcel.readString();
            this.recipientFirstName = parcel.readString();
            this.recipientHeadImage = parcel.readString();
            this.recipientId = parcel.readString();
            this.recipientLastName = parcel.readString();
            this.recipientNickname = parcel.readString();
            this.recipientPhone = parcel.readString();
            this.recipientType = parcel.readInt();
            this.label = parcel.readString();
            this.amount = parcel.readLong();
            this.scheduleType = parcel.readInt();
            this.scheduleValue = parcel.readInt();
            this.relationship = parcel.readInt();
        }
    }
}
