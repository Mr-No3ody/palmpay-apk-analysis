package com.transsnet.palmpay.account.ui.fragment.upgrade;

import Bc.C0108e;
import F8.h;
import Pa.F;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.rsp.QueryAddressFromBillRsp;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.account.ui.activity.PreviewPdfActivity;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepBillUploadFragment;
import com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.custom_view.image.RoundImageView;
import com.transsnet.palmpay.photograph.PhotoViewerActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import io.fastkv.n;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p024b9.b;
import p024b9.d;
import p024b9.j;
import p025ba.k;
import p038ca.e;
import p051d9.C1628z;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepBillUploadFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/z;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/PalmPayLevelUpTier3Contract$View;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUpgradeTier3StepBillUploadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeTier3StepBillUploadFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepBillUploadFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,346:1\n1#2:347\n*E\n"})
public final class UpgradeTier3StepBillUploadFragment extends BaseMVPFragment<C1628z> implements PalmPayLevelUpTier3Contract.View, IAutoTrack {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f26291j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0108e f26292o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f26293p;
    public e t;

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "t3_address_upload_page_exposure";
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract.View
    public final void handleApplicationResult(CommonBeanResult commonBeanResult) {
        d.f18795f.handleApplicationResult(getActivity(), getContext(), commonBeanResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract.View
    public final void handleQueryAddressFromBill(CommonBeanResult commonBeanResult) {
        d dVar = this.f26293p;
        if (dVar == null || commonBeanResult == null) {
            return;
        }
        if (commonBeanResult.isSuccess()) {
            dVar.b((QueryAddressFromBillRsp) commonBeanResult.data);
            return;
        }
        BaseMVPFragment baseMVPFragment = dVar.f18796a;
        if (commonBeanResult.getRichTextErrorDialog(baseMVPFragment.getContext()) == null) {
            Context context = baseMVPFragment.getContext();
            String respMsg = commonBeanResult.getRespMsg();
            if (context != null) {
                n.O(context, 0, Integer.valueOf(k.core_oops), null, null, null, null, respMsg, Integer.valueOf(k.core_confirm), null, null, null, null, null, null, false, 0, 8388221);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1 A[RETURN] */
    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU;
        String str;
        PpTitleBar titleBar;
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU2 = u();
        if (palmPayLevelUpTier3V2ActivityU2 != null && (titleBar = palmPayLevelUpTier3V2ActivityU2.getTitleBar()) != null) {
            final int i7 = 1;
            titleBar.setBackButtonClickListener(new View.OnClickListener(this) { // from class: b9.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UpgradeTier3StepBillUploadFragment f18811b;

                {
                    this.f18811b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String path;
                    d dVar;
                    switch (i7) {
                        case 0:
                            if (!r0.U0()) {
                                UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment = this.f18811b;
                                n0.g().l("t3_address_upload_submit_click");
                                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU3 = upgradeTier3StepBillUploadFragment.u();
                                String str2 = palmPayLevelUpTier3V2ActivityU3 != null ? palmPayLevelUpTier3V2ActivityU3.f25917b : null;
                                if (str2 != null && str2.length() != 0) {
                                    C1628z c1628z = (C1628z) upgradeTier3StepBillUploadFragment.f27328i;
                                    if (c1628z != null) {
                                        c1628z.queryAddressFromBill(str2);
                                    }
                                    break;
                                } else {
                                    Uri uri = upgradeTier3StepBillUploadFragment.f26291j;
                                    if (uri != null && (path = uri.getPath()) != null && (dVar = upgradeTier3StepBillUploadFragment.f26293p) != null) {
                                        dVar.c(new File(path), new j(upgradeTier3StepBillUploadFragment, 0));
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU4 = this.f18811b.u();
                            if (palmPayLevelUpTier3V2ActivityU4 != null) {
                                palmPayLevelUpTier3V2ActivityU4.onBackPressed();
                            }
                            break;
                        case 2:
                            UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment2 = this.f18811b;
                            Uri uri2 = upgradeTier3StepBillUploadFragment2.f26291j;
                            if (uri2 != null) {
                                Intent intent = new Intent(upgradeTier3StepBillUploadFragment2.getContext(), (Class<?>) PhotoViewerActivity.class);
                                intent.setData(uri2);
                                ActivityUtils.startActivity(intent);
                            }
                            break;
                        case 3:
                            this.f18811b.x();
                            break;
                        default:
                            this.f18811b.x();
                            break;
                    }
                }
            });
            titleBar.setRightText("");
        }
        C0108e c0108e = this.f26292o;
        if (c0108e != null) {
            final int i10 = 2;
            ((RoundImageView) c0108e.f688e).setOnClickListener(new View.OnClickListener(this) { // from class: b9.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UpgradeTier3StepBillUploadFragment f18811b;

                {
                    this.f18811b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String path;
                    d dVar;
                    switch (i10) {
                        case 0:
                            if (!r0.U0()) {
                                UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment = this.f18811b;
                                n0.g().l("t3_address_upload_submit_click");
                                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU3 = upgradeTier3StepBillUploadFragment.u();
                                String str2 = palmPayLevelUpTier3V2ActivityU3 != null ? palmPayLevelUpTier3V2ActivityU3.f25917b : null;
                                if (str2 != null && str2.length() != 0) {
                                    C1628z c1628z = (C1628z) upgradeTier3StepBillUploadFragment.f27328i;
                                    if (c1628z != null) {
                                        c1628z.queryAddressFromBill(str2);
                                    }
                                    break;
                                } else {
                                    Uri uri = upgradeTier3StepBillUploadFragment.f26291j;
                                    if (uri != null && (path = uri.getPath()) != null && (dVar = upgradeTier3StepBillUploadFragment.f26293p) != null) {
                                        dVar.c(new File(path), new j(upgradeTier3StepBillUploadFragment, 0));
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU4 = this.f18811b.u();
                            if (palmPayLevelUpTier3V2ActivityU4 != null) {
                                palmPayLevelUpTier3V2ActivityU4.onBackPressed();
                            }
                            break;
                        case 2:
                            UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment2 = this.f18811b;
                            Uri uri2 = upgradeTier3StepBillUploadFragment2.f26291j;
                            if (uri2 != null) {
                                Intent intent = new Intent(upgradeTier3StepBillUploadFragment2.getContext(), (Class<?>) PhotoViewerActivity.class);
                                intent.setData(uri2);
                                ActivityUtils.startActivity(intent);
                            }
                            break;
                        case 3:
                            this.f18811b.x();
                            break;
                        default:
                            this.f18811b.x();
                            break;
                    }
                }
            });
        }
        C0108e c0108e2 = this.f26292o;
        if (c0108e2 != null) {
            final int i11 = 3;
            ((IconicsTextView) c0108e2.f691i).setOnClickListener(new View.OnClickListener(this) { // from class: b9.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UpgradeTier3StepBillUploadFragment f18811b;

                {
                    this.f18811b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String path;
                    d dVar;
                    switch (i11) {
                        case 0:
                            if (!r0.U0()) {
                                UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment = this.f18811b;
                                n0.g().l("t3_address_upload_submit_click");
                                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU3 = upgradeTier3StepBillUploadFragment.u();
                                String str2 = palmPayLevelUpTier3V2ActivityU3 != null ? palmPayLevelUpTier3V2ActivityU3.f25917b : null;
                                if (str2 != null && str2.length() != 0) {
                                    C1628z c1628z = (C1628z) upgradeTier3StepBillUploadFragment.f27328i;
                                    if (c1628z != null) {
                                        c1628z.queryAddressFromBill(str2);
                                    }
                                    break;
                                } else {
                                    Uri uri = upgradeTier3StepBillUploadFragment.f26291j;
                                    if (uri != null && (path = uri.getPath()) != null && (dVar = upgradeTier3StepBillUploadFragment.f26293p) != null) {
                                        dVar.c(new File(path), new j(upgradeTier3StepBillUploadFragment, 0));
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU4 = this.f18811b.u();
                            if (palmPayLevelUpTier3V2ActivityU4 != null) {
                                palmPayLevelUpTier3V2ActivityU4.onBackPressed();
                            }
                            break;
                        case 2:
                            UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment2 = this.f18811b;
                            Uri uri2 = upgradeTier3StepBillUploadFragment2.f26291j;
                            if (uri2 != null) {
                                Intent intent = new Intent(upgradeTier3StepBillUploadFragment2.getContext(), (Class<?>) PhotoViewerActivity.class);
                                intent.setData(uri2);
                                ActivityUtils.startActivity(intent);
                            }
                            break;
                        case 3:
                            this.f18811b.x();
                            break;
                        default:
                            this.f18811b.x();
                            break;
                    }
                }
            });
        }
        C0108e c0108e3 = this.f26292o;
        if (c0108e3 != null) {
            final int i12 = 4;
            ((FrameLayout) c0108e3.f694p).setOnClickListener(new View.OnClickListener(this) { // from class: b9.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UpgradeTier3StepBillUploadFragment f18811b;

                {
                    this.f18811b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String path;
                    d dVar;
                    switch (i12) {
                        case 0:
                            if (!r0.U0()) {
                                UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment = this.f18811b;
                                n0.g().l("t3_address_upload_submit_click");
                                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU3 = upgradeTier3StepBillUploadFragment.u();
                                String str2 = palmPayLevelUpTier3V2ActivityU3 != null ? palmPayLevelUpTier3V2ActivityU3.f25917b : null;
                                if (str2 != null && str2.length() != 0) {
                                    C1628z c1628z = (C1628z) upgradeTier3StepBillUploadFragment.f27328i;
                                    if (c1628z != null) {
                                        c1628z.queryAddressFromBill(str2);
                                    }
                                    break;
                                } else {
                                    Uri uri = upgradeTier3StepBillUploadFragment.f26291j;
                                    if (uri != null && (path = uri.getPath()) != null && (dVar = upgradeTier3StepBillUploadFragment.f26293p) != null) {
                                        dVar.c(new File(path), new j(upgradeTier3StepBillUploadFragment, 0));
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU4 = this.f18811b.u();
                            if (palmPayLevelUpTier3V2ActivityU4 != null) {
                                palmPayLevelUpTier3V2ActivityU4.onBackPressed();
                            }
                            break;
                        case 2:
                            UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment2 = this.f18811b;
                            Uri uri2 = upgradeTier3StepBillUploadFragment2.f26291j;
                            if (uri2 != null) {
                                Intent intent = new Intent(upgradeTier3StepBillUploadFragment2.getContext(), (Class<?>) PhotoViewerActivity.class);
                                intent.setData(uri2);
                                ActivityUtils.startActivity(intent);
                            }
                            break;
                        case 3:
                            this.f18811b.x();
                            break;
                        default:
                            this.f18811b.x();
                            break;
                    }
                }
            });
        }
        C0108e c0108e4 = this.f26292o;
        if (c0108e4 != null) {
            ((TextView) c0108e4.f692j).setOnClickListener(new W8.d(22));
        }
        C0108e c0108e5 = this.f26292o;
        if (c0108e5 != null) {
            ((IconicsTextView) c0108e5.f691i).setText(getString(h.ac_upload_utility_bill_title));
        }
        C0108e c0108e6 = this.f26292o;
        if (c0108e6 != null) {
            ((PpButton) c0108e6.f690g).setEnabled(false);
        }
        C0108e c0108e7 = this.f26292o;
        if (c0108e7 != null) {
            final int i13 = 0;
            ((PpButton) c0108e7.f690g).setOnClickListener(new View.OnClickListener(this) { // from class: b9.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UpgradeTier3StepBillUploadFragment f18811b;

                {
                    this.f18811b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String path;
                    d dVar;
                    switch (i13) {
                        case 0:
                            if (!r0.U0()) {
                                UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment = this.f18811b;
                                n0.g().l("t3_address_upload_submit_click");
                                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU3 = upgradeTier3StepBillUploadFragment.u();
                                String str2 = palmPayLevelUpTier3V2ActivityU3 != null ? palmPayLevelUpTier3V2ActivityU3.f25917b : null;
                                if (str2 != null && str2.length() != 0) {
                                    C1628z c1628z = (C1628z) upgradeTier3StepBillUploadFragment.f27328i;
                                    if (c1628z != null) {
                                        c1628z.queryAddressFromBill(str2);
                                    }
                                    break;
                                } else {
                                    Uri uri = upgradeTier3StepBillUploadFragment.f26291j;
                                    if (uri != null && (path = uri.getPath()) != null && (dVar = upgradeTier3StepBillUploadFragment.f26293p) != null) {
                                        dVar.c(new File(path), new j(upgradeTier3StepBillUploadFragment, 0));
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU4 = this.f18811b.u();
                            if (palmPayLevelUpTier3V2ActivityU4 != null) {
                                palmPayLevelUpTier3V2ActivityU4.onBackPressed();
                            }
                            break;
                        case 2:
                            UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment2 = this.f18811b;
                            Uri uri2 = upgradeTier3StepBillUploadFragment2.f26291j;
                            if (uri2 != null) {
                                Intent intent = new Intent(upgradeTier3StepBillUploadFragment2.getContext(), (Class<?>) PhotoViewerActivity.class);
                                intent.setData(uri2);
                                ActivityUtils.startActivity(intent);
                            }
                            break;
                        case 3:
                            this.f18811b.x();
                            break;
                        default:
                            this.f18811b.x();
                            break;
                    }
                }
            });
        }
        u();
        Uri uri = this.f26291j;
        if (uri != null) {
            v(uri);
            return 0;
        }
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU3 = u();
        if (palmPayLevelUpTier3V2ActivityU3 == null || (str = palmPayLevelUpTier3V2ActivityU3.f25922g) == null) {
            palmPayLevelUpTier3V2ActivityU = u();
            if (palmPayLevelUpTier3V2ActivityU != null || (str = palmPayLevelUpTier3V2ActivityU.f25917b) == null || str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                return 0;
            }
        } else {
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                palmPayLevelUpTier3V2ActivityU = u();
                if (palmPayLevelUpTier3V2ActivityU != null) {
                    str = null;
                } else {
                    str = null;
                }
                if (str == null) {
                    return 0;
                }
            }
        }
        y();
        C0108e c0108e8 = this.f26292o;
        r0.l1(str, c0108e8 != null ? (RoundImageView) c0108e8.f688e : null);
        z();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(F8.e.ac_fragment_palmpay_level_up_tier3_step_bill_upload, viewGroup, false);
        int i7 = F8.d.bottomView;
        View viewM = a.m(i7, viewInflate);
        if (viewM != null) {
            Pb.a.bind(viewM);
            i7 = F8.d.ivDelete;
            if (((IconicsImageView) a.m(i7, viewInflate)) != null) {
                i7 = F8.d.ivImage;
                RoundImageView roundImageView = (RoundImageView) a.m(i7, viewInflate);
                if (roundImageView != null) {
                    i7 = F8.d.ivPhotoFrame;
                    ImageView imageView = (ImageView) a.m(i7, viewInflate);
                    if (imageView != null) {
                        i7 = F8.d.msgBarrier;
                        if (((Barrier) a.m(i7, viewInflate)) != null) {
                            i7 = F8.d.textNext;
                            PpButton ppButton = (PpButton) a.m(i7, viewInflate);
                            if (ppButton != null) {
                                i7 = F8.d.tvAdd;
                                IconicsTextView iconicsTextView = (IconicsTextView) a.m(i7, viewInflate);
                                if (iconicsTextView != null) {
                                    i7 = F8.d.tvBillError;
                                    TextView textView = (TextView) a.m(i7, viewInflate);
                                    if (textView != null) {
                                        i7 = F8.d.tvLine1;
                                        TextView textView2 = (TextView) a.m(i7, viewInflate);
                                        if (textView2 != null) {
                                            i7 = F8.d.tvMsg;
                                            TextView textView3 = (TextView) a.m(i7, viewInflate);
                                            if (textView3 != null) {
                                                i7 = F8.d.tvReupload;
                                                if (((IconicsTextView) a.m(i7, viewInflate)) != null) {
                                                    i7 = F8.d.tvSubtitle;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) a.m(i7, viewInflate);
                                                    if (appCompatTextView != null) {
                                                        i7 = F8.d.viewReupload;
                                                        FrameLayout frameLayout = (FrameLayout) a.m(i7, viewInflate);
                                                        if (frameLayout != null) {
                                                            C0108e c0108e = new C0108e((ConstraintLayout) viewInflate, roundImageView, imageView, ppButton, iconicsTextView, textView, textView2, textView3, appCompatTextView, frameLayout, 3);
                                                            this.f26292o = c0108e;
                                                            return c0108e;
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.t = new e(this, null, null);
        C0108e c0108e = this.f26292o;
        if (c0108e != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) c0108e.f693o;
            int i7 = h.ac_bill_receipt_address_note;
            b bVar = d.f18795f;
            PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU = u();
            appCompatTextView.setText(Html.fromHtml(getString(i7, bVar.billReceiptAddressNoteDate(palmPayLevelUpTier3V2ActivityU != null ? palmPayLevelUpTier3V2ActivityU.f25920e : null)), 0));
        }
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU2 = u();
        final int i10 = 0;
        Function0 function0 = new Function0(this) { // from class: b9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpgradeTier3StepBillUploadFragment f18809b;

            {
                this.f18809b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return (C1628z) this.f18809b.f27328i;
                    default:
                        return NavHostFragment.f17502e.findNavController(this.f18809b);
                }
            }
        };
        final int i11 = 1;
        this.f26293p = new d(this, palmPayLevelUpTier3V2ActivityU2, function0, new Function0(this) { // from class: b9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpgradeTier3StepBillUploadFragment f18809b;

            {
                this.f18809b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return (C1628z) this.f18809b.f27328i;
                    default:
                        return NavHostFragment.f17502e.findNavController(this.f18809b);
                }
            }
        }, new j(this, 1));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, com.transsnet.palmpay.core.base.IBaseView
    public final void showLoadingDialog(boolean z3) {
        PpButton ppButton;
        C0108e c0108e = this.f26292o;
        if (c0108e == null || (ppButton = (PpButton) c0108e.f690g) == null) {
            return;
        }
        ppButton.b(z3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.View
    public final void showLoadingView(boolean z3) {
        PpButton ppButton;
        C0108e c0108e = this.f26292o;
        if (c0108e == null || (ppButton = (PpButton) c0108e.f690g) == null) {
            return;
        }
        ppButton.b(z3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new C1628z();
    }

    public final PalmPayLevelUpTier3V2Activity u() {
        E e10 = this.f27319c;
        if (!(e10 instanceof PalmPayLevelUpTier3V2Activity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity");
        return (PalmPayLevelUpTier3V2Activity) e10;
    }

    public final void v(Uri uri) {
        RoundImageView roundImageView;
        C0108e c0108e = this.f26292o;
        if (c0108e != null && (roundImageView = (RoundImageView) c0108e.f688e) != null) {
            p220oa.h.C(roundImageView);
        }
        C0108e c0108e2 = this.f26292o;
        r0.g1(c0108e2 != null ? (RoundImageView) c0108e2.f688e : null, uri, null);
        y();
        z();
    }

    public final void w(String str) {
        PreviewPdfActivity.a aVar = PreviewPdfActivity.f25953C;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intent intentCreateIntent$default = PreviewPdfActivity.a.createIntent$default(aVar, contextRequireContext, str, true, false, 8, null);
        e eVar = this.t;
        if (eVar != null) {
            eVar.f(intentCreateIntent$default, new p024b9.k(this, 0));
        }
    }

    public final void x() {
        C0108e c0108e = this.f26292o;
        if (c0108e == null || !((PpButton) c0108e.f690g).a()) {
            Intent intentC = F.c(getContext(), ARouter.getInstance().build("/account/setUserPhoto").withBoolean("photoBig", true).withBoolean("origin_photo", true).withBoolean("crop_photo", false).withBoolean("private_photo", true).withString("pdf_mode", "pick_only").withBoolean("extra_use_night_mode", true));
            E activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
            e f28604i = ((BaseActivity) activity).getF28604i();
            Intrinsics.e(intentC);
            f28604i.f(intentC, new p024b9.k(this, 1));
        }
    }

    public final void y() {
        TextView textView;
        TextView textView2;
        FrameLayout frameLayout;
        ImageView imageView;
        IconicsTextView iconicsTextView;
        C0108e c0108e = this.f26292o;
        if (c0108e != null && (iconicsTextView = (IconicsTextView) c0108e.f691i) != null) {
            p220oa.h.c(iconicsTextView);
        }
        C0108e c0108e2 = this.f26292o;
        if (c0108e2 != null && (imageView = (ImageView) c0108e2.f689f) != null) {
            p220oa.h.c(imageView);
        }
        C0108e c0108e3 = this.f26292o;
        if (c0108e3 != null && (frameLayout = (FrameLayout) c0108e3.f694p) != null) {
            p220oa.h.C(frameLayout);
        }
        C0108e c0108e4 = this.f26292o;
        if (c0108e4 != null && (textView2 = c0108e4.f685b) != null) {
            p220oa.h.c(textView2);
        }
        C0108e c0108e5 = this.f26292o;
        if (c0108e5 == null || (textView = (TextView) c0108e5.f692j) == null) {
            return;
        }
        p220oa.h.s(textView, true);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0033  */
    public final void z() {
        PpButton ppButton;
        boolean z3;
        C0108e c0108e = this.f26292o;
        if (c0108e == null || (ppButton = (PpButton) c0108e.f690g) == null) {
            return;
        }
        if (this.f26291j == null) {
            PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU = u();
            String str = palmPayLevelUpTier3V2ActivityU != null ? palmPayLevelUpTier3V2ActivityU.f25917b : null;
            if (str == null || str.length() == 0) {
                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU2 = u();
                String str2 = palmPayLevelUpTier3V2ActivityU2 != null ? palmPayLevelUpTier3V2ActivityU2.f25922g : null;
                if (str2 == null || str2.length() == 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = true;
            }
        } else {
            z3 = true;
        }
        ppButton.setEnabled(z3);
    }
}
