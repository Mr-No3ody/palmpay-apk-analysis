package com.transsnet.palmpay.core.ui.activity;

import Pa.i0;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.FileUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/receipt_share_page")
public class CoreReceiptShareActivity extends BaseActivity {

    public static class ReceiptFragment extends DialogFragment {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f27590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f27591b;

        @Override // androidx.fragment.app.Fragment
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(L9.b.core_fragment_receipt_share, viewGroup, false);
            if (this.f27590a == null) {
                getActivity().finish();
                return viewInflate;
            }
            getDialog().getWindow().requestFeature(1);
            getDialog().setCanceledOnTouchOutside(false);
            final int i7 = 0;
            getDialog().setOnKeyListener(new J(this, i7));
            ((ImageView) viewInflate.findViewById(L9.a.imageViewClose)).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.K

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CoreReceiptShareActivity.ReceiptFragment f27660b;

                {
                    this.f27660b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            CoreReceiptShareActivity.ReceiptFragment receiptFragment = this.f27660b;
                            receiptFragment.dismissAllowingStateLoss();
                            if (receiptFragment.getActivity() != null) {
                                receiptFragment.getActivity().finish();
                            }
                            break;
                        default:
                            CoreReceiptShareActivity.ReceiptFragment receiptFragment2 = this.f27660b;
                            receiptFragment2.getClass();
                            com.facebook.imagepipeline.nativecode.b.F(receiptFragment2.getContext(), androidx.core.content.f.getUriForFile(BaseApplication.getContext(), i0.w(BaseApplication.getContext()), receiptFragment2.f27590a));
                            receiptFragment2.getActivity().finish();
                            break;
                    }
                }
            });
            TextView textView = (TextView) viewInflate.findViewById(L9.a.textViewShare);
            this.f27591b = textView;
            final int i10 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.K

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CoreReceiptShareActivity.ReceiptFragment f27660b;

                {
                    this.f27660b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            CoreReceiptShareActivity.ReceiptFragment receiptFragment = this.f27660b;
                            receiptFragment.dismissAllowingStateLoss();
                            if (receiptFragment.getActivity() != null) {
                                receiptFragment.getActivity().finish();
                            }
                            break;
                        default:
                            CoreReceiptShareActivity.ReceiptFragment receiptFragment2 = this.f27660b;
                            receiptFragment2.getClass();
                            com.facebook.imagepipeline.nativecode.b.F(receiptFragment2.getContext(), androidx.core.content.f.getUriForFile(BaseApplication.getContext(), i0.w(BaseApplication.getContext()), receiptFragment2.f27590a));
                            receiptFragment2.getActivity().finish();
                            break;
                    }
                }
            });
            ImageView imageView = (ImageView) viewInflate.findViewById(L9.a.imageViewPic);
            File file = this.f27590a;
            if (file != null) {
                imageView.setImageURI(Uri.fromFile(file));
            }
            return viewInflate;
        }

        @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public final void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            if (bundle != null) {
                bundle.putSerializable("extra_data", this.f27590a);
            }
        }

        @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public final void onStart() {
            super.onStart();
            Window window = getDialog().getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (ScreenUtils.getScreenWidth() * 0.916f);
            window.setAttributes(attributes);
        }

        @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public final void onViewStateRestored(Bundle bundle) {
            super.onViewStateRestored(bundle);
            if (bundle != null) {
                this.f27590a = (File) bundle.getSerializable("extra_data");
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return L9.b.core_activity_receipt_share;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        File file = (File) getIntent().getSerializableExtra("extra_data");
        if (!FileUtils.isFileExists(file)) {
            finish();
            return;
        }
        ReceiptFragment receiptFragment = new ReceiptFragment();
        receiptFragment.f27590a = file;
        showDialogFragment(receiptFragment);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.app.Activity
    public final void setRequestedOrientation(int i7) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setRequestedOrientation(-1);
        } else {
            super.setRequestedOrientation(i7);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(true);
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(com.transsnet.palmpay.custom_view.p.transparent_60)));
    }
}
