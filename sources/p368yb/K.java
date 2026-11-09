package p368yb;

import Kb.h;
import Ya.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f44184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44185g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(OcContactActivity context, ArrayList data, String str) {
        super(context, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f44182d = str;
        this.f44183e = true;
        this.f44184f = new HashMap();
        this.f44185g = -1;
        int size = this.f4992b.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Intrinsics.c(this.f4992b.get(i7), this.f44182d)) {
                this.f44185g = i7;
                return;
            }
        }
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(f.cs_oc_label_item, parent, false);
        Intrinsics.e(viewInflate);
        return new J(viewInflate);
    }

    @Override // Kb.h
    public final void c(final RecyclerView.ViewHolder holder, final int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        J j6 = (J) holder;
        j6.f44181a.setText((CharSequence) this.f4992b.get(i7));
        boolean z3 = this.f44183e;
        CheckedTextView checkedTextView = j6.f44181a;
        if (z3) {
            checkedTextView.setChecked(this.f44185g == i7);
            final int i10 = 0;
            p220oa.h.l(new View.OnClickListener() { // from class: yb.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            RecyclerView.ViewHolder viewHolder = holder;
                            J j10 = (J) viewHolder;
                            CheckedTextView checkedTextView2 = j10.f44181a;
                            checkedTextView2.setChecked(!checkedTextView2.isChecked());
                            boolean zIsChecked = j10.f44181a.isChecked();
                            int i11 = i7;
                            int i12 = zIsChecked ? i11 : -1;
                            K k2 = this;
                            k2.f44185g = i12;
                            k2.notifyDataSetChanged();
                            OnRvItemClickListener onRvItemClickListener = k2.f4993c;
                            if (onRvItemClickListener != null) {
                                View itemView = viewHolder.itemView;
                                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                                onRvItemClickListener.onItemClick(itemView, i11);
                            }
                            break;
                        default:
                            RecyclerView.ViewHolder viewHolder2 = holder;
                            J j11 = (J) viewHolder2;
                            CheckedTextView checkedTextView3 = j11.f44181a;
                            checkedTextView3.setChecked(!checkedTextView3.isChecked());
                            boolean zIsChecked2 = j11.f44181a.isChecked();
                            K k8 = this;
                            int i13 = i7;
                            if (zIsChecked2) {
                                k8.f44184f.put(Integer.valueOf(i13), Integer.valueOf(i13));
                            } else {
                                k8.f44184f.remove(Integer.valueOf(i13));
                            }
                            OnRvItemClickListener onRvItemClickListener2 = k8.f4993c;
                            if (onRvItemClickListener2 != null) {
                                View itemView2 = viewHolder2.itemView;
                                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                                onRvItemClickListener2.onItemClick(itemView2, i13);
                            }
                            break;
                    }
                }
            }, checkedTextView);
        } else {
            checkedTextView.setChecked(this.f44184f.containsKey(Integer.valueOf(i7)));
            final int i11 = 1;
            p220oa.h.l(new View.OnClickListener() { // from class: yb.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            RecyclerView.ViewHolder viewHolder = holder;
                            J j10 = (J) viewHolder;
                            CheckedTextView checkedTextView2 = j10.f44181a;
                            checkedTextView2.setChecked(!checkedTextView2.isChecked());
                            boolean zIsChecked = j10.f44181a.isChecked();
                            int i12 = i7;
                            int i13 = zIsChecked ? i12 : -1;
                            K k2 = this;
                            k2.f44185g = i13;
                            k2.notifyDataSetChanged();
                            OnRvItemClickListener onRvItemClickListener = k2.f4993c;
                            if (onRvItemClickListener != null) {
                                View itemView = viewHolder.itemView;
                                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                                onRvItemClickListener.onItemClick(itemView, i12);
                            }
                            break;
                        default:
                            RecyclerView.ViewHolder viewHolder2 = holder;
                            J j11 = (J) viewHolder2;
                            CheckedTextView checkedTextView3 = j11.f44181a;
                            checkedTextView3.setChecked(!checkedTextView3.isChecked());
                            boolean zIsChecked2 = j11.f44181a.isChecked();
                            K k8 = this;
                            int i14 = i7;
                            if (zIsChecked2) {
                                k8.f44184f.put(Integer.valueOf(i14), Integer.valueOf(i14));
                            } else {
                                k8.f44184f.remove(Integer.valueOf(i14));
                            }
                            OnRvItemClickListener onRvItemClickListener2 = k8.f4993c;
                            if (onRvItemClickListener2 != null) {
                                View itemView2 = viewHolder2.itemView;
                                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                                onRvItemClickListener2.onItemClick(itemView2, i14);
                            }
                            break;
                    }
                }
            }, checkedTextView);
        }
    }

    @Override // Kb.h, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4992b.size();
    }
}
