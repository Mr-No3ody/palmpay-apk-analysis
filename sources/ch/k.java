package ch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import p227p.c$a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f19064o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19065g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c$a f19067j;

    @Override // eh.a
    public final void e() {
        this.f19065g = getIntent().getIntExtra("VERIFY_TYPE", 1);
        this.f19066i = getIntent().getIntExtra("BUSINESS_TYPE", 0);
    }

    @Override // ch.e
    public final View k() {
        int i7 = this.f19065g;
        if (i7 != 1) {
            if (i7 == 2) {
                h hVar = new h(this);
                View viewInflate = LayoutInflater.from(this).inflate(p349x8.b.mtn_verification_otp_layout, (ViewGroup) null);
                viewInflate.setTag(hVar);
                hVar.f19052a = (TextView) viewInflate.findViewById(p349x8.a.mtn_info);
                hVar.f19053b = (InputView) viewInflate.findViewById(p349x8.a.mtn_input_view);
                hVar.f19054c = (MTNButton) viewInflate.findViewById(p349x8.a.mtn_confirm_btn);
                hVar.f19055d = (TextView) viewInflate.findViewById(p349x8.a.mtn_resend);
                hVar.f19053b.setOnInputChangeListener(new f(hVar, 0));
                hVar.f19054c.setOnFDSClickListener(new f(hVar, 1));
                MTNButton mTNButton = hVar.f19054c;
                j();
                mTNButton.setEnableColor("#FFC90A");
                hVar.f19055d.setOnClickListener(new Yd.i(hVar, 15));
                return viewInflate;
            }
            if (i7 != 3) {
                return null;
            }
        }
        j jVar = new j(this);
        View viewInflate2 = LayoutInflater.from(this).inflate(p349x8.b.mtn_verification_pin_layout, (ViewGroup) null);
        viewInflate2.setTag(jVar);
        jVar.f19060a = (TextView) viewInflate2.findViewById(p349x8.a.mtn_error_msg);
        jVar.f19061b = (InputView) viewInflate2.findViewById(p349x8.a.mtn_input_view);
        jVar.f19062c = (MTNButton) viewInflate2.findViewById(p349x8.a.mtn_submit_btn);
        jVar.f19061b.setOnInputChangeListener(new i(jVar, 0));
        jVar.f19062c.setOnFDSClickListener(new i(jVar, 1));
        MTNButton mTNButton2 = jVar.f19062c;
        j();
        mTNButton2.setEnableColor("#FFC90A");
        return viewInflate2;
    }

    @Override // ch.e
    public final void l() {
        View childAt = this.f19046d.getChildCount() > 0 ? this.f19046d.getChildAt(0) : null;
        if (childAt == null) {
            return;
        }
        c$a c_a = (c$a) childAt.getTag();
        this.f19067j = c_a;
        c_a.c();
        n();
    }

    public abstract void m(String str);

    public abstract void n();
}
