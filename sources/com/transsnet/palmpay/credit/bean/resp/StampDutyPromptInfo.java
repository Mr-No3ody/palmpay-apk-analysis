package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/StampDutyPromptInfo;", "", "promptText", "", "highlightRanges", "", "Lcom/transsnet/palmpay/credit/bean/resp/IndexRange;", "thresholdAmount", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", "getPromptText", "()Ljava/lang/String;", "getHighlightRanges", "()Ljava/util/List;", "getThresholdAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StampDutyPromptInfo {

    @Nullable
    private final List<IndexRange> highlightRanges;

    @Nullable
    private final String promptText;

    @Nullable
    private final Long thresholdAmount;

    public StampDutyPromptInfo(@Nullable String str, @Nullable List<IndexRange> list, @Nullable Long l5) {
        this.promptText = str;
        this.highlightRanges = list;
        this.thresholdAmount = l5;
    }

    @Nullable
    public final List<IndexRange> getHighlightRanges() {
        return this.highlightRanges;
    }

    @Nullable
    public final String getPromptText() {
        return this.promptText;
    }

    @Nullable
    public final Long getThresholdAmount() {
        return this.thresholdAmount;
    }
}
