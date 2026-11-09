package com.transsnet.palmpay.contacts.ui.activity;

import L6.b;
import Pa.AbstractC0512i;
import V9.j;
import V9.k;
import W9.D;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.contacts.ui.activity.AllContactsSearchActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.ArrayList;
import p001if.a;
import p161kf.e;
import p279s5.d;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/seach_all_contact")
public class AllContactsSearchActivity extends BaseActivity implements TextWatcher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f27155g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SwipeRecyclerView f27156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f27157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f27158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D f27159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f27160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f27161f = new ArrayList();

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        supportRequestWindowFeature(12);
        return R9.e.ct_all_contacts_search_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f27159d = new D(this);
        this.f27156a.getRecyclerView().setVerticalScrollBarEnabled(false);
        this.f27156a.getRecyclerView().setLayoutManager(new j(this));
        C1548f c1548f = new C1548f(getColor(b.ppColorDividerLine), 1, 30, 30);
        c1548f.f31336e = false;
        this.f27156a.setRefreshEnable(false);
        this.f27156a.setLoadMoreEnable(false);
        this.f27156a.getRecyclerView().addItemDecoration(c1548f);
        this.f27156a.setAdapter(this.f27159d);
        this.f27157b.setFocusable(true);
        this.f27157b.setFocusableInTouchMode(true);
        this.f27157b.requestFocus();
        this.f27157b.addTextChangedListener(this);
        D d2 = this.f27159d;
        d2.f4986c = new k(this);
        ArrayList arrayList = AbstractC0512i.f7094b;
        this.f27161f = arrayList;
        d2.f4985b = arrayList;
        d2.notifyDataSetChanged();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        e eVar = this.f27160e;
        if (eVar != null && !eVar.isDisposed()) {
            e eVar2 = this.f27160e;
            eVar2.getClass();
            a.a(eVar2);
        }
        if (TextUtils.isEmpty(this.f27157b.getText().toString())) {
            this.f27158c.setVisibility(8);
            D d2 = this.f27159d;
            d2.f4985b = this.f27161f;
            d2.notifyDataSetChanged();
            return;
        }
        this.f27158c.setVisibility(0);
        C1765q c1765qI = new C1755g(new d(this, 15, this.f27157b.getText().toString(), false), 0).k(f.f42629b).i(p071ef.b.a());
        e eVar3 = new e(new Sd.b(this, 8), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar3);
        this.f27160e = eVar3;
        addSubscription(eVar3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Z4.e.I(this);
        this.f27156a = (SwipeRecyclerView) findViewById(R9.d.contact_rv);
        this.f27158c = findViewById(R9.d.ivDelete);
        this.f27157b = (EditText) findViewById(R9.d.editSearch);
        try {
            final int i7 = 0;
            findViewById(R9.d.back_bt).setOnClickListener(new View.OnClickListener(this) { // from class: V9.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AllContactsSearchActivity f10203b;

                {
                    this.f10203b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AllContactsSearchActivity allContactsSearchActivity = this.f10203b;
                    switch (i7) {
                        case 0:
                            int i10 = AllContactsSearchActivity.f27155g;
                            int id2 = view.getId();
                            if (id2 == R9.d.back_bt) {
                                allContactsSearchActivity.supportFinishAfterTransition();
                            } else if (id2 == R9.d.ivDelete) {
                                allContactsSearchActivity.f27157b.getText().clear();
                            }
                            break;
                        default:
                            int i11 = AllContactsSearchActivity.f27155g;
                            int id3 = view.getId();
                            if (id3 == R9.d.back_bt) {
                                allContactsSearchActivity.supportFinishAfterTransition();
                            } else if (id3 == R9.d.ivDelete) {
                                allContactsSearchActivity.f27157b.getText().clear();
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.f27158c.setOnClickListener(new View.OnClickListener(this) { // from class: V9.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AllContactsSearchActivity f10203b;

                {
                    this.f10203b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AllContactsSearchActivity allContactsSearchActivity = this.f10203b;
                    switch (i10) {
                        case 0:
                            int i11 = AllContactsSearchActivity.f27155g;
                            int id2 = view.getId();
                            if (id2 == R9.d.back_bt) {
                                allContactsSearchActivity.supportFinishAfterTransition();
                            } else if (id2 == R9.d.ivDelete) {
                                allContactsSearchActivity.f27157b.getText().clear();
                            }
                            break;
                        default:
                            int i12 = AllContactsSearchActivity.f27155g;
                            int id3 = view.getId();
                            if (id3 == R9.d.back_bt) {
                                allContactsSearchActivity.supportFinishAfterTransition();
                            } else if (id3 == R9.d.ivDelete) {
                                allContactsSearchActivity.f27157b.getText().clear();
                            }
                            break;
                    }
                }
            });
        } catch (Exception unused) {
        }
    }
}
