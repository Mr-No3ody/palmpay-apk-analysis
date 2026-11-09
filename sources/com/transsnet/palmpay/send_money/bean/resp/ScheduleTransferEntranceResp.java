package com.transsnet.palmpay.send_money.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\u001c\u0010!\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR\u001c\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\t¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferEntranceResp;", "", "<init>", "()V", "jumpUrl", "", "getJumpUrl", "()Ljava/lang/String;", "setJumpUrl", "(Ljava/lang/String;)V", "darkPic", "getDarkPic", "setDarkPic", "pic", "getPic", "setPic", "show", "", "getShow", "()Ljava/lang/Boolean;", "setShow", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "entranceType", "", "getEntranceType", "()Ljava/lang/Integer;", "setEntranceType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "viewEvent", "getViewEvent", "setViewEvent", "clickEvent", "getClickEvent", "setClickEvent", "elementName", "getElementName", "setElementName", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTransferEntranceResp {

    @Nullable
    private String clickEvent;

    @Nullable
    private String darkPic;

    @Nullable
    private String elementName;

    @Nullable
    private Integer entranceType;

    @Nullable
    private String jumpUrl;

    @Nullable
    private String pic;

    @Nullable
    private Boolean show;

    @Nullable
    private String viewEvent;

    @Nullable
    public final String getClickEvent() {
        return this.clickEvent;
    }

    @Nullable
    public final String getDarkPic() {
        return this.darkPic;
    }

    @Nullable
    public final String getElementName() {
        return this.elementName;
    }

    @Nullable
    public final Integer getEntranceType() {
        return this.entranceType;
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
    public final Boolean getShow() {
        return this.show;
    }

    @Nullable
    public final String getViewEvent() {
        return this.viewEvent;
    }

    public final void setClickEvent(@Nullable String str) {
        this.clickEvent = str;
    }

    public final void setDarkPic(@Nullable String str) {
        this.darkPic = str;
    }

    public final void setElementName(@Nullable String str) {
        this.elementName = str;
    }

    public final void setEntranceType(@Nullable Integer num) {
        this.entranceType = num;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setShow(@Nullable Boolean bool) {
        this.show = bool;
    }

    public final void setViewEvent(@Nullable String str) {
        this.viewEvent = str;
    }
}
