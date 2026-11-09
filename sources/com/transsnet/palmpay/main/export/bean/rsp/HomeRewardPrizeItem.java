package com.transsnet.palmpay.main.export.bean.rsp;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.palmpay.lib.apm.launchcounter.util.d;

/* JADX INFO: loaded from: classes4.dex */
public class HomeRewardPrizeItem implements MultiItemEntity {
    public static final int VIEW_TYPE_CASH = 1;
    public static final int VIEW_TYPE_COUPON = 2;
    public static final int VIEW_TYPE_OTHER = 0;
    public static final int VIEW_TYPE_POINTS = 3;
    public static final int VIEW_TYPE_TRIAL_CASH = 100;
    public String androidLinkUrl;
    public String couponDesc;
    public String couponName;
    public long endTime;
    public String image;
    public String itemId;
    public String itemName;
    public int itemType;
    public long limitAmt;
    public long nominalValue;
    public int prizeStatus;
    public String rule;

    public HomeRewardPrizeItem(int i7, long j6, String str, String str2) {
        this.itemType = i7;
        this.nominalValue = j6;
        this.itemName = str;
        this.couponDesc = str2;
    }

    public static boolean isSupportedItemType(int i7) {
        return i7 == 1 || i7 == 0 || i7 == 2 || i7 == 3 || i7 == 100;
    }

    public static void itemClick(int i7) {
        if (i7 == 2) {
            d.x(null, "Coupon");
            return;
        }
        if (i7 == 1) {
            d.F("/main/balance_statement");
        } else if (i7 == 100) {
            d.x(null, "TrialCashHome");
        } else if (i7 == 3) {
            d.x(null, "PointHome");
        }
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        if (isSupportedItemType(this.itemType)) {
            return this.itemType;
        }
        return 0;
    }
}
