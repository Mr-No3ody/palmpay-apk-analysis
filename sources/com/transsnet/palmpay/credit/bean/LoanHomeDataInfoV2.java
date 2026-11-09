package com.transsnet.palmpay.credit.bean;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/LoanHomeDataInfoV2;", "", "outstandingContentInfo", "Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfoV2;", "productContentInfo", "", "Lcom/transsnet/palmpay/credit/bean/ProductContentInfo;", "topFMB", "", "topFMBDark", "bottomFMB", "bottomFMBDark", "showOnboarding", "", "onboardingLight", "onboardingDark", "topAdvertisementId", "<init>", "(Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfoV2;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanHomeDataInfoV2 {

    @JvmField
    @Nullable
    public final String bottomFMB;

    @JvmField
    @Nullable
    public final String bottomFMBDark;

    @JvmField
    @Nullable
    public final List<String> onboardingDark;

    @JvmField
    @Nullable
    public final List<String> onboardingLight;

    @JvmField
    @Nullable
    public final OutstandingContentInfoV2 outstandingContentInfo;

    @JvmField
    @Nullable
    public final List<ProductContentInfo> productContentInfo;

    @JvmField
    public final boolean showOnboarding;

    @JvmField
    @Nullable
    public final String topAdvertisementId;

    @JvmField
    @Nullable
    public final String topFMB;

    @JvmField
    @Nullable
    public final String topFMBDark;

    public LoanHomeDataInfoV2(@Nullable OutstandingContentInfoV2 outstandingContentInfoV2, @Nullable List<ProductContentInfo> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z3, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable String str5) {
        this.outstandingContentInfo = outstandingContentInfoV2;
        this.productContentInfo = list;
        this.topFMB = str;
        this.topFMBDark = str2;
        this.bottomFMB = str3;
        this.bottomFMBDark = str4;
        this.showOnboarding = z3;
        this.onboardingLight = list2;
        this.onboardingDark = list3;
        this.topAdvertisementId = str5;
    }

    public /* synthetic */ LoanHomeDataInfoV2(OutstandingContentInfoV2 outstandingContentInfoV2, List list, String str, String str2, String str3, String str4, boolean z3, List list2, List list3, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(outstandingContentInfoV2, list, (i7 & 4) != 0 ? null : str, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : str4, (i7 & 64) != 0 ? false : z3, (i7 & 128) != 0 ? null : list2, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : list3, str5);
    }
}
