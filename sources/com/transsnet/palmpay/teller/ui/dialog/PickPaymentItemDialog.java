package com.transsnet.palmpay.teller.ui.dialog;

import Bc.k;
import Bc.p;
import Be.c;
import Pd.d;
import Pd.f;
import Rd.r0;
import V9.q;
import Wd.C0742p;
import Yd.o;
import Yd.s;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog;
import com.transsnet.palmpay.teller.ui.view.SideBarView;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p013ae.e;
import p025ba.l;
import p055de.h;
import p059e1.a;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\u0018\u00002\u00020\u0001:\u0002P2B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010\rR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R*\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010'j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R#\u00101\u001a\n ,*\u0004\u0018\u00010+0+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010?\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u0012\"\u0004\bB\u0010CR\"\u0010D\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010@\u001a\u0004\bE\u0010\u0012\"\u0004\bF\u0010CR&\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u00140'j\b\u0012\u0004\u0012\u00020\u0014`(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010*R&\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u00140'j\b\u0012\u0004\u0012\u00020\u0014`(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010*R\u0018\u0010I\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010K\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\"¨\u0006Q"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/PickPaymentItemDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "layoutId", "(Landroid/content/Context;I)V", "styleId", "(Landroid/content/Context;II)V", "", "initViews", "()V", "updateEmptyUI", "updateShowSearchBar", "", "iShowSearchBar", "()Z", "", "Lcom/transsnet/palmpay/teller/bean/PaymentItemBean;", "list", "setPaymentItems", "(Ljava/util/List;)V", "Lcom/transsnet/palmpay/teller/bean/BillerListItemBean;", "biller", "setBiller", "(Lcom/transsnet/palmpay/teller/bean/BillerListItemBean;)V", "Lcom/transsnet/palmpay/teller/ui/dialog/PickPaymentItemDialog$CallBack;", "callBack", "setCallBack", "(Lcom/transsnet/palmpay/teller/ui/dialog/PickPaymentItemDialog$CallBack;)V", FirebaseAnalytics.Param.INDEX, "switchTab", "(I)V", "changeDialogHeight", "LRd/r0;", "binding", "LRd/r0;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mSearchResult", "Ljava/util/ArrayList;", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "mPaymentList$delegate", "Lkotlin/Lazy;", "getMPaymentList", "()Landroidx/recyclerview/widget/RecyclerView;", "mPaymentList", "LYd/s;", "mAdapter", "LYd/s;", "", "businessName", "Ljava/lang/String;", "getBusinessName", "()Ljava/lang/String;", "setBusinessName", "(Ljava/lang/String;)V", "titleItemlName", "getTitleItemlName", "setTitleItemlName", "bFavorite", "Z", "getBFavorite", "setBFavorite", "(Z)V", "hideScrollBar", "getHideScrollBar", "setHideScrollBar", "mPaymentLists", "mRawPaymentLists", "mCallBack", "Lcom/transsnet/palmpay/teller/ui/dialog/PickPaymentItemDialog$CallBack;", "tabIndex", "I", "getTabIndex", "()I", "setTabIndex", "CallBack", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPickPaymentItemDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickPaymentItemDialog.kt\ncom/transsnet/palmpay/teller/ui/dialog/PickPaymentItemDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1#2:552\n*E\n"})
public final class PickPaymentItemDialog extends b {
    private boolean bFavorite;

    @Nullable
    private r0 binding;

    @NotNull
    private String businessName;
    private boolean hideScrollBar;
    private s mAdapter;

    @Nullable
    private CallBack mCallBack;

    /* JADX INFO: renamed from: mPaymentList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPaymentList;

    @NotNull
    private ArrayList<PaymentItemBean> mPaymentLists;

    @NotNull
    private ArrayList<PaymentItemBean> mRawPaymentLists;

    @Nullable
    private ArrayList<PaymentItemBean> mSearchResult;
    private int tabIndex;

    @NotNull
    private String titleItemlName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/PickPaymentItemDialog$CallBack;", "", "onPaymentItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/teller/bean/PaymentItemBean;", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CallBack {
        void onPaymentItemClick(@Nullable PaymentItemBean data);
    }

    public PickPaymentItemDialog(@Nullable Context context) {
        super(context);
        this.mPaymentList = C2131j.a(EnumC2132k.f43971c, new o(this, 0));
        this.businessName = "";
        this.titleItemlName = "";
        this.mPaymentLists = new ArrayList<>();
        this.mRawPaymentLists = new ArrayList<>();
    }

    private final void changeDialogHeight() {
        LinearLayout linearLayout;
        ViewTreeObserver viewTreeObserver;
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        r0 r0Var = this.binding;
        if (r0Var == null || (linearLayout = r0Var.f8471j) == null || (viewTreeObserver = linearLayout.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new c(this, 7));
    }

    private final RecyclerView getMPaymentList() {
        return (RecyclerView) this.mPaymentList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initViews$lambda$5$lambda$4(PickPaymentItemDialog pickPaymentItemDialog) {
        return (pickPaymentItemDialog.bFavorite || pickPaymentItemDialog.hideScrollBar) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$7(PickPaymentItemDialog pickPaymentItemDialog, View view, PaymentItemBean paymentItemBean, RecyclerView.ViewHolder viewHolder) {
        CallBack callBack = pickPaymentItemDialog.mCallBack;
        if (callBack != null) {
            callBack.onPaymentItemClick(paymentItemBean);
        }
        pickPaymentItemDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$8(PickPaymentItemDialog pickPaymentItemDialog, View view) {
        p pVar;
        EditText editText;
        r0 r0Var = pickPaymentItemDialog.binding;
        if (r0Var == null || (pVar = r0Var.f8464b) == null || (editText = (EditText) pVar.f813d) == null) {
            return;
        }
        editText.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mPaymentList_delegate$lambda$0(PickPaymentItemDialog pickPaymentItemDialog) {
        return (RecyclerView) pickPaymentItemDialog.findViewById(Pd.c.paymentList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchTab(int index) {
        String string;
        Editable text;
        this.tabIndex = index;
        if (index == 1) {
            r0 r0Var = this.binding;
            if (r0Var != null) {
                r0Var.f8469g.setSelected(true);
            }
            r0 r0Var2 = this.binding;
            if (r0Var2 != null) {
                r0Var2.f8468f.setSelected(false);
            }
            s sVar = this.mAdapter;
            if (sVar == null) {
                Intrinsics.n("mAdapter");
                throw null;
            }
            if (sVar.f11365f) {
                String str = p070ee.c.f36289a;
                r0 r0Var3 = this.binding;
                if (r0Var3 == null || (text = ((EditText) r0Var3.f8464b.f813d).getText()) == null || (string = text.toString()) == null) {
                    string = "";
                }
                ArrayList<PaymentItemBean> arrayListH = p070ee.c.h(string, this.mRawPaymentLists);
                this.mSearchResult = arrayListH;
                s sVar2 = this.mAdapter;
                if (sVar2 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                sVar2.b();
                s sVar3 = this.mAdapter;
                if (sVar3 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                sVar3.f4985b.addAll(arrayListH);
                s sVar4 = this.mAdapter;
                if (sVar4 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                sVar4.f11365f = false;
                sVar4.notifyDataSetChanged();
            }
        } else {
            r0 r0Var4 = this.binding;
            if (r0Var4 != null) {
                r0Var4.f8469g.setSelected(false);
            }
            r0 r0Var5 = this.binding;
            if (r0Var5 != null) {
                r0Var5.f8468f.setSelected(true);
            }
            s sVar5 = this.mAdapter;
            if (sVar5 == null) {
                Intrinsics.n("mAdapter");
                throw null;
            }
            if (!sVar5.f11365f) {
                this.mPaymentLists.clear();
                ArrayList arrayList = new ArrayList();
                int size = this.mRawPaymentLists.size();
                for (int i7 = 0; i7 < size; i7++) {
                    this.mPaymentLists.add(this.mRawPaymentLists.get(i7));
                    if (this.mRawPaymentLists.get(i7).myFavorite) {
                        arrayList.add(this.mRawPaymentLists.get(i7));
                    }
                }
                s sVar6 = this.mAdapter;
                if (sVar6 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                sVar6.f4985b.clear();
                s sVar7 = this.mAdapter;
                if (sVar7 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                sVar7.f4985b.addAll(arrayList);
                s sVar8 = this.mAdapter;
                if (sVar8 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                sVar8.f11365f = true;
                sVar8.notifyDataSetChanged();
            }
        }
        updateShowSearchBar();
        updateEmptyUI();
    }

    public final boolean getBFavorite() {
        return this.bFavorite;
    }

    @NotNull
    public final String getBusinessName() {
        return this.businessName;
    }

    public final boolean getHideScrollBar() {
        return this.hideScrollBar;
    }

    public final int getTabIndex() {
        return this.tabIndex;
    }

    @NotNull
    public final String getTitleItemlName() {
        return this.titleItemlName;
    }

    public final boolean iShowSearchBar() {
        return this.tabIndex <= 1 && this.mRawPaymentLists.size() > 15;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewM;
        setContentView(d.qt_pick_payment_item_dialog);
        View viewFindViewById = findViewById(Pd.c.viewRoot);
        int i7 = Pd.c.ivClose;
        IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
        if (iconicsImageView != null) {
            i7 = Pd.c.paymentList;
            if (((RecyclerView) a.m(i7, viewFindViewById)) != null && (viewM = a.m((i7 = Pd.c.qp_search_item), viewFindViewById)) != null) {
                p pVarB = p.b(viewM);
                i7 = Pd.c.qt_layout_search_item_empty;
                View viewM2 = a.m(i7, viewFindViewById);
                if (viewM2 != null) {
                    k kVarB = k.b(viewM2);
                    i7 = Pd.c.sideBar;
                    SideBarView sideBarView = (SideBarView) a.m(i7, viewFindViewById);
                    if (sideBarView != null) {
                        i7 = Pd.c.tabView;
                        LinearLayout linearLayout = (LinearLayout) a.m(i7, viewFindViewById);
                        if (linearLayout != null) {
                            i7 = Pd.c.tvFav;
                            TextView textView = (TextView) a.m(i7, viewFindViewById);
                            if (textView != null) {
                                i7 = Pd.c.tvNormal;
                                TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                                if (textView2 != null) {
                                    i7 = Pd.c.tvTitle;
                                    TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                                    if (textView3 != null) {
                                        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById;
                                        this.binding = new r0(linearLayout2, iconicsImageView, pVarB, kVarB, sideBarView, linearLayout, textView, textView2, textView3, linearLayout2);
                                        final int i10 = 0;
                                        iconicsImageView.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.p

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ PickPaymentItemDialog f11354b;

                                            {
                                                this.f11354b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i10) {
                                                    case 0:
                                                        this.f11354b.dismiss();
                                                        break;
                                                    case 1:
                                                        this.f11354b.switchTab(2);
                                                        break;
                                                    case 2:
                                                        this.f11354b.switchTab(1);
                                                        break;
                                                    default:
                                                        PickPaymentItemDialog.initViews$lambda$8(this.f11354b, view);
                                                        break;
                                                }
                                            }
                                        });
                                        r0 r0Var = this.binding;
                                        if (r0Var != null) {
                                            r0Var.f8470i.setText(this.mContext.getString(Vd.a.qt_select_payment_item));
                                        }
                                        r0 r0Var2 = this.binding;
                                        if (r0Var2 != null) {
                                            final int i11 = 1;
                                            r0Var2.f8468f.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.p

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ PickPaymentItemDialog f11354b;

                                                {
                                                    this.f11354b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i11) {
                                                        case 0:
                                                            this.f11354b.dismiss();
                                                            break;
                                                        case 1:
                                                            this.f11354b.switchTab(2);
                                                            break;
                                                        case 2:
                                                            this.f11354b.switchTab(1);
                                                            break;
                                                        default:
                                                            PickPaymentItemDialog.initViews$lambda$8(this.f11354b, view);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        r0 r0Var3 = this.binding;
                                        if (r0Var3 != null) {
                                            final int i12 = 2;
                                            r0Var3.f8469g.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.p

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ PickPaymentItemDialog f11354b;

                                                {
                                                    this.f11354b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i12) {
                                                        case 0:
                                                            this.f11354b.dismiss();
                                                            break;
                                                        case 1:
                                                            this.f11354b.switchTab(2);
                                                            break;
                                                        case 2:
                                                            this.f11354b.switchTab(1);
                                                            break;
                                                        default:
                                                            PickPaymentItemDialog.initViews$lambda$8(this.f11354b, view);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        s sVar = new s(this.mContext);
                                        this.mAdapter = sVar;
                                        boolean z3 = this.bFavorite;
                                        sVar.f11364e = z3;
                                        if (z3) {
                                            r0 r0Var4 = this.binding;
                                            if (r0Var4 != null) {
                                                r0Var4.f8467e.setVisibility(0);
                                            }
                                            r0 r0Var5 = this.binding;
                                            if (r0Var5 != null) {
                                                r0Var5.f8469g.setSelected(true);
                                            }
                                            r0 r0Var6 = this.binding;
                                            if (r0Var6 != null) {
                                                r0Var6.f8468f.setSelected(false);
                                            }
                                        } else {
                                            r0 r0Var7 = this.binding;
                                            if (r0Var7 != null) {
                                                r0Var7.f8467e.setVisibility(8);
                                            }
                                        }
                                        String str = this.titleItemlName;
                                        if (str != null && str.length() != 0) {
                                            r0 r0Var8 = this.binding;
                                            if (r0Var8 != null) {
                                                r0Var8.f8469g.setText(this.titleItemlName);
                                            }
                                            r0 r0Var9 = this.binding;
                                            if (r0Var9 != null) {
                                                r0Var9.f8470i.setText(this.mContext.getString(f.qt_new_bouquet));
                                            }
                                        }
                                        RecyclerView mPaymentList = getMPaymentList();
                                        s sVar2 = this.mAdapter;
                                        if (sVar2 == null) {
                                            Intrinsics.n("mAdapter");
                                            throw null;
                                        }
                                        mPaymentList.setAdapter(sVar2);
                                        getMPaymentList().setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
                                        r0 r0Var10 = this.binding;
                                        if (r0Var10 != null) {
                                            SideBarView sideBarView2 = r0Var10.f8466d;
                                            RecyclerView mPaymentList2 = getMPaymentList();
                                            Intrinsics.checkNotNullExpressionValue(mPaymentList2, "<get-mPaymentList>(...)");
                                            s sVar3 = this.mAdapter;
                                            if (sVar3 == null) {
                                                Intrinsics.n("mAdapter");
                                                throw null;
                                            }
                                            new e(mPaymentList2, sideBarView2, sVar3, new o(this, 1));
                                        }
                                        changeDialogHeight();
                                        s sVar4 = this.mAdapter;
                                        if (sVar4 == null) {
                                            Intrinsics.n("mAdapter");
                                            throw null;
                                        }
                                        sVar4.f4986c = new q(this, 25);
                                        F f10 = new F();
                                        r0 r0Var11 = this.binding;
                                        LinearLayout linearLayout3 = r0Var11 != null ? (LinearLayout) r0Var11.f8465c.f748b : null;
                                        Intrinsics.e(linearLayout3);
                                        f10.f38951a = new h(linearLayout3);
                                        r0 r0Var12 = this.binding;
                                        if (r0Var12 != null) {
                                            ((EditText) r0Var12.f8464b.f813d).setHint(f.qt_search_for_a_payment_item);
                                        }
                                        r0 r0Var13 = this.binding;
                                        if (r0Var13 != null) {
                                            final int i13 = 3;
                                            ((ImageView) r0Var13.f8464b.f812c).setOnClickListener(new View.OnClickListener(this) { // from class: Yd.p

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ PickPaymentItemDialog f11354b;

                                                {
                                                    this.f11354b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i13) {
                                                        case 0:
                                                            this.f11354b.dismiss();
                                                            break;
                                                        case 1:
                                                            this.f11354b.switchTab(2);
                                                            break;
                                                        case 2:
                                                            this.f11354b.switchTab(1);
                                                            break;
                                                        default:
                                                            PickPaymentItemDialog.initViews$lambda$8(this.f11354b, view);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        r0 r0Var14 = this.binding;
                                        if (r0Var14 != null) {
                                            ((EditText) r0Var14.f8464b.f813d).addTextChangedListener(new C0742p(1, this, f10));
                                        }
                                        h hVar = (h) f10.f38951a;
                                        String str2 = this.businessName;
                                        hVar.getClass();
                                        Intrinsics.checkNotNullParameter(str2, "<set-?>");
                                        hVar.f35918b = str2;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    public final void setBFavorite(boolean z3) {
        this.bFavorite = z3;
    }

    public final void setBiller(@Nullable BillerListItemBean biller) {
        s sVar = this.mAdapter;
        if (sVar != null) {
            sVar.f11368j = biller;
        } else {
            Intrinsics.n("mAdapter");
            throw null;
        }
    }

    public final void setBusinessName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.businessName = str;
    }

    public final void setCallBack(@NotNull CallBack callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.mCallBack = callBack;
    }

    public final void setHideScrollBar(boolean z3) {
        this.hideScrollBar = z3;
    }

    public final void setPaymentItems(@NotNull List<? extends PaymentItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mPaymentLists.clear();
        List<? extends PaymentItemBean> list2 = list;
        this.mPaymentLists.addAll(list2);
        this.mRawPaymentLists.clear();
        this.mRawPaymentLists.addAll(list2);
        s sVar = this.mAdapter;
        if (sVar == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        sVar.b();
        s sVar2 = this.mAdapter;
        if (sVar2 == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        sVar2.f4985b.addAll(list2);
        s sVar3 = this.mAdapter;
        if (sVar3 == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        sVar3.notifyDataSetChanged();
        updateShowSearchBar();
    }

    public final void setTabIndex(int i7) {
        this.tabIndex = i7;
    }

    public final void setTitleItemlName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.titleItemlName = str;
    }

    public final void updateEmptyUI() {
        k kVar;
        LinearLayout linearLayout;
        r0 r0Var;
        TextView textView;
        k kVar2;
        LinearLayout linearLayout2;
        s sVar = this.mAdapter;
        if (sVar == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        if (sVar.f4985b.isEmpty() && (r0Var = this.binding) != null && (textView = r0Var.f8469g) != null && textView.isSelected() && iShowSearchBar()) {
            r0 r0Var2 = this.binding;
            if (r0Var2 == null || (kVar2 = r0Var2.f8465c) == null || (linearLayout2 = (LinearLayout) kVar2.f748b) == null) {
                return;
            }
            linearLayout2.setVisibility(0);
            return;
        }
        r0 r0Var3 = this.binding;
        if (r0Var3 == null || (kVar = r0Var3.f8465c) == null || (linearLayout = (LinearLayout) kVar.f748b) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final void updateShowSearchBar() {
        p pVar;
        LinearLayout linearLayout;
        r0 r0Var = this.binding;
        if (r0Var == null || (pVar = r0Var.f8464b) == null || (linearLayout = (LinearLayout) pVar.f811b) == null) {
            return;
        }
        linearLayout.setVisibility(iShowSearchBar() ? 0 : 8);
    }

    public PickPaymentItemDialog(@Nullable Context context, int i7) {
        super(context, i7);
        this.mPaymentList = C2131j.a(EnumC2132k.f43971c, new o(this, 0));
        this.businessName = "";
        this.titleItemlName = "";
        this.mPaymentLists = new ArrayList<>();
        this.mRawPaymentLists = new ArrayList<>();
    }

    public PickPaymentItemDialog(@Nullable Context context, int i7, int i10) {
        super(context, i7, i10);
        this.mPaymentList = C2131j.a(EnumC2132k.f43971c, new o(this, 0));
        this.businessName = "";
        this.titleItemlName = "";
        this.mPaymentLists = new ArrayList<>();
        this.mRawPaymentLists = new ArrayList<>();
    }
}
