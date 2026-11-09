package com.transsnet.palmpay.custom_view.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/custom_view/bean/OrderDetailItemBean;", "", "key", "", "value", "subValue", "style", "", "urlType", "androidUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "getSubValue", "getStyle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrlType", "getAndroidUrl", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderDetailItemBean {

    @Nullable
    private final String androidUrl;

    @Nullable
    private final String key;

    @Nullable
    private final Integer style;

    @Nullable
    private final String subValue;

    @Nullable
    private final String urlType;

    @Nullable
    private final String value;

    public OrderDetailItemBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5) {
        this.key = str;
        this.value = str2;
        this.subValue = str3;
        this.style = num;
        this.urlType = str4;
        this.androidUrl = str5;
    }

    @Nullable
    public final String getAndroidUrl() {
        return this.androidUrl;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Integer getStyle() {
        return this.style;
    }

    @Nullable
    public final String getSubValue() {
        return this.subValue;
    }

    @Nullable
    public final String getUrlType() {
        return this.urlType;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }
}
