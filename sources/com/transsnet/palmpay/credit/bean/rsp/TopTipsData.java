package com.transsnet.palmpay.credit.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/TopTipsData;", "", "tipStatus", "", "statusMsg", "jumpType", "jumpPath", "jumpParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTipStatus", "()Ljava/lang/String;", "getStatusMsg", "getJumpType", "getJumpPath", "getJumpParams", "Companion", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TopTipsData {

    @NotNull
    public static final String DISABLE = "disable";

    @NotNull
    public static final String FROZEN = "frozen";

    @NotNull
    public static final String NOTICE = "notice";

    @NotNull
    public static final String OVERDUE = "overdue";

    @NotNull
    public static final String OVERPAYMENT = "overpayment";

    @Nullable
    private final String jumpParams;

    @Nullable
    private final String jumpPath;

    @Nullable
    private final String jumpType;

    @Nullable
    private final String statusMsg;

    @Nullable
    private final String tipStatus;

    public TopTipsData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.tipStatus = str;
        this.statusMsg = str2;
        this.jumpType = str3;
        this.jumpPath = str4;
        this.jumpParams = str5;
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
    public final String getStatusMsg() {
        return this.statusMsg;
    }

    @Nullable
    public final String getTipStatus() {
        return this.tipStatus;
    }
}
