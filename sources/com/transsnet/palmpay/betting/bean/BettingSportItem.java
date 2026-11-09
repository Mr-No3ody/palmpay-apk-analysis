package com.transsnet.palmpay.betting.bean;

import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/betting/bean/BettingSportItem;", "", "bookingCode", "", CodePushConstants.LATEST_ROLLBACK_COUNT_KEY, "odds", "reward", "", "durl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getBookingCode", "()Ljava/lang/String;", "getCount", "getOdds", "getReward", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDurl", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingSportItem {

    @Nullable
    private final String bookingCode;

    @Nullable
    private final String count;

    @Nullable
    private final String durl;

    @Nullable
    private final String odds;

    @Nullable
    private final Double reward;

    public BettingSportItem() {
        this(null, null, null, null, null, 31, null);
    }

    @Nullable
    public final String getBookingCode() {
        return this.bookingCode;
    }

    @Nullable
    public final String getCount() {
        return this.count;
    }

    @Nullable
    public final String getDurl() {
        return this.durl;
    }

    @Nullable
    public final String getOdds() {
        return this.odds;
    }

    @Nullable
    public final Double getReward() {
        return this.reward;
    }

    public BettingSportItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Double d2, @Nullable String str4) {
        this.bookingCode = str;
        this.count = str2;
        this.odds = str3;
        this.reward = d2;
        this.durl = str4;
    }

    public /* synthetic */ BettingSportItem(String str, String str2, String str3, Double d2, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? Double.valueOf(0.0d) : d2, (i7 & 16) != 0 ? null : str4);
    }
}
