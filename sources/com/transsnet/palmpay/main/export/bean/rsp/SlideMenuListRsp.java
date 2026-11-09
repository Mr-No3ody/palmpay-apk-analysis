package com.transsnet.palmpay.main.export.bean.rsp;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SlideMenuListRsp {
    public BussinessStoreBean businessAcc;
    public BusinessMenuData businessMenu;
    public List<List<HomeSlideMenuBean>> menuList;
    public ExtraMenuData priorityMenu;
    public List<QuickAccessDTO> quickAccessDTO;

    public static class BusinessMenuData {
        public String buttonJumpType;
        public String buttonJumpUrl;
        public String buttonText;
        public String content;
        public String iconUrl;
        public String superscriptPictureUrl;
        public String title;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BusinessMenuData businessMenuData = (BusinessMenuData) obj;
            return TextUtils.equals(this.buttonJumpType, businessMenuData.buttonJumpType) && TextUtils.equals(this.buttonJumpUrl, businessMenuData.buttonJumpUrl) && TextUtils.equals(this.buttonText, businessMenuData.buttonText) && TextUtils.equals(this.content, businessMenuData.content) && TextUtils.equals(this.iconUrl, businessMenuData.iconUrl) && TextUtils.equals(this.superscriptPictureUrl, businessMenuData.superscriptPictureUrl) && TextUtils.equals(this.title, businessMenuData.title);
        }

        public int hashCode() {
            String str = this.buttonJumpType;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.buttonJumpUrl;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.buttonText;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.content;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.iconUrl;
            int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.superscriptPictureUrl;
            int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.title;
            return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        }
    }

    public static class BussinessStoreBean {
        public String accountNo;
        public String userName;
    }

    public static class ExtraMenuData {
        public String backgroundColor;
        public String button;
        public boolean canClose;
        public String darkBackgroundColor;
        public String darkIcon;
        public String darkTextColor;
        public String icon;
        public String jumpParams;
        public String jumpPath;
        public String jumpType;
        public String menuName;
        public boolean needDisplay;
        public String showMsg;
        public String textColor;
        public int userType;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ExtraMenuData extraMenuData = (ExtraMenuData) obj;
            return this.userType == extraMenuData.userType && this.needDisplay == extraMenuData.needDisplay && this.canClose == extraMenuData.canClose && TextUtils.equals(this.showMsg, extraMenuData.showMsg) && TextUtils.equals(this.jumpParams, extraMenuData.jumpParams) && TextUtils.equals(this.jumpType, extraMenuData.jumpType) && TextUtils.equals(this.jumpPath, extraMenuData.jumpPath) && TextUtils.equals(this.textColor, extraMenuData.textColor) && TextUtils.equals(this.backgroundColor, extraMenuData.backgroundColor) && TextUtils.equals(this.icon, extraMenuData.icon) && TextUtils.equals(this.menuName, extraMenuData.menuName) && TextUtils.equals(this.button, extraMenuData.button) && TextUtils.equals(this.darkIcon, extraMenuData.darkIcon) && TextUtils.equals(this.darkTextColor, extraMenuData.darkTextColor) && TextUtils.equals(this.darkBackgroundColor, extraMenuData.darkBackgroundColor);
        }

        public String getBackgroundColor(boolean z3) {
            if (z3) {
                return TextUtils.isEmpty(this.darkBackgroundColor) ? this.backgroundColor : this.darkBackgroundColor;
            }
            return this.backgroundColor;
        }

        public String getIcon(boolean z3) {
            if (z3) {
                return TextUtils.isEmpty(this.darkIcon) ? this.icon : this.darkIcon;
            }
            return this.icon;
        }

        public String getTextColor(boolean z3) {
            if (z3) {
                return TextUtils.isEmpty(this.darkTextColor) ? this.textColor : this.darkTextColor;
            }
            return this.textColor;
        }

        public int hashCode() {
            int i7 = ((((this.userType * 31) + (this.needDisplay ? 1 : 0)) * 31) + (this.canClose ? 1 : 0)) * 31;
            String str = this.showMsg;
            int iHashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.jumpParams;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.jumpType;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.jumpPath;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.textColor;
            int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.backgroundColor;
            int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.icon;
            int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            String str8 = this.menuName;
            int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.button;
            int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.darkIcon;
            int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
            String str11 = this.darkTextColor;
            int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
            String str12 = this.darkBackgroundColor;
            return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
        }
    }

    public static class QuickAccessDTO {
        public String firstContent;
        public String icon;
        public String linkUrl;
        public String secondContent;
        public String title;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            QuickAccessDTO quickAccessDTO = (QuickAccessDTO) obj;
            return TextUtils.equals(this.title, quickAccessDTO.title) && TextUtils.equals(this.firstContent, quickAccessDTO.firstContent) && TextUtils.equals(this.secondContent, quickAccessDTO.secondContent) && TextUtils.equals(this.linkUrl, quickAccessDTO.linkUrl);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.firstContent;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.secondContent;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.linkUrl;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }
}
