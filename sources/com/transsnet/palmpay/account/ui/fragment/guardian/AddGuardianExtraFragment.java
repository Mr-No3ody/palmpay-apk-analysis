package com.transsnet.palmpay.account.ui.fragment.guardian;

import C9.Q;
import F8.d;
import I8.l;
import L8.a;
import N8.C0457a;
import Pa.F;
import Pa.r0;
import T8.g;
import T8.i;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.E;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.req.SubmitGuardianReq;
import com.transsnet.palmpay.account.bean.rsp.GuardianConfig;
import com.transsnet.palmpay.account.ui.activity.AddGuardianActivity;
import com.transsnet.palmpay.account.ui.viewmodel.AddGuardianViewModel;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.photograph.PhotoViewerActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p015ag.o;
import p038ca.e;
import p042cg.f;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianExtraFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/guardian/BaseAddGuardianFragment;", "Landroid/view/View$OnClickListener;", "Lcom/transsnet/palmpay/core/manager/FileUploadManager$UploadListener;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddGuardianExtraFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddGuardianExtraFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianExtraFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,280:1\n171#2,12:281\n215#2:293\n*S KotlinDebug\n*F\n+ 1 AddGuardianExtraFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianExtraFragment\n*L\n84#1:281,12\n84#1:293\n*E\n"})
public final class AddGuardianExtraFragment extends BaseAddGuardianFragment implements View.OnClickListener, FileUploadManager.UploadListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f26133p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Uri f26134v;

    public final void A() {
        Intent intentC = F.c(getContext(), ARouter.getInstance().build("/account/setUserPhoto").withBoolean("photoBig", true).withBoolean("origin_photo", true).withBoolean("crop_photo", false).withBoolean("private_photo", true).withBoolean("extra_use_night_mode", true));
        E activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
        e f28604i = ((BaseActivity) activity).getF28604i();
        Intrinsics.e(intentC);
        f28604i.f(intentC, new C0457a(this, 21));
    }

    public final void B(File file, String str) {
        String path = file.getPath();
        Uri uri = this.f26134v;
        if (path.equals(uri != null ? uri.getPath() : null)) {
            this.t = str;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            AbstractC0780y.m(lifecycleCoroutineScopeImplF, o.f11960a, null, new i(this, null), 2);
        }
    }

    public final void C() {
        PpButton ppButton;
        ConstraintLayout constraintLayout;
        Group group;
        l lVar = this.f26133p;
        if (lVar != null && (group = lVar.f4142f) != null) {
            h.c(group);
        }
        l lVar2 = this.f26133p;
        if (lVar2 != null && (constraintLayout = lVar2.f4143g) != null) {
            h.C(constraintLayout);
        }
        l lVar3 = this.f26133p;
        if (lVar3 == null || (ppButton = lVar3.f4140d) == null) {
            return;
        }
        ppButton.setEnabled(true);
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        if (this.f26141j) {
            return false;
        }
        a.d(getContext(), "Confirm Your Guardian Relationship", null, null, "Providing proof of your guardian relationship is essential when surnames differ.", Integer.valueOf(F8.h.ac_continue), null, null, Integer.valueOf(F8.h.ac_quit), new T8.e(this, 1), null, 6860);
        return true;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        SubmitGuardianReq submitGuardianReqL;
        super.k();
        l lVar = this.f26133p;
        y(lVar != null ? lVar.f4147p : null);
        l lVar2 = this.f26133p;
        if (lVar2 != null) {
            lVar2.f4149w.setOnClickListener(this);
        }
        l lVar3 = this.f26133p;
        if (lVar3 != null) {
            lVar3.f4140d.setOnClickListener(this);
        }
        l lVar4 = this.f26133p;
        if (lVar4 != null) {
            lVar4.t.setOnClickListener(this);
        }
        l lVar5 = this.f26133p;
        if (lVar5 != null) {
            lVar5.f4145j.setOnClickListener(this);
        }
        l lVar6 = this.f26133p;
        if (lVar6 != null) {
            lVar6.f4144i.setOnClickListener(this);
        }
        l lVar7 = this.f26133p;
        if (lVar7 != null) {
            lVar7.f4141e.setOnClickListener(this);
        }
        l lVar8 = this.f26133p;
        if (lVar8 != null) {
            lVar8.f4135B.setOnClickListener(this);
        }
        l lVar9 = this.f26133p;
        if (lVar9 != null) {
            lVar9.f4146o.setOnClickListener(this);
        }
        AddGuardianActivity addGuardianActivityV = v();
        if (addGuardianActivityV == null || (submitGuardianReqL = addGuardianActivityV.l()) == null) {
            return 0;
        }
        String fileUrl = submitGuardianReqL.getFileUrl(1);
        if (TextUtils.isEmpty(fileUrl)) {
            return 0;
        }
        this.t = fileUrl;
        C();
        l lVar10 = this.f26133p;
        r0.l1(fileUrl, lVar10 != null ? lVar10.f4146o : null);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(F8.e.ac_fragment_add_guardian_extra, viewGroup, false);
        int i7 = d.bottomBarrier;
        if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = d.bottomViewStub;
            ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
            if (viewStub != null) {
                i7 = d.btnContinue;
                PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                if (ppButton != null) {
                    i7 = d.btnEdit;
                    PpButton ppButton2 = (PpButton) p059e1.a.m(i7, viewInflate);
                    if (ppButton2 != null) {
                        i7 = d.groupUpload;
                        Group group = (Group) p059e1.a.m(i7, viewInflate);
                        if (group != null) {
                            i7 = d.imageContainer;
                            ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                            if (constraintLayout != null) {
                                i7 = d.ivContact;
                                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                if (iconicsImageView != null) {
                                    i7 = d.ivFrame;
                                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                    if (imageView != null) {
                                        i7 = d.ivImage;
                                        ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                                        if (imageView2 != null) {
                                            i7 = d.titleBar;
                                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                            if (ppTitleBar != null) {
                                                i7 = d.tvChange;
                                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView != null) {
                                                    i7 = d.tvMessage;
                                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView2 != null) {
                                                        i7 = d.tvNote;
                                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                        if (textView3 != null) {
                                                            i7 = d.tvNote2;
                                                            TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                            if (textView4 != null) {
                                                                i7 = d.tvSample;
                                                                IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                                                if (iconicsTextView != null) {
                                                                    i7 = d.tvTitle;
                                                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView5 != null) {
                                                                        l lVar = new l((ConstraintLayout) viewInflate, viewStub, ppButton, ppButton2, group, constraintLayout, iconicsImageView, imageView, imageView2, ppTitleBar, textView, textView2, textView3, textView4, iconicsTextView, textView5, 1);
                                                                        this.f26133p = lVar;
                                                                        return lVar;
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = addGuardianViewModel != null ? addGuardianViewModel.f26409g : null;
        if (lVar != null) {
            lVar.e(this, new T8.f(new Q(27, this, this)));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AddGuardianActivity addGuardianActivityV;
        GuardianConfig guardianConfig;
        String str;
        Uri uri;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = d.tvNote;
        if (numValueOf == null || numValueOf.intValue() != i7) {
            int i10 = d.ivContact;
            if (numValueOf == null || numValueOf.intValue() != i10) {
                int i11 = d.btnContinue;
                if (numValueOf != null && numValueOf.intValue() == i11) {
                    if (this.f26134v == null) {
                        A();
                        return;
                    }
                    if (!TextUtils.isEmpty(this.t)) {
                        z();
                        return;
                    }
                    showLoadingDialog(true);
                    Uri uri2 = this.f26134v;
                    Intrinsics.e(uri2);
                    FileUploadManager.getInstance().uploadFile(new File(uri2.getPath()), true, this);
                    return;
                }
                int i12 = d.btnEdit;
                if (numValueOf != null && numValueOf.intValue() == i12) {
                    A();
                    return;
                }
                int i13 = d.ivImage;
                if (numValueOf != null && numValueOf.intValue() == i13) {
                    Uri uri3 = this.f26134v;
                    if (uri3 != null) {
                        Intent intent = new Intent(getContext(), (Class<?>) PhotoViewerActivity.class);
                        intent.setData(uri3);
                        ActivityUtils.startActivity(intent);
                        return;
                    }
                    return;
                }
                int i14 = d.tvChange;
                if (numValueOf != null && numValueOf.intValue() == i14) {
                    E activity = getActivity();
                    if (activity != null) {
                        n.O(activity, 0, Integer.valueOf(F8.h.ac_change_guardian), null, null, null, null, "Are you sure you want to change the guardian?", Integer.valueOf(F8.h.ac_confirm), null, new T8.e(this, 0), Integer.valueOf(F8.h.ac_cancel), null, null, null, false, 0, 8385149);
                        return;
                    }
                    return;
                }
                int i15 = d.tvSample;
                if (numValueOf == null || numValueOf.intValue() != i15 || (addGuardianActivityV = v()) == null || (guardianConfig = addGuardianActivityV.f25817f) == null || (str = guardianConfig.birthCertificatePic) == null) {
                    return;
                }
                String str2 = TextUtils.isEmpty(str) ? null : str;
                if (str2 == null || (uri = Uri.parse(str2)) == null) {
                    return;
                }
                Intent intent2 = new Intent(getContext(), (Class<?>) PhotoViewerActivity.class);
                intent2.setData(uri);
                ActivityUtils.startActivity(intent2);
                return;
            }
        }
        A();
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onComplete(String str, File file) {
        if (file != null) {
            B(file, str);
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            AbstractC0780y.m(lifecycleCoroutineScopeImplF, o.f11960a, null, new g(this, null), 2);
        }
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onError(Exception exc) {
        showLoadingDialog(false);
        ToastUtils.showLong(exc != null ? exc.getMessage() : null, new Object[0]);
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onProgressChanged(long j6, long j10) {
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onStartSync(String str, File file) {
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment
    public final ViewStub t() {
        l lVar = this.f26133p;
        if (lVar != null) {
            return lVar.f4139c;
        }
        return null;
    }

    public final void z() {
        SubmitGuardianReq submitGuardianReqL;
        PpButton ppButton;
        AddGuardianActivity addGuardianActivityV = v();
        if (addGuardianActivityV == null || (submitGuardianReqL = addGuardianActivityV.l()) == null) {
            return;
        }
        submitGuardianReqL.addUrl(1, this.t);
        l lVar = this.f26133p;
        if (lVar != null && (ppButton = lVar.f4140d) != null) {
            ppButton.b(true);
        }
        AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) this.f27333i;
        if (addGuardianViewModel != null) {
            addGuardianViewModel.e(submitGuardianReqL);
        }
    }
}
