package com.transsnet.palmpay.ui.view;

import G1.d;
import Pa.r0;
import Sa.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.collections.z;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/ui/view/MultiAvatarLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "avatarUrls", "", "setAvatars", "(Ljava/util/List;)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiAvatarLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiAvatarLayout.kt\ncom/transsnet/palmpay/ui/view/MultiAvatarLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1878#2,3:99\n1#3:102\n*S KotlinDebug\n*F\n+ 1 MultiAvatarLayout.kt\ncom/transsnet/palmpay/ui/view/MultiAvatarLayout\n*L\n36#1:99,3\n*E\n"})
public final class MultiAvatarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35319c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultiAvatarLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
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
            layoutParams2.setMarginStart(i13 > 0 ? -this.f35318b : 0);
            childAt.setLayoutParams(layoutParams2);
            i13++;
        }
        requestLayout();
    }

    public final void setAvatars(@Nullable List<String> avatarUrls) {
        removeAllViews();
        if (avatarUrls == null) {
            avatarUrls = z.f38935a;
        }
        int i7 = 0;
        for (Object obj : avatarUrls) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            String str = (String) obj;
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            appCompatImageView.setZ(avatarUrls.size() - i7);
            if (StringsKt.F(str)) {
                appCompatImageView.setImageDrawable(null);
            } else {
                r0.j1(appCompatImageView, str, (d) d.O(r.cv_avatar_default).H(new b(this.f35319c, CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, getContext()))));
            }
            int height = getHeight();
            Integer numValueOf = height > 0 ? Integer.valueOf(height) : null;
            int iIntValue = numValueOf != null ? numValueOf.intValue() : this.f35317a;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iIntValue, iIntValue);
            layoutParams.setMarginStart(i7 > 0 ? -this.f35318b : 0);
            addView(appCompatImageView, layoutParams);
            i7 = i10;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultiAvatarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MultiAvatarLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultiAvatarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35317a = CommonViewExtKt.getDp(24);
        this.f35318b = CommonViewExtKt.getDp(8);
        this.f35319c = CommonViewExtKt.getDp(1);
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
    }
}
