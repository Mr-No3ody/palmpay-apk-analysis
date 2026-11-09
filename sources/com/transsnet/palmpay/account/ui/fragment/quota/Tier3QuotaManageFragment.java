package com.transsnet.palmpay.account.ui.fragment.quota;

import Bc.D;
import F8.d;
import F8.e;
import F8.h;
import Pa.r0;
import X8.b;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.rsp.QueryT3QuotaRsp;
import com.transsnet.palmpay.core.base.BaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/quota/Tier3QuotaManageFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Tier3QuotaManageFragment extends BaseFragment implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public D f26242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public QueryT3QuotaRsp f26243j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f26244o;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        D d2 = this.f26242i;
        if (d2 != null) {
            ((PpButton) d2.f625p).setOnClickListener(new b(this, 1));
        }
        D d10 = this.f26242i;
        if (d10 == null) {
            return 0;
        }
        d10.f619e.setOnClickListener(new b(this, 2));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_t3_quota_manage, viewGroup, false);
        int i7 = d.btnNext;
        PpButton ppButton = (PpButton) a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = d.checkAgreement;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) a.m(i7, viewInflate);
            if (appCompatCheckBox != null) {
                i7 = d.groupAgreement;
                Group group = (Group) a.m(i7, viewInflate);
                if (group != null) {
                    i7 = d.ivDot1;
                    ImageView imageView = (ImageView) a.m(i7, viewInflate);
                    if (imageView != null) {
                        i7 = d.ivDot2;
                        ImageView imageView2 = (ImageView) a.m(i7, viewInflate);
                        if (imageView2 != null) {
                            i7 = d.seekBarAmount;
                            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) a.m(i7, viewInflate);
                            if (appCompatSeekBar != null) {
                                i7 = d.titleBar;
                                PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                                if (ppTitleBar != null) {
                                    i7 = d.tvAgreement;
                                    TextView textView = (TextView) a.m(i7, viewInflate);
                                    if (textView != null) {
                                        i7 = d.tvAmount;
                                        TextView textView2 = (TextView) a.m(i7, viewInflate);
                                        if (textView2 != null) {
                                            i7 = d.tvMsg;
                                            TextView textView3 = (TextView) a.m(i7, viewInflate);
                                            if (textView3 != null) {
                                                i7 = d.tvMsg2;
                                                TextView textView4 = (TextView) a.m(i7, viewInflate);
                                                if (textView4 != null) {
                                                    i7 = d.tvMsg3;
                                                    TextView textView5 = (TextView) a.m(i7, viewInflate);
                                                    if (textView5 != null) {
                                                        i7 = d.tvTitle;
                                                        TextView textView6 = (TextView) a.m(i7, viewInflate);
                                                        if (textView6 != null) {
                                                            D d2 = new D((ConstraintLayout) viewInflate, ppButton, appCompatCheckBox, group, imageView, imageView2, appCompatSeekBar, ppTitleBar, textView, textView2, textView3, textView4, textView5, textView6);
                                                            this.f26242i = d2;
                                                            return d2;
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
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        D d2 = this.f26242i;
        if (d2 != null) {
            ((PpTitleBar) d2.f627w).setBackButtonClickListener(new b(this, 0));
        }
        D d10 = this.f26242i;
        r0.R1(d10 != null ? d10.f620f : null, "fonts/PalmPayNum-Bold.ttf");
        D d11 = this.f26242i;
        if (d11 != null) {
            d11.f620f.setText(r0.F(0L));
        }
        D d12 = this.f26242i;
        if (d12 != null) {
            d12.f619e.setText(Html.fromHtml(getString(h.ac_msg_agree_t3_quota_agreement), 0));
        }
        D d13 = this.f26242i;
        if (d13 != null) {
            p220oa.h.s(d13.f622i, true);
        }
        return 0;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z3) {
        D d2;
        if (z3 && (d2 = this.f26242i) != null) {
            ((PpButton) d2.f625p).setEnabled(true);
        }
        D d10 = this.f26242i;
        if (d10 != null) {
            TextView textView = d10.f620f;
            QueryT3QuotaRsp queryT3QuotaRsp = this.f26243j;
            textView.setText(r0.F(queryT3QuotaRsp != null ? queryT3QuotaRsp.getTransactionLimit(i7) : 0L));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        QueryT3QuotaRsp queryT3QuotaRsp = this.f26243j;
        if (queryT3QuotaRsp != null) {
            u(queryT3QuotaRsp);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int progress = seekBar != null ? seekBar.getProgress() : 0;
        D d2 = this.f26242i;
        if (d2 != null) {
            TextView textView = d2.f620f;
            QueryT3QuotaRsp queryT3QuotaRsp = this.f26243j;
            textView.setText(r0.F(queryT3QuotaRsp != null ? queryT3QuotaRsp.getTransactionLimit(progress) : 0L));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        D d2;
        PpButton ppButton;
        long jT = t();
        this.f26244o = jT;
        QueryT3QuotaRsp queryT3QuotaRsp = this.f26243j;
        if ((queryT3QuotaRsp != null ? queryT3QuotaRsp.recommendTransactionLimit : 0L) != jT || (d2 = this.f26242i) == null || (ppButton = (PpButton) d2.f625p) == null) {
            return;
        }
        ppButton.setEnabled(false);
    }

    public final long t() {
        AppCompatSeekBar appCompatSeekBar;
        QueryT3QuotaRsp queryT3QuotaRsp = this.f26243j;
        if (queryT3QuotaRsp == null) {
            return 0L;
        }
        D d2 = this.f26242i;
        return queryT3QuotaRsp.getTransactionLimit((d2 == null || (appCompatSeekBar = (AppCompatSeekBar) d2.f626v) == null) ? 0 : appCompatSeekBar.getProgress());
    }

    public final void u(QueryT3QuotaRsp queryT3QuotaRsp) {
        D d2;
        D d10;
        this.f26243j = queryT3QuotaRsp;
        if (queryT3QuotaRsp != null) {
            D d11 = this.f26242i;
            if (d11 != null) {
                ((AppCompatSeekBar) d11.f626v).setOnSeekBarChangeListener(null);
            }
            long j6 = this.f26244o;
            if (j6 <= 0) {
                j6 = queryT3QuotaRsp.recommendTransactionLimit;
            }
            int progress = queryT3QuotaRsp.getProgress(j6);
            D d12 = this.f26242i;
            if (d12 != null) {
                ((AppCompatSeekBar) d12.f626v).setMax(queryT3QuotaRsp.getMaxProgress());
            }
            D d13 = this.f26242i;
            if (d13 != null) {
                ((AppCompatSeekBar) d13.f626v).setProgress(progress);
            }
            D d14 = this.f26242i;
            if (d14 != null) {
                TextView textView = d14.f622i;
                String string = getString(h.ac_msg_update_t3_quota, r0.F(queryT3QuotaRsp.maxTransactionLimit));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Spanned spannedFromHtml = Html.fromHtml(string, 0);
                Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(...)");
                textView.setText(spannedFromHtml);
            }
            D d15 = this.f26242i;
            if (d15 != null) {
                p220oa.h.s(d15.f622i, true);
            }
            D d16 = this.f26242i;
            if (d16 != null) {
                p220oa.h.s((ImageView) d16.f616b, true);
            }
            D d17 = this.f26242i;
            if (d17 != null) {
                p220oa.h.s((ImageView) d17.f617c, true);
            }
            D d18 = this.f26242i;
            if (d18 != null) {
                p220oa.h.s(d18.f623j, true);
            }
            D d19 = this.f26242i;
            if (d19 != null) {
                p220oa.h.s((Group) d19.f618d, !queryT3QuotaRsp.defaultLimit);
            }
            D d20 = this.f26242i;
            if (d20 != null) {
                TextView textView2 = d20.f620f;
                QueryT3QuotaRsp queryT3QuotaRsp2 = this.f26243j;
                textView2.setText(r0.F(queryT3QuotaRsp2 != null ? queryT3QuotaRsp2.getTransactionLimit(progress) : 0L));
            }
            long j10 = this.f26244o;
            if (j10 > 0 && (d10 = this.f26242i) != null) {
                PpButton ppButton = (PpButton) d10.f625p;
                QueryT3QuotaRsp queryT3QuotaRsp3 = this.f26243j;
                ppButton.setEnabled((queryT3QuotaRsp3 != null ? queryT3QuotaRsp3.recommendTransactionLimit : 0L) != j10);
            }
            if (queryT3QuotaRsp.defaultLimit && (d2 = this.f26242i) != null) {
                ((PpButton) d2.f625p).setEnabled(true);
            }
            D d21 = this.f26242i;
            if (d21 != null) {
                ((AppCompatSeekBar) d21.f626v).setOnSeekBarChangeListener(this);
            }
        }
    }
}
