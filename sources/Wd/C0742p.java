package Wd;

import Rd.r0;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import com.transsnet.palmpay.betting.ui.dialog.PickBettingBillerDialog;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.settings.TransferLimitSettingsActivity;
import com.transsnet.palmpay.teller.ui.activity.BillerSearchActivity;
import com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wd.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0742p implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f10774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10775c;

    public /* synthetic */ C0742p(int i7, KeyEvent.Callback callback, Object obj) {
        this.f10773a = i7;
        this.f10774b = callback;
        this.f10775c = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        String string2;
        Object obj = this.f10775c;
        KeyEvent.Callback callback = this.f10774b;
        switch (this.f10773a) {
            case 0:
                BillerSearchActivity billerSearchActivity = (BillerSearchActivity) callback;
                if (TextUtils.isEmpty(String.valueOf(editable))) {
                    int i7 = BillerSearchActivity.f34173p;
                    Rd.B b7 = (Rd.B) billerSearchActivity.f27334c;
                    if (b7 != null) {
                        p220oa.h.s((ImageView) b7.f7986j.f812c, false);
                    }
                    billerSearchActivity.q(true);
                } else {
                    int i10 = BillerSearchActivity.f34173p;
                    Rd.B b10 = (Rd.B) billerSearchActivity.f27334c;
                    if (b10 != null) {
                        p220oa.h.s((ImageView) b10.f7986j.f812c, true);
                    }
                }
                Handler handler = billerSearchActivity.f34179j;
                handler.removeCallbacks(billerSearchActivity.f34180o);
                handler.postDelayed(billerSearchActivity.f34180o, 200L);
                ((p055de.h) obj).a(String.valueOf(editable));
                return;
            case 1:
                PickPaymentItemDialog pickPaymentItemDialog = (PickPaymentItemDialog) callback;
                if (TextUtils.isEmpty(String.valueOf(editable))) {
                    r0 r0Var = pickPaymentItemDialog.binding;
                    if (r0Var != null) {
                        ((ImageView) r0Var.f8464b.f812c).setVisibility(8);
                    }
                } else {
                    r0 r0Var2 = pickPaymentItemDialog.binding;
                    if (r0Var2 != null) {
                        ((ImageView) r0Var2.f8464b.f812c).setVisibility(0);
                    }
                }
                String str = p070ee.c.f36289a;
                pickPaymentItemDialog.mSearchResult = p070ee.c.h(String.valueOf(editable), pickPaymentItemDialog.mRawPaymentLists);
                ArrayList arrayList = pickPaymentItemDialog.mSearchResult;
                if (arrayList != null) {
                    Yd.s sVar = pickPaymentItemDialog.mAdapter;
                    if (sVar == null) {
                        Intrinsics.n("mAdapter");
                        throw null;
                    }
                    sVar.b();
                    Yd.s sVar2 = pickPaymentItemDialog.mAdapter;
                    if (sVar2 == null) {
                        Intrinsics.n("mAdapter");
                        throw null;
                    }
                    sVar2.f4985b.addAll(arrayList);
                }
                Yd.s sVar3 = pickPaymentItemDialog.mAdapter;
                if (sVar3 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                sVar3.notifyDataSetChanged();
                pickPaymentItemDialog.updateEmptyUI();
                ((p055de.h) ((kotlin.jvm.internal.F) obj).f38951a).a(String.valueOf(editable));
                return;
            case 2:
                ((AppCompatEditText) callback).setCompoundDrawablesWithIntrinsicBounds(0, 0, (editable == null || editable.length() <= 0) ? 0 : com.flexibank.sdk.o.fb_circle_gray_cross, 0);
                ((TextWatcher) obj).afterTextChanged(editable);
                return;
            case 3:
                EditText editText = (EditText) callback;
                editText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (editable == null || editable.length() <= 0) ? null : p059e1.a.h(editText.getContext(), S6.a.pay_CloseFill, null, CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, editText.getContext()), 24.0f), (Drawable) null);
                ((TextWatcher) obj).afterTextChanged(editable);
                return;
            case 4:
                String str2 = "";
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                PickBettingBillerDialog pickBettingBillerDialog = (PickBettingBillerDialog) callback;
                pickBettingBillerDialog.updateLayoutVisible(string);
                String str3 = p070ee.c.f36289a;
                pickBettingBillerDialog.mSearchBillerResult = p070ee.c.g(String.valueOf(editable), pickBettingBillerDialog.getDatas());
                t9.i iVar = pickBettingBillerDialog.mAdapter;
                if (iVar != null) {
                    iVar.setList(pickBettingBillerDialog.mSearchBillerResult);
                }
                pickBettingBillerDialog.updateEmptyUI();
                p055de.h hVar = (p055de.h) obj;
                if (hVar != null) {
                    if (editable != null && (string2 = editable.toString()) != null) {
                        str2 = string2;
                    }
                    hVar.a(str2);
                    return;
                }
                return;
            default:
                TransferLimitSettingsActivity transferLimitSettingsActivity = (TransferLimitSettingsActivity) callback;
                if (transferLimitSettingsActivity.f33422g) {
                    return;
                }
                Long lP = TransferLimitSettingsActivity.p(editable);
                if (lP != null) {
                    transferLimitSettingsActivity.f33422g = true;
                    EditText editText2 = (EditText) obj;
                    editText2.setText(TransferLimitSettingsActivity.o(lP.longValue()));
                    editText2.setSelection(editText2.getText().length());
                    transferLimitSettingsActivity.f33422g = false;
                }
                transferLimitSettingsActivity.r();
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f10773a) {
            case 2:
                TextWatcher textWatcher = (TextWatcher) this.f10775c;
                if (textWatcher != null) {
                    textWatcher.beforeTextChanged(charSequence, i7, i10, i11);
                }
                break;
            case 3:
                TextWatcher textWatcher2 = (TextWatcher) this.f10775c;
                if (textWatcher2 != null) {
                    textWatcher2.beforeTextChanged(charSequence, i7, i10, i11);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f10773a) {
            case 2:
                TextWatcher textWatcher = (TextWatcher) this.f10775c;
                if (textWatcher != null) {
                    textWatcher.onTextChanged(charSequence, i7, i10, i11);
                }
                break;
            case 3:
                TextWatcher textWatcher2 = (TextWatcher) this.f10775c;
                if (textWatcher2 != null) {
                    textWatcher2.onTextChanged(charSequence, i7, i10, i11);
                }
                break;
        }
    }

    private final void a(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void b(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void c(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void d(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void e(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void f(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void g(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void h(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
