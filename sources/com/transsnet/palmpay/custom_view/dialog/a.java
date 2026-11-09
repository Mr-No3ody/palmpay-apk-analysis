package com.transsnet.palmpay.custom_view.dialog;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends BottomSheetDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31260a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            View viewFindViewById = findViewById(R.id.design_bottom_sheet);
            Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) viewFindViewById;
            frameLayout.setBackgroundResource(android.R.color.transparent);
            if (this.f31260a > 0) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                bottomSheetBehaviorFrom.setPeekHeight(this.f31260a);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.show();
    }
}
