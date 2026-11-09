package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b$\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0015¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcIncreaseListData;", "", "buttonMsg", "", "complete", "", FirebaseAnalytics.Param.CONTENT, "creditQuota", "", "iconUrl", "iconUrlDark", "imageUrl", "title", "type", "", "canClick", "errorText", "completeContent", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getButtonMsg", "()Ljava/lang/String;", "getComplete", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContent", "getCreditQuota", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIconUrl", "getIconUrlDark", "getImageUrl", "getTitle", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCanClick", "getErrorText", "getCompleteContent", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcIncreaseListData {

    @Nullable
    private final String buttonMsg;

    @Nullable
    private final Boolean canClick;

    @Nullable
    private final Boolean complete;

    @Nullable
    private final String completeContent;

    @Nullable
    private final String content;

    @Nullable
    private final Long creditQuota;

    @Nullable
    private final String errorText;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String iconUrlDark;

    @Nullable
    private final String imageUrl;

    @Nullable
    private final String title;

    @Nullable
    private final Integer type;

    public OcIncreaseListData(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable Long l5, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable Boolean bool2, @Nullable String str7, @Nullable String str8) {
        this.buttonMsg = str;
        this.complete = bool;
        this.content = str2;
        this.creditQuota = l5;
        this.iconUrl = str3;
        this.iconUrlDark = str4;
        this.imageUrl = str5;
        this.title = str6;
        this.type = num;
        this.canClick = bool2;
        this.errorText = str7;
        this.completeContent = str8;
    }

    @Nullable
    public final String getButtonMsg() {
        return this.buttonMsg;
    }

    @Nullable
    public final Boolean getCanClick() {
        return this.canClick;
    }

    @Nullable
    public final Boolean getComplete() {
        return this.complete;
    }

    @Nullable
    public final String getCompleteContent() {
        return this.completeContent;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Long getCreditQuota() {
        return this.creditQuota;
    }

    @Nullable
    public final String getErrorText() {
        return this.errorText;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getIconUrlDark() {
        return this.iconUrlDark;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }
}
