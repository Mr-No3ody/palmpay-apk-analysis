package com.transsnet.palmpay.airtime.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/view/GroupPurchaseAvatarLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGroupPurchaseAvatarLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupPurchaseAvatarLayout.kt\ncom/transsnet/palmpay/airtime/ui/view/GroupPurchaseAvatarLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1878#2,3:137\n1#3:140\n*S KotlinDebug\n*F\n+ 1 GroupPurchaseAvatarLayout.kt\ncom/transsnet/palmpay/airtime/ui/view/GroupPurchaseAvatarLayout\n*L\n40#1:137,3\n*E\n"})
public final class GroupPurchaseAvatarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26588c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GroupPurchaseAvatarLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(AppCompatImageView appCompatImageView, int i7) {
        int height = getHeight();
        Integer numValueOf = Integer.valueOf(height);
        if (height <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : this.f26586a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iIntValue, iIntValue);
        layoutParams.setMarginStart(i7 > 0 ? -this.f26587b : 0);
        addView(appCompatImageView, layoutParams);
    }

    public final AppCompatImageView b() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return appCompatImageView;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i10 == i12 || i10 <= 0) {
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = i10;
            layoutParams2.height = i10;
            layoutParams2.setMarginStart(i13 > 0 ? -this.f26587b : 0);
            childAt.setLayoutParams(layoutParams2);
            i13++;
        }
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GroupPurchaseAvatarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GroupPurchaseAvatarLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GroupPurchaseAvatarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26586a = CommonViewExtKt.getDp(24);
        this.f26587b = CommonViewExtKt.getDp(4);
        this.f26588c = CommonViewExtKt.getDp(1);
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
    }
}
