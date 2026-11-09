package com.transsnet.palmpay.teller.ui.activity;

import Bc.k;
import Bc.p;
import Fd.G;
import P8.a;
import Pd.c;
import Pd.d;
import Rd.B;
import Sd.b;
import W8.o;
import Wd.C0738l;
import Wd.C0740n;
import Wd.C0741o;
import Wd.C0742p;
import Xd.l;
import Xd.z;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.F;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.bean.req.GetMenuBySceneReq;
import com.transsnet.palmpay.core.bean.rsp.GetMenuBySceneRsp;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.teller.bean.BillerListRsp;
import com.transsnet.palmpay.teller.db.dao.BillerSearchRecordDao;
import com.transsnet.palmpay.teller.ui.activity.BillerSearchActivity;
import com.transsnet.palmpay.teller.ui.viewhandler.BillerSearchViewModel;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p051d9.C1624v;
import p140j8.f;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "场景/Biller Search", path = "/quick_teller/biller_search_page")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/BillerSearchActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/teller/ui/viewhandler/BillerSearchViewModel;", "LRd/B;", "<init>", "()V", "P8/a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillerSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillerSearchActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/BillerSearchActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,306:1\n115#2,8:307\n145#2:315\n115#2,8:316\n145#2:324\n33#2,2:325\n33#2,2:327\n*S KotlinDebug\n*F\n+ 1 BillerSearchActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/BillerSearchActivity\n*L\n168#1:307,8\n168#1:315\n175#1:316,8\n175#1:324\n182#1:325,2\n191#1:327,2\n*E\n"})
public final class BillerSearchActivity extends BaseMvvmVBActivity<BillerSearchViewModel, B> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f34173p = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f34174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f34175e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f34176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f34177g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f34178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f34179j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f34180o;

    public BillerSearchActivity() {
        new ArrayList();
        this.f34177g = new ArrayList();
        new ArrayList();
        this.f34179j = new Handler(Looper.getMainLooper());
        this.f34180o = new o(this, 2);
    }

    public static final void n(BillerSearchActivity billerSearchActivity) {
        List list;
        z zVar;
        List list2;
        l lVar = billerSearchActivity.f34178i;
        if (lVar == null || (list = lVar.f4985b) == null || !list.isEmpty() || (zVar = billerSearchActivity.f34174d) == null || (list2 = zVar.f4985b) == null || !list2.isEmpty()) {
            B b7 = (B) billerSearchActivity.f27334c;
            if (b7 != null) {
                ((LinearLayout) b7.f7985i.f748b).setVisibility(8);
                return;
            }
            return;
        }
        B b10 = (B) billerSearchActivity.f27334c;
        if (b10 != null) {
            ((LinearLayout) b10.f7985i.f748b).setVisibility(0);
        }
    }

    public static void o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<Ud.a> listQuerySearchRecordByText = ((BillerSearchRecordDao) b.a().f8871b).querySearchRecordByText(str);
        if (!listQuerySearchRecordByText.isEmpty()) {
            Ud.a aVar = listQuerySearchRecordByText.get(0);
            aVar.f9753d = System.currentTimeMillis();
            b bVarA = b.a();
            bVarA.getClass();
            try {
                ((BillerSearchRecordDao) bVarA.f8871b).update(aVar);
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        Ud.a aVar2 = new Ud.a();
        aVar2.f9752c = str;
        try {
            aVar2.f9751b = BaseApplication.get().getUser().getMemberId();
        } catch (Exception unused) {
        }
        aVar2.f9753d = System.currentTimeMillis();
        b bVarA2 = b.a();
        bVarA2.getClass();
        String str2 = aVar2.f9752c;
        BillerSearchRecordDao billerSearchRecordDao = (BillerSearchRecordDao) bVarA2.f8871b;
        List<Ud.a> listQuerySearchRecord = billerSearchRecordDao.querySearchRecord(str2);
        if (listQuerySearchRecord != null && listQuerySearchRecord.size() > 0) {
            Iterator<Ud.a> it = listQuerySearchRecord.iterator();
            while (it.hasNext()) {
                billerSearchRecordDao.delete(it.next());
            }
        }
        billerSearchRecordDao.insert(aVar2);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        com.transsnet.palmpay.core.base.l lVar = ((BillerSearchViewModel) l()).f34381g;
        if (lVar != null) {
            lVar.e(this, new G(new C0740n(this, 0), 28));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((BillerSearchViewModel) l()).f34382i;
        if (lVar2 != null) {
            lVar2.e(this, new G(new C0740n(this, 1), 28));
        }
        F f10 = ((BillerSearchViewModel) l()).f34379e;
        if (f10 != null) {
            f10.e(this, new G(new C0740n(this, 2), 28));
        }
        F f11 = ((BillerSearchViewModel) l()).f34380f;
        if (f11 != null) {
            f11.e(this, new G(new C0740n(this, 3), 28));
        }
        B b7 = (B) this.f27334c;
        if (b7 != null) {
            b7.f7979b.setBackgroundColor(0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_search_biller, (ViewGroup) null, false);
        int i7 = c.emptyView;
        ModelEmptyView modelEmptyView = (ModelEmptyView) p059e1.a.m(i7, viewInflate);
        if (modelEmptyView != null) {
            i7 = c.ma_back_iv;
            ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
            if (imageView != null) {
                i7 = c.ma_biller_rcv;
                RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                if (recyclerView != null) {
                    i7 = c.ma_business_menu_rcv;
                    RecyclerView recyclerView2 = (RecyclerView) p059e1.a.m(i7, viewInflate);
                    if (recyclerView2 != null) {
                        i7 = c.ma_history_rcv;
                        RecyclerView recyclerView3 = (RecyclerView) p059e1.a.m(i7, viewInflate);
                        if (recyclerView3 != null) {
                            i7 = c.ma_search_tv;
                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView != null && (viewM = p059e1.a.m((i7 = c.mls_search_empty_root), viewInflate)) != null) {
                                k kVarB = k.b(viewM);
                                i7 = c.qt_layout_search_item;
                                View viewM2 = p059e1.a.m(i7, viewInflate);
                                if (viewM2 != null) {
                                    p pVarB = p.b(viewM2);
                                    i7 = c.tvSearchHistory;
                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        B b7 = new B((LinearLayout) viewInflate, modelEmptyView, imageView, recyclerView, recyclerView2, recyclerView3, textView, kVarB, pVarB, textView2);
                                        Intrinsics.checkNotNullExpressionValue(b7, "inflate(...)");
                                        return b7;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f34179j.removeCallbacksAndMessages(null);
    }

    public final String p() {
        p pVar;
        EditText editText;
        Editable editableText;
        String string;
        try {
            B b7 = (B) this.f27334c;
            return (b7 == null || (pVar = b7.f7986j) == null || (editText = (EditText) pVar.f813d) == null || (editableText = editText.getEditableText()) == null || (string = editableText.toString()) == null) ? "" : string;
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        final BillerSearchViewModel billerSearchViewModel = (BillerSearchViewModel) l();
        GetMenuBySceneReq getMenuBySceneReq = new GetMenuBySceneReq(1);
        billerSearchViewModel.getClass();
        final int i7 = 1;
        f.t(billerSearchViewModel, new p055de.c(getMenuBySceneReq, null), new Function1() { // from class: de.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        BillerListRsp response = (BillerListRsp) obj;
                        Intrinsics.checkNotNullParameter(response, "response");
                        if (response.isSuccess()) {
                            billerSearchViewModel.f34380f.k(response);
                        } else {
                            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        GetMenuBySceneRsp it = (GetMenuBySceneRsp) obj;
                        Intrinsics.checkNotNullParameter(it, "it");
                        billerSearchViewModel.f34379e.k(it);
                        break;
                }
                return Unit.f38893a;
            }
        }, new C1624v(16));
        final BillerSearchViewModel billerSearchViewModel2 = (BillerSearchViewModel) l();
        billerSearchViewModel2.getClass();
        final int i10 = 0;
        f.t(billerSearchViewModel2, new p055de.b(1, null), new Function1() { // from class: de.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        BillerListRsp response = (BillerListRsp) obj;
                        Intrinsics.checkNotNullParameter(response, "response");
                        if (response.isSuccess()) {
                            billerSearchViewModel2.f34380f.k(response);
                        } else {
                            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        GetMenuBySceneRsp it = (GetMenuBySceneRsp) obj;
                        Intrinsics.checkNotNullParameter(it, "it");
                        billerSearchViewModel2.f34379e.k(it);
                        break;
                }
                return Unit.f38893a;
            }
        }, new C1624v(15));
    }

    public final void q(boolean z3) {
        ModelEmptyView modelEmptyView;
        ModelEmptyView modelEmptyView2;
        TextView textView;
        RecyclerView recyclerView;
        ModelEmptyView modelEmptyView3;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        TextView textView2;
        RecyclerView recyclerView4;
        B b7 = (B) this.f27334c;
        if (b7 != null && (recyclerView4 = b7.f7983f) != null) {
            h.s(recyclerView4, z3);
        }
        B b10 = (B) this.f27334c;
        if (b10 != null && (textView2 = b10.f7987o) != null) {
            h.s(textView2, z3);
        }
        B b11 = (B) this.f27334c;
        if (b11 != null && (recyclerView3 = b11.f7982e) != null) {
            h.s(recyclerView3, !z3);
        }
        B b12 = (B) this.f27334c;
        if (b12 != null && (recyclerView2 = b12.f7981d) != null) {
            h.s(recyclerView2, !z3);
        }
        if (!z3) {
            B b13 = (B) this.f27334c;
            if (b13 == null || (modelEmptyView = b13.f7979b) == null) {
                return;
            }
            h.s(modelEmptyView, false);
            return;
        }
        b bVarA = b.a();
        bVarA.getClass();
        User user = BaseApplication.get().getUser();
        BillerSearchRecordDao billerSearchRecordDao = (BillerSearchRecordDao) bVarA.f8871b;
        List<Ud.a> listQuerySearchRecord = user != null ? billerSearchRecordDao.querySearchRecord(user.getMemberId()) : billerSearchRecordDao.querySearchRecord(null);
        if (!listQuerySearchRecord.isEmpty()) {
            B b14 = (B) this.f27334c;
            if (b14 != null && (modelEmptyView2 = b14.f7979b) != null) {
                h.s(modelEmptyView2, false);
            }
            a aVar = this.f34176f;
            if (aVar != null) {
                aVar.setList(listQuerySearchRecord);
                return;
            }
            return;
        }
        B b15 = (B) this.f27334c;
        if (b15 != null && (modelEmptyView3 = b15.f7979b) != null) {
            h.s(modelEmptyView3, true);
        }
        B b16 = (B) this.f27334c;
        if (b16 != null && (recyclerView = b16.f7983f) != null) {
            h.s(recyclerView, false);
        }
        B b17 = (B) this.f27334c;
        if (b17 == null || (textView = b17.f7987o) == null) {
            return;
        }
        h.s(textView, false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        int i7 = 2;
        final int i10 = 0;
        super.setupView();
        final int i11 = 1;
        initStatusBar(true);
        BarUtils.setStatusBarLightMode((Activity) this, true);
        B b7 = (B) this.f27334c;
        if (b7 != null) {
            b7.f7982e.setLayoutManager(new GridLayoutManager(this, 2));
        }
        z zVar = new z(this);
        this.f34174d = zVar;
        B b10 = (B) this.f27334c;
        if (b10 != null) {
            b10.f7982e.setAdapter(zVar);
        }
        B b11 = (B) this.f27334c;
        if (b11 != null) {
            ((EditText) b11.f7986j.f813d).setFilters(new InputFilter[]{new Tb.c(40, 0), new Tb.b()});
        }
        B b12 = (B) this.f27334c;
        if (b12 != null) {
            b12.f7982e.addItemDecoration(new C0741o());
        }
        z zVar2 = this.f34174d;
        if (zVar2 != null) {
            zVar2.f4986c = new C0738l(this, i10);
        }
        B b13 = (B) this.f27334c;
        if (b13 != null) {
            b13.f7981d.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        l lVar = new l(this, true);
        this.f34178i = lVar;
        B b14 = (B) this.f27334c;
        if (b14 != null) {
            b14.f7981d.setAdapter(lVar);
        }
        l lVar2 = this.f34178i;
        if (lVar2 != null) {
            lVar2.f4986c = new C0738l(this, i11);
        }
        B b15 = (B) this.f27334c;
        List list = null;
        LinearLayout linearLayout = b15 != null ? (LinearLayout) b15.f7985i.f748b : null;
        Intrinsics.e(linearLayout);
        p055de.h hVar = new p055de.h(linearLayout);
        B b16 = (B) this.f27334c;
        if (b16 != null) {
            ((EditText) b16.f7986j.f813d).addTextChangedListener(new C0742p(i10, this, hVar));
        }
        B b17 = (B) this.f27334c;
        if (b17 != null) {
            ((ImageView) b17.f7986j.f812c).setOnClickListener(new View.OnClickListener(this) { // from class: Wd.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillerSearchActivity f10770b;

                {
                    this.f10770b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Bc.p pVar;
                    EditText editText;
                    BillerSearchActivity billerSearchActivity = this.f10770b;
                    switch (i10) {
                        case 0:
                            int i12 = BillerSearchActivity.f34173p;
                            Rd.B b18 = (Rd.B) billerSearchActivity.f27334c;
                            if (b18 != null && (pVar = b18.f7986j) != null && (editText = (EditText) pVar.f813d) != null) {
                                editText.setText("");
                                break;
                            }
                            break;
                        default:
                            int i13 = BillerSearchActivity.f34173p;
                            billerSearchActivity.finish();
                            break;
                    }
                }
            });
        }
        B b18 = (B) this.f27334c;
        if (b18 != null) {
            b18.f7980c.setOnClickListener(new View.OnClickListener(this) { // from class: Wd.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillerSearchActivity f10770b;

                {
                    this.f10770b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Bc.p pVar;
                    EditText editText;
                    BillerSearchActivity billerSearchActivity = this.f10770b;
                    switch (i11) {
                        case 0:
                            int i12 = BillerSearchActivity.f34173p;
                            Rd.B b19 = (Rd.B) billerSearchActivity.f27334c;
                            if (b19 != null && (pVar = b19.f7986j) != null && (editText = (EditText) pVar.f813d) != null) {
                                editText.setText("");
                                break;
                            }
                            break;
                        default:
                            int i13 = BillerSearchActivity.f34173p;
                            billerSearchActivity.finish();
                            break;
                    }
                }
            });
        }
        this.f34176f = new a(d.qt_layout_search_history_item, list, i7);
        B b19 = (B) this.f27334c;
        if (b19 != null) {
            b19.f7983f.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        B b20 = (B) this.f27334c;
        if (b20 != null) {
            b20.f7983f.setAdapter(this.f34176f);
        }
        a aVar = this.f34176f;
        if (aVar != null) {
            aVar.setOnItemClickListener(new C0738l(this, i7));
        }
        q(true);
        B b21 = (B) this.f27334c;
        if (b21 != null) {
            ((EditText) b21.f7986j.f813d).requestFocus();
        }
    }
}
