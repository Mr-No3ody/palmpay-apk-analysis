package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/KingKongContentInfo;", "", "buttonContent", "", "desc", "image", "imageDark", "iosLink", "jumpParams", "jumpPath", "jumpType", "title", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KingKongContentInfo {

    @JvmField
    @NotNull
    public final String buttonContent;

    @JvmField
    @NotNull
    public final String desc;

    @JvmField
    @NotNull
    public final String image;

    @JvmField
    @NotNull
    public final String imageDark;

    @JvmField
    @NotNull
    public final String iosLink;

    @JvmField
    @NotNull
    public final String jumpParams;

    @JvmField
    @NotNull
    public final String jumpPath;

    @JvmField
    @NotNull
    public final String jumpType;

    @JvmField
    @Nullable
    public final String style;

    @JvmField
    @NotNull
    public final String title;

    public KingKongContentInfo(@NotNull String buttonContent, @NotNull String desc, @NotNull String image, @NotNull String imageDark, @NotNull String iosLink, @NotNull String jumpParams, @NotNull String jumpPath, @NotNull String jumpType, @NotNull String title, @Nullable String str) {
        Intrinsics.checkNotNullParameter(buttonContent, "buttonContent");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(imageDark, "imageDark");
        Intrinsics.checkNotNullParameter(iosLink, "iosLink");
        Intrinsics.checkNotNullParameter(jumpParams, "jumpParams");
        Intrinsics.checkNotNullParameter(jumpPath, "jumpPath");
        Intrinsics.checkNotNullParameter(jumpType, "jumpType");
        Intrinsics.checkNotNullParameter(title, "title");
        this.buttonContent = buttonContent;
        this.desc = desc;
        this.image = image;
        this.imageDark = imageDark;
        this.iosLink = iosLink;
        this.jumpParams = jumpParams;
        this.jumpPath = jumpPath;
        this.jumpType = jumpType;
        this.title = title;
        this.style = str;
    }
}
