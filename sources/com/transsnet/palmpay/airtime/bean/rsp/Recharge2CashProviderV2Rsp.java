package com.transsnet.palmpay.airtime.bean.rsp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.airtime.bean.R2CProductsResp;
import com.transsnet.palmpay.custom_view.input.OperatorItemExtraInfo;
import com.transsnet.palmpay.custom_view.input.OperatorSelectImpl;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Recharge2CashProviderV2Rsp implements OperatorSelectImpl, Parcelable {
    public static final Parcelable.Creator<Recharge2CashProviderV2Rsp> CREATOR = new Parcelable.Creator<Recharge2CashProviderV2Rsp>() { // from class: com.transsnet.palmpay.airtime.bean.rsp.Recharge2CashProviderV2Rsp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Recharge2CashProviderV2Rsp createFromParcel(Parcel parcel) {
            return new Recharge2CashProviderV2Rsp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Recharge2CashProviderV2Rsp[] newArray(int i7) {
            return new Recharge2CashProviderV2Rsp[i7];
        }
    };
    public String amtTips;
    public String billerIcon;
    public String billerId;
    public String billerName;
    public List<R2CProductsResp> itemList;
    public long maxAmount;
    public long minAmount;
    public int status;
    public boolean suspend;
    public String tips;
    public String userIdTips;

    public Recharge2CashProviderV2Rsp(Parcel parcel) {
        this.billerId = parcel.readString();
        this.billerName = parcel.readString();
        this.billerIcon = parcel.readString();
        this.minAmount = parcel.readLong();
        this.maxAmount = parcel.readLong();
        this.tips = parcel.readString();
        this.userIdTips = parcel.readString();
        this.amtTips = parcel.readString();
        this.suspend = parcel.readByte() != 0;
        this.status = parcel.readInt();
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
    public String getIcon() {
        return this.billerIcon;
    }

    @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
    @Nullable
    public String getItemId() {
        return this.billerId;
    }

    @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
    @Nullable
    public String getItemName() {
        return this.billerName;
    }

    @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
    @Nullable
    public Boolean isSuspend() {
        return Boolean.valueOf(this.suspend);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.billerId);
        parcel.writeString(this.billerName);
        parcel.writeString(this.billerIcon);
        parcel.writeLong(this.minAmount);
        parcel.writeLong(this.maxAmount);
        parcel.writeString(this.tips);
        parcel.writeString(this.userIdTips);
        parcel.writeString(this.amtTips);
        parcel.writeByte(this.suspend ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.status);
    }
}
