package p368yb;

import Gd.e;
import Kb.h;
import Ya.f;
import Ya.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.SpreadInfoDto;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckedTextView f44159e;

    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_ins_count_item, parent, false);
        Intrinsics.e(viewInflate);
        return new C(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C c6 = (C) holder;
        SpreadInfoDto spreadInfoDto = (SpreadInfoDto) this.f4992b.get(i7);
        c6.f44157a.setText(this.f4991a.getString(g.cs_oc_ins_pay_in, spreadInfoDto.getId()));
        int i10 = this.f44158d;
        CheckedTextView checkedTextView = c6.f44157a;
        if (i10 == i7) {
            checkedTextView.setChecked(true);
            this.f44159e = checkedTextView;
        } else {
            checkedTextView.setChecked(false);
        }
        p220oa.h.l(new e(this, i7, holder, 6), checkedTextView);
    }

    @Override // Kb.h, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4992b.size();
    }
}
