package p351xb;

import Ya.d;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import p368yb.C2147o;
import p368yb.E;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.ViewHolder f43788b;

    public /* synthetic */ m(RecyclerView.ViewHolder viewHolder, int i7) {
        this.f43787a = i7;
        this.f43788b = viewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43787a) {
            case 0:
                n nVar = (n) this.f43788b;
                int visibility = nVar.f43800v.getVisibility();
                Group group = nVar.f43800v;
                TextView textView = nVar.f43797j;
                if (visibility != 0) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_installment_up_icon, 0);
                    group.setVisibility(0);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_installment_down_icon, 0);
                    group.setVisibility(8);
                }
                break;
            case 1:
                C2147o c2147o = (C2147o) this.f43788b;
                int visibility2 = c2147o.f44252v.getVisibility();
                Group group2 = c2147o.f44252v;
                TextView textView2 = c2147o.f44250o;
                if (visibility2 != 0) {
                    textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_installment_up_icon, 0);
                    group2.setVisibility(0);
                } else {
                    textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_installment_down_icon, 0);
                    group2.setVisibility(8);
                }
                break;
            default:
                E e10 = (E) this.f43788b;
                int visibility3 = e10.f44171v.getVisibility();
                Group group3 = e10.f44171v;
                TextView textView3 = e10.f44169o;
                if (visibility3 != 0) {
                    textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_installment_up_icon, 0);
                    group3.setVisibility(0);
                } else {
                    textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_installment_down_icon, 0);
                    group3.setVisibility(8);
                }
                break;
        }
    }
}
