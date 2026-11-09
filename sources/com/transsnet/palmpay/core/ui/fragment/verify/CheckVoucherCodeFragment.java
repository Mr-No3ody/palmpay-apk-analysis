package com.transsnet.palmpay.core.ui.fragment.verify;

import Ab.i;
import C9.ViewOnClickListenerC0146m;
import android.widget.Button;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.custom_view.TitleEditView;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public class CheckVoucherCodeFragment extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TitleEditView f28045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f28046j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f28047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ViewOnClickListenerC0146m f28048p = new ViewOnClickListenerC0146m(this, 4);

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_check_voucher_code_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        TitleEditView titleEditView = (TitleEditView) this.f27318b.findViewById(e.cmf_mobile_item);
        this.f28045i = titleEditView;
        titleEditView.f31176u0 = new i(this, 24);
        this.f28046j = (Button) this.f27318b.findViewById(e.cmf_next_btn);
        this.f28047o = (TextView) this.f27318b.findViewById(e.voucher_guide_tv);
        this.f28046j.setEnabled(false);
        Button button = this.f28046j;
        ViewOnClickListenerC0146m viewOnClickListenerC0146m = this.f28048p;
        button.setOnClickListener(viewOnClickListenerC0146m);
        this.f28047o.setOnClickListener(viewOnClickListenerC0146m);
        return 0;
    }
}
