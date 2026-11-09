package com.flexibank.sdk.cashier.ui.view;

import R8.d;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.flexibank.sdk.customview.model.FlexiBankModelPageTitleArea;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPageTitleAreaInPayVerifyPage;", "Lcom/flexibank/sdk/customview/model/FlexiBankModelPageTitleArea;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankModelPageTitleAreaInPayVerifyPage extends FlexiBankModelPageTitleArea {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f22044p = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPageTitleAreaInPayVerifyPage(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.flexibank.sdk.customview.model.FlexiBankModelPageTitleArea
    public final void a(Context context) {
        super.a(context);
        d dVar = new d(this, 3);
        ImageView mBackIv = getMBackIv();
        if (mBackIv != null) {
            mBackIv.setOnClickListener(dVar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPageTitleAreaInPayVerifyPage(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexiBankModelPageTitleAreaInPayVerifyPage(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPageTitleAreaInPayVerifyPage(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
