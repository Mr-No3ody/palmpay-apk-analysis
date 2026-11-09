package p368yb;

import Kb.h;
import Ya.f;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.other.OcContactSocialLabelBean;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMediaActivity;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2150s extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f44260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44261g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2150s(OcMediaActivity context, ArrayList data, String str) {
        super(context, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f44258d = str;
        this.f44259e = true;
        this.f44260f = new HashMap();
        this.f44261g = -1;
        int size = this.f4992b.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Intrinsics.c(((OcContactSocialLabelBean) this.f4992b.get(i7)).getName(), this.f44258d)) {
                this.f44261g = i7;
                return;
            }
        }
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(f.cs_contact_social_label_item, parent, false);
        Intrinsics.e(viewInflate);
        return new r(viewInflate);
    }

    @Override // Kb.h
    public final void c(final RecyclerView.ViewHolder holder, final int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        r rVar = (r) holder;
        CheckedTextView checkedTextView = rVar.f44257a;
        List list = this.f4992b;
        checkedTextView.setText(((OcContactSocialLabelBean) list.get(i7)).getName());
        Drawable icon = ((OcContactSocialLabelBean) list.get(i7)).getIcon();
        CheckedTextView checkedTextView2 = rVar.f44257a;
        checkedTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, icon, (Drawable) null, (Drawable) null);
        if (this.f44259e) {
            checkedTextView2.setChecked(this.f44261g == i7);
            final int i10 = 0;
            p220oa.h.l(new View.OnClickListener() { // from class: yb.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            RecyclerView.ViewHolder viewHolder = holder;
                            r rVar2 = (r) viewHolder;
                            CheckedTextView checkedTextView3 = rVar2.f44257a;
                            checkedTextView3.setChecked(!checkedTextView3.isChecked());
                            boolean zIsChecked = rVar2.f44257a.isChecked();
                            int i11 = i7;
                            int i12 = zIsChecked ? i11 : -1;
                            C2150s c2150s = this;
                            c2150s.f44261g = i12;
                            c2150s.notifyDataSetChanged();
                            OnRvItemClickListener onRvItemClickListener = c2150s.f4993c;
                            if (onRvItemClickListener != null) {
                                View itemView = viewHolder.itemView;
                                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                                onRvItemClickListener.onItemClick(itemView, i11);
                            }
                            break;
                        default:
                            RecyclerView.ViewHolder viewHolder2 = holder;
                            r rVar3 = (r) viewHolder2;
                            CheckedTextView checkedTextView4 = rVar3.f44257a;
                            checkedTextView4.setChecked(!checkedTextView4.isChecked());
                            boolean zIsChecked2 = rVar3.f44257a.isChecked();
                            C2150s c2150s2 = this;
                            int i13 = i7;
                            if (zIsChecked2) {
                                c2150s2.f44260f.put(Integer.valueOf(i13), Integer.valueOf(i13));
                            } else {
                                c2150s2.f44260f.remove(Integer.valueOf(i13));
                            }
                            OnRvItemClickListener onRvItemClickListener2 = c2150s2.f4993c;
                            if (onRvItemClickListener2 != null) {
                                View itemView2 = viewHolder2.itemView;
                                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                                onRvItemClickListener2.onItemClick(itemView2, i13);
                            }
                            break;
                    }
                }
            }, checkedTextView2);
        } else {
            checkedTextView2.setChecked(this.f44260f.containsKey(Integer.valueOf(i7)));
            final int i11 = 1;
            p220oa.h.l(new View.OnClickListener() { // from class: yb.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            RecyclerView.ViewHolder viewHolder = holder;
                            r rVar2 = (r) viewHolder;
                            CheckedTextView checkedTextView3 = rVar2.f44257a;
                            checkedTextView3.setChecked(!checkedTextView3.isChecked());
                            boolean zIsChecked = rVar2.f44257a.isChecked();
                            int i12 = i7;
                            int i13 = zIsChecked ? i12 : -1;
                            C2150s c2150s = this;
                            c2150s.f44261g = i13;
                            c2150s.notifyDataSetChanged();
                            OnRvItemClickListener onRvItemClickListener = c2150s.f4993c;
                            if (onRvItemClickListener != null) {
                                View itemView = viewHolder.itemView;
                                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                                onRvItemClickListener.onItemClick(itemView, i12);
                            }
                            break;
                        default:
                            RecyclerView.ViewHolder viewHolder2 = holder;
                            r rVar3 = (r) viewHolder2;
                            CheckedTextView checkedTextView4 = rVar3.f44257a;
                            checkedTextView4.setChecked(!checkedTextView4.isChecked());
                            boolean zIsChecked2 = rVar3.f44257a.isChecked();
                            C2150s c2150s2 = this;
                            int i14 = i7;
                            if (zIsChecked2) {
                                c2150s2.f44260f.put(Integer.valueOf(i14), Integer.valueOf(i14));
                            } else {
                                c2150s2.f44260f.remove(Integer.valueOf(i14));
                            }
                            OnRvItemClickListener onRvItemClickListener2 = c2150s2.f4993c;
                            if (onRvItemClickListener2 != null) {
                                View itemView2 = viewHolder2.itemView;
                                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                                onRvItemClickListener2.onItemClick(itemView2, i14);
                            }
                            break;
                    }
                }
            }, checkedTextView2);
        }
    }

    @Override // Kb.h, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4992b.size();
    }
}
