package com.transsnet.palmpay.managemoney.ui.dialog;

import Jc.d;
import O6.f;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/TurnOnAutoSaveSuccessfullyDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TurnOnAutoSaveSuccessfullyDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f32327C = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TurnOnAutoSaveSuccessfullyDialogFragment newInstance() {
            return new TurnOnAutoSaveSuccessfullyDialogFragment();
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final int h() {
        return 1500;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewInflate = LayoutInflater.from(getContext()).inflate(d.mm_turn_on_auto_save_successfully_dialog, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        baseDialog.setContentView(viewInflate);
        this.f31244j = false;
        this.f31245o = false;
        this.f31242g = 17;
        this.f31239d = DensityUtil.dp2px(214.0f);
        this.f31246p = false;
        this.f31241f = false;
        return baseDialog;
    }
}
