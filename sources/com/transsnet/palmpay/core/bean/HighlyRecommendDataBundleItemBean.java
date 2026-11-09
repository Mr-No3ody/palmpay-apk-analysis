package com.transsnet.palmpay.core.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleItemBean;", "", "billerId", "", "billerName", "tagId", "badgeUrl", "cornerMark", "item", "Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleProductBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleProductBean;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HighlyRecommendDataBundleItemBean {

    @JvmField
    @Nullable
    public final String badgeUrl;

    @JvmField
    @Nullable
    public final String billerId;

    @JvmField
    @Nullable
    public final String billerName;

    @JvmField
    @Nullable
    public final String cornerMark;

    @JvmField
    @Nullable
    public final HighlyRecommendDataBundleProductBean item;

    @JvmField
    @Nullable
    public final String tagId;

    public HighlyRecommendDataBundleItemBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable HighlyRecommendDataBundleProductBean highlyRecommendDataBundleProductBean) {
        this.billerId = str;
        this.billerName = str2;
        this.tagId = str3;
        this.badgeUrl = str4;
        this.cornerMark = str5;
        this.item = highlyRecommendDataBundleProductBean;
    }
}
