package p284sb;

import android.text.Editable;
import android.text.TextWatcher;
import com.transsnet.palmpay.credit.ui.activity.PayShopHomeActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.collections.C1850q;
import kotlin.text.y;
import p220oa.h;

/* JADX INFO: renamed from: sb.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2024w implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayShopHomeActivity f42190a;

    public C2024w(PayShopHomeActivity payShopHomeActivity) {
        this.f42190a = payShopHomeActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strK = y.k(String.valueOf(editable), " ", "");
        int length = strK.length();
        PayShopHomeActivity payShopHomeActivity = this.f42190a;
        if (length == 8 || strK.length() == 10) {
            int i7 = PayShopHomeActivity.f28705p0;
            h.c(payShopHomeActivity.u());
            payShopHomeActivity.v(strK, false);
        } else {
            int i10 = PayShopHomeActivity.f28705p0;
            h.C(payShopHomeActivity.u());
            h.c(payShopHomeActivity.s());
            h.c(payShopHomeActivity.q());
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        int i12 = PayShopHomeActivity.f28705p0;
        CommonViewExtKt.dealInputAccountWithSpace$default(this.f42190a.p(), charSequence, i7, i10, C1850q.e(3, 3, 4), false, 16, null);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
