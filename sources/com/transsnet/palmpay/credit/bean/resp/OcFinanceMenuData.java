package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcFinanceMenuData;", "", "icon", "", "iconDark", "title", "jumpPath", "jumpType", "jumpParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getIconDark", "getTitle", "getJumpPath", "setJumpPath", "(Ljava/lang/String;)V", "getJumpType", "setJumpType", "getJumpParams", "setJumpParams", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcFinanceMenuData {

    @Nullable
    private final String icon;

    @Nullable
    private final String iconDark;

    @Nullable
    private String jumpParams;

    @Nullable
    private String jumpPath;

    @Nullable
    private String jumpType;

    @Nullable
    private final String title;

    public OcFinanceMenuData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.icon = str;
        this.iconDark = str2;
        this.title = str3;
        this.jumpPath = str4;
        this.jumpType = str5;
        this.jumpParams = str6;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getIconDark() {
        return this.iconDark;
    }

    @Nullable
    public final String getJumpParams() {
        return this.jumpParams;
    }

    @Nullable
    public final String getJumpPath() {
        return this.jumpPath;
    }

    @Nullable
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setJumpParams(@Nullable String str) {
        this.jumpParams = str;
    }

    public final void setJumpPath(@Nullable String str) {
        this.jumpPath = str;
    }

    public final void setJumpType(@Nullable String str) {
        this.jumpType = str;
    }
}
