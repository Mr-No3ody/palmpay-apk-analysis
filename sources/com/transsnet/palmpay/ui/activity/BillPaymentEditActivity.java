package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import Ac.h;
import Bc.C0107d;
import M1.j;
import O6.d;
import Pa.C0525w;
import T8.o;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.gson.reflect.TypeToken;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.bean.rsp.GetMenuBillPaymentGroup;
import com.transsnet.palmpay.core.bean.rsp.LifeBillHomeGroupBean;
import com.transsnet.palmpay.core.bean.rsp.LifeBillHomeItemBean;
import com.transsnet.palmpay.managemoney.ui.view.c;
import com.transsnet.palmpay.ui.activity.BillPaymentEditActivity;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.viewmodule.BillPaymentEditViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import p010a9.m;
import p025ba.k;
import p102ge.C1737j;
import p102ge.C1738k;
import p102ge.C1739l;
import p102ge.ViewOnClickListenerC1735h;
import p328ve.g;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/BillPaymentEditActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/BillPaymentEditViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillPaymentEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillPaymentEditActivity.kt\ncom/transsnet/palmpay/ui/activity/BillPaymentEditActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,277:1\n1869#2,2:278\n1788#2,4:280\n360#2,7:284\n1869#2,2:302\n260#3,10:291\n296#3:301\n*S KotlinDebug\n*F\n+ 1 BillPaymentEditActivity.kt\ncom/transsnet/palmpay/ui/activity/BillPaymentEditActivity\n*L\n74#1:278,2\n164#1:280,4\n198#1:284,7\n242#1:302,2\n218#1:291,10\n218#1:301\n*E\n"})
public final class BillPaymentEditActivity extends BaseMvvmActivity<BillPaymentEditViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f34439j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34440c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f34441d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f34442e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f34443f = C2131j.b(new c(10));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f34444g = C2131j.b(new c(11));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0107d f34445i;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Intent intent = getIntent();
        ArrayList arrayList = this.f34442e;
        ArrayList arrayList2 = this.f34441d;
        if (intent != null) {
            ArrayList<GetMenuBillPaymentGroup> arrayList3 = (ArrayList) C0525w.f().e(getIntent().getStringExtra("key_json_menu_item_list"), new TypeToken<ArrayList<GetMenuBillPaymentGroup>>() { // from class: com.transsnet.palmpay.ui.activity.BillPaymentEditActivity$initData$menuListType$1
            }.getType());
            if (arrayList3 != null) {
                for (GetMenuBillPaymentGroup getMenuBillPaymentGroup : arrayList3) {
                    if ("Liked".equals(getMenuBillPaymentGroup.categoryName)) {
                        arrayList.addAll(getMenuBillPaymentGroup.funMenus);
                    } else {
                        String str = getMenuBillPaymentGroup.categoryName;
                        if (str != null) {
                            arrayList2.add(new LifeBillHomeGroupBean(str, false, 2, null));
                            arrayList2.addAll(getMenuBillPaymentGroup.funMenus);
                        }
                    }
                }
            }
            n().setList(arrayList);
            m().setList(arrayList2);
        }
        C0107d c0107d = this.f34445i;
        if (c0107d != null) {
            ((RecyclerView) c0107d.f681c).setLayoutManager(new GridLayoutManager(this, 4));
        }
        C0107d c0107d2 = this.f34445i;
        if (c0107d2 != null) {
            ((RecyclerView) c0107d2.f681c).setAdapter(n());
        }
        C0107d c0107d3 = this.f34445i;
        if (c0107d3 != null) {
            ((RecyclerView) c0107d3.f681c).addItemDecoration(new C1737j());
        }
        n().setList(arrayList);
        final int i7 = 0;
        n().setOnItemClickListener(new OnItemClickListener(this) { // from class: ge.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentEditActivity f37220b;

            {
                this.f37220b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x0071  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(j jVar, View view, int i10) {
                int i11;
                boolean z3;
                BillPaymentEditActivity billPaymentEditActivity = this.f37220b;
                switch (i7) {
                    case 0:
                        int i12 = BillPaymentEditActivity.f34439j;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        HomePageMenuData homePageMenuData = (HomePageMenuData) billPaymentEditActivity.n().getItem(i10);
                        if (homePageMenuData.editEnable) {
                            ArrayList arrayList4 = billPaymentEditActivity.f34441d;
                            Iterator it = arrayList4.iterator();
                            int i13 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    SectionEntity sectionEntity = (SectionEntity) it.next();
                                    if (sectionEntity.getIsHeader() && (sectionEntity instanceof LifeBillHomeGroupBean)) {
                                        LifeBillHomeGroupBean lifeBillHomeGroupBean = (LifeBillHomeGroupBean) sectionEntity;
                                        if (lifeBillHomeGroupBean.getTitle() == null || !y.h(lifeBillHomeGroupBean.getTitle(), homePageMenuData.billCategoryName, false)) {
                                        }
                                    }
                                    i13++;
                                } else {
                                    i13 = -1;
                                }
                            }
                            if (i13 >= 0) {
                                arrayList4.add(i13 + 1, new LifeBillHomeItemBean(homePageMenuData));
                            } else {
                                arrayList4.add(0, new LifeBillHomeGroupBean(homePageMenuData.billCategoryName, false, 2, null));
                                arrayList4.add(1, new LifeBillHomeItemBean(homePageMenuData));
                            }
                            ArrayList arrayList5 = billPaymentEditActivity.f34442e;
                            arrayList5.remove(i10);
                            billPaymentEditActivity.n().setList(arrayList5);
                            billPaymentEditActivity.m().setList(arrayList4);
                            return;
                        }
                        return;
                    default:
                        int i14 = BillPaymentEditActivity.f34439j;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        SectionEntity sectionEntity2 = (SectionEntity) billPaymentEditActivity.m().getItem(i10);
                        if (sectionEntity2.getIsHeader() || !(sectionEntity2 instanceof HomePageMenuData)) {
                            return;
                        }
                        HomePageMenuData homePageMenuData2 = (HomePageMenuData) sectionEntity2;
                        ArrayList arrayList6 = billPaymentEditActivity.f34442e;
                        int size = arrayList6.size();
                        int i15 = billPaymentEditActivity.f34440c;
                        if (size >= i15) {
                            ToastUtils.showLong(h.main_favourites_max_size_tips);
                            return;
                        }
                        arrayList6.add(homePageMenuData2);
                        ArrayList<SectionEntity> arrayList7 = billPaymentEditActivity.f34441d;
                        if (arrayList7 == null || !arrayList7.isEmpty()) {
                            i11 = 0;
                            for (SectionEntity sectionEntity3 : arrayList7) {
                                if (sectionEntity3 instanceof LifeBillHomeItemBean) {
                                    String str2 = homePageMenuData2.billCategoryName;
                                    if (str2 != null ? str2.equalsIgnoreCase(((LifeBillHomeItemBean) sectionEntity3).billCategoryName) : false) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                } else {
                                    z3 = false;
                                }
                                if (z3 && (i11 = i11 + 1) < 0) {
                                    C1850q.j();
                                    throw null;
                                }
                            }
                        } else {
                            i11 = 0;
                        }
                        if (i11 <= 1) {
                            v.r(arrayList7, new m(homePageMenuData2, 27));
                        } else {
                            Intrinsics.e(arrayList7.remove(i10));
                        }
                        billPaymentEditActivity.n().setList(arrayList6);
                        billPaymentEditActivity.m().f43183b = arrayList6.size() < i15;
                        billPaymentEditActivity.m().setList(arrayList7);
                        return;
                }
            }
        });
        C0107d c0107d4 = this.f34445i;
        if (c0107d4 != null) {
            RecyclerView recyclerView = (RecyclerView) c0107d4.f682d;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
            gridLayoutManager.setSpanSizeLookup(new C1738k(this));
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C0107d c0107d5 = this.f34445i;
        if (c0107d5 != null) {
            ((RecyclerView) c0107d5.f682d).setAdapter(m());
        }
        m().setList(arrayList2);
        C0107d c0107d6 = this.f34445i;
        if (c0107d6 != null) {
            ((RecyclerView) c0107d6.f682d).addItemDecoration(new C1739l());
        }
        final int i10 = 1;
        m().setOnItemClickListener(new OnItemClickListener(this) { // from class: ge.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentEditActivity f37220b;

            {
                this.f37220b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x0071  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(j jVar, View view, int i11) {
                int i12;
                boolean z3;
                BillPaymentEditActivity billPaymentEditActivity = this.f37220b;
                switch (i10) {
                    case 0:
                        int i13 = BillPaymentEditActivity.f34439j;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        HomePageMenuData homePageMenuData = (HomePageMenuData) billPaymentEditActivity.n().getItem(i11);
                        if (homePageMenuData.editEnable) {
                            ArrayList arrayList4 = billPaymentEditActivity.f34441d;
                            Iterator it = arrayList4.iterator();
                            int i14 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    SectionEntity sectionEntity = (SectionEntity) it.next();
                                    if (sectionEntity.getIsHeader() && (sectionEntity instanceof LifeBillHomeGroupBean)) {
                                        LifeBillHomeGroupBean lifeBillHomeGroupBean = (LifeBillHomeGroupBean) sectionEntity;
                                        if (lifeBillHomeGroupBean.getTitle() == null || !y.h(lifeBillHomeGroupBean.getTitle(), homePageMenuData.billCategoryName, false)) {
                                        }
                                    }
                                    i14++;
                                } else {
                                    i14 = -1;
                                }
                            }
                            if (i14 >= 0) {
                                arrayList4.add(i14 + 1, new LifeBillHomeItemBean(homePageMenuData));
                            } else {
                                arrayList4.add(0, new LifeBillHomeGroupBean(homePageMenuData.billCategoryName, false, 2, null));
                                arrayList4.add(1, new LifeBillHomeItemBean(homePageMenuData));
                            }
                            ArrayList arrayList5 = billPaymentEditActivity.f34442e;
                            arrayList5.remove(i11);
                            billPaymentEditActivity.n().setList(arrayList5);
                            billPaymentEditActivity.m().setList(arrayList4);
                            return;
                        }
                        return;
                    default:
                        int i15 = BillPaymentEditActivity.f34439j;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        SectionEntity sectionEntity2 = (SectionEntity) billPaymentEditActivity.m().getItem(i11);
                        if (sectionEntity2.getIsHeader() || !(sectionEntity2 instanceof HomePageMenuData)) {
                            return;
                        }
                        HomePageMenuData homePageMenuData2 = (HomePageMenuData) sectionEntity2;
                        ArrayList arrayList6 = billPaymentEditActivity.f34442e;
                        int size = arrayList6.size();
                        int i16 = billPaymentEditActivity.f34440c;
                        if (size >= i16) {
                            ToastUtils.showLong(h.main_favourites_max_size_tips);
                            return;
                        }
                        arrayList6.add(homePageMenuData2);
                        ArrayList<SectionEntity> arrayList7 = billPaymentEditActivity.f34441d;
                        if (arrayList7 == null || !arrayList7.isEmpty()) {
                            i12 = 0;
                            for (SectionEntity sectionEntity3 : arrayList7) {
                                if (sectionEntity3 instanceof LifeBillHomeItemBean) {
                                    String str2 = homePageMenuData2.billCategoryName;
                                    if (str2 != null ? str2.equalsIgnoreCase(((LifeBillHomeItemBean) sectionEntity3).billCategoryName) : false) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                } else {
                                    z3 = false;
                                }
                                if (z3 && (i12 = i12 + 1) < 0) {
                                    C1850q.j();
                                    throw null;
                                }
                            }
                        } else {
                            i12 = 0;
                        }
                        if (i12 <= 1) {
                            v.r(arrayList7, new m(homePageMenuData2, 27));
                        } else {
                            Intrinsics.e(arrayList7.remove(i11));
                        }
                        billPaymentEditActivity.n().setList(arrayList6);
                        billPaymentEditActivity.m().f43183b = arrayList6.size() < i16;
                        billPaymentEditActivity.m().setList(arrayList7);
                        return;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_bill_payment_edit, (ViewGroup) null, false);
        int i7 = e.lifeMenu;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
        if (recyclerView != null) {
            i7 = e.ry_life_home_menu;
            RecyclerView recyclerView2 = (RecyclerView) p059e1.a.m(i7, viewInflate);
            if (recyclerView2 != null) {
                i7 = e.titleBar;
                PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                if (ppTitleBar != null) {
                    C0107d c0107d = new C0107d((LinearLayout) viewInflate, recyclerView, recyclerView2, ppTitleBar, 0);
                    this.f34445i = c0107d;
                    return c0107d;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final p328ve.f m() {
        return (p328ve.f) this.f34444g.getValue();
    }

    public final g n() {
        return (g) this.f34443f.getValue();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i7 != 4 || event.getRepeatCount() != 0) {
            return super.onKeyDown(i7, event);
        }
        O6.c cVar = new O6.c(this);
        cVar.e(k.core_close_page_tip);
        cVar.f6605k = true;
        cVar.f6598d = getString(h.main_leave_bill_payment_edit_tips);
        String string = getString(k.core_leave);
        ViewOnClickListenerC1735h viewOnClickListenerC1735h = new ViewOnClickListenerC1735h(this, 1);
        cVar.f6601g = string;
        cVar.f6603i = viewOnClickListenerC1735h;
        cVar.f6600f = getString(k.core_continue);
        cVar.f6602h = null;
        d dVarA = cVar.a();
        Intrinsics.checkNotNullExpressionValue(dVarA, "create(...)");
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.setCancelable(false);
        dVarA.show();
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((BillPaymentEditViewModel) l()).f35360e;
        if (lVar != null) {
            lVar.e(this, new T8.f(new o(26, this, this), (char) 0, 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(-1);
        C0107d c0107d = this.f34445i;
        if (c0107d != null) {
            ((PpTitleBar) c0107d.f683e).setRightText(getString(k.core_save));
        }
        C0107d c0107d2 = this.f34445i;
        if (c0107d2 != null) {
            ((PpTitleBar) c0107d2.f683e).setRightTextViewClickListener(new ViewOnClickListenerC1735h(this, 0));
        }
    }
}
