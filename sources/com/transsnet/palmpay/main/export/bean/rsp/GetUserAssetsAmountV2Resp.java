package com.transsnet.palmpay.main.export.bean.rsp;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/GetUserAssetsAmountV2Resp;", "", "totalAssets", "", "fallbackText", "", "yesterdayEarningsJumpUrl", "yesterdayEarningsContentTitle", "yesterdayEarningsContentTitleColor", "yesterdayEarningsContentValue", "yesterdayEarningsContentValueColor", "isWhitelistUser", "", "assetsItems", "", "Lcom/transsnet/palmpay/main/export/bean/rsp/AssetsBalanceItem;", "savingMonthReport", "Lcom/transsnet/palmpay/main/export/bean/rsp/SavingMonthReport;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lcom/transsnet/palmpay/main/export/bean/rsp/SavingMonthReport;)V", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetUserAssetsAmountV2Resp {

    @JvmField
    @Nullable
    public final List<AssetsBalanceItem> assetsItems;

    @JvmField
    @Nullable
    public final String fallbackText;

    @JvmField
    public final boolean isWhitelistUser;

    @JvmField
    @Nullable
    public final SavingMonthReport savingMonthReport;

    @JvmField
    public final long totalAssets;

    @JvmField
    @Nullable
    public String yesterdayEarningsContentTitle;

    @JvmField
    @Nullable
    public String yesterdayEarningsContentTitleColor;

    @JvmField
    @Nullable
    public String yesterdayEarningsContentValue;

    @JvmField
    @Nullable
    public String yesterdayEarningsContentValueColor;

    @JvmField
    @Nullable
    public String yesterdayEarningsJumpUrl;

    public GetUserAssetsAmountV2Resp() {
        this(0L, null, null, null, null, null, null, false, null, null, 1023, null);
    }

    public GetUserAssetsAmountV2Resp(long j6, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z3, @Nullable List<AssetsBalanceItem> list, @Nullable SavingMonthReport savingMonthReport) {
        this.totalAssets = j6;
        this.fallbackText = str;
        this.yesterdayEarningsJumpUrl = str2;
        this.yesterdayEarningsContentTitle = str3;
        this.yesterdayEarningsContentTitleColor = str4;
        this.yesterdayEarningsContentValue = str5;
        this.yesterdayEarningsContentValueColor = str6;
        this.isWhitelistUser = z3;
        this.assetsItems = list;
        this.savingMonthReport = savingMonthReport;
    }

    public /* synthetic */ GetUserAssetsAmountV2Resp(long j6, String str, String str2, String str3, String str4, String str5, String str6, boolean z3, List list, SavingMonthReport savingMonthReport, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j6, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : str5, (i7 & 64) != 0 ? null : str6, (i7 & 128) != 0 ? false : z3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : list, (i7 & 512) != 0 ? null : savingMonthReport);
    }
}
