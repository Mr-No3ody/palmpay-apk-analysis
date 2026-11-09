package p294tb;

import Bc.q;
import Ya.g;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;
import com.transsnet.palmpay.custom_view.CircleProgressView;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLOpenResultActivity f42397b;

    public /* synthetic */ B(CLOpenResultActivity cLOpenResultActivity, int i7) {
        this.f42396a = i7;
        this.f42397b = cLOpenResultActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CLOpenResultActivity cLOpenResultActivity = this.f42397b;
        switch (this.f42396a) {
            case 0:
                CLOpenAccountData cLOpenAccountData = cLOpenResultActivity.f28967H0;
                if (cLOpenAccountData != null) {
                    cLOpenAccountData.setApplyId("");
                }
                cLOpenResultActivity.r();
                break;
            case 1:
                q qVar = cLOpenResultActivity.f28986f;
                if (qVar != null) {
                    qVar.f822j.setText(new SpanUtils().append(String.valueOf(cLOpenResultActivity.f28981S0)).append("S").setFontSize(24, true).create());
                }
                q qVar2 = cLOpenResultActivity.f28986f;
                if (qVar2 != null) {
                    ((CircleProgressView) qVar2.f823o).b(cLOpenResultActivity.f28981S0, 10);
                }
                int i7 = cLOpenResultActivity.f28981S0;
                if (i7 != 0 && i7 != 1) {
                    switch (i7) {
                        case 7:
                            q qVar3 = cLOpenResultActivity.f28986f;
                            if (qVar3 != null) {
                                ((TextView) qVar3.f815b).setText(g.cs_oc_finalising_your_loan_amount_caculation);
                            }
                            break;
                        case 8:
                            q qVar4 = cLOpenResultActivity.f28986f;
                            if (qVar4 != null) {
                                ((TextView) qVar4.f815b).setText(g.cs_oc_building_your_credit_profile);
                            }
                            break;
                        case 9:
                            q qVar5 = cLOpenResultActivity.f28986f;
                            if (qVar5 != null) {
                                ((TextView) qVar5.f815b).setText(g.cs_oc_gathering_your_credit_history_data);
                            }
                            break;
                        case 10:
                            q qVar6 = cLOpenResultActivity.f28986f;
                            if (qVar6 != null) {
                                ((ImageView) qVar6.f817d).setVisibility(0);
                            }
                            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation.setDuration(1000L);
                            rotateAnimation.setRepeatCount(-1);
                            rotateAnimation.setInterpolator(new LinearInterpolator());
                            q qVar7 = cLOpenResultActivity.f28986f;
                            if (qVar7 != null) {
                                ((ImageView) qVar7.f817d).startAnimation(rotateAnimation);
                            }
                            break;
                    }
                } else {
                    q qVar8 = cLOpenResultActivity.f28986f;
                    if (qVar8 != null) {
                        qVar8.f816c.setText(cLOpenResultActivity.getString(g.cs_oc_unstable_network));
                    }
                }
                int i10 = cLOpenResultActivity.f28981S0 - 1;
                cLOpenResultActivity.f28981S0 = i10;
                if (i10 >= 0) {
                    cLOpenResultActivity.T0.postDelayed((Runnable) cLOpenResultActivity.f28982U0.getValue(), 1000L);
                } else {
                    q qVar9 = cLOpenResultActivity.f28986f;
                    if (qVar9 != null) {
                        qVar9.f822j.setText((CharSequence) null);
                    }
                }
                break;
            case 2:
                int i11 = CLOpenResultActivity.f28955V0;
                cLOpenResultActivity.r();
                break;
            default:
                q qVar10 = cLOpenResultActivity.f28986f;
                if (qVar10 != null) {
                    ViewPager2 viewPager2 = (ViewPager2) qVar10.f820g;
                    ArrayList arrayList = cLOpenResultActivity.f28988i;
                    if (arrayList.size() > 1) {
                        viewPager2.setCurrentItem((viewPager2.getCurrentItem() + 1) % arrayList.size(), true);
                        cLOpenResultActivity.w();
                        break;
                    }
                }
                break;
        }
    }
}
