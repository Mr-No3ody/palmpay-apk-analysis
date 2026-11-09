package com.transsnet.palmpay.credit.view;

import Gb.HandlerC0283f;
import Ya.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR2\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/view/CustomTextSwitcher;", "Landroid/widget/TextSwitcher;", "Landroid/widget/ViewSwitcher$ViewFactory;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "getMData", "()Ljava/util/ArrayList;", "setMData", "(Ljava/util/ArrayList;)V", "mData", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomTextSwitcher extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public ArrayList mData;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HandlerC0283f f30734d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomTextSwitcher(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final ArrayList<String> getMData() {
        ArrayList<String> arrayList = this.mData;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.n("mData");
        throw null;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        TextView textView = new TextView(getContext());
        textView.setTextColor(getContext().getColor(b.cs_cl_main_color));
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30734d.removeCallbacksAndMessages(null);
    }

    public final void setMData(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mData = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomTextSwitcher(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30732b = 1000L;
        this.f30734d = new HandlerC0283f(this, 0);
        setMData(new ArrayList<>());
    }
}
