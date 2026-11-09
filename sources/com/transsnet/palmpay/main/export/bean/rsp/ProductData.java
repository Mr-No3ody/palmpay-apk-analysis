package com.transsnet.palmpay.main.export.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/ProductData;", "", "sort", "", "name", "", "imageUrl", "androidIndexUrl", "androidVersion", "", "subscriptUrl", "iconLottieUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductData {

    @JvmField
    @Nullable
    public final String androidIndexUrl;

    @JvmField
    public final long androidVersion;

    @JvmField
    @Nullable
    public final String iconLottieUrl;

    @JvmField
    @Nullable
    public final String imageUrl;

    @JvmField
    @Nullable
    public final String name;

    @JvmField
    public final int sort;

    @JvmField
    @Nullable
    public final String subscriptUrl;

    public ProductData(int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, long j6, @Nullable String str4, @Nullable String str5) {
        this.sort = i7;
        this.name = str;
        this.imageUrl = str2;
        this.androidIndexUrl = str3;
        this.androidVersion = j6;
        this.subscriptUrl = str4;
        this.iconLottieUrl = str5;
    }
}
