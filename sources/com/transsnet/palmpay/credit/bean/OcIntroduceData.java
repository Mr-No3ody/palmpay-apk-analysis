package com.transsnet.palmpay.credit.bean;

import android.text.SpannableStringBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/OcIntroduceData;", "", "topTitle", "", "introduceImg", "", "introduceTitle", "Landroid/text/SpannableStringBuilder;", "introduceContent", "<init>", "(Ljava/lang/String;ILandroid/text/SpannableStringBuilder;Landroid/text/SpannableStringBuilder;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcIntroduceData {

    @JvmField
    @Nullable
    public final SpannableStringBuilder introduceContent;

    @JvmField
    public final int introduceImg;

    @JvmField
    @Nullable
    public final SpannableStringBuilder introduceTitle;

    @JvmField
    @Nullable
    public final String topTitle;

    public OcIntroduceData(@Nullable String str, int i7, @Nullable SpannableStringBuilder spannableStringBuilder, @Nullable SpannableStringBuilder spannableStringBuilder2) {
        this.topTitle = str;
        this.introduceImg = i7;
        this.introduceTitle = spannableStringBuilder;
        this.introduceContent = spannableStringBuilder2;
    }
}
