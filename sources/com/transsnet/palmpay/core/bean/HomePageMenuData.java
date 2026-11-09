package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;

/* JADX INFO: loaded from: classes3.dex */
public class HomePageMenuData extends HomeMenuBean implements Parcelable {
    public static final Parcelable.Creator<HomePageMenuData> CREATOR = new Parcelable.Creator<HomePageMenuData>() { // from class: com.transsnet.palmpay.core.bean.HomePageMenuData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HomePageMenuData createFromParcel(Parcel source) {
            return new HomePageMenuData(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HomePageMenuData[] newArray(int size) {
            return new HomePageMenuData[size];
        }
    };
    public String billCategoryName;
    public String billerNames;
    public String cornerImgUrl;
    public String cornerLottieUrl;
    public int cornerOrder;
    public boolean editEnable = true;
    public String menuDesc;
    public String menuGroupName;
    public String newFun;
    public int type;

    public HomePageMenuData() {
    }

    private boolean isStringEqual(String str1, String str2) {
        return TextUtils.isEmpty(str1) ? TextUtils.isEmpty(str2) : str1.equals(str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.bean.rsp.HomeMenuBean
    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        HomePageMenuData homePageMenuData = (HomePageMenuData) obj;
        return isStringEqual(this.cornerImgUrl, homePageMenuData.cornerImgUrl) && isStringEqual(this.iconLottieUrl, homePageMenuData.iconLottieUrl) && isStringEqual(this.cornerLottieUrl, homePageMenuData.cornerLottieUrl) && isStringEqual(this.newFun, homePageMenuData.newFun) && isStringEqual(this.menuName, homePageMenuData.menuName) && isStringEqual(this.iconUrl, homePageMenuData.iconUrl) && isStringEqual(this.iconUrlBig, homePageMenuData.iconUrlBig) && isStringEqual(this.jumpType, homePageMenuData.jumpType) && isStringEqual(this.jumpPath, homePageMenuData.jumpPath) && isStringEqual(this.jumpParams, homePageMenuData.jumpParams) && this.cornerOrder == homePageMenuData.cornerOrder;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cornerImgUrl);
        dest.writeString(this.cornerLottieUrl);
        dest.writeString(this.newFun);
        dest.writeString(this.menuName);
        dest.writeString(this.iconUrl);
        dest.writeString(this.jumpPath);
        dest.writeString(this.jumpType);
        dest.writeString(this.jumpParams);
        dest.writeString(this.iconUrlBig);
        dest.writeString(this.billerNames);
        dest.writeInt(this.cornerOrder);
        dest.writeString(this.iconLottieUrl);
    }

    public HomePageMenuData(Parcel in) {
        this.cornerImgUrl = in.readString();
        this.cornerLottieUrl = in.readString();
        this.newFun = in.readString();
        this.menuName = in.readString();
        this.iconUrl = in.readString();
        this.jumpPath = in.readString();
        this.jumpType = in.readString();
        this.jumpParams = in.readString();
        this.iconUrlBig = in.readString();
        this.billerNames = in.readString();
        this.cornerOrder = in.readInt();
        this.iconLottieUrl = in.readString();
    }
}
