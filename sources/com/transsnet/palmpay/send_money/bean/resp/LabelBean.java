package com.transsnet.palmpay.send_money.bean.resp;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/LabelBean;", "", "<init>", "()V", Constants.ScionAnalytics.PARAM_LABEL, "", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "selectedUrl", "getSelectedUrl", "setSelectedUrl", "selectedDarkUrl", "getSelectedDarkUrl", "setSelectedDarkUrl", "unselectedUrl", "getUnselectedUrl", "setUnselectedUrl", "unselectedDarkUrl", "getUnselectedDarkUrl", "setUnselectedDarkUrl", "defaultSelectedLabel", "", "getDefaultSelectedLabel", "()Ljava/lang/Boolean;", "setDefaultSelectedLabel", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LabelBean {

    @Nullable
    private Boolean defaultSelectedLabel = Boolean.FALSE;

    @Nullable
    private String label;

    @Nullable
    private String selectedDarkUrl;

    @Nullable
    private String selectedUrl;

    @Nullable
    private String unselectedDarkUrl;

    @Nullable
    private String unselectedUrl;

    @Nullable
    public final Boolean getDefaultSelectedLabel() {
        return this.defaultSelectedLabel;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getSelectedDarkUrl() {
        return this.selectedDarkUrl;
    }

    @Nullable
    public final String getSelectedUrl() {
        return this.selectedUrl;
    }

    @Nullable
    public final String getUnselectedDarkUrl() {
        return this.unselectedDarkUrl;
    }

    @Nullable
    public final String getUnselectedUrl() {
        return this.unselectedUrl;
    }

    public final void setDefaultSelectedLabel(@Nullable Boolean bool) {
        this.defaultSelectedLabel = bool;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setSelectedDarkUrl(@Nullable String str) {
        this.selectedDarkUrl = str;
    }

    public final void setSelectedUrl(@Nullable String str) {
        this.selectedUrl = str;
    }

    public final void setUnselectedDarkUrl(@Nullable String str) {
        this.unselectedDarkUrl = str;
    }

    public final void setUnselectedUrl(@Nullable String str) {
        this.unselectedUrl = str;
    }
}
