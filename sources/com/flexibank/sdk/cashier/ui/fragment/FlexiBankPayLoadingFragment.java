package com.flexibank.sdk.cashier.ui.fragment;

import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.base.FlexiBankBaseFragment;
import com.flexibank.sdk.base.FlexiBankBaseViewModel;
import com.flexibank.sdk.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/FlexiBankPayLoadingFragment;", "Lcom/flexibank/sdk/base/FlexiBankBaseFragment;", "Lcom/flexibank/sdk/base/FlexiBankBaseViewModel;", "Landroidx/viewbinding/ViewBinding;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankPayLoadingFragment extends FlexiBankBaseFragment<FlexiBankBaseViewModel, ViewBinding> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f21997o = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FlexiBankPayLoadingFragment newInstance() {
            return new FlexiBankPayLoadingFragment();
        }

        private a() {
        }
    }

    public FlexiBankPayLoadingFragment() {
        super(null);
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int f() {
        return q.fb_pay_loading_fragment;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int j() {
        return 0;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final void k() {
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int l() {
        return 0;
    }
}
