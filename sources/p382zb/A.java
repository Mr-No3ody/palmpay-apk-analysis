package p382zb;

import Jd.c;
import Wf.AbstractC0780y;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.lifecycle.V;
import com.transsnet.adsdk.b;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.ui.fragment.MobileContactsListFragment;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.SelectBankForTransferViaUssdDialog;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.TransferViaUssdActivity;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p001if.a;
import p161kf.e;
import p287se.d;
import p298tf.f;
import p339wb.m;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44517b;

    public /* synthetic */ A(Object obj, int i7) {
        this.f44516a = i7;
        this.f44517b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f44516a) {
            case 0:
                break;
            case 1:
                Intrinsics.checkNotNullParameter(editable, "editable");
                break;
            default:
                int i7 = TransferViaUssdActivity.f33628A;
                TransferViaUssdActivity transferViaUssdActivity = (TransferViaUssdActivity) this.f44517b;
                EditText editTextL = transferViaUssdActivity.l();
                transferViaUssdActivity.t = y.k(String.valueOf(editTextL != null ? editTextL.getText() : null), " ", "");
                ModelErrorDivider modelErrorDividerN = transferViaUssdActivity.n();
                if (modelErrorDividerN != null) {
                    modelErrorDividerN.setErrorMessage("");
                }
                if (TextUtils.isEmpty(transferViaUssdActivity.t)) {
                    transferViaUssdActivity.t = "10 digit Acc No.";
                }
                transferViaUssdActivity.p();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f44516a) {
            case 1:
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        Object obj = this.f44517b;
        switch (this.f44516a) {
            case 0:
                MobileContactsListFragment mobileContactsListFragment = (MobileContactsListFragment) obj;
                String string = mobileContactsListFragment.f30362j.getText().toString();
                List list = mobileContactsListFragment.f30366w;
                if (list != null && !list.isEmpty()) {
                    if (!TextUtils.isEmpty(mobileContactsListFragment.f30362j.getText().toString())) {
                        e eVar = mobileContactsListFragment.f30361A;
                        if (eVar != null && !eVar.isDisposed()) {
                            e eVar2 = mobileContactsListFragment.f30361A;
                            eVar2.getClass();
                            a.a(eVar2);
                        }
                        C1765q c1765qI = new C1755g(new b(21, mobileContactsListFragment, string), 0).k(f.f42629b).i(p071ef.b.a());
                        e eVar3 = new e(new d(mobileContactsListFragment, 29), p147jf.a.f38601e, p147jf.a.f38599c);
                        c1765qI.subscribe(eVar3);
                        mobileContactsListFragment.f30361A = eVar3;
                        mobileContactsListFragment.f(eVar3);
                    } else {
                        m mVar = mobileContactsListFragment.f30365v;
                        mVar.f4985b = mobileContactsListFragment.f30366w;
                        mVar.notifyDataSetChanged();
                    }
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                SelectBankForTransferViaUssdDialog selectBankForTransferViaUssdDialog = (SelectBankForTransferViaUssdDialog) obj;
                CompatStateEditText compatStateEditText = selectBankForTransferViaUssdDialog.f33626Q;
                if (!TextUtils.isEmpty(compatStateEditText != null ? compatStateEditText.getText() : null)) {
                    CompatStateEditText compatStateEditText2 = selectBankForTransferViaUssdDialog.f33626Q;
                    AbstractC0780y.m(V.f(selectBankForTransferViaUssdDialog), null, null, new p384zd.e(selectBankForTransferViaUssdDialog, String.valueOf(compatStateEditText2 != null ? compatStateEditText2.getText() : null), null), 3);
                } else {
                    p173ld.m mVarJ = selectBankForTransferViaUssdDialog.j();
                    if (mVarJ != null) {
                        mVarJ.setList(c.g((CopyOnWriteArrayList) selectBankForTransferViaUssdDialog.f33623H.getValue()));
                    }
                }
                break;
            default:
                if (BaseApplication.isNG() && charSequence != null && charSequence.length() > 0) {
                    int i12 = TransferViaUssdActivity.f33628A;
                    EditText editTextL = ((TransferViaUssdActivity) obj).l();
                    if (editTextL != null) {
                        CommonViewExtKt.dealInputAccountWithSpace$default(editTextL, charSequence, i7, i10, C1850q.e(3, 3, 4), false, 16, null);
                    }
                    break;
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void c(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
