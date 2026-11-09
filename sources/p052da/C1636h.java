package p052da;

import Kb.c;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.viewmodel.ModelBankInfoItem;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: da.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1636h extends c implements SectionIndexer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f35772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35774g;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        List list = this.f4985b;
        return (list == null || list.isEmpty() || i7 == this.f4985b.size()) ? 18 : 17;
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i7) {
        return ((Integer) this.f35772e.get(i7)).intValue();
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i7) {
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        ArrayList arrayList = new ArrayList(26);
        this.f35772e = new ArrayList(26);
        for (int i7 = 0; i7 < getItemCount(); i7++) {
            BankInfo bankInfo = (BankInfo) getItem(i7);
            if (bankInfo != null && !TextUtils.isEmpty(bankInfo.bankName)) {
                String upperCase = TextUtils.isEmpty(bankInfo.indexType) ? String.valueOf(bankInfo.bankName.charAt(0)).toUpperCase() : String.valueOf(bankInfo.indexType.charAt(0)).toUpperCase();
                if (!arrayList.contains(upperCase)) {
                    arrayList.add(upperCase);
                    this.f35772e.add(Integer.valueOf(i7));
                }
            }
        }
        return arrayList.toArray(new String[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (viewHolder instanceof C1635g) {
            C1635g c1635g = (C1635g) viewHolder;
            List list = this.f4985b;
            if (list != null && i7 < list.size()) {
                c1635g.f35771d.setBankCardInfo((BankInfo) this.f4985b.get(i7));
            }
            if (this.f35774g) {
                ModelBankInfoItem modelBankInfoItem = c1635g.f35771d;
                ImageView imageView = modelBankInfoItem.f28269f;
                TextView textView = modelBankInfoItem.f28267d;
                if (this.f35773f == i7) {
                    imageView.setVisibility(0);
                    imageView.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), SizeUtils.dp2px(16.0f), imageView.getPaddingBottom());
                    textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), 0, textView.getPaddingBottom());
                } else {
                    imageView.setVisibility(8);
                    imageView.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), 0, imageView.getPaddingBottom());
                    textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), SizeUtils.dp2px(16.0f), textView.getPaddingBottom());
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        ModelBankInfoItem modelBankInfoItem = new ModelBankInfoItem(viewGroup.getContext());
        C1635g c1635g = new C1635g(this, modelBankInfoItem);
        c1635g.f35771d = modelBankInfoItem;
        c1635g.a(modelBankInfoItem.f28268e);
        return c1635g;
    }
}
