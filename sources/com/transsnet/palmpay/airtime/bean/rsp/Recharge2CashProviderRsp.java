package com.transsnet.palmpay.airtime.bean.rsp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.custom_view.input.OperatorItemExtraInfo;
import com.transsnet.palmpay.custom_view.input.OperatorSelectImpl;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Recharge2CashProviderRsp extends CommonResult {
    public List<DataBean> data;

    public static class DataBean implements Parcelable, OperatorSelectImpl {
        public static final Parcelable.Creator<DataBean> CREATOR = new Parcelable.Creator<DataBean>() { // from class: com.transsnet.palmpay.airtime.bean.rsp.Recharge2CashProviderRsp.DataBean.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public DataBean createFromParcel(Parcel parcel) {
                return new DataBean(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public DataBean[] newArray(int i7) {
                return new DataBean[i7];
            }
        };
        public String banner;
        public String billerDocContent;
        public String billerDocTitle;
        public String billerId;
        public String billerLogo;
        public String billerName;
        public String businessType;
        public boolean fixedAmount;
        public long maxAmount;
        public long minAmount;
        public boolean recommend;
        public String shortName;
        public boolean suspend;
        public String tips;
        public String userIdTips;

        public DataBean() {
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        public OperatorItemExtraInfo addExtraInfo() {
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        /* JADX INFO: renamed from: getIcon */
        public String getIconUrl() {
            return this.billerLogo;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        /* JADX INFO: renamed from: getItemId */
        public String getName() {
            return this.billerId;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        public String getItemName() {
            return this.billerName;
        }

        public boolean isEnable() {
            return !this.suspend;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        public Boolean isSuspend() {
            return Boolean.valueOf(this.suspend);
        }

        public void readFromParcel(Parcel parcel) {
            this.billerId = parcel.readString();
            this.billerName = parcel.readString();
            this.businessType = parcel.readString();
            this.billerLogo = parcel.readString();
            this.shortName = parcel.readString();
            this.recommend = parcel.readByte() != 0;
            this.suspend = parcel.readByte() != 0;
            this.tips = parcel.readString();
            this.userIdTips = parcel.readString();
            this.minAmount = parcel.readLong();
            this.maxAmount = parcel.readLong();
            this.banner = parcel.readString();
            this.billerDocTitle = parcel.readString();
            this.billerDocContent = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.billerId);
            parcel.writeString(this.billerName);
            parcel.writeString(this.businessType);
            parcel.writeString(this.billerLogo);
            parcel.writeString(this.shortName);
            parcel.writeByte(this.recommend ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.suspend ? (byte) 1 : (byte) 0);
            parcel.writeString(this.tips);
            parcel.writeString(this.userIdTips);
            parcel.writeLong(this.minAmount);
            parcel.writeLong(this.maxAmount);
            parcel.writeString(this.banner);
            parcel.writeString(this.billerDocTitle);
            parcel.writeString(this.billerDocContent);
        }

        public DataBean(Parcel parcel) {
            this.billerId = parcel.readString();
            this.billerName = parcel.readString();
            this.businessType = parcel.readString();
            this.billerLogo = parcel.readString();
            this.shortName = parcel.readString();
            this.recommend = parcel.readByte() != 0;
            this.suspend = parcel.readByte() != 0;
            this.tips = parcel.readString();
            this.userIdTips = parcel.readString();
            this.minAmount = parcel.readLong();
            this.maxAmount = parcel.readLong();
            this.banner = parcel.readString();
            this.billerDocTitle = parcel.readString();
            this.billerDocContent = parcel.readString();
        }
    }
}
