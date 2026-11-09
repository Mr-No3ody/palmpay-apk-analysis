package Hb;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxAutoSaveDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3851c;

    public /* synthetic */ u(View view, Object obj, int i7) {
        this.f3849a = i7;
        this.f3850b = view;
        this.f3851c = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton buttonView, boolean z3) {
        Object obj = this.f3851c;
        View view = this.f3850b;
        switch (this.f3849a) {
            case 0:
                Intrinsics.checkNotNullParameter(buttonView, "buttonView");
                TextView textView = (TextView) view;
                x xVar = (x) obj;
                if (!z3) {
                    textView.setEnabled(false);
                    textView.setBackgroundTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, xVar.c())));
                } else {
                    textView.setEnabled(true);
                    textView.setBackgroundTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, xVar.c())));
                    textView.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextBase, xVar.c()));
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(buttonView, "buttonView");
                TextView textView2 = (TextView) view;
                z zVar = (z) obj;
                if (!z3) {
                    textView2.setEnabled(false);
                    textView2.setBackgroundTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, zVar.c())));
                } else {
                    textView2.setEnabled(true);
                    textView2.setBackgroundTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, zVar.c())));
                    textView2.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextBase, zVar.c()));
                }
                break;
            default:
                CashBoxAutoSaveDialogFragment.a aVar = CashBoxAutoSaveDialogFragment.f32279M;
                Intrinsics.checkNotNullParameter(buttonView, "buttonView");
                PpButton ppButton = (PpButton) view;
                if (ppButton != null) {
                    CheckBox checkBox = (CheckBox) obj;
                    Intrinsics.e(checkBox);
                    ppButton.setEnabled(checkBox.isChecked());
                }
                break;
        }
    }
}
