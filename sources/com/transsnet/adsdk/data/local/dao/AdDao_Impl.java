package com.transsnet.adsdk.data.local.dao;

import Td.a;
import Td.b;
import Td.c;
import android.database.Cursor;
import androidx.camera.core.impl.utils.executor.g;
import androidx.room.AbstractC1235n;
import androidx.room.AbstractC1236o;
import androidx.room.G;
import androidx.room.L;
import androidx.room.P;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.appsflyer.AdRevenueScheme;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AdDao_Impl implements AdDao {
    private final G __db;
    private final AbstractC1235n __deletionAdapterOfAdEntity;
    private final AbstractC1236o __insertionAdapterOfAdEntity;
    private final P __preparedStmtOfDeleteAll;
    private final P __preparedStmtOfDeleteByAdId;
    private final P __preparedStmtOfDeleteBySlotId;
    private final P __preparedStmtOfDisableAllData;
    private final P __preparedStmtOfDisableAllData_1;
    private final P __preparedStmtOfEnableAllData;
    private final AbstractC1235n __updateAdapterOfAdEntity;

    public AdDao_Impl(G __db) {
        this.__db = __db;
        this.__insertionAdapterOfAdEntity = new a(__db, 8, false);
        this.__deletionAdapterOfAdEntity = new b(__db, 3, false);
        this.__updateAdapterOfAdEntity = new b(__db, 4, false);
        this.__preparedStmtOfDeleteBySlotId = new c(__db, 22);
        this.__preparedStmtOfDeleteByAdId = new c(__db, 23);
        this.__preparedStmtOfEnableAllData = new c(__db, 24);
        this.__preparedStmtOfDisableAllData = new c(__db, 25);
        this.__preparedStmtOfDisableAllData_1 = new c(__db, 26);
        this.__preparedStmtOfDeleteAll = new c(__db, 27);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementA = this.__preparedStmtOfDeleteAll.a();
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementA.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.c(supportSQLiteStatementA);
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public void deleteBatch(final List<AdEntity> users) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfAdEntity.f(users);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public void deleteByAdId(final String adId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementA = this.__preparedStmtOfDeleteByAdId.a();
        if (adId == null) {
            supportSQLiteStatementA.bindNull(1);
        } else {
            supportSQLiteStatementA.bindString(1, adId);
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementA.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteByAdId.c(supportSQLiteStatementA);
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public void deleteBySlotId(final String slotId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementA = this.__preparedStmtOfDeleteBySlotId.a();
        if (slotId == null) {
            supportSQLiteStatementA.bindNull(1);
        } else {
            supportSQLiteStatementA.bindString(1, slotId);
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementA.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteBySlotId.c(supportSQLiteStatementA);
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public void disableAllData(final String slotId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementA = this.__preparedStmtOfDisableAllData.a();
        if (slotId == null) {
            supportSQLiteStatementA.bindNull(1);
        } else {
            supportSQLiteStatementA.bindString(1, slotId);
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementA.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDisableAllData.c(supportSQLiteStatementA);
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public void enableAllData(final String slotId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementA = this.__preparedStmtOfEnableAllData.a();
        if (slotId == null) {
            supportSQLiteStatementA.bindNull(1);
        } else {
            supportSQLiteStatementA.bindString(1, slotId);
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementA.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfEnableAllData.c(supportSQLiteStatementA);
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public void insert(final AdEntity event) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfAdEntity.e(event);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public List<AdEntity> query(final int count) throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM ad_detail ORDER BY update_time DESC LIMIT (?)", 1);
        lAcquire.bindLong(1, count);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(this.__db, lAcquire, false);
        try {
            int iK = g.k(cursorK, "ad_id");
            int iK2 = g.k(cursorK, "application_id");
            int iK3 = g.k(cursorK, "ad_slot_id");
            int iK4 = g.k(cursorK, "image_url");
            int iK5 = g.k(cursorK, "image_url_dark");
            int iK6 = g.k(cursorK, "secondary_image_url");
            int iK7 = g.k(cursorK, "secondary_image_url_dark");
            int iK8 = g.k(cursorK, "jump_type");
            int iK9 = g.k(cursorK, "relative_url");
            int iK10 = g.k(cursorK, "image_dimention");
            int iK11 = g.k(cursorK, "country_code");
            int iK12 = g.k(cursorK, "valid_start_time");
            int iK13 = g.k(cursorK, "valid_end_time");
            int iK14 = g.k(cursorK, "show_times");
            l5 = lAcquire;
            try {
                int iK15 = g.k(cursorK, "show_times_condition");
                int iK16 = g.k(cursorK, "click_frequency");
                int iK17 = g.k(cursorK, "max_close_count");
                int iK18 = g.k(cursorK, "show_dates");
                int iK19 = g.k(cursorK, "multiple_imageUrl");
                int iK20 = g.k(cursorK, "text_content");
                int iK21 = g.k(cursorK, "text_font_size");
                int iK22 = g.k(cursorK, "text_font_color");
                int iK23 = g.k(cursorK, "text_font_color_dark");
                int iK24 = g.k(cursorK, "text_scroll_speed");
                int iK25 = g.k(cursorK, "background_color");
                int iK26 = g.k(cursorK, "background_color_dark");
                int iK27 = g.k(cursorK, AdRevenueScheme.AD_TYPE);
                int iK28 = g.k(cursorK, "native_ad_title");
                int iK29 = g.k(cursorK, "native_ad_content");
                int iK30 = g.k(cursorK, "native_ad_photo");
                int iK31 = g.k(cursorK, "show_close_button");
                int iK32 = g.k(cursorK, "has_show_times");
                int iK33 = g.k(cursorK, "show_date");
                int iK34 = g.k(cursorK, "click_date");
                int iK35 = g.k(cursorK, "close_time");
                int iK36 = g.k(cursorK, "close_count");
                int iK37 = g.k(cursorK, "create_time");
                int iK38 = g.k(cursorK, "update_time");
                int iK39 = g.k(cursorK, "current_enable");
                int iK40 = g.k(cursorK, "jump_params");
                int iK41 = g.k(cursorK, "default_img_res");
                int iK42 = g.k(cursorK, "text_icon_url");
                int iK43 = g.k(cursorK, "text_icon_url_dark");
                int iK44 = g.k(cursorK, "alpha");
                int iK45 = g.k(cursorK, "display_order");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    AdEntity adEntity = new AdEntity();
                    ArrayList arrayList2 = arrayList;
                    if (cursorK.isNull(iK)) {
                        adEntity.adId = null;
                    } else {
                        adEntity.adId = cursorK.getString(iK);
                    }
                    if (cursorK.isNull(iK2)) {
                        adEntity.applicationId = null;
                    } else {
                        adEntity.applicationId = cursorK.getString(iK2);
                    }
                    if (cursorK.isNull(iK3)) {
                        adEntity.adSlotId = null;
                    } else {
                        adEntity.adSlotId = cursorK.getString(iK3);
                    }
                    if (cursorK.isNull(iK4)) {
                        adEntity.imageUrl = null;
                    } else {
                        adEntity.imageUrl = cursorK.getString(iK4);
                    }
                    if (cursorK.isNull(iK5)) {
                        adEntity.imageUrlDark = null;
                    } else {
                        adEntity.imageUrlDark = cursorK.getString(iK5);
                    }
                    if (cursorK.isNull(iK6)) {
                        adEntity.h5ImageUrl = null;
                    } else {
                        adEntity.h5ImageUrl = cursorK.getString(iK6);
                    }
                    if (cursorK.isNull(iK7)) {
                        adEntity.h5ImageUrlDark = null;
                    } else {
                        adEntity.h5ImageUrlDark = cursorK.getString(iK7);
                    }
                    if (cursorK.isNull(iK8)) {
                        adEntity.jumpType = null;
                    } else {
                        adEntity.jumpType = cursorK.getString(iK8);
                    }
                    if (cursorK.isNull(iK9)) {
                        adEntity.relativeUrl = null;
                    } else {
                        adEntity.relativeUrl = cursorK.getString(iK9);
                    }
                    if (cursorK.isNull(iK10)) {
                        adEntity.imageDimention = null;
                    } else {
                        adEntity.imageDimention = cursorK.getString(iK10);
                    }
                    if (cursorK.isNull(iK11)) {
                        adEntity.countryCode = null;
                    } else {
                        adEntity.countryCode = cursorK.getString(iK11);
                    }
                    int i10 = iK2;
                    int i11 = iK3;
                    adEntity.validStartTime = cursorK.getLong(iK12);
                    adEntity.validEndTime = cursorK.getLong(iK13);
                    int i12 = i7;
                    adEntity.showTimes = cursorK.getInt(i12);
                    int i13 = iK15;
                    if (cursorK.isNull(i13)) {
                        adEntity.showTimesCondition = null;
                    } else {
                        adEntity.showTimesCondition = Integer.valueOf(cursorK.getInt(i13));
                    }
                    int i14 = iK16;
                    if (cursorK.isNull(i14)) {
                        adEntity.clickFrequency = null;
                    } else {
                        adEntity.clickFrequency = Integer.valueOf(cursorK.getInt(i14));
                    }
                    int i15 = iK17;
                    adEntity.closeControl = cursorK.getInt(i15);
                    int i16 = iK18;
                    if (cursorK.isNull(i16)) {
                        adEntity.showDates = null;
                    } else {
                        adEntity.showDates = cursorK.getString(i16);
                    }
                    int i17 = iK19;
                    if (cursorK.isNull(i17)) {
                        adEntity.multipleImageUrl = null;
                    } else {
                        adEntity.multipleImageUrl = cursorK.getString(i17);
                    }
                    int i18 = iK20;
                    if (cursorK.isNull(i18)) {
                        adEntity.textContent = null;
                    } else {
                        adEntity.textContent = cursorK.getString(i18);
                    }
                    int i19 = iK21;
                    if (cursorK.isNull(i19)) {
                        adEntity.textFontSize = null;
                    } else {
                        adEntity.textFontSize = cursorK.getString(i19);
                    }
                    int i20 = iK22;
                    if (cursorK.isNull(i20)) {
                        adEntity.textFontColor = null;
                    } else {
                        adEntity.textFontColor = cursorK.getString(i20);
                    }
                    int i21 = iK23;
                    if (cursorK.isNull(i21)) {
                        adEntity.textFontColorDark = null;
                    } else {
                        adEntity.textFontColorDark = cursorK.getString(i21);
                    }
                    int i22 = iK24;
                    if (cursorK.isNull(i22)) {
                        adEntity.textScrollSpeed = null;
                    } else {
                        adEntity.textScrollSpeed = cursorK.getString(i22);
                    }
                    int i23 = iK25;
                    if (cursorK.isNull(i23)) {
                        adEntity.backgroundColor = null;
                    } else {
                        adEntity.backgroundColor = cursorK.getString(i23);
                    }
                    int i24 = iK26;
                    if (cursorK.isNull(i24)) {
                        adEntity.backgroundColorDark = null;
                    } else {
                        adEntity.backgroundColorDark = cursorK.getString(i24);
                    }
                    int i25 = iK27;
                    adEntity.adType = cursorK.getInt(i25);
                    int i26 = iK28;
                    if (cursorK.isNull(i26)) {
                        adEntity.nativeAdTitle = null;
                    } else {
                        adEntity.nativeAdTitle = cursorK.getString(i26);
                    }
                    int i27 = iK29;
                    if (cursorK.isNull(i27)) {
                        adEntity.nativeAdContent = null;
                    } else {
                        adEntity.nativeAdContent = cursorK.getString(i27);
                    }
                    int i28 = iK30;
                    if (cursorK.isNull(i28)) {
                        adEntity.nativeAdPhoto = null;
                    } else {
                        adEntity.nativeAdPhoto = cursorK.getString(i28);
                    }
                    int i29 = iK31;
                    adEntity.showCloseButton = cursorK.getInt(i29);
                    int i30 = iK32;
                    adEntity.hasShowTimes = cursorK.getInt(i30);
                    i7 = i12;
                    int i31 = iK33;
                    adEntity.showDate = cursorK.getLong(i31);
                    int i32 = iK34;
                    int i33 = iK4;
                    adEntity.clickDate = cursorK.getLong(i32);
                    int i34 = iK35;
                    int i35 = iK5;
                    adEntity.closeTime = cursorK.getLong(i34);
                    int i36 = iK36;
                    adEntity.closeCount = cursorK.getInt(i36);
                    int i37 = iK37;
                    adEntity.createTime = cursorK.getLong(i37);
                    int i38 = iK38;
                    adEntity.updateTime = cursorK.getLong(i38);
                    int i39 = iK39;
                    adEntity.curEnable = cursorK.getInt(i39);
                    int i40 = iK40;
                    if (cursorK.isNull(i40)) {
                        adEntity.jumpParams = null;
                    } else {
                        adEntity.jumpParams = cursorK.getString(i40);
                    }
                    iK41 = iK41;
                    adEntity.defaultImgRes = cursorK.getInt(iK41);
                    iK42 = iK42;
                    if (cursorK.isNull(iK42)) {
                        adEntity.textIconUrl = null;
                    } else {
                        adEntity.textIconUrl = cursorK.getString(iK42);
                    }
                    int i41 = iK43;
                    if (cursorK.isNull(i41)) {
                        adEntity.textIconUrlDark = null;
                    } else {
                        adEntity.textIconUrlDark = cursorK.getString(i41);
                    }
                    iK43 = i41;
                    int i42 = iK44;
                    adEntity.alpha = cursorK.getInt(i42);
                    iK44 = i42;
                    int i43 = iK45;
                    adEntity.displayOrder = cursorK.getInt(i43);
                    arrayList = arrayList2;
                    arrayList.add(adEntity);
                    iK37 = i37;
                    iK5 = i35;
                    iK35 = i34;
                    iK45 = i43;
                    iK = iK;
                    iK15 = i13;
                    iK33 = i31;
                    iK40 = i40;
                    iK4 = i33;
                    iK34 = i32;
                    iK36 = i36;
                    iK38 = i38;
                    iK2 = i10;
                    iK16 = i14;
                    iK17 = i15;
                    iK18 = i16;
                    iK19 = i17;
                    iK20 = i18;
                    iK21 = i19;
                    iK22 = i20;
                    iK23 = i21;
                    iK24 = i22;
                    iK25 = i23;
                    iK26 = i24;
                    iK27 = i25;
                    iK28 = i26;
                    iK29 = i27;
                    iK30 = i28;
                    iK31 = i29;
                    iK32 = i30;
                    iK39 = i39;
                    iK3 = i11;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public List<AdEntity> queryAllIdBySlotIdLimitCount(final String slotId, final String countryCode, final int count) throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM ad_detail WHERE ad_slot_id == (?) AND country_code == (?) ORDER BY update_time DESC LIMIT (?)", 3);
        if (slotId == null) {
            lAcquire.bindNull(1);
        } else {
            lAcquire.bindString(1, slotId);
        }
        if (countryCode == null) {
            lAcquire.bindNull(2);
        } else {
            lAcquire.bindString(2, countryCode);
        }
        lAcquire.bindLong(3, count);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(this.__db, lAcquire, false);
        try {
            int iK = g.k(cursorK, "ad_id");
            int iK2 = g.k(cursorK, "application_id");
            int iK3 = g.k(cursorK, "ad_slot_id");
            int iK4 = g.k(cursorK, "image_url");
            int iK5 = g.k(cursorK, "image_url_dark");
            int iK6 = g.k(cursorK, "secondary_image_url");
            int iK7 = g.k(cursorK, "secondary_image_url_dark");
            int iK8 = g.k(cursorK, "jump_type");
            int iK9 = g.k(cursorK, "relative_url");
            int iK10 = g.k(cursorK, "image_dimention");
            int iK11 = g.k(cursorK, "country_code");
            int iK12 = g.k(cursorK, "valid_start_time");
            int iK13 = g.k(cursorK, "valid_end_time");
            int iK14 = g.k(cursorK, "show_times");
            l5 = lAcquire;
            try {
                int iK15 = g.k(cursorK, "show_times_condition");
                int iK16 = g.k(cursorK, "click_frequency");
                int iK17 = g.k(cursorK, "max_close_count");
                int iK18 = g.k(cursorK, "show_dates");
                int iK19 = g.k(cursorK, "multiple_imageUrl");
                int iK20 = g.k(cursorK, "text_content");
                int iK21 = g.k(cursorK, "text_font_size");
                int iK22 = g.k(cursorK, "text_font_color");
                int iK23 = g.k(cursorK, "text_font_color_dark");
                int iK24 = g.k(cursorK, "text_scroll_speed");
                int iK25 = g.k(cursorK, "background_color");
                int iK26 = g.k(cursorK, "background_color_dark");
                int iK27 = g.k(cursorK, AdRevenueScheme.AD_TYPE);
                int iK28 = g.k(cursorK, "native_ad_title");
                int iK29 = g.k(cursorK, "native_ad_content");
                int iK30 = g.k(cursorK, "native_ad_photo");
                int iK31 = g.k(cursorK, "show_close_button");
                int iK32 = g.k(cursorK, "has_show_times");
                int iK33 = g.k(cursorK, "show_date");
                int iK34 = g.k(cursorK, "click_date");
                int iK35 = g.k(cursorK, "close_time");
                int iK36 = g.k(cursorK, "close_count");
                int iK37 = g.k(cursorK, "create_time");
                int iK38 = g.k(cursorK, "update_time");
                int iK39 = g.k(cursorK, "current_enable");
                int iK40 = g.k(cursorK, "jump_params");
                int iK41 = g.k(cursorK, "default_img_res");
                int iK42 = g.k(cursorK, "text_icon_url");
                int iK43 = g.k(cursorK, "text_icon_url_dark");
                int iK44 = g.k(cursorK, "alpha");
                int iK45 = g.k(cursorK, "display_order");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    AdEntity adEntity = new AdEntity();
                    ArrayList arrayList2 = arrayList;
                    if (cursorK.isNull(iK)) {
                        adEntity.adId = null;
                    } else {
                        adEntity.adId = cursorK.getString(iK);
                    }
                    if (cursorK.isNull(iK2)) {
                        adEntity.applicationId = null;
                    } else {
                        adEntity.applicationId = cursorK.getString(iK2);
                    }
                    if (cursorK.isNull(iK3)) {
                        adEntity.adSlotId = null;
                    } else {
                        adEntity.adSlotId = cursorK.getString(iK3);
                    }
                    if (cursorK.isNull(iK4)) {
                        adEntity.imageUrl = null;
                    } else {
                        adEntity.imageUrl = cursorK.getString(iK4);
                    }
                    if (cursorK.isNull(iK5)) {
                        adEntity.imageUrlDark = null;
                    } else {
                        adEntity.imageUrlDark = cursorK.getString(iK5);
                    }
                    if (cursorK.isNull(iK6)) {
                        adEntity.h5ImageUrl = null;
                    } else {
                        adEntity.h5ImageUrl = cursorK.getString(iK6);
                    }
                    if (cursorK.isNull(iK7)) {
                        adEntity.h5ImageUrlDark = null;
                    } else {
                        adEntity.h5ImageUrlDark = cursorK.getString(iK7);
                    }
                    if (cursorK.isNull(iK8)) {
                        adEntity.jumpType = null;
                    } else {
                        adEntity.jumpType = cursorK.getString(iK8);
                    }
                    if (cursorK.isNull(iK9)) {
                        adEntity.relativeUrl = null;
                    } else {
                        adEntity.relativeUrl = cursorK.getString(iK9);
                    }
                    if (cursorK.isNull(iK10)) {
                        adEntity.imageDimention = null;
                    } else {
                        adEntity.imageDimention = cursorK.getString(iK10);
                    }
                    if (cursorK.isNull(iK11)) {
                        adEntity.countryCode = null;
                    } else {
                        adEntity.countryCode = cursorK.getString(iK11);
                    }
                    int i10 = iK2;
                    adEntity.validStartTime = cursorK.getLong(iK12);
                    adEntity.validEndTime = cursorK.getLong(iK13);
                    i7 = i7;
                    adEntity.showTimes = cursorK.getInt(i7);
                    int i11 = iK15;
                    if (cursorK.isNull(i11)) {
                        adEntity.showTimesCondition = null;
                    } else {
                        adEntity.showTimesCondition = Integer.valueOf(cursorK.getInt(i11));
                    }
                    int i12 = iK16;
                    if (cursorK.isNull(i12)) {
                        adEntity.clickFrequency = null;
                    } else {
                        adEntity.clickFrequency = Integer.valueOf(cursorK.getInt(i12));
                    }
                    iK17 = iK17;
                    iK16 = i12;
                    adEntity.closeControl = cursorK.getInt(iK17);
                    iK18 = iK18;
                    if (cursorK.isNull(iK18)) {
                        adEntity.showDates = null;
                    } else {
                        adEntity.showDates = cursorK.getString(iK18);
                    }
                    iK19 = iK19;
                    if (cursorK.isNull(iK19)) {
                        adEntity.multipleImageUrl = null;
                    } else {
                        adEntity.multipleImageUrl = cursorK.getString(iK19);
                    }
                    iK20 = iK20;
                    if (cursorK.isNull(iK20)) {
                        adEntity.textContent = null;
                    } else {
                        adEntity.textContent = cursorK.getString(iK20);
                    }
                    iK21 = iK21;
                    if (cursorK.isNull(iK21)) {
                        adEntity.textFontSize = null;
                    } else {
                        adEntity.textFontSize = cursorK.getString(iK21);
                    }
                    iK22 = iK22;
                    if (cursorK.isNull(iK22)) {
                        adEntity.textFontColor = null;
                    } else {
                        adEntity.textFontColor = cursorK.getString(iK22);
                    }
                    iK23 = iK23;
                    if (cursorK.isNull(iK23)) {
                        adEntity.textFontColorDark = null;
                    } else {
                        adEntity.textFontColorDark = cursorK.getString(iK23);
                    }
                    iK24 = iK24;
                    if (cursorK.isNull(iK24)) {
                        adEntity.textScrollSpeed = null;
                    } else {
                        adEntity.textScrollSpeed = cursorK.getString(iK24);
                    }
                    iK25 = iK25;
                    if (cursorK.isNull(iK25)) {
                        adEntity.backgroundColor = null;
                    } else {
                        adEntity.backgroundColor = cursorK.getString(iK25);
                    }
                    int i13 = iK26;
                    if (cursorK.isNull(i13)) {
                        adEntity.backgroundColorDark = null;
                    } else {
                        adEntity.backgroundColorDark = cursorK.getString(i13);
                    }
                    iK26 = i13;
                    iK27 = iK27;
                    adEntity.adType = cursorK.getInt(iK27);
                    iK28 = iK28;
                    if (cursorK.isNull(iK28)) {
                        adEntity.nativeAdTitle = null;
                    } else {
                        adEntity.nativeAdTitle = cursorK.getString(iK28);
                    }
                    iK29 = iK29;
                    if (cursorK.isNull(iK29)) {
                        adEntity.nativeAdContent = null;
                    } else {
                        adEntity.nativeAdContent = cursorK.getString(iK29);
                    }
                    int i14 = iK30;
                    if (cursorK.isNull(i14)) {
                        adEntity.nativeAdPhoto = null;
                    } else {
                        adEntity.nativeAdPhoto = cursorK.getString(i14);
                    }
                    iK30 = i14;
                    int i15 = iK31;
                    adEntity.showCloseButton = cursorK.getInt(i15);
                    iK31 = i15;
                    int i16 = iK32;
                    adEntity.hasShowTimes = cursorK.getInt(i16);
                    int i17 = iK3;
                    int i18 = iK33;
                    adEntity.showDate = cursorK.getLong(i18);
                    int i19 = iK34;
                    int i20 = iK4;
                    adEntity.clickDate = cursorK.getLong(i19);
                    int i21 = iK35;
                    adEntity.closeTime = cursorK.getLong(i21);
                    int i22 = iK36;
                    adEntity.closeCount = cursorK.getInt(i22);
                    int i23 = iK37;
                    adEntity.createTime = cursorK.getLong(i23);
                    int i24 = iK38;
                    adEntity.updateTime = cursorK.getLong(i24);
                    int i25 = iK39;
                    adEntity.curEnable = cursorK.getInt(i25);
                    int i26 = iK40;
                    if (cursorK.isNull(i26)) {
                        adEntity.jumpParams = null;
                    } else {
                        adEntity.jumpParams = cursorK.getString(i26);
                    }
                    iK41 = iK41;
                    adEntity.defaultImgRes = cursorK.getInt(iK41);
                    iK42 = iK42;
                    if (cursorK.isNull(iK42)) {
                        adEntity.textIconUrl = null;
                    } else {
                        adEntity.textIconUrl = cursorK.getString(iK42);
                    }
                    int i27 = iK43;
                    if (cursorK.isNull(i27)) {
                        adEntity.textIconUrlDark = null;
                    } else {
                        adEntity.textIconUrlDark = cursorK.getString(i27);
                    }
                    iK43 = i27;
                    int i28 = iK44;
                    adEntity.alpha = cursorK.getInt(i28);
                    iK44 = i28;
                    int i29 = iK45;
                    adEntity.displayOrder = cursorK.getInt(i29);
                    arrayList = arrayList2;
                    arrayList.add(adEntity);
                    iK36 = i22;
                    iK4 = i20;
                    iK34 = i19;
                    iK35 = i21;
                    iK45 = i29;
                    iK = iK;
                    iK15 = i11;
                    iK33 = i18;
                    iK37 = i23;
                    iK38 = i24;
                    iK3 = i17;
                    iK32 = i16;
                    iK39 = i25;
                    iK40 = i26;
                    iK2 = i10;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public AdEntity queryByAdId(final String adId) throws Throwable {
        L l5;
        AdEntity adEntity;
        L lAcquire = L.f17714j.acquire("SELECT * FROM ad_detail WHERE ad_id == (?)", 1);
        if (adId == null) {
            lAcquire.bindNull(1);
        } else {
            lAcquire.bindString(1, adId);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(this.__db, lAcquire, false);
        try {
            int iK = g.k(cursorK, "ad_id");
            int iK2 = g.k(cursorK, "application_id");
            int iK3 = g.k(cursorK, "ad_slot_id");
            int iK4 = g.k(cursorK, "image_url");
            int iK5 = g.k(cursorK, "image_url_dark");
            int iK6 = g.k(cursorK, "secondary_image_url");
            int iK7 = g.k(cursorK, "secondary_image_url_dark");
            int iK8 = g.k(cursorK, "jump_type");
            int iK9 = g.k(cursorK, "relative_url");
            int iK10 = g.k(cursorK, "image_dimention");
            int iK11 = g.k(cursorK, "country_code");
            int iK12 = g.k(cursorK, "valid_start_time");
            int iK13 = g.k(cursorK, "valid_end_time");
            int iK14 = g.k(cursorK, "show_times");
            l5 = lAcquire;
            try {
                int iK15 = g.k(cursorK, "show_times_condition");
                int iK16 = g.k(cursorK, "click_frequency");
                int iK17 = g.k(cursorK, "max_close_count");
                int iK18 = g.k(cursorK, "show_dates");
                int iK19 = g.k(cursorK, "multiple_imageUrl");
                int iK20 = g.k(cursorK, "text_content");
                int iK21 = g.k(cursorK, "text_font_size");
                int iK22 = g.k(cursorK, "text_font_color");
                int iK23 = g.k(cursorK, "text_font_color_dark");
                int iK24 = g.k(cursorK, "text_scroll_speed");
                int iK25 = g.k(cursorK, "background_color");
                int iK26 = g.k(cursorK, "background_color_dark");
                int iK27 = g.k(cursorK, AdRevenueScheme.AD_TYPE);
                int iK28 = g.k(cursorK, "native_ad_title");
                int iK29 = g.k(cursorK, "native_ad_content");
                int iK30 = g.k(cursorK, "native_ad_photo");
                int iK31 = g.k(cursorK, "show_close_button");
                int iK32 = g.k(cursorK, "has_show_times");
                int iK33 = g.k(cursorK, "show_date");
                int iK34 = g.k(cursorK, "click_date");
                int iK35 = g.k(cursorK, "close_time");
                int iK36 = g.k(cursorK, "close_count");
                int iK37 = g.k(cursorK, "create_time");
                int iK38 = g.k(cursorK, "update_time");
                int iK39 = g.k(cursorK, "current_enable");
                int iK40 = g.k(cursorK, "jump_params");
                int iK41 = g.k(cursorK, "default_img_res");
                int iK42 = g.k(cursorK, "text_icon_url");
                int iK43 = g.k(cursorK, "text_icon_url_dark");
                int iK44 = g.k(cursorK, "alpha");
                int iK45 = g.k(cursorK, "display_order");
                if (cursorK.moveToFirst()) {
                    adEntity = new AdEntity();
                    if (cursorK.isNull(iK)) {
                        adEntity.adId = null;
                    } else {
                        adEntity.adId = cursorK.getString(iK);
                    }
                    if (cursorK.isNull(iK2)) {
                        adEntity.applicationId = null;
                    } else {
                        adEntity.applicationId = cursorK.getString(iK2);
                    }
                    if (cursorK.isNull(iK3)) {
                        adEntity.adSlotId = null;
                    } else {
                        adEntity.adSlotId = cursorK.getString(iK3);
                    }
                    if (cursorK.isNull(iK4)) {
                        adEntity.imageUrl = null;
                    } else {
                        adEntity.imageUrl = cursorK.getString(iK4);
                    }
                    if (cursorK.isNull(iK5)) {
                        adEntity.imageUrlDark = null;
                    } else {
                        adEntity.imageUrlDark = cursorK.getString(iK5);
                    }
                    if (cursorK.isNull(iK6)) {
                        adEntity.h5ImageUrl = null;
                    } else {
                        adEntity.h5ImageUrl = cursorK.getString(iK6);
                    }
                    if (cursorK.isNull(iK7)) {
                        adEntity.h5ImageUrlDark = null;
                    } else {
                        adEntity.h5ImageUrlDark = cursorK.getString(iK7);
                    }
                    if (cursorK.isNull(iK8)) {
                        adEntity.jumpType = null;
                    } else {
                        adEntity.jumpType = cursorK.getString(iK8);
                    }
                    if (cursorK.isNull(iK9)) {
                        adEntity.relativeUrl = null;
                    } else {
                        adEntity.relativeUrl = cursorK.getString(iK9);
                    }
                    if (cursorK.isNull(iK10)) {
                        adEntity.imageDimention = null;
                    } else {
                        adEntity.imageDimention = cursorK.getString(iK10);
                    }
                    if (cursorK.isNull(iK11)) {
                        adEntity.countryCode = null;
                    } else {
                        adEntity.countryCode = cursorK.getString(iK11);
                    }
                    adEntity.validStartTime = cursorK.getLong(iK12);
                    adEntity.validEndTime = cursorK.getLong(iK13);
                    adEntity.showTimes = cursorK.getInt(iK14);
                    if (cursorK.isNull(iK15)) {
                        adEntity.showTimesCondition = null;
                    } else {
                        adEntity.showTimesCondition = Integer.valueOf(cursorK.getInt(iK15));
                    }
                    if (cursorK.isNull(iK16)) {
                        adEntity.clickFrequency = null;
                    } else {
                        adEntity.clickFrequency = Integer.valueOf(cursorK.getInt(iK16));
                    }
                    adEntity.closeControl = cursorK.getInt(iK17);
                    if (cursorK.isNull(iK18)) {
                        adEntity.showDates = null;
                    } else {
                        adEntity.showDates = cursorK.getString(iK18);
                    }
                    if (cursorK.isNull(iK19)) {
                        adEntity.multipleImageUrl = null;
                    } else {
                        adEntity.multipleImageUrl = cursorK.getString(iK19);
                    }
                    if (cursorK.isNull(iK20)) {
                        adEntity.textContent = null;
                    } else {
                        adEntity.textContent = cursorK.getString(iK20);
                    }
                    if (cursorK.isNull(iK21)) {
                        adEntity.textFontSize = null;
                    } else {
                        adEntity.textFontSize = cursorK.getString(iK21);
                    }
                    if (cursorK.isNull(iK22)) {
                        adEntity.textFontColor = null;
                    } else {
                        adEntity.textFontColor = cursorK.getString(iK22);
                    }
                    if (cursorK.isNull(iK23)) {
                        adEntity.textFontColorDark = null;
                    } else {
                        adEntity.textFontColorDark = cursorK.getString(iK23);
                    }
                    if (cursorK.isNull(iK24)) {
                        adEntity.textScrollSpeed = null;
                    } else {
                        adEntity.textScrollSpeed = cursorK.getString(iK24);
                    }
                    if (cursorK.isNull(iK25)) {
                        adEntity.backgroundColor = null;
                    } else {
                        adEntity.backgroundColor = cursorK.getString(iK25);
                    }
                    if (cursorK.isNull(iK26)) {
                        adEntity.backgroundColorDark = null;
                    } else {
                        adEntity.backgroundColorDark = cursorK.getString(iK26);
                    }
                    adEntity.adType = cursorK.getInt(iK27);
                    if (cursorK.isNull(iK28)) {
                        adEntity.nativeAdTitle = null;
                    } else {
                        adEntity.nativeAdTitle = cursorK.getString(iK28);
                    }
                    if (cursorK.isNull(iK29)) {
                        adEntity.nativeAdContent = null;
                    } else {
                        adEntity.nativeAdContent = cursorK.getString(iK29);
                    }
                    if (cursorK.isNull(iK30)) {
                        adEntity.nativeAdPhoto = null;
                    } else {
                        adEntity.nativeAdPhoto = cursorK.getString(iK30);
                    }
                    adEntity.showCloseButton = cursorK.getInt(iK31);
                    adEntity.hasShowTimes = cursorK.getInt(iK32);
                    adEntity.showDate = cursorK.getLong(iK33);
                    adEntity.clickDate = cursorK.getLong(iK34);
                    adEntity.closeTime = cursorK.getLong(iK35);
                    adEntity.closeCount = cursorK.getInt(iK36);
                    adEntity.createTime = cursorK.getLong(iK37);
                    adEntity.updateTime = cursorK.getLong(iK38);
                    adEntity.curEnable = cursorK.getInt(iK39);
                    if (cursorK.isNull(iK40)) {
                        adEntity.jumpParams = null;
                    } else {
                        adEntity.jumpParams = cursorK.getString(iK40);
                    }
                    adEntity.defaultImgRes = cursorK.getInt(iK41);
                    if (cursorK.isNull(iK42)) {
                        adEntity.textIconUrl = null;
                    } else {
                        adEntity.textIconUrl = cursorK.getString(iK42);
                    }
                    if (cursorK.isNull(iK43)) {
                        adEntity.textIconUrlDark = null;
                    } else {
                        adEntity.textIconUrlDark = cursorK.getString(iK43);
                    }
                    adEntity.alpha = cursorK.getInt(iK44);
                    adEntity.displayOrder = cursorK.getInt(iK45);
                } else {
                    adEntity = null;
                }
                cursorK.close();
                l5.release();
                return adEntity;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public List<AdEntity> queryBySlotId(final String slotId, final String countryCode) throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM ad_detail WHERE ad_slot_id == (?) AND country_code == (?) AND current_enable == 1 ORDER BY update_time DESC", 2);
        if (slotId == null) {
            lAcquire.bindNull(1);
        } else {
            lAcquire.bindString(1, slotId);
        }
        if (countryCode == null) {
            lAcquire.bindNull(2);
        } else {
            lAcquire.bindString(2, countryCode);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(this.__db, lAcquire, false);
        try {
            int iK = g.k(cursorK, "ad_id");
            int iK2 = g.k(cursorK, "application_id");
            int iK3 = g.k(cursorK, "ad_slot_id");
            int iK4 = g.k(cursorK, "image_url");
            int iK5 = g.k(cursorK, "image_url_dark");
            int iK6 = g.k(cursorK, "secondary_image_url");
            int iK7 = g.k(cursorK, "secondary_image_url_dark");
            int iK8 = g.k(cursorK, "jump_type");
            int iK9 = g.k(cursorK, "relative_url");
            int iK10 = g.k(cursorK, "image_dimention");
            int iK11 = g.k(cursorK, "country_code");
            int iK12 = g.k(cursorK, "valid_start_time");
            int iK13 = g.k(cursorK, "valid_end_time");
            int iK14 = g.k(cursorK, "show_times");
            l5 = lAcquire;
            try {
                int iK15 = g.k(cursorK, "show_times_condition");
                int iK16 = g.k(cursorK, "click_frequency");
                int iK17 = g.k(cursorK, "max_close_count");
                int iK18 = g.k(cursorK, "show_dates");
                int iK19 = g.k(cursorK, "multiple_imageUrl");
                int iK20 = g.k(cursorK, "text_content");
                int iK21 = g.k(cursorK, "text_font_size");
                int iK22 = g.k(cursorK, "text_font_color");
                int iK23 = g.k(cursorK, "text_font_color_dark");
                int iK24 = g.k(cursorK, "text_scroll_speed");
                int iK25 = g.k(cursorK, "background_color");
                int iK26 = g.k(cursorK, "background_color_dark");
                int iK27 = g.k(cursorK, AdRevenueScheme.AD_TYPE);
                int iK28 = g.k(cursorK, "native_ad_title");
                int iK29 = g.k(cursorK, "native_ad_content");
                int iK30 = g.k(cursorK, "native_ad_photo");
                int iK31 = g.k(cursorK, "show_close_button");
                int iK32 = g.k(cursorK, "has_show_times");
                int iK33 = g.k(cursorK, "show_date");
                int iK34 = g.k(cursorK, "click_date");
                int iK35 = g.k(cursorK, "close_time");
                int iK36 = g.k(cursorK, "close_count");
                int iK37 = g.k(cursorK, "create_time");
                int iK38 = g.k(cursorK, "update_time");
                int iK39 = g.k(cursorK, "current_enable");
                int iK40 = g.k(cursorK, "jump_params");
                int iK41 = g.k(cursorK, "default_img_res");
                int iK42 = g.k(cursorK, "text_icon_url");
                int iK43 = g.k(cursorK, "text_icon_url_dark");
                int iK44 = g.k(cursorK, "alpha");
                int iK45 = g.k(cursorK, "display_order");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    AdEntity adEntity = new AdEntity();
                    ArrayList arrayList2 = arrayList;
                    if (cursorK.isNull(iK)) {
                        adEntity.adId = null;
                    } else {
                        adEntity.adId = cursorK.getString(iK);
                    }
                    if (cursorK.isNull(iK2)) {
                        adEntity.applicationId = null;
                    } else {
                        adEntity.applicationId = cursorK.getString(iK2);
                    }
                    if (cursorK.isNull(iK3)) {
                        adEntity.adSlotId = null;
                    } else {
                        adEntity.adSlotId = cursorK.getString(iK3);
                    }
                    if (cursorK.isNull(iK4)) {
                        adEntity.imageUrl = null;
                    } else {
                        adEntity.imageUrl = cursorK.getString(iK4);
                    }
                    if (cursorK.isNull(iK5)) {
                        adEntity.imageUrlDark = null;
                    } else {
                        adEntity.imageUrlDark = cursorK.getString(iK5);
                    }
                    if (cursorK.isNull(iK6)) {
                        adEntity.h5ImageUrl = null;
                    } else {
                        adEntity.h5ImageUrl = cursorK.getString(iK6);
                    }
                    if (cursorK.isNull(iK7)) {
                        adEntity.h5ImageUrlDark = null;
                    } else {
                        adEntity.h5ImageUrlDark = cursorK.getString(iK7);
                    }
                    if (cursorK.isNull(iK8)) {
                        adEntity.jumpType = null;
                    } else {
                        adEntity.jumpType = cursorK.getString(iK8);
                    }
                    if (cursorK.isNull(iK9)) {
                        adEntity.relativeUrl = null;
                    } else {
                        adEntity.relativeUrl = cursorK.getString(iK9);
                    }
                    if (cursorK.isNull(iK10)) {
                        adEntity.imageDimention = null;
                    } else {
                        adEntity.imageDimention = cursorK.getString(iK10);
                    }
                    if (cursorK.isNull(iK11)) {
                        adEntity.countryCode = null;
                    } else {
                        adEntity.countryCode = cursorK.getString(iK11);
                    }
                    int i10 = iK2;
                    adEntity.validStartTime = cursorK.getLong(iK12);
                    adEntity.validEndTime = cursorK.getLong(iK13);
                    i7 = i7;
                    adEntity.showTimes = cursorK.getInt(i7);
                    int i11 = iK15;
                    if (cursorK.isNull(i11)) {
                        adEntity.showTimesCondition = null;
                    } else {
                        adEntity.showTimesCondition = Integer.valueOf(cursorK.getInt(i11));
                    }
                    int i12 = iK16;
                    if (cursorK.isNull(i12)) {
                        adEntity.clickFrequency = null;
                    } else {
                        adEntity.clickFrequency = Integer.valueOf(cursorK.getInt(i12));
                    }
                    iK16 = i12;
                    iK17 = iK17;
                    adEntity.closeControl = cursorK.getInt(iK17);
                    iK18 = iK18;
                    if (cursorK.isNull(iK18)) {
                        adEntity.showDates = null;
                    } else {
                        adEntity.showDates = cursorK.getString(iK18);
                    }
                    iK19 = iK19;
                    if (cursorK.isNull(iK19)) {
                        adEntity.multipleImageUrl = null;
                    } else {
                        adEntity.multipleImageUrl = cursorK.getString(iK19);
                    }
                    iK20 = iK20;
                    if (cursorK.isNull(iK20)) {
                        adEntity.textContent = null;
                    } else {
                        adEntity.textContent = cursorK.getString(iK20);
                    }
                    iK21 = iK21;
                    if (cursorK.isNull(iK21)) {
                        adEntity.textFontSize = null;
                    } else {
                        adEntity.textFontSize = cursorK.getString(iK21);
                    }
                    iK22 = iK22;
                    if (cursorK.isNull(iK22)) {
                        adEntity.textFontColor = null;
                    } else {
                        adEntity.textFontColor = cursorK.getString(iK22);
                    }
                    iK23 = iK23;
                    if (cursorK.isNull(iK23)) {
                        adEntity.textFontColorDark = null;
                    } else {
                        adEntity.textFontColorDark = cursorK.getString(iK23);
                    }
                    iK24 = iK24;
                    if (cursorK.isNull(iK24)) {
                        adEntity.textScrollSpeed = null;
                    } else {
                        adEntity.textScrollSpeed = cursorK.getString(iK24);
                    }
                    iK25 = iK25;
                    if (cursorK.isNull(iK25)) {
                        adEntity.backgroundColor = null;
                    } else {
                        adEntity.backgroundColor = cursorK.getString(iK25);
                    }
                    int i13 = iK26;
                    if (cursorK.isNull(i13)) {
                        adEntity.backgroundColorDark = null;
                    } else {
                        adEntity.backgroundColorDark = cursorK.getString(i13);
                    }
                    iK26 = i13;
                    iK27 = iK27;
                    adEntity.adType = cursorK.getInt(iK27);
                    iK28 = iK28;
                    if (cursorK.isNull(iK28)) {
                        adEntity.nativeAdTitle = null;
                    } else {
                        adEntity.nativeAdTitle = cursorK.getString(iK28);
                    }
                    iK29 = iK29;
                    if (cursorK.isNull(iK29)) {
                        adEntity.nativeAdContent = null;
                    } else {
                        adEntity.nativeAdContent = cursorK.getString(iK29);
                    }
                    int i14 = iK30;
                    if (cursorK.isNull(i14)) {
                        adEntity.nativeAdPhoto = null;
                    } else {
                        adEntity.nativeAdPhoto = cursorK.getString(i14);
                    }
                    iK30 = i14;
                    int i15 = iK31;
                    adEntity.showCloseButton = cursorK.getInt(i15);
                    iK31 = i15;
                    int i16 = iK32;
                    adEntity.hasShowTimes = cursorK.getInt(i16);
                    int i17 = iK3;
                    int i18 = iK33;
                    adEntity.showDate = cursorK.getLong(i18);
                    int i19 = iK34;
                    int i20 = iK4;
                    adEntity.clickDate = cursorK.getLong(i19);
                    int i21 = iK35;
                    adEntity.closeTime = cursorK.getLong(i21);
                    int i22 = iK36;
                    adEntity.closeCount = cursorK.getInt(i22);
                    int i23 = iK37;
                    adEntity.createTime = cursorK.getLong(i23);
                    int i24 = iK38;
                    adEntity.updateTime = cursorK.getLong(i24);
                    int i25 = iK39;
                    adEntity.curEnable = cursorK.getInt(i25);
                    int i26 = iK40;
                    if (cursorK.isNull(i26)) {
                        adEntity.jumpParams = null;
                    } else {
                        adEntity.jumpParams = cursorK.getString(i26);
                    }
                    iK41 = iK41;
                    adEntity.defaultImgRes = cursorK.getInt(iK41);
                    iK42 = iK42;
                    if (cursorK.isNull(iK42)) {
                        adEntity.textIconUrl = null;
                    } else {
                        adEntity.textIconUrl = cursorK.getString(iK42);
                    }
                    int i27 = iK43;
                    if (cursorK.isNull(i27)) {
                        adEntity.textIconUrlDark = null;
                    } else {
                        adEntity.textIconUrlDark = cursorK.getString(i27);
                    }
                    iK43 = i27;
                    int i28 = iK44;
                    adEntity.alpha = cursorK.getInt(i28);
                    iK44 = i28;
                    int i29 = iK45;
                    adEntity.displayOrder = cursorK.getInt(i29);
                    arrayList = arrayList2;
                    arrayList.add(adEntity);
                    iK36 = i22;
                    iK4 = i20;
                    iK34 = i19;
                    iK35 = i21;
                    iK45 = i29;
                    iK = iK;
                    iK15 = i11;
                    iK33 = i18;
                    iK37 = i23;
                    iK38 = i24;
                    iK3 = i17;
                    iK32 = i16;
                    iK39 = i25;
                    iK40 = i26;
                    iK2 = i10;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public List<AdEntity> queryBySlotIdLimitCount(final String slotId, final String countryCode, final int count) throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM ad_detail WHERE ad_slot_id == (?) AND country_code == (?) AND current_enable == 1 ORDER BY update_time DESC LIMIT (?)", 3);
        if (slotId == null) {
            lAcquire.bindNull(1);
        } else {
            lAcquire.bindString(1, slotId);
        }
        if (countryCode == null) {
            lAcquire.bindNull(2);
        } else {
            lAcquire.bindString(2, countryCode);
        }
        lAcquire.bindLong(3, count);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(this.__db, lAcquire, false);
        try {
            int iK = g.k(cursorK, "ad_id");
            int iK2 = g.k(cursorK, "application_id");
            int iK3 = g.k(cursorK, "ad_slot_id");
            int iK4 = g.k(cursorK, "image_url");
            int iK5 = g.k(cursorK, "image_url_dark");
            int iK6 = g.k(cursorK, "secondary_image_url");
            int iK7 = g.k(cursorK, "secondary_image_url_dark");
            int iK8 = g.k(cursorK, "jump_type");
            int iK9 = g.k(cursorK, "relative_url");
            int iK10 = g.k(cursorK, "image_dimention");
            int iK11 = g.k(cursorK, "country_code");
            int iK12 = g.k(cursorK, "valid_start_time");
            int iK13 = g.k(cursorK, "valid_end_time");
            int iK14 = g.k(cursorK, "show_times");
            l5 = lAcquire;
            try {
                int iK15 = g.k(cursorK, "show_times_condition");
                int iK16 = g.k(cursorK, "click_frequency");
                int iK17 = g.k(cursorK, "max_close_count");
                int iK18 = g.k(cursorK, "show_dates");
                int iK19 = g.k(cursorK, "multiple_imageUrl");
                int iK20 = g.k(cursorK, "text_content");
                int iK21 = g.k(cursorK, "text_font_size");
                int iK22 = g.k(cursorK, "text_font_color");
                int iK23 = g.k(cursorK, "text_font_color_dark");
                int iK24 = g.k(cursorK, "text_scroll_speed");
                int iK25 = g.k(cursorK, "background_color");
                int iK26 = g.k(cursorK, "background_color_dark");
                int iK27 = g.k(cursorK, AdRevenueScheme.AD_TYPE);
                int iK28 = g.k(cursorK, "native_ad_title");
                int iK29 = g.k(cursorK, "native_ad_content");
                int iK30 = g.k(cursorK, "native_ad_photo");
                int iK31 = g.k(cursorK, "show_close_button");
                int iK32 = g.k(cursorK, "has_show_times");
                int iK33 = g.k(cursorK, "show_date");
                int iK34 = g.k(cursorK, "click_date");
                int iK35 = g.k(cursorK, "close_time");
                int iK36 = g.k(cursorK, "close_count");
                int iK37 = g.k(cursorK, "create_time");
                int iK38 = g.k(cursorK, "update_time");
                int iK39 = g.k(cursorK, "current_enable");
                int iK40 = g.k(cursorK, "jump_params");
                int iK41 = g.k(cursorK, "default_img_res");
                int iK42 = g.k(cursorK, "text_icon_url");
                int iK43 = g.k(cursorK, "text_icon_url_dark");
                int iK44 = g.k(cursorK, "alpha");
                int iK45 = g.k(cursorK, "display_order");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    AdEntity adEntity = new AdEntity();
                    ArrayList arrayList2 = arrayList;
                    if (cursorK.isNull(iK)) {
                        adEntity.adId = null;
                    } else {
                        adEntity.adId = cursorK.getString(iK);
                    }
                    if (cursorK.isNull(iK2)) {
                        adEntity.applicationId = null;
                    } else {
                        adEntity.applicationId = cursorK.getString(iK2);
                    }
                    if (cursorK.isNull(iK3)) {
                        adEntity.adSlotId = null;
                    } else {
                        adEntity.adSlotId = cursorK.getString(iK3);
                    }
                    if (cursorK.isNull(iK4)) {
                        adEntity.imageUrl = null;
                    } else {
                        adEntity.imageUrl = cursorK.getString(iK4);
                    }
                    if (cursorK.isNull(iK5)) {
                        adEntity.imageUrlDark = null;
                    } else {
                        adEntity.imageUrlDark = cursorK.getString(iK5);
                    }
                    if (cursorK.isNull(iK6)) {
                        adEntity.h5ImageUrl = null;
                    } else {
                        adEntity.h5ImageUrl = cursorK.getString(iK6);
                    }
                    if (cursorK.isNull(iK7)) {
                        adEntity.h5ImageUrlDark = null;
                    } else {
                        adEntity.h5ImageUrlDark = cursorK.getString(iK7);
                    }
                    if (cursorK.isNull(iK8)) {
                        adEntity.jumpType = null;
                    } else {
                        adEntity.jumpType = cursorK.getString(iK8);
                    }
                    if (cursorK.isNull(iK9)) {
                        adEntity.relativeUrl = null;
                    } else {
                        adEntity.relativeUrl = cursorK.getString(iK9);
                    }
                    if (cursorK.isNull(iK10)) {
                        adEntity.imageDimention = null;
                    } else {
                        adEntity.imageDimention = cursorK.getString(iK10);
                    }
                    if (cursorK.isNull(iK11)) {
                        adEntity.countryCode = null;
                    } else {
                        adEntity.countryCode = cursorK.getString(iK11);
                    }
                    int i10 = iK2;
                    adEntity.validStartTime = cursorK.getLong(iK12);
                    adEntity.validEndTime = cursorK.getLong(iK13);
                    i7 = i7;
                    adEntity.showTimes = cursorK.getInt(i7);
                    int i11 = iK15;
                    if (cursorK.isNull(i11)) {
                        adEntity.showTimesCondition = null;
                    } else {
                        adEntity.showTimesCondition = Integer.valueOf(cursorK.getInt(i11));
                    }
                    int i12 = iK16;
                    if (cursorK.isNull(i12)) {
                        adEntity.clickFrequency = null;
                    } else {
                        adEntity.clickFrequency = Integer.valueOf(cursorK.getInt(i12));
                    }
                    iK17 = iK17;
                    iK16 = i12;
                    adEntity.closeControl = cursorK.getInt(iK17);
                    iK18 = iK18;
                    if (cursorK.isNull(iK18)) {
                        adEntity.showDates = null;
                    } else {
                        adEntity.showDates = cursorK.getString(iK18);
                    }
                    iK19 = iK19;
                    if (cursorK.isNull(iK19)) {
                        adEntity.multipleImageUrl = null;
                    } else {
                        adEntity.multipleImageUrl = cursorK.getString(iK19);
                    }
                    iK20 = iK20;
                    if (cursorK.isNull(iK20)) {
                        adEntity.textContent = null;
                    } else {
                        adEntity.textContent = cursorK.getString(iK20);
                    }
                    iK21 = iK21;
                    if (cursorK.isNull(iK21)) {
                        adEntity.textFontSize = null;
                    } else {
                        adEntity.textFontSize = cursorK.getString(iK21);
                    }
                    iK22 = iK22;
                    if (cursorK.isNull(iK22)) {
                        adEntity.textFontColor = null;
                    } else {
                        adEntity.textFontColor = cursorK.getString(iK22);
                    }
                    iK23 = iK23;
                    if (cursorK.isNull(iK23)) {
                        adEntity.textFontColorDark = null;
                    } else {
                        adEntity.textFontColorDark = cursorK.getString(iK23);
                    }
                    iK24 = iK24;
                    if (cursorK.isNull(iK24)) {
                        adEntity.textScrollSpeed = null;
                    } else {
                        adEntity.textScrollSpeed = cursorK.getString(iK24);
                    }
                    iK25 = iK25;
                    if (cursorK.isNull(iK25)) {
                        adEntity.backgroundColor = null;
                    } else {
                        adEntity.backgroundColor = cursorK.getString(iK25);
                    }
                    int i13 = iK26;
                    if (cursorK.isNull(i13)) {
                        adEntity.backgroundColorDark = null;
                    } else {
                        adEntity.backgroundColorDark = cursorK.getString(i13);
                    }
                    iK26 = i13;
                    iK27 = iK27;
                    adEntity.adType = cursorK.getInt(iK27);
                    iK28 = iK28;
                    if (cursorK.isNull(iK28)) {
                        adEntity.nativeAdTitle = null;
                    } else {
                        adEntity.nativeAdTitle = cursorK.getString(iK28);
                    }
                    iK29 = iK29;
                    if (cursorK.isNull(iK29)) {
                        adEntity.nativeAdContent = null;
                    } else {
                        adEntity.nativeAdContent = cursorK.getString(iK29);
                    }
                    int i14 = iK30;
                    if (cursorK.isNull(i14)) {
                        adEntity.nativeAdPhoto = null;
                    } else {
                        adEntity.nativeAdPhoto = cursorK.getString(i14);
                    }
                    iK30 = i14;
                    int i15 = iK31;
                    adEntity.showCloseButton = cursorK.getInt(i15);
                    iK31 = i15;
                    int i16 = iK32;
                    adEntity.hasShowTimes = cursorK.getInt(i16);
                    int i17 = iK3;
                    int i18 = iK33;
                    adEntity.showDate = cursorK.getLong(i18);
                    int i19 = iK34;
                    int i20 = iK4;
                    adEntity.clickDate = cursorK.getLong(i19);
                    int i21 = iK35;
                    adEntity.closeTime = cursorK.getLong(i21);
                    int i22 = iK36;
                    adEntity.closeCount = cursorK.getInt(i22);
                    int i23 = iK37;
                    adEntity.createTime = cursorK.getLong(i23);
                    int i24 = iK38;
                    adEntity.updateTime = cursorK.getLong(i24);
                    int i25 = iK39;
                    adEntity.curEnable = cursorK.getInt(i25);
                    int i26 = iK40;
                    if (cursorK.isNull(i26)) {
                        adEntity.jumpParams = null;
                    } else {
                        adEntity.jumpParams = cursorK.getString(i26);
                    }
                    iK41 = iK41;
                    adEntity.defaultImgRes = cursorK.getInt(iK41);
                    iK42 = iK42;
                    if (cursorK.isNull(iK42)) {
                        adEntity.textIconUrl = null;
                    } else {
                        adEntity.textIconUrl = cursorK.getString(iK42);
                    }
                    int i27 = iK43;
                    if (cursorK.isNull(i27)) {
                        adEntity.textIconUrlDark = null;
                    } else {
                        adEntity.textIconUrlDark = cursorK.getString(i27);
                    }
                    iK43 = i27;
                    int i28 = iK44;
                    adEntity.alpha = cursorK.getInt(i28);
                    iK44 = i28;
                    int i29 = iK45;
                    adEntity.displayOrder = cursorK.getInt(i29);
                    arrayList = arrayList2;
                    arrayList.add(adEntity);
                    iK36 = i22;
                    iK4 = i20;
                    iK34 = i19;
                    iK35 = i21;
                    iK45 = i29;
                    iK = iK;
                    iK15 = i11;
                    iK33 = i18;
                    iK37 = i23;
                    iK38 = i24;
                    iK3 = i17;
                    iK32 = i16;
                    iK39 = i25;
                    iK40 = i26;
                    iK2 = i10;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public List<AdEntity> queryBySlotIdWithOrder(final String slotId, final String countryCode) throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM ad_detail WHERE ad_slot_id == (?) AND country_code == (?) AND current_enable == 1 ORDER BY display_order ASC", 2);
        if (slotId == null) {
            lAcquire.bindNull(1);
        } else {
            lAcquire.bindString(1, slotId);
        }
        if (countryCode == null) {
            lAcquire.bindNull(2);
        } else {
            lAcquire.bindString(2, countryCode);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(this.__db, lAcquire, false);
        try {
            int iK = g.k(cursorK, "ad_id");
            int iK2 = g.k(cursorK, "application_id");
            int iK3 = g.k(cursorK, "ad_slot_id");
            int iK4 = g.k(cursorK, "image_url");
            int iK5 = g.k(cursorK, "image_url_dark");
            int iK6 = g.k(cursorK, "secondary_image_url");
            int iK7 = g.k(cursorK, "secondary_image_url_dark");
            int iK8 = g.k(cursorK, "jump_type");
            int iK9 = g.k(cursorK, "relative_url");
            int iK10 = g.k(cursorK, "image_dimention");
            int iK11 = g.k(cursorK, "country_code");
            int iK12 = g.k(cursorK, "valid_start_time");
            int iK13 = g.k(cursorK, "valid_end_time");
            int iK14 = g.k(cursorK, "show_times");
            l5 = lAcquire;
            try {
                int iK15 = g.k(cursorK, "show_times_condition");
                int iK16 = g.k(cursorK, "click_frequency");
                int iK17 = g.k(cursorK, "max_close_count");
                int iK18 = g.k(cursorK, "show_dates");
                int iK19 = g.k(cursorK, "multiple_imageUrl");
                int iK20 = g.k(cursorK, "text_content");
                int iK21 = g.k(cursorK, "text_font_size");
                int iK22 = g.k(cursorK, "text_font_color");
                int iK23 = g.k(cursorK, "text_font_color_dark");
                int iK24 = g.k(cursorK, "text_scroll_speed");
                int iK25 = g.k(cursorK, "background_color");
                int iK26 = g.k(cursorK, "background_color_dark");
                int iK27 = g.k(cursorK, AdRevenueScheme.AD_TYPE);
                int iK28 = g.k(cursorK, "native_ad_title");
                int iK29 = g.k(cursorK, "native_ad_content");
                int iK30 = g.k(cursorK, "native_ad_photo");
                int iK31 = g.k(cursorK, "show_close_button");
                int iK32 = g.k(cursorK, "has_show_times");
                int iK33 = g.k(cursorK, "show_date");
                int iK34 = g.k(cursorK, "click_date");
                int iK35 = g.k(cursorK, "close_time");
                int iK36 = g.k(cursorK, "close_count");
                int iK37 = g.k(cursorK, "create_time");
                int iK38 = g.k(cursorK, "update_time");
                int iK39 = g.k(cursorK, "current_enable");
                int iK40 = g.k(cursorK, "jump_params");
                int iK41 = g.k(cursorK, "default_img_res");
                int iK42 = g.k(cursorK, "text_icon_url");
                int iK43 = g.k(cursorK, "text_icon_url_dark");
                int iK44 = g.k(cursorK, "alpha");
                int iK45 = g.k(cursorK, "display_order");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    AdEntity adEntity = new AdEntity();
                    ArrayList arrayList2 = arrayList;
                    if (cursorK.isNull(iK)) {
                        adEntity.adId = null;
                    } else {
                        adEntity.adId = cursorK.getString(iK);
                    }
                    if (cursorK.isNull(iK2)) {
                        adEntity.applicationId = null;
                    } else {
                        adEntity.applicationId = cursorK.getString(iK2);
                    }
                    if (cursorK.isNull(iK3)) {
                        adEntity.adSlotId = null;
                    } else {
                        adEntity.adSlotId = cursorK.getString(iK3);
                    }
                    if (cursorK.isNull(iK4)) {
                        adEntity.imageUrl = null;
                    } else {
                        adEntity.imageUrl = cursorK.getString(iK4);
                    }
                    if (cursorK.isNull(iK5)) {
                        adEntity.imageUrlDark = null;
                    } else {
                        adEntity.imageUrlDark = cursorK.getString(iK5);
                    }
                    if (cursorK.isNull(iK6)) {
                        adEntity.h5ImageUrl = null;
                    } else {
                        adEntity.h5ImageUrl = cursorK.getString(iK6);
                    }
                    if (cursorK.isNull(iK7)) {
                        adEntity.h5ImageUrlDark = null;
                    } else {
                        adEntity.h5ImageUrlDark = cursorK.getString(iK7);
                    }
                    if (cursorK.isNull(iK8)) {
                        adEntity.jumpType = null;
                    } else {
                        adEntity.jumpType = cursorK.getString(iK8);
                    }
                    if (cursorK.isNull(iK9)) {
                        adEntity.relativeUrl = null;
                    } else {
                        adEntity.relativeUrl = cursorK.getString(iK9);
                    }
                    if (cursorK.isNull(iK10)) {
                        adEntity.imageDimention = null;
                    } else {
                        adEntity.imageDimention = cursorK.getString(iK10);
                    }
                    if (cursorK.isNull(iK11)) {
                        adEntity.countryCode = null;
                    } else {
                        adEntity.countryCode = cursorK.getString(iK11);
                    }
                    int i10 = iK2;
                    adEntity.validStartTime = cursorK.getLong(iK12);
                    adEntity.validEndTime = cursorK.getLong(iK13);
                    i7 = i7;
                    adEntity.showTimes = cursorK.getInt(i7);
                    int i11 = iK15;
                    if (cursorK.isNull(i11)) {
                        adEntity.showTimesCondition = null;
                    } else {
                        adEntity.showTimesCondition = Integer.valueOf(cursorK.getInt(i11));
                    }
                    int i12 = iK16;
                    if (cursorK.isNull(i12)) {
                        adEntity.clickFrequency = null;
                    } else {
                        adEntity.clickFrequency = Integer.valueOf(cursorK.getInt(i12));
                    }
                    iK16 = i12;
                    iK17 = iK17;
                    adEntity.closeControl = cursorK.getInt(iK17);
                    iK18 = iK18;
                    if (cursorK.isNull(iK18)) {
                        adEntity.showDates = null;
                    } else {
                        adEntity.showDates = cursorK.getString(iK18);
                    }
                    iK19 = iK19;
                    if (cursorK.isNull(iK19)) {
                        adEntity.multipleImageUrl = null;
                    } else {
                        adEntity.multipleImageUrl = cursorK.getString(iK19);
                    }
                    iK20 = iK20;
                    if (cursorK.isNull(iK20)) {
                        adEntity.textContent = null;
                    } else {
                        adEntity.textContent = cursorK.getString(iK20);
                    }
                    iK21 = iK21;
                    if (cursorK.isNull(iK21)) {
                        adEntity.textFontSize = null;
                    } else {
                        adEntity.textFontSize = cursorK.getString(iK21);
                    }
                    iK22 = iK22;
                    if (cursorK.isNull(iK22)) {
                        adEntity.textFontColor = null;
                    } else {
                        adEntity.textFontColor = cursorK.getString(iK22);
                    }
                    iK23 = iK23;
                    if (cursorK.isNull(iK23)) {
                        adEntity.textFontColorDark = null;
                    } else {
                        adEntity.textFontColorDark = cursorK.getString(iK23);
                    }
                    iK24 = iK24;
                    if (cursorK.isNull(iK24)) {
                        adEntity.textScrollSpeed = null;
                    } else {
                        adEntity.textScrollSpeed = cursorK.getString(iK24);
                    }
                    iK25 = iK25;
                    if (cursorK.isNull(iK25)) {
                        adEntity.backgroundColor = null;
                    } else {
                        adEntity.backgroundColor = cursorK.getString(iK25);
                    }
                    int i13 = iK26;
                    if (cursorK.isNull(i13)) {
                        adEntity.backgroundColorDark = null;
                    } else {
                        adEntity.backgroundColorDark = cursorK.getString(i13);
                    }
                    iK26 = i13;
                    iK27 = iK27;
                    adEntity.adType = cursorK.getInt(iK27);
                    iK28 = iK28;
                    if (cursorK.isNull(iK28)) {
                        adEntity.nativeAdTitle = null;
                    } else {
                        adEntity.nativeAdTitle = cursorK.getString(iK28);
                    }
                    iK29 = iK29;
                    if (cursorK.isNull(iK29)) {
                        adEntity.nativeAdContent = null;
                    } else {
                        adEntity.nativeAdContent = cursorK.getString(iK29);
                    }
                    int i14 = iK30;
                    if (cursorK.isNull(i14)) {
                        adEntity.nativeAdPhoto = null;
                    } else {
                        adEntity.nativeAdPhoto = cursorK.getString(i14);
                    }
                    iK30 = i14;
                    int i15 = iK31;
                    adEntity.showCloseButton = cursorK.getInt(i15);
                    iK31 = i15;
                    int i16 = iK32;
                    adEntity.hasShowTimes = cursorK.getInt(i16);
                    int i17 = iK3;
                    int i18 = iK33;
                    adEntity.showDate = cursorK.getLong(i18);
                    int i19 = iK34;
                    int i20 = iK4;
                    adEntity.clickDate = cursorK.getLong(i19);
                    int i21 = iK35;
                    adEntity.closeTime = cursorK.getLong(i21);
                    int i22 = iK36;
                    adEntity.closeCount = cursorK.getInt(i22);
                    int i23 = iK37;
                    adEntity.createTime = cursorK.getLong(i23);
                    int i24 = iK38;
                    adEntity.updateTime = cursorK.getLong(i24);
                    int i25 = iK39;
                    adEntity.curEnable = cursorK.getInt(i25);
                    int i26 = iK40;
                    if (cursorK.isNull(i26)) {
                        adEntity.jumpParams = null;
                    } else {
                        adEntity.jumpParams = cursorK.getString(i26);
                    }
                    iK41 = iK41;
                    adEntity.defaultImgRes = cursorK.getInt(iK41);
                    iK42 = iK42;
                    if (cursorK.isNull(iK42)) {
                        adEntity.textIconUrl = null;
                    } else {
                        adEntity.textIconUrl = cursorK.getString(iK42);
                    }
                    int i27 = iK43;
                    if (cursorK.isNull(i27)) {
                        adEntity.textIconUrlDark = null;
                    } else {
                        adEntity.textIconUrlDark = cursorK.getString(i27);
                    }
                    iK43 = i27;
                    int i28 = iK44;
                    adEntity.alpha = cursorK.getInt(i28);
                    iK44 = i28;
                    int i29 = iK45;
                    adEntity.displayOrder = cursorK.getInt(i29);
                    arrayList = arrayList2;
                    arrayList.add(adEntity);
                    iK36 = i22;
                    iK4 = i20;
                    iK34 = i19;
                    iK35 = i21;
                    iK45 = i29;
                    iK = iK;
                    iK15 = i11;
                    iK33 = i18;
                    iK37 = i23;
                    iK38 = i24;
                    iK3 = i17;
                    iK32 = i16;
                    iK39 = i25;
                    iK40 = i26;
                    iK2 = i10;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public void update(final AdEntity entity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfAdEntity.e(entity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.transsnet.adsdk.data.local.dao.AdDao
    public void disableAllData() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementA = this.__preparedStmtOfDisableAllData_1.a();
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementA.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDisableAllData_1.c(supportSQLiteStatementA);
        }
    }
}
