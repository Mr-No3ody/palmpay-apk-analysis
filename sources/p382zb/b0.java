package p382zb;

import L6.b;
import M1.j;
import Ya.d;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentResultListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.credit.ui.fragment.OcMainFragment;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.SelectBankForTransferViaUssdDialog;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.TransferViaUssdActivity;
import com.transsnet.palmpay.util.SizeUtils;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.jvm.internal.Intrinsics;
import p141j9.C1798f;
import p173ld.m;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b0 implements NestedScrollView.OnScrollChangeListener, Function, OnItemClickListener, FragmentResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f44568a;

    public /* synthetic */ b0(Object obj) {
        this.f44568a = obj;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return (ObservableSource) ((C1798f) this.f44568a).invoke(p3);
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        int i7 = TransferViaUssdActivity.f33628A;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        BankInfo bankInfo = (BankInfo) bundle.getParcelable("BANK_CARD_INFO");
        TransferViaUssdActivity transferViaUssdActivity = (TransferViaUssdActivity) this.f44568a;
        if (bankInfo == null) {
            transferViaUssdActivity.getClass();
            return;
        }
        transferViaUssdActivity.f33636i = bankInfo;
        IconicsTextView iconicsTextViewO = transferViaUssdActivity.o();
        if (iconicsTextViewO != null) {
            iconicsTextViewO.setText(bankInfo.bankName);
        }
        String bankCode = bankInfo.bankCode;
        Intrinsics.checkNotNullExpressionValue(bankCode, "bankCode");
        transferViaUssdActivity.f33639p = bankCode;
        transferViaUssdActivity.p();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        SelectBankForTransferViaUssdDialog.a aVar = SelectBankForTransferViaUssdDialog.f33621Y;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        SelectBankForTransferViaUssdDialog selectBankForTransferViaUssdDialog = (SelectBankForTransferViaUssdDialog) this.f44568a;
        m mVarJ = selectBankForTransferViaUssdDialog.j();
        BankInfo bankInfo = mVarJ != null ? (BankInfo) mVarJ.getItem(i7) : null;
        if (bankInfo == null || !bankInfo.isHeader) {
            Bundle result = new Bundle();
            result.putParcelable("BANK_CARD_INFO", bankInfo);
            Intrinsics.checkNotNullParameter(selectBankForTransferViaUssdDialog, "<this>");
            Intrinsics.checkNotNullParameter("REQUEST_SELECT_BANK", "requestKey");
            Intrinsics.checkNotNullParameter(result, "result");
            selectBankForTransferViaUssdDialog.getParentFragmentManager().setFragmentResult("REQUEST_SELECT_BANK", result);
            selectBankForTransferViaUssdDialog.dismiss();
        }
    }

    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView v3, int i7, int i10, int i11, int i12) {
        int i13 = OcMainFragment.f30445B0;
        Intrinsics.checkNotNullParameter(v3, "v");
        int iDp2px = SizeUtils.dp2px(12.0f);
        OcMainFragment ocMainFragment = (OcMainFragment) this.f44568a;
        t tVar = ocMainFragment.f30457k0;
        if (i10 <= iDp2px) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((LinearLayout) value).setBackgroundColor(ocMainFragment.requireContext().getColor(p.transparent));
            ocMainFragment.x().setImageResource(d.cs_oc_back_icon_white);
            ocMainFragment.z().setColorFilter(-1);
            ocMainFragment.y().setTextColor(-1);
            return;
        }
        if (ocMainFragment.m()) {
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((LinearLayout) value2).setBackgroundColor(ocMainFragment.requireContext().getColor(p.cv_color_121212));
            ocMainFragment.x().setImageResource(d.cs_oc_back_icon_white);
            ocMainFragment.z().setColorFilter(-1);
            ocMainFragment.y().setTextColor(-1);
            return;
        }
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((LinearLayout) value3).setBackgroundColor(ocMainFragment.requireContext().getColor(p.cv_color_ffffff));
        ocMainFragment.x().setImageResource(d.cs_oc_back_icon_black);
        int iColorInt = CommonViewExtKt.colorInt(b.ppColorTextPrimary, ocMainFragment.getContext());
        ocMainFragment.z().setColorFilter(iColorInt);
        ocMainFragment.y().setTextColor(iColorInt);
    }
}
