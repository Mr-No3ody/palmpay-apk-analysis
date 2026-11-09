package Xd;

import N8.q0;
import Pa.r0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends Kb.c implements SectionIndexer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f11159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f11160g;

    public l(Context context, boolean z3) {
        super(context);
        this.f11158e = z3;
        this.f11159f = new ArrayList();
        this.f11160g = new String[0];
    }

    public static String d(BillerListItemBean billerListItemBean) {
        Character chX;
        String string;
        if (Intrinsics.c(billerListItemBean.getRecommend(), Boolean.TRUE)) {
            return "#";
        }
        String billerName = billerListItemBean.getBillerName();
        if (billerName == null || (chX = kotlin.text.F.x(billerName)) == null || (string = chX.toString()) == null) {
            return "";
        }
        String upperCase = string.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase == null ? "" : upperCase;
    }

    public final long c(int i7) {
        String billerName;
        Character chX;
        char upperCase;
        if (i7 >= this.f4985b.size()) {
            return 0L;
        }
        BillerListItemBean billerListItemBean = (BillerListItemBean) this.f4985b.get(i7);
        if (billerListItemBean != null ? Intrinsics.c(billerListItemBean.getRecommend(), Boolean.TRUE) : false) {
            upperCase = '#';
        } else {
            if (billerListItemBean == null || (billerName = billerListItemBean.getBillerName()) == null || (chX = kotlin.text.F.x(billerName)) == null) {
                return 0L;
            }
            upperCase = Character.toUpperCase(chX.charValue());
        }
        return upperCase;
    }

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4985b.size();
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i7) {
        Integer num = (Integer) CollectionsKt.G(i7, this.f11159f);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i7) {
        String billerName;
        List mDatas = this.f4985b;
        Intrinsics.checkNotNullExpressionValue(mDatas, "mDatas");
        BillerListItemBean billerListItemBean = (BillerListItemBean) CollectionsKt.G(i7, mDatas);
        if (billerListItemBean == null || (billerName = billerListItemBean.getBillerName()) == null || billerName.length() == 0) {
            return -1;
        }
        return C1847n.t(this.f11160g, d(billerListItemBean));
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        ArrayList arrayList = new ArrayList(26);
        ArrayList arrayList2 = this.f11159f;
        arrayList2.clear();
        List mDatas = this.f4985b;
        Intrinsics.checkNotNullExpressionValue(mDatas, "mDatas");
        int i7 = 0;
        for (Object obj : mDatas) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            BillerListItemBean billerListItemBean = (BillerListItemBean) obj;
            if (billerListItemBean != null && !TextUtils.isEmpty(billerListItemBean.getBillerName())) {
                String strD = d(billerListItemBean);
                if (!arrayList.contains(strD)) {
                    arrayList.add(strD);
                    arrayList2.add(Integer.valueOf(i7));
                }
            }
            i7 = i10;
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f11160g = strArr;
        return strArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Uri uri;
        String shortName;
        String strY;
        String abbreviatedName;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f4985b.get(i7);
        Intrinsics.e(obj);
        BillerListItemBean bean = (BillerListItemBean) obj;
        k kVar = (k) holder;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(bean, "bean");
        if (TextUtils.isEmpty(bean.getInstitutionLogo())) {
            uri = Uri.parse("android.resource://com.transsnet.palmpay/drawable/qt_default_bill_payment_icon");
            Intrinsics.e(uri);
        } else {
            uri = Uri.parse(bean.getInstitutionLogo());
            Intrinsics.e(uri);
        }
        ImageView imageView = kVar.f11152e;
        if (imageView != null) {
            r0.g1(imageView, uri, (G1.d) ((G1.d) ((G1.d) new G1.d().j(Pd.b.qt_icon_default_biller_history)).x(Pd.b.qt_icon_default_biller_history)).H(new com.bumptech.glide.load.resource.bitmap.z(SizeUtils.dp2px(4.0f))));
        }
        l lVar = kVar.f11157o;
        String str = "";
        if (lVar.f11158e) {
            str = TextUtils.isEmpty(bean.getAbbreviatedName()) ? abbreviatedName : abbreviatedName;
            String str2 = p070ee.c.f36289a;
            strY = q0.y(str, " - ", p070ee.c.c(lVar.f4984a, bean.getCategoryId()));
        } else {
            str = TextUtils.isEmpty(bean.getShortName()) ? shortName : shortName;
            strY = str;
        }
        TextView textView = kVar.f11151d;
        if (textView != null) {
            textView.setText(strY);
        }
        TextView textView2 = kVar.f11155i;
        if (textView2 != null) {
            textView2.setText(bean.getBillerName());
        }
        View view = kVar.itemView;
        Integer status = bean.getStatus();
        view.setEnabled(status != null && 1 == status.intValue());
        String str3 = p070ee.c.f36289a;
        Integer status2 = bean.getStatus();
        p070ee.c.j(status2 != null ? status2.intValue() : 0, textView);
        TextView textView3 = kVar.f11156j;
        if (textView3 != null) {
            textView3.setText(d(bean));
        }
        boolean zC = Intrinsics.c(bean.getHasCoupon(), Boolean.TRUE);
        ImageView imageView2 = kVar.f11154g;
        if (zC) {
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        boolean zIsEmpty = TextUtils.isEmpty(bean.getRemark());
        TextView textView4 = kVar.f11153f;
        if (!zIsEmpty) {
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView4 != null) {
                textView4.setText(bean.getRemark());
            }
        } else if (textView4 != null) {
            textView4.setVisibility(8);
        }
        View viewFindViewById = holder.itemView.findViewById(Pd.c.qlp_header_item);
        if (i7 == 0) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else if (c(i7) != c(i7 - 1)) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new k(this, View.inflate(this.f4984a, Pd.d.qt_layout_pick_biller_list_item, null));
    }
}
