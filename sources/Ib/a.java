package Ib;

import Pa.F;
import android.view.View;
import com.transsnet.palmpay.ui.activity.coupon.CouponPackageResultActivity;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4302c;

    public /* synthetic */ a(View view, String str, int i7) {
        this.f4300a = i7;
        this.f4301b = view;
        this.f4302c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = this.f4302c;
        View view2 = this.f4301b;
        switch (this.f4300a) {
            case 0:
                ActivityUtils.startActivity(F.a(view2.getContext(), str));
                break;
            default:
                int i7 = CouponPackageResultActivity.f34663o;
                ActivityUtils.startActivity(F.a(view2.getContext(), str));
                break;
        }
    }
}
