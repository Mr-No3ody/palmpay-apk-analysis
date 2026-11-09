package com.transsnet.palmpay.main.export.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\r8\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\r8\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/HotProductBean;", "", "<init>", "()V", "productId", "", "Ljava/lang/Long;", "productName", "", "annualizedIncomeRatio", "", "durationDay", "productStatus", "", "productIcon", "productIncreaseUpContent", "maxDurationDay", "androidUrl", "autoRenewal", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HotProductBean {

    @JvmField
    @Nullable
    public final String androidUrl;

    @JvmField
    public final float annualizedIncomeRatio;

    @JvmField
    public final int autoRenewal;

    @JvmField
    public final long durationDay;

    @JvmField
    public final int maxDurationDay;

    @JvmField
    @Nullable
    public final String productIcon;

    @JvmField
    @Nullable
    public final Long productId;

    @JvmField
    @Nullable
    public final String productIncreaseUpContent;

    @JvmField
    @Nullable
    public final String productName;

    @JvmField
    public final int productStatus;
}
