package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/TopArea;", "", "height", "", "titleColor", "", "titleFont", "Lcom/transsnet/palmpay/credit/bean/TitleFont;", "bgImage1", "bgImage2", "titleColor1", "titleColor2", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Float;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TopArea {

    @JvmField
    @Nullable
    public final String bgImage1;

    @JvmField
    @Nullable
    public final String bgImage2;

    @JvmField
    @Nullable
    public final Float height;

    @JvmField
    @Nullable
    public final String titleColor;

    @JvmField
    @Nullable
    public final String titleColor1;

    @JvmField
    @Nullable
    public final String titleColor2;

    @JvmField
    @Nullable
    public final TitleFont titleFont;

    public TopArea(@Nullable Float f10, @Nullable String str, @Nullable TitleFont titleFont, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.height = f10;
        this.titleColor = str;
        this.titleFont = titleFont;
        this.bgImage1 = str2;
        this.bgImage2 = str3;
        this.titleColor1 = str4;
        this.titleColor2 = str5;
    }
}
