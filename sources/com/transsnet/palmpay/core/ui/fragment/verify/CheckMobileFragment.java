package com.transsnet.palmpay.core.ui.fragment.verify;

import Ab.i;
import C9.ViewOnClickListenerC0146m;
import Pa.i0;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.viewmodel.ModelPageTitleAreaInPayVerifyPage;
import com.transsnet.palmpay.custom_view.TitleEditView;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class CheckMobileFragment extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ModelPageTitleAreaInPayVerifyPage f27984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TitleEditView f27985j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f27986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f27987p;
    public final ViewOnClickListenerC0146m t = new ViewOnClickListenerC0146m(this, 3);

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_check_mobile_fragment;
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
        this.f27985j = (TitleEditView) this.f27318b.findViewById(e.cmf_mobile_item);
        this.f27984i = (ModelPageTitleAreaInPayVerifyPage) this.f27318b.findViewById(e.cmf_title_area);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27987p = arguments.getString("card_no");
        }
        if (!TextUtils.isEmpty(this.f27987p)) {
            this.f27984i.f31522e.setText(getString(k.core_confirm_mobile_format, i0.c(this.f27987p)));
        }
        this.f27985j.f31176u0 = new i(this, 21);
        Button button = (Button) this.f27318b.findViewById(e.cmf_next_btn);
        this.f27986o = button;
        button.setEnabled(false);
        this.f27986o.setOnClickListener(this.t);
        return 0;
    }
}
