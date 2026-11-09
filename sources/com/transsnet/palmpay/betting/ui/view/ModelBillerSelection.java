package com.transsnet.palmpay.betting.ui.view;

import Ad.V;
import G1.d;
import Pa.n0;
import Pa.r0;
import Pd.c;
import android.content.Context;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.m;
import com.adjust.sdk.network.ErrorCodes;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002!\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/view/ModelBillerSelection;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/betting/ui/view/ModelBillerSelection$BillerSelectionCallback;", "callback", "", "setCallback", "(Lcom/transsnet/palmpay/betting/ui/view/ModelBillerSelection$BillerSelectionCallback;)V", "", "Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "billers", "setBillers", "(Ljava/util/List;)V", "getSelectedBiller", "()Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "", "billerId", "setSelectedBillerId", "(Ljava/lang/String;)V", "", "d", "Z", "isDarkMode", "()Z", "setDarkMode", "(Z)V", "a", "BillerSelectionCallback", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelBillerSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelBillerSelection.kt\ncom/transsnet/palmpay/betting/ui/view/ModelBillerSelection\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,313:1\n13567#2,3:314\n1878#3,3:317\n360#3,7:320\n295#3,2:327\n1878#3,3:329\n1878#3,3:332\n360#3,7:335\n*S KotlinDebug\n*F\n+ 1 ModelBillerSelection.kt\ncom/transsnet/palmpay/betting/ui/view/ModelBillerSelection\n*L\n127#1:314,3\n159#1:317,3\n175#1:320,7\n193#1:327,2\n204#1:329,3\n282#1:332,3\n307#1:335,7\n*E\n"})
public final class ModelBillerSelection extends ConstraintLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f26752g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BillerSelectionCallback f26755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isDarkMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f26757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f26758f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/view/ModelBillerSelection$BillerSelectionCallback;", "", "onBillerSelected", "", "biller", "Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "onMoreClick", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BillerSelectionCallback {
        void onBillerSelected(@NotNull BettingBillerListItemBean biller);

        void onMoreClick();
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillerSelection(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void c(boolean z3) {
        if (z3) {
            TransitionManager.beginDelayedTransition(this);
        }
        int i7 = 0;
        for (Object obj : this.f26753a) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            BettingBillerListItemBean bettingBillerListItemBean = (BettingBillerListItemBean) obj;
            View view = (View) CollectionsKt.G(i7, this.f26757e);
            if (view != null) {
                if (bettingBillerListItemBean == null) {
                    view.setVisibility(4);
                } else {
                    view.setVisibility(0);
                    ImageView imageView = (ImageView) view.findViewById(c.ivBillerLogo);
                    TextView textView = (TextView) view.findViewById(c.tvBillerName);
                    ImageView imageView2 = (ImageView) view.findViewById(c.ivRemark);
                    textView.setText(bettingBillerListItemBean.getBillerName());
                    r0.j1(imageView, bettingBillerListItemBean.getInstitutionLogo(), (d) d.O(r.cv_default_palmpay_icon_gray).H(new Sa.d(getContext(), CommonViewExtKt.getDp(4), 1)));
                    String billerLabelPicture = (TextUtils.isEmpty(bettingBillerListItemBean.getBillerLabelDarkPicture()) || !this.isDarkMode) ? bettingBillerListItemBean.getBillerLabelPicture() : bettingBillerListItemBean.getBillerLabelDarkPicture();
                    if (billerLabelPicture == null || billerLabelPicture.length() <= 0) {
                        Intrinsics.e(imageView2);
                        h.s(imageView2, false);
                    } else {
                        Intrinsics.e(imageView2);
                        h.s(imageView2, true);
                        r0.i1(imageView2, billerLabelPicture, Integer.MIN_VALUE, CommonViewExtKt.getDp(14));
                    }
                    boolean zC = Intrinsics.c(bettingBillerListItemBean.getBillerId(), this.f26754b);
                    view.setSelected(zC);
                    if (zC) {
                        view.setBackgroundResource(r.cv_rect_corner_8_bg_second_storke_purple);
                    } else {
                        view.setBackground(null);
                    }
                }
            }
            i7 = i10;
        }
    }

