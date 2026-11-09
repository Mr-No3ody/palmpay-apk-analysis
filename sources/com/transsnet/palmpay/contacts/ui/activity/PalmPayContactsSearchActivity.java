package com.transsnet.palmpay.contacts.ui.activity;

import L6.b;
import Pa.AbstractC0512i;
import R9.d;
import V9.E;
import W9.D;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayContactsSearchActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.ArrayList;
import p001if.a;
import p1.c;
import p161kf.e;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
public class PalmPayContactsSearchActivity extends BaseActivity implements TextWatcher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f27238g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SwipeRecyclerView f27239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f27240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f27241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D f27242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f27243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f27244f = new ArrayList();

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        supportRequestWindowFeature(12);
        return R9.e.ct_palmpay_contacts_search_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f27242d = new D(this);
        this.f27239a.getRecyclerView().setVerticalScrollBarEnabled(false);
        this.f27239a.getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        C1548f c1548f = new C1548f(getColor(b.ppColorDividerLine), 1, 30, 30);
        c1548f.f31336e = false;
        this.f27239a.setRefreshEnable(false);
        this.f27239a.setLoadMoreEnable(false);
        this.f27239a.getRecyclerView().addItemDecoration(c1548f);
        this.f27239a.setAdapter(this.f27242d);
        this.f27240b.setFocusable(true);
        this.f27240b.setFocusableInTouchMode(true);
        this.f27240b.requestFocus();
        this.f27240b.addTextChangedListener(this);
        this.f27242d.f4986c = new E(this);
    }

    public final void l(View view) {
        int id2 = view.getId();
        if (id2 == d.back_bt) {
            supportFinishAfterTransition();
        } else if (id2 == d.add_bt) {
            startActivity(new Intent(this, (Class<?>) AddContactActivity.class));
        } else if (id2 == d.ivDelete) {
            this.f27240b.getText().clear();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        e eVar = this.f27243e;
        if (eVar != null && !eVar.isDisposed()) {
            e eVar2 = this.f27243e;
            eVar2.getClass();
            a.a(eVar2);
        }
        if (TextUtils.isEmpty(this.f27240b.getText().toString())) {
            this.f27241c.setVisibility(8);
            this.f27242d.b();
            return;
        }
        this.f27241c.setVisibility(0);
        C1765q c1765qI = new C1755g(new p1.d(this, 17, this.f27240b.getText().toString(), false), 0).k(f.f42629b).i(p071ef.b.a());
        e eVar3 = new e(new c(this, 10), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar3);
        this.f27243e = eVar3;
        addSubscription(eVar3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        this.f27244f = AbstractC0512i.f7093a;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Z4.e.I(this);
        this.f27239a = (SwipeRecyclerView) findViewById(d.contact_rv);
        this.f27240b = (EditText) findViewById(d.editSearch);
        this.f27241c = findViewById(d.ivDelete);
        try {
            final int i7 = 0;
            findViewById(d.back_bt).setOnClickListener(new View.OnClickListener(this) { // from class: V9.D

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PalmPayContactsSearchActivity f10180b;

                {
                    this.f10180b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PalmPayContactsSearchActivity palmPayContactsSearchActivity = this.f10180b;
                    switch (i7) {
                        case 0:
                            int i10 = PalmPayContactsSearchActivity.f27238g;
                            palmPayContactsSearchActivity.l(view);
                            break;
                        case 1:
                            int i11 = PalmPayContactsSearchActivity.f27238g;
                            palmPayContactsSearchActivity.l(view);
                            break;
                        default:
                            int i12 = PalmPayContactsSearchActivity.f27238g;
                            palmPayContactsSearchActivity.l(view);
                            break;
                    }
                }
            });
            final int i10 = 1;
            findViewById(d.add_bt).setOnClickListener(new View.OnClickListener(this) { // from class: V9.D

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PalmPayContactsSearchActivity f10180b;

                {
                    this.f10180b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PalmPayContactsSearchActivity palmPayContactsSearchActivity = this.f10180b;
                    switch (i10) {
                        case 0:
                            int i11 = PalmPayContactsSearchActivity.f27238g;
                            palmPayContactsSearchActivity.l(view);
                            break;
                        case 1:
                            int i12 = PalmPayContactsSearchActivity.f27238g;
                            palmPayContactsSearchActivity.l(view);
                            break;
                        default:
                            int i13 = PalmPayContactsSearchActivity.f27238g;
                            palmPayContactsSearchActivity.l(view);
                            break;
                    }
                }
            });
            final int i11 = 2;
            this.f27241c.setOnClickListener(new View.OnClickListener(this) { // from class: V9.D

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PalmPayContactsSearchActivity f10180b;

                {
                    this.f10180b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PalmPayContactsSearchActivity palmPayContactsSearchActivity = this.f10180b;
                    switch (i11) {
                        case 0:
                            int i12 = PalmPayContactsSearchActivity.f27238g;
                            palmPayContactsSearchActivity.l(view);
                            break;
                        case 1:
                            int i13 = PalmPayContactsSearchActivity.f27238g;
                            palmPayContactsSearchActivity.l(view);
                            break;
                        default:
                            int i14 = PalmPayContactsSearchActivity.f27238g;
                            palmPayContactsSearchActivity.l(view);
                            break;
                    }
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
