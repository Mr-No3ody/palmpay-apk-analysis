package com.transsnet.palmpay.core.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0014\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleProductBean;", "", "itemId", "", "itemName", "volume", "volumeUnit", "validity", "validityDay", "", "description", "businessPrice", "", FirebaseAnalytics.Param.PRICE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "Ljava/lang/Integer;", "Ljava/lang/Long;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HighlyRecommendDataBundleProductBean {

    @JvmField
    @Nullable
    public final Long businessPrice;

    @JvmField
    @Nullable
    public final String description;

    @JvmField
    @Nullable
    public final String itemId;

    @JvmField
    @Nullable
    public final String itemName;

    @JvmField
    @Nullable
    public final Long price;

    @JvmField
    @Nullable
    public final String validity;

    @JvmField
    @Nullable
    public final Integer validityDay;

    @JvmField
    @Nullable
    public final String volume;

    @JvmField
    @Nullable
    public final String volumeUnit;

    public HighlyRecommendDataBundleProductBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable String str6, @Nullable Long l5, @Nullable Long l6) {
        this.itemId = str;
        this.itemName = str2;
        this.volume = str3;
        this.volumeUnit = str4;
        this.validity = str5;
        this.validityDay = num;
        this.description = str6;
        this.businessPrice = l5;
        this.price = l6;
    }
}
