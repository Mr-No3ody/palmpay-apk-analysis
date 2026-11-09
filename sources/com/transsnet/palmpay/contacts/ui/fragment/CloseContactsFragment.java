package com.transsnet.palmpay.contacts.ui.fragment;

import C9.C0158z;
import C9.ViewOnClickListenerC0146m;
import R9.d;
import R9.e;
import S9.a;
import V9.q;
import W9.C0721b;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.bean.req.QueryFamilyAccountReq;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import java.util.ArrayList;
import p025ba.k;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
public class CloseContactsFragment extends BaseFragment {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f27264A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ViewOnClickListenerC0146m f27265B = new ViewOnClickListenerC0146m(this, 15);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f27266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f27267j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleAdView f27268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RoundedTextView f27269p;
    public ConstraintLayout t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0721b f27270v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f27271w;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return e.ct_fragment_close_contacts;
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
        this.f27267j = (RecyclerView) this.f27318b.findViewById(d.cfcc_rcv);
        this.f27266i = (TextView) this.f27318b.findViewById(d.cfcc_add_contact_tv);
        this.f27268o = (SingleAdView) this.f27318b.findViewById(d.sadv);
        this.f27269p = (RoundedTextView) this.f27318b.findViewById(d.rtvAddBeneficiary);
        this.t = (ConstraintLayout) this.f27318b.findViewById(d.layoutEmpty);
        if (getArguments() != null) {
            this.f27264A = getArguments().getString("transType");
        }
        if (TextUtils.equals(this.f27264A, "04")) {
            this.f27268o.setSlotId(getString(k.contact_beneficiaries_list_airtime_top_banner));
        } else if (TextUtils.equals(this.f27264A, TransType.TRANS_TYPE_BUNDLE)) {
            this.f27268o.setSlotId(getString(k.contact_beneficiaries_list_data_top_banner));
        }
        this.f27268o.setAdListener(new C0158z(this, 13));
        TextView textView = this.f27266i;
        ViewOnClickListenerC0146m viewOnClickListenerC0146m = this.f27265B;
        textView.setOnClickListener(viewOnClickListenerC0146m);
        this.f27269p.setOnClickListener(viewOnClickListenerC0146m);
        this.f27270v = new C0721b(getActivity());
        ArrayList arrayList = new ArrayList();
        this.f27271w = arrayList;
        this.f27270v.f4985b = arrayList;
        this.f27267j.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f27267j.setAdapter(this.f27270v);
        this.f27270v.f4986c = new q(this, 19);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((ContactsApiService) a.f8824a.f41079b).queryFamilyAccountListV2(new QueryFamilyAccountReq(AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE, 1, 200)).k(f.f42629b).i(b.a()).subscribe(new Y9.a(this));
    }
}
