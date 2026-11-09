package com.transsnet.palmpay.send_money.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/TopEntranceBean;", "", "<init>", "()V", "darkIcon", "", "getDarkIcon", "()Ljava/lang/String;", "setDarkIcon", "(Ljava/lang/String;)V", "icon", "getIcon", "setIcon", "jumpUrl", "getJumpUrl", "setJumpUrl", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TopEntranceBean {

    @Nullable
    private String darkIcon;

    @Nullable
    private String icon;

    @Nullable
    private String jumpUrl;

    @Nullable
    public final String getDarkIcon() {
        return this.darkIcon;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final void setDarkIcon(@Nullable String str) {
        this.darkIcon = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }
}
