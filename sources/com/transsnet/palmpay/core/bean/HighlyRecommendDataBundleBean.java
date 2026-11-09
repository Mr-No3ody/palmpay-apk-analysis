package com.transsnet.palmpay.core.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleBean;", "", "items", "", "Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleItemBean;", "icon", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HighlyRecommendDataBundleBean {

    @JvmField
    @Nullable
    public final String icon;

    @JvmField
    @Nullable
    public final List<HighlyRecommendDataBundleItemBean> items;

    public HighlyRecommendDataBundleBean(@Nullable List<HighlyRecommendDataBundleItemBean> list, @Nullable String str) {
        this.items = list;
        this.icon = str;
    }
}
