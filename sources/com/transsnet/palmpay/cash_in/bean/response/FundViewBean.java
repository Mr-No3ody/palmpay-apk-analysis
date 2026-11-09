package com.transsnet.palmpay.cash_in.bean.response;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/response/FundViewBean;", "", "icon", "", "darkIcon", "iconUrl", "name", FirebaseAnalytics.Param.CONTENT, "jumpPath", "fundMethodCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FundViewBean {

    @JvmField
    @NotNull
    public final String content;

    @JvmField
    @NotNull
    public final String darkIcon;

    @JvmField
    @NotNull
    public final String fundMethodCode;

    @JvmField
    @NotNull
    public final String icon;

    @JvmField
    @NotNull
    public final String iconUrl;

    @JvmField
    @NotNull
    public final String jumpPath;

    @JvmField
    @NotNull
    public final String name;

    public FundViewBean(@NotNull String icon, @NotNull String darkIcon, @NotNull String iconUrl, @NotNull String name, @NotNull String content, @NotNull String jumpPath, @NotNull String fundMethodCode) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(darkIcon, "darkIcon");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(jumpPath, "jumpPath");
        Intrinsics.checkNotNullParameter(fundMethodCode, "fundMethodCode");
        this.icon = icon;
        this.darkIcon = darkIcon;
        this.iconUrl = iconUrl;
        this.name = name;
        this.content = content;
        this.jumpPath = jumpPath;
        this.fundMethodCode = fundMethodCode;
    }
}
