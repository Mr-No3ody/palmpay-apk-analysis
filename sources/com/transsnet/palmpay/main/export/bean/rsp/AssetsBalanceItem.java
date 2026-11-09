package com.transsnet.palmpay.main.export.bean.rsp;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/AssetsBalanceItem;", "", "title", "", "tips", "itemType", "", "balance", "", "expireTime", "jumpType", "jumpUrl", ViewProps.COLOR, "subItems", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/Long;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetsBalanceItem {

    @JvmField
    public final long balance;

    @JvmField
    @Nullable
    public final String color;

    @JvmField
    @Nullable
    public final Long expireTime;

    @JvmField
    public final int itemType;

    @JvmField
    @Nullable
    public final String jumpType;

    @JvmField
    @Nullable
    public final String jumpUrl;

    @JvmField
    @Nullable
    public List<AssetsBalanceItem> subItems;

    @JvmField
    @Nullable
    public final String tips;

    @JvmField
    @Nullable
    public final String title;

    public AssetsBalanceItem() {
        this(null, null, 0, 0L, null, null, null, null, null, 511, null);
    }

    public AssetsBalanceItem(@Nullable String str, @Nullable String str2, int i7, long j6, @Nullable Long l5, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable List<AssetsBalanceItem> list) {
        this.title = str;
        this.tips = str2;
        this.itemType = i7;
        this.balance = j6;
        this.expireTime = l5;
        this.jumpType = str3;
        this.jumpUrl = str4;
        this.color = str5;
        this.subItems = list;
    }

    public /* synthetic */ AssetsBalanceItem(String str, String str2, int i7, long j6, Long l5, String str3, String str4, String str5, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? 0 : i7, (i10 & 8) != 0 ? 0L : j6, (i10 & 16) != 0 ? null : l5, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : list);
    }
}
