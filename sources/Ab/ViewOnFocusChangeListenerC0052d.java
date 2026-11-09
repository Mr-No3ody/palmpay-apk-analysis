package Ab;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.textinput.ReactEditText;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLBorrowBaseFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ab.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0052d implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f120c;

    public /* synthetic */ ViewOnFocusChangeListenerC0052d(int i7, Object obj, Object obj2) {
        this.f118a = i7;
        this.f119b = obj;
        this.f120c = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        Object obj = this.f120c;
        Object obj2 = this.f119b;
        switch (this.f118a) {
            case 0:
                int i7 = CLBorrowBaseFragment.f30503H1;
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment = (CLInstallmentBorrowFragment) obj2;
                cLInstallmentBorrowFragment.d0(z3);
                Context context = (Context) obj;
                if (!z3) {
                    cLInstallmentBorrowFragment.y().setBackgroundColor(context.getColor(Ya.b.cs_cl_input_divider_normal_color));
                } else {
                    cLInstallmentBorrowFragment.y().setBackgroundColor(context.getColor(Ya.b.cs_cl_input_divider_focus_color));
                }
                break;
            case 1:
                ReactTextInputManager.addEventEmitters$lambda$2((ThemedReactContext) obj2, (ReactEditText) obj, view, z3);
                break;
            default:
                View.OnFocusChangeListener onFocusChangeListener = (View.OnFocusChangeListener) obj2;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z3);
                }
                EditText editText = (EditText) obj;
                if (!z3) {
                    editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                } else {
                    Editable editableText = editText.getEditableText();
                    Intrinsics.checkNotNullExpressionValue(editableText, "getEditableText(...)");
                    editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, editableText.length() > 0 ? com.transsnet.palmpay.custom_view.r.cv_circle_gray_cross : 0, 0);
                }
                break;
        }
    }
}
