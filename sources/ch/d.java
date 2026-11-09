package ch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.impl.L;
import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import p227p.a$b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19042g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a$b f19043i;

    @Override // ch.e
    public final View k() {
        int i7 = this.f19042g;
        if (i7 == 1) {
            c cVar = new c();
            View viewInflate = LayoutInflater.from(this).inflate(p349x8.b.mtn_two_elements_login_layout, (ViewGroup) null);
            viewInflate.setTag(cVar);
            cVar.f19038a = (InputView) viewInflate.findViewById(p349x8.a.mtn_account_input);
            cVar.f19039b = (InputView) viewInflate.findViewById(p349x8.a.mtn_password_input);
            cVar.f19040c = (TextView) viewInflate.findViewById(p349x8.a.mtn_error_msg);
            cVar.f19041d = (MTNButton) viewInflate.findViewById(p349x8.a.mtn_login_btn);
            int i10 = 14;
            cVar.f19038a.setOnInputChangeListener(new L(cVar, i10));
            cVar.f19039b.setOnInputChangeListener(new L(cVar, i10));
            cVar.f19041d.setOnFDSClickListener(new L(this, 12));
            MTNButton mTNButton = cVar.f19041d;
            j();
            mTNButton.setEnableColor("#FFC90A");
            return viewInflate;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                return null;
            }
            a aVar = new a();
            View viewInflate2 = LayoutInflater.from(this).inflate(p349x8.b.mtn_one_element_login_layout, (ViewGroup) null);
            viewInflate2.setTag(aVar);
            aVar.f19029a = (TextView) viewInflate2.findViewById(p349x8.a.mtn_tips);
            aVar.f19030b = (InputView) viewInflate2.findViewById(p349x8.a.mtn_account_input);
            aVar.f19031c = (TextView) viewInflate2.findViewById(p349x8.a.mtn_error_msg);
            aVar.f19032d = (MTNButton) viewInflate2.findViewById(p349x8.a.mtn_login_btn);
            aVar.f19030b.setOnInputChangeListener(new L(aVar, 11));
            aVar.f19032d.setOnFDSClickListener(new L(this, 12));
            MTNButton mTNButton2 = aVar.f19032d;
            j();
            mTNButton2.setEnableColor("#FFC90A");
            return viewInflate2;
        }
        b bVar = new b();
        View viewInflate3 = LayoutInflater.from(this).inflate(p349x8.b.mtn_three_elements_login_layout, (ViewGroup) null);
        viewInflate3.setTag(bVar);
        bVar.f19033a = (InputView) viewInflate3.findViewById(p349x8.a.mtn_first_input);
        bVar.f19034b = (InputView) viewInflate3.findViewById(p349x8.a.mtn_second_input);
        bVar.f19035c = (InputView) viewInflate3.findViewById(p349x8.a.mtn_third_input);
        bVar.f19036d = (TextView) viewInflate3.findViewById(p349x8.a.mtn_error_msg);
        bVar.f19037e = (MTNButton) viewInflate3.findViewById(p349x8.a.mtn_login_btn);
        int i11 = 13;
        bVar.f19033a.setOnInputChangeListener(new L(bVar, i11));
        bVar.f19034b.setOnInputChangeListener(new L(bVar, i11));
        bVar.f19035c.setOnInputChangeListener(new L(bVar, i11));
        bVar.f19037e.setOnFDSClickListener(new L(this, 12));
        MTNButton mTNButton3 = bVar.f19037e;
        j();
        mTNButton3.setEnableColor("#FFC90A");
        return viewInflate3;
    }

    @Override // ch.e
    public final void l() {
        View childAt = this.f19046d.getChildCount() > 0 ? this.f19046d.getChildAt(0) : null;
        if (childAt == null) {
            return;
        }
        this.f19043i = (a$b) childAt.getTag();
        this.f19047e.setVisibility(0);
        m();
    }

    public abstract void m();
}
