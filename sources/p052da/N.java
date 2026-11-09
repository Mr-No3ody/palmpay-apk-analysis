package p052da;

import L6.b;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.viewmodel.PayMethodItem;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayMethodItem f35713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f35714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f35715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f35716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f35717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f35718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f35719g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f35720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PaymentMethod f35721j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BaseRecyclerViewAdapter$ItemViewOnClickListener f35722o;

    public N(View view) {
        super(view);
        this.f35720i = view.getContext();
        PayMethodItem payMethodItem = (PayMethodItem) view;
        this.f35713a = payMethodItem;
        payMethodItem.f28533i.setOnClickListener(this);
        int iDp2px = SizeUtils.dp2px(20.0f);
        payMethodItem.f28534j.setVisibility(0);
        payMethodItem.f28534j.getLayoutParams().width = iDp2px;
        payMethodItem.f28534j.getLayoutParams().height = iDp2px;
        payMethodItem.f28534j.setImageResource(r.cv_check_purple);
        this.f35714b = payMethodItem.f28528c;
        this.f35717e = payMethodItem.f28531f;
        this.f35718f = payMethodItem.f28527A;
        this.f35715c = payMethodItem.f28529d;
        this.f35716d = payMethodItem.f28530e;
        this.f35719g = payMethodItem.f28533i;
        payMethodItem.f28535o.setVisibility(8);
    }

    public final void a(PaymentMethod paymentMethod, boolean z3) {
        this.f35713a.setEnabled(z3);
        View view = this.f35719g;
        if (view != null) {
            view.setEnabled(z3);
        }
        TextView textView = this.f35716d;
        TextView textView2 = this.f35715c;
        ImageView imageView = this.f35714b;
        TextView textView3 = this.f35717e;
        if (!z3) {
            textView3.setVisibility(8);
            imageView.setAlpha(0.6f);
            textView2.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            return;
        }
        if (paymentMethod == null || TextUtils.isEmpty(paymentMethod.acTips)) {
            textView3.setVisibility(8);
        } else {
            String str = paymentMethod.acTips;
            if (textView3 != null) {
                if (TextUtils.isEmpty(str)) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setTextColor(-1);
                    textView3.setBackgroundResource(r.cv_button_bg_yellow_corner_2);
                    textView3.setText(str);
                    textView3.setVisibility(0);
                }
            }
        }
        imageView.setAlpha(1.0f);
        textView2.setAlpha(1.0f);
        textView.setAlpha(1.0f);
    }

    public final void b(String str) {
        TextView textView = this.f35717e;
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setTextColor(this.f35720i.getColor(b.ppColorTextPrimary));
        textView.setBackground(null);
        textView.setText(str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseRecyclerViewAdapter$ItemViewOnClickListener baseRecyclerViewAdapter$ItemViewOnClickListener = this.f35722o;
        if (baseRecyclerViewAdapter$ItemViewOnClickListener != null) {
            baseRecyclerViewAdapter$ItemViewOnClickListener.OnItemViewOnClick(view, this.f35721j, this);
        }
    }
}
