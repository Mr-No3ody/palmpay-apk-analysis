package com.transsnet.palmpay.credit.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/ApplyProtoContent;", "", "clickType", "", FirebaseAnalytics.Param.CONTENT, "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApplyProtoContent {

    @JvmField
    @Nullable
    public final Integer clickType;

    @JvmField
    @Nullable
    public final String content;

    public ApplyProtoContent(@Nullable Integer num, @Nullable String str) {
        this.clickType = num;
        this.content = str;
    }
}
