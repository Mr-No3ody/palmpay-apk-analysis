package com.transsnet.palmpay.account.ui.fragment.guardian;

import Bc.B;
import Ed.U;
import F8.h;
import Fd.G;
import L8.a;
import N8.C0457a;
import Pa.F;
import R8.d;
import T8.p;
import T8.r;
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
import com.transsnet.palmpay.account.ui.activity.GuardianApproveActivity;
import com.transsnet.palmpay.account.ui.viewmodel.AddGuardianViewModel;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.photograph.PhotoViewerActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p015ag.o;
import p038ca.e;
import p042cg.f;
import p097g9.C1703a;
import p097g9.C1705c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/guardian/GuardianApproveBirthCertificateFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/guardian/BaseAddGuardianFragment;", "Landroid/view/View$OnClickListener;", "Lcom/transsnet/palmpay/core/manager/FileUploadManager$UploadListener;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuardianApproveBirthCertificateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuardianApproveBirthCertificateFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/GuardianApproveBirthCertificateFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,304:1\n115#2,8:305\n145#2:313\n171#2,12:314\n215#2:326\n*S KotlinDebug\n*F\n+ 1 GuardianApproveBirthCertificateFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/GuardianApproveBirthCertificateFragment\n*L\n123#1:305,8\n123#1:313\n132#1:314,12\n132#1:326\n*E\n"})
public final class GuardianApproveBirthCertificateFragment extends BaseAddGuardianFragment implements View.OnClickListener, FileUploadManager.UploadListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public B f26147p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Uri f26148v;

    public final void A() {
        Intent intentC = F.c(getContext(), ARouter.getInstance().build("/account/setUserPhoto").withBoolean("photoBig", true).withBoolean("origin_photo", true).withBoolean("crop_photo", false).withBoolean("private_photo", true).withBoolean("extra_use_night_mode", true));
        E activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
        e f28604i = ((BaseActivity) activity).getF28604i();
        Intrinsics.e(intentC);
        f28604i.f(intentC, new C0457a(this, 23));
    }

    public final void B(File file, String str) {
        String path = file.getPath();
        Uri uri = this.f26148v;
        if (Intrinsics.c(path, uri != null ? uri.getPath() : null)) {
            this.t = str;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            AbstractC0780y.m(lifecycleCoroutineScopeImplF, o.f11960a, null, new r(this, null), 2);
        }
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        if (this.f26141j) {
            return false;
        }
        a.d(getContext(), getString(h.ac_guardian_extra_exit_title), null, null, getString(h.ac_guardian_extra_exit_message), Integer.valueOf(h.ac_continue), null, null, Integer.valueOf(h.ac_quit), new d(this, 11), null, 6860);
        return true;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        super.k();
        GuardianApproveActivity guardianApproveActivityW = w();
        if (guardianApproveActivityW != null) {
            guardianApproveActivityW.n();
        }
        B b7 = this.f26147p;
        y(b7 != null ? (PpTitleBar) b7.f588A : null);
        B b10 = this.f26147p;
        if (b10 != null) {
            ((TextView) b10.t).setOnClickListener(this);
        }
        B b11 = this.f26147p;
        if (b11 != null) {
            ((PpButton) b11.f597i).setOnClickListener(this);
        }
        B b12 = this.f26147p;
        if (b12 != null) {
            ((ImageView) b12.f592c).setOnClickListener(this);
        }
        B b13 = this.f26147p;
        if (b13 != null) {
            ((IconicsImageView) b13.f598j).setOnClickListener(this);
        }
        B b14 = this.f26147p;
        if (b14 != null) {
            ((PpButton) b14.f599o).setOnClickListener(this);
        }
        B b15 = this.f26147p;
        if (b15 != null) {
            ((IconicsTextView) b15.f589B).setOnClickListener(this);
        }
        B b16 = this.f26147p;
        if (b16 != null) {
            ((ImageView) b16.f600p).setOnClickListener(this);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(F8.e.ac_fragment_guardian_approve_birth_certificate, viewGroup, false);
        int i7 = F8.d.bottomBarrier;
        if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = F8.d.bottomViewStub;
            ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
            if (viewStub != null) {
                i7 = F8.d.btnContinue;
                PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                if (ppButton != null) {
                    i7 = F8.d.btnEdit;
                    PpButton ppButton2 = (PpButton) p059e1.a.m(i7, viewInflate);
                    if (ppButton2 != null) {
                        i7 = F8.d.groupUpload;
                        Group group = (Group) p059e1.a.m(i7, viewInflate);
                        if (group != null) {
                            i7 = F8.d.imageContainer;
                            ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                            if (constraintLayout != null) {
                                i7 = F8.d.ivContact;
                                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                if (iconicsImageView != null) {
                                    i7 = F8.d.ivFrame;
                                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                    if (imageView != null) {
                                        i7 = F8.d.ivImage;
                                        ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                                        if (imageView2 != null) {
                                            i7 = F8.d.titleBar;
                                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                            if (ppTitleBar != null) {
                                                i7 = F8.d.tvMessage;
                                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView != null) {
                                                    i7 = F8.d.tvNote;
                                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView2 != null) {
                                                        i7 = F8.d.tvNote2;
                                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                        if (textView3 != null) {
                                                            i7 = F8.d.tvSample;
                                                            IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                                            if (iconicsTextView != null) {
                                                                i7 = F8.d.tvTitle;
                                                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                if (textView4 != null) {
                                                                    B b7 = new B((ConstraintLayout) viewInflate, viewStub, ppButton, ppButton2, group, constraintLayout, iconicsImageView, imageView, imageView2, ppTitleBar, textView, textView2, textView3, iconicsTextView, textView4);
                                                                    this.f26147p = b7;
                                                                    return b7;
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
        AddGuardianViewModel addGuardianViewModel;
        if (w() != null && (addGuardianViewModel = (AddGuardianViewModel) this.f27333i) != null) {
            p140j8.f.s(addGuardianViewModel, new C1705c(null, null), addGuardianViewModel.f26410i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        AddGuardianViewModel addGuardianViewModel2 = (AddGuardianViewModel) this.f27333i;
        l lVar = addGuardianViewModel2 != null ? addGuardianViewModel2.f26410i : null;
        if (lVar != null) {
            lVar.e(this, new G(new U(this), 15));
        }
        AddGuardianViewModel addGuardianViewModel3 = (AddGuardianViewModel) this.f27333i;
        l lVar2 = addGuardianViewModel3 != null ? addGuardianViewModel3.f26411j : null;
        if (lVar2 != null) {
            lVar2.e(this, new G(new T8.o(1, this, this), 15));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Uri uri;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = F8.d.tvNote;
        if (numValueOf == null || numValueOf.intValue() != i7) {
            int i10 = F8.d.ivContact;
            if (numValueOf == null || numValueOf.intValue() != i10) {
                int i11 = F8.d.ivFrame;
                if (numValueOf == null || numValueOf.intValue() != i11) {
                    int i12 = F8.d.btnContinue;
                    if (numValueOf != null && numValueOf.intValue() == i12) {
                        if (this.f26148v == null) {
                            A();
                            return;
                        }
                        if (!TextUtils.isEmpty(this.t)) {
                            z();
                            return;
                        }
                        showLoadingDialog(true);
                        Uri uri2 = this.f26148v;
                        Intrinsics.e(uri2);
                        String path = uri2.getPath();
                        if (path == null) {
                            return;
                        }
                        FileUploadManager.getInstance().uploadFile(new File(path), true, this);
                        return;
                    }
                    int i13 = F8.d.btnEdit;
                    if (numValueOf != null && numValueOf.intValue() == i13) {
                        A();
                        return;
                    }
                    int i14 = F8.d.ivImage;
                    if (numValueOf == null || numValueOf.intValue() != i14 || (uri = this.f26148v) == null) {
                        return;
                    }
                    Intent intent = new Intent(getContext(), (Class<?>) PhotoViewerActivity.class);
                    intent.setData(uri);
                    ActivityUtils.startActivity(intent);
                    return;
                }
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
            AbstractC0780y.m(lifecycleCoroutineScopeImplF, o.f11960a, null, new p(this, null), 2);
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

    @Override // com.transsnet.palmpay.core.base.BaseFragment, com.transsnet.palmpay.core.base.IBaseView
    public final void showLoadingDialog(boolean z3) {
        PpButton ppButton;
        super.showLoadingDialog(z3);
        B b7 = this.f26147p;
        if (b7 == null || (ppButton = (PpButton) b7.f597i) == null) {
            return;
        }
        ppButton.b(z3);
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment
    public final ViewStub t() {
        B b7 = this.f26147p;
        if (b7 != null) {
            return (ViewStub) b7.f596g;
        }
        return null;
    }

    public final void z() {
        SubmitGuardianReq submitGuardianReq = new SubmitGuardianReq();
        submitGuardianReq.guardianPhone = C0.G.A();
        submitGuardianReq.addUrl(1, this.t);
        AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) this.f27333i;
        if (addGuardianViewModel != null) {
            p140j8.f.s(addGuardianViewModel, new C1703a(submitGuardianReq, null), addGuardianViewModel.f26411j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }
}
