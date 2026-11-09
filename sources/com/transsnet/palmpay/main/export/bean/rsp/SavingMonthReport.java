package com.transsnet.palmpay.main.export.bean.rsp;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/SavingMonthReport;", "", "androidJumpUrl", "", FirebaseAnalytics.Param.CONTENT, "contentColor", "jumpType", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SavingMonthReport {

    @JvmField
    @Nullable
    public final String androidJumpUrl;

    @JvmField
    @Nullable
    public final String content;

    @JvmField
    @Nullable
    public final String contentColor;

    @JvmField
    public final int jumpType;

    @JvmField
    @Nullable
    public final String title;

    public SavingMonthReport() {
        this(null, null, null, 0, null, 31, null);
    }

    public SavingMonthReport(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7, @Nullable String str4) {
        this.androidJumpUrl = str;
        this.content = str2;
        this.contentColor = str3;
        this.jumpType = i7;
        this.title = str4;
    }

    public /* synthetic */ SavingMonthReport(String str, String str2, String str3, int i7, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? 0 : i7, (i10 & 16) != 0 ? null : str4);
    }
}
