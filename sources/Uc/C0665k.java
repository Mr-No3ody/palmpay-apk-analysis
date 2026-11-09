package Uc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.api.Service;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PDashLine;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Uc.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0665k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9666b;

    public /* synthetic */ C0665k(View view, int i7) {
        this.f9665a = i7;
        this.f9666b = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9665a) {
            case 0:
                return (CardView) this.f9666b.findViewById(Sc.b.p2p_pay);
            case 1:
                return (TextView) this.f9666b.findViewById(Sc.b.p2p_time);
            case 2:
                return (CardView) this.f9666b.findViewById(Sc.b.p2p_miss_symbol);
            case 3:
                return (TextView) this.f9666b.findViewById(Sc.b.p2p_booking_code_tx);
            case 4:
                return (LinearLayout) this.f9666b.findViewById(Sc.b.p2p_booking_code);
            case 5:
                return (CardView) this.f9666b.findViewById(Sc.b.p2p_change_label);
            case 6:
                return (P2PDashLine) this.f9666b.findViewById(Sc.b.p2p_line);
            case 7:
                return (TextView) this.f9666b.findViewById(Sc.b.p2p_amount);
            case 8:
                return (TextView) this.f9666b.findViewById(Sc.b.p2p_status_txt);
            case 9:
                return (CardView) this.f9666b.findViewById(Sc.b.p2p_status);
            case 10:
                return (TextView) this.f9666b.findViewById(Sc.b.p2p_agent_name);
            case 11:
                return (ImageView) this.f9666b.findViewById(Sc.b.p2p_navigation);
            case 12:
                return (ImageView) this.f9666b.findViewById(Sc.b.p2p_phone);
            case 13:
                return (TextView) this.f9666b.findViewById(Sc.b.p2p_address);
            case 14:
                return (TextView) this.f9666b.findViewById(Sc.b.p2p_distance);
            case 15:
                return (TextView) this.f9666b.findViewById(Sc.b.p2p_name);
            case 16:
                return (TextView) this.f9666b.findViewById(Sc.b.p2p_title);
            case 17:
                return (ViewGroup) this.f9666b.findViewById(Sc.b.p2p_labels);
            case 18:
                return this.f9666b.findViewById(Sc.b.p2p_divider);
            case 19:
                View view = this.f9666b;
                if (view != null) {
                    return (ImageView) view.findViewById(Pd.c.imageViewFavorite);
                }
                return null;
            case 20:
                View view2 = this.f9666b;
                if (view2 != null) {
                    return (TextView) view2.findViewById(Pd.c.textViewLine1);
                }
                return null;
            case 21:
                View view3 = this.f9666b;
                if (view3 != null) {
                    return (TextView) view3.findViewById(Pd.c.textViewLine2);
                }
                return null;
            case 22:
                View view4 = this.f9666b;
                if (view4 != null) {
                    return view4.findViewById(Pd.c.progressBar);
                }
                return null;
            case 23:
                View view5 = this.f9666b;
                if (view5 != null) {
                    return (TextView) view5.findViewById(Pd.c.qld_cashback_iv);
                }
                return null;
            case 24:
                View view6 = this.f9666b;
                if (view6 != null) {
                    return (TextView) view6.findViewById(Pd.c.tvText);
                }
                return null;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                View view7 = this.f9666b;
                if (view7 != null) {
                    return (TextView) view7.findViewById(Pd.c.qld_cashback_iv);
                }
                return null;
            case 26:
                return (TextView) this.f9666b.findViewById(p025ba.e.cib_text);
            case 27:
                return this.f9666b.findViewById(p025ba.e.cib_line_right);
            case 28:
                return this.f9666b.findViewById(p025ba.e.cib_line_left);
            default:
                return (ImageView) this.f9666b.findViewById(p025ba.e.cib_check_iv);
        }
    }
}
