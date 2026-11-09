package com.transsnet.palmpay.send_money.bean.resp;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\t¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/BenefitsBean;", "", "<init>", "()V", "pic", "", "getPic", "()Ljava/lang/String;", "setPic", "(Ljava/lang/String;)V", "darkPic", "getDarkPic", "setDarkPic", "picWidth", "", "getPicWidth", "()Ljava/lang/Integer;", "setPicWidth", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "jumpUrl", "getJumpUrl", "setJumpUrl", "show", "", "getShow", "()Ljava/lang/Boolean;", "setShow", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", FirebaseAnalytics.Param.CONTENT, "getContent", "setContent", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BenefitsBean {

    @Nullable
    private String content;

    @Nullable
    private String darkPic;

    @Nullable
    private String jumpUrl;

    @Nullable
    private String pic;

    @Nullable
    private Integer picWidth;

    @Nullable
    private Boolean show;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getDarkPic() {
        return this.darkPic;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final Integer getPicWidth() {
        return this.picWidth;
    }

    @Nullable
    public final Boolean getShow() {
        return this.show;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setDarkPic(@Nullable String str) {
        this.darkPic = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setPicWidth(@Nullable Integer num) {
        this.picWidth = num;
    }

    public final void setShow(@Nullable Boolean bool) {
        this.show = bool;
    }
}
