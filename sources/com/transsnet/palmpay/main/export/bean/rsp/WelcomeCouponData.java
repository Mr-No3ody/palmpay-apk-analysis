package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/WelcomeCouponData;", "", "configs", "", "Lcom/transsnet/palmpay/main/export/bean/rsp/WelcomeCouponBean;", "topPic", "", "backTitle", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WelcomeCouponData {

    @JvmField
    @Nullable
    public final String backTitle;

    @JvmField
    @Nullable
    public final List<WelcomeCouponBean> configs;

    @JvmField
    @Nullable
    public final String topPic;

    public WelcomeCouponData(@Nullable List<WelcomeCouponBean> list, @Nullable String str, @Nullable String str2) {
        this.configs = list;
        this.topPic = str;
        this.backTitle = str2;
    }
}
