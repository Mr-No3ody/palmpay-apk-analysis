package p142ja;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.custom_view.PinEntryView;
import p025ba.e;
import p025ba.g;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ViewBinding {

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final Barrier barrierEnd;

    @NonNull
    public final IconicsTextView llOthers;

    @NonNull
    private final View rootView;

    @NonNull
    public final PinEntryView smsCodeView;

    @NonNull
    public final TextView textViewSendSms;

    @NonNull
    public final TextView tvInputError;

    @NonNull
    public final TextView tvTime;

    @NonNull
    public final TextView tvTimeTips;

    @NonNull
    public final TextView tvTitle;

    private f(@NonNull View rootView, @NonNull Barrier barrier, @NonNull Barrier barrierEnd, @NonNull IconicsTextView llOthers, @NonNull PinEntryView smsCodeView, @NonNull TextView textViewSendSms, @NonNull TextView tvInputError, @NonNull TextView tvTime, @NonNull TextView tvTimeTips, @NonNull TextView tvTitle) {
        this.rootView = rootView;
        this.barrier = barrier;
        this.barrierEnd = barrierEnd;
        this.llOthers = llOthers;
        this.smsCodeView = smsCodeView;
        this.textViewSendSms = textViewSendSms;
        this.tvInputError = tvInputError;
        this.tvTime = tvTime;
        this.tvTimeTips = tvTimeTips;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static f bind(@NonNull View rootView) {
        int i7 = e.barrier;
        Barrier barrier = (Barrier) a.m(i7, rootView);
        if (barrier != null) {
            i7 = e.barrierEnd;
            Barrier barrier2 = (Barrier) a.m(i7, rootView);
            if (barrier2 != null) {
                i7 = e.llOthers;
                IconicsTextView iconicsTextView = (IconicsTextView) a.m(i7, rootView);
                if (iconicsTextView != null) {
                    i7 = e.smsCodeView;
                    PinEntryView pinEntryView = (PinEntryView) a.m(i7, rootView);
                    if (pinEntryView != null) {
                        i7 = e.textViewSendSms;
                        TextView textView = (TextView) a.m(i7, rootView);
                        if (textView != null) {
                            i7 = e.tvInputError;
                            TextView textView2 = (TextView) a.m(i7, rootView);
                            if (textView2 != null) {
                                i7 = e.tvTime;
                                TextView textView3 = (TextView) a.m(i7, rootView);
                                if (textView3 != null) {
                                    i7 = e.tvTimeTips;
                                    TextView textView4 = (TextView) a.m(i7, rootView);
                                    if (textView4 != null) {
                                        i7 = e.tvTitle;
                                        TextView textView5 = (TextView) a.m(i7, rootView);
                                        if (textView5 != null) {
                                            return new f(rootView, barrier, barrier2, iconicsTextView, pinEntryView, textView, textView2, textView3, textView4, textView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i7)));
    }

    @NonNull
    public static f inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException("parent");
        }
        inflater.inflate(g.core_layout_one_time_code_v5_view, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
