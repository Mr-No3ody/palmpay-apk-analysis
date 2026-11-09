package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/Text;", "", "amountColor", "", "amountIconUrl", "amountFont", "Lcom/transsnet/palmpay/credit/bean/TitleFont;", "extraTitleColor", "extraTitleFont", "subTitleColor", "subTitleColor2", "subTitleFont", "subTitleFont2", "titleColor", "titleFont", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;Lcom/transsnet/palmpay/credit/bean/TitleFont;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Text {

    @JvmField
    @Nullable
    public final String amountColor;

    @JvmField
    @Nullable
    public final TitleFont amountFont;

    @JvmField
    @Nullable
    public final String amountIconUrl;

    @JvmField
    @Nullable
    public final String extraTitleColor;

    @JvmField
    @Nullable
    public final TitleFont extraTitleFont;

    @JvmField
    @Nullable
    public final String subTitleColor;

    @JvmField
    @Nullable
    public final String subTitleColor2;

    @JvmField
    @Nullable
    public final TitleFont subTitleFont;

    @JvmField
    @Nullable
    public final TitleFont subTitleFont2;

    @JvmField
    @Nullable
    public final String titleColor;

    @JvmField
    @Nullable
    public final TitleFont titleFont;

    public Text(@Nullable String str, @Nullable String str2, @Nullable TitleFont titleFont, @Nullable String str3, @Nullable TitleFont titleFont2, @Nullable String str4, @Nullable String str5, @Nullable TitleFont titleFont3, @Nullable TitleFont titleFont4, @Nullable String str6, @Nullable TitleFont titleFont5) {
        this.amountColor = str;
        this.amountIconUrl = str2;
        this.amountFont = titleFont;
        this.extraTitleColor = str3;
        this.extraTitleFont = titleFont2;
        this.subTitleColor = str4;
        this.subTitleColor2 = str5;
        this.subTitleFont = titleFont3;
        this.subTitleFont2 = titleFont4;
        this.titleColor = str6;
        this.titleFont = titleFont5;
    }
}
