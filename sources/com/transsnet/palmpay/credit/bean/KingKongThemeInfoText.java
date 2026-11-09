package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/KingKongThemeInfoText;", "", "titleColor", "", "titleFont", "Lcom/transsnet/palmpay/credit/bean/TitleFont;", "<init>", "(Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KingKongThemeInfoText {

    @JvmField
    @NotNull
    public final String titleColor;

    @JvmField
    @NotNull
    public final TitleFont titleFont;

    public KingKongThemeInfoText(@NotNull String titleColor, @NotNull TitleFont titleFont) {
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(titleFont, "titleFont");
        this.titleColor = titleColor;
        this.titleFont = titleFont;
    }
}
