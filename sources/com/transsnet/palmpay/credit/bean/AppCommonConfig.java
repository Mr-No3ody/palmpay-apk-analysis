package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/AppCommonConfig;", "", "openAccountResultRNFlag", "", "<init>", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppCommonConfig {

    @JvmField
    @Nullable
    public final Integer openAccountResultRNFlag;

    /* JADX WARN: Multi-variable type inference failed */
    public AppCommonConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public AppCommonConfig(@Nullable Integer num) {
        this.openAccountResultRNFlag = num;
    }

    public /* synthetic */ AppCommonConfig(Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? -1 : num);
    }
}
