package com.transsnet.mtn.sdk.ui.bank._common;

import A8.g;
import A8.h;
import Pa.C0525w;
import Sd.b;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import eh.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class TermsAndPrivacyActivity extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f25695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CheckBox f25696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f25697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MTNButton f25698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f25699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0525w f25700g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f25701i;

    @Override // eh.a
    public final void f() {
        this.f25695b = findViewById(p349x8.a.mtn_chk_wrapper);
        this.f25696c = (CheckBox) findViewById(p349x8.a.mtn_chk);
        this.f25697d = (TextView) findViewById(p349x8.a.mtn_ok_data_t_c);
        this.f25698e = (MTNButton) findViewById(p349x8.a.mtn_handle_btn);
        this.f25699f = (TextView) findViewById(p349x8.a.mtn_cancel_btn);
    }

    @Override // eh.a
    public final int g() {
        return p349x8.b.mtn_terms_privacy_activity_layout;
    }

    @Override // eh.a
    public final void h() {
    }

    @Override // eh.a
    public final void i() {
        final h hVar = new h(this);
        int i7 = 1;
        this.f25700g = new C0525w(this, i7);
        this.f25701i = new b(this, i7);
        final int i10 = 0;
        this.f25695b.setOnClickListener(new View.OnClickListener() { // from class: A8.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        CheckBox checkBox = hVar.f94a.f25696c;
                        checkBox.setChecked(!checkBox.isChecked());
                        break;
                    default:
                        hVar.f94a.finish();
                        break;
                }
            }
        });
        this.f25696c.setOnCheckedChangeListener(new g(hVar, i10));
        TextView textView = this.f25697d;
        C0525w c0525w = this.f25700g;
        Objects.requireNonNull(c0525w);
        int i11 = 1;
        textView.setOnClickListener(new A8.b(c0525w, i11));
        MTNButton mTNButton = this.f25698e;
        b bVar = this.f25701i;
        Objects.requireNonNull(bVar);
        mTNButton.setOnFDSClickListener(new A8.a(bVar, i11));
        final int i12 = 1;
        this.f25699f.setOnClickListener(new View.OnClickListener() { // from class: A8.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        CheckBox checkBox = hVar.f94a.f25696c;
                        checkBox.setChecked(!checkBox.isChecked());
                        break;
                    default:
                        hVar.f94a.finish();
                        break;
                }
            }
        });
    }
}
