package com.transsnet.palmpay.cash_in.bean.request;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/request/ExtendField;", "", "payerBankCode", "", "payerBankName", "payerBankAccNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtendField {

    @JvmField
    @Nullable
    public String payerBankAccNo;

    @JvmField
    @Nullable
    public String payerBankCode;

    @JvmField
    @Nullable
    public String payerBankName;

    public ExtendField() {
        this(null, null, null, 7, null);
    }

    public ExtendField(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.payerBankCode = str;
        this.payerBankName = str2;
        this.payerBankAccNo = str3;
    }

    public /* synthetic */ ExtendField(String str, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3);
    }
}
