package com.transsnet.adsdk.data.local.entity;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.appsflyer.AdRevenueScheme;

/* JADX INFO: loaded from: classes3.dex */
@Entity(indices = {@Index(unique = true, value = {"ad_id"})}, tableName = "ad_detail")
public class AdEntity {

    @ColumnInfo(name = "ad_slot_id")
    public String adSlotId;

    @ColumnInfo(name = AdRevenueScheme.AD_TYPE)
    public int adType;

    @ColumnInfo(name = "application_id")
    public String applicationId;

    @ColumnInfo(name = "background_color")
    public String backgroundColor;

    @ColumnInfo(name = "background_color_dark")
    public String backgroundColorDark;

    @ColumnInfo(name = "click_date")
    public long clickDate;

    @ColumnInfo(name = "click_frequency")
    public Integer clickFrequency;

    @ColumnInfo(name = "max_close_count")
    public int closeControl;

    @ColumnInfo(name = "close_count")
    public int closeCount;

    @ColumnInfo(name = "close_time")
    public long closeTime;

    @ColumnInfo(name = "country_code")
    public String countryCode;

    @ColumnInfo(name = "create_time")
    public long createTime;

    @ColumnInfo(name = "default_img_res")
    public int defaultImgRes;

    @ColumnInfo(name = "secondary_image_url")
    public String h5ImageUrl;

    @ColumnInfo(name = "secondary_image_url_dark")
    public String h5ImageUrlDark;

    @ColumnInfo(name = "has_show_times")
    public int hasShowTimes;

    @ColumnInfo(name = "image_dimention")
    public String imageDimention;

    @ColumnInfo(name = "image_url")
    public String imageUrl;

    @ColumnInfo(name = "image_url_dark")
    public String imageUrlDark;

    @ColumnInfo(name = "jump_params")
    public String jumpParams;

    @ColumnInfo(name = "jump_type")
    public String jumpType;

    @ColumnInfo(name = "multiple_imageUrl")
    public String multipleImageUrl;

    @ColumnInfo(name = "native_ad_content")
    public String nativeAdContent;

    @ColumnInfo(name = "native_ad_photo")
    public String nativeAdPhoto;

    @ColumnInfo(name = "native_ad_title")
    public String nativeAdTitle;

    @ColumnInfo(name = "relative_url")
    public String relativeUrl;

    @ColumnInfo(name = "show_close_button")
    public int showCloseButton;

    @ColumnInfo(name = "show_date")
    public long showDate;

    @ColumnInfo(name = "show_dates")
    public String showDates;

    @ColumnInfo(name = "show_times")
    public int showTimes;

    @ColumnInfo(name = "show_times_condition")
    public Integer showTimesCondition;

    @ColumnInfo(name = "text_content")
    public String textContent;

    @ColumnInfo(name = "text_font_color")
    public String textFontColor;

    @ColumnInfo(name = "text_font_color_dark")
    public String textFontColorDark;

    @ColumnInfo(name = "text_font_size")
    public String textFontSize;

    @ColumnInfo(name = "text_icon_url")
    public String textIconUrl;

    @ColumnInfo(name = "text_icon_url_dark")
    public String textIconUrlDark;

    @ColumnInfo(name = "text_scroll_speed")
    public String textScrollSpeed;

    @ColumnInfo(name = "update_time")
    public long updateTime;

    @ColumnInfo(name = "valid_end_time")
    public long validEndTime;

    @ColumnInfo(name = "valid_start_time")
    public long validStartTime;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "ad_id")
    public String adId = "";

    @ColumnInfo(name = "current_enable")
    public int curEnable = 1;

    @ColumnInfo(name = "alpha")
    public int alpha = 178;

    @ColumnInfo(name = "display_order")
    public int displayOrder = 0;

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AdEntity)) {
            return false;
        }
        AdEntity adEntity = (AdEntity) obj;
        if (TextUtils.isEmpty(adEntity.adId)) {
            return false;
        }
        return adEntity.adId.equals(this.adId);
    }

    public int getAlpha() {
        int i7 = this.alpha;
        if (i7 <= 0 || i7 > 255) {
            return 77;
        }
        return i7;
    }
}
