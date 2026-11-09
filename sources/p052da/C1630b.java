package p052da;

import Kb.c;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.viewmodel.ModelBankInfoItem;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: da.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1630b extends c implements SectionIndexer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f35755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35757g;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        List list = this.f4985b;
        return (list == null || list.isEmpty() || i7 == this.f4985b.size()) ? 18 : 17;
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i7) {
        return ((Integer) this.f35755e.get(i7)).intValue();
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i7) {
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        BankInfo bankInfo;
        ArrayList arrayList = new ArrayList(26);
        this.f35755e = new ArrayList(26);
        for (int i7 = 0; i7 < getItemCount(); i7++) {
            if ((getItem(i7) instanceof BankInfo) && (bankInfo = (BankInfo) getItem(i7)) != null && !TextUtils.isEmpty(bankInfo.bankName)) {
                String upperCase = TextUtils.isEmpty(bankInfo.indexType) ? String.valueOf(bankInfo.bankName.charAt(0)).toUpperCase() : String.valueOf(bankInfo.indexType.charAt(0)).toUpperCase();
                if (!arrayList.contains(upperCase)) {
                    arrayList.add(upperCase);
                    this.f35755e.add(Integer.valueOf(i7));
                }
            }
        }
        return arrayList.toArray(new String[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (viewHolder instanceof C1629a) {
            C1629a c1629a = (C1629a) viewHolder;
            List list = this.f4985b;
            if (list != null && i7 < list.size()) {
                c1629a.f35745d.f(false);
                boolean z3 = this.f4985b.get(i7) instanceof BankInfo;
                ModelBankInfoItem modelBankInfoItem = c1629a.f35745d;
                if (z3) {
                    modelBankInfoItem.setBankCardInfo((BankInfo) this.f4985b.get(i7));
                } else if (this.f4985b.get(i7) instanceof PaymentMethod) {
                    PaymentMethod paymentMethod = (PaymentMethod) this.f4985b.get(i7);
                    modelBankInfoItem.setPaymehtMethod(paymentMethod);
                    if (paymentMethod.defaultPayFlag == 1) {
                        modelBankInfoItem.f(true);
                    }
                }
            }
            if (this.f35757g) {
                ModelBankInfoItem modelBankInfoItem2 = c1629a.f35745d;
                ImageView imageView = modelBankInfoItem2.f28269f;
                TextView textView = modelBankInfoItem2.f28267d;
                if (this.f35756f == i7) {
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
        C1629a c1629a = new C1629a(this, modelBankInfoItem);
        c1629a.f35745d = modelBankInfoItem;
        c1629a.a(modelBankInfoItem.f28268e);
        return c1629a;
    }
}
