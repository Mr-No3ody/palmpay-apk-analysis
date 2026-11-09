package Gd;

import Pa.r0;
import Rd.C0592h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.BannerEntranceBean;
import com.transsnet.palmpay.send_money.ui.view.TransferHomeEntranceView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferHomeEntranceView f3349b;

    public g(TransferHomeEntranceView transferHomeEntranceView, ArrayList pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f3349b = transferHomeEntranceView;
        this.f3348a = pages;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3348a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        int size;
        char c6;
        View view;
        boolean z3 = false;
        boolean z8 = true;
        f holder = (f) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List pageEntries = (List) this.f3348a.get(i7);
        int i10 = i7 * 4;
        holder.getClass();
        Intrinsics.checkNotNullParameter(pageEntries, "pageEntries");
        LinearLayout linearLayout = holder.f3346a;
        linearLayout.removeAllViews();
        TransferHomeEntranceView transferHomeEntranceView = holder.f3347b.f3349b;
        if (transferHomeEntranceView.f33878f) {
            size = 4;
        } else {
            size = pageEntries.size();
            if (size < 1) {
                size = 1;
            }
        }
        LinearLayout linearLayout2 = new LinearLayout(transferHomeEntranceView.getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(size);
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i11 = 0;
        while (i11 < size) {
            if (i11 < pageEntries.size()) {
                BannerEntranceBean bannerEntranceBean = (BannerEntranceBean) pageEntries.get(i11);
                int i12 = i10 + i11;
                View viewInflate = LayoutInflater.from(transferHomeEntranceView.getContext()).inflate(p159kd.f.sm_item_transfer_home_entrance, transferHomeEntranceView, z3);
                int i13 = p159kd.e.ivEntranceCorner;
                AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i13, viewInflate);
                if (appCompatImageView != null) {
                    i13 = p159kd.e.ivEntranceIcon;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) p059e1.a.m(i13, viewInflate);
                    if (appCompatImageView2 != null) {
                        i13 = p159kd.e.tvEntranceName;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) p059e1.a.m(i13, viewInflate);
                        if (appCompatTextView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            Intrinsics.checkNotNullExpressionValue(new C0592h(constraintLayout, appCompatImageView, appCompatImageView2, appCompatTextView), "inflate(...)");
                            r0.k1(appCompatImageView2, bannerEntranceBean.getPic(), bannerEntranceBean.getDarkPic());
                            r0.k1(appCompatImageView, bannerEntranceBean.getCornerMark(), bannerEntranceBean.getDarkCornerMark());
                            String name = bannerEntranceBean.getName();
                            if (name == null) {
                                name = "";
                            }
                            appCompatTextView.setText(kotlin.text.y.k(name, "##", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE));
                            constraintLayout.setOnClickListener(new e(transferHomeEntranceView, bannerEntranceBean, i12, 0));
                            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                            c6 = 4;
                            view = constraintLayout;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
            }
            View view2 = new View(transferHomeEntranceView.getContext());
            c6 = 4;
            view2.setVisibility(4);
            view = view2;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            if (i11 > 0) {
                layoutParams.setMarginStart(CommonViewExtKt.getDp(8));
            }
            Unit unit = Unit.f38893a;
            linearLayout2.addView(view, layoutParams);
            i11++;
            z3 = false;
            z8 = z8;
        }
        linearLayout.addView(linearLayout2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LinearLayout linearLayout = new LinearLayout(parent.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new f(this, linearLayout);
    }
}
