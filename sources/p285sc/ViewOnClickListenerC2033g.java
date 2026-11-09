package p285sc;

import Oe.a;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Wb.b;
import Wb.c;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p236pc.d;
import p236pc.f;
import p383zc.m;

/* JADX INFO: renamed from: sc.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC2033g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReferEarnHomePageActivity f42217b;

    public /* synthetic */ ViewOnClickListenerC2033g(ReferEarnHomePageActivity referEarnHomePageActivity, int i7) {
        this.f42216a = i7;
        this.f42217b = referEarnHomePageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ReferEarnHomePageActivity activity = this.f42217b;
        switch (this.f42216a) {
            case 0:
                int i7 = ReferEarnHomePageActivity.f31872z0;
                if (!r0.U0()) {
                    int id2 = view.getId();
                    if (id2 != d.jp_cash_invite_btn) {
                        if (id2 != d.tvWithdraw) {
                            if (id2 != d.tvRank) {
                                if (id2 != d.tvReward) {
                                    if (id2 == d.btnCopyInvitationCode) {
                                        Object value = activity.f31875C.getValue();
                                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                                        CharSequence text = ((TextView) value).getText();
                                        String string = text != null ? text.toString() : null;
                                        String str = string != null ? string : "";
                                        if (str.length() != 0) {
                                            ClipboardUtils.copyText(str);
                                            ToastUtils.showShort(activity.getString(f.jp_copy_successful), new Object[0]);
                                            ReferEarnHomePageActivity.q(activity, null, 7);
                                            break;
                                        }
                                    }
                                } else {
                                    com.palmpay.lib.apm.launchcounter.util.d.H("/refer_earn/history", "extra_data", activity.f31894p0);
                                    break;
                                }
                            } else if (activity.f31894p0.length() != 0) {
                                com.palmpay.lib.apm.launchcounter.util.d.H("/refer_earn/rank", "extra_data", activity.f31894p0);
                                break;
                            }
                        } else {
                            n0.g().m("refer_earn_page_element_click", "Withdraw", "");
                            ((m) activity.f27350a).queryReferEarnWithDrawEnable(activity.f31894p0);
                            break;
                        }
                    } else {
                        n0.g().m("refer_earn_page_element_click", activity.m().getText().toString(), "");
                        ReferEarnHomePageActivity.q(activity, null, 7);
                        break;
                    }
                }
                break;
            case 1:
                int i10 = ReferEarnHomePageActivity.f31872z0;
                i0.b0("/re-plus/home");
                activity.finish();
                break;
            case 2:
                int i11 = ReferEarnHomePageActivity.f31872z0;
                activity.finish();
                break;
            case 3:
                if (activity.f31894p0.length() != 0) {
                    n0.g().m("refer_earn_page_element_click", "More button", "");
                    c cVar = new c(activity.getString(k.core_rules), activity.getDrawable(p236pc.c.jp_re_menu_icon_rules));
                    ArrayList menuData = new ArrayList();
                    menuData.add(cVar);
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intrinsics.checkNotNullParameter(menuData, "menuData");
                    Wb.d dVar = new Wb.d(LayoutInflater.from(activity).inflate(t.cv_oc_top_right_menu_layout, (ViewGroup) null), -2, -2);
                    dVar.setBackgroundDrawable(new ColorDrawable(0));
                    b bVar = new b(activity, menuData);
                    View viewFindViewById = dVar.getContentView().findViewById(s.top_menu_rv);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                    RecyclerView recyclerView = (RecyclerView) viewFindViewById;
                    recyclerView.setLayoutManager(new LinearLayoutManager(activity, 1, false));
                    recyclerView.setAdapter(bVar);
                    a clickListener = new a(dVar, 10);
                    Intrinsics.checkNotNullParameter(clickListener, "clickListener");
                    bVar.f10666c = clickListener;
                    dVar.setOutsideTouchable(true);
                    dVar.setTouchable(true);
                    dVar.setFocusable(true);
                    Sd.b menuClickListener = new Sd.b(menuData, 26);
                    Intrinsics.checkNotNullParameter(menuClickListener, "menuClickListener");
                    dVar.f10669a = menuClickListener;
                    Object value2 = activity.f31873A.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    ImageView view2 = ((PpTitleBar) value2).getRightImageView2();
                    Intrinsics.checkNotNullExpressionValue(view2, "getRightImageView2(...)");
                    Intrinsics.checkNotNullParameter(view2, "view");
                    dVar.showAsDropDown(view2, 0, -CommonViewExtKt.getDp(10), 5);
                    break;
                }
                break;
            default:
                int i12 = ReferEarnHomePageActivity.f31872z0;
                n0.g().m("refer_earn_page_element_click", "back", "");
                activity.onBackPressed();
                break;
        }
    }
}
