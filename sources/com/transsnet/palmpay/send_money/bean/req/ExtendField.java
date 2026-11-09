package com.transsnet.palmpay.send_money.bean.req;

import N8.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/ExtendField;", "", "needShowAccountNo", "", "<init>", "(Ljava/lang/String;)V", "getNeedShowAccountNo", "()Ljava/lang/String;", "setNeedShowAccountNo", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ExtendField {

    @Nullable
    private String needShowAccountNo;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendField() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ExtendField copy$default(ExtendField extendField, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = extendField.needShowAccountNo;
        }
        return extendField.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNeedShowAccountNo() {
        return this.needShowAccountNo;
    }

    @NotNull
    public final ExtendField copy(@Nullable String needShowAccountNo) {
        return new ExtendField(needShowAccountNo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExtendField) && Intrinsics.c(this.needShowAccountNo, ((ExtendField) other).needShowAccountNo);
    }

    @Nullable
    public final String getNeedShowAccountNo() {
        return this.needShowAccountNo;
    }

    public int hashCode() {
        String str = this.needShowAccountNo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setNeedShowAccountNo(@Nullable String str) {
        this.needShowAccountNo = str;
    }

    @NotNull
    public String toString() {
        return q0.k("ExtendField(needShowAccountNo=", this.needShowAccountNo, ")");
    }

    public ExtendField(@Nullable String str) {
        this.needShowAccountNo = str;
    }

    public /* synthetic */ ExtendField(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str);
    }
}
