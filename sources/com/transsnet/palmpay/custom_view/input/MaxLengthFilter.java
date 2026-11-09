package com.transsnet.palmpay.custom_view.input;

import android.text.InputFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/MaxLengthFilter;", "Landroid/text/InputFilter$LengthFilter;", "maxLength", "", "<init>", "(I)V", "getMaxLength", "()I", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MaxLengthFilter extends InputFilter.LengthFilter {
    private final int maxLength;

    public MaxLengthFilter(int i7) {
        super(i7);
        this.maxLength = i7;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }
}
