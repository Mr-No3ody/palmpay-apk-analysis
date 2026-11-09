package com.transsnet.palmpay.send_money.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/GuideDetailBean;", "", "<init>", "()V", "icon", "", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "desc", "getDesc", "setDesc", "jumpType", "getJumpType", "setJumpType", "jumpPath", "getJumpPath", "setJumpPath", "btnContent", "getBtnContent", "setBtnContent", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuideDetailBean {

    @Nullable
    private String btnContent;

    @Nullable
    private String desc;

    @Nullable
    private String icon;

    @Nullable
    private String jumpPath;

    @Nullable
    private String jumpType;

    @Nullable
    private String title;

    @Nullable
    public final String getBtnContent() {
        return this.btnContent;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
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

    public final void setBtnContent(@Nullable String str) {
        this.btnContent = str;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setJumpPath(@Nullable String str) {
        this.jumpPath = str;
    }

    public final void setJumpType(@Nullable String str) {
        this.jumpType = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
