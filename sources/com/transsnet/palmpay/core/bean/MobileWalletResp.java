package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.custom_view.input.OperatorItemExtraInfo;
import com.transsnet.palmpay.custom_view.input.OperatorSelectImpl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class MobileWalletResp extends CommonResult {
    public ArrayList<MobileWallet> data;

    public static class MobileWallet implements Parcelable, OperatorSelectImpl {
        public static final Parcelable.Creator<MobileWallet> CREATOR = new Parcelable.Creator<MobileWallet>() { // from class: com.transsnet.palmpay.core.bean.MobileWalletResp.MobileWallet.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MobileWallet createFromParcel(Parcel source) {
                return new MobileWallet(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MobileWallet[] newArray(int size) {
                return new MobileWallet[size];
            }
        };
        public String androidUrl;
        public String countryCode;
        public String darkTipUrl;
        public int indexInList;
        public String operatorCode;
        public String operatorName;
        public String operatorUrl;
        public int status;
        public String tipUrl;
        public String tips;
        public String userIdTips;

        public MobileWallet() {
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        public OperatorItemExtraInfo addExtraInfo() {
            return new OperatorItemExtraInfo(this.tipUrl, this.darkTipUrl);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        /* JADX INFO: renamed from: getIcon */
        public String getIconUrl() {
            return this.operatorUrl;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        /* JADX INFO: renamed from: getItemId */
        public String getName() {
            return this.operatorCode;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        public String getItemName() {
            return this.operatorName;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        public Boolean isSuspend() {
            return Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.operatorUrl);
            dest.writeString(this.operatorName);
            dest.writeString(this.operatorCode);
            dest.writeString(this.tips);
            dest.writeString(this.tipUrl);
            dest.writeString(this.userIdTips);
            dest.writeString(this.countryCode);
            dest.writeInt(this.status);
            dest.writeInt(this.indexInList);
            dest.writeString(this.androidUrl);
        }

        public MobileWallet(Parcel in) {
            this.operatorUrl = in.readString();
            this.operatorName = in.readString();
            this.operatorCode = in.readString();
            this.tips = in.readString();
            this.userIdTips = in.readString();
            this.countryCode = in.readString();
            this.status = in.readInt();
            this.indexInList = in.readInt();
            this.androidUrl = in.readString();
            this.tipUrl = in.readString();
        }
    }
}
