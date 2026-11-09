package com.transsnet.palmpay.core.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/core/bean/DayPickBean;", "", "day", "", "<init>", "(I)V", "getDay", "()I", "setDay", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DayPickBean {
    private int day;

    public DayPickBean() {
        this(0, 1, null);
    }

    public final int getDay() {
        return this.day;
    }

    public final void setDay(int i7) {
        this.day = i7;
    }

    public DayPickBean(int i7) {
        this.day = i7;
    }

    public /* synthetic */ DayPickBean(int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1 : i7);
    }
}