    public final void d(int i7, boolean z3) {
        BettingBillerListItemBean bettingBillerListItemBean = (BettingBillerListItemBean) CollectionsKt.G(i7, this.f26753a);
        if (bettingBillerListItemBean == null) {
            return;
        }
        this.f26754b = bettingBillerListItemBean.getBillerId();
        int i10 = 0;
        for (Object obj : this.f26757e) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C1850q.k();
                throw null;
            }
            View view = (View) obj;
            boolean z8 = i10 == i7;
            view.setSelected(z8);
            if (z8) {
                view.setBackgroundResource(r.cv_rect_corner_8_bg_second_storke_purple);
            } else {
                view.setBackground(null);
            }
            i10 = i11;
        }
        if (z3) {
            BillerSelectionCallback billerSelectionCallback = this.f26755c;
            if (billerSelectionCallback != null) {
                billerSelectionCallback.onBillerSelected(bettingBillerListItemBean);
            }
            n0 n0VarG = n0.g();
            ClickEvent clickEvent = new ClickEvent("PPay_Betting_Btn_Merchant");
            String billerName = bettingBillerListItemBean.getBillerName();
            if (billerName == null) {
                billerName = "";
            }
            n0VarG.k(clickEvent.add("element_name", billerName));
        }
    }

    @Nullable
    public final BettingBillerListItemBean getSelectedBiller() {
        Object obj;
        Object next;
        BettingBillerListItemBean bettingBillerListItemBean;
        Iterator it = this.f26753a.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                bettingBillerListItemBean = (BettingBillerListItemBean) next;
            }
            return (BettingBillerListItemBean) obj;
        } while (!Intrinsics.c(bettingBillerListItemBean != null ? bettingBillerListItemBean.getBillerId() : null, this.f26754b));
        obj = next;
        return (BettingBillerListItemBean) obj;
    }

    public final void setBillers(@NotNull List<BettingBillerListItemBean> billers) {
        Intrinsics.checkNotNullParameter(billers, "billers");
        List listU = CollectionsKt.U(billers, 3);
        int i7 = 0;
        for (Object obj : listU) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            this.f26753a.set(i7, (BettingBillerListItemBean) obj);
            i7 = i10;
        }
        c(false);
        if (listU.isEmpty()) {
            return;
        }
        d(0, false);
    }

    public final void setCallback(@Nullable BillerSelectionCallback callback) {
        this.f26755c = callback;
    }

    public final void setDarkMode(boolean z3) {
        this.isDarkMode = z3;
    }

    public final void setSelectedBillerId(@Nullable String billerId) {
        this.f26754b = billerId;
        Iterator it = this.f26753a.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            BettingBillerListItemBean bettingBillerListItemBean = (BettingBillerListItemBean) it.next();
            if (Intrinsics.c(bettingBillerListItemBean != null ? bettingBillerListItemBean.getBillerId() : null, billerId)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0 || i7 >= 3) {
            return;
        }
        d(i7, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillerSelection(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelBillerSelection(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillerSelection(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        int i10;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26753a = C1850q.i(null, null, null);
        this.f26757e = new ArrayList();
        View.inflate(context, Pd.d.qt_view_model_biller_selection, this);
        int i11 = 0;
        while (true) {
            int i12 = 1001;
            if (i11 >= 3) {
                break;
            }
            View viewInflate = LayoutInflater.from(getContext()).inflate(Pd.d.qt_item_biller_selection, (ViewGroup) this, false);
            if (i11 != 0) {
                i12 = i11 != 1 ? 1003 : 1002;
            }
            viewInflate.setId(i12);
            viewInflate.setOnClickListener(new V(this, i11, 9));
            this.f26757e.add(viewInflate);
            addView(viewInflate);
            i11++;
        }
        View viewInflate2 = LayoutInflater.from(getContext()).inflate(Pd.d.qt_item_more_selection, (ViewGroup) this, false);
        viewInflate2.setId(1004);
        viewInflate2.setOnClickListener(new p327vd.c(this, 1));
        this.f26758f = viewInflate2;
        addView(viewInflate2);
        m mVar = new m();
        mVar.e(this);
        int[] iArr = {1001, 1002, ErrorCodes.MALFORMED_URL_EXCEPTION, 1004};
        int dp = CommonViewExtKt.getDp(8);
        mVar.k(iArr[0]).f15747e.f15774W = 0;
        int i13 = 1;
        mVar.h(iArr[0], 1, 0, 1, -1);
        for (i10 = 1; i10 < 4; i10++) {
            int i14 = i10 - 1;
            mVar.h(iArr[i10], i13, iArr[i14], 2, -1);
            int i15 = i13;
            mVar.h(iArr[i14], 2, iArr[i10], i15, -1);
            i13 = i15;
        }
        mVar.h(iArr[3], 2, 0, 2, -1);
        int i16 = 0;
        int i17 = 0;
        while (i16 < 4) {
            int i18 = iArr[i16];
            int i19 = i17 + 1;
            mVar.k(i18).f15747e.f15781c = 0;
            mVar.k(i18).f15747e.f15782d = CommonViewExtKt.getDp(72);
            mVar.g(i18, 3, 0, 3);
            mVar.g(i18, 4, 0, 4);
            if (i17 < 3) {
                mVar.s(i18, 7, dp);
            }
            i16++;
            i17 = i19;
        }
        mVar.b(this);
    }
}
