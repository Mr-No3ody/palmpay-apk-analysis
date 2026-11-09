package com.transsnet.palmpay.send_money.bean;

import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/OrderCompensateBean;", "", "<init>", "()V", "compensateTitle", "", "getCompensateTitle", "()Ljava/lang/String;", "setCompensateTitle", "(Ljava/lang/String;)V", "compensateContent", "getCompensateContent", "setCompensateContent", "compensateQuestionPic", "getCompensateQuestionPic", "setCompensateQuestionPic", "compensateQuestionJumpUrl", "getCompensateQuestionJumpUrl", "setCompensateQuestionJumpUrl", "showCompensate", "", "getShowCompensate", "()Ljava/lang/Boolean;", "setShowCompensate", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "compensateStatusList", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/send_money/bean/OrderCompensateStatusBean;", "Lkotlin/collections/ArrayList;", "getCompensateStatusList", "()Ljava/util/ArrayList;", "setCompensateStatusList", "(Ljava/util/ArrayList;)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderCompensateBean {

    @Nullable
    private String compensateContent;

    @Nullable
    private String compensateQuestionJumpUrl;

    @Nullable
    private String compensateQuestionPic;

    @Nullable
    private ArrayList<OrderCompensateStatusBean> compensateStatusList;

    @Nullable
    private String compensateTitle;

    @Nullable
    private Boolean showCompensate;

    @Nullable
    public final String getCompensateContent() {
        return this.compensateContent;
    }

    @Nullable
    public final String getCompensateQuestionJumpUrl() {
        return this.compensateQuestionJumpUrl;
    }

    @Nullable
    public final String getCompensateQuestionPic() {
        return this.compensateQuestionPic;
    }

    @Nullable
    public final ArrayList<OrderCompensateStatusBean> getCompensateStatusList() {
        return this.compensateStatusList;
    }

    @Nullable
    public final String getCompensateTitle() {
        return this.compensateTitle;
    }

    @Nullable
    public final Boolean getShowCompensate() {
        return this.showCompensate;
    }

    public final void setCompensateContent(@Nullable String str) {
        this.compensateContent = str;
    }

    public final void setCompensateQuestionJumpUrl(@Nullable String str) {
        this.compensateQuestionJumpUrl = str;
    }

    public final void setCompensateQuestionPic(@Nullable String str) {
        this.compensateQuestionPic = str;
    }

    public final void setCompensateStatusList(@Nullable ArrayList<OrderCompensateStatusBean> arrayList) {
        this.compensateStatusList = arrayList;
    }

    public final void setCompensateTitle(@Nullable String str) {
        this.compensateTitle = str;
    }

    public final void setShowCompensate(@Nullable Boolean bool) {
        this.showCompensate = bool;
    }
}
