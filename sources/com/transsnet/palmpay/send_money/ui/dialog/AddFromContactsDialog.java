package com.transsnet.palmpay.send_money.ui.dialog;

import Ab.i;
import Ad.C0059f;
import Ad.C0060g;
import Ad.C0061h;
import Ad.C0064k;
import M1.j;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.send_money.bean.AddFromContactListResp;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p159kd.h;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003'-EB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\nJ\u001b\u0010\u001d\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u00002\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010 \u001a\u00020\u00002\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00103¨\u0006F"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/AddFromContactsDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "isToBank", "<init>", "(Landroid/content/Context;Z)V", "", "clearSelect", "()V", "", "searchText", "queryRecipients", "(Ljava/lang/String;)V", "", "Lcom/transsnet/palmpay/send_money/bean/AddFromContactListResp;", "getTotalList", "()Ljava/util/List;", "list", "setList", "(Ljava/util/List;)V", "title", FirebaseAnalytics.Param.CONTENT, "Landroid/view/View;", "getEmptyView", "(Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;", "initViews", "", "setTabTextList", "(Ljava/util/List;)Lcom/transsnet/palmpay/send_money/ui/dialog/AddFromContactsDialog;", "setRecentData", "setPhoneContactData", "Lcom/transsnet/palmpay/send_money/ui/dialog/AddFromContactsDialog$OnAddFromContactsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnAddFromContactsListener", "(Lcom/transsnet/palmpay/send_money/ui/dialog/AddFromContactsDialog$OnAddFromContactsListener;)Lcom/transsnet/palmpay/send_money/ui/dialog/AddFromContactsDialog;", "Z", "Lcom/transsnet/palmpay/send_money/ui/dialog/AddFromContactsDialog$OnAddFromContactsListener;", "LAd/g;", "recentAdapter$delegate", "Lkotlin/Lazy;", "getRecentAdapter", "()LAd/g;", "recentAdapter", "LAd/f;", "phoneContactAdapter$delegate", "getPhoneContactAdapter", "()LAd/f;", "phoneContactAdapter", "recentRecipients", "Ljava/util/List;", "phoneContactRecipients", "Lkotlinx/coroutines/Job;", "mLikeQueryJob", "Lkotlinx/coroutines/Job;", "", "tabCurrentPosition", "I", "selectRecent", "Lcom/transsnet/palmpay/send_money/bean/AddFromContactListResp;", "selectPhoneContact", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "Landroid/widget/TextView;", "btnAddNow", "Landroid/widget/TextView;", "tabLayoutText", "OnAddFromContactsListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddFromContactsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddFromContactsDialog.kt\ncom/transsnet/palmpay/send_money/ui/dialog/AddFromContactsDialog\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,369:1\n55#2,12:370\n84#2,3:382\n1869#3,2:385\n1869#3,2:387\n1869#3,2:389\n1869#3,2:392\n1869#3,2:394\n1869#3,2:396\n1869#3,2:398\n1#4:391\n*S KotlinDebug\n*F\n+ 1 AddFromContactsDialog.kt\ncom/transsnet/palmpay/send_money/ui/dialog/AddFromContactsDialog\n*L\n87#1:370,12\n87#1:382,3\n143#1:385,2\n179#1:387,2\n182#1:389,2\n255#1:392,2\n271#1:394,2\n101#1:396,2\n121#1:398,2\n*E\n"})
public final class AddFromContactsDialog extends b {

    @Nullable
    private TextView btnAddNow;
    private final boolean isToBank;

    @Nullable
    private OnAddFromContactsListener listener;

    @Nullable
    private Job mLikeQueryJob;

