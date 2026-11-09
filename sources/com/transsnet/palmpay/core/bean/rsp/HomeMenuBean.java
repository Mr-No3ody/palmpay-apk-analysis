package com.transsnet.palmpay.core.bean.rsp;

import C0.G;

/* JADX INFO: loaded from: classes3.dex */
public class HomeMenuBean {
    public static final int BOTTOM_TAB_FINANCE = 63;
    public static final int BOTTOM_TAB_GIVEAWAY = 66;
    public static final int BOTTOM_TAB_HOME = 61;
    public static final int BOTTOM_TAB_INVEST = 65;
    public static final int BOTTOM_TAB_ME = 62;
    public static final int BOTTOM_TAB_ZONE = 64;
    public String adSlotId;
    public String cornerText;
    public String darkIconUrl;
    public String darkIconUrlUnSelected;
    public boolean fromCache;
    public int hideFlag;
    public String iconLottieUrl;
    public String iconUrl;
    public String iconUrlBig;
    public String iconUrlUnSelected;
    public String jumpParams;
    public String jumpPath;
    public String jumpType;
    public int menuId;
    public String menuName;
    public String subIcon;

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 != null && getClass() == o10.getClass()) {
            HomeMenuBean homeMenuBean = (HomeMenuBean) o10;
            if (this.menuId != homeMenuBean.menuId || this.hideFlag != homeMenuBean.hideFlag) {
                return false;
            }
            String str = this.menuName;
            if (str == null ? homeMenuBean.menuName != null : !str.equals(homeMenuBean.menuName)) {
                return false;
            }
            String str2 = this.iconUrl;
            if (str2 == null ? homeMenuBean.iconUrl != null : !str2.equals(homeMenuBean.iconUrl)) {
                return false;
            }
            String str3 = this.darkIconUrl;
            if (str3 == null ? homeMenuBean.darkIconUrl != null : !str3.equals(homeMenuBean.darkIconUrl)) {
                return false;
            }
            String str4 = this.iconUrlBig;
            if (str4 == null ? homeMenuBean.iconUrlBig != null : !str4.equals(homeMenuBean.iconUrlBig)) {
                return false;
            }
            String str5 = this.iconLottieUrl;
            if (str5 == null ? homeMenuBean.iconLottieUrl != null : !str5.equals(homeMenuBean.iconLottieUrl)) {
                return false;
            }
            String str6 = this.iconUrlUnSelected;
            if (str6 == null ? homeMenuBean.iconUrlUnSelected != null : !str6.equals(homeMenuBean.iconUrlUnSelected)) {
                return false;
            }
            String str7 = this.darkIconUrlUnSelected;
            if (str7 == null ? homeMenuBean.darkIconUrlUnSelected != null : !str7.equals(homeMenuBean.darkIconUrlUnSelected)) {
                return false;
            }
            String str8 = this.subIcon;
            if (str8 == null ? homeMenuBean.subIcon != null : !str8.equals(homeMenuBean.subIcon)) {
                return false;
            }
            String str9 = this.jumpPath;
            if (str9 == null ? homeMenuBean.jumpPath != null : !str9.equals(homeMenuBean.jumpPath)) {
                return false;
            }
            String str10 = this.jumpType;
            if (str10 == null ? homeMenuBean.jumpType != null : !str10.equals(homeMenuBean.jumpType)) {
                return false;
            }
            String str11 = this.jumpParams;
            if (str11 == null ? homeMenuBean.jumpParams != null : !str11.equals(homeMenuBean.jumpParams)) {
                return false;
            }
            String str12 = this.cornerText;
            if (str12 == null ? homeMenuBean.cornerText != null : !str12.equals(homeMenuBean.cornerText)) {
                return false;
            }
            String str13 = this.adSlotId;
            String str14 = homeMenuBean.adSlotId;
            if (str13 != null) {
                return str13.equals(str14);
            }
            if (str14 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i7 = this.menuId * 31;
        String str = this.menuName;
        int iHashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.darkIconUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.iconUrlBig;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.iconLottieUrl;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.iconUrlUnSelected;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.darkIconUrlUnSelected;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.subIcon;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.jumpPath;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.jumpType;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.jumpParams;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.cornerText;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.adSlotId;
        return ((((iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31) + (this.fromCache ? 1 : 0)) * 31) + this.hideFlag;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HomeMenuBean{menuName='");
        sb2.append(this.menuName);
        sb2.append("', iconUrl='");
        sb2.append(this.iconUrl);
        sb2.append("', iconLottieUrl='");
        return G.r(sb2, this.iconLottieUrl, "'}");
    }
}
