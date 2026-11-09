package B8;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.transsnet.mtn.sdk.ui.view.InputView;
import java.util.Calendar;
import mh.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputView f563b;

    public /* synthetic */ a(InputView inputView, int i7) {
        this.f562a = i7;
        this.f563b = inputView;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e eVar;
        Calendar calendar;
        switch (this.f562a) {
            case 0:
                InputView inputView = this.f563b;
                int selectionStart = inputView.f25704a.getSelectionStart();
                int selectionEnd = inputView.f25704a.getSelectionEnd();
                AppCompatEditText appCompatEditText = inputView.f25704a;
                boolean z3 = inputView.f25714p;
                inputView.f25714p = !z3;
                appCompatEditText.setTransformationMethod(!z3 ? HideReturnsTransformationMethod.getInstance() : PasswordTransformationMethod.getInstance());
                inputView.f25704a.setSelection(selectionStart, selectionEnd);
                inputView.f25706c.setImageResource(inputView.f25714p ? p349x8.c.mtn_edit_eye_open : p349x8.c.mtn_edit_eye_close);
                break;
            case 1:
                InputView inputView2 = this.f563b;
                if (inputView2.f25707d == null) {
                    e eVar2 = new e(inputView2.getContext(), 1);
                    eVar2.f39784p = 1;
                    inputView2.f25707d = eVar2;
                    eVar2.f39783o = new A8.a(inputView2, 14);
                }
                e eVar3 = inputView2.f25707d;
                int i7 = inputView2.f25713o;
                eVar3.f39784p = i7;
                e.t = (String[]) org.chromium.support_lib_boundary.util.b.b(i7).toArray(new String[0]);
                eVar3.show();
                if (i7 != 1) {
                    if (i7 == 2) {
                        eVar3.f39778e.setVisibility(8);
                    }
                    eVar = inputView2.f25707d;
                    calendar = (Calendar) inputView2.f25704a.getTag();
                    if (calendar == null) {
                        eVar.getClass();
                        calendar = Calendar.getInstance();
                    }
                    eVar.f39782j.c(calendar);
                    inputView2.f25707d.f39776c.setText(inputView2.f25711i);
                    inputView2.f25707d.f39781i.setEnableColor(inputView2.f25712j);
                } else {
                    eVar3.f39778e.setVisibility(0);
                }
                eVar3.f39779f.setVisibility(0);
                eVar3.f39780g.setVisibility(0);
                eVar = inputView2.f25707d;
                calendar = (Calendar) inputView2.f25704a.getTag();
                if (calendar == null) {
                    eVar.getClass();
                    calendar = Calendar.getInstance();
                }
                eVar.f39782j.c(calendar);
                inputView2.f25707d.f39776c.setText(inputView2.f25711i);
                inputView2.f25707d.f39781i.setEnableColor(inputView2.f25712j);
                break;
            case 2:
                InputView inputView3 = this.f563b;
                int selectionStart2 = inputView3.f25704a.getSelectionStart();
                int selectionEnd2 = inputView3.f25704a.getSelectionEnd();
                AppCompatEditText appCompatEditText2 = inputView3.f25704a;
                boolean z8 = inputView3.f25714p;
                inputView3.f25714p = !z8;
                appCompatEditText2.setTransformationMethod(!z8 ? HideReturnsTransformationMethod.getInstance() : PasswordTransformationMethod.getInstance());
                inputView3.f25704a.setSelection(selectionStart2, selectionEnd2);
                inputView3.f25706c.setImageResource(inputView3.f25714p ? p349x8.c.mtn_edit_eye_open : p349x8.c.mtn_edit_eye_close);
                break;
            default:
                this.f563b.f25704a.setText("");
                break;
        }
    }
}