    /* JADX INFO: renamed from: phoneContactAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy phoneContactAdapter;

    @NotNull
    private List<AddFromContactListResp> phoneContactRecipients;

    /* JADX INFO: renamed from: recentAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recentAdapter;

    @NotNull
    private List<AddFromContactListResp> recentRecipients;

    @Nullable
    private AddFromContactListResp selectPhoneContact;

    @Nullable
    private AddFromContactListResp selectRecent;
    private int tabCurrentPosition;

    @Nullable
    private TabLayout tabLayout;

    @NotNull
    private List<String> tabLayoutText;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/AddFromContactsDialog$OnAddFromContactsListener;", "", "onSelected", "", "selectRecipient", "Lcom/transsnet/palmpay/send_money/bean/AddFromContactListResp;", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnAddFromContactsListener {
        void onSelected(@Nullable AddFromContactListResp selectRecipient);
    }

    public /* synthetic */ AddFromContactsDialog(Context context, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? false : z3);
    }

    private final void clearSelect() {
        this.selectRecent = null;
        this.selectPhoneContact = null;
        Iterator<T> it = getRecentAdapter().getData().iterator();
        while (it.hasNext()) {
            ((AddFromContactListResp) it.next()).setSelect(false);
        }
        Iterator<T> it2 = getPhoneContactAdapter().getData().iterator();
        while (it2.hasNext()) {
            ((AddFromContactListResp) it2.next()).setSelect(false);
        }
    }

    private final View getEmptyView(String title, String content) {
        int i7 = r.cv_empty_no_palmpay_contacts;
        View viewInflate = getLayoutInflater().inflate(f.sm_layout_to_palmpay_empty_view_68, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(e.iv_empty_icon);
        TextView textView = (TextView) viewInflate.findViewById(e.tv_empty_title);
        TextView textView2 = (TextView) viewInflate.findViewById(e.tv_empty_tip);
        imageView.setImageResource(i7);
        textView.setText(title);
        textView2.setText(content);
        return viewInflate;
    }

    private final C0059f getPhoneContactAdapter() {
        return (C0059f) this.phoneContactAdapter.getValue();
    }

    private final C0060g getRecentAdapter() {
        return (C0060g) this.recentAdapter.getValue();
    }

    private final List<AddFromContactListResp> getTotalList() {
        return this.tabCurrentPosition == 1 ? this.phoneContactRecipients : this.recentRecipients;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(AddFromContactsDialog addFromContactsDialog, View view) {
        OnAddFromContactsListener onAddFromContactsListener;
        int i7 = addFromContactsDialog.tabCurrentPosition;
        if (i7 == 0) {
            OnAddFromContactsListener onAddFromContactsListener2 = addFromContactsDialog.listener;
            if (onAddFromContactsListener2 != null) {
                onAddFromContactsListener2.onSelected(addFromContactsDialog.selectRecent);
            }
        } else if (i7 == 1 && (onAddFromContactsListener = addFromContactsDialog.listener) != null) {
            onAddFromContactsListener.onSelected(addFromContactsDialog.selectPhoneContact);
        }
        addFromContactsDialog.clearSelect();
        addFromContactsDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$6(AddFromContactsDialog addFromContactsDialog, j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Iterator<T> it = addFromContactsDialog.getRecentAdapter().getData().iterator();
        while (it.hasNext()) {
            ((AddFromContactListResp) it.next()).setSelect(false);
        }
        ((AddFromContactListResp) addFromContactsDialog.getRecentAdapter().getItem(i7)).setSelect(true);
        addFromContactsDialog.getRecentAdapter().notifyItemRangeChanged(0, addFromContactsDialog.getRecentAdapter().getItemCount());
        addFromContactsDialog.selectRecent = (AddFromContactListResp) addFromContactsDialog.getRecentAdapter().getItem(i7);
        TextView textView = addFromContactsDialog.btnAddNow;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$8(AddFromContactsDialog addFromContactsDialog, j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Iterator<T> it = addFromContactsDialog.getPhoneContactAdapter().getData().iterator();
        while (it.hasNext()) {
            ((AddFromContactListResp) it.next()).setSelect(false);
        }
        ((AddFromContactListResp) addFromContactsDialog.getPhoneContactAdapter().getItem(i7)).setSelect(true);
        addFromContactsDialog.getPhoneContactAdapter().notifyItemRangeChanged(0, addFromContactsDialog.getPhoneContactAdapter().getItemCount());
        addFromContactsDialog.selectPhoneContact = (AddFromContactListResp) addFromContactsDialog.getPhoneContactAdapter().getItem(i7);
        TextView textView = addFromContactsDialog.btnAddNow;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0059f phoneContactAdapter_delegate$lambda$1(AddFromContactsDialog addFromContactsDialog) {
        return new C0059f(addFromContactsDialog.isToBank);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryRecipients(String searchText) {
        List<AddFromContactListResp> totalList = getTotalList();
        if (totalList.isEmpty()) {
            return;
        }
        if (TextUtils.isEmpty(searchText)) {
            setList(totalList);
            return;
        }
        Job job = this.mLikeQueryJob;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        p042cg.f fVar = I.f10809a;
        this.mLikeQueryJob = AbstractC0780y.m(AbstractC0777v.a(p042cg.e.f19009c), null, null, new C0064k(totalList, searchText, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0060g recentAdapter_delegate$lambda$0(AddFromContactsDialog addFromContactsDialog) {
        return new C0060g(addFromContactsDialog.isToBank);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setList(List<AddFromContactListResp> list) {
        if (this.tabCurrentPosition == 1) {
            getPhoneContactAdapter().setList(list);
        } else {
            getRecentAdapter().setList(list);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        this.tabLayout = (TabLayout) findViewById(e.tabLayout);
        this.btnAddNow = (TextView) findViewById(e.btnAddNow);
        CompatStateEditText compatStateEditText = (CompatStateEditText) findViewById(e.etSearch);
        RecyclerView recyclerView = (RecyclerView) findViewById(e.rvPhoneContacts);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(e.rvRecent);
        IconicsImageView iconicsImageView = (IconicsImageView) findViewById(e.iivClose);
        if (iconicsImageView != null) {
            final int i7 = 0;
            iconicsImageView.setOnClickListener(new View.OnClickListener(this) { // from class: Ad.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AddFromContactsDialog f201b;

                {
                    this.f201b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f201b.dismiss();
                            break;
                        default:
                            AddFromContactsDialog.initViews$lambda$3(this.f201b, view);
                            break;
                    }
                }
            });
        }
        TextView textView = this.btnAddNow;
        if (textView != null) {
            final int i10 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: Ad.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AddFromContactsDialog f201b;

                {
                    this.f201b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f201b.dismiss();
                            break;
                        default:
                            AddFromContactsDialog.initViews$lambda$3(this.f201b, view);
                            break;
                    }
                }
            });
        }
        Intrinsics.e(compatStateEditText);
        compatStateEditText.addTextChangedListener(new i(this, 1));
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView2.setAdapter(getRecentAdapter());
        C0060g recentAdapter = getRecentAdapter();
        String string = getContext().getString(h.sm_no_beneficiaries_yet);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        recentAdapter.setEmptyView(getEmptyView(string, "Beneficiaries will be added automatically \nif the transfer is successful"));
        final int i11 = 0;
        getRecentAdapter().setOnItemClickListener(new OnItemClickListener(this) { // from class: Ad.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddFromContactsDialog f205b;

            {
                this.f205b = this;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(M1.j jVar, View view, int i12) {
                switch (i11) {
                    case 0:
                        AddFromContactsDialog.initViews$lambda$6(this.f205b, jVar, view, i12);
                        break;
                    default:
                        AddFromContactsDialog.initViews$lambda$8(this.f205b, jVar, view, i12);
                        break;
                }
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(getPhoneContactAdapter());
        getPhoneContactAdapter().setEmptyView(getEmptyView("No Phone Contact yet", "Beneficiaries will be added automatically \nif the transfer is successful"));
        final int i12 = 1;
        getPhoneContactAdapter().setOnItemClickListener(new OnItemClickListener(this) { // from class: Ad.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddFromContactsDialog f205b;

            {
                this.f205b = this;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(M1.j jVar, View view, int i13) {
                switch (i12) {
                    case 0:
                        AddFromContactsDialog.initViews$lambda$6(this.f205b, jVar, view, i13);
                        break;
                    default:
                        AddFromContactsDialog.initViews$lambda$8(this.f205b, jVar, view, i13);
                        break;
                }
            }
        });
        if (this.tabCurrentPosition == 0) {
            TextView textView2 = this.btnAddNow;
            if (textView2 != null) {
                textView2.setEnabled(this.selectRecent != null);
            }
        } else {
            TextView textView3 = this.btnAddNow;
            if (textView3 != null) {
                textView3.setEnabled(this.selectPhoneContact != null);
            }
        }
        TabLayout tabLayout = this.tabLayout;
        if (tabLayout != null) {
            if (!this.phoneContactRecipients.isEmpty()) {
                p220oa.h.C(tabLayout);
            }
            Iterator<T> it = this.tabLayoutText.iterator();
            while (it.hasNext()) {
                tabLayout.addTab(tabLayout.newTab().setText((String) it.next()));
            }
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C0061h(this, recyclerView2, recyclerView));
        }
        showAtBottom(getWindow());
    }

    @NotNull
    public final AddFromContactsDialog setOnAddFromContactsListener(@Nullable OnAddFromContactsListener listener) {
        this.listener = listener;
        return this;
    }

    @NotNull
    public final AddFromContactsDialog setPhoneContactData(@Nullable List<AddFromContactListResp> list) {
        if (list != null) {
            List<AddFromContactListResp> list2 = list;
            List<AddFromContactListResp> list3 = !list2.isEmpty() ? list : null;
            if (list3 != null) {
                this.phoneContactRecipients = list;
                for (AddFromContactListResp addFromContactListResp : list3) {
                    if (addFromContactListResp.getIsSelect()) {
                        this.selectPhoneContact = addFromContactListResp;
                        break;
                    }
                }
                getPhoneContactAdapter().setList(list2);
            }
        }
        return this;
    }

    @NotNull
    public final AddFromContactsDialog setRecentData(@Nullable List<AddFromContactListResp> list) {
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                this.recentRecipients = list;
                for (AddFromContactListResp addFromContactListResp : list) {
                    if (addFromContactListResp.getIsSelect()) {
                        this.selectRecent = addFromContactListResp;
                        break;
                    }
                }
                getRecentAdapter().setList(list);
            }
        }
        return this;
    }

    @NotNull
    public final AddFromContactsDialog setTabTextList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            return this;
        }
        this.tabLayoutText = list;
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFromContactsDialog(@NotNull Context context, boolean z3) {
        super(context, f.sm_dialog_add_from_contacts, w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isToBank = z3;
        final int i7 = 0;
        this.recentAdapter = C2131j.b(new Function0(this) { // from class: Ad.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddFromContactsDialog f210b;

            {
                this.f210b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return AddFromContactsDialog.recentAdapter_delegate$lambda$0(this.f210b);
                    default:
                        return AddFromContactsDialog.phoneContactAdapter_delegate$lambda$1(this.f210b);
                }
            }
        });
        final int i10 = 1;
        this.phoneContactAdapter = C2131j.b(new Function0(this) { // from class: Ad.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddFromContactsDialog f210b;

            {
                this.f210b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return AddFromContactsDialog.recentAdapter_delegate$lambda$0(this.f210b);
                    default:
                        return AddFromContactsDialog.phoneContactAdapter_delegate$lambda$1(this.f210b);
                }
            }
        });
        this.recentRecipients = new ArrayList();
        this.phoneContactRecipients = new ArrayList();
        this.tabLayoutText = C1850q.i("Recent", "Phone Contacts");
    }
}
