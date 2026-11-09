package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/IndexRange;", "", "startIndex", "", "endIndex", "<init>", "(II)V", "getStartIndex", "()I", "getEndIndex", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IndexRange {
    private final int endIndex;
    private final int startIndex;

    public IndexRange(int i7, int i10) {
        this.startIndex = i7;
        this.endIndex = i10;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }
}
