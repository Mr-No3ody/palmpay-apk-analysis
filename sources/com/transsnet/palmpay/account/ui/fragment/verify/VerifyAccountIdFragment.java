package com.transsnet.palmpay.account.ui.fragment.verify;

import Bc.C0105b;
import F8.d;
import F8.e;
import F8.h;
import L6.b;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.req.CheckSecurityVerifyMethodReq;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.account.ui.fragment.verify.VerifyAccountIdFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.PhoneUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/verify/VerifyAccountIdFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/verify/BaseVerifyAccountFragment;", "Landroid/text/TextWatcher;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyAccountIdFragment extends BaseVerifyAccountFragment implements TextWatcher {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0105b f26311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f26312p = 3;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        PpFormVertical ppFormVertical;
        PpButton ppButton;
        C0105b c0105b = this.f26311o;
        if (c0105b != null && (ppButton = (PpButton) c0105b.f667g) != null) {
            PpFormVertical ppFormVertical2 = (PpFormVertical) c0105b.f665e;
            ppButton.setEnabled(!TextUtils.isEmpty(ppFormVertical2 != null ? ppFormVertical2.getEditContent() : null));
        }
        C0105b c0105b2 = this.f26311o;
        if (c0105b2 == null || (ppFormVertical = (PpFormVertical) c0105b2.f665e) == null) {
            return;
        }
        ppFormVertical.setBottomText(null);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_verify_account_id, viewGroup, false);
        int i7 = d.inputIdNo;
        PpFormVertical ppFormVertical = (PpFormVertical) a.m(i7, viewInflate);
        if (ppFormVertical != null) {
            i7 = d.titleBar;
            PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
            if (ppTitleBar != null) {
                i7 = d.tvForgotBvn;
                TextView textView = (TextView) a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = d.tvNext;
                    PpButton ppButton = (PpButton) a.m(i7, viewInflate);
                    if (ppButton != null) {
                        i7 = d.tvTitle;
                        TextView textView2 = (TextView) a.m(i7, viewInflate);
                        if (textView2 != null) {
                            C0105b c0105b = new C0105b((LinearLayout) viewInflate, ppFormVertical, ppTitleBar, textView, ppButton, textView2);
                            this.f26311o = c0105b;
                            return c0105b;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        AppCompatEditText editText;
        super.o();
        Bundle arguments = getArguments();
        this.f26312p = arguments != null ? arguments.getInt("extra_type") : 3;
        C0105b c0105b = this.f26311o;
        if (c0105b != null && (editText = ((PpFormVertical) c0105b.f665e).getEditText()) != null) {
            editText.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, getContext()));
        }
        int i7 = this.f26312p;
        if (i7 == 3) {
            C0105b c0105b2 = this.f26311o;
            if (c0105b2 != null) {
                ((TextView) c0105b2.f664d).setText("To confirm this is your account, kindly fill in your BVN Code");
            }
            C0105b c0105b3 = this.f26311o;
            if (c0105b3 != null) {
                ((PpFormVertical) c0105b3.f665e).setTitle("Verify BVN");
            }
            C0105b c0105b4 = this.f26311o;
            if (c0105b4 != null) {
                ((PpFormVertical) c0105b4.f665e).setHintText(getString(h.ac_msg_bvn_code_hint));
            }
            C0105b c0105b5 = this.f26311o;
            if (c0105b5 != null) {
                ((TextView) c0105b5.f663c).setText(h.ac_dial_get_bvn);
            }
        } else if (i7 == 7) {
            C0105b c0105b6 = this.f26311o;
            if (c0105b6 != null) {
                ((TextView) c0105b6.f664d).setText("To confirm this is your account, kindly fill in your NIN Number");
            }
            C0105b c0105b7 = this.f26311o;
            if (c0105b7 != null) {
                ((PpFormVertical) c0105b7.f665e).setTitle("Verify NIN");
            }
            C0105b c0105b8 = this.f26311o;
            if (c0105b8 != null) {
                ((PpFormVertical) c0105b8.f665e).setHintText(getString(h.ac_msg_nin_code_hint));
            }
            C0105b c0105b9 = this.f26311o;
            if (c0105b9 != null) {
                ((TextView) c0105b9.f663c).setText(h.ac_dial_get_nin);
            }
        }
        C0105b c0105b10 = this.f26311o;
        if (c0105b10 != null) {
            final int i10 = 0;
            ((TextView) c0105b10.f663c).setOnClickListener(new View.OnClickListener(this) { // from class: c9.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VerifyAccountIdFragment f18878b;

                {
                    this.f18878b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PpFormVertical ppFormVertical;
                    PpFormVertical ppFormVertical2;
                    PpFormVertical ppFormVertical3;
                    PpFormVertical ppFormVertical4;
                    PpFormVertical ppFormVertical5;
                    switch (i10) {
                        case 0:
                            int i11 = this.f18878b.f26312p;
                            if (i11 == 3) {
                                PhoneUtils.dial("*565*0" + Uri.encode("#"));
                            } else if (i11 == 7) {
                                PhoneUtils.dial("*346" + Uri.encode("#"));
                            }
                            break;
                        default:
                            VerifyAccountIdFragment verifyAccountIdFragment = this.f18878b;
                            C0105b c0105b11 = verifyAccountIdFragment.f26311o;
                            String editContent = null;
                            String editContent2 = (c0105b11 == null || (ppFormVertical5 = (PpFormVertical) c0105b11.f665e) == null) ? null : ppFormVertical5.getEditContent();
                            if ((editContent2 != null ? editContent2.length() : 0) >= 11) {
                                CheckSecurityVerifyMethodReq checkSecurityVerifyMethodReq = new CheckSecurityVerifyMethodReq();
                                checkSecurityVerifyMethodReq.flowId = verifyAccountIdFragment.f26306j;
                                checkSecurityVerifyMethodReq.verifyMethod = verifyAccountIdFragment.f26312p;
                                HashMap<String, Object> verifyParams = new HashMap<>();
                                checkSecurityVerifyMethodReq.verifyParams = verifyParams;
                                int i12 = checkSecurityVerifyMethodReq.verifyMethod;
                                if (i12 == 3) {
                                    Intrinsics.checkNotNullExpressionValue(verifyParams, "verifyParams");
                                    C0105b c0105b12 = verifyAccountIdFragment.f26311o;
                                    if (c0105b12 != null && (ppFormVertical2 = (PpFormVertical) c0105b12.f665e) != null) {
                                        editContent = ppFormVertical2.getEditContent();
                                    }
                                    verifyParams.put("bvn", editContent);
                                } else if (i12 == 7) {
                                    Intrinsics.checkNotNullExpressionValue(verifyParams, "verifyParams");
                                    C0105b c0105b13 = verifyAccountIdFragment.f26311o;
                                    if (c0105b13 != null && (ppFormVertical = (PpFormVertical) c0105b13.f665e) != null) {
                                        editContent = ppFormVertical.getEditContent();
                                    }
                                    verifyParams.put("nin", editContent);
                                }
                                VerifyAccountActivity verifyAccountActivityW = verifyAccountIdFragment.w();
                                if (verifyAccountActivityW != null) {
                                    verifyAccountActivityW.p(checkSecurityVerifyMethodReq);
                                }
                                break;
                            } else if (verifyAccountIdFragment.f26312p != 7) {
                                C0105b c0105b14 = verifyAccountIdFragment.f26311o;
                                if (c0105b14 != null && (ppFormVertical3 = (PpFormVertical) c0105b14.f665e) != null) {
                                    ppFormVertical3.setBottomText(verifyAccountIdFragment.getString(h.ac_msg_bvn_code_hint));
                                    break;
                                }
                            } else {
                                C0105b c0105b15 = verifyAccountIdFragment.f26311o;
                                if (c0105b15 != null && (ppFormVertical4 = (PpFormVertical) c0105b15.f665e) != null) {
                                    ppFormVertical4.setBottomText(verifyAccountIdFragment.getString(h.ac_msg_nin_code_hint));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        C0105b c0105b11 = this.f26311o;
        if (c0105b11 != null) {
            ((PpFormVertical) c0105b11.f665e).setBottomTextColor(CommonViewExtKt.colorInt(b.ppColorError, getContext()));
        }
        C0105b c0105b12 = this.f26311o;
        if (c0105b12 != null) {
            ((PpFormVertical) c0105b12.f665e).setEditTextWatcher(this);
        }
        C0105b c0105b13 = this.f26311o;
        if (c0105b13 != null) {
            final int i11 = 1;
            ((PpButton) c0105b13.f667g).setOnClickListener(new View.OnClickListener(this) { // from class: c9.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VerifyAccountIdFragment f18878b;

                {
                    this.f18878b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PpFormVertical ppFormVertical;
                    PpFormVertical ppFormVertical2;
                    PpFormVertical ppFormVertical3;
                    PpFormVertical ppFormVertical4;
                    PpFormVertical ppFormVertical5;
                    switch (i11) {
                        case 0:
                            int i12 = this.f18878b.f26312p;
                            if (i12 == 3) {
                                PhoneUtils.dial("*565*0" + Uri.encode("#"));
                            } else if (i12 == 7) {
                                PhoneUtils.dial("*346" + Uri.encode("#"));
                            }
                            break;
                        default:
                            VerifyAccountIdFragment verifyAccountIdFragment = this.f18878b;
                            C0105b c0105b14 = verifyAccountIdFragment.f26311o;
                            String editContent = null;
                            String editContent2 = (c0105b14 == null || (ppFormVertical5 = (PpFormVertical) c0105b14.f665e) == null) ? null : ppFormVertical5.getEditContent();
                            if ((editContent2 != null ? editContent2.length() : 0) >= 11) {
                                CheckSecurityVerifyMethodReq checkSecurityVerifyMethodReq = new CheckSecurityVerifyMethodReq();
                                checkSecurityVerifyMethodReq.flowId = verifyAccountIdFragment.f26306j;
                                checkSecurityVerifyMethodReq.verifyMethod = verifyAccountIdFragment.f26312p;
                                HashMap<String, Object> verifyParams = new HashMap<>();
                                checkSecurityVerifyMethodReq.verifyParams = verifyParams;
                                int i13 = checkSecurityVerifyMethodReq.verifyMethod;
                                if (i13 == 3) {
                                    Intrinsics.checkNotNullExpressionValue(verifyParams, "verifyParams");
                                    C0105b c0105b15 = verifyAccountIdFragment.f26311o;
                                    if (c0105b15 != null && (ppFormVertical2 = (PpFormVertical) c0105b15.f665e) != null) {
                                        editContent = ppFormVertical2.getEditContent();
                                    }
                                    verifyParams.put("bvn", editContent);
                                } else if (i13 == 7) {
                                    Intrinsics.checkNotNullExpressionValue(verifyParams, "verifyParams");
                                    C0105b c0105b16 = verifyAccountIdFragment.f26311o;
                                    if (c0105b16 != null && (ppFormVertical = (PpFormVertical) c0105b16.f665e) != null) {
                                        editContent = ppFormVertical.getEditContent();
                                    }
                                    verifyParams.put("nin", editContent);
                                }
                                VerifyAccountActivity verifyAccountActivityW = verifyAccountIdFragment.w();
                                if (verifyAccountActivityW != null) {
                                    verifyAccountActivityW.p(checkSecurityVerifyMethodReq);
                                }
                                break;
                            } else if (verifyAccountIdFragment.f26312p != 7) {
                                C0105b c0105b17 = verifyAccountIdFragment.f26311o;
                                if (c0105b17 != null && (ppFormVertical3 = (PpFormVertical) c0105b17.f665e) != null) {
                                    ppFormVertical3.setBottomText(verifyAccountIdFragment.getString(h.ac_msg_bvn_code_hint));
                                    break;
                                }
                            } else {
                                C0105b c0105b18 = verifyAccountIdFragment.f26311o;
                                if (c0105b18 != null && (ppFormVertical4 = (PpFormVertical) c0105b18.f665e) != null) {
                                    ppFormVertical4.setBottomText(verifyAccountIdFragment.getString(h.ac_msg_nin_code_hint));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        C0105b c0105b14 = this.f26311o;
        z(c0105b14 != null ? (PpTitleBar) c0105b14.f666f : null);
        C0105b c0105b15 = this.f26311o;
        BaseVerifyAccountFragment.u(c0105b15 != null ? (PpTitleBar) c0105b15.f666f : null);
        return 0;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
