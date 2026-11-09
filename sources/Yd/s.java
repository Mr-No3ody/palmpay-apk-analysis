package Yd;

import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.F;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends Kb.c implements SectionIndexer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f11366g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f11367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BillerListItemBean f11368j;

    public s(Context context) {
        super(context);
        this.f11366g = new ArrayList();
        this.f11367i = new String[0];
    }

    public final void c(String str, boolean z3) {
        ArrayList arrayList = new ArrayList();
        if (z3) {
            int itemCount = getItemCount();
            for (int i7 = 0; i7 < itemCount; i7++) {
                PaymentItemBean paymentItemBean = (PaymentItemBean) this.f4985b.get(i7);
                if (paymentItemBean != null) {
                    if (Intrinsics.c(paymentItemBean.paymentItemId, str)) {
                        paymentItemBean.myFavorite = !paymentItemBean.myFavorite;
                    }
                    if (this.f11365f && paymentItemBean.myFavorite) {
                        arrayList.add(paymentItemBean);
                    }
                }
            }
        }
        if (this.f11365f && arrayList.size() != getItemCount()) {
            this.f4985b.clear();
            this.f4985b.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f4985b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i7) {
        Integer num = (Integer) CollectionsKt.G(i7, this.f11366g);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i7) {
        String str;
        Character chX;
        String string;
        PaymentItemBean paymentItemBean = (PaymentItemBean) getItem(i7);
        if (paymentItemBean == null || (str = paymentItemBean.paymentItemName) == null || (chX = F.x(str)) == null || (string = chX.toString()) == null) {
            return -1;
        }
        String upperCase = string.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase != null) {
            return C1847n.t(this.f11367i, upperCase);
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        PaymentItemBean paymentItemBean;
        ArrayList arrayList = new ArrayList(26);
        ArrayList arrayList2 = this.f11366g;
        arrayList2.clear();
        if (this.f11364e) {
            String[] strArr = new String[0];
            this.f11367i = strArr;
            return strArr;
        }
        int itemCount = getItemCount();
        for (int i7 = 0; i7 < itemCount; i7++) {
            if (getItem(i7) != null && (paymentItemBean = (PaymentItemBean) getItem(i7)) != null && !TextUtils.isEmpty(paymentItemBean.paymentItemName)) {
                String upperCase = String.valueOf(paymentItemBean.paymentItemName.charAt(0)).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (!arrayList.contains(upperCase)) {
                    arrayList.add(upperCase);
                    arrayList2.add(Integer.valueOf(i7));
                }
            }
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
        this.f11367i = strArr2;
        return strArr2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f4985b.get(i7);
        Intrinsics.e(obj);
        PaymentItemBean item = (PaymentItemBean) obj;
        if (!this.f11364e) {
            q qVar = (q) holder;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            TextView textView = (TextView) qVar.f11355d.getValue();
            if (textView != null) {
                textView.setText(item.paymentItemName);
            }
            boolean zIsEmpty = TextUtils.isEmpty(item.remark);
            ?? r10 = qVar.f11356e;
            if (zIsEmpty) {
                TextView textView2 = (TextView) r10.getValue();
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    return;
                }
                return;
            }
            TextView textView3 = (TextView) r10.getValue();
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = (TextView) r10.getValue();
            if (textView4 != null) {
                textView4.setText(item.remark);
                return;
            }
            return;
        }
        r rVar = (r) holder;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView5 = (TextView) rVar.f11358e.getValue();
        if (textView5 != null) {
            textView5.setText(item.paymentItemName);
        }
        TextView textView6 = (TextView) rVar.f11359f.getValue();
        if (textView6 != null) {
            long j6 = item.amount;
            textView6.setText(j6 > 0 ? r0.B(j6, false) : rVar.f11363o.f4984a.getString(Pd.f.qt_fill_amount));
        }
        ?? r3 = rVar.f11357d;
        ImageView imageView = (ImageView) r3.getValue();
        if (imageView != null) {
            imageView.setTag(item);
        }
        ImageView imageView2 = (ImageView) r3.getValue();
        if (imageView2 != null) {
            imageView2.setSelected(item.myFavorite);
        }
        ImageView imageView3 = (ImageView) r3.getValue();
        if (imageView3 != null) {
            imageView3.setOnClickListener(rVar);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(item.remark);
        ?? r11 = rVar.f11361i;
        if (zIsEmpty2) {
            TextView textView7 = (TextView) r11.getValue();
            if (textView7 != null) {
                textView7.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView8 = (TextView) r11.getValue();
        if (textView8 != null) {
            textView8.setVisibility(0);
        }
        TextView textView9 = (TextView) r11.getValue();
        if (textView9 != null) {
            textView9.setText(item.remark);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        boolean z3 = this.f11364e;
        Context context = this.f4984a;
        return z3 ? new r(this, LayoutInflater.from(context).inflate(Pd.d.qt_layout_favorite_payment_item, parent, false)) : new q(this, LayoutInflater.from(context).inflate(Pd.d.qt_layout_dialog_payment_item, parent, false));
    }
}
