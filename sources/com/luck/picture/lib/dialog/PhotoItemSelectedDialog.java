package com.luck.picture.lib.dialog;

import N8.q0;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Z;
import com.luck.picture.lib.R;
import com.luck.picture.lib.interfaces.OnItemClickListener;
import com.luck.picture.lib.utils.DensityUtil;

/* JADX INFO: loaded from: classes3.dex */
public class PhotoItemSelectedDialog extends DialogFragment implements View.OnClickListener {
    public static final int IMAGE_CAMERA = 0;
    public static final int VIDEO_CAMERA = 1;
    private boolean isCancel = true;
    private OnDismissListener onDismissListener;
    private OnItemClickListener onItemClickListener;

    public interface OnDismissListener {
        void onDismiss(boolean z3, DialogInterface dialogInterface);
    }

    private void initDialogStyle() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(DensityUtil.getRealScreenWidth(getContext()), -2);
        window.setGravity(80);
        window.setWindowAnimations(R.style.PictureThemeDialogFragmentAnim);
    }

    public static PhotoItemSelectedDialog newInstance() {
        return new PhotoItemSelectedDialog();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        OnItemClickListener onItemClickListener = this.onItemClickListener;
        if (onItemClickListener != null) {
            if (id2 == R.id.ps_tv_photo) {
                onItemClickListener.onItemClick(view, 0);
                this.isCancel = false;
            } else if (id2 == R.id.ps_tv_video) {
                onItemClickListener.onItemClick(view, 1);
                this.isCancel = false;
            }
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (getDialog() != null) {
            getDialog().requestWindowFeature(1);
            if (getDialog().getWindow() != null) {
                getDialog().getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        return layoutInflater.inflate(R.layout.ps_dialog_camera_selected, viewGroup);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this.isCancel, dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        initDialogStyle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.ps_tv_photo);
        TextView textView2 = (TextView) view.findViewById(R.id.ps_tv_video);
        TextView textView3 = (TextView) view.findViewById(R.id.ps_tv_cancel);
        textView2.setOnClickListener(this);
        textView.setOnClickListener(this);
        textView3.setOnClickListener(this);
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(Z z3, String str) {
        C1161a c1161aE = q0.e(z3, z3);
        c1161aE.d(0, this, str, 1);
        c1161aE.h(true);
    }
}
